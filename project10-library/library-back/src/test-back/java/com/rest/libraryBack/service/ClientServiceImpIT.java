package com.rest.libraryBack.service;

import com.rest.libraryBack.model.Client;
import com.rest.libraryBack.model.Livre;
import com.rest.libraryBack.service.implementation.ClientServiceImp;
import com.rest.libraryBack.service.implementation.LivreServiceImp;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class ClientServiceImpIT {

    @Mock
    private Livre livre;

    @Mock
    private Client client;

    @Autowired
    private LivreService livreService;

    @Autowired
    private ClientService clientService;

    @BeforeEach
    public void init(){
        clientService = new ClientServiceImp();
        livreService = new LivreServiceImp();
    }

    @Test
    public void addClientTest(){
        /*
        //Arrange
        Client client = new Client("nom","prenom","mail@mail.com","password");

        //Act
        clientService.addClient(client);
        Client client_test_new = clientService.getByMail("mail@mail.com").get();

        //Assert
        Assert.assertEquals(client.getMail(),client_test_new.getMail());
        */
        //Arrange
        doReturn("nom").when(livre);


        //Act



        //Assert


    }

    @Test
    public void isTakenTest(){
        //Arrange
        Client client = new Client("Harry","Potter","Harry@mail.com","password");

        //Act
        boolean taken = clientService.isTaken(client.getMail());

        //Assert
        Assert.assertFalse(taken);
    }


    @Test
    public void getAllTest(){
        //Arrange
        List<Client> all_client = clientService.getAll();

        //Act
        int size = all_client.size();

        //Assert
        Assert.assertEquals(7, size);
    }

    @Test
    public void saveClientTest(){
        //Arrange
        Client client = new Client("Harry","Potter","Harry@mail.com","password");
        List<Client> all = clientService.getAll();
        int size_before = all.size();

        //Act
        clientService.addClient(client);
        List<Client> all_client = clientService.getAll();
        int size_after = all_client.size();

        //Assert
        Assert.assertNotSame(size_before, size_after);
    }

    @Test
    public void cancelReservationTest(){
        //Arrange
        Client client = clientService.getByMail("test@gmail.com").get();
        Livre livre =livreService.getById(2);
        List<Client> liste_attente_before = livre.getListe_attente();
        int size_before = liste_attente_before.size();

        //Act
        clientService.cancelReservation(livre.getId(),client.getMail());
        Livre livre_after = livreService.getById(2);
        List<Client> liste_attente_after = livre_after.getListe_attente();
        int size_after = liste_attente_after.size();

        //Assert
        Assert.assertNotSame(size_before,size_after);

    }

}
