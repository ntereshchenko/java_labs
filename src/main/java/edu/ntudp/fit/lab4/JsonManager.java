package edu.ntudp.fit.lab4;
import com.google.gson.Gson;
import edu.ntudp.fit.lab4.models.University;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class JsonManager {
    public String convertObjectToJson(University university) {
        Gson gson = new Gson();
        return gson.toJson(university);
    }

    public University convertJsonToObject(String universityJson) {
        Gson gson = new Gson();
        return gson.fromJson(universityJson, University.class);
    }

   public void writeTextToFile(String text) throws IOException {
       FileWriter newFile = new FileWriter("oldUniversity.json");
        newFile.write(text);
        newFile.close();
   }

    public String readTextFromFile() throws IOException {
       return new String(Files.readAllBytes(Paths.get("oldUniversity.json")));
    }
}
