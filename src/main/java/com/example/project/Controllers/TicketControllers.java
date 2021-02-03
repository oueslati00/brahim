package com.example.project.Controllers;

import com.example.project.Data.Client;
import com.example.project.Services.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketControllers {

    private ClientService clientService;


    @GetMapping(path = "/")
    public List<Client> getClient(){
        List<Client> client = clientService.getClients();
        return client;
    }

}
