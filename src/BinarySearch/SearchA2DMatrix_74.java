package BinarySearch;

/**
 * Created by guangshuozang on 10/20/15.
 */
public class SearchA2DMatrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        //narrow down to row
        int rowl = 0, rowh = matrix.length-1;
        while(rowl<=rowh){
            int mid = (rowl+rowh)/2;
            if(matrix[mid][0]<=target&&matrix[mid][matrix[0].length-1]>=target){
                return searchMatrix(matrix[mid],target);
            }
            else if(matrix[mid][0]>target){
                rowh = mid -1;
            }else{
                rowl = mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[] a, int target){
        int start = 0, end = a.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==target) return true;
            else if(a[mid]>target) end=mid-1;
            else start = mid+1;
        }
        return false;
    }
}
