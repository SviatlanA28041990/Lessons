package Lesson11;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        try (var oos = new ObjectOutputStream(new FileOutputStream("car.dat"))) {
            var toyota = new Car("toyota", 160, 120000);
            oos.writeObject(toyota);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
