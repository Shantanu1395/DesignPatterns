/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Java;

/**
 *
 * @author shantanu1395
 */
public class Memento {
    private String article;

    public Memento(String article) {
        this.article = article;
    }
    public String getSavedArticle(){
        return article;
    }
}
