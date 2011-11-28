//generated by parseq
package de.peeeq.wurstscript.jassAst;

class JassStmtReturnImpl implements JassStmtReturn, JassAstElementIntern {
	JassStmtReturnImpl(JassExpr returnValue) {
		if (returnValue == null) throw new IllegalArgumentException();
		((JassAstElementIntern)returnValue).setParent(this);
		this.returnValue = returnValue;
	}

	private JassAstElement parent;
	public JassAstElement getParent() { return parent; }
	public void setParent(JassAstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private JassExpr returnValue;
	public void setReturnValue(JassExpr returnValue) {
		if (returnValue == null) throw new IllegalArgumentException();
		((JassAstElementIntern)this.returnValue).setParent(null);
		((JassAstElementIntern)returnValue).setParent(this);
		this.returnValue = returnValue;
	} 
	public JassExpr getReturnValue() { return returnValue; }

	public JassAstElement get(int i) {
		switch (i) {
			case 0: return returnValue;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 1;
	}
	public JassStmtReturn copy() {
		return new JassStmtReturnImpl(returnValue.copy());
	}
	@Override public void accept(JassStmtIf.Visitor v) {
		returnValue.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtReturn.Visitor v) {
		returnValue.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtLoop.Visitor v) {
		returnValue.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStatements.Visitor v) {
		returnValue.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunctions.Visitor v) {
		returnValue.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunction.Visitor v) {
		returnValue.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassProg.Visitor v) {
		returnValue.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStatement.Visitor v) {
		returnValue.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(JassStatement.Matcher<T> matcher) {
		return matcher.case_JassStmtReturn(this);
	}
	@Override public void match(JassStatement.MatcherVoid matcher) {
		matcher.case_JassStmtReturn(this);
	}

	@Override public String toString() {
		return "JassStmtReturn(" + returnValue+")";
	}
}