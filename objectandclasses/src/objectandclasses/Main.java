package objectandclasses;

public class Main {

	public static void main(String[] args) {
		Robot r1 = new Robot("roy",46,"red");
		Robot r2 = new Robot("Dennis", 87, "white");
		
		
		Persons p1 = new Persons ("Denver", "Aggressive", false);
		Persons p2 = new Persons ("Sergio", " Calm", true);
		
		p1.owned = r2;
		p2.owned = r1;
		
		String robo1 = p1.owned.Introduce();
		String robo2  = p2.owned.Introduce();
		System.out.println("Robo1 = "+ robo1 + "Robo2 = " + robo2);
	

	 
	    

	}

}
