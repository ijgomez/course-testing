/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.course.testing;

/**
 *
 * @author jose maria
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao dao;

    public void setCuentaDao(AccountDao dao) {
        this.dao = dao;
    }

    public Boolean concederPrestamo(Double cantidad, Long idCuenta) {
        Account cuenta = dao.encontrarCuentaPorId(idCuenta);
        Integer periodoDeCalculoEstandar = 3;
        Double saldoMedio = cuenta.saldoMedio(periodoDeCalculoEstandar);
        return saldoMedio < cantidad ? false : true;
    }
}
