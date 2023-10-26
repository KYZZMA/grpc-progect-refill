package com.example.entity;

import com.example.grpc.Client;
import com.example.grpc.Product;

import java.util.ArrayList;
import java.util.List;

public class ShopDB {
    public static List<Client> getClientsFromDb() {
        return new ArrayList<Client>() {
            {
                add(Client.newBuilder().setClientId(1).setClientName("Саша").setClientCheck(100).build());
                add(Client.newBuilder().setClientId(2).setClientName("Паша").setClientCheck(400).build());
                add(Client.newBuilder().setClientId(3).setClientName("Маша").setClientCheck(14).build());

            }
        };
    }

    public static List<Product> getProductsFromDb() {
        return new ArrayList<Product>() {
            {
                add(Product.newBuilder().setProductId(1).setProductName("Молоко").setProductPrice(90).setProductCount(3).build());
                add(Product.newBuilder().setProductId(2).setProductName("Шоколадка").setProductPrice(50).setProductCount(2).build());

            }
        };
    }
}
