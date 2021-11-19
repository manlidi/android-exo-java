package src;

public abstract class Fruit {
    protected String nom;
    protected String couleur;

    public Fruit(String nom, String couleur){
        this.nom = nom;
        this.couleur = couleur;
    }
    public String getNom(){
        return this.nom;
    }
    public String getCouleur(){
        return this.couleur;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setCouleur(String couleur){
        this.couleur = couleur;
    }

    public abstract void service();
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mon nom est "+this.getNom()+" et j'ai la couleur "+this.getCouleur();
    }
}

