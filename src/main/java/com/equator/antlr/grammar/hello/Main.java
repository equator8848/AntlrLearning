package com.equator.antlr.grammar.hello;

import com.equator.antlr.gen.HelloLexer;
import com.equator.antlr.gen.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) {
        HelloLexer lexer = new HelloLexer(CharStreams.fromString("hello   equator"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokenStream);

        System.out.println("LISP风格的语法分析树：》》》");
        System.out.println(parser.statement().toStringTree(parser));

        System.out.println("tokens：》》》");

        for (Token token : tokenStream.getTokens()) {
            System.out.println(token);
        }
    }
}
