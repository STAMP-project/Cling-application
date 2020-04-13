/*

 * Tue Mar 03 19:32:23 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ErrorCollector;
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
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.bad.throw.eol", "msg.bad.throw.eol", 1959);
      assertEquals(17, astRoot0.getLength());
      assertEquals(1959, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      Node node0 = parser0.createName((-3459), "msg.no.paren.parms", (Node) null);
      assertNotNull(node0);
      assertEquals((-3459), node0.getType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      PropertyGet propertyGet0 = new PropertyGet(486, 43);
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
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = (-23);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("[objerct Call]");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "[objerct Call]", 2077);
      assertEquals(0, astRoot0.getPosition());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(2077, astRoot0.getBaseLineno());
      assertEquals(14, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("return", "return", 146);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(5, astRoot0.getLength());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(146, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("uS>[U,YES-C");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "S", 40);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ] after element list (S#40)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(true).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false).when(compilerEnvirons0).isStrictMode();
      doReturn(true, true, false, true, false).when(compilerEnvirons0).isXmlAvailable();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("msg.no.paren.after.with");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "msg.no.paren.after.with", 2);
      assertEquals(2, astRoot0.getLineno());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 96;
      StringReader stringReader0 = new StringReader("0n+\"I~.Sz#gi2EmR");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "error reporter", 12);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (error reporter#12)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("default");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "default", 15);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // not a valid default namespace statement. Syntax is: default xml namespace = EXPRESSION; (default#15)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("U20d*g0%K--$`lVAM", "U20d*g0%K--$`lVAM", 13);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("xK.+Y>q~x]");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "xK.+Y>q~x]", 86);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (xK.+Y>q~x]#86)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("Y:", "Y:", 65536);
      assertEquals(2, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(65536, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.reportWarningAsError());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("while (", "while (", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (while (#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.continue.nonloop", "msg.continue.nonloop", 65536);
      assertEquals(20, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(true).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(true, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.continue.nonloop", "msg.continue.nonloop", 5);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (msg.continue.nonloop#5)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("bqK}%:HHMU,[}|q|5N", "bqK}%:HHMU,[}|q|5N", 65536);
      assertEquals(12, astRoot0.getLength());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isRecordingComments();
      doReturn(true, true, false).when(compilerEnvirons0).isStrictMode();
      doReturn(false, true, false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).reportWarningAsError();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      doReturn((EvaluatorException) null).when(errorReporter0).runtimeError(anyString() , anyString() , anyInt() , anyString() , anyInt());
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("QZ-b<BH<_/*G)6v+o", "msg.no.paren.after.with", 16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("(new String*\"");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "0", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated string literal (0#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("<MDA=6,a");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "<MDA=6,a", 16);
      assertEquals(8, astRoot0.getLength());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(16, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      Context.getContext();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("var");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "var", 43);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(3, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(43, astRoot0.getLineno());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("", "", 24);
      parser0.pushScope(astRoot0);
      parser0.pushScope(astRoot0);
      assertEquals(0, astRoot0.getLength());
      assertEquals(24, astRoot0.getLineno());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(24, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      parser0.defineSymbol(65536, (String) null, false);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(7, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("{YcXn;w2aKJ", "_I@)l^%<-rbh!!. ", 13);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing } in compound statement (_I@)l^%<-rbh!!. #13)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("factory.makeContext() returned Context instance already associated with some thread", "pIXEH::6K#h", 254);
      assertEquals(83, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("-lA9qUf*");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "-lA9qUf*", 24);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (-lA9qUf*#24)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parser parser0 = new Parser();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser1 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser1.parse("DuXkg)={&!~U", "DuXkg)={&!~U", 65536);
      // Undeclared exception!
      try { 
        parser0.simpleAssignment(astRoot0, astRoot0);
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
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("b++_Goe>y ]Uwa,Q,", "Zy&G>", (-5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -5
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("break");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "$7ED5PQv=AOVt)-D8L.", (-1263));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1263
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("false", "false", 65536);
      // Undeclared exception!
      try { 
        parser0.destructuringAssignmentHelper(1, astRoot0, astRoot0, "false");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side. (false#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+llP^F");
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "{J<x`S(", 21);
      assertEquals(21, astRoot0.getBaseLineno());
      assertEquals(6, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("try", "msg.syntax", 13);
      assertEquals("msg.syntax", astRoot0.getSourceName());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(3, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("GP4e0;zUI>>w't;(FRi");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "GP4e0;zUI>>w't;(FRi", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated string literal (GP4e0;zUI>>w't;(FRi#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("(m&B);XFa>B/NT[jG", "getUTCSeconds", 33);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("pIXEH::6K#h");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "pIXEH::6K#h", 122);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(122, astRoot0.getLineno());
      assertEquals(9, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("@<;z");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, (String) null, 100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("v9Y$(5[D3n,}");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "v9Y$(5[D3n,}", (-554));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -554
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("92!|@}y},#tq");
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "92!|@}y},#tq", 65536);
      assertEquals(65536, astRoot0.getEndLineno());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("xIG.@QdIlbqGk", "?@APDPKI", 146);
      assertEquals(13, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(146, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("debugger;\n");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, (String) null, 65536);
      assertEquals(9, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("throw");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "throw", 30);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (throw#30)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0);
      NativeArray nativeArray0 = new NativeArray(65536);
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(objectLiteral0).getElements();
      // Undeclared exception!
      try { 
        parser0.destructuringObject(objectLiteral0, (-54), "_qHSIjcxoq", objectLiteral0, nativeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader(";s<WbEc");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, ";s<WbEc", 10);
      assertEquals(7, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(10, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("vA2!=n@NE5");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "vA2!=n@NE5", 8);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (vA2!=n@NE5#8)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      StringReader stringReader0 = new StringReader("z_)jS-''");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "z_)jS-''", 65536);
      assertEquals(9, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("do", "pIXEH::6K#h", 355);
      assertEquals(2, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = parser0.parse("/*_QEz5F{#", "/*_QEz5F{#", 128);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(astRoot0.hasChildren());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(9, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(128, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("Y:", "Y:", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (Y:#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("continue", "continue", 22);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(7, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(22, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      StringReader stringReader0 = new StringReader("^W.('.");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "DuXkg", 127);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(5, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(127, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("{})7>D[gM", "msg.too.many.constructor.args", 145);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (msg.too.many.constructor.args#145)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.reportError("msg.bad.id.strict", "String");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // \"{0}\" is not a valid identifier for this use in strict mode.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("m0s..$Q+|4z-inD<oH");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "m0s..$Q+|4z-inD<oH", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // illegal character (m0s..$Q+|4z-inD<oH#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("for", "for", 65536);
      assertEquals(3, astRoot0.getLength());
      assertEquals(65536, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = (-23);
      AstRoot astRoot0 = parser0.parse("object", (String) null, 120);
      assertEquals(6, astRoot0.getLength());
      assertEquals(120, astRoot0.getLineno());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("GRT:a_s}/!$D>Zj;$", "GRT:a_s}/!$D>Zj;$", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (GRT:a_s}/!$D>Zj;$#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("(new Boolean(true))");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "(new Boolean(true))", 1);
      assertEquals(19, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("J(?Ysvvm>YO@%E?{o");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "J(?Ysvvm>YO@%E?{o", 2077);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(17, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("KH");
      parser0.parse((Reader) stringReader0, "KH", 65536);
      parser0.defineSymbol(109, "KH", false);
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("false");
      parser0.parse((Reader) stringReader0, "false", 3366);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(1, "false");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=5, ts.tokenBeg=4, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
