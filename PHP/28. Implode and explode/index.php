<?php
   
   $people = array('Mike ','Marc ','Mary ','McGregor');
   $new_string = implode(' , ',$people);
   echo  $new_string;
   
   echo '</br> </br>';
   
   $string = 'The key to immortality is a secret';
   $new_array = explode(' ', $string);
   
   foreach($new_array as $value){
   echo $value. '</br>';
   }
   
?>


