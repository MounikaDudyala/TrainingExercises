package com.imaginea.training;

public class EvenOddThreadSample {
	public static void main(String args[]) {
		NumberPrinter numberPrinter = new NumberPrinter();
		EvenNumberProducer obj1=new EvenNumberProducer(numberPrinter, 20);
		OddNumberProducer obj2=new OddNumberProducer(numberPrinter, 20);
		//Thread t1 = new Thread(new EvenNumberProducer(numberPrinter, 20));
		//Thread t2 = new Thread(new OddNumberProducer(numberPrinter, 20));
		//t1.setName("eventhread");
		//t2.setName("OddThread");
		obj1.t1.start();
		obj2.t2.start();

	}

}
