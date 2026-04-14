package selfLearning.Serializing;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/oilerplatecode/Projects/IdeaProjects/learning/java-foundation-exam-prep/java-foundation-exam-prep/src/selfLearning/Serializing/";
        User user = new User("Mphendvulo Ginidza", 31);
        Jsonwritter.saveUserToJson(user,  "user.json");
    }
}
