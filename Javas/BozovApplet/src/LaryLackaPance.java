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

public class LaryLackaPance extends Applet {
	Label Name;
    Label Email;
    Label excellent;
    Label verygood;
    Label good;
    Label average;
    Label poor;
    Label excellent2;
    Label verygood2;
    Label good2;
    Label average2;
    Label poor2;

    TextField tName;
    TextField tEmail;
    
   
    Checkbox lexcellent;
    Checkbox lverygood;
    Checkbox lgood;
    Checkbox laverage;
    Checkbox lpoor;
    Checkbox mexcellent;
    Checkbox mverygood;
    Checkbox mgood;
    Checkbox maverage;
    Checkbox mpoor;
											
    CheckboxGroup group;
    
    
   
    
    

    Button btnSend;
   

    Panel pDetails;
    
    private boolean isEmpty(String field) {

        return (field == null || field.trim().equals(""));
    }

   
    public void init(){
    	Name= new Label("Enter Name");
    	Email=new Label("Enter email");				
    	excellent=new Label("Enter your first results");					
    	verygood = new Label(" ");
    	good=new Label(" ");
    	average=new Label(" ");
    	poor=new Label(" ");
    	
    	excellent2=new Label("Enter your second results");					
    	verygood2 = new Label(" ");
    	good2=new Label(" ");
    	average2=new Label(" ");
    	poor2=new Label(" ");
    	
    	
    	
    	tName=new TextField(10);
    	tEmail=new TextField(20);
    	
    	
    	group=new CheckboxGroup();
    	
    	
    	lexcellent = new Checkbox("excellent", group, false);
    	lverygood = new Checkbox("verygood", group, false);
    	lgood = new Checkbox("good", group, false);
    	laverage = new Checkbox("average", group, false);
    	lpoor = new Checkbox("poor", group, false);
    	
    	CheckboxGroup group2=new CheckboxGroup();
    	
    	mexcellent = new Checkbox("excellent", group2, false);
    	mverygood = new Checkbox("verygood", group2, false);
    	mgood = new Checkbox("good", group2, false);
    	maverage = new Checkbox("average", group2, false);
    	mpoor = new Checkbox("poor", group2, false);
    	
    	
    	
    	
        
        add(lexcellent);
        add(lverygood);
        add(lgood);
        add(laverage);
        add(lpoor);
        add(mexcellent);
        add(mverygood);
        add(mgood);
        add(maverage);
        add(mpoor);
        
        
        

      
    	
    	
        
        
        btnSend = new Button("Send");
        
        
        pDetails = new Panel();

        pDetails.setLayout(new GridLayout(7, 2));

        pDetails.add(Name);
        pDetails.add(tName);                               

        pDetails.add(Email);
        pDetails.add(tEmail);
        
       
        
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
        
        pDetails.add(excellent2);
        pDetails.add(mexcellent);
        pDetails.add(verygood2);
        pDetails.add(mverygood);
        pDetails.add(good2);
        pDetails.add(mgood);
        pDetails.add(average2);
        pDetails.add(maverage);
        pDetails.add(poor2);
        pDetails.add(mpoor);
        

       
        

        pDetails.add(btnSend);
       
        
        btnSend.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
               
                String name = tName.getText();
                String email = tEmail.getText();
                String res = null  ;
                String res2 = null;
                
               
                
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
                
                
                if(mexcellent.getState())
                {res2 = "excellent";}
                else if(mverygood.getState())
                {res2 = "verygood";}
                else if(mgood.getState())
                {res2 = "good";}
                else if(maverage.getState())
                {res2 = "average";}
                else if(mpoor.getState())
                {res2 = "poor";}
               
              
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
                	errors = "Tell us your first results.";
                	valid = false;
                }
                
                if(isEmpty(res2)){
                	errors = "Tell us your second results.";
                	valid = false;
                }
                
              

               
                if (valid) {
                    JOptionPane.showMessageDialog(
                            null,
                           "Name: "+ tName.getText() +
                           "\nEmail: "+ tEmail.getText() +
                           "\nYour first results: "+ res +
                            "\nYour second results: "+ res2);
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
