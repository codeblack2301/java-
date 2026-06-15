class MinhaThread extends Thread {

    private int number;

    public MinhaThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(this.number + "thread: " + i);
            if (number == 2) {
                throw new RuntimeException();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());

            }
        }

    }
}
