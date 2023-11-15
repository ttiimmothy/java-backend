package ca.openricecan;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class SupabaseConnection {
  public static void main(String[] args) throws Exception {
    HttpClient httpClient = HttpClients.createDefault();
    HttpGet request = new HttpGet("https://wrkhhfygmoqlkgfslzza.supabase.co/rest/v1/users");

    // Set Supabase API key in the request headers
    request.setHeader("apikey", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Indya2hoZnlnbW9xbGtnZnNsenphIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTY0Njc1NTIsImV4cCI6MjAxMjA0MzU1Mn0.BMgV5u1mhE4zFPPYnhJyIed1uzh0rIJ6YlX6EtHML0I");
    request.setHeader("Authorization", "Bearer SUPABASE_KEY");

    HttpResponse response = httpClient.execute(request);
    String jsonResponse = EntityUtils.toString(((HttpResponse) response).getEntity());

    // Process the JSON response
    System.out.println(jsonResponse);
  }
}
