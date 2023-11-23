package week1.day1;



public class Mobile {
	
	public void makeCall (String mobileModel, Float mobileWeight) {
		System.out.println("The mobile model is : " + mobileModel);
		System.out.println("The mobile weight is : " + mobileWeight);
		
	}
	
	public void sendMsg(Boolean isFullCharged, int mobileCost) {
		System.out.println("Is Mobile charged Fully? "+ isFullCharged);
		System.out.println("The mobile cost is : " + mobileCost);
		
	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
	    mob.makeCall("Vivo", 150.5f);
	    mob.sendMsg(true, 9999);
		System.out.println("This is my Mobile");
			
		}

	

}
