

<!DOCTYPE html>
<html>
   <head>
      <title>Retrieving data from forms</title>
   </head>
   
   <body>
      <h2> Handling your Data </h2>
	  
	   <?php
	      
		  $plays_pool = $_POST['radiobutton'];
	      echo 'You were asked if you played pool and you said: '.$plays_pool;
	   ?>
	   
	 
   </body>
</html>