/*
* generated by Xtext
*/
package yang.manager.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import yang.manager.services.YangGrammarAccess;

public class YangParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private YangGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected yang.manager.parser.antlr.internal.InternalYangParser createParser(XtextTokenStream stream) {
		return new yang.manager.parser.antlr.internal.InternalYangParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "YangFile";
	}
	
	public YangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(YangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}