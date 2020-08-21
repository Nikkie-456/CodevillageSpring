package com.thecodevillage.myapp.item.Service;

import com.thecodevillage.myapp.item.models.ItemDetails;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<ItemDetails> getAllItms();

    Optional<ItemDetails> getItmsByItemCode(String itemCode);

    ItemDetails saveItem(ItemDetails itemDetails);

    ItemDetails updateItem(ItemDetails itemDetails);
}
