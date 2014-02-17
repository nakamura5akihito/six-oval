package jp.go.aist.six.oval.core.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jp.go.aist.six.oval.core.SixOvalContext;
import jp.go.aist.six.oval.core.model.EntityUtil;
import jp.go.aist.six.oval.model.definitions.OvalDefinitions;
import jp.go.aist.six.oval.repository.DefinitionQueryParams;
import jp.go.aist.six.oval.repository.OvalRepository;
import org.junit.Test;


public class OvalDefinitionsGeneratorTest
{

    @Test
    public void testGenerateByQuery()
    {
        String  oval_id = "oval:org.mitre.oval.test:def:117";
        DefinitionQueryParams  params = new DefinitionQueryParams();
        params.set( DefinitionQueryParams.Key.ID, oval_id );

        OvalDefinitionsGenerator  generator = new OvalDefinitionsGenerator();
        String  oval_defs_id = generator.generateByQuery( params );

        OvalRepository  repository = SixOvalContext.repository().getRepository();
        OvalDefinitions  oval_defs = repository.findOvalDefinitionsById( oval_defs_id );
        assertThat( EntityUtil.containsElement( oval_defs, oval_id ), is( true ) );
    }

}
