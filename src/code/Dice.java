package code;

import java.util.Random;

public class Dice extends Main implements Runnable {

	@Override
	public void run() {
		
		int dice;
		
		for(int i=0; i<10000; i++) {
			
			dice = new Random().nextInt(6)+1;
			switch(dice) {
			case 1:
				marcador1++;
				break;
			case 2:
				marcador2++;
				break;
			case 3:
				marcador3++;
				break;
			case 4:
				marcador4++;
				break;
			case 5:
				marcador5++;
				break;
			case 6:
				marcador6++;
				break;
			}
			
		}
	}

}
