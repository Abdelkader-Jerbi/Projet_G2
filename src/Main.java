
public class Main {
     public static void main(String[] args) {
        // Test de la méthode calculerPuissance
        int base = 2;
	int base3 = 3;
        int exposant = 3;
        System.out.println(base + " puissance " + exposant + " = " + Abdelkader_Jerbi.calculerPuissance(base, exposant));

        // Test de la méthode calculerPGCD
        int nombre1 = 56;
        int nombre2 = 98;
        System.out.println("PGCD de " + nombre1 + " et " + nombre2 + " = " + Abdelkader_Jerbi.calculerPGCD(nombre1, nombre2));
         int[] tableau = {5, 10, 15, 20, 25};

         int somme = Arwa_Dridi.calculerSomme(tableau);
         double moyenne = Arwa_Dridi.calculerMoyenne(tableau);

         // Affichage des résultats
         System.out.println("Somme du tableau : " + somme);
         System.out.println("Moyenne du tableau : " + moyenne);

     }

}
