package esercitazioneCerchio;

import java.util.Scanner;

public class UsoCerchio {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il raggio del primo cerchio: ");
        double r1 = scanner.nextDouble();
        System.out.print("Inserisci il raggio del secondo cerchio: ");
        double r2 = scanner.nextDouble();
        Cerchio c1 = new Cerchio(r1);
        Cerchio c2 = new Cerchio(r2);
        System.out.println("Cerchio c1:");
        System.out.println("Diametro: " + c1.diametro());
        System.out.println("Perimetro: " + c1.perimetro());
        System.out.println("Area: " + c1.area());
        System.out.println("Cerchio c2:");
        System.out.println("Diametro: " + c2.diametro());
        System.out.println("Perimetro: " + c2.perimetro());
        System.out.println("Area: " + c2.area());
        Cerchio c3 = c1.sommaRaggio(c2);
        System.out.println("Cerchio c3:");
        System.out.println("Diametro: " + c3.diametro());
        System.out.println("Perimetro: " + c3.perimetro());
        System.out.println("Area: " + c3.area());
    }
}
