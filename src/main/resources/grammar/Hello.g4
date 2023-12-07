grammar Hello; //定义一个名为 Hello 的语法
statement: 'hello' ID; // 匹配关键字hello以及后面的标识符
ID: [a-z]+; // 定义了一个词法 ID，由小写字母组成
WS: [ \t\r\n]+ -> skip; //在进行解析的过程中，忽略掉空格，换行