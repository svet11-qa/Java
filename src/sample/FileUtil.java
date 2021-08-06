package sample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

    /*public String CurrentFolder(){
        Path currentPath = Paths.get("");
        String Folder = currentPath.toAbsolutePath().toString();
        System.out.println("Current Path is: " + Folder);
        return Folder;
    }*/

    static Path currentPath =Paths.get("");
    public static String FilePath = currentPath.toAbsolutePath().toString()+"\\CV.txt";


}
