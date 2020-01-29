package org.course.testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

    @Test
    public void testIngresoEnCuentaVacia() {
        Account account = new Account();
        account.setBalance(100.0d);
        Double expResult = 100.0d;
        Double result = account.getBalance();
        assertEquals(expResult, result);
    }

    @Test
    public void testIngresoEnCuentaNoVaciaOk() {
        Account account = new Account(100.0d);
        account.ingresar(100.0d);
        Double expResult = 200.0d;
        Double result = account.getBalance();
        assertEquals(expResult, result);
    }

    @Test(expected = AssertionError.class)
    public void testIngresoEnCuentaNoVacia() {
        Account account = new Account(100.0d);
        account.setBalance(100.0d);
        Double expResult = 200.0d;
        Double result = account.getBalance();
        assertEquals(expResult, result);
    }
}
