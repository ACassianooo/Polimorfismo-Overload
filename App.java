package app;

public class App {
    public static void main(String[] args) {

        Personagem personagem = new Personagem(1212 , "Cassiano", 100);

        System.out.println(personagem);
        personagem.receberGolpe(2);
        System.out.println(personagem);
        personagem.receberGolpe('m', 2);
        System.out.println(personagem);

        personagem.receberGolpe('M', 2);
        System.out.println(personagem);

        personagem.receberGolpe('E', 2);
        System.out.println(personagem);



    }
}
