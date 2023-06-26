import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void peakIndexInMountainArrayTest1() {
        int[] arr = {0, 1, 0};
        int expected = 1;
        int actual = new Solution().peakIndexInMountainArray(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peakIndexInMountainArrayTest2() {
        int[] arr = {0, 2, 1, 0};
        int expected = 1;
        int actual = new Solution().peakIndexInMountainArray(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peakIndexInMountainArrayTest3() {
        int[] arr = {0, 10, 5, 2};
        int expected = 1;
        int actual = new Solution().peakIndexInMountainArray(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peakIndexInMountainArrayTest4() {
        int[] arr = {0, 1, 2, 3, 4, 5, 10, 5, 2};
        int expected = 6;
        int actual = new Solution().peakIndexInMountainArray(arr);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void peakIndexInMountainArrayTest5() {
        int[] arr = {3,5,3,2,0};
        int expected = 1;
        int actual = new Solution().peakIndexInMountainArray(arr);

        Assert.assertEquals(expected, actual);
    }
}
