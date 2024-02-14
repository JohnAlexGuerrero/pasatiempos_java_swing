/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_pasatiempos;

import app_pasatiempos.logic.Person;
import java.util.ArrayList;

/**
 *
 * @author JOHN
 */
public class Databases {
    private ArrayList<Person> persons = new ArrayList<>();

    public Databases() {
    }
    
    public void addPerson(Person obj){
        persons.add(obj);
    }
    

    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public int countPersons(){
        return persons.size();
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    
}
