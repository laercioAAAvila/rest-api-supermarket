package com.example.restapisupermarket.Controller;

import com.example.restapisupermarket.Model.Shopping;
import com.example.restapisupermarket.Repository.ShoppingRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ShoppingController {

    ShoppingRepository shoppingRepository;


    //Get all shopping list
    @RequestMapping(method = RequestMethod.GET, value = "/shopping")
    public List<Shopping> findAllShopping (){
     return this.shoppingRepository.findAll();
    }
    //Get shopping by id
    @RequestMapping(method = RequestMethod.GET, value = "/shopping/{id}")
    public Shopping findShoppingById (@PathVariable (value = "id") Long id){
        return this.shoppingRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/shopping")
    public Shopping saveShopping(@RequestBody Shopping shopping){
        return this.shoppingRepository.save(shopping);
    }
}
