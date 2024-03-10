package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        Map<String, List<String>> map = new HashMap<>();
        this.phonebook = map;
    }

    public void add(String name, String phoneNumber) {
        // Instructions and tests aren't clear how to handle an existing name.
        // Making choice to add to the existing list instead of overwriting.
        List <String> numbers;
        if (phonebook.containsKey(name)){
            numbers = phonebook.get(name);
        }
        else {
            numbers = new ArrayList<>();
        }
        numbers.add(phoneNumber);
        phonebook.put(name, numbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        // Instructions and tests aren't clear how to handle an existing name.
        // Making choice to add to the existing list instead of overwriting.
        List <String> numbers;
        if (phonebook.containsKey(name)){
            numbers = phonebook.get(name);
        }
        else {
            numbers = new ArrayList<>();
        }
        for (String phoneNumber : phoneNumbers) {
            numbers.add(phoneNumber);
        }
        phonebook.put(name, numbers);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if (phonebook.containsKey(name)){
            return true;
        }
        else {
            return false;
        }
    }

    public List<String> lookup(String name) {
        List<String> numbers = phonebook.get(name);
        return numbers;
    }

    public String reverseLookup(String phoneNumber)  {
        

        return null;
    }

    public List<String> getAllContactNames() {
        List<String> contactNames = new ArrayList<>();

        for (String name : phonebook.keySet()){
            contactNames.add(name);
        }

        return contactNames;
    }

    public Map<String, List<String>> getMap() {

        return this.phonebook;
    }
}
