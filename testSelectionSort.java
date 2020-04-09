import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class testSelectionSort {
    
	@Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] sortedArray = new int[5];
        sortedArray[0] = 2;
        sortedArray[1] = 7;
        sortedArray[2] = 8;
        sortedArray[3] = 9;
        sortedArray[4] = 10;
        
        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);
        assertArrayEquals("Actual values not equal to expected.", sortedArray, arr);
    }
    
	@Test
    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -6;
        arr[1] = -10;
        arr[2] = -1;
        arr[3] = -7;
        arr[4] = -20;
        
        int[] sortedArr = new int [5];
        sortedArr[0] = -20;
        sortedArr[1] = -10;
        sortedArr[2] = -7;
        sortedArr[3] = -6;
        sortedArr[4] = -1;
        
        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);
        assertArrayEquals("Actual values not equal to expected.", sortedArr, arr);
    }
	@Test
    public void testMixed(){
		int[] arr = new int[5];
        arr[0] = -6;
        arr[1] = 10;
        arr[2] = 11;
        arr[3] = -7;
        arr[4] = 0;
        
        int[] sortedArr = new int [5];
        sortedArr[0] = -7;
        sortedArr[1] = -6;
        sortedArr[2] = 0;
        sortedArr[3] = 10;
        sortedArr[4] = 11;

        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);
        assertArrayEquals("Actual values not equal to expected.", sortedArr, arr);
    }
    @Test
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 5;
        arr[3] = 6;
        arr[4] = 3;

        int[] sortedArr = new int [5];
        sortedArr[0] = 3;
        sortedArr[1] = 5;
        sortedArr[2] = 5;
        sortedArr[3] = 6;
        sortedArr[4] = 10;
        
        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);
        assertArrayEquals("Actual values not equal to expected.", sortedArr, arr);
    }
}
