import java.io.*;

public class Task_15 {
    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir") + "/for_task_15.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
