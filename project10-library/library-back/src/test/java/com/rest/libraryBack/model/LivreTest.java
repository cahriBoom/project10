package com.rest.libraryBack.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LivreTest {

    @Test
    public void testConstructorWithParameters(){
        //Arrange
        String nom = "Harry";
        Date parution = new Date();
        String auteur = "Jk Rolling";
        String genre = "Fantastique";

        //Act
        Livre livre = new Livre(nom, parution, auteur, genre);

        //Assert
        Assert.assertEquals(nom, livre.getNom());
        Assert.assertEquals(parution, livre.getParution());
        Assert.assertEquals(auteur, livre.getAuteur());
        Assert.assertEquals(genre, livre.getGenre());
    }

    @Test
    public void testConstructorWithoutParameters(){
        //Arrange
        Livre livre = new Livre();

        //Act
        livre.setNom("Harry");
        livre.setAuteur("JK Rolling");
        livre.setGenre("Fantastique");

        //Assert
        Assert.assertEquals("Harry", livre.getNom());
        Assert.assertEquals("Jk Rolling", livre.getAuteur());
        Assert.assertEquals("Fantastique", livre.getGenre());
    }


    @Test
    public void testSettingListAttente(){
        //Arrange
        List<Client> liste_attente = new ArrayList<>();
        for (int i=0;i<4;i++){
            liste_attente.add(new Client("nom", "prenom", "mail", "password"));
        }
        int expectedNumber = 4;

        //Act
        int size = liste_attente.size();

        //Assert
        Assert.assertEquals(expectedNumber,size);


    }

    @Test
    public void testSettingListExemplaire(){
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
