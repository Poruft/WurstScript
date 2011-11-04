//generated by parseq
package de.peeeq.wurstscript.ast;

class WParametersImpl extends WParameters implements AstElementIntern {
 	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	protected void other_setParentToThis(WParameter t) {
		((AstElementIntern) t).setParent(this);
	}
	protected void other_clearParent(WParameter t) {
		((AstElementIntern) t).setParent(null);
	}
	@Override public void accept(WPackage.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(NativeFunc.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WParameters.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(FuncSignature.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		for (WParameter i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	private boolean attr_attrNearestPackage_isCached = false;
	private PackageOrGlobal attr_attrNearestPackage_cache;
	public PackageOrGlobal attrNearestPackage() {
		if (!attr_attrNearestPackage_isCached) {
			attr_attrNearestPackage_cache = de.peeeq.wurstscript.attributes.AttrNearestPackage.calculate(this);
			attr_attrNearestPackage_isCached = true;
		}
		return attr_attrNearestPackage_cache;
	}
	private boolean attr_attrNearestFuncDef_isCached = false;
	private FuncDef attr_attrNearestFuncDef_cache;
	public FuncDef attrNearestFuncDef() {
		if (!attr_attrNearestFuncDef_isCached) {
			attr_attrNearestFuncDef_cache = de.peeeq.wurstscript.attributes.AttrNearestFuncDef.calculate(this);
			attr_attrNearestFuncDef_isCached = true;
		}
		return attr_attrNearestFuncDef_cache;
	}
	private boolean attr_attrNearestClassDef_isCached = false;
	private ClassDef attr_attrNearestClassDef_cache;
	public ClassDef attrNearestClassDef() {
		if (!attr_attrNearestClassDef_isCached) {
			attr_attrNearestClassDef_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.calculate(this);
			attr_attrNearestClassDef_isCached = true;
		}
		return attr_attrNearestClassDef_cache;
	}
}
