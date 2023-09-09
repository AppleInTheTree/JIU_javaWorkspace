package ac.jiu.java.grammer.chapter15;

import java.io.*;

public class SplitFiles {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SplitFiles SourceFile");
            return;
        }

        String sourceFileName = args[0];
        File sourceFile = new File(sourceFileName);

        if (!sourceFile.exists()) {
            System.out.println("Source file not found: " + sourceFileName);
            return;
        }

        // Define the size of each chunk in bytes (e.g., 10MB)
        long chunkSize = 10L * 1024L * 1024L; // 10MB in bytes

        try (FileInputStream fileInputStream = new FileInputStream(sourceFile)) {
            byte[] buffer = new byte[(int) chunkSize];
            int bytesRead;
            int chunkNumber = 1;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {

                String chunkFileName = sourceFile.getName() + "_part" + chunkNumber;
                try (FileOutputStream fileOutputStream = new FileOutputStream(chunkFileName)) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                } catch (IOException e) {
                    System.out.println("Error writing chunk " + chunkFileName);
                    e.printStackTrace();
                }

                chunkNumber++;
            }

            System.out.println("File split into " + (chunkNumber - 1) + " chunks.");
        } catch (IOException e) {
            System.out.println("Error reading the source file: " + sourceFileName);
            e.printStackTrace();
        }
    }
}

