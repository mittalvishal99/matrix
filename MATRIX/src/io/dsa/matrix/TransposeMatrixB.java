package io.dsa.matrix;
//efficient
public class TransposeMatrixB {
	
	
	 static void transpose(int matrix[][], int n)
	    {
	       for(int i=0;i<n-1;i++)
	       {
	           for(int j=i+1;j<n;j++)
	           {
	               swap(matrix,i,j);
	           }
	       }
	    }
	    static void swap(int matrix[][],int i,int j)
	    {
	        int temp=matrix[i][j];
	        matrix[i][j]=matrix[j][i];
	        matrix[j][i]=temp;
	    }

}
