package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.models.AccCreateMul;
import com.thecodevillage.myapp.models.Account;
import com.thecodevillage.myapp.models.BankMenu;
import com.thecodevillage.myapp.models.Customer;

import java.util.List;

public interface BankService {
    List<Customer> getCustomers();

    Customer getCustomerById(Long id);

    Customer getCustomerByidNumber(String idNumber);

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    //Menu Section

    List<BankMenu> getMenu();

    BankMenu findBymenuCode(String menuCode);

    BankMenu saveBankMenu(BankMenu bankMenu);

    BankMenu updateBankMenu(BankMenu bankMenu);


    //Account Section

    List<Account> getAccount();

    Account findByaccCode(String accCode);

    Account findBycustId(long id);

    Account saveAccount(Account account);

    Account updateAccount(Account account);

    AccCreateMul saveMulAcc(AccCreateMul accCreateMul);

    AccCreateMul createMulAcc(AccCreateMul accCreateMul);
}