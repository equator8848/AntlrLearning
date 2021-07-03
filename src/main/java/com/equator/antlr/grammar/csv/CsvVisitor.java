// Generated from /Users/bytedance/Desktop/workplace/code/AntlrLearning/src/main/resources/grammar.csv/Csv.g4 by ANTLR 4.9.1
package grammar.csv;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsvVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsvParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CsvParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CsvParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CsvParser.FieldContext ctx);
}