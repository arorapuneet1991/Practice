package interview.coding.java.strings;

public class CountUpperCaseCharacters {
    public static void main(String[] args) {
        String str = "WelcomE";

        int low=0;
        for (int i = 0; i < str.length(); i++) {
            int x=str.charAt(i);
            if(x>65&& x<90){
                low++;
            }
        }
        System.out.println(low);
    }
}
