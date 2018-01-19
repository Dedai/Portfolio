

<!DOCTYPE html>
<html>
   <head>
      <title>Retrieving data from forms</title>
   </head>
   
   <body>
      <h2> Handling your Data </h2>
	  
	  <?php
     if(isset($_POST['checkbox1'])){
		echo $yes = $_POST['checkbox1'];
	 }
	
	 elseif(isset($_POST['checkbox2'])){
		echo $no = $_POST['checkbox2'];
	 }
     ?>
   </body>
</html>