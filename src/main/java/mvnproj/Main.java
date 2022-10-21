package mvnproj;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileServiceImpl();
        fileService.printAll("C:\\Users\\SAZay\\IdeaProjects\\FirstMavenProject\\src\\main\\resources\\example.txt");
    }
}
