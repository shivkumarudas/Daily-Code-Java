public class pro_bitset {
    public static void main(String[] args) {
        int num = 5; // Binary: 0101
        int position = 1;
        
        // Set bit at position
        int setBit = num | (1 << position);
        System.out.println("Set bit at position " + position + ": " + setBit);
        
        // Clear bit at position
        int clearBit = num & ~(1 << position);
        System.out.println("Clear bit at position " + position + ": " + clearBit);
        
        // Toggle bit at position
        int toggleBit = num ^ (1 << position);
        System.out.println("Toggle bit at position " + position + ": " + toggleBit);
    }
}
