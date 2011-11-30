package de.peeeq.wurstscript.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTests extends PscriptTest {

	@Test
	public void plus() {
		assertOk("plus", "3 + 7 == 10");
	}
	
	@Test
	public void minus() {
		assertOk("minus", "3 * 4 == 12");
	}
	
	@Test
	public void err_assign() {
		assertError("minus", "unexpected '='", "x = 12");
	}
	
	private String makeProg(String booleanExpr) {
		String prog = "package test {\n" +
				"native testFail(string msg)\n" +
				"native testSuccess()\n" +
				"init {\n" +
				"int x = 3\n" +
				"int y = 4\n" +
				"int z = 5\n" +
				"string a = \"bla\"\n" +
				"string b = \"blub\"\n" +
				"if " + booleanExpr + " {\n" +
				"testSuccess()\n" +
				"}\n" +
				"}\n" +
				"}\n";
		return prog;
	}
	
	public void assertOk(String name, String booleanExpr) {
		String prog = makeProg(booleanExpr);
		testAssertOk(name, true, prog);
	}

	
	
	public void assertError(String name, String errorMessage, String booleanExpr) {
		String prog = makeProg(booleanExpr);
		testAssertErrors(name, true, prog, errorMessage);
	}

}