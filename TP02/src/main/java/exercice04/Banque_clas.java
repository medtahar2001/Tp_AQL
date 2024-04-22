package exercice04;

public class Banque_clas implements Banque
{
    private int fond;
    private final int fondMinimum;

    public Banque_clas(int fondInitial, int fondMinimum) {
        this.fond = fondInitial;
        this.fondMinimum = fondMinimum;
    }

    @Override
    public void crediter(int somme) {
        fond += somme;
    }
    @Override
    public void debiter(int somme) {
        fond -= somme;
    }
    @Override
    public boolean est_solvable() {
        return fond >= fondMinimum;
    }


}
