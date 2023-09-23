import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static List<String> SortNames(List<String> names) {

        List<String> result = names.stream()
                        .map(String::toUpperCase)
                        .sorted((word1, word2) -> word2.compareTo(word1))
                        .collect(Collectors.toList());
        return result;
    }
}
