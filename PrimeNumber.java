package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int prime =29;
		boolean flag = false;
		int div = prime/2;
		for (int i=2; i<=div;i++) {
			if (prime%i == 0)
			{

				flag = true;
				break;


			}
		}
		if (flag == true){
			System.out.println("The given Number "+prime+" is not Prime Number");
		}
		else {
			System.out.println("The given Number "+prime+" is Prime Number");
		}


	}
} 


