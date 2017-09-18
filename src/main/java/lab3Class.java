import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class lab3Class {
    public static void main(final String[] args) {
        //System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
    int length = urlToString("http://erdani.com/tdpl/hamlet.txt").length();
    String content = urlToString("http://erdani.com/tdpl/hamlet.txt");

    String[] array = content.split(" ");
    System.out.println(array.length);


}


/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }

    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;

    }
}