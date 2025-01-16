
public class Main {
     public static void main(String[] args) {
        // Test de la méthode calculerPuissance
        int base = 2;
	int base2 = 2;
        int exposant = 3;
        System.out.println(base + " puissance " + exposant + " = " + calculerPuissance(base, exposant));

        // Test de la méthode calculerPGCD
        int nombre1 = 56;
        int nombre2 = 98;
        System.out.println("PGCD de " + nombre1 + " et " + nombre2 + " = " + calculerPGCD(nombre1, nombre2));

        // Test de la méthode somme
         int[] tableaux = {1, 2, 3, 4, 5};
        int somme = utils.calculerSomme(tableaux);
        System.out.println("La somme du tableau est : " + somme);
    }
}
