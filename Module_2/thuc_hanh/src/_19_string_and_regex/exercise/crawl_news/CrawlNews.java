package _19_string_and_regex.exercise.crawl_news;

import javax.swing.text.Document;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
// close scanner
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("news-item news-item--left2right news-item--category-highlight\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();s
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
