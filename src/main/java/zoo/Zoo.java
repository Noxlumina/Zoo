package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public Zoo() {
    }

    List<Animal> animaux = new ArrayList<Animal>();

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void faireParler() {
        for (Animal item : animaux
        ) {
            item.parler();
        }
    }

}

