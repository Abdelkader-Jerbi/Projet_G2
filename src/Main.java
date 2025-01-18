
public class Main {
     public static void main(String[] args) {
        // Test de la méthode calculerPuissance
        int value=123;
        int base = 2;
        int exposant = 3;
        System.out.println(base + " puissance " + exposant + " = " + calculerPuissance(base, exposant));

        // Test de la méthode calculerPGCD
        int nombre1 = 56;
        int nombre2 = 98;
        System.out.println("PGCD de " + nombre1 + " et " + nombre2 + " = " + calculerPGCD(nombre1, nombre2));
    }
}
