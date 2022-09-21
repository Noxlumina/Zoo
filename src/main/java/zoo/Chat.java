package zoo;

public class Chat extends  Animal{
    public Chat(String nom) {
        super(nom);
    }


    @Override
    public void parler() {
        System.out.println("le chat miaule");
    }
}
