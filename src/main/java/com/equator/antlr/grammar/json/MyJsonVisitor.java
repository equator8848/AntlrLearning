package com.equator.antlr.grammar.json;

import com.equator.antlr.gen.JsonParser;
import com.equator.antlr.gen.JsonVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MyJsonVisitor<T> extends AbstractParseTreeVisitor<T> implements JsonVisitor<T> {
    @Override
    public T visitJson(JsonParser.JsonContext ctx) {
        System.out.println("visitJson");
        return visitChildren(ctx);
    }

    @Override
    public T visitObj(JsonParser.ObjContext ctx) {
        return null;
    }

    @Override
    public T visitPair(JsonParser.PairContext ctx) {
        return null;
    }

    @Override
    public T visitArr(JsonParser.ArrContext ctx) {
        return null;
    }

    @Override
    public T visitValue(JsonParser.ValueContext ctx) {
        return null;
    }
}
