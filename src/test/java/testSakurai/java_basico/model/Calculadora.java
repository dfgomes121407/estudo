package testSakurai.java_basico.model;

public class Calculadora {

        public double calcula(double numero1, double numero2, int operador){

            switch (operador) {
                case 1:
                    return numero1 + numero2;
                case 2:
                    return  numero1 - numero2;
                case 3:
                    return numero1 * numero2;
                case 4:
                    return numero1 / numero2;
                default:
                    throw new IllegalArgumentException("operador invalido");
            }
        }
}
