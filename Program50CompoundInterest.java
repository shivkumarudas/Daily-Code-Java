public class Program50CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 8;
        int time = 2;

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Final Amount: " + amount);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
