<?php
    $username = $_POST['username'];	
	$password = $_POST['password'];
	$data = $_POST['data'];
?>

<!DOCTYPE html>
<html>
   <head>
      <title>Retrieving data from forms</title>
   </head>
   
   <body>
      <h2> Handling your Data </h2>
	  
	  <?php 
          echo 'Welcome '.$username,'</br>'.' Your password is: '.$password.'</br>'.' Your data is: '.$data;
	  ?>
   </body>
</html>