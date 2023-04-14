package Playground;

import org.junit.Test;
import static org.junit.Assert.*;
import Playground.MeanMedianMode;

public class MMMTests {
    
    @Test
    public void testMedian(){
        int[] arr = {1, 2, 3, 4, 5};
        int actualMedian = MeanMedianMode.findMedian(arr);
        int median = 3;
        assertEquals(median, actualMedian);
    }
}
