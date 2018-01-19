<?php

?>


<!DOCTYPE html>
<html>
   <head>
      <title>Retrieving data from forms</title>
   </head>
   
   <body>
       <form action="handler.php" method="post">
	      
		  What is your favourite food ? </br>
		  <select multiple name="food[]">
		       <option value="burger" >Burger</option>
		       <option value="pizza" >Pizza</option>
		       <option value="salad" >Salad</option>
		       <option value="steak" >Steak</option>
		  </select>
		  </br>
		 <input type="submit" value="submit"/>
		 
		   
       </form>
   </body>
</html>