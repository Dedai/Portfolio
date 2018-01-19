<!DOCTYPE html>
<html>
   <head>
      <title>50. Validating email with filter var</title>
   </head>
   
   <body>
         <?php
		     if(isset($_GET['email']) && !empty($_GET['email'])){
				  //validate email
				  if(filter_var($_GET['email'],FILTER_VALIDATE_EMAIL)){
					  echo'The email is valid.';
				  }
				  else{
					  echo'Invalid E-mail, try again!';
				  }
			 }
			 
			 else{
				 echo'Please enter an email!';
			 }
		 ?>
		 
		 
       <form action="" method="get">
	       		  
			   email: <input type='text' name='email' /></br></br>
		    
		       <input type='submit' value='submit'/>
			   
       </form>
   </body>
</html>