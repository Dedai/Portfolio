<?php
   
   $offset = 0; //от къде да започне търсенето
   
   $string = 'Hello my name is Mihail. What\'s your name ?';
   
   $find = 'name'; //kakво търсим
   
   $find_lenght = strlen($find);
   
   
   while($string_pos = strpos($string,$find,$offset)){
	   	   echo $find,' was found at ' .$string_pos;
	       $offset = $string_pos + $find_lenght;
	
   }

	