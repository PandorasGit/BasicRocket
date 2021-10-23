package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionToIndexTest {

    @Test
    public void convertTest(){
        int expected = 0;
        SelectionToIndex selection = new SelectionToIndex();
        int result = selection.convert("A");
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void convertBTest(){
        int expected = 1;
        SelectionToIndex selection = new SelectionToIndex();
        int result = selection.convert("B");
        Assertions.assertEquals(expected,result);
    }
}
