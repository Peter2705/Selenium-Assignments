package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
          int num = 12321;
          int givenNum = num;
          int rev = 0;
          for (;num!=0;num/=10) {
        	  int temp = num%10;
        	  rev = rev * 10 + temp;
        	 
           }
          System.out.println("The given number is " +givenNum);
          System.out.println("The reversed number is " +rev);
          
          if (givenNum == rev ) {
        	  System.out.println("The given number " + givenNum+ " is a Palindrome");
          }
          else {
        	  System.out.println("The given number " + givenNum+ " is not a Palindrome");  
          }
        	  

	}

}
