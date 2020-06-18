package javaTutorial;

public class StringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// check a string is palindrome
String str="Thennarasu";
String t ="";
System.out.println(str.charAt(8));
System.out.println(str.substring(6));

for(int i=str.length()-1;i>=0;i--) {
	//System.out.println(str.charAt(i));
	t=t+str.charAt(i);
}

System.out.println(t);

if(str==t) {
	System.out.println("The string is palindrome");
}else {
	System.out.println("The string is not palindrome");
}
	}

}
