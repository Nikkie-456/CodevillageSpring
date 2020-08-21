package com.thecodevillage.myapp.item.api;

import com.thecodevillage.myapp.item.Service.ItemService;
import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.item.models.ItemDetails;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@RequestMapping("/item")

public class ItemApi {
    private ItemService itemService;

    @Autowired
    public ItemApi(ItemService itemService) {
        this.itemService = itemService;
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity createItem(@RequestBody ItemDetails itemDetails) {
        try{
            System.out.println("Save Items to DB Called# ");
        System.out.println("Item Name: " + itemDetails.getItemName());
        itemService.saveItem(itemDetails);
        //return new ResponseEntity<>(itemService.saveItem(itemDetails), HttpStatus.OK);
            GenericResponse genericResponse = new GenericResponse(2001, "Item Created Successfully", itemDetails);
     return new ResponseEntity<>(genericResponse,HttpStatus.OK);}
        catch (Exception h){
            System.out.println("Error while creating item.");
        }
        return null;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ResponseEntity viewItms() {
        System.out.println("View Items from  DB Called# ");

        List<ItemDetails> itemDetails1 = itemService.getAllItms();

        GenericResponse genericResponse = new GenericResponse(2002, "Items Fetched Successfully", itemDetails1);

        return new ResponseEntity<>(genericResponse, HttpStatus.OK);
    }





}
