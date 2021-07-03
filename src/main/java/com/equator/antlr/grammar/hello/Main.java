package com.equator.antlr.grammar.hello;

import grammar.hello.HelloLexer;
import grammar.hello.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        HelloLexer lexer = new HelloLexer(CharStreams.fromString("a = 1"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokenStream);
        System.out.println(parser.statement().toStringTree(parser));
    }
}
