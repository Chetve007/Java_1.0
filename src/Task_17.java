import java.io.*;

public class Task_17 {
    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir") + "/for_task_17.txt");

        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        int countLine = 0;
        int writeLine = 0;

        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                countLine++;
            }

            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nYou need to enter the number of lines that was previously");

            bw = new BufferedWriter(new FileWriter(file, false));
            do {
                line = br.readLine();
                writeLine++;
                bw.write(line + "\r\n");
            } while (writeLine != countLine);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
