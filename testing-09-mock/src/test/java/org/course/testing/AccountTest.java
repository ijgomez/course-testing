package org.course.testing;

import junit.framework.TestCase;

import org.course.testing.Account;
import org.course.testing.AccountDao;
import org.course.testing.AccountServiceImpl;
import org.easymock.EasyMock;

public class AccountTest extends TestCase {

    private Account mockCuenta;
    private AccountDao mockDao;
    private AccountServiceImpl servicioCuenta;

    public AccountTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mockCuenta = EasyMock.createStrictMock(Account.class);
        mockDao = EasyMock.createStrictMock(AccountDao.class);
        servicioCuenta = new AccountServiceImpl();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    public void testConcederPrestamo() {
        assertNotNull(mockCuenta);
        assertNotNull(mockDao);
        EasyMock.expect(mockCuenta.saldoMedio(3)).andReturn(1000.0d);
        EasyMock.expect(mockDao.encontrarCuentaPorId(1L)).andReturn(mockCuenta);
        EasyMock.replay(mockCuenta, mockDao);
        servicioCuenta.setCuentaDao(mockDao);
        assertTrue(servicioCuenta.concederPrestamo(500.0d, 1L));
        EasyMock.verify(mockCuenta, mockDao);
        EasyMock.reset(mockCuenta, mockDao);
    }

    public void testDenegarPrestamo() {
        assertNotNull(mockCuenta);
        assertNotNull(mockDao);
        EasyMock.expect(mockCuenta.saldoMedio(3)).andReturn(1000.0d);
        EasyMock.expect(mockDao.encontrarCuentaPorId(1L)).andReturn(mockCuenta);
        EasyMock.replay(mockCuenta, mockDao);
        servicioCuenta.setCuentaDao(mockDao);
        assertFalse(servicioCuenta.concederPrestamo(1500.0d, 1L));
        EasyMock.verify(mockCuenta, mockDao);
        EasyMock.reset(mockCuenta, mockDao);
    }
}
