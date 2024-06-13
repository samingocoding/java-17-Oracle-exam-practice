package exceptions_and_localization.exceptions;

import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) throws IOException {
        try{
            throw new Exception();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}
