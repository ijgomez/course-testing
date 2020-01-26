/**
 * Un escenario que simplemente define un comportamiento
 */
scenario "Especificación del escenario depositar dinero en una cuenta", {
    given "una cuenta nueva"
    when "se hace un depósito"
    then "el balance debe ser igual a la cantidad ingresada"
}