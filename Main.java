
/*uma thread é uma linha de execuçao dentro do programa
main é uma thread
*/
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MinhaThread t = new MinhaThread(i);
            MinhaThread t2 = new MinhaThread(i);
            t.start();

            t2.join();

            System.out.println("thread terminada");

        }

    }

}
