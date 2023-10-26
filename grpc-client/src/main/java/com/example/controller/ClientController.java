package com.example.controller;

import com.example.service.ShopServiceClient;
import com.google.protobuf.Descriptors;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;


@RestController
@AllArgsConstructor
public class ClientController {

    ShopServiceClient shopServiceClient;

    @GetMapping("/client/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getClient(@PathVariable int id){
      return shopServiceClient.getClient(id);
    }



}
