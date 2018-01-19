<?php

   $apples = 1;
   if($apples >= 1){
	   echo "You have more than or equal to 1 apple </br>";
	   echo 'You have ' .$apples. 'apples </br>';
   }

   $bananas = 3;
   if($bananas != 1){
	   echo "You don't have 1 banana </br>";
	   echo 'You have ' .$bananas. ' bananas </br>';
   }
   
   $peaches = 1;
   if($peaches == 1){
	   echo "You have 1 peach </br>";
	   
   }
   
    $peaches = 1;
	$oranges = 1;
   if($peaches === $oranges){
	    echo 'You have ' .$peaches. ' peach and ' .$oranges. ' orange </br>' ;
	   
   }
?>