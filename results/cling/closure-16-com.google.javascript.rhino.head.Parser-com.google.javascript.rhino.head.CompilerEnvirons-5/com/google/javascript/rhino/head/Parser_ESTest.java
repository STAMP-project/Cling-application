/*

 * Tue Mar 03 19:28:27 GMT 2020
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
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.Scope;
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
      // Undeclared exception!
      try { 
        parser0.parse("n,;V7wt(?p", "n,;V7wt(?p", (-1783));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.bad.throw.eol", "S", 155);
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = new AstRoot();
      // Undeclared exception!
      try { 
        parser0.destructuringAssignmentHelper((-2959), astRoot0, (Node) null, "|Kws_E|eG\"G&GREby)");
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
      parser0.nestingOfFunction = (-1517);
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
      AstRoot astRoot0 = parser0.parse("[]", "Z:InRb>}Q{]>NsAv", 65536);
      assertEquals("Z:InRb>}Q{]>NsAv", astRoot0.getSourceName());
      assertEquals(65536, astRoot0.getLineno());
      assertEquals(2, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("m|{<mzaO4", "m|{<mzaO4", 32);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // invalid property id (m|{<mzaO4#32)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("msg.destruct.assign.(o.init");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "iK", 65536);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(27, astRoot0.getLength());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("<command>", "&", 23);
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
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      doReturn((EvaluatorException) null).when(errorReporter0).runtimeError(anyString() , anyString() , anyInt() , anyString() , anyInt());
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.not.class", "IWl", 3304);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("A}eZdTpKCiydIuB6", "A}eZdTpKCiydIuB6", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (A}eZdTpKCiydIuB6#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("/A5:0%nnR8!}$foRd", "/A5:0%nnR8!}$foRd", 176);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated regular expression literal (/A5:0%nnR8!}$foRd#176)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse(" if ", "bak", (-1610612734));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1610612734
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("delete", "delete", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (delete#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      AstRoot astRoot0 = parser0.parse("(new Boolean(true))", "google", 2);
      assertEquals("google", astRoot0.getSourceName());
      assertEquals(19, astRoot0.getLength());
      assertEquals(2, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("default:\n", "oA", 2029);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // not a valid default namespace statement. Syntax is: default xml namespace = EXPRESSION; (oA#2029)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("l.>", "l.>", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (l.>#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("switch", "switch", 3507);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ( before switch expression (switch#3507)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader("(g*&N");
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, ":", (-2753));
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      parser0.compilerEnv = compilerEnvirons0;
      assertEquals(170, parser0.compilerEnv.getLanguageVersion());
      
      AstRoot astRoot0 = parser0.parse("QJZyW:H", "QJZyW:H", 65536);
      assertEquals(7, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse(" while (", " while (", 139);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file ( while (#139)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.setReservedKeywordAsIdentifier(false);
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.const.redecl", "-.YJs", 86);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (-.YJs#86)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("VS?.^s{}5.kd", "const", 65536);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      AstRoot astRoot0 = parser0.parse("KKujRDY:f6P=Ze", "zN8HlKI", 1098);
      assertEquals(14, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("[.}tO", "XGl0iB^H|", 1);
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(1, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(true).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(true, true, false).when(compilerEnvirons0).isStrictMode();
      doReturn(true, false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).reportWarningAsError();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.catch.unreachable", "parser", (-1610612734));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("!w%O%", "!w%O%", 123);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (!w%O%#123)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("(new Bool=an(true,)", "(new Bool=an(true,)", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error ((new Bool=an(true,)#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("'+wK_o}-cjhsn+[4|%'", "", 65536);
      assertEquals(19, astRoot0.getLength());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("KKujRDY:f6P=Ze");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "KKujRDY:f6P=Ze", 1981);
      parser0.pushScope(astRoot0);
      parser0.pushScope(astRoot0);
      assertEquals(14, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      parser0.defineSymbol(65536, (String) null);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(65536, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("msg.parm.redecl", "msg.send.newborn", 153);
      parser0.defineSymbol(153, "Ziq!X`|[/S");
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("//0\u0002]t", "decodeURIComponent", 1083);
      assertEquals(0, astRoot0.getLength());
      assertEquals(1083, astRoot0.getBaseLineno());
      assertEquals("decodeURIComponent", astRoot0.getSourceName());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("with", "with", (-527));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -527
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("Qd?-EoC\"uPL6PM~3f", "Qd?-EoC\"uPL6PM~3f", (-539));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -539
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Parser parser0 = new Parser();
      PropertyGet propertyGet0 = new PropertyGet();
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
  public void test36()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("break", "break", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unlabelled break must be inside loop or switch (break#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("try ", "try ", 2652);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing { before try block (try #2652)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      CompilerEnvirons compilerEnvirons1 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons1.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("<command>", "<command>", (-3924));
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
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("urT1RIo5oO;LhJPn>>", "urT1RIo5oO;LhJPn>>", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (urT1RIo5oO;LhJPn>>#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = (-339);
      AstRoot astRoot0 = parser0.parse("return", "return", 4);
      assertEquals(5, astRoot0.getLength());
      assertEquals(4, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("const", "const", 65536);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(5, astRoot0.getLength());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("[\n", (String) null, 2731);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ] after element list
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("throw", "throw", (-3552));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3552
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Parser parser0 = new Parser();
      NativeArray nativeArray0 = new NativeArray(65536);
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(objectLiteral0).getElements();
      // Undeclared exception!
      try { 
        parser0.destructuringObject(objectLiteral0, 8, "", objectLiteral0, nativeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("z:z7*U,{&z", "z:z7*U,{&z", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // invalid property id (z:z7*U,{&z#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(";q5[Am6", ";q5[Am6", 70);
      assertEquals(70, astRoot0.getLineno());
      assertEquals(7, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("Awey$6-DO<B/@J", "Awey$6-DO<B/@J", 65536);
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(14, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("6,=W# #pS<A77=t?", "6,=W# #pS<A77=t?", 171);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("VfWe:)<Il?d0GX<z", "VfWe:)<Il?d0GX<z", 147);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (VfWe:)<Il?d0GX<z#147)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse(" for ", "_r |eIniMDone", (-123));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -123
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("continue", "continue", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // continue must be inside loop (continue#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(65536);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("var", "DOTDOT", 65536);
      assertEquals(0, astRoot0.getPosition());
      assertEquals(3, astRoot0.getLength());
      
      Node node0 = parser0.destructuringAssignmentHelper(0, arrayLiteral0, arrayLiteral0, "var");
      assertEquals((-1), node0.getLineno());
      assertEquals("158", node0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("GFZ8~j{^%ZY#", "GFZ8~j{^%ZY#", (-1126));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.reportError("msg.extra.trailing.semi", 52, 52);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Extraneous trailing semicolon
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("IE+8<gp(N", "IE+8<gp(N", (-41));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -41
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("+{am", "+{am", (-33));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      AstRoot astRoot0 = parser0.parse("length", "length", 1);
      assertEquals(6, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("WJvL *++@x", "WJvL *++@x", 3);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid increment operand. (WJvL *++@x#3)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("@{,3Kio4Uf*$a(}&", "}y69& rT", 376);
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(16, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Parser parser0 = new Parser();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      AstRoot astRoot0 = parser0.parse("msg.const.redecl", "msg.const.redecl", 18);
      // Undeclared exception!
      try { 
        parser0.destructuringAssignmentHelper(6, astRoot0, arrayLiteral0, "msg.const.redecl");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side. (msg.const.redecl#18)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = new AstRoot();
      parser0.currentScope = (Scope) astRoot0;
      // Undeclared exception!
      try { 
        parser0.defineSymbol(2, "google");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }
}
