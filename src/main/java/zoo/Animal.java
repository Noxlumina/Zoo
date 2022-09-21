package zoo;

public abstract class Animal {
    public Animal(String nom) {
        this.nom = nom;
    }

    protected String nom;

    public abstract void parler();
}

