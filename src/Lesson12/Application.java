package Lesson12;
import java.util.Random;


public class Application {

    public static void main(String[] args) {
        Shop shop = new Shop();
            shop.add(34, new Product(356, "telefon", new Random().nextInt(2000)));
            shop.add(89, new Product(278, "television", new Random().nextInt(2000)));
            shop.add(76, new Product(762, "computer", new Random().nextInt(2000)));
            shop.add(29, new Product(164, "fridge", new Random().nextInt(2000)));



        System.out.println(shop.allProduct());
        shop.delete(34);
        System.out.println(shop.allProduct());
        
    }

}
