package JavaBasics.WhileLoop;

public class Main {
    public static void main(String[] args) {
        int value=10;

        System.out.println("The sum of all values before the limit is: " +sumOf(value));
    }
    public static int sumOf(int value) {
        int valueSum = 0;
        int initValue = 1;
        while(initValue<value) {
            valueSum += initValue;
            initValue++;
        }
        return valueSum;
    }
}
