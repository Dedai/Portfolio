<?php
   
   $value = 4;
   
   function scoper(){
	   $value = 800;
	   echo 'function value is : '.$value. '</br>';
   }   

   scoper();
   echo 'global value is : '.$value;
 ?>
