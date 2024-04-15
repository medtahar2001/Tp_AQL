package exercice_02Et_03;

public class Utilisateur {
    public String Nom,Prenom,Email;
    public  int Id;



    public Utilisateur(String Nom,String Prenom,String Email){
     this.Nom=Nom;
     this.Prenom=Prenom;
     this.Email=Email;

    }
    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getEmail() {
        return Email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
