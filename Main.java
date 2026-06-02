public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Bicicleta bike = new Bicicleta();
        Boat boat = new Boat();

        Veiculo[] racers = { carro, bike, boat };

        for (Veiculo x : racers) {
            x.go();
        }

    }

}
