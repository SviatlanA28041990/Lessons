import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("text.txt"));
            bw = new BufferedWriter(new FileWriter("text2.txt"));
            String word;
            while ((word = br.readLine()) != null) {
                StringBuilder builder = new StringBuilder(word);
                if (builder.reverse().toString().equals(word)) {
                    System.out.println(word);
                    bw.write(word+"\n");
                }
            }
        } catch (IOException e) {
            System.out.println("error");
        }
        finally {
            if(br !=null){
                br.close();
            }
            if(bw !=null){
                bw.close();
            }
        }

    }
}
