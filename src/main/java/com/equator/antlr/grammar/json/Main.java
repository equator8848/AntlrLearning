package com.equator.antlr.grammar.json;

import com.equator.antlr.gen.JsonLexer;
import com.equator.antlr.gen.JsonParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        JsonLexer lexer = new JsonLexer(CharStreams.fromString("{\"name\":\"equator\",\"age\":23}"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JsonParser parser = new JsonParser(tokenStream);
        parser.addParseListener(new MyJsonListener());
        JsonParser.JsonContext context = parser.json();
        context.accept(new MyJsonVisitor<>());
        System.out.println(context.toStringTree(parser));
    }
}
