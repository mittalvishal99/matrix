		public class Main
		{
			public static void main(String[] args) 
			{
			    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
			    int temp[][]=new int[4][4];
			    int n=matrix.length;
			    // doing transpose
			    
		        for(int i=0;i<matrix.length;i++)
		        {
		            for(int j=i+1;j<matrix[i].length;j++)
		            {
		                int val=matrix[i][j];
		                matrix[i][j]=matrix[j][i];
		                matrix[j][i]=val;
		            }
		        }
		        // changing rows
		        for(int i=0;i<matrix.length;i++)
		        {
		            int low=0;
		            int high=matrix.length-1;
		            while(low<high)
		            {
		                int val=matrix[low][i];
		                matrix[low][i]=matrix[high][i];
		                matrix[high][i]=val;
		                low++;
		                high--;
		            }
		            }			    
		        for(int i=0;i<matrix.length;i++)
		        {
		            for(int j=0;j<matrix[i].length;j++)
		            {
		                System.out.print(matrix[i][j]+" ");
		            }System.out.println();
		        }
			}
		}


		
	}

}
