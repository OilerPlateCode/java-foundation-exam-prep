package selfLearning.Serializing;
import java.io.FileWriter;
import java.io.IOException;

public class Jsonwritter {
    public static void saveUserToJson(User user, String filePath) throws IOException {
        String json = """
                {
                name: "%s",
                age: %d
                }
                """.formatted(user.getName(), user.getAge());

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(json);
        }
    }
}
