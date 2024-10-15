import OOP.Main;
import main_subprogram.demo1;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 主程序-子程序");
        System.out.println("2. 面向对象");
        System.out.println("3. 事件系统");
        System.out.println("4. 管道-过滤");
        System.out.println("请选择文件处理方式：");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // 调用主程序-子程序处理方式
                demo1 kwic = new demo1();
                kwic.run();
                break;
            case 2:
                // 调用面向对象处理方式
                Main main = new Main();
                main.run();
                break;
            case 3:
                // 调用事件系统处理方式
                event.Main main1 = new event.Main();
                main1.run();
                break;
            case 4:
                // 调用管道-过滤处理方式
                pipe.Main main2 = new pipe.Main();
                main2.run();
                break;
            default:
                System.out.println("无效的选择，请输入1-4");
                break;
        }
        scanner.close();
    }
}
