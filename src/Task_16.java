import java.io.*;

public class Task_16 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type 'stop' if you want to close the program");

        String line;
        File file = new File(System.getProperty("user.dir") + "/for_task_16.txt");
        try (FileWriter fileWriter = new FileWriter(file)){
            do {
                line = br.readLine();
                if (line.compareTo("stop") == 0) break;
                fileWriter.write(line + "\r\n");
            } while (line.compareTo("stop") != 0);
        } catch (IOException e) { e.printStackTrace(); }

        System.out.println("The program is closed");
    }
}