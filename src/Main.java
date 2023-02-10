import com.Amestoy.Libreria.Calculadora;

public class Main {
    public static void main(String[] args) {

        int device;
        Float numero1, numero2;
        Float resultado;
        device = EntradaSalida.entradaEntero("1 --> Sumar \n2 --> Restar \n3 --> Multiplicar \n4 --> Dividir \n5 --> Salir del programa");
        numero1 = EntradaSalida.entradaFloat("Escribe primer numero");
        numero2 = EntradaSalida.entradaFloat("Escribe segundo numero");
        if (numero1 == null || numero2 == null) {
            EntradaSalida.salida("Error: Escribe un numero", EntradaSalida.SALIDA_CONSOLA);
        } else {
            if (device > 0 && device < 5) {
                resultado = Calculadora.operacion(device, numero1, numero2);
                if (Float.isNaN(resultado)) {
                    EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
                } else {
                    EntradaSalida.salida(("Resultado: " + resultado), EntradaSalida.SALIDA_WINDOW);
                }
            }


        }
    }
}