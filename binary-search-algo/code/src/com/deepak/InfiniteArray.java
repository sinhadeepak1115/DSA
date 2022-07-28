package com.deepak;

public class InfiniteArray {
    public static void main(String[] args) {

    }
    static int rangeArray(int[] arr, int target){

    }
    static int binarySearch( int[] arr, int start, int end, int target){
        while (start <= end){
//            find the middle element
//            int mid = (start + end)/2; // might be possible that it exceeds the limit in int
//            Better Way
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
