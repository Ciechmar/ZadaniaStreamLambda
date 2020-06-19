import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MethodsForStringListTest {

    private List<String> list;
    private MethodsForStringList methodsForStringList;

    @BeforeEach
    void setUp() {
        list = Arrays.asList("A", "Lu", "Kot", "Kote", "Kotek", "BardzoDługiKotek", "12345", "BoMusiBycNaB");
        methodsForStringList = new MethodsForStringList();

    }

    @Test
    void namesWith4LessThanLetters() {
        System.out.println("4 literowe nazwiska: ");
        for (String s : methodsForStringList.namesWith4LessThanLetters(list)) {
            System.out.println(s);
            assertTrue(s.length() <= 4);
        }
    }

    @Test
    void onlyBNames(){
        System.out.println("Imiona na B:");
        for (String s : methodsForStringList.onlyBNames(list)) {
            System.out.println(s);
            assertTrue(s.startsWith("B"));
        }
    }
}