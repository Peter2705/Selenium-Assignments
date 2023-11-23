package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum =1;
		int num =8;
		int sum = 0;
		System.out.println("The Fibonacci series of the given number "+ num + " is");
		for (int i=1; i<=num; i++) {
			System.out.println(firstNum);
			sum = firstNum+secondNum;
			firstNum = secondNum;
			secondNum = sum;
		}

	}

}
