package com.arrayprograms;

public class SortUnitPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,3,41,12,13,19,81,9};
        for(int i=0; i<arr.length; i++) {
            for(int j=1+i; j<arr.length; j++) {
                if(arr[i]%10>arr[j]%10) {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
       for(int k=0;k<arr.length;k++) {
            System.out.println(arr[k]);
        }

	}

}
