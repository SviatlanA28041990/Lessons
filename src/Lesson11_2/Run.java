package Lesson11_2;


import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("text3.txt"));
            bw = new BufferedWriter(new FileWriter("text4.txt"));
            String text;
            while ((text = br.readLine()) != null) {
                String[] array = text.split("! ");
                for (String elements : array) {
                }
                for (int i = 0; i < array.length; i++) {
                    boolean b = TextFormater.check(array[i]);
                    if (b == true) {
                        bw.write(array[i] + "\n");
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    int sr = TextFormater.words(array[i]);
                    if (sr >= 3 && sr <= 5) {
                        bw.write(array[i] + "\n");
                    }

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
        }
    }
}