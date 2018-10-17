package cuboobjetos;

import java.util.Scanner;

public class Main {

    static figCubo cubo;//Objeto de la Clase Cubo
    static double current;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        init();

        loop();

        scanner.nextLine();

    }

    private static void loop() {

        int opt = get_menu();

        while (opt != 5) {
            current = calculate(opt, cubo);

            System.out.println("El valor es " + current + "\n"); //Esta sera la salida.

            opt = get_menu();
        }

        init();
        loop();
    }

    private static void init() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la medida del lado:\t");
        try {
            double lado = Double.parseDouble(scanner.nextLine());
            cubo = new figCubo(lado);
        } catch (NumberFormatException nfe) {
            System.out.println("ERROR:El valor ingresado debe de ser un numero.");
            init();
        }
        //En este metodo se ingresara el dato para ser evaluado si es un numero entero.
    }

    public static double calculate(int opt, figCubo cubo) {

        double result = 0;
        switch (opt) {
            case 1:
                result = cubo.calcularPerimetro(true);
                break;
            case 2:
                result = cubo.calcularArea();
                break;
            case 3:
                result = cubo.calcularVolumen();
                break;
            case 4:
                result = cubo.calcularPerimetro(false);
                break;
            case 5:
                init();
                break;
            case 6:
                System.out.println("Hasta la vista baby :) ");
                System.exit(0);
                break;

        }
        return result;
    }

    public static int get_menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione el calculo que desea realizar:\n");
        System.out.print("1: Perímetro cuadrado \n");
        System.out.print("2: calcular área\n");
        System.out.print("3: calcular Volúmen\n");
        System.out.print("4: calcular Perímetro cubo\n");
        System.out.print("5: Ingresar otro valor. \n");
        System.out.print("6: Cerrar \n");

        int opt = Integer.parseInt(scanner.nextLine());
        return opt;
    }

}
