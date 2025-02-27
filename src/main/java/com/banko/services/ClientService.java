package com.banko.services;

import com.banko.dto.ClientDto;
import com.banko.entities.Client;

import java.util.List;

public interface ClientService {
    void createNewClient(ClientDto clientDto);
    List<Client> findAll();
    Client findOne(long id);
}
