import static org.junit.Assert.*;
import org.junit.*;


public class ListTests {
    @Test
    public void testFilter(){
        String[] input1 = {"1", "2", "3"}
    }
}

    public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);

        int[] input2 = {1, 2, 3, 4};
        ArrayExamples.reverseInPlace(input2);
        assertArrayEquals(new int[]{4, 3, 2, 1}, input2);
        }