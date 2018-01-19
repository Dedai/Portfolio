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

public class Panced extends Applet {
	

	
	Label Name;
 
    Label male;
    Label female;

    TextField tName;
    
    
   
    Checkbox lmale;
    Checkbox lfemale;
    
											
    CheckboxGroup group;
    
    
   
    
    

    Button btnSend;
    Button btnClear;
   

    Panel pDetails;
    
    private boolean isEmpty(String field) {

        return (field == null || field.trim().equals(""));
    }

   
    public void init(){
    	Name= new Label("Enter Name");
    				
    	male=new Label("Enter your first results");					
    	female = new Label(" ");
    	
    	
    	
    	
    	
    	
    	
    	tName=new TextField(10);
    
    	
    	
    	group=new CheckboxGroup();
    	
    	
    	lmale = new Checkbox("male", group, false);
    	lfemale = new Checkbox("female", group, false);
    	
    	
    	
    	
    	
    	
        
        add(lmale);
        add(lfemale);
        
        
        
        
        

       
    	
    	
        
        
        btnSend = new Button("Send");
        btnClear = new Button("Clear");
        
        
        pDetails = new Panel();

        pDetails.setLayout(new GridLayout(7, 2));

        pDetails.add(Name);
        pDetails.add(tName);                               

       
       
        
        pDetails.add(male);
        pDetails.add(lmale);
        pDetails.add(female);
        pDetails.add(lfemale);
       
        

        pDetails.add(btnSend);
        pDetails.add(btnClear);
       
        
        btnSend.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
               
                String name = tName.getText();
              
                String res = null  ;
                
                
               
                
                if(lmale.getState())
                {res = "excellent";}
                else if(lfemale.getState())
                {res = "verygood";}
              
                
               
               
              
                String errors = "";

                boolean valid = true;

                if (isEmpty(name)) {
                    errors = "The text field for the name is empty. ";
                    valid = false;
                }

                
                if(isEmpty(res)){
                	errors = "Tell us your gender.";
                	valid = false;
                }
              
               
               

               
                if (valid) {
                    JOptionPane.showMessageDialog(
                            null,
                           "Name: "+ tName.getText() +
                           
                           "\nYour first results: "+ res) ;
                            
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tName.setText("");
                

               

            }
        });
        
        pDetails.setSize(500, 500);
        pDetails.validate();
        add(pDetails);
    }

}
