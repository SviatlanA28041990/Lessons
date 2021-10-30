package Lesson11;

import java.io.*;

public class UnSerialization {
    public static void main(String[] args) {
        try (var ois = new ObjectInputStream(new FileInputStream("car.dat"))) {
            Car toyota = (Car) ois.readObject();
            System.out.println(toyota);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
