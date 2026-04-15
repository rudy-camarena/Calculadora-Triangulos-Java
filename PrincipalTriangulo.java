package ejercicio.triangulo;

import java.util.Scanner;

public class PrincipalTriangulo {

    public static double mayorArea(TrianguloIsosceles triangulos []){
        double area;

        area  = triangulos[0].getArea();
        for (int i=1; i<triangulos.length;i++){
            if(triangulos[i].getArea()>area){
                area = triangulos[i].getArea();
            }
        }
        return area;

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int numeroTriangulos;

        System.out.println("Digita el número de triángulos: ");
        numeroTriangulos = entrada.nextInt();

        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[numeroTriangulos];

        for (int i=0; i<triangulos.length; i++){
            System.out.println("\nDigita los valores para el triángulo: " + (i+1));
            System.out.println("Introduzca la Base: ");
            base = entrada.nextDouble();
            System.out.println("Introduzca el lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new TrianguloIsosceles(base, lado);

            System.out.print("El perímetro del triángulo es: ");
            System.out.printf("%.2f", triangulos[i].getPerimetro());

            System.out.print("\nEl área del triángulo es: ");
            System.out.printf("%.2f", triangulos[i].getArea());
            System.out.println();
        }

        System.out.printf("%nEl área del triángulo de mayor superficie es: %.2f%n", mayorArea(triangulos));


    }
}
