package interview.coding.java.strings;

public class ExtractFirstLettersOfEachWord {
    public static void main(String[] args) {
        String str = "Boy is Good".trim();
        String[] arr = str.split(" ");
        StringBuffer strBuf = new StringBuffer();
        for (String thisString : arr) {
            strBuf.append(thisString.charAt(0));
        }

        System.out.println(strBuf);
    }
}
