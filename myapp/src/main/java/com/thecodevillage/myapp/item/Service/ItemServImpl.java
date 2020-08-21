package com.thecodevillage.myapp.item.Service;

import com.thecodevillage.myapp.item.models.ItemDetails;
import com.thecodevillage.myapp.item.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ItemServImpl  implements ItemService{

    private ItemRepository itemRepository;

   @Autowired
   public ItemServImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<ItemDetails> getAllItms() {
        return itemRepository.findAllItms();
    }

    @Override
    public Optional<ItemDetails> getItmsByItemCode(String itemCode) {
        return itemRepository.findByItemCode(itemCode);
    }

    @Override
    public ItemDetails saveItem(ItemDetails itemDetails) {
        return itemRepository.save(itemDetails);
    }

    @Override
    public ItemDetails updateItem(ItemDetails itemDetails) {
        return itemRepository.save(itemDetails);
    }
}
