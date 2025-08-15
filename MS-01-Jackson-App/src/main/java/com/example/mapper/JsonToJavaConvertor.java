package com.example.mapper;

import java.io.File;
import java.io.IOException;

import com.example.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonToJavaConvertor {
	public static void main(String[] args) {
        try {
            // Create a new Customer object
        	 String json = "{\"id\":30,\"name\":\"John\",\"email\":\"s@gmail.com\",\"pnNo\":\"3456789\"}";

            // Create an ObjectMapper instance
            ObjectMapper obj = new ObjectMapper();

            // Serialize the Customer object to a JSON file
            obj.readValue(json, Customer.class);

            System.out.println("Customer data has been read to "+json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
