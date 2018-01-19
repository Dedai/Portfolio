<?php
   
   $normal_array = array('Sandra','Cortney','Samantha');
   $assoc_array = array('Ryan'=>150,'Kyle'=>21.95,'Shawn'=>0.99);
   
   foreach($normal_array as $value){
	   echo 'Value : ' .$value.'</br>';
   }
   
   echo ' </br> </br>';
   
    foreach( $assoc_array as $key => $value_2){
	   echo $key.' owes you '. $value_2.' </br>';
   }
   
?>


