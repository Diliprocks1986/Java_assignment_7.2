// Program to find a substring in a String by using an inbuilt method of String class.

public class subString {
	// two variable intialized
     static String Str;
	 static int Sub;
	// main method 
   public static void main(String args[]) {
	   // Asking for String from user
	  System.out.print("Enter Any String: ");
	  // Reading and assigning the value given by user
	  Str = System.console().readLine(); 
	  // asking for index where the user want to Sub
      System.out.print("Enter the Index Where you Want to Sub the String: ");
	  // Reading and assigning the value given by user
      Sub = Integer.parseInt(System.console().readLine()); 
	  
      // output the value with subString method
      System.out.println("SubString of the Given String is : " +(Str.substring(Sub)) );

   }
}