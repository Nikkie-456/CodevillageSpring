package com.thecodevillage.myapp.repositories;

import com.thecodevillage.myapp.models.BankMenu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BankMenuRepository extends PagingAndSortingRepository <BankMenu,Long>{

    List<BankMenu> findAllMenu();

    Optional<BankMenu> findBymenuCode(@Param("menuCode") String menuCode);
}
