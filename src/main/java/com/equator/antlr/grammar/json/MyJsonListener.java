package com.equator.antlr.grammar.json;

import grammar.json.JsonListener;
import grammar.json.JsonParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyJsonListener implements JsonListener {
    @Override
    public void enterJson(JsonParser.JsonContext ctx) {
        System.out.println("enterJson");
    }

    @Override
    public void exitJson(JsonParser.JsonContext ctx) {

    }

    @Override
    public void enterObj(JsonParser.ObjContext ctx) {

    }

    @Override
    public void exitObj(JsonParser.ObjContext ctx) {

    }

    @Override
    public void enterPair(JsonParser.PairContext ctx) {

    }

    @Override
    public void exitPair(JsonParser.PairContext ctx) {

    }

    @Override
    public void enterArr(JsonParser.ArrContext ctx) {

    }

    @Override
    public void exitArr(JsonParser.ArrContext ctx) {

    }

    @Override
    public void enterValue(JsonParser.ValueContext ctx) {

    }

    @Override
    public void exitValue(JsonParser.ValueContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
