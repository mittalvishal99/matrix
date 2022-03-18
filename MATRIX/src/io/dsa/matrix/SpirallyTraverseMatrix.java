/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/// NOT WROKING HERE......COPY IN GFG ...CHALEGA NHI DAUREGA
public class Main
{
	public static void main(String[] args)
	{
	     int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	     int r=4;
	     int c=4;
	 
       ArrayList<Integer> arr= new ArrayList<Integer>();
        int top=0;
        int bottom=r-1;
        int left=0;
        int right=c-1;
        while(top<=bottom && left<=right)
        {
            //left se shuru hokar right tak jaana
            for(int i=left;i<=right;i++)
            {
                arr.add(matrix[top][i]);
                
            }top++;
            //top se bottom
            for(int i=top;i<=bottom;i++)
            {
                arr.add(matrix[i][right]);
                
            }right--;
            if(top<=bottom)
            {
                //
                for(int i=right;i>=left;i--)
                {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    
}
}
