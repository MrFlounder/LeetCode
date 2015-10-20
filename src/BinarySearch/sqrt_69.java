package BinarySearch;

/**
 * Created by guangshuozang on 10/20/15.
 */
public class sqrt_69 {
//    public int mySqrt(int x) {
//        if (x == 0)
//            return 0;
//        int left = 1, right = x;
//        while (true) {
//            int mid = left + (right - left)/2;
//            if (mid*mid > x) {
//                right = mid - 1;
//            } else {
//                if ((mid + 1)*(mid + 1) > x)
//                    return mid;
//                left = mid + 1;
//            }
//        }
//    }
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if ((mid + 1)> x/(mid+1))
                    return mid;
                left = mid + 1;
            }
        }
    }
    public static void main(String arg[]){
        sqrt_69 ins = new sqrt_69();
        System.out.println(ins.mySqrt(143214));
    }
}
