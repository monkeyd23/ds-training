package io.correctcloud;

import io.correctcloud.ds.CCArrayList;

public class Main {
    public static void main(String[] args) {
        CCArrayList products = new CCArrayList();

        for (int i =1; i <= 10; i++) {
            products.add(i);
        }

        products.remove(5);
        products.remove(8);

        products.empty();


        for (int i = 0; i < products.size; i++) {
            System.out.println(products.get(i));
        }

    }
}