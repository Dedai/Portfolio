

<!DOCTYPE html>
<html>
   <head>
      <title>Retrieving data from forms</title>
   </head>
   
   <body>
      <h2> Handling your Data </h2>
	  
	  <?php
           echo 'You selected: </br>';
		   
		   $food = $_POST['food'];
		   foreach($food as $key => $value){
			   echo $value.'</br>';
		   }
       ?>
   </body>
</html>