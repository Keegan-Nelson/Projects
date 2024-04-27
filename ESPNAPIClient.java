import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ESPNAPIClient {
    public static void main(String[] args) {
        try {
            // Replace 'YOUR_ESPN_API_ENDPOINT' with the actual ESPN API endpoint URL
            String apiUrl = "http://site.api.espn.com/apis/site/v2/sports/football/college-football/news"; 

            // Create a URL object with the ESPN API endpoint
            URL url = new URL(apiUrl);

            // Open a connection to the URL using HttpURLConnection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method to GET
            connection.setRequestMethod("GET");

            // Set API key or any required headers or authentication tokens if necessary
            // connection.setRequestProperty("Authorization", "Bearer YOUR_API_KEY");

            // Get the response code from the server
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Reading response from the API
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuffer response = new StringBuffer();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Print API response
                System.out.println("API Response:");
                System.out.println(response.toString());
            } else {
                System.out.println("Error: Failed to fetch data from the API.");
            }

            // Close the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}