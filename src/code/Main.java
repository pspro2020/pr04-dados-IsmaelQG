package code;

import java.util.ArrayList;

public class Main {
	
	public static int marcador1 = 0;
	public static int marcador2 = 0;
	public static int marcador3 = 0;
	public static int marcador4 = 0;
	public static int marcador5 = 0;
	public static int marcador6 = 0;

	public static void main(String[] args) {
		
		final MyThreadFactory threadFactory = new MyThreadFactory("MyThreadFactory");
		ArrayList<Thread> threads = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			Thread thread = threadFactory.newThread(new Dice());
			threads.add(thread);
			thread.start();
		}
		
		for (Thread thread : threads) {
            try {
                thread.join();
            }
            catch (InterruptedException exception) {
                return;
            }
		}
		
		int total = marcador1 + marcador2 + marcador3 + marcador4 + marcador5 + marcador6;
		
		System.out.print("Número 1: " + marcador1 +
						 "\nNúmero 2: " + marcador2 +
						 "\nNúmero 3: " + marcador3 +
						 "\nNúmero 4: " + marcador4 +
						 "\nNúmero 5: " + marcador5 +
						 "\nNúmero 6: " + marcador6);
		
		System.out.printf("\n\nTotal de veces: %d + %d + %d + %d + %d + %d = %d", marcador1, marcador2, marcador3, marcador4, marcador5, marcador6, total);
		
	}

}
