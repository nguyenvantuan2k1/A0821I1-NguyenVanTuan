package _16_io_text_file.exercise.copy_file;

import java.io.*;

public class CopyFile {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }

    public static void main(String[] args) {
        File source = new File("thuc_hanh/src/_16_io_text_file/exercise/copy_file/input.csv");
        File dest = new File("thuc_hanh/src/_16_io_text_file/exercise/copy_file/output.csv");
        try {
            copyFileUsingStream(source,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
