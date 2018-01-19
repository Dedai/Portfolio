<?php
   
   function adder($arg1,$arg2){
	   
	   $sum = $arg1 + $arg2;
	   return $sum;
   }
 
    $apples = adder(12,4);
	$oranges = adder (9,3);
	$banana = adder (7,6);
	
	echo $apples;
	echo '</br>';
	echo $oranges;
	echo '</br>';
	echo $banana;
 ?>
