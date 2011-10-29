//generated by parseq
package de.peeeq.wurstscript.ast;

class WPackageImpl implements WPackage, SortPosIntern {
	WPackageImpl(WPos source, String name, WImports imports, WEntities elements) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)source).setParent(this);
		this.source = source;
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
		if (imports == null) throw new IllegalArgumentException();
		((SortPosIntern)imports).setParent(this);
		this.imports = imports;
		if (elements == null) throw new IllegalArgumentException();
		((SortPosIntern)elements).setParent(this);
		this.elements = elements;
	}

	private SortPos parent;
	public SortPos getParent() { return parent; }
	public void setParent(SortPos parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private WPos source;
	public void setSource(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)this.source).setParent(null);
		((SortPosIntern)source).setParent(this);
		this.source = source;
	} 
	public WPos getSource() { return source; }

	private String name;
	public void setName(String name) {
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
	} 
	public String getName() { return name; }

	private WImports imports;
	public void setImports(WImports imports) {
		if (imports == null) throw new IllegalArgumentException();
		((SortPosIntern)this.imports).setParent(null);
		((SortPosIntern)imports).setParent(this);
		this.imports = imports;
	} 
	public WImports getImports() { return imports; }

	private WEntities elements;
	public void setElements(WEntities elements) {
		if (elements == null) throw new IllegalArgumentException();
		((SortPosIntern)this.elements).setParent(null);
		((SortPosIntern)elements).setParent(this);
		this.elements = elements;
	} 
	public WEntities getElements() { return elements; }

	public SortPos get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return imports;
			case 2: return elements;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 3;
	}
	public WPackage copy() {
		return new WPackageImpl(source.copy(), name, imports.copy(), elements.copy());
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		imports.accept(v);
		elements.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		imports.accept(v);
		elements.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		imports.accept(v);
		elements.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		imports.accept(v);
		elements.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		imports.accept(v);
		elements.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(PackageOrGlobal.Matcher<T> matcher) {
		return matcher.case_WPackage(this);
	}
	@Override public void match(PackageOrGlobal.MatcherVoid matcher) {
		matcher.case_WPackage(this);
	}

	@Override public <T> T match(TopLevelDeclaration.Matcher<T> matcher) {
		return matcher.case_WPackage(this);
	}
	@Override public void match(TopLevelDeclaration.MatcherVoid matcher) {
		matcher.case_WPackage(this);
	}

	@Override public <T> T match(WScope.Matcher<T> matcher) {
		return matcher.case_WPackage(this);
	}
	@Override public void match(WScope.MatcherVoid matcher) {
		matcher.case_WPackage(this);
	}

	@Override public String toString() {
		return "WPackage(" + source + ", " +name + ", " +imports + ", " +elements+")";
	}
	private boolean attr_attrExportedFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrExportedFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrExportedFunctions() {
		if (!attr_attrExportedFunctions_isCached) {
			attr_attrExportedFunctions_cache = de.peeeq.wurstscript.attributes.AttrExportedFunctions.calculate(this);
			attr_attrExportedFunctions_isCached = true;
		}
		return attr_attrExportedFunctions_cache;
	}
	private boolean attr_attrScopeVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopeVariables_cache;
	public java.util.Map<String, VarDef> attrScopeVariables() {
		if (!attr_attrScopeVariables_isCached) {
			attr_attrScopeVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculate(this);
			attr_attrScopeVariables_isCached = true;
		}
		return attr_attrScopeVariables_cache;
	}
	private boolean attr_attrScopePackageVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePackageVariables_cache;
	public java.util.Map<String, VarDef> attrScopePackageVariables() {
		if (!attr_attrScopePackageVariables_isCached) {
			attr_attrScopePackageVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePackage(this);
			attr_attrScopePackageVariables_isCached = true;
		}
		return attr_attrScopePackageVariables_cache;
	}
	private boolean attr_attrScopePublicVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePublicVariables_cache;
	public java.util.Map<String, VarDef> attrScopePublicVariables() {
		if (!attr_attrScopePublicVariables_isCached) {
			attr_attrScopePublicVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePublic(this);
			attr_attrScopePublicVariables_isCached = true;
		}
		return attr_attrScopePublicVariables_cache;
	}
	private boolean attr_attrScopePublicReadVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePublicReadVariables_cache;
	public java.util.Map<String, VarDef> attrScopePublicReadVariables() {
		if (!attr_attrScopePublicReadVariables_isCached) {
			attr_attrScopePublicReadVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePublicRead(this);
			attr_attrScopePublicReadVariables_isCached = true;
		}
		return attr_attrScopePublicReadVariables_cache;
	}
	private boolean attr_attrScopeFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopeFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopeFunctions() {
		if (!attr_attrScopeFunctions_isCached) {
			attr_attrScopeFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculate(this);
			attr_attrScopeFunctions_isCached = true;
		}
		return attr_attrScopeFunctions_cache;
	}
	private boolean attr_attrScopePackageFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopePackageFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopePackageFunctions() {
		if (!attr_attrScopePackageFunctions_isCached) {
			attr_attrScopePackageFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePackage(this);
			attr_attrScopePackageFunctions_isCached = true;
		}
		return attr_attrScopePackageFunctions_cache;
	}
	private boolean attr_attrScopePublicFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopePublicFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopePublicFunctions() {
		if (!attr_attrScopePublicFunctions_isCached) {
			attr_attrScopePublicFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePublic(this);
			attr_attrScopePublicFunctions_isCached = true;
		}
		return attr_attrScopePublicFunctions_cache;
	}
	private boolean attr_attrPackageElements_isCached = false;
	private com.google.common.collect.Multimap<String, WEntity> attr_attrPackageElements_cache;
	public com.google.common.collect.Multimap<String, WEntity> attrPackageElements() {
		if (!attr_attrPackageElements_isCached) {
			attr_attrPackageElements_cache = de.peeeq.wurstscript.attributes.AttrPackageElements.calculate(this);
			attr_attrPackageElements_isCached = true;
		}
		return attr_attrPackageElements_cache;
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
	private boolean attr_attrExportedVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrExportedVariables_cache;
	public java.util.Map<String, VarDef> attrExportedVariables() {
		if (!attr_attrExportedVariables_isCached) {
			attr_attrExportedVariables_cache = de.peeeq.wurstscript.attributes.AttrExportedVariables.calculate(this);
			attr_attrExportedVariables_isCached = true;
		}
		return attr_attrExportedVariables_cache;
	}
	private boolean attr_attrExportedTypes_isCached = false;
	private java.util.Map<String, TypeDef> attr_attrExportedTypes_cache;
	public java.util.Map<String, TypeDef> attrExportedTypes() {
		if (!attr_attrExportedTypes_isCached) {
			attr_attrExportedTypes_cache = de.peeeq.wurstscript.attributes.AttrExportedTypes.calculate(this);
			attr_attrExportedTypes_isCached = true;
		}
		return attr_attrExportedTypes_cache;
	}
}