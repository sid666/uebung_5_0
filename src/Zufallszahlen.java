
public class Zufallszahlen {

	public static void main(String[] args) {
	
	int[] zahlenliste = new int [6];
	
	for (int i = 0; i < 50; i++) {
		
		int a = Zufall.getZufallInt(1, 6);
		zahlenliste[a-1]=zahlenliste[a-1]+1;
				
	}
	System.out.println(zahlenliste[0]);
	System.out.println(zahlenliste[1]);
	System.out.println(zahlenliste[2]);
	System.out.println(zahlenliste[3]);
	System.out.println(zahlenliste[4]);
	System.out.println(zahlenliste[5]);

	
	}
}	



	
	
		
		
		
	/*int one = 0;
	int two = 0;
	int three = 0;
	int four = 0;
	int five = 0;
	int six = 0;
	
	for (int i = 0; i < 50; i++) {
		
		int a = Zufall.getZufallInt(1, 6);
	    
		switch (a) {
		case 1: one++;
				break;
		case 2: two++;
				break;
		case 3: three++;
				break;
		case 4: four++;
				break;
		case 5: five++;
				break;
		case 6: six++;
				break;
				
		}
		
	    
	    
	}
	
	System.out.println(one);
	System.out.println(two);
	System.out.println(three);
	System.out.println(four);
	System.out.println(five);
	System.out.println(six);*/

