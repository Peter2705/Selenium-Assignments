package week1.day1;

public class Browser {
	public static void main(String[] args) {
		System.out.println("This is my Browser");
		
		Chrome obj = new Chrome();
		String res = obj.getname("Chrome");
		System.out.println(res);
		obj.printName();
	}

}
