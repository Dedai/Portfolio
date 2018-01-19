import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import javax.swing.JRadioButton;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Lance extends Applet  {
	Label Name;
    Label Email;
    Label excellent;
    Label verygood;
    Label good;
    Label average;
    Label poor;
    Label tea;
    Label coffee;
    Label milk;
    Label water;
    Label tonik;

    TextField tName;
    TextField tEmail;
    
   
    Checkbox lexcellent;
    Checkbox lverygood;
    Checkbox lgood;
    Checkbox laverage;
    Checkbox lpoor;
											
    CheckboxGroup group;
    
    
   
    
    

    Button btnSend;
   

    Panel pDetails;
    
    private boolean isEmpty(String field) {

        return (field == null || field.trim().equals(""));
    }

   
    public void init(){
    	Name= new Label("Enter Name");
    	Email=new Label("Enter email");				
    	excellent=new Label("Enter your results");					
    	verygood = new Label(" ");
    	good=new Label(" ");
    	average=new Label(" ");
    	poor=new Label(" ");
    	tea=new Label("Check your drink ");
    	coffee=new Label(" ");
    	milk=new Label(" ");
    	water=new Label(" ");
    	tonik=new Label(" ");
    	
    	
    	
    	tName=new TextField(10);
    	tEmail=new TextField(20);
    	
    	
    	group=new CheckboxGroup();
    	
    	
    	lexcellent = new Checkbox("excellent", group, false);
    	lverygood = new Checkbox("verygood", group, false);
    	lgood = new Checkbox("good", group, false);
    	laverage = new Checkbox("average", group, false);
    	lpoor = new Checkbox("poor", group, false);
    	
    	
    	
    	
        
        add(lexcellent);
        add(lverygood);
        add(lgood);
        add(laverage);
        add(lpoor);
        
        
        

        Checkbox ltea,lcoffee,lmilk,lwater,ltonik;
        ltea = new Checkbox("tea");
        lcoffee = new Checkbox("coffee"); //This checkbox is checked
        lmilk = new Checkbox("milk");
        lwater = new Checkbox("water");
        ltonik = new Checkbox("tonik");

        add(ltea);                
        add(lcoffee);                
        add(lmilk);
        add(lwater);
        add(ltonik);
    	
    	
        
        
        btnSend = new Button("Send");
        
        
        pDetails = new Panel();

        pDetails.setLayout(new GridLayout(7, 2));

        pDetails.add(Name);
        pDetails.add(tName);                               

        pDetails.add(Email);
        pDetails.add(tEmail);
        
        pDetails.add(tea);
        pDetails.add(ltea);
        pDetails.add(coffee);
        pDetails.add(lcoffee);
        pDetails.add(milk);
        pDetails.add(lmilk);
        pDetails.add(water);
        pDetails.add(lwater);
        pDetails.add(tonik);
        pDetails.add(ltonik);
        
        pDetails.add(excellent);
        pDetails.add(lexcellent);
        pDetails.add(verygood);
        pDetails.add(lverygood);
        pDetails.add(good);
        pDetails.add(lgood);
        pDetails.add(average);
        pDetails.add(laverage);
        pDetails.add(poor);
        pDetails.add(lpoor);
        

       
        

        pDetails.add(btnSend);
       
        
        btnSend.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
               
                String name = tName.getText();
                String email = tEmail.getText();
                String res = null  ;
                String drink = null;
                
               
                
                if(lexcellent.getState())
                {res = "excellent";}
                else if(lverygood.getState())
                {res = "verygood";}
                else if(lgood.getState())
                {res = "good";}
                else if(laverage.getState())
                {res = "average";}
                else if(lpoor.getState())
                {res = "poor";}
                
                
                if(ltea.getState())
                {drink = "tea";}
                else if(lcoffee.getState())
                {drink = "coffee";}
                else if(lmilk.getState())
                {drink = "milk";}
                else if(lwater.getState())
                {drink = "water";}
                else if(ltonik.getState())
                {drink = "tonik";}
               
              
                String errors = "";

                boolean valid = true;

                if (isEmpty(name)) {
                    errors = "The text field for the name is empty. ";
                    valid = false;
                }

                if (isEmpty(email)) {
                    errors = "Write your email. ";
                    valid = false;
                }
                
                if(isEmpty(res)){
                	errors = "Tell us your results.";
                	valid = false;
                }
                
                if(isEmpty(drink)){
                	errors = "Tell us your preffered drink.";
                	valid = false;
                }

               
                if (valid) {
                    JOptionPane.showMessageDialog(
                            null,
                           "Name: "+ tName.getText() +
                           "\nEmail: "+ tEmail.getText() +
                           "\nYour results: "+ res +
                            "\nYour drink: "+ drink);
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

            }
        });

      
        
        pDetails.setSize(500, 500);
        pDetails.validate();
        add(pDetails);
    }

}


