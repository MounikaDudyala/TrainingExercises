package com.imaginea.training;

public class NumberPrinter {

	boolean evenFlag = false;

	public void printEven(int num) {
		synchronized (this) {
			while (!evenFlag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(num);
			evenFlag = false;
			notify();
		}
	}

	public void printOdd(int num) {
		synchronized (this) {
			while (evenFlag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(num);
			evenFlag = true;
			notify();
		}
	}
}
