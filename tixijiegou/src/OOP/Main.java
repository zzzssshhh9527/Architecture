package OOP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public void run() {
        Input input = new Input();
        input.input("C:\\Users\\26384\\Documents\\javacode\\tixijiegou\\src\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("C:\\Users\\26384\\Documents\\javacode\\tixijiegou\\src\\output.txt");

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
        System.out.println("面向对象体系结构（Object-Oriented Architecture, OOA）是一种软件设计的范式，它基于“对象”的概念，将数据和处理数据的方法封装在对象中。\n这种体系结构风格强调了数据和操作数据的方法之间的紧密联系，以及对象之间的交互。");
    }
}
