package com.arrayprograms;

public class Pythagores {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,7};
        
        int a,b,c;
        for(int i=0;i<arr.length-2;i++)//select an element
        {
            for(int j=i+1;j<arr.length-1;j++)//select an element in front of the considered element
            {
                for(int k=i+2;k<arr.length;k++)// this element will be one ahead of the previously selected element in the jus touter loop
                {
                  a = arr[i];
                  b = arr[j];
                  c = arr[k];
                  if(a*a + b*b == c*c) // if the chosen elements satisfy the pythagoras theorem then simply print the three values.
                  {
                	  System.out.println("Pythogores applied");
                	  System.out.println("Numbers are : "+a +"  "+b+"  "+c);
                  }
                  
                }
                
              }
          }
	}

}
