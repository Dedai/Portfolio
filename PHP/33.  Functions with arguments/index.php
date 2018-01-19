<?php
   
    function say_hello($name){
		echo 'Hello '.$name.'</br>' ;
	}
	
	$user = 'Rob';
	
	say_hello('Mihail');
	say_hello($user);
	

?>