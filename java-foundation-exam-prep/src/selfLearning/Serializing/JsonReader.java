package selfLearning.Serializing;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonReader {
    public static User readUserFromJson(String filePath) throws IOException {
        String json = Files.readString(Path.of(filePath));

        String name = extractString(json, "name");
        int age = Integer.parseInt(extractNumber(json, "age"));

        return new User(name, age);
    }

    private static String extractString(String json, String key) {

    }

    private static String extractNumber(String json, String key) {

    }

}
