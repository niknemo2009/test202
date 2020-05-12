package Lesson0505;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example1 {


    public static void main(String[] args) {
      Example1 ex=new Example1();
      String qwe=" int var=36;";
      //qwe.split()
     // ex.calculateWords("C:\\Users\\BigBoss\\IdeaProjects\\test202\\res\\1.java");
        ex.calculateWords("1.java");
    }
    void calculateWords(String pathFile){
       // System.out.println(Paths.);
        Path path = Paths.get(pathFile);
        Path filePath = Paths.get(getUsersProjectRootDirectory(),"res", "1.java");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(q-> System.out.println(q));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public String getUsersProjectRootDirectory() {
        String envRootDir = System.getProperty("user.dir");
        Path rootDIr = Paths.get(".").normalize().toAbsolutePath();
        if (rootDIr.toString().startsWith(envRootDir) ) {
            return rootDIr.toString();
        } else {
            throw new RuntimeException("Root dir not found in user directory.");
        }

    }

    int sum(int ... elements){
      return Arrays.stream(elements).sum();
    }
}

