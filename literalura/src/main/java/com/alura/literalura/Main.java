/*
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        String json = "{\n" +
                "    \"id\": 844,\n" +
                "    \"title\": \"The Importance of Being Earnest: A Trivial Comedy for Serious People\",\n" +
                "    \"authors\": [\n" +
                "        {\n" +
                "            \"name\": \"Wilde, Oscar\",\n" +
                "            \"birth_year\": 1854,\n" +
                "            \"death_year\": 1900\n" +
                "        }\n" +
                "    ],\n" +
                "    \"subjects\": [\n" +
                "        \"Comedies\",\n" +
                "        \"England -- Drama\",\n" +
                "        \"Foundlings -- Drama\",\n" +
                "        \"Identity (Psychology) -- Drama\"\n" +
                "    ],\n" +
                "    \"bookshelves\": [\n" +
                "        \"Plays\"\n" +
                "    ],\n" +
                "    \"languages\": [\n" +
                "        \"en\"\n" +
                "    ],\n" +
                "    \"copyright\": false,\n" +
                "    \"media_type\": \"Text\",\n" +
                "    \"download_count\": 29597\n" +
                "}";

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        // Obtener los valores de los campos
        int id = jsonObject.get("id").getAsInt();
        String title = jsonObject.get("title").getAsString();
        String mediaType = jsonObject.get("media_type").getAsString();
        int downloadCount = jsonObject.get("download_count").getAsInt();

        System.out.println("ID: " + id);
        System.out.println("Título: " + title);
        System.out.println("Tipo de medio: " + mediaType);
        System.out.println("Número de descargas: " + downloadCount);
    }
}
*/
