package recursividad;

public class CalculoFactorial {
// declaracion recursiva del metodo factorial
    public double factorial(double numero) {
        if (numero <= 1) { // evalua el caso base
            return 1; // caso base: 0!=1 y 1!=1
        } else { // paso recursivo
            return numero * factorial(numero -1);
        }
    } // fin del metodo factorial

    public void mostrarFactoriales(){ // imprimir factoriales dfel 0 al 4
        for (int contador = 0; contador <= 4; contador++) {
            System.out.printf("%d! = %.0f\n", contador, factorial(contador));
        }
    } // fin del metodo mostrarFactoriales
} // fin de la clase calculoFactorial
