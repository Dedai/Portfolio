<?php
   
   $fruit = array('oranges','apples','strawberries','bananas','blueberries');
   $new_array = array_slice($fruit,2,3);
   
   foreach($new_array as $value){
	   echo $value. '</br>';
   }
   
   echo '</br></br>';
   
   $food = array('pizza','burger','fries','pie');
   $merged_arrays = array_merge($fruit,$food);
   
   foreach($merged_arrays as $value1){
	   echo $value1. '</br>';
   }

?>