import org.junit.Test;
import org.sdmx.resources.sdmxml.schemas.v2_1.structure.CodelistsType;
import org.sdmx.resources.sdmxml.schemas.v2_1.structure.StructuresType;

public class TestOne {

    @Test
    public void test() {
        StructuresType type = new StructuresType();
        type.setCodelists(new CodelistsType());
    }
}
