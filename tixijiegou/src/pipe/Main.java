package pipe;

import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public void run() throws IOException {

        File inFile = new File("C:\\Users\\26384\\Documents\\javacode\\tixijiegou\\src\\input.txt");
        File outFile = new File("C:\\Users\\26384\\Documents\\javacode\\tixijiegou\\src\\output.txt");
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile, pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

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
        System.out.println("管道-过滤（Pipe-Filter）架构是一种软件体系结构风格，它将系统分解为一系列处理数据流的独立组件。\n这种架构风格特别适合于处理连续的、稳定的数据流，例如在图像处理、信号处理和文本处理等领域的应用。");
    }
}
