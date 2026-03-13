import java.io.*;
public class FileReadWrite {
    static void writeFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Data written to " + filename);
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }
    static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
    static void appendFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.newLine();
            writer.write(content);
            System.out.println("Data appended to " + filename);
        } catch (IOException e) {
            System.out.println("Append error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String filename = "data.txt";
        writeFile(filename, "Hello, World!\nThis is line 2.");
        appendFile(filename, "This is an appended line.");
        readFile(filename);
    }
}