/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Java;

import java.util.ArrayList;

/**
 *
 * @author sashant
 */
public class Caretaker {
    ArrayList<Memento> savedArticles = new ArrayList<Memento>();
    public void addMemento(Memento m){
        savedArticles.add(m);
    }
    
    public Memento getMemento(int index){
        return savedArticles.get(index);
    }
    
}
