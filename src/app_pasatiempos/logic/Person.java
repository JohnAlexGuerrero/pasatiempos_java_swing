/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_pasatiempos.logic;

import java.util.ArrayList;

/**
 *
 * @author JOHN
 */
public class Person {
    private int id;
    private String name;
    private String lastName;
    private String document;
    private String username;
    private String gender;
    private ArrayList<Hobbie> hobbies = new ArrayList<>();

    public Person(int id, String name, String lastName, String document, String username, String gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.username = username;
        this.gender = gender;
    }

    public Person() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<Hobbie> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobbie> hobbies) {
        this.hobbies = hobbies;
    }
    
    public void addHobbie(Hobbie h){
        this.hobbies.add(h);
    }
    
}
