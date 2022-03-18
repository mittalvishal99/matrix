package io.dsa.matrix;
import java.util.ArrayList;

public class SnakePattern {

	/*
	 * Input:
N = 3 
matrix[][] = {{45, 48, 54},
             {21, 89, 87}
             {70, 78, 15}}
Output: 45 48 54 87 89 21 70 78 15 
	 */
	public static void main(String[] args) 
	{
		
		

	} static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<matrix.length;j++)
                {
                    arr.add(matrix[i][j]);
                }
            }
            else{
                for(int j=matrix.length-1;j>=0;j--)
                {
                    arr.add(matrix[i][j]);
                }
            }
        }return arr;

}
