import com.amestoy.io.EntradaSalida;
import com.amestoy.libcalculadora.Calculadora;


public class Main {

    public static void main(String[] args) {

        int device;
        Float numero1, numero2;
        Float resultado;


        device = EntradaSalida.entradaINt("1 --> Sumar \n2 --> Restar \n3 --> Multiplicar \n4 --> Dividir");
        numero1 = EntradaSalida.entradaFloat("Escribe primer numero");
        numero2 = EntradaSalida.entradaFloat("Escribe segundo numero");
        if (numero1 == null || numero2 == null) {

            EntradaSalida.salida("Error: Escribe un numero, no una letra", EntradaSalida.SALIDA_CONSOLA);
        } else {
            if (device >= 1 && device <= 4) {
                resultado = Calculadora.operacion(device, numero1, numero2);
                if (Float.isInfinite(resultado)) {
                    EntradaSalida.salida("Error: No se puede dividir entre cero. Prueba otra vez.", EntradaSalida.SALIDA_CONSOLA);
                } else {
                    EntradaSalida.salida(("Resultado: " + resultado), EntradaSalida.SALIDA_CONSOLA);
                }
            }


        }
    }
}