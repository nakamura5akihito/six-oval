package jp.go.aist.six.oval.core.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import jp.go.aist.six.oval.core.OvalTestBase;
import jp.go.aist.six.oval.core.SixOvalContext;
import jp.go.aist.six.oval.model.common.ClassEnumeration;
import jp.go.aist.six.oval.model.definitions.DefinitionType;
import jp.go.aist.six.oval.model.definitions.OvalDefinitions;
import jp.go.aist.six.oval.repository.DefinitionQueryParams;
import jp.go.aist.six.oval.repository.OvalRepository;
import jp.go.aist.six.util.repository.QueryResults;
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
     * support function.
     */
    public static void saveOvalDefinitions(
                    final OvalRepository repository,
                    final OvalDefinitions oval_defs
                    )
    {
        repository.saveOvalDefinitions( oval_defs );
        for (DefinitionType def : oval_defs.getDefinitions().getDefinition()) {
            String  oval_id = def.getOvalId();
            DefinitionType  p_def = repository.findDefinitionById( oval_id );
            assertThat( p_def, is( notNullValue() ) );
        }
    }



    /**
     * Repository test: Mitre repository --- save & find.
     *
     * @see http://oval.mitre.org/repository/
     */
    @RunWith( Theories.class )
    public static class SaveAndFindMitreOvalRepositoryContent
    extends OvalTestBase
    {

        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval5/mitre";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "aix",
            "esx",
            "linux",
            "macos",
            "solaris",
//            "unix"
            "windows"
        };



        public SaveAndFindMitreOvalRepositoryContent()
        {
            super( SixOvalContext.repository() );
        }



        @Theory
        public void testSaveDefinition(
                        final String input_subdir_path
                        )
        throws Exception
        {
            File[]  input_xml_files = _listXmlFiles( INPUT_ROOTDIR_PATH, input_subdir_path );
            for (File  input_xml_file : input_xml_files) {
                System.out.println( "OVAL Document: filepath=" + input_xml_file );
                /* (1) unmarshal */
                Object  obj = _getXmlMapper().unmarshal( new FileInputStream( input_xml_file ) );
                if (OvalDefinitions.class.isInstance( obj )) {
                    OvalDefinitions  oval_defs = OvalDefinitions.class.cast( obj );
                    saveOvalDefinitions( _getRepository(), oval_defs );
//                    _getRepository().saveOvalDefinitions( oval_defs );
                }

            }
        }

    }
    //



    /**
     * Repository test: OVAL test content --- save & find.
     *
     * @see http://oval.mitre.org/repository/about/testcontent.html
     */
    @RunWith( Theories.class )
    public static class SaveAndFindOvalTestContent
    extends OvalTestBase
    {

        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval5/ovaltc-5.10.1.3";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "definitions",
            "independent",
            "linux",
            "macos",
            "solaris",
            "unix",
            "windows"
        };



        public SaveAndFindOvalTestContent()
        {
            super( SixOvalContext.repository() );
        }



        @Theory
        public void testSaveDefinition(
                        final String input_subdir_path
                        )
        throws Exception
        {
            File[]  input_xml_files = _listXmlFiles( INPUT_ROOTDIR_PATH, input_subdir_path );
            for (File  input_xml_file : input_xml_files) {
                System.out.println( "OVAL Document: filepath=" + input_xml_file );
                /* (1) unmarshal */
                Object  obj = _getXmlMapper().unmarshal( new FileInputStream( input_xml_file ) );
                if (OvalDefinitions.class.isInstance( obj )) {
                    OvalDefinitions  oval_defs = OvalDefinitions.class.cast( obj );
                    saveOvalDefinitions( _getRepository(), oval_defs );
//                  _getRepository().saveOvalDefinitions( oval_defs );
                }

            }
        }

    }
    //




    /**
     * Repository test: OVAL test content --- search.
     *
     * @see http://oval.mitre.org/repository/about/testcontent.html
     */
    @RunWith( Theories.class )
    public static class SearchOvalTestContent
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



        public SearchOvalTestContent()
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
