package com.example.project.Services;

import com.example.project.Data.Client;
import com.example.project.Repository.ClientRepository;
import com.example.project.dto.ClientRequest;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientRepository clientRepository;
    private ModelMapper mapper;


    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public Client getClientById(long id){
        return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client Not Found! For ID value : "+id));
    }
    public void deleteClient(long id) {
        clientRepository.deleteById(id);

    }
    public void saveClientInDB(ClientRequest Clientrequest) {
        Client client = mapper.map(Clientrequest, Client.class);
        clientRepository.save(client);
    }
    public Client saveEmptyClient() {
        Client client = new Client();
        clientRepository.save(client);
        return client;
    }


}
