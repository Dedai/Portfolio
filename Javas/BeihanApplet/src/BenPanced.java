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

public class BenPanced extends Applet {
	
	

	
		Label Name;
	 
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
	    Label excellent3;
	    Label verygood3;
	    Label good3;
	    Label average3;
	    Label poor3;
	   
	    TextField tName;
	    
	    
	   
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
	    Checkbox nexcellent;
	    Checkbox nverygood;
	    Checkbox ngood;
	    Checkbox naverage;
	    Checkbox npoor;
												
	    CheckboxGroup group;
	    
	    
	   
	    
	    

	    Button btnSend;
	   

	    Panel pDetails;
	    
	    private boolean isEmpty(String field) {

	        return (field == null || field.trim().equals(""));
	    }

	   
	    public void init(){
	    	Name= new Label("Enter Name");
	    				
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
	    	
	    	excellent3=new Label("Enter your third results");					
	    	verygood3 = new Label(" ");
	    	good3=new Label(" ");
	    	average3=new Label(" ");
	    	poor3=new Label(" ");
	    	
	    	
	    	
	    	
	    	tName=new TextField(10);
	    
	    	
	    	
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
	    	
	    	CheckboxGroup group3=new CheckboxGroup();
	    	
	    	nexcellent = new Checkbox("excellent", group3, false);
	    	nverygood = new Checkbox("verygood", group3, false);
	    	ngood = new Checkbox("good", group3, false);
	    	naverage = new Checkbox("average", group3, false);
	    	npoor = new Checkbox("poor", group3, false);
	    	
	    	
	    	
	    	
	    	
	    	
	        
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
	        
	        add(nexcellent);
	        add(nverygood);
	        add(ngood);
	        add(naverage);
	        add(npoor);
	        
	        
	        
	        

	       
	    	
	    	
	        
	        
	        btnSend = new Button("Send");
	        
	        
	        pDetails = new Panel();

	        pDetails.setLayout(new GridLayout(7, 2));

	        pDetails.add(Name);
	        pDetails.add(tName);                               

	       
	       
	        
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
	        
	        pDetails.add(excellent3);
	        pDetails.add(nexcellent);
	        pDetails.add(verygood3);
	        pDetails.add(nverygood);
	        pDetails.add(good3);
	        pDetails.add(ngood);
	        pDetails.add(average3);
	        pDetails.add(naverage);
	        pDetails.add(poor3);
	        pDetails.add(npoor);
	        

	       
	        

	        pDetails.add(btnSend);
	       
	        
	        btnSend.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent arg0) {
	               
	                String name = tName.getText();
	              
	                String res = null  ;
	                String res2 = null  ;
	                String res3 = null  ;
	               
	                
	               
	                
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
	                
	                if(nexcellent.getState())
	                {res3 = "excellent";}
	                else if(nverygood.getState())
	                {res3 = "verygood";}
	                else if(ngood.getState())
	                {res3 = "good";}
	                else if(naverage.getState())
	                {res3 = "average";}
	                else if(npoor.getState())
	                {res3 = "poor";}
	                
	                
	               
	               
	              
	                String errors = "";

	                boolean valid = true;

	                if (isEmpty(name)) {
	                    errors = "The text field for the name is empty. ";
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
	               
	                if(isEmpty(res3)){
	                	errors = "Tell us your third results.";
	                	valid = false;
	                }
	               
	               

	               
	                if (valid) {
	                    JOptionPane.showMessageDialog(
	                            null,
	                           "Name: "+ tName.getText() +
	                           
	                           "\nYour first results: "+ res +
	                           "\nYour second results: "+ res2 +
	                           "\nYour third results: "+ res3) ;
	                            
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


