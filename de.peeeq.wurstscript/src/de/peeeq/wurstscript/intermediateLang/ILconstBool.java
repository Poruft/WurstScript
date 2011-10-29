package de.peeeq.wurstscript.intermediateLang;

import de.peeeq.wurstscript.types.PScriptTypeBool;
import de.peeeq.wurstscript.types.PscriptType;

public class ILconstBool extends ILconst {

	private boolean val;

	public ILconstBool(String boolVal) {
		if (boolVal.equals("true")) {
			this.val = true;
		} else if (boolVal.equals("false")) {
			this.val = false;
		} else {
			throw new Error("unsupported boolean constant");
		}
		
	}
	
	public ILconstBool(boolean b) {
		val = b;
	}

	public boolean getVal() {
		return val;
	}

	@Override
	public String print() {
		return val ? "true" : "false";
	}

	public boolean not() {
		return !val;
	}

	@Override
	public void printJass(StringBuilder sb, int indent) {
		sb.append(print());
	}

	@Override
	public PscriptType getType() {
		return PScriptTypeBool.instance();
	}

	
	

}