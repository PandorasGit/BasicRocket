package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexToSelectionTest {

    @Test
    public void indexToSelectTest(){
        IndexToSelection indexToSelection = new IndexToSelection();
        String result = indexToSelection.convert(0);
        Assertions.assertEquals("A",result);
    }

    @Test
    public void indexToSelectBTest(){
        IndexToSelection indexToSelection = new IndexToSelection();
        String result = indexToSelection.convert(1);
        Assertions.assertEquals("B",result);
    }
}
