/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Java;

/**
 *
 * @author sashant
 */
public class Originator {
    public String article;
    public void set(String newarticle){
        System.out.println("Current Version:"+newarticle);
        this.article=newarticle;
    }
    
    public Memento storeInMomento(){
        System.out.println("From Originator : Saving to Momento");
        return  new Memento(this.article);
    }
    
    public String restoreFromMemento(Memento memento){
        article=memento.getSavedArticle();
        System.out.println("Previously Saved : "+article);
        return article;
    }
}
