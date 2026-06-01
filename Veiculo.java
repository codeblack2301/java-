public abstract class Veiculo {

    double velocidade = 20.00;

    @Override
    abstract void ir(){
        System.out.println("o veiculo andou");
    }

}
