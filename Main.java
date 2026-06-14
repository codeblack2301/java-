
/*acessar um index n existente em um array
divisao por zero
acessar um arquivo inesistente
entrada de dados invalida
*/
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, 200.0, "rafael");

        try {
            cliente.Sacar(201.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("saldo atual: " + cliente.saldo);

    }
}