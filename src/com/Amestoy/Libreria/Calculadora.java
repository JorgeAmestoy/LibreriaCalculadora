package com.Amestoy.Libreria;

/**
 * TareaLibreriaJorge
 *
 * @author Jorge Amestoy Sabucedo
 * version 10.02.2023
 */
public class Calculadora {

    /**
     * Declaro las constantes
     */

    private static Float resultado = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;

    /**
     *
     * @param device --> Eleccion de la operacion numerica usando las constantes
     * @param numA --> Primer numero
     * @param numB --> Segundo numero
     * @return resultado
     */


    public static Float operacion(int device, float numA, float numB) {

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

