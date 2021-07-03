grammar Hello; //定义一个名为 Hello 的语法
statement: ID '=' NUM; //匹配类似 a=1 age=100 这样的语句
ID: [a-z]+; // 定义了一个词法 ID，由小写字母组成
NUM:[0-9]+; // 定义了一个词法 NUM，由数字组成
WS: [ \t\r\n]+ -> skip; //在进行解析的过程中，忽略掉空格，换行