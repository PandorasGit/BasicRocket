package view;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResultsFormatterTest {

    @Test
    public void formatResultsTest(){
        String expected = "Rocket D flew up to a height of 355.9 meters!";
        ResultsFormatter resultsFormatter = new ResultsFormatter();
        String result = resultsFormatter.format("D",355.9384f);

        Assertions.assertEquals(expected,result);
    }
}
