public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Bicicleta bike = new Bicicleta();

        bike.parar();
        carro.ir();

        System.out.println(bike.velocidade);
        System.out.println(carro.velocidade);

        System.out.println(carro.wheels);
        System.out.println(bike.pedals);
    }

}
