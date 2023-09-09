package ac.jiu.java.grammer.chapter15;

import java.io.*;

public class CombineFiles {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java CombineFiles SourceFile1 ... SourceFilen TargetFile");
            return;
        }

        String[] sourceFileNames = new String[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            sourceFileNames[i] = args[i];
        }
        String targetFileName = args[args.length - 1];

        try (FileOutputStream targetOutputStream = new FileOutputStream(targetFileName)) {
            for (String sourceFileName : sourceFileNames) {
                File sourceFile = new File(sourceFileName);

                if (!sourceFile.exists()) {
                    System.out.println("Source file not found: " + sourceFileName);
                    return;
                }

                try (FileInputStream sourceInputStream = new FileInputStream(sourceFile)) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while ((bytesRead = sourceInputStream.read(buffer)) != -1) {
                        targetOutputStream.write(buffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.out.println("Error reading source file: " + sourceFileName);
                    e.printStackTrace();
                }
            }

            System.out.println("Files combined into " + targetFileName);
        } catch (IOException e) {
            System.out.println("Error writing to target file: " + targetFileName);
            e.printStackTrace();
        }
    }
}
