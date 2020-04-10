/*

 * Tue Mar 03 19:33:05 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlExpression;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      ObjectProperty objectProperty0 = new ObjectProperty();
      // Undeclared exception!
      try { 
        parser0.destructuringAssignmentHelper(110, objectProperty0, (Node) null, "setDate");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      XmlElemRef xmlElemRef0 = new XmlElemRef();
      Name name0 = new Name(20);
      PropertyGet propertyGet0 = new PropertyGet(xmlElemRef0, name0);
      XmlExpression xmlExpression0 = new XmlExpression(0, propertyGet0);
      Node node0 = parser0.simpleAssignment(propertyGet0, xmlExpression0);
      assertEquals(41, name0.getType());
      assertEquals("35", node0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 23;
      // Undeclared exception!
      try { 
        parser0.setIsGenerator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      ElementGet elementGet0 = new ElementGet(190, (-1554));
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(2, name0);
      Parser.PerFunctionVariables parser_PerFunctionVariables0 = parser0.new PerFunctionVariables(functionNode0);
      // Undeclared exception!
      try { 
        parser0.createDestructuringAssignment(122, elementGet0, elementGet0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = new Parser();
      NativeArray nativeArray0 = new NativeArray(65536);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      boolean boolean0 = parser0.destructuringObject(objectLiteral0, 0, "msg.bad.return", objectLiteral0, nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("return", "return", (-1564));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("with (", "with (", 24);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (with (#24)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("K<*`T'78Z", "msg.no.name.after.coloncolon", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (msg.no.name.after.coloncolon#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("++", "BINDNAME", 11);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (BINDNAME#11)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.not.class", (String) null, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isXmlAvailable());
      
      compilerEnvirons0.setXmlAvailable(false);
      AstRoot astRoot0 = parser0.parse("msg.const.redecl", "msg.const.redecl", 933);
      assertEquals(933, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("j+{V,C/*C!r ", (String) null, 122);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("<|='TT>T[", "<|='TT>T[", (-1487));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("yESeyUPh6)7=[c>=", "yESeyUPh6)7=[c>=", 65536);
      assertEquals(13, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("cgN:/BjEjn'ed", "cgN:/BjEjn'ed", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated regular expression literal (cgN:/BjEjn'ed#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("switch (", "switch (", 2160);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(2160, astRoot0.getBaseLineno());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.nestingOfFunction = (-3943);
      AstRoot astRoot0 = parser0.parse("0m$^\"~@j", "0m$^\"~@j", 929);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(7, astRoot0.getLength());
      assertEquals(929, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("'A'9t#xB6ni/tC2rQp;", "'A'9t#xB6ni/tC2rQp;", 65536);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(5, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("default", "i", 14);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // not a valid default namespace statement. Syntax is: default xml namespace = EXPRESSION; (i#14)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      ElementGet elementGet0 = new ElementGet(65536);
      Name name0 = new Name(1);
      FunctionNode functionNode0 = new FunctionNode(823, name0);
      Parser.PerFunctionVariables parser_PerFunctionVariables0 = parser0.new PerFunctionVariables(functionNode0);
      // Undeclared exception!
      try { 
        parser0.createDestructuringAssignment(23, elementGet0, name0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("jSNJ;a^G-->ZB2XEO", "jSNJ;a^G-->ZB2XEO", 65536);
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("while", "leftContext", 11);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(5, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("[native code, arity=", "msg.up.arm", 14);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(1, astRoot0.getLength());
      assertEquals(14, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.bad.parms", "Zi .4R");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("Q2e*$|Of_2@15a%mNr", "Q2e*$|Of_2@15a%mNr", 65536);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(18, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("O6Q.*^", "O6Q.*^", (-1826));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1826
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("~Q..", "RZR", (-2992));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2992
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("msgG.ba(.decr", "J+21^~XBg@c:afH'=", 5040);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (J+21^~XBg@c:afH'=#5040)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("switch", "switch", 114);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(1, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(114, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null, (Set) null, (Set) null).when(compilerEnvirons0).getActivationNames();
      doReturn(errorCollector0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false, false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.nestingOfFunction = 65536;
      // Undeclared exception!
      try { 
        parser0.parse("msg.no.paren.catch", "no", 55);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Parser parser0 = new Parser();
      FunctionNode functionNode0 = new FunctionNode(65536, (Name) null);
      Parser.PerFunctionVariables parser_PerFunctionVariables0 = parser0.new PerFunctionVariables(functionNode0);
      parser0.defineSymbol(122, "i%c~G");
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      parser0.defineSymbol(104, (String) null);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(8, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("arg cannot be null", "zqlTi", 1639);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(1639, astRoot0.getEndLineno());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("<a~$PQm:G{0Jc2!&4", "n%", 1992);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(14, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("with", "with", 11);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(4, astRoot0.getLength());
      assertEquals(11, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("(new String(\"", "msg.equal.as.assign", (-3724));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("-m 7su.Q/9.s@N}1i", "StopIteration", 112);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (StopIteration#112)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("!{0L/", "!{0L/", 127);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(".ze:J:", ".ze:J:", 65536);
      // Undeclared exception!
      try { 
        parser0.simpleAssignment(astRoot0, astRoot0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=6, ts.tokenBeg=5, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("break", "", 17);
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(4, astRoot0.getLength());
      assertEquals(17, astRoot0.getBaseLineno());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("try", "return", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing { before try block (return#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("n&Q$?z2Db4zo@", "n&Q$?z2Db4zo@", 23);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(23, astRoot0.getEndLineno());
      assertEquals(13, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(true, false).when(compilerEnvirons1).isIdeMode();
      doReturn(true, false, false).when(compilerEnvirons1).isStrictMode();
      doReturn(false).when(compilerEnvirons1).isXmlAvailable();
      doReturn(true, false, true, false).when(compilerEnvirons1).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons1);
      // Undeclared exception!
      try { 
        parser0.parse("h8~3}$j;}O", "assign", (-2928));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("B74iGIzNc,?", "B74iGIzNc,?", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (B74iGIzNc,?#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("{7oy;Fg_n^7B,dBj6", "{7oy;Fg_n^7B,dBj6", 2);
      assertEquals(17, astRoot0.getLength());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("UYC.m{Sv5@r1;,Ya5");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "UYC.m{Sv5@r1;,Ya5", 126);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (UYC.m{Sv5@r1;,Ya5#126)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("if", "Yhio", (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("const", "const", (-692));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("throw", "`3o{{T// ", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (`3o{{T// #65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("G27*{!NWBnrv", "<|='TT>T[", 161);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // invalid property id (<|='TT>T[#161)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("j+{V,C/*C!r ", "LOG10E", (-2380));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("J+21^~XBg@c:afH'=", "msg.var.hides.arg", 25);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("F-@C_P17sy>X6Y4==,M", "F-@C_P17sy>X6Y4==,M", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (F-@C_P17sy>X6Y4==,M#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("ea7:xHYwURT[H)]A*", "ea7:xHYwURT[H)]A*", 3718);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(astRoot0.hasChildren());
      assertFalse(compilerEnvirons0.reportWarningAsError());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("for", "for", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ( after for (for#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 71;
      // Undeclared exception!
      try { 
        parser0.parse("arguments", "msg", 74);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.AstRoot cannot be cast to com.google.javascript.rhino.head.ast.FunctionNode
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("continue", "continue", 3960);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(7, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(3960, astRoot0.getBaseLineno());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("W{%}AwI|Gb_T|W\"j<");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "[I6q .J+5leM.y^+hF/", 3718);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(3718, astRoot0.getBaseLineno());
      assertEquals(15, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("bad opcode for class reference", "GQzNcm", 2);
      assertEquals(30, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(2, astRoot0.getEndLineno());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(";p3:(A:n0qiW}An`Y}", "IIwZy<W fF$dZf^wi", 82);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(82, astRoot0.getEndLineno());
      assertEquals(15, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = parser0.parse("*.0T[{m]0E4Y/", "_", 65536);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(13, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("J(+Km$j+f", "mkg.no.colon.case", 65536);
      assertEquals(9, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("msg.in.after.for.name", "for", 100);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(39, "msg.in.after.for.name");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=21, ts.tokenBeg=20, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
