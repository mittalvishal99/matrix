package io.dsa.matrix;

public class PrintBoundaryElements 
{
	//print the boundary elements 
	//O(n)
	    public int[] BoundaryElements(int[][] matrix)
	    {
	        int r=matrix.length;
	        int c=matrix[0].length;
	        
	        int arr[]=new int[(2*r)+(2*(c-2))];
	        
	        //for a 4x4 matrix boundary elements will be 12
	        
	        if(r==1)
	        {
	            
	            if(c==0){
	            arr[0]=0;
	            }
	            for(int i=0;i<c;i++)
	            {
	                arr[i]=matrix[0][i];
	            }
	        }
	        else if(c==1)
	        {
	            for(int i=0;i<r;i++)
	            {
	                arr[i]=matrix[i][0];
	            }
	        }
	        else{
	            int count=0;
	            for(int i=0;i<c;i++)
	            {
	                arr[count]=matrix[0][i];
	                count++;
	            }
	            for(int j=1;j<r;j++)
	            {
	                arr[count]=matrix[j][c-1];
	            
	                count++;
	            }
	            for(int k=c-2;k>=0;k--)
	            {
	                arr[count]=matrix[r-1][k];
	            
	                count++;
	            }
	            
	            for(int l=r-2;l>=1;l--)
	            {
	                arr[count]=matrix[l][0];
	            
	                count++;
	            }
	            
	        }return arr;


}
