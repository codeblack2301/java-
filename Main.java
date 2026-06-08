import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("you have 5 seconds to enter your name ");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();

        System.out.println("enter your name: ");
        String name = scanner.nextLine();
        System.out.println("hello " + name);

    }

}
