import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

    public class URLShortener {

        static HashMap<String, String> urlMap = new HashMap<>();

        public static String shortenURL(String longURL) {
            String shortCode = UUID.randomUUID().toString().substring(0, 6);
            urlMap.put(shortCode, longURL);
            return shortCode;
        }

        public static String getOriginalURL(String shortCode) {
            return urlMap.get(shortCode);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("=== Java URL Shortener ===");
            System.out.print("Enter Long URL: ");
            String longURL = sc.nextLine();

            String shortCode = shortenURL(longURL);
            System.out.println("Short URL Code: " + shortCode);

            System.out.print("Enter Short Code to get Original URL: ");
            String inputCode = sc.nextLine();

            String originalURL = getOriginalURL(inputCode);

            if (originalURL != null) {
                System.out.println("Original URL: " + originalURL);
            } else {
                System.out.println("Invalid Short Code!");
            }
        }
    }
}
