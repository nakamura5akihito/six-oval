package io.opensec.six.oval.core;

import io.opensec.six.oval.core.SixOvalContext;
import org.junit.Test;



/**
 */
public class SixOvalContextTest
{

    @Test
    public void testGetProperty()
    {
        SixOvalContext  context = SixOvalContext.basic();

        System.out.println( "===== context properties =====" );
        for (String  key : context.getPropertyKeys()) {
            String  value = context.getProperty( key );
            System.out.println( "key=" + key + ", value=" + value );
        }
    }

}
