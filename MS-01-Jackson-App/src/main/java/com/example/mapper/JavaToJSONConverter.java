package com.example.mapper;

import java.io.File;
import java.io.IOException;

import com.example.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJSONConverter {
    public static void main(String[] args) {
        try {
            // Create a new Customer object
            Customer newCustomer = new Customer(102, "dfghj00", "sdfgh@gmail.com", 7972946142L);

            // Create an ObjectMapper instance
            ObjectMapper obj = new ObjectMapper();

            // Serialize the Customer object to a JSON file
            obj.writeValue(new File("customer.json"), newCustomer);

            System.out.println("Customer data has been written to customer.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

