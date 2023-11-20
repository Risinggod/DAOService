package daoservice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import de.sbs.jsonhelper.JSONHelper;

public class DAOHttpService {
    
    public static String useService( String URL) {
        try {
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                return response.toString();

            }
        } catch (Exception e) {
            System.out.println("Connection coudend be build");
        }
        return null;
    }
    public static String getJSONOffline() {
        return JSONHelper.getJSONOffline();
    
    }

}
