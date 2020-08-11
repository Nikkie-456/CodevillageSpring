package com.thecodevillage.myapp.api;

import com.thecodevillage.myapp.models.Account;
import com.thecodevillage.myapp.models.BankMenu;
import com.thecodevillage.myapp.models.Customer;
import com.thecodevillage.myapp.repositories.CustomerRepository;
import com.thecodevillage.myapp.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")

public class CustomerApi {
    private BankService bankService;

    @Autowired
    public CustomerApi(BankService bankService) {
        this.bankService = bankService;
    }

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

    @RequestMapping(value = "/all/db",method = RequestMethod.GET)
    public ResponseEntity getAllCustomersFromDb(){
        System.out.println("Customer API FROM DB Called# ");
        List<Customer> customers= bankService.getCustomers();
        return new ResponseEntity<>(bankService.getCustomers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity createCustomer(@RequestBody Customer customer){
        System.out.println("Customer Save Customer in DB Called# ");

        System.out.println("Name: "+customer.getName());
        return new ResponseEntity<>(bankService.saveCustomer(customer), HttpStatus.OK);
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity updateCustomer(@RequestBody Customer customer){
        System.out.println("Update  Customer in DB Called# ");

        System.out.println("Name: "+customer.getName());
        return new ResponseEntity<>(bankService.updateCustomer(customer), HttpStatus.OK);
    }

    //Menu Section

    @RequestMapping(value = "/menu/create",method = RequestMethod.POST)
    public ResponseEntity createMenu(@RequestBody BankMenu bankMenu){
        System.out.println("Save Menu to DB ");

        System.out.println("Name: "+bankMenu.getMenuName());
        return new ResponseEntity<>(bankService.saveBankMenu(bankMenu), HttpStatus.OK);
    }

    @RequestMapping(value = "/menu/view",method = RequestMethod.GET)
    public ResponseEntity viewMenu(@RequestBody BankMenu bankMenu){
        System.out.println("All available Transactions from DB ");
        List<BankMenu> bankMenus = bankService.getMenu();
        return new ResponseEntity<>(bankService.getMenu(), HttpStatus.OK);
    }

    @RequestMapping(value = "/menu/edit",method = RequestMethod.POST)
    public ResponseEntity editMenu(@RequestBody BankMenu bankMenu){
        System.out.println("Edit Transaction Name ");

        System.out.println("Name: "+bankMenu.getMenuName());
        return new ResponseEntity<>(bankService.updateBankMenu(bankMenu), HttpStatus.OK);
    }


    //Account Section

    @RequestMapping(value = "/account/create",method = RequestMethod.POST)
    public ResponseEntity createAccount(@RequestBody Account account){
        System.out.println("Save Account to DB ");

        System.out.println("Name: "+account.getAccName());
        return new ResponseEntity<>(bankService.saveAccount(account), HttpStatus.OK);
    }

    @RequestMapping(value = "/account/view",method = RequestMethod.GET)
    public ResponseEntity viewMenu(@RequestBody Account account){
        System.out.println("All available Transactions from DB ");
        List<Account> accounts = bankService.getAccount();
        return new ResponseEntity<>(bankService.getAccount(), HttpStatus.OK);
    }

    @RequestMapping(value = "/account/edit",method = RequestMethod.POST)
    public ResponseEntity editAccount(@RequestBody Account account){
        System.out.println("Edit Transaction Name ");

        System.out.println("Name: "+account.getAccName());
        return new ResponseEntity<>(bankService.updateAccount(account), HttpStatus.OK);
    }




}
