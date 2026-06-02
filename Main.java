public class Main {

    public static void main(String[] args) {

        Folha folha1 = new Folha("naruto", "s");
        Folha folha2 = new Folha("sasuke", "s");

        Shinobi folha[] = { folha1, folha2 };

        // String[] folha = new String[3];

        for (Shinobi x : folha) {
            System.out.println(x.jutsu());
        }

    }
}