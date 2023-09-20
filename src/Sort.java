import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Sort {

    public static String SortNames(List<String> names) {

        Collections.sort(names, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < names.size(); i++) {
            if (result.length() > 0) {
                result.append (" ");
            }
            result.append(names.get(i));
        }

        return result.toString().toUpperCase();
    }
}
