public class Arwa_Dridi {
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }
    public static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) {
            throw new IllegalArgumentException("Le tableau ne doit pas être vide.");
        }
        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }
}
