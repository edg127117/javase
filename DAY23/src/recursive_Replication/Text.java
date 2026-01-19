package recursive_Replication;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Text {
    public static void main(String[] args) {
        copyDir(new File("F:/aa"), new File("F:/ab"));
    }
        public static void copyDir (File srcDir, File destDir){
            destDir.mkdirs();
            File[] files = srcDir.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    copyFile(file, new File(destDir, file.getName()));
                } else {
                    copyDir(file, new File(destDir, file.getName()));
                }
            }
        }

        public static void copyFile (File srcFile, File destFile){
            try (
                    FileReader reader = new FileReader(srcFile);
                    FileWriter writer = new FileWriter(destFile);
            ) {
                reader.transferTo(writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}