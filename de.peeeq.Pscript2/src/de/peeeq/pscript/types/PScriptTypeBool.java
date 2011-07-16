package de.peeeq.pscript.types;


public class PScriptTypeBool extends PscriptType {

	private static final PScriptTypeBool instance = new PScriptTypeBool();

	// make constructor private as we only need one instance
	private PScriptTypeBool() {}
	
	@Override
	public boolean isSubtypeOf(PscriptType other) {
		return other instanceof PScriptTypeBool;
	}


	@Override
	public String getName() {
		return "Bool";
	}

	@Override
	public String getFullName() {
		return "Bool";
	}

	public static PScriptTypeBool instance() {
		return instance;
	}

}