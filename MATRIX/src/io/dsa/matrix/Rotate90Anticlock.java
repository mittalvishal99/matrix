package io.dsa.matrix;
//naive
//space(thetha n^2)
public class Rotate90Anticlock {

	public static void main(String[] args)
	{
		int n=3;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	        int temp[][]=new int[n][n];
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr.length;j++)
	            {
	                temp[n-j-1][i]=arr[i][j];
	            }
	        }
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr.length;j++)
	            {
	            	System.out.print(temp[i][j]);
	            }System.out.println();
	        }
	   
	

	}

}
