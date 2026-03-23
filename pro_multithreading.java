public class pro_multithreading {
    static class PrintNumbers implements Runnable {
        private String name;
        
        PrintNumbers(String name) {
            this.name = name;
        }
        
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumbers("Thread-1"));
        Thread thread2 = new Thread(new PrintNumbers("Thread-2"));
        
        thread1.start();
        thread2.start();
    }
}
