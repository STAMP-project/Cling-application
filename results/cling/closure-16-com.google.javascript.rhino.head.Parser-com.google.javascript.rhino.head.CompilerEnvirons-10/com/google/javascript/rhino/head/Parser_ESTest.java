/*

 * Tue Mar 03 19:34:44 GMT 2020
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
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
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
      AstRoot astRoot0 = parser0.parse("~Ak&&c0?UtD\"Log", "msg.bad.return", 85);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(14, astRoot0.getLength());
      assertEquals(85, astRoot0.getEndLineno());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
      // Undeclared exception!
      try { 
        parser0.parse("function", "function", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (function#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.bad.throw.eol", "msg.bad.throw.eol", (-4));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      Node node0 = parser0.createName((-1083929126), "XMLATTR", (Node) null);
      assertNotNull(node0);
      assertEquals((-1083929126), node0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("@a(A,Z", "eHD!X1+", (-1994));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1994
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 1758;
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
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("l9Y_!=1SKSG", "l9Y_!=1SKSG", 83);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (l9Y_!=1SKSG#83)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536, 131111);
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = parser0.destructuringObject(objectLiteral0, 120, "function", objectLiteral0, nativeArray0);
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(boolean0);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("return", "R7j DU5k)", 12);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(5, astRoot0.getLength());
      assertEquals(12, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.reportWarningAsError());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      doReturn((EvaluatorException) null).when(errorReporter0).runtimeError(anyString() , anyString() , anyInt() , anyString() , anyInt());
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.bad.break", "m2JI2l0]U$", (-766));
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
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("[,?", "[,?", (-2838));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2838
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("_//?A}\"r%T", "2>zbmqVPQ3URC", 13);
      assertEquals(1, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("S*BXt%<5xXc", "S*BXt%<5xXc", 117);
      assertEquals(11, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("3V,N;/Cgu|Q!AEO<c", "3V,N;/Cgu|Q!AEO<c", 65536);
      assertEquals(15, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(65536, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      // Undeclared exception!
      try { 
        parser0.parse("1*7/qTA@IUC\", JB`", "1*7/qTA@IUC\", JB`", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (1*7/qTA@IUC\", JB`#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("default:\n", "msg.no.brace.try", 4);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // not a valid default namespace statement. Syntax is: default xml namespace = EXPRESSION; (msg.no.brace.try#4)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("debugger", "debugger", 1640);
      assertEquals(7, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(1640, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("v}J--(>[DsG<T>;_", "v}J--(>[DsG<T>;_", (-2831));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("N>>U[*<$tV|a", "N>>U[*<$tV|a", 20);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (N>>U[*<$tV|a#20)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("msg.const.redecl");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "msg.const.redecl", 65536);
      assertEquals(16, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("K*~gTb<E+Sj|2k+1x", "K*~gTb<E+Sj|2k+1x", 145);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(true, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.continue.outside", "Invalid operator: ", 119);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("[native code for ", "[native code for ", 105);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).reportWarningAsError();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.bad.object.init", "msg.bad.object.init");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("super", (String) null, 161);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("(new @oleanfalse))", "(new @oleanfalse))", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement ((new @oleanfalse))#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("switch", "setUTCDate", (-638));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("(D@7Tp;qN|v[", "(D@7Tp;qN|v[", 65536);
      assertEquals(12, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, astRoot0.getPosition());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.defineSymbol(31, (String) null, false);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(85, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("let", "d#uMVjEQ(=\"3+u", 120);
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(3, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals("d#uMVjEQ(=\"3+u", astRoot0.getSourceName());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(120, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("S?<:s[L_{?8rvv");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "S?<:s[L_{?8rvv", 65536);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // arg cannot be null
         //
         verifyException("com.google.javascript.rhino.head.ast.AstNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("[nativecode for ", "[nativecode for ", 65536);
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
      AstRoot astRoot0 = parser0.parse("with", "with", 67);
      assertEquals(4, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("e5&Sv\"0{hepPr#|H>", "e5&Sv\"0{hepPr#|H>", 112);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated string literal (e5&Sv\"0{hepPr#|H>#112)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("hfd9[@c=-", "gTb", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (gTb#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Parser parser0 = new Parser();
      PropertyGet propertyGet0 = new PropertyGet(65536);
      // Undeclared exception!
      try { 
        parser0.simpleAssignment(propertyGet0, propertyGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("uHXgeG*E?+z:i 7", "_m@x", 180);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (_m@x#180)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("Ftq%.<<@GP:", "#/50lX3l[?Y?V@6mue", 41);
      assertEquals(11, astRoot0.getLength());
      assertEquals(41, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("(D@7Tp;qN|v[", "(D@7Tp;qN|v[", 65536);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("while");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, (String) null, 105);
      assertEquals(5, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(105, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      doReturn((EvaluatorException) null).when(errorReporter0).runtimeError(anyString() , anyString() , anyInt() , anyString() , anyInt());
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("hfd9[@c=-", "hfd9[@c=-", 145);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("cx5e<c>r+PW,LX", "cx5e<c>r+PW,LX", 121);
      assertEquals(14, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("oAq>N=),M!sGlTR=9,", "\"s>I._h7b", 1);
      assertEquals(18, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("$n:{^:S", "$n:{^:S", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error ($n:{^:S#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("const", "const", 23);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(5, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("throw", "throw", (-1458));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1458
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse(";M", ";M", (-1562));
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
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("(new Boolean(false))", "(new Boolean(false))", (-1));
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
      // Undeclared exception!
      try { 
        parser0.parse("n.%^//?Vv2E*", "EMPTY", (-2968));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isRecordingComments();
      doReturn(false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false, false, false).when(compilerEnvirons0).recoverFromErrors();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      StringReader stringReader0 = new StringReader("0G0/2E?<f6b(4DJ^g");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "", 995);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("factory == null", (String) null, 6);
      assertEquals(6, astRoot0.getEndLineno());
      assertEquals(14, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("continue", ".t", (-1458));
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
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("() {\n\t", "pCWc9]zEn;aC? Qum", 11);
      assertEquals(11, astRoot0.getBaseLineno());
      assertEquals(6, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("for (", "for (", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (for (#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Parser parser0 = new Parser();
      FunctionNode functionNode0 = new FunctionNode();
      Parser.PerFunctionVariables parser_PerFunctionVariables0 = parser0.new PerFunctionVariables(functionNode0);
      // Undeclared exception!
      try { 
        parser0.createDestructuringAssignment(19, functionNode0, functionNode0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("SF+;<,b@3|^':]", "SF+;<,b@3|^':]", 65536);
      assertEquals(12, astRoot0.getLength());
      assertEquals(65536, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse("No id for constructor property", "No id for constructor property", 555);
      assertEquals(30, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(555, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("wp|{gy>Fbb2>", "wp|{gy>Fbb2>", 161);
      assertEquals(12, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(161, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.nestingOfFunction = 2314;
      AstRoot astRoot0 = parser0.parse("length", "CNq", 65536);
      assertEquals(6, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals("CNq", astRoot0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      AstRoot astRoot0 = parser0.parse("msg.anon.generator.returns", "1*7/qTA@IUC\", JB`", 18);
      // Undeclared exception!
      try { 
        parser0.createName(26, "arguments", astRoot0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.AstRoot cannot be cast to com.google.javascript.rhino.head.ast.FunctionNode
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("function", "function", 65536);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(8, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(65536, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("@{F:2msa:DZ", "@{F:2msa:DZ", 1957);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(11, astRoot0.getLength());
      assertEquals(1957, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("\"L)\"0vkW[|Yeoj6n", "\"L)\"0vkW[|Yeoj6n", 44);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(17, astRoot0.getLength());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("u(&OI)-", "u(&OI)-", 65536);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(7, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("IFNE", "out of range field", 4);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(9, "out of range field");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=4, ts.tokenBeg=3, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("void", "}7i(vmXDW", 31);
      assertEquals(4, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(31, astRoot0.getBaseLineno());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
  }
}
