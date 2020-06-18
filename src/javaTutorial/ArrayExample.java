package javaTutorial;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int sum=0;
		int a[]= {3,5,7,4,9};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			//Adding all the values in array
			/*
			 * sum=sum+a[i]; System.out.println(sum);
			 */
			
			if(a[i]==4) {
				
				System.out.println("The value of index is: " +a[i]);
				break;
			}
		}
		//System.out.println(sum);
	}

}
