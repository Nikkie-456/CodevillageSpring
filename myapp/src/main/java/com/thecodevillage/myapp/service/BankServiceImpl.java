package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.models.Account;
import com.thecodevillage.myapp.models.BankMenu;
import com.thecodevillage.myapp.models.Customer;
import com.thecodevillage.myapp.repositories.AccountRepository;
import com.thecodevillage.myapp.repositories.BankMenuRepository;
import com.thecodevillage.myapp.repositories.CurrencyRepository;
import com.thecodevillage.myapp.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {

    private CustomerRepository customerRepository;
    private CurrencyRepository currencyRepository;
    private BankMenuRepository bankMenuRepository;
    private AccountRepository accountRepository;

    @Autowired
    public BankServiceImpl(CustomerRepository customerRepository,CurrencyRepository currencyRepository,BankMenuRepository bankMenuRepository,AccountRepository accountRepository) {
        this.customerRepository = customerRepository;
        this.currencyRepository = currencyRepository;
        this.bankMenuRepository = bankMenuRepository;
        this.accountRepository  = accountRepository;
    }


    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAllCustomers();
    }

    @Override
    public Customer getCustomerByidNumber(String idNumber) {
        return null;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    //Menu

    @Override
    public List<BankMenu> getMenu() {
        return bankMenuRepository.findAllMenu();
    }

    @Override
    public BankMenu findBymenuCode(String menuCode){return null;}

    @Override
    public BankMenu saveBankMenu(BankMenu bankMenu){return (BankMenu) bankMenuRepository.save(bankMenu);}

    @Override
    public BankMenu updateBankMenu(BankMenu bankMenu){return (BankMenu)  bankMenuRepository.save(bankMenu);}

    //Account

    @Override
    public List<Account> getAccount() {return accountRepository.findAllAccs();}

    @Override
    public Account findByaccCode(String accCode){return null;}

    @Override
    public Account saveAccount(Account account){return  accountRepository.save(account);}

    @Override
    public Account updateAccount(Account account){return  accountRepository.save(account);}


}
