/*

 * Tue Mar 03 19:31:46 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
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
      AstRoot astRoot0 = parser0.parse("v]n2>h=FaJaSi=GxQ,", "v]n2>h=FaJaSi=GxQ,", 531);
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(18, astRoot0.getLength());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.bad.throw.eol", "I<b1{zJ", 1);
      assertTrue(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      Node node0 = parser0.createName(2203, "com.google.javascript.rhino.head.ScriptableObject$GetterSlot", (Node) null);
      assertEquals("2203", node0.toString());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 2379;
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
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("J;[nT]bAgDyc|7pR&*", "J;[nT]bAgDyc|7pR&*", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (J;[nT]bAgDyc|7pR&*#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorCollector0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false, false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("msg.no.paren.catch");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, ".[1", 104);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setXmlAvailable(false);
      StringReader stringReader0 = new StringReader("msg.no.brace.switch");
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "msg.no.brace.switch", 65536);
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(65536, astRoot0.getLineno());
      assertEquals(19, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("&l7V_J h]5a<<h`%%St", "&l7V_J h]5a<<h`%%St", 4);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(4, astRoot0.getBaseLineno());
      assertEquals(14, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("<;m<");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "zOB*3 Ull$Sga ", 1016);
      assertEquals(4, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(1016, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("y8H3O<=");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, (String) null, 526);
      assertEquals(7, astRoot0.getLength());
      assertEquals(526, astRoot0.getBaseLineno());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("Z''p8TB&~Om,]KNMDJ3");
      stringReader0.read();
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "Z''p8TB&~Om,]KNMDJ3", 65536);
      assertEquals(18, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("debugger", (String) null, 8);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(8, astRoot0.getBaseLineno());
      assertTrue(astRoot0.hasChildren());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(7, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("*1@a?5N1$q.", "*1@a?5N1$q.", 2515);
      assertEquals(11, astRoot0.getLength());
      assertEquals(2515, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("while");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "while", 104);
      assertEquals(5, astRoot0.getLength());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(104, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("msg.try.no.catchfinally");
      compilerEnvirons0.setReservedKeywordAsIdentifier(false);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "a", 12);
      assertEquals(23, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("[L8|:Y94J(fM6di");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "[L8|:Y94J(fM6di", 31);
      assertEquals(1, astRoot0.getLength());
      assertEquals(31, astRoot0.getBaseLineno());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader("Xhj7mpuZ>=Sb}/g92f");
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "Y`\"wwuu?>#skwOUEz. ", (-18));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -18
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse("k9pQ::N!nVN-T>>Hi", "k9pQ::N!nVN-T>>Hi", 2);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(2, astRoot0.getBaseLineno());
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("x%^TSuwI=U!>,gb?@");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "?u", 31);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (?u#31)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      StringReader stringReader0 = new StringReader("msg.no.with.strict");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "msg.no.with.strict", 8);
      assertEquals(18, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
      // Undeclared exception!
      try { 
        parser0.parse("function", "msg.bad.incr", 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader("switch");
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "switch", (-1199));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("wdC]4s*9&%");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "wdC]4s*9&%", 170);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(170, astRoot0.getEndLineno());
      assertEquals(10, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      parser0.defineSymbol(82, (String) null);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol((-56), (String) null);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader("let");
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "let", 65536);
      assertEquals(3, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      StringReader stringReader0 = new StringReader("null symbol name");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "msg.missing.semi", 608);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("< yuCxha {", "< yuCxha {", (-2828));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      FunctionNode functionNode0 = new FunctionNode(119, (Name) null);
      Parser.PerFunctionVariables parser_PerFunctionVariables0 = parser0.new PerFunctionVariables(functionNode0);
      parser0.defineSymbol(87, "msg.bad.incr");
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("Cannot have any pending top calls when executing a script with continuations");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "Cannot have any pending top calls when executing a script with continuations", 65536);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(76, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, astRoot0.getPosition());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader("(new Number(");
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "language version", 3);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("LW6r5J=-%ce;;", " ", (-2556));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader(";4[{0~z/^Wrr3\"");
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, ";4[{0~z/^Wrr3\"", 26);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(13, astRoot0.getLength());
      assertEquals(26, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("@.iw/r5abp#~<1<");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "error reporter", 8);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // XML runtime not available (error reporter#8)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("C[8S7m q:_+", ">|+~{h^7", (-3074));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      StringReader stringReader0 = new StringReader("5P;7(.<r=\\");
      CompilerEnvirons compilerEnvirons1 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons1, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "\"||3sjalRvf!=Oi", 65536);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("D  @?8u", "D  @?8u", 8);
      assertEquals(7, astRoot0.getLength());
      assertEquals(8, astRoot0.getLineno());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("r>K,fx#BH|3/fCN m7Lc");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "r>K,fx#BH|3/fCN m7Lc", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // illegal character (r>K,fx#BH|3/fCN m7Lc#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("{\n");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "{\n", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing } in compound statement ({
         // #65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("throw", (String) null, 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      Context.getContext();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("false", "yrc.", 109);
      assertEquals(4, astRoot0.getLength());
      assertEquals(109, astRoot0.getEndLineno());
      
      parser0.defineSymbol(122, "false");
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      StringReader stringReader0 = new StringReader("do");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "j", 1);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(1, astRoot0.getLineno());
      assertEquals(2, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse(":{IxgNC:KiruH//", "fa", 2);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(16, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(2, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("for", "msg.return.inconsistent", 65536);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = parser0.parse("/nKL", "/nKL", 4015);
      Parser parser1 = new Parser();
      AstRoot astRoot1 = parser1.parse("{}", "{}", 86);
      // Undeclared exception!
      try { 
        parser1.destructuringAssignmentHelper(143, astRoot1, astRoot0, "/nKL");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side. ({}#86)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.reportError("msg.bad.break", (String) null, 18, 7);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unlabelled break must be inside loop or switch
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse(")^{+#!6zABm|", (String) null, 65536);
      assertEquals(12, astRoot0.getLength());
      assertEquals(65536, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("remove() already called for current element", "remove() already called for current element", (-2944));
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("}35||}fEuG={JVGric*");
      parser0.parse((Reader) stringReader0, "}35||}fEuG={JVGric*", 65536);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 2379;
      StringReader stringReader0 = new StringReader("+$_t");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "calls", 1988);
      assertEquals(4, astRoot0.getLength());
      assertEquals(1988, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("function", "function", 1);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(8, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "5P;7(.<r=\\", 65536);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(28, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("++", "o#qG,B", (-204));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("true");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "cv9Kz1", 1841);
      assertEquals(0, astRoot0.getPosition());
      assertEquals(1841, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse("5P;7(.<r=\\", "5P;7(.<r=\\", 65536);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(65536, astRoot0.getEndLineno());
      assertEquals(10, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader("k9pQ::9!nV1N-T>>%~");
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "k9pQ::9!nV1N-T>>%~", 1988);
      Node node0 = parser0.createDestructuringAssignment(4, astRoot0, astRoot0);
      assertEquals(18, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(1988, node0.getLineno());
      assertEquals("158", node0.toString());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("SyntaxError", "SyntaxError", 206);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(22, "9.;4r5m");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=11, ts.tokenBeg=10, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
