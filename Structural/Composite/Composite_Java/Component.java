/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite_Java;

import java.util.ArrayList;

/**
 *
 * @author shananu1395
 */
interface Component {
    public void showPrice();
}

class Leaf implements Component{
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }
    
    @Override
    public void showPrice() {
        System.out.println(name+" : "+price);
    }

}

class Composite implements Component{
    String name;

    public Composite(String name) {
        this.name = name;
    }
    
    ArrayList<Component> component=new ArrayList<Component>();
    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component component1 : component) {
            component1.showPrice();
       }
    }
    
    public void addComponent(Component comp){
        component.add(comp);
    }

}
 