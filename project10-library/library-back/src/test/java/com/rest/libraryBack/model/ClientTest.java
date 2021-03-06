package com.rest.libraryBack.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

    @Test
    public void testConstructorWithParameters(){
        //Arrange
        String nom = "nom";
        String prenom = "prenom";
        String mail = "mail@mail.com";
        String password = "password";

        //Act
        Client client = new Client(nom, prenom, mail, password);

        //Assert
        Assert.assertEquals(nom,client.getNom());
        Assert.assertEquals(prenom, client.getPrenom());
        Assert.assertEquals(mail, client.getMail());
        Assert.assertEquals(password, client.getPassword());
    }


    @Test
    public void testConstructorWithoutParameters(){
        //Arrange
        Client client = new Client();

        //Act
        client.setNom("nom");
        client.setPrenom("prenom");
        client.setPassword("password");
        client.setMail("mail@mail.com");
        client.setAdmin(false);

        //Assert
        Assert.assertEquals("nom", client.getNom());
        Assert.assertEquals("prenom", client.getPrenom());
        Assert.assertEquals("mail@mail.com", client.getMail());
        Assert.assertEquals("password", client.getPassword());
        Assert.assertFalse(client.isAdmin());
    }


    @Test
    public void testSettingListEmprunteur(){
        //Arrange
        List<Exemplaire> liste_exemplaire = new ArrayList<>();
        for (int i=0;i<4;i++){
            liste_exemplaire.add(new Exemplaire(i,null,"Disponible"));
        }
        int expectedNumber = 4;

        //Act
        int size = liste_exemplaire.size();

        //Assert
        Assert.assertEquals(expectedNumber,size);

    }


}
