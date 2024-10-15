package event;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public void run() {

        //创建主题
        event.KWICSubject kwicSubject = new event.KWICSubject();
        //创建观察者
        Input input = new Input("C:\\Users\\26384\\Documents\\javacode\\tixijiegou\\src\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output = new Output(alphabetizer.getKwicList(), "C:\\Users\\26384\\Documents\\javacode\\tixijiegou\\src\\output.txt");

        // 将观察者加入主题
        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);
        // 逐步调用各个观察者
        kwicSubject.startKWIC();

        //输出结果
        System.out.println("处理后：");
        String filePath = "C:\\Users\\26384\\Documents\\javacode\\tixijiegou\\src\\output.txt";
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //简单介绍
        System.out.println("简单介绍：");
        System.out.println("事件系统体系结构（Event-Driven Architecture, EDA）是一种软件架构风格，它以事件的产生、检测、消费和反应为核心。\n这种架构风格特别适用于需要高度灵活性、可扩展性和响应性的系统。");
    }
}
