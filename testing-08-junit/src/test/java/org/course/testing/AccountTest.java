package org.course.testing;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    private Account cuenta;

    @Before
    public void setUp() {
        cuenta = new Account();
    }

    @Test
    public void ingresoEnCuentaVacia() {
        cuenta.ingresar(100.0d);
        assertTrue(cuenta.balance() == 100.0d);
    }

    @Test
    public void ingresoEnCuentaConImporteExistente() {
        cuenta.ingresar(100.0d);
        cuenta.ingresar(100.0d);
        assertTrue(cuenta.balance() == 200.0d);
    }
}
