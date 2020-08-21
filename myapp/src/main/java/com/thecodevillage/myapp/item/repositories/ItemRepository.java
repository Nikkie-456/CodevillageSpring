package com.thecodevillage.myapp.item.repositories;

import com.thecodevillage.myapp.item.models.ItemDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends PagingAndSortingRepository<ItemDetails,Long> {
    List<ItemDetails> findAllItms();

    Optional<ItemDetails> findByItemCode(@Param("itemCode") String itemCode);
}
