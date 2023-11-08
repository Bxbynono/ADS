package PackageDemo.com.mycompany.util;

public class StringUtil {

    public static String reverseString(String input) {

        return new StringBuilder(input).reverse().toString();
    }
}
