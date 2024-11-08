package cn.hlz.iojcodesandbox.unsafe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @ClassName: ReadFileError
 * @Description: 读取服务器文件(文件信息泄露)
 * @Author: 橘子皮
 * @Date: 2024-11-05 13:50
 * @Version: 1.0
 **/
public class ReadFileError {
    public static void main(String[] args) throws InterruptedException, IOException {
        String userDir = System.getProperty("user.dir");
        String filePath = userDir + File.separator + "src/main/resources/application.yml";
        List<String> allLines = Files.readAllLines(Paths.get(filePath));
        System.out.println(String.join("\n", allLines));
    }
}
