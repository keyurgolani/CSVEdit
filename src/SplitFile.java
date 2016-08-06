import java.io.*;

/**
 * Created by keyur on 8/4/16.
 */
public class SplitFile {
    public static void main(String[] args) {
        double threshold = 0.2;
        String inputFilePath = "/home/keyur/Desktop/input.csv";
        String outputFile1Path = "/home/keyur/Desktop/output1.csv";
        String outputFile2Path = "/home/keyur/Desktop/output2.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(outputFile1Path));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(outputFile2Path));
            String line = "";
            while((line = br.readLine()) != null) {
                if(Math.random() > threshold) {
                    bw1.write(line);
                    bw1.newLine();
                } else {
                    bw2.write(line);
                    bw2.newLine();
                }
            }
            bw1.flush();
            bw2.flush();
            bw1.close();
            bw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finished!");
    }
}
