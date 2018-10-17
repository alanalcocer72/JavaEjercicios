/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirmorse;

import java.util.Scanner;

/**
 *
 * @author alanc
 */
public class ConvertirMorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String res;
        do {
            Scanner sc = new Scanner(System.in);

            //Letras en morse
            String espacio = " ", lA = ".-", lB = "-...", lC = "-.-.", lD = "-..",
                    lE = ".", lF = "..-.", lG = "--.", lH = "....", lI = "..", 
                    lJ = ".---", lK = "-.-", lL = ".-..", lM = "--", lN = "-.", 
                    lO = "---", lP = ".--.", lQ = "--.-", lR = ".-.", lS = "...", 
                    lT = "-", lU = "..-", lY = "...-", lW = ".--", lX = "-..-",
                    ly = "-.--", lZ = "--..", n1 = ".----", n2 = "..---", n3 = "...--", 
                    n4 = "....-", n5 = ".....", n6 = "-....", n7 = "--...", n8 = "---..", 
                    n9 = "----.", n0 = "-----";

            String men, morse, finalMorse = "";//
            int longi;

            //Lectura de datos
            System.out.println("¿Elija el tipo de conversion que desee:\n "
                    + "M.Morse\n"
                    + " T.Texto\n ");
            men = sc.nextLine();//Aqui recibira la respuesta (T o M)

            //Texto a morse
            if (men.equalsIgnoreCase("T")) {
                System.out.println("Ingrese el texto: ");
                men = sc.nextLine();

                //En esta variable se guardara el tamño de la cadena
                longi = men.length();

                //CIclo que leera caracter por caracter
                for (int i = 0; i < longi; i++) {
                    String caract = "";//Aqui guardara el caracter obtenido.
                    caract = men.charAt(i) + "";

                    if (caract.equalsIgnoreCase(espacio)) {
                        finalMorse = finalMorse.concat("  ");
                    }
                    if (caract.equalsIgnoreCase("a")) {
                        finalMorse = finalMorse.concat(lA + " ");
                    }
                    if (caract.equalsIgnoreCase("b")) {
                        finalMorse = finalMorse.concat(lB + " ");
                    }
                    if (caract.equalsIgnoreCase("c")) {
                        finalMorse = finalMorse.concat(lC + " ");
                    }
                    if (caract.equalsIgnoreCase("d")) {
                        finalMorse = finalMorse.concat(lD + " ");
                    }
                    if (caract.equalsIgnoreCase("e")) {
                        finalMorse = finalMorse.concat(lE + " ");
                    }
                    if (caract.equalsIgnoreCase("f")) {
                        finalMorse = finalMorse.concat(lF + " ");
                    }
                    if (caract.equalsIgnoreCase("g")) {
                        finalMorse = finalMorse.concat(lG + " ");
                    }
                    if (caract.equalsIgnoreCase("h")) {
                        finalMorse = finalMorse.concat(lH + " ");
                    }
                    if (caract.equalsIgnoreCase("i")) {
                        finalMorse = finalMorse.concat(lI + " ");
                    }
                    if (caract.equalsIgnoreCase("j")) {
                        finalMorse = finalMorse.concat(lJ + " ");
                    }
                    if (caract.equalsIgnoreCase("k")) {
                        finalMorse = finalMorse.concat(lK + " ");
                    }
                    if (caract.equalsIgnoreCase("l")) {
                        finalMorse = finalMorse.concat(lL + " ");
                    }
                    if (caract.equalsIgnoreCase("m")) {
                        finalMorse = finalMorse.concat(lM + " ");
                    }
                    if (caract.equalsIgnoreCase("n")) {
                        finalMorse = finalMorse.concat(lN + " ");
                    }
                    if (caract.equalsIgnoreCase("o")) {
                        finalMorse = finalMorse.concat(lO + " ");
                    }
                    if (caract.equalsIgnoreCase("p")) {
                        finalMorse = finalMorse.concat(lP + " ");
                    }
                    if (caract.equalsIgnoreCase("q")) {
                        finalMorse = finalMorse.concat(lQ + " ");
                    }
                    if (caract.equalsIgnoreCase("r")) {
                        finalMorse = finalMorse.concat(lR + " ");
                    }
                    if (caract.equalsIgnoreCase("s")) {
                        finalMorse = finalMorse.concat(lS + " ");
                    }
                    if (caract.equalsIgnoreCase("t")) {
                        finalMorse = finalMorse.concat(lT + " ");
                    }
                    if (caract.equalsIgnoreCase("u")) {
                        finalMorse = finalMorse.concat(lU + " ");
                    }
                    if (caract.equalsIgnoreCase("v")) {
                        finalMorse = finalMorse.concat(lY + " ");
                    }
                    if (caract.equalsIgnoreCase("w")) {
                        finalMorse = finalMorse.concat(lW + " ");
                    }
                    if (caract.equalsIgnoreCase("x")) {
                        finalMorse = finalMorse.concat(lX + " ");
                    }
                    if (caract.equalsIgnoreCase("y")) {
                        finalMorse = finalMorse.concat(ly + " ");
                    }
                    if (caract.equalsIgnoreCase("z")) {
                        finalMorse = finalMorse.concat(lZ + " ");
                    }
                    if (caract.equalsIgnoreCase("1")) {
                        finalMorse = finalMorse.concat(n1 + " ");
                    }
                    if (caract.equalsIgnoreCase("2")) {
                        finalMorse = finalMorse.concat(n2 + " ");
                    }
                    if (caract.equalsIgnoreCase("3")) {
                        finalMorse = finalMorse.concat(n3 + " ");
                    }
                    if (caract.equalsIgnoreCase("4")) {
                        finalMorse = finalMorse.concat(n4 + " ");
                    }
                    if (caract.equalsIgnoreCase("5")) {
                        finalMorse = finalMorse.concat(n5 + " ");
                    }
                    if (caract.equalsIgnoreCase("6")) {
                        finalMorse = finalMorse.concat(n6 + " ");
                    }
                    if (caract.equalsIgnoreCase("7")) {
                        finalMorse = finalMorse.concat(n7 + " ");
                    }
                    if (caract.equalsIgnoreCase("8")) {
                        finalMorse = finalMorse.concat(n8 + " ");
                    }
                    if (caract.equalsIgnoreCase("9")) {
                        finalMorse = finalMorse.concat(n9 + " ");
                    }
                    if (caract.equalsIgnoreCase("0")) {
                        finalMorse = finalMorse.concat(n0 + " ");
                    }
                }
                System.out.println("Su texto en Morse es: ");
                System.out.println(finalMorse);
            } //Conversion de Morse-texto
            else {
                if (men.equalsIgnoreCase("M")) {
                  
                int longitudMorse, i = 0;

                System.out.println("Escribe tu frase en Morse: ");
                morse = sc.nextLine(); //Aqui obtendra la frase en Morse para ser convertida

                //Divide por un espacio
                String[] letras = morse.split("\\ ");
                while (i < letras.length) {
                    if (letras[i].equals(lA)) {
                        finalMorse = finalMorse.concat("A");
                    }
                    if (letras[i].equals(lB)) {
                        finalMorse = finalMorse.concat("B");
                    }
                    if (letras[i].equals(lC)) {
                        finalMorse = finalMorse.concat("C");
                    }
                    if (letras[i].equals(lD)) {
                        finalMorse = finalMorse.concat("D");
                    }
                    if (letras[i].equals(lE)) {
                        finalMorse = finalMorse.concat("E");
                    }
                    if (letras[i].equals(lF)) {
                        finalMorse = finalMorse.concat("F");
                    }
                    if (letras[i].equals(lG)) {
                        finalMorse = finalMorse.concat("G");
                    }
                    if (letras[i].equals(lH)) {
                        finalMorse = finalMorse.concat("H");
                    }
                    if (letras[i].equals(lI)) {
                        finalMorse = finalMorse.concat("I");
                    }
                    if (letras[i].equals(lJ)) {
                        finalMorse = finalMorse.concat("J");
                    }
                    if (letras[i].equals(lK)) {
                        finalMorse = finalMorse.concat("K");
                    }
                    if (letras[i].equals(lL)) {
                        finalMorse = finalMorse.concat("L");
                    }
                    if (letras[i].equals(lM)) {
                        finalMorse = finalMorse.concat("M");
                    }
                    if (letras[i].equals(lN)) {
                        finalMorse = finalMorse.concat("N");
                    }
                    if (letras[i].equals(lO)) {
                        finalMorse = finalMorse.concat("O");
                    }
                    if (letras[i].equals(lP)) {
                        finalMorse = finalMorse.concat("P");
                    }
                    if (letras[i].equals(lQ)) {
                        finalMorse = finalMorse.concat("Q");
                    }
                    if (letras[i].equals(lR)) {
                        finalMorse = finalMorse.concat("R");
                    }
                    if (letras[i].equals(lS)) {
                        finalMorse = finalMorse.concat("S");
                    }
                    if (letras[i].equals(lT)) {
                        finalMorse = finalMorse.concat("T");
                    }
                    if (letras[i].equals(lU)) {
                        finalMorse = finalMorse.concat("U");
                    }
                    if (letras[i].equals(lY)) {
                        finalMorse = finalMorse.concat("V");
                    }
                    if (letras[i].equals(lW)) {
                        finalMorse = finalMorse.concat("W");
                    }
                    if (letras[i].equals(lX)) {
                        finalMorse = finalMorse.concat("X");
                    }
                    if (letras[i].equals(ly)) {
                        finalMorse = finalMorse.concat("Y");
                    }
                    if (letras[i].equals(lZ)) {
                        finalMorse = finalMorse.concat("Z");
                    }
                    if (letras[i].equals(n1)) {
                        finalMorse = finalMorse.concat("1");
                    }
                    if (letras[i].equals(n2)) {
                        finalMorse = finalMorse.concat("2");
                    }
                    if (letras[i].equals(n3)) {
                        finalMorse = finalMorse.concat("3");
                    }
                    if (letras[i].equals(n4)) {
                        finalMorse = finalMorse.concat("4");
                    }
                    if (letras[i].equals(n5)) {
                        finalMorse = finalMorse.concat("5");
                    }
                    if (letras[i].equals(n6)) {
                        finalMorse = finalMorse.concat("6");
                    }
                    if (letras[i].equals(n7)) {
                        finalMorse = finalMorse.concat("7");
                    }
                    if (letras[i].equals(n8)) {
                        finalMorse = finalMorse.concat("8");
                    }
                    if (letras[i].equals(n9)) {
                        finalMorse = finalMorse.concat("9");
                    }
                    if (letras[i].equals(n0)) {
                        finalMorse = finalMorse.concat("0");
                    }
                    i++;
                    finalMorse = finalMorse.concat(" ");
                }
                longitudMorse = finalMorse.length();
                String cad, cad2 = "";

                int b = 0;

                for (int j = 0; j < longitudMorse; j++) {
                    cad = finalMorse.charAt(j) + "";

                    if (finalMorse.charAt(j) != ' ') {//Si el caracter es distinto a un espacio
                        cad2 = cad2 + finalMorse.charAt(j);//cadena nueva
                        b = 0;
                    } else {
                        b = b + 1;
                        if (b == 3)//Si los espacios en blanco es igual a tres
                        {
                            cad2 = cad2 + " ";//Agrega un espacio en blanco para separar las palabras      
                        }
                    }
                }
                System.out.println("Su texto es: ");
                System.out.println(cad2);
            }
            }
            System.out.print("¿Deseas traducir otra palabra? (S/N)");
            res = sc.next();

        } while ("S".equals(res));
        System.out.println("Hasta pronto c:");

    }

}
