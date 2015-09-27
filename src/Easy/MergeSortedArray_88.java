package Easy;

/**
 * Created by guangshuozang on 9/26/15.
 */
public class MergeSortedArray_88 {
    public void merge(int[] A, int m, int[] B, int n) {
        //1. add num2 to num1 and sort again
        //2. rearrange numbers while looping through num1 and num2, should be what this question ask for

        int i=m-1, j=n-1, k=m+n-1;
        while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
        while (j>-1)         A[k--]=B[j--];

    }
}
