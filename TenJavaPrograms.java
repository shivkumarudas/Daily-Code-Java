import java.util.Arrays;

class Program01HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class Program02AddTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

class Program03EvenOrOdd {
    public static void main(String[] args) {
        int number = 17;
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}

class Program04Factorial {
    public static void main(String[] args) {
        int n = 5;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}

class Program05Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class Program06PrimeCheck {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = n > 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}

class Program07PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not a Palindrome");
        }
    }
}

class Program08ReverseString {
    public static void main(String[] args) {
        String text = "Java";
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}

class Program09LargestInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 19, 3};
        int max = arr[0];

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Largest number = " + max);
    }
}

class Program10AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
