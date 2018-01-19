

<!DOCTYPE html>
<html>
   <head>
      <title>Retrieving data from forms</title>
   </head>
   
   <body>
      <h2> Handling your Data </h2>
	  
	   <?php
	    
           $food = $_POST['food'];
           foreach($food as $value){
			   echo $value.'</br>';
		   }		   
		
	   ?>
	   
	 
   </body>
</html>