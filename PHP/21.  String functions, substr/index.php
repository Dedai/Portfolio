<?php

  $pizza = 'It\'s like you want to be thin and healthy but there is pizza';
  $find = 'healthy';
  
  $start = strpos($pizza,$find);
  $end = strlen($find);
  
  echo substr($pizza,$start,$end);
   
?>


