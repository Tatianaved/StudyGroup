import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем учебные группы
        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");

        // Создаем потоки и добавляем в них группы
        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group3);

        Stream stream3 = new Stream();
        stream3.addGroup(group1);
        stream3.addGroup(group2);
        stream3.addGroup(group3);

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Создаем сервис и контроллер
        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        // Сортируем и выводим список потоков до и после сортировки
        System.out.println("Before sorting:");
        for (Stream stream : streams) {
            System.out.println(stream);
        }

        controller.sortStreams(streams);

        System.out.println("\nAfter sorting:");
        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }
}
