package exercice03;

public class Product {
    private String Id, Nom;
    public Product(String Nom , String Id){
        this.Id = Id;
        this.Nom = Nom;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }
}
