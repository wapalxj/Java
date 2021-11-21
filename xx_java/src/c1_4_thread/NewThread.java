package c1_4_thread;

public class NewThread {
    public static void main(String[] args) {
        new UseThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable--run");
            }
        }).start();
    }

    private static class UseThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("UserThread--run");
        }

        public UseThread(Runnable target) {
            super(target);
        }
    }
}
