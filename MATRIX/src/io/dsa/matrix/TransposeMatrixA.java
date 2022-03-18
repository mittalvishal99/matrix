package io.dsa.matrix;

public class TransposeMatrixA {
	public static void main(String[] args)
	{
		int n=4;
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	        int temp[][]=new int[n][n];
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr.length;j++)
	            {
	                temp[j][i]=arr[i][j];
	            }
	        }
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr.length;j++)
	            {
	            	System.out.print(temp[i][j]+" ");
	            }System.out.println();
	        }
	}
}
