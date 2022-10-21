package mvnproj;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileServiceImpl implements FileService {
    @Override
    public void printAll(String path) {
        File file = new File("C:\\Users\\SAZay\\IdeaProjects\\FirstMavenProject\\src\\main\\resources\\example.txt");
        try {
            List<String> list = FileUtils.readLines(file, StandardCharsets.UTF_8);
            list.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
