/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numromanos;

import java.util.Scanner;

/**
 *
 * @author alanc
 */
public class NumRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conversion de numeros Arábigos a Romanos");
        Scanner entrada = new Scanner(System.in);

        int numeros;
        String numRomano = "";

        System.out.print("Digite el numero\t"); //Entrada de datos
        numeros = entrada.nextInt();

        numRomano = numRomano + Romanos(numeros) + "\n";

        System.out.print("Este es su número: " + numRomano);   //Salida de datos 
    }
    //Método

    public static String Romanos(int num) {

        int i;
        int mil; //Esta variable tomara el lugar de las milesimas
        int cen; ////Esta variable tomara el lugar de las centesimas
        int dec; //Esta variable tomara el lugar de las decenas
        int uni; //Esta variable tomara el lugar de las unidades

        mil = (num / 1000);
        i = num % 1000;
        cen = i / 100;
        i = num % 100;
        dec = i / 10;
        uni = num % 10;
        String letra = ""; //Esta variable acumulara las letras

        switch (mil) {
            case 1:
                letra = letra + "M";
                break;
        }

        switch (cen) {
            case 1:
                letra = letra + "C";
                break;
            case 2:
                letra = letra + "CC";
                break;
            case 3:
                letra = letra + "CCC";
                break;
            case 4:
                letra = letra + "CD";
                break;
            case 5:
                letra = letra + "D";
                break;
            case 6:
                letra = letra + "DC";
                break;
            case 7:
                letra = letra + "DCC";
                break;
            case 8:
                letra = letra + "DCCC";
                break;
            case 9:
                letra = letra + "CM";
                break;
        }

        switch (dec) {
            case 1:
                letra = letra + "X";
                break;
            case 2:
                letra = letra + "XX";
                break;
            case 3:
                letra = letra + "XXX";
                break;
            case 4:
                letra = letra + "XL";
                break;
            case 5:
                letra = letra + "L";
                break;
            case 6:
                letra = letra + "LX";
                break;
            case 7:
                letra = letra + "LXX";
                break;
            case 8:
                letra = letra + "LXXX";
            case 9:
                letra = letra + "XC";
                break;
        }

        switch (uni) {
            case 1:
                letra = letra + "I";
                break;
            case 2:
                letra = letra + "II";
                break;
            case 3:
                letra = letra + "III";
                break;
            case 4:
                letra = letra + "IV";
                break;
            case 5:
                letra = letra + "V";
                break;
            case 6:
                letra = letra + "VI";
                break;
            case 7:
                letra = letra + "VII";
                break;
            case 8:
                letra = letra + "VIII";
                break;
            case 9:
                letra = letra + "IX";
                break;
        }

        return letra;
    }
}
