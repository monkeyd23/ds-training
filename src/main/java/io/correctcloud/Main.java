package io.correctcloud;

import io.correctcloud.ds.CCLinkedList;

public class Main {
    public static void main(String[] args) {
        CCLinkedList<String> products = new CCLinkedList<>();

        for (int i =1; i <= 10; i++) {
            products.add("Person " + i);
        }

        products.remove(4);
        products.remove(8);


        for (int i = 0; i < products.size; i++) {
            System.out.println(products.get(i));
        }

    }
}