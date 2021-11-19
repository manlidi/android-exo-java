package src;


public class Mangue extends Fruit implements fruits{

    public Mangue(String nom, String couleur) {
        super(nom, couleur);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void service() {
        System.out.println("Je donne la croissance à l'homme");
    }
    
}
