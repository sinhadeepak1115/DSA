package com.deepak;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 45, 56, 67, 78, 89, 90, 100};
        int ans = orderAgnosticBS(arr, 90);
        System.out.println(ans);

    }
    static int binarySearch( int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while( start <= end ){
            int mid  = start + ( end - start ) / 2;
            if (arr[0] < arr[arr.length -1] ){
                if ( target < arr[mid] ){
                    end = mid - 1;
                }else if ( target > arr[mid] ){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }else{
                if ( target > arr[mid] ){
                    end = mid - 1;
                }else if ( target < arr[mid] ){
                    start = mid + 1;
                }else{
                    return mid;
                }

            }
        }
        return -1;
    }

// better alternative
static int orderAgnosticBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // find whether the array is sorted in ascending or descending
    boolean isAsc = arr[start] < arr[end];

    while(start <= end) {
        // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (isAsc) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return -1;
}
}