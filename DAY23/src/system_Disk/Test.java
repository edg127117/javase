package system_Disk;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File[] disks= File.listRoots();
        for (File disk : disks) {
            System.out.println(disk);
            File[] files=disk.listFiles();
            for (File file : files) {
                long l = file.lastModified();
                System.out.print("\t"+Until.format(l));
                if (file.isDirectory()) {
                    System.out.print("\t<DIR>");
                }
                else{
                    System.out.print("\t"+file.length());
                }
                System.out.println("\t"+file.getName());
            }
        }
    }
}
