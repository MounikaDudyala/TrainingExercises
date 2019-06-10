package com.imaginea.training;

public class EvenNumberProducer implements Runnable {
	NumberPrinter np;
	int max_limit;
	Thread t1;

	EvenNumberProducer(NumberPrinter np, int max_limit) {
		this.np = np;
		this.max_limit = max_limit;
		t1=new Thread(this);
	}

	public void run() {
		int count = 2;
		while (count <= max_limit) {
			np.printEven(count);
			count = count + 2;
		}
	}
}
