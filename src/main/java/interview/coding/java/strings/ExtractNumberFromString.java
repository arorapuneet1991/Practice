package interview.coding.java.strings;

public class ExtractNumberFromString {
    public static void main(String[] args) {
        String str="st123a";
        System.out.println(str.replaceAll("[^\\d]",""));
    }
}
