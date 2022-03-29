import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class exceptionTests {

    @Test
    void testException() {
        int i = 12;
        int j = 2;

        try{
            int result = i / (j-2);
            System.out.println(result);
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Application proceeds");
    }

    @Test
    void readFile() {

    }
}
