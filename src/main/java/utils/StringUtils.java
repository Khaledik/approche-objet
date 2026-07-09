package utils;

public class StringUtils {

    public static String append(Object... objects) {
        StringBuilder sb = new StringBuilder();

        for (Object object : objects) {
            sb.append(object);
        }
        return sb.toString();
    }
}
