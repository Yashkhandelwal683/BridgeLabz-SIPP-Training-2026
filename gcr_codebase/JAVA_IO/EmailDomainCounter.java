import java.io.*;
import java.util.HashMap;

public class EmailDomainCounter {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(
                        new FileReader("emails.txt"));

        HashMap<String, Integer> map =
                new HashMap<>();

        String line;

        while ((line = br.readLine()) != null) {

            String domain =
                    line.substring(line.indexOf("@") + 1);

            map.put(domain,
                    map.getOrDefault(domain, 0) + 1);
        }

        br.close();

        for (String key : map.keySet()) {
            System.out.println(
                    key + " -> " + map.get(key));
        }
    }
}