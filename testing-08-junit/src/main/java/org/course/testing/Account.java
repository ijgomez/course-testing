package org.course.testing;

class Account {

    double saldo;

    void ingresar(double d) {
        saldo += d;
    }

    double balance() {
        return saldo;
    }
}
