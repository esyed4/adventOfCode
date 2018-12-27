import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FrequencyInput {
  public static void main(String[] args) throws Exception {
    String frequency = "";
    int resultingFrequency = 0;
    String filePath = "FrequencyInput.txt";

    File file = new File(filePath);
    BufferedReader br = new BufferedReader(new FileReader(file));

    while ((frequency = br.readLine()) != null) {
      resultingFrequency += Integer.parseInt(frequency);
    }

    System.out.println(resultingFrequency);
  }
}
