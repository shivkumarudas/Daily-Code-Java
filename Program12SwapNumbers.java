class Program12SwapNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 30;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
