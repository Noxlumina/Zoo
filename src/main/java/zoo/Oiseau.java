package zoo;

public class Oiseau extends  Animal{
    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println("l'oiseau chante");
    }
}
