final class ImmutableString {
    private final String value;
    
    public ImmutableString(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return "ImmutableString(" + value + ")";
    }
}

public class pro_immutablestring {
    public static void main(String[] args) {
        ImmutableString str = new ImmutableString("Hello");
        System.out.println(str);
        
        // Once created, the value cannot be changed
        System.out.println("Value: " + str.getValue());
    }
}
