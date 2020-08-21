package com.thecodevillage.myapp.repositories;

import com.thecodevillage.myapp.models.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {

    List<Account> findAllAccs();

    Optional<Account> findByaccCode(@Param("accCode") String accCode);

    Optional<Account> findByCustId(@Param("custId") long id);


}
