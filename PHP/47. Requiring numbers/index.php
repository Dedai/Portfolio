<?php
    if(!empty($_POST['age'])){
		
		if(is_numeric($_POST['age'])){
			echo'Yes that is numeric.';
		}
	
	  else{
		  echo'No that is not numeric, please enter numeric!';
	  }
	}
?>


<!DOCTYPE html>
<html>
   <head>
      <title>Form validation</title>
   </head>
   
   <body>
       <form method="post">
	        
			age:<input type="text" name="age">
		 
		   <input type="submit" value="submit"/>
       </form>
   </body>
</html>