package org.course.testing;

public class Account {

    private Double balance;

    public Account() {
        balance = 0.0d;
    }

    public Account(Double balance) {
        checkCantidad(balance);
        this.balance = balance;
    }

    private void checkCantidad(Double cantidad) throws IllegalArgumentException {
        if (cantidad < 0.0d) {
            throw new IllegalArgumentException("La cantidad no puede ser menor que cero");
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        checkCantidad(balance);
        this.balance = balance;
    }

    public void ingresar(Double importe){
        checkCantidad(importe);
        balance += importe;
    }
}
