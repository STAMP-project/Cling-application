/*

 * Tue Mar 03 19:35:38 GMT 2020
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
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import java.io.Reader;
import java.io.StringReader;
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
      AstRoot astRoot0 = parser0.parse("v3f|XY, r85", "v3f|XY, r85", 65536);
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(11, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.bad.throw.eol", "\"h<J*jSU9,*,lo72", 18);
      assertEquals(17, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(18, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      Node node0 = parser0.createName(921, "}zmNz", (Node) null);
      assertEquals(921, node0.getType());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = (-1078);
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
  public void test04()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("[Fsi]b6E", (String) null, 19);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("o1LnO\"\"Gx5*#y?>2<$", "o1LnO\"\"Gx5*#y?>2<$", 65536);
      assertEquals(18, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("++", (String) null, 13);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(false, false).when(compilerEnvirons1).isIdeMode();
      doReturn(false).when(compilerEnvirons1).isReservedKeywordAsIdentifier();
      doReturn(false, false, false, false).when(compilerEnvirons1).isXmlAvailable();
      doReturn(false).when(compilerEnvirons1).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons1);
      // Undeclared exception!
      try { 
        parser0.parse("msg.no.paren.for", "msg.no.paren.for", 19);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("[native code, arity=", "use strict", 170);
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(true, true).when(compilerEnvirons1).isIdeMode();
      doReturn(true).when(compilerEnvirons1).isReservedKeywordAsIdentifier();
      doReturn(true, true, true).when(compilerEnvirons1).isStrictMode();
      doReturn(true, true, true, false).when(compilerEnvirons1).isXmlAvailable();
      doReturn(true).when(compilerEnvirons1).reportWarningAsError();
      Parser parser0 = new Parser(compilerEnvirons1);
      AstRoot astRoot0 = parser0.parse("msg.no.paren.for", "msg.no.paren.for", 19);
      assertEquals(16, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("=| <Gf.R8X!#.W+f/", "N,S$o", 10);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(17, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("/ETVAR", "/ETVAR", (-2101));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2101
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("(~4QSHh2KkX+'Th$e<", "(~4QSHh2KkX+'Th$e<", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ) in parenthetical ((~4QSHh2KkX+'Th$e<#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        parser0.parse("typeof", "var", 1488);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("delete", (String) null, 109);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 109;
      AstRoot astRoot0 = parser0.parse("~lIVr", "~lIVr", 2);
      assertEquals(5, astRoot0.getLength());
      assertEquals(2, astRoot0.getLineno());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("debugger;\n", "function", 145);
      assertEquals(9, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(145, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("X2lSTx@c=L8", "X2lSTx@c=L8", 65536);
      assertEquals(11, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("b2D.^@UR)ya`*>", (String) null, 58);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("vCh6?8:", "vCh6?8:", 3117);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (vCh6?8:#3117)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("@7", "@7", 3139);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after .@ (@7#3139)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.continue.outside", "msg.continue.outside", 10);
      assertEquals(20, astRoot0.getLength());
      assertEquals(10, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.no.paren.after.parms", (String) null, 2745, 2745);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("continue", "sZ-pC=0##[!~{Ft", 65536);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(7, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("switch", "switch", 113);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(113, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("var");
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "sjPg#a<2m!Flk0ksm", 0);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(3, astRoot0.getLength());
      assertEquals(0, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.defineSymbol((-3010), (String) null, true);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(823, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parser parser0 = new Parser();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(objectLiteral0).getElements();
      // Undeclared exception!
      try { 
        parser0.destructuringObject(objectLiteral0, (-2008), "o({6?Bx@x;^x", objectLiteral0, nativeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("let", "K", (-1950));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("[<{Yz1h9I.9Mjy", "EyVSR", (-82));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -82
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("8>r@`N9X", "8>r@`N9X", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (8>r@`N9X#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("arg cannot be null", "}", (-896));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("msg.bad.incr", "EyVSR", 65536);
      parser0.defineSymbol(87, "msg.double.switch.default", true);
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("{sA", "{sA", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing } in compound statement ({sA#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("with (", "with (", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (with (#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("X.S6pG( u&wk;x", " `nZ`o", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ) after argument list ( `nZ`o#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("Ocd/g%-Ebm~VFb", "e", 87);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (e#87)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("o({6?Bx@x;^x", "o({6?Bx@x;^x", 89);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing : after property id (o({6?Bx@x;^x#89)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Parser parser0 = new Parser();
      ThrowStatement throwStatement0 = new ThrowStatement((-1738));
      Name name0 = new Name(24, 25);
      PropertyGet propertyGet0 = new PropertyGet(throwStatement0, name0, (-3576));
      parser0.simpleAssignment(propertyGet0, propertyGet0);
      assertEquals(41, name0.getType());
      assertEquals("41", name0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("try", "_UcbpgD!hsbD", 65536);
      assertEquals(0, astRoot0.getPosition());
      assertEquals(3, astRoot0.getLength());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorCollector0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false, true).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("<init>", "<init>", 153);
      assertEquals(5, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(153, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("+i!yx<<9Gl?%", "WC:zz", 26);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(12, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("b[yU)ExNEa]pw@Ik}", "b[yU)ExNEa]pw@Ik}", 104);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(17, astRoot0.getLength());
      assertEquals(104, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(true, true).when(compilerEnvirons1).isIdeMode();
      doReturn(true).when(compilerEnvirons1).isXmlAvailable();
      doReturn(false, false).when(compilerEnvirons1).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons1);
      AstRoot astRoot0 = parser0.parse("&YdH{;fE=]M", "Z", 27);
      assertEquals(10, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(27, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      compilerEnvirons0.setXmlAvailable(false);
      AstRoot astRoot0 = parser0.parse("default", "A", 15);
      assertEquals(7, astRoot0.getLength());
      assertEquals(15, astRoot0.getLineno());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("T,)unHcEH", "T,)unHcEH", 153);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (T,)unHcEH#153)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("X*Hb$],1F0^Eya", "X*Hb$],1F0^Eya", 65536);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(14, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse((Reader) null, "q", 39);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("yield", "}", 65536);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(4, astRoot0.getLength());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("\n}", "\n}", 815);
      assertEquals(2, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(815, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("throw", "throw", 29);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (throw#29)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse(";|O\"^!~g(~a", "C8,=F", (-2012));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("do ", "+[j/", 65536);
      assertEquals(3, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(",E7/*(_99r%.cAnB", "msg.let.redecl", 15);
      assertEquals(15, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorCollector0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("E%~,%CBZ\",", "E%~,%CBZ\",", 105);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("PH5eQ0B:6Jox/t:fi", "PH5eQ0B:6Jox/t:fi", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (PH5eQ0B:6Jox/t:fi#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("for (", "\n}", 1610);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (
         // }#1610)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("M.(sy4?|$Fd-g?a", "M.(sy4?|$Fd-g?a", 1482);
      assertEquals(15, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("|~bj{]f;5]1zW}", "|~bj{]f;5]1zW}", (-3356));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.addError("msg.no.parm", 65536, 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing formal parameter
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("y+pS6Vv%?!bYe\"/*", "*BzhWKh2>w", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (*BzhWKh2>w#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("remove() already called for current element", "remove() already called for current element", (-1670));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 109;
      AstRoot astRoot0 = parser0.parse("freeze", "freeze", 65536);
      assertEquals(6, astRoot0.getLength());
      assertEquals(65536, astRoot0.getBaseLineno());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("function", "debugger;\n", 1862);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(8, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(1862, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("S:hs <=", "S:hs <=", 65536);
      assertEquals(7, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("vmMyR;[+$~{,s+0*^", "vmMyR;[+$~{,s+0*^", (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("catch (", "catch (", 82);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(astRoot0.hasChildren());
      assertEquals(82, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.method.not.found", "msg.method.not.found", 65536);
      // Undeclared exception!
      try { 
        parser0.destructuringAssignmentHelper(1, astRoot0, astRoot0, "msg.method.not.found");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side. (msg.method.not.found#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("msg.generator.returns", "msg.generator.returns", 0);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(15, "msg.generator.returns", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=21, ts.tokenBeg=20, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
