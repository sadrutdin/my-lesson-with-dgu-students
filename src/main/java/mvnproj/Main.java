package mvnproj;

public class Main {
    public static void main(String[] args) {
        System.out.println("Старт приложения");
        FileService fileService = new FileServiceImpl();
        fileService.printAll("C:\\Users\\SAZay\\IdeaProjects\\FirstMavenProject\\src\\main\\resources\\example.txt");
        System.out.println("Конец работы приложения...");
    }
}
