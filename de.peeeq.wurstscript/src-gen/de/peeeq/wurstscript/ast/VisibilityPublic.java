//generated by parseq
package de.peeeq.wurstscript.ast;

public interface VisibilityPublic extends AstElement, VisibilityModifier {
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	VisibilityPublic copy();
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(JassGlobalBlock.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(VisibilityPublic.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(NativeType.Visitor v);
	public abstract void accept(VarDef.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(GlobalVarDef.Visitor v);
	public abstract void accept(VisibilityModifier.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public interface Visitor {
		void visit(VisibilityPublic visibilityPublic);
		void visit(WPos wPos);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(WPos wPos) {}
	}
}
