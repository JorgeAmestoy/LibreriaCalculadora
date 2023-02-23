package com.amestoy.libcalculadora;

/**
 * TareaLibreriaJorge
 *
 * @author Jorge Amestoy Sabucedo
 * version 10.02.2023
 */
public class Calculadora {

    /**
     * Creo atributo privado de clase Float resultado = null
     */
    private static Float resultado = null;
    /**
     * Creo atributo constante de suma con valor 1
     */
    static final int SUMA = 1;
    /**
     * Creo atributo constante de resta con valor 2
     */
    static final int RESTA = 2;
    /**
     * Creo atributo constante de multiplicacion con valor 3
     */
    static final int MULTIPLICACION = 3;
    /**
     * Creo atributo constante de multiplicacion con valor 3
     */
    static final int DIVISION = 4;

    /**
     * descripcion
     * @param device Eleccion de la operacion numerica usando las constantes
     * @param numA   Primer numero
     * @param numB   Segundo numero
     * @return resultado
     */
    public static Float operacion(int device, Float numA, Float numB) {

        switch (device) {

            case SUMA:
                try {
                    resultado = numA + numB;
                } catch (Exception e) {
                    System.out.println("No es valido");
                }

                break;

            case RESTA:
                try {
                    resultado = numA - numB;
                } catch (Exception e) {
                    System.out.println("No es valido");
                }
                break;

            case MULTIPLICACION:
                try {
                    resultado = numA * numB;
                } catch (Exception e) {
                    System.out.println("No es valido");
                }
                break;

            case DIVISION:
                try {
                    resultado = numA / numB;
                } catch (Exception e) {
                    System.out.println("No es valido");
                }
                break;


        }

        return resultado;


    }


}

