import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodsForStringList {
    List<String> listWithResult = new ArrayList<>();

    @Override
    public String toString() {
        return "MethodsForStringList [" +
                " ; " + listWithResult +
                ']';
    }

    public List<String> namesWith4LessThanLetters(List<String> list) {

        for (String s : list) {
            Optional<String> string = Optional.of(s);

            string.filter(((name) -> name.length() <= 4))
                    .ifPresent((name4Letters) -> listWithResult.add(name4Letters));

        }
        return listWithResult;

    }


    public List<String> onlyBNames(List<String> list) {

        for (String s : list) {
            Optional<String> string = Optional.of(s);

            string.filter((bNames -> bNames.startsWith("B")))
                    .ifPresent((bnameOnly -> listWithResult.add(bnameOnly)));

        }

        return listWithResult;
    }
}
