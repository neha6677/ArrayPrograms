package com.arrayprograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int given_arr[]= {2,3,4,5,7,12,16};
		int even_count=0;
		int odd_count=0;
		
		for(int i=0;i<given_arr.length;i++) {
			
			if(given_arr[i]%2==0) {
				even_count++;
				//System.out.println(even_count);
			}
			else {
				odd_count++;
				//System.out.println("odd = "+given_arr[i]);
			}
		}
		System.out.println("even count is "+even_count);
		System.out.println("odd count is "+odd_count);
		
		//perfect
		int n, sum=0;  
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=sc.nextInt();  
		int i=1;
		
		while(i <= n/2)  
		{  
		if(n % i == 0)  
		{  
		
		sum = sum + i;  
		} 
		i++;  
		}   
		if(sum==n)  
		{  
		
		System.out.println(n+" is a perfect number.");
		System.out.println(n);
		}  
		else  
		
		System.out.println(n+" is not a perfect number.");  
		
		//prime number
		 int array[]= {10,2,43,22,12,6,7};
		    for(int i1=0; i1<array.length; i1++){
		        boolean isPrime = true;
		        	        
		        for (int j=2; j<array[i1]; j++){
		            
		            if(array[i1]%j==0){
		                isPrime = false;
		                break;
		            }
		        }
		        //print the number
		        if(isPrime)

		            System.out.println(array[i1] + " are the prime numbers");
		    }
	
	}
		
	}


