// 逗号分隔值 Comma-Separated Values，CSV
grammar Csv;
file : (row '\n')*; //一个‘\n’作为终止符的序列，表示文件由多行组成
row : field (',' field)*; //一个‘,’作为分隔符的序列，文件每行由多个字段组成， 这里其实也用到了嵌套模式
field : STRING | TEXT |; // 字段类型
STRING : '"' ('""'|~'"')* '"'; // 假设字段都是字符串
TEXT : ~[,\r\n"]+;