<!DOCTYPE html>
<html>
   <head>
      <title>Html entities and strip_tags</title>
   </head>
   
   <body>
         <?php
		     if(isset($_GET['input '])){
				 echo strip_tags($_GET['input']);
			 }
		 ?>
		 
		 
       <form action="" method="get">
	       		  
			   <input type='text' name='input' /></br></br>
		    
		       <input type='submit' value='submit'/>
			   
       </form>
   </body>
</html>