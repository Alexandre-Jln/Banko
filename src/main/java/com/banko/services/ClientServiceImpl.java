package com.banko.services;

import com.banko.dto.ClientDto;
import com.banko.entities.Client;
import com.banko.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientServiceImpl implements ClientService {

    final ClientRepository clientRepository;
    ClientServiceImpl(final ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @Override
    public void createNewClient(ClientDto clientDto) {
        Client client = new Client();

    }

    @Override
    public List<Client> findAll() {
        return List.of();
    }

    @Override
    public Client findOne(long id) {
        return null;
    }
}
