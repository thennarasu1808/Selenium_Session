package javaTutorial;

public class SpiralPrint {


    // This method will print the 2D matrix in spiral form
	
    static void spiralPrint(int rows, int cols, int arr[][]) 
    { 
        int i, row = 0, col = 0; 
                  
        while (row < rows && col < cols) 
        { 
            // Print the first top row  
            for (i = col; i < cols; ++i) 
            { 
                System.out.print(arr[row][i]+" "); 
            } 
            row++; 
   
            // Print the last column 
            for (i = row; i < rows; ++i) 
            { 
                System.out.print(arr[i][cols-1]+" "); 
            } 
            cols--; 
   
            // Print the last row 
            if ( row < rows) 
            { 
                for (i = cols-1; i >= col; --i) 
                { 
                    System.out.print(arr[rows-1][i]+" "); 
                } 
                rows--; 
            } 
   
            // Print the first column 
            if (col < cols) 
            { 
                for (i = rows-1; i >= row; --i) 
                { 
                    System.out.print(arr[i][col]+" "); 
                } 
                col++;     
            }         
        } 
    } 
      
    
    public static void main (String[] args)  
    { 
		
        int arr[][] = { {1,  2,  3,  4,  5,  6}, 
                      {7,  8,  9,  10, 11, 12}, 
                      {13, 14, 15, 16, 17, 18} 
                    }; 
        spiralPrint(3,6,arr); 
    } 
} 

