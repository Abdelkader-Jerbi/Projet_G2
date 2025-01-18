public class mohamedchneni{
    public int[] tab= new int[4];
    public int somme_tableau() {
       int s=0;
        for (int i = 0 ; i < tab.length ; i++){
          s+=tab[i];
        }
        return s;
    }
    public float moyenne_tableau() {
        int x = somme_tableau();
        return x / tab.length;
    }
    public int factorial(int n) {
        int s =0;
        for (int i = 1 ; i < n ; i++){
            s*=i;
        }
    return s;
    }
//* ajout methode 