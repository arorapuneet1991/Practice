package interview.coding.java.exception;

public class TryReturn {
    public static void main(String[] args) {
        TryReturn tryReturn = new TryReturn();
        System.out.println(tryReturn.method());
    }

    public int method() {

        try {
            return 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            return 2;
        }
    }
}
