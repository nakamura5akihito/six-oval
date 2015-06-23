package io.opensec.six.oval.core.repository;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import io.opensec.six.oval.core.SixOvalContext;
import io.opensec.six.oval.core.OvalTestBase;
import io.opensec.six.oval.core.TestUtil;
import io.opensec.six.oval.model.common.ClassEnumeration;
import io.opensec.six.oval.model.definitions.DefinitionType;
import io.opensec.six.oval.model.definitions.OvalDefinitions;
import io.opensec.six.oval.repository.DefinitionQueryParams;
import io.opensec.six.oval.repository.OvalRepository;
import io.opensec.util.repository.QueryResults;
import java.io.File;
import java.util.List;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;



/**
 */
@RunWith( Enclosed.class )
public class OvalRepositoryImplTest
{

	/**
	 * Saves given OVAL Definitions document and then find it using ID.
	 * Also, every definition in the document is retrieved using its OVAL ID.
	 *
	 * @param repository
	 * @param oval_defs
	 */
    protected static void _testSaveAndFind(
            final OvalRepository repository,
            final OvalDefinitions oval_defs
            )
    {
    	String  oval_defs_id = repository.saveOvalDefinitions( oval_defs );
    	OvalDefinitions  p_oval_defs = repository.findOvalDefinitionsById( oval_defs_id );
		assertThat( p_oval_defs, is( notNullValue() ) );
		assertThat( oval_defs_id, is( p_oval_defs.getPersistentID() ) );

		for (DefinitionType  def : oval_defs.getDefinitions().getDefinition()) {
    		String  def_id = def.getOvalId();
    		DefinitionType  p_def = repository.findDefinitionById( def_id );
    		assertThat( p_def, is( notNullValue() ) );
    		assertThat( def_id, is( p_def.getOvalId() ) );
    	}
    }



    /**
     * TEST: OVAL test content / definitions / 5.10
     *
     * @see <a href="http://oval.mitre.org/repository/about/testcontent.html">OVAL Test Content</a>
     */
    @RunWith( Theories.class )
    public static class OvalTestContent510SaveAndFind
    extends OvalTestBase
    {
        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval/oval-test-content_5_10_1_3";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "linux",
            "macos",
            "solaris",
            "windows"
//            "support/var" //The files are type of OvalVariables.
        };



        public OvalTestContent510SaveAndFind()
        {
            super( SixOvalContext.repository() );
        }



        @Theory
        public void testSaveAndFind(
                        final String input_subdir_path
                        )
        throws Exception
        {
            File[]  input_xml_files = TestUtil.listXmlFiles( INPUT_ROOTDIR_PATH, input_subdir_path );
            for (File  input_xml_file : input_xml_files) {
                System.out.println( input_subdir_path + " : " + input_xml_file.getName() );
                OvalDefinitions  oval_defs = _unmarshalOvalDocument( input_xml_file, OvalDefinitions.class );
                _testSaveAndFind( _getRepository(), oval_defs );
            }
        }
    }
    //



    /**
     * TEST: Mitre OVAL Repository / definition / 5.10
     *
     * @see <a href="http://oval.mitre.org/repository/">OVAL Repository</a>
     */
    @RunWith( Theories.class )
    public static class MitreOvalDef510SaveAndFind
    extends OvalTestBase
    {
        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval/mitre-oval-def-5_10";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "unix",
            "windows"
        };



        public MitreOvalDef510SaveAndFind()
        {
            super( SixOvalContext.repository() );
        }



        @Theory
        public void testSaveAndFind(
                        final String input_subdir_path
                        )
        throws Exception
        {
            File[]  input_xml_files = TestUtil.listXmlFiles( INPUT_ROOTDIR_PATH, input_subdir_path );
            for (File  input_xml_file : input_xml_files) {
                System.out.println( input_subdir_path + " : " + input_xml_file.getName() );
                OvalDefinitions  oval_defs = _unmarshalOvalDocument( input_xml_file, OvalDefinitions.class );
                _testSaveAndFind( _getRepository(), oval_defs );
            }
        }

    }
    //



    /**
     * TEST: RedHat OVAL Repository / definition / 5.3
     *
     * @see <a href="http://oval.mitre.org/repository/">OVAL Repository</a>
     */
    @RunWith( Theories.class )
    public static class RedhatOvalDef53SaveAndFind
    extends OvalTestBase
    {
        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval/redhat-oval-def-5_3";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "unix"
        };



        public RedhatOvalDef53SaveAndFind()
        {
            super( SixOvalContext.repository() );
        }



        @Theory
        public void testSaveAndFind(
                        final String input_subdir_path
                        )
        throws Exception
        {
            File[]  input_xml_files = TestUtil.listXmlFiles( INPUT_ROOTDIR_PATH, input_subdir_path );
            for (File  input_xml_file : input_xml_files) {
                System.out.println( input_subdir_path + " : " + input_xml_file.getName() );
                OvalDefinitions  oval_defs = _unmarshalOvalDocument( input_xml_file, OvalDefinitions.class );
                _testSaveAndFind( _getRepository(), oval_defs );
            }
        }

    }
    //



    /**
     * TEST: OVAL test content / definitions / 5.10
     *
     * @see <a href="http://oval.mitre.org/repository/about/testcontent.html">OVAL Test Content</a>
     */
    @RunWith( Theories.class )
    public static class OvalTestContent510Search
    extends OvalTestBase
    {

        //Queries:
        private static DefinitionQueryParams[] _createQueryParamsList()
        {
            /* Definition IDs */
            DefinitionQueryParams  params_id_1 = new DefinitionQueryParams();
            params_id_1.setId( "oval:org.mitre.oval.test:def:707,oval:org.mitre.oval.test:def:92,oval:org.mitre.oval.test:def:455" );

            /* definition class */
            DefinitionQueryParams  params_class_1 = new DefinitionQueryParams();
            params_class_1.setDefinitionClass( ClassEnumeration.COMPLIANCE );

            /* keyword in "title" or "description" */
            DefinitionQueryParams  params_terms_1 = new DefinitionQueryParams();
            params_terms_1.setSearchTerms( "construct" );
            params_terms_1.setOrder( "-id" );
            params_terms_1.setCount( "10" );


            DefinitionQueryParams[]  quert_params_list = new DefinitionQueryParams[] {
                            params_id_1,
                            params_class_1,
                            params_terms_1
                            };

            return quert_params_list;
        }


        @DataPoints
        public static DefinitionQueryParams[]  QUERY_PARAMS_LIST = _createQueryParamsList();



        public OvalTestContent510Search()
        {
            super( SixOvalContext.repository() );
        }



        @Theory
        public void testSearchDefinition(
                        final DefinitionQueryParams params
                        )
        throws Exception
        {
            System.out.println( "Definition query: " + params );
            QueryResults<String>  results = _getRepository().findDefinitionId( params );
            List<String>  result_elements = results.getElements();

            System.out.println( "Definition results: #" + result_elements.size()
                            + ", IDs=" + result_elements );
        }

    }
    //

}
//
