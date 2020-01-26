import org.course.testing.Account0002;

/**
 * Un escenario que define e implementa un comportamiento
 */
scenario "depositar dinero en una cuenta con fondos", {
    given "una cuenta con fondos",{
        account = new Account0002()
        cantidadInicial = 100.0
        account.ingresar cantidadInicial
    }

    when "se hace un depósito", {
        cantidad = 100.0
        account.ingresar cantidad
    }

    then "el balance debe ser igual a la cantidad ingresada más los fondos existentes", {
        account.balance.shouldBe cantidad + cantidadInicial
    }
}