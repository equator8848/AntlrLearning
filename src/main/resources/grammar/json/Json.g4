grammar Json;

json
   : value
   ;
obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;
pair
   : STRING ':' value
   ;
arr
   : '[' value (',' value)* ']'
   | '[' ']'
   ;
value
   : STRING
   | NUMBER
   | obj
   | arr
   | 'true'
   | 'false'
   | 'null'
   ;

STRING : '"' ('""'|~'"')* '"';
NUMBER : [0-9]+;