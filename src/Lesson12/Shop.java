package Lesson12;

import java.util.*;

public class Shop<map> {
    private Map<Integer, Product> map = new HashMap<>();

    public Shop() {
    }

    public void add(Integer id, Product product) {
        map.put(id, new Product(product.getId(), product.getName(), product.getPrice()));
    }


    public Map<Integer, Product> allProduct() {
        map.values();
        return map;
    }

    public void delete(int id) {
        map.remove(id);
        }

    public void edit(Product product){

    }
}
