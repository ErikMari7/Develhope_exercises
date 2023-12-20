package JavaBasics.EvenAndOdd;

public class Main {
    public static void main(String[] args) {
        int number = 47;

        System.out.println("The number is even : " + operation1(number));
        System.out.println("The number is odd : " + operation2(number));
    }
    public static boolean operation1 (int number) {
        boolean isEven = number % 2 == 0;
        return isEven;
    }
    public static boolean operation2 (int number) {
        boolean isOdd = number % 2 != 0;
        return isOdd;
    }
}

