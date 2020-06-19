import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<String> stringList = Arrays.asList("Kot", "Lu", "Lew", "Nowak", "Kowalczyk", "Miłosz", "Hinz", "Dalton", "Gaduła", "Pako", "Gruszkowski");
MethodsForStringList methodsForStringList = new MethodsForStringList();

        System.out.println(methodsForStringList.namesWith4LessThanLetters(stringList).toString());

    }
}
