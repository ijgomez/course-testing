import org.course.testing.Account0001;

/**
 * Un escenario que define e implementa un comportamiento
 */
scenario "Implementación del escenario depositar dinero en una cuenta", {
    given "una cuenta nueva",{
        account = new Account0001()
    }

    when "se hace un depósito", {
        cantidad = 100.0
        account.ingresar cantidad
    }

    then "el balance debe ser igual a la cantidad ingresada", {
        account.balance.shouldBe cantidad
    }
}