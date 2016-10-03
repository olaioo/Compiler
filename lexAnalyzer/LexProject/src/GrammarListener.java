// Generated from Grammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(GrammarParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(GrammarParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declarationPart}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationPart(GrammarParser.DeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declarationPart}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationPart(GrammarParser.DeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(GrammarParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(GrammarParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attributionPart}.
	 * @param ctx the parse tree
	 */
	void enterAttributionPart(GrammarParser.AttributionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attributionPart}.
	 * @param ctx the parse tree
	 */
	void exitAttributionPart(GrammarParser.AttributionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loopFor}.
	 * @param ctx the parse tree
	 */
	void enterLoopFor(GrammarParser.LoopForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loopFor}.
	 * @param ctx the parse tree
	 */
	void exitLoopFor(GrammarParser.LoopForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loopForPart}.
	 * @param ctx the parse tree
	 */
	void enterLoopForPart(GrammarParser.LoopForPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loopForPart}.
	 * @param ctx the parse tree
	 */
	void exitLoopForPart(GrammarParser.LoopForPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loopForPart2}.
	 * @param ctx the parse tree
	 */
	void enterLoopForPart2(GrammarParser.LoopForPart2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loopForPart2}.
	 * @param ctx the parse tree
	 */
	void exitLoopForPart2(GrammarParser.LoopForPart2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loopForPart3}.
	 * @param ctx the parse tree
	 */
	void enterLoopForPart3(GrammarParser.LoopForPart3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loopForPart3}.
	 * @param ctx the parse tree
	 */
	void exitLoopForPart3(GrammarParser.LoopForPart3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loopWhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopWhile(GrammarParser.LoopWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loopWhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopWhile(GrammarParser.LoopWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(GrammarParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(GrammarParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditionalElse}.
	 * @param ctx the parse tree
	 */
	void enterConditionalElse(GrammarParser.ConditionalElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditionalElse}.
	 * @param ctx the parse tree
	 */
	void exitConditionalElse(GrammarParser.ConditionalElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexpression}.
	 * @param ctx the parse tree
	 */
	void enterLexpression(GrammarParser.LexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexpression}.
	 * @param ctx the parse tree
	 */
	void exitLexpression(GrammarParser.LexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexpressionPart}.
	 * @param ctx the parse tree
	 */
	void enterLexpressionPart(GrammarParser.LexpressionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexpressionPart}.
	 * @param ctx the parse tree
	 */
	void exitLexpressionPart(GrammarParser.LexpressionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(GrammarParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(GrammarParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(GrammarParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(GrammarParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lop2}.
	 * @param ctx the parse tree
	 */
	void enterLop2(GrammarParser.Lop2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lop2}.
	 * @param ctx the parse tree
	 */
	void exitLop2(GrammarParser.Lop2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarParser.NumberContext ctx);
}