package com.imaginea.training;

public class OddNumberProducer implements Runnable {

	NumberPrinter np;
	int max_limit;
	Thread t2;

	OddNumberProducer(NumberPrinter np, int max_limit) {
		this.np = np;
		this.max_limit = max_limit;
		t2=new Thread(this);
	}

	public void run() {
		int count = 1;
		while (count <= max_limit) {
			np.printOdd(count);
			count = count + 2;
		}
	}
}
