<?php
   
   $name = $_POST['name'];
   $surname = $_REQUEST['surname'];

 ?>
 
 <!DOCTYPE html>
 <html>
 
     <head>
	      <title> Working with form values </title>
     </head>
	 
	 <body>
	     <h2>I handled it </h2>
		 <?php echo 'Your name is ',$name,' ',$surname ?>
	 </body>
    
 </html>