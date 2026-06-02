public class Main {

    static void primo(int number) {

        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = number - i;

        }
        for (int i = 0; i < array.length; i++) {
            if (number % array[i] == 0) {

            }
        }
    }

    public static void main(String[] args) {

        primo(7);
    }

}