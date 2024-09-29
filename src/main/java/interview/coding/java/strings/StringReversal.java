package interview.coding.java.strings;

public class StringReversal {
    // IMP - conversion of char array to string - using string constructor
    public static void main(String[] args) {
        String str = "Puneet";
        char[] strChar = str.toCharArray();

        char temp;
        for (int i = 0; i < strChar.length / 2; i++) {
            temp = strChar[i];
            strChar[i] = strChar[strChar.length - 1 - i];
            strChar[strChar.length - 1 - i] = temp;
        }


        System.out.println(new String(strChar));
    }
}
