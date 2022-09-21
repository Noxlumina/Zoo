import zoo.*;

public class Main {
    public static void main(String[] args) {
        Animal chien = new Chien("chien");
        Animal chat = new Chat("chat");
        Animal oiseau = new Oiseau("oiseau");
        oiseau.parler();
        chien.parler();
        chat.parler();
        Zoo zoo = new Zoo();
        zoo.ajouterAnimal(chien);
        zoo.ajouterAnimal(chat);
        zoo.ajouterAnimal(oiseau);
        zoo.faireParler();
    }
}
