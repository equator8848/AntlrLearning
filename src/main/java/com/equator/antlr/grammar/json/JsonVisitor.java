// Generated from /Users/bytedance/Desktop/workplace/code/AntlrLearning/src/main/resources/grammar/json/Json.g4 by ANTLR 4.9.1
package grammar.json;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(grammar.json.JsonParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(grammar.json.JsonParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(grammar.json.JsonParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(grammar.json.JsonParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(grammar.json.JsonParser.ValueContext ctx);
}