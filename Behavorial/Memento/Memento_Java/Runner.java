/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author sashant
 */
public class Runner extends JFrame{
    public static void main(String[] args) {
        new Runner();
    }
    
    private JButton saveBut, undoBut, redoBut;
    private JTextArea article=new JTextArea(40,60);
    
    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();
    int savedFiles=0,currentArticle=0;
    
    Runner(){
        this.setSize(750,780);
        this.setTitle("Momento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel1=new JPanel();
        panel1.add(new JLabel("Article"));
        panel1.add(article);
        
        ButtonListener saveListener=new ButtonListener();
        ButtonListener undoListener=new ButtonListener();
        ButtonListener redoListener=new ButtonListener();
        
        saveBut=new JButton("Save");
        saveBut.addActionListener(saveListener);
        
        undoBut=new JButton("Undo");
        undoBut.addActionListener(undoListener);
        
        redoBut=new JButton("Redo");
        redoBut.addActionListener(redoListener);
        
        panel1.add(saveBut);
        panel1.add(undoBut);
        panel1.add(redoBut);
        
        this.add(panel1);
        this.setVisible(true);
        
    }
    
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==saveBut){
                String text=article.getText();
                originator.set(text);
                caretaker.addMemento(originator.storeInMomento());
                savedFiles++;
                currentArticle++;
                System.out.println("Save Files : "+savedFiles);
                undoBut.setEnabled(true);    
            }else 
                if(e.getSource()==undoBut){
                    if(currentArticle>=1){
                        currentArticle--;
                        String textBoxString=originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                        article.setText(textBoxString);
                        redoBut.setEnabled(true);
                    }else{
                        undoBut.setEnabled(false);
                    }
                }else{
                    if(e.getSource()==redoBut){
                        if((savedFiles-1)>currentArticle){
                            currentArticle++;
                            String textBoxString=originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                            article.setText(textBoxString);
                            undoBut.setEnabled(true);
                        }else{
                            redoBut.setEnabled(false);
                        }
                    }
                }
        }
    }
    
}
