package interview.coding.java.strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="Namap";

        for(int i=0;i<str.length();i++){
            if(!(str.toLowerCase().charAt(i)==str.toLowerCase().charAt(str.length()-1-i))){
                System.out.println("Not pal");
                break;
            }
        }
    }
}
