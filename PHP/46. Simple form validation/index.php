<?php
     if(!empty($_POST['username']) && !empty($_POST['password']) && 
	    !empty($_POST['password_again']) && !empty($_POST['gender']) && 
	    !empty($_POST['info'])){
		 
		 $username =$_POST['username'];
		 $password =$_POST['password'];
		 $password_again =$_POST['password_again'];
		 $gender =$_POST['gender'];
		 $info =$_POST['info'];
		 
		 if(strlen($username)>32){
			 echo 'Your username is too long!';
		 }
		 elseif($password != $password_again){
			 echo 'Your passwords do not match!';
		 }
		 elseif(strlen($password)>32){
			 echo 'Your passwords is too long!';
		 }
		 elseif(strlen($info)>132){
			 echo 'Your info is too long!';
		 }
		 
	 
	 else{
		 echo "The following data has been submitted </br> 
		 Username : $username </br>
		 Password : $password </br>
		 Gender : $gender </br>
		 Info : $info </br>";
		 	 
	   }
	   
	 }
		 else{
		   echo'You need to fill in all fields!';
	   }
	
?>


<!DOCTYPE html>
<html>
   <head>
      <title>Form validation</title>
   </head>
   
   <body>
       <form method="post">
	        
			<h2>Register</h2>
			username:<input type="text" name="username"/></br></br>
			password:<input type="password" name="password"/></br></br>
			password again:<input type="password" name="password_again"/></br></br>
			gender: male<input type="radio" value="male" name="gender"/> </br></br>
			gender: female<input type="radio" value="female" name="gender"/> </br></br>
			Tell us about yourself:</br></br>
			<textarea name="info">
			</textarea></br></br>
		 
		   <input type="submit" value="submit"/>
       </form>
   </body>
</html>