package code;

import java.util.concurrent.ThreadLocalRandom;

public class Dice extends Main implements Runnable {

	private static synchronized void increment() {
		switch(ThreadLocalRandom.current().nextInt(1,7)) {
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
	
	@Override
	public void run() {
		for(int i=0; i<10000; i++) {
			increment();
		}
	}

}
