package org.course.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.course.testing.Account;

public class AccountTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ingresoEnCuentaVacia() {
        Account cuenta = new Account();
        cuenta.ingresar(100.0d);
        assertTrue(cuenta.balance() == 100.0d);
    }

    @Test
    public void ingresoEnCuentaConImporteExistente() {
        Account cuenta = new Account();
        cuenta.ingresar(100.0d);
        cuenta.ingresar(100.0d);
        assertTrue(cuenta.balance() == 200.0d);
    }
}
