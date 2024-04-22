package exercice04;


public interface Jeu_Int {




    public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException;


    public void fermer();


    public boolean estOuvert();
}