package javaTutorial;

public class FindTheMissingNumber {

	// This function will print the mising no in an array
	
	public static int printMissingNo(int a[], int n) 
    { 
        int i, sumOfNnumbers; 
        sumOfNnumbers = (n + 1) * (n + 2) / 2; 
        for (i = 0; i < n; i++) 
        	sumOfNnumbers -= a[i]; 
        return sumOfNnumbers; 
    } 
  
    /* program to test above function */
    public static void main(String args[]) 
    { 
        int a[] = { 1, 4, 5, 3, 7, 8, 6 }; 
        int missingNum = printMissingNo(a, 7); 
        System.out.println("The missing number is: " +missingNum); 
    } 
} 

