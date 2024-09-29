package interview.coding.java.recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
        FactorialRecursion fact = new FactorialRecursion();
        System.out.println(fact.getRecursion(6));
    }

    public int getRecursion(int value) {
        if (value > 1) {
            value = value * getRecursion(value - 1);
        }
        return value;
    }
}
