package com.arrayprograms;

public class Duplicate_numberCount {

	public static void main(String[] args) {
		
		int number[]= {12,33,45,19,90,19,12,33};
		int count=0;
		
		for(int i=0;i<number.length;i++) {
			
			for(int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) 
				{
					System.out.println(number[j]);
					//i++;
					count++;
					break;
				}
			}
			
		}
		System.out.println("count is "+count);
	}

}
