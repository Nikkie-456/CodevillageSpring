package com.thecodevillage.myapp.api;

import com.thecodevillage.myapp.models.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")

public class CustomerApi {
    @RequestMapping(value="/all",method = RequestMethod.GET)

    public ResponseEntity getAllCustomers(){
        System.out.println("Customer Details");
        List<Customer>customers = new ArrayList<>();
        Customer customer= new Customer(1,"9090TR","Peter");
        Customer customer1= new Customer(2,"9091TR","Bruce");
        Customer customer2= new Customer(3,"9092TR","Brie");
        Customer customer3= new Customer(4,"9093TR","Magret");

        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        System.out.println("Total No. Of Customers are:"+customers.size());
        return new ResponseEntity(customers, HttpStatus.OK);
    }

}
