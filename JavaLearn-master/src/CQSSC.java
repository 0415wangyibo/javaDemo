import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by 71579 on 2018/5/12.
 */
public class CQSSC {
    public static void main(String[] args) {
        getData();
    }

    @Test
    public void json_test() {
//        String str = "{\"state\":200,\"items\":[{\"date\":\"2018-05-11\",\"time\":\"23:50\",\"period\":\"118\",\"result\":\"0,2,6,9,7\"},{\"date\":\"2018-05-11\",\"time\":\"23:45\",\"period\":\"117\",\"result\":\"1,3,9,4,2\"}],\"error\":null}";
        String str = getData();
        JsonParser parser = new JsonParser();
        JsonObject itemsJson = (JsonObject) parser.parse(str);
        JsonArray items = itemsJson.getAsJsonArray("items");
        for (int i = 0; i < items.size(); i++) {
            JsonObject item = items.get(i).getAsJsonObject();
            System.out.println(item.get("date") + " " + item.get("time") + " " + item.get("period") + " " + item.get("result"));
        }
    }

    private static String getData() {
        String url = "https://mo.1394x.com/ssc/History?version=3000&timestamp=0";
        String result = null;
        String line;
        StringBuilder sb = new StringBuilder();
        BufferedReader in;
        try {
            URL readUrl = new URL(url);
            URLConnection connection = readUrl.openConnection();
            connection.connect();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            result = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
