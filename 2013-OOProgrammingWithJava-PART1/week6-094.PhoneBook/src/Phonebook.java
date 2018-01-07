/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class Phonebook {
    private ArrayList<Person> phoneList = new ArrayList<Person>();
    
    public void add(String name, String phoneNumber) {
        this.phoneList.add(new Person(name, phoneNumber));
    }
    
    public void printAll() {
        for(Person entry : this.phoneList) {
            System.out.println(entry);
        }
    }
    
    public String searchNumber(String name) {
        for(Person entry : this.phoneList) {
            if (entry.getName().contains(name)) {
                return entry.getNumber();
            }
        }
        return "number not known";
    }
}
