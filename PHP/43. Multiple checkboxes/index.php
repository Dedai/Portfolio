<?php

?>


<!DOCTYPE html>
<html>
   <head>
      <title>Retrieving data from forms</title>
   </head>
   
   <body>
       <form action="handler.php" method="post">
	      
		  What are your favourite foods? </br>
		  Burger<input type="checkbox" value="burger" name="food[]"/></br>
		  Steak<input type="checkbox" value="steak" name="food[]"/></br>
		  Salad<input type="checkbox" value="salad" name="food[]"/></br>
		  Macaroni<input type="checkbox" value="macaroni" name="food[]"/></br>
		  
		   <input type="submit" value="submit"/>
		   
       </form>
   </body>
</html>