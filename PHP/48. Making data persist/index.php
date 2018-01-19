<!DOCTYPE html>
<html>
   <head>
      <title>Making data persist</title>
   </head>
   
   <body>
       <form method="post">
	        <?php
			  
			  if(isset($_post['first_name'])){
				     $first_name=$_post['first_name'];
			  }
			  else{
				  $first_name="";
			  }
			  
			  
			  if(isset($_post['last_name'])){
				     $last_name=$_post['last_name'];
			  }
			  else{
				  $last_name="";
			  }
			
             echo"
			   first name:<input type='text' name='first_name' value='$first_name'/></br></br>
			   last name:<input type='text' name='last_name' value='$last_name'/></br></br>
		    
		       <input type='submit' value='submit'/>
			 ";
		   ?>
       </form>
   </body>
</html>