<?php
   
   $fruit = array('oranges','apples','strawberries');
   sort($fruit);
   
   foreach($fruit as $name){
	   echo $name.'</br>';
   }
 
    echo '</br></br>';
 
   $vegetables = array('potatoes','carrots','beans');
   rsort($vegetables);
   
   foreach($vegetables as $name2){
	   echo $name2.'</br>';
   }
   
    echo '</br></br>';
   
    $fruit2 = array('fruit 3:'=>'oranges','fruit 1:'=>'apples','fruit 2:'=>'strawberries');
    ksort($fruit2);
   
   foreach($fruit2 as $key => $name3){
	   echo $key.' '.$name3.'</br>';
   }
?>