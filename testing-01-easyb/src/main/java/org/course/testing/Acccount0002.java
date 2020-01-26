package org.course.testing;

public class Acccount0002 {

	private Double balance = 0.0;

	public Acccount0002() {

	}

	public void ingresar(Double cantidad) {
		balance += cantidad;
	}

	public Double getBalance() {
		return balance;
	}
}
