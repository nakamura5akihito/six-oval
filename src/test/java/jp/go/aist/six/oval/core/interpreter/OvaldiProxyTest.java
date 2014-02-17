package jp.go.aist.six.oval.core.interpreter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jp.go.aist.six.oval.core.SixOvalContext;
import jp.go.aist.six.oval.interpreter.Options;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith( Enclosed.class )
public class OvaldiProxyTest
{

    @RunWith( Theories.class )
    public static class ConfigurationByProperties
    {

        @DataPoints
        public static Options[]  OPTIONS = new Options[] {
            new Options()
            .set( OvaldiOption.NO_VERIFY )
//          .set( OvaldiOption.OVAL_XML_DIR, "C:\\app\\ovaldi-5.10.1.4-x64\\xml" )
            .set( OvaldiOption.OVAL_DEFINITIONS, "src/test/resources/data/oval5/mitre/windows/oval-5.10-12541-3_i_Windows7.xml" ),

            /* for networking proxy */
//            new Options()
//            .set( OvaldiOption.NO_VERIFY )
//            .set( OvaldiOption.OVAL_DEFINITIONS,
//                            "http://oval.mitre.org/repository/data/DownloadDefinition?id=oval%3aorg.mitre.oval%3adef%3a12541&type=view" )
        };



        @Theory
        public void testExecuteWithOptions(
                        final Options options
                        )
        {
            OvaldiProxy  ovaldi = new OvaldiProxy( options );
            int  exitValue = ovaldi.execute();
            assertThat( "normal termination", exitValue, is( 0 ) );
        }

    }



    @RunWith( Theories.class )
    public static class ConfigurationBySetters
    {

        @DataPoints
        public static Options[]  OPTIONS = new Options[] {
            new Options()
            .set( OvaldiOption.NO_VERIFY )
//          .set( OvaldiOption.OVAL_XML_DIR, "C:\\app\\ovaldi-5.10.1.4-x64\\xml" )
            .set( OvaldiOption.OVAL_DEFINITIONS, "src/test/resources/data/oval5/mitre/windows/oval-5.10-12541-3_i_Windows7.xml" )
            .set( OvaldiOption.OVAL_SC, "T:\\temp\\system-characteristics_option.xml" )
            .set( OvaldiOption.OVAL_RESULTS, "T:\\temp\\results_option.xml" )
            .set( OvaldiOption.OVAL_TRANSFORMED_RESULTS, "T:\\temp\\results_option.html" )

        };



        @Theory
        public void testExecuteWithOptions(
                        final Options options
                        )
        {
            SixOvalContext  context = SixOvalContext.basic();

            OvaldiProxy  ovaldi = new OvaldiProxy( options );
            ovaldi.setExecutablePath( context.getProperty( OvaldiConfig.EXECUTABLE ) );

            int  exitValue = ovaldi.execute();
            assertThat( "normal termination", exitValue, is( 0 ) );
        }

    }

}
