/*

 * Tue Mar 03 19:33:18 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashSet;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        parser0.parse("msg.bad.throw.eol", "eval", 50);
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
      Node node0 = parser0.createName(1999, ";Vm`:t~V !", (Node) null);
      assertNotNull(node0);
      assertEquals(1999, node0.getType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 141;
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
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      boolean boolean0 = parser0.destructuringObject(objectLiteral0, 2, "org", objectLiteral0, (List<String>) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("with (", "with (", 1207);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (with (#1207)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.no.with.strict", "msg.no.with.strict", (-2478));
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("[16N^,w]Kt!cCO Wm", "[16N^,w]Kt!cCO Wm", 11);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(11, astRoot0.getBaseLineno());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(18, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(true).when(compilerEnvirons0).isIdeMode();
      doReturn(true).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false).when(compilerEnvirons0).isStrictMode();
      doReturn(true, true, false, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("msg.no.with.strict", "msg.no.with.strict", 22);
      assertTrue(astRoot0.hasChildren());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(22, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("{}3+qgI6C3s1TnE$", "{}3+qgI6C3s1TnE$", 1467);
      assertTrue(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("[io{Gc*rds4E* ", ", ts.tokenBeg=", 65536);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(1, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("xcF//Tc", "h", (-27));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("F,<ShoNUJw+x[F8wHX", "LHo0h+I[:gBe'ELOd\"", 65536);
      assertEquals(18, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("sWXT>=?&hR*rIwz!BO<", "XU0", 88);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(19, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("/dlhHw/?[r>", "/dlhHw/?[r>", 2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (/dlhHw/?[r>#2)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("g/VnHO3-Vh<A~Q>-)o", "g/VnHO3-Vh<A~Q>-)o", 12);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (g/VnHO3-Vh<A~Q>-)o#12)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("typeof", "typeof", (-523));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -523
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("@h^`cpY7f--emF8os");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "}:,8?-;(2h2rOP0z!<", 65536);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(17, astRoot0.getLength());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("AgSFU_&g=S", "@}[#lB7X)W;x<D+S", 0);
      assertEquals(0, astRoot0.getBaseLineno());
      assertEquals(10, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("msg.no.paren.with", "msg.no.paren.with", 65536);
      assertEquals(17, astRoot0.getLength());
      assertTrue(compilerEnvirons0.recoverFromErrors());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      assertTrue(compilerEnvirons0.isStrictMode());
      
      compilerEnvirons0.setStrictMode(false);
      AstRoot astRoot0 = parser0.parse("function ", "function ", 1);
      assertTrue(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("@}[#lB7X)W;x<D+S", "@}[#lB7X)W;x<D+S", 0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after .@
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(false).when(compilerEnvirons1).isIdeMode();
      doReturn(false).when(compilerEnvirons1).isReservedKeywordAsIdentifier();
      doReturn(true, false, true).when(compilerEnvirons1).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons1);
      // Undeclared exception!
      try { 
        parser0.parse("msg.no.with.strict", "msg.no.with.strict", (-2478));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2478
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("\"|0i&\"", "\"|0i&\"", 10);
      assertEquals(6, astRoot0.getLength());
      assertFalse(astRoot0.isInStrictMode());
      assertEquals(10, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("switch", "switch", 118);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(linkedHashSet0, linkedHashSet0).when(compilerEnvirons0).getActivationNames();
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isStrictMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.nestingOfFunction = 65536;
      AstRoot astRoot0 = parser0.parse("Zr", "Zr", 1);
      assertEquals(2, astRoot0.getLength());
      assertEquals(1, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("J1|a||g4C<", "this node type has no body", 35);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (this node type has no body#35)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      parser0.defineSymbol(22, (String) null, false);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.recoverFromErrors());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(92, (String) null, true);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("let", "let", 1857);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(3, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(1857, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("H%{Xg0,^MFY7-8*fC-fS", "H%{Xg0,^MFY7-8*fC-fS", 4);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing : after property id (H%{Xg0,^MFY7-8*fC-fS#4)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("try", "02)", 1480);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(3, astRoot0.getLength());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(1480, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("null symbol name", "null symbol name", 413);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (null symbol name#413)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("<OF{wi5l>#", "<OF{wi5l>#", (-1331));
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("with", "with", (-34));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("(new(", "(new(", 68);
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(5, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("Rg^{1Y<MU6dcD8P", "Rg^{1Y<MU6dcD8P", (-432));
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
        parser0.parse("+M?^Bz1Fw?XW", "V", (-1637));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1637
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("<OF{wi5l>#", "<OF{wi5l>#", 21);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (<OF{wi5l>##21)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("this node type has no body", "this node type has no body", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (this node type has no body#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("(,,>[", "(,,>[", 65536);
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(5, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("%=G;-$ .:Y)v..vj", "%=G;-$ .:Y)v..vj", (-16));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("o^f+cq,6oCP", "o^f+cq,6oCP", 1801);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (o^f+cq,6oCP#1801)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("W:{ZV$", "I(,,>[", 1962);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing } in compound statement (I(,,>[#1962)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse(" if (", " if (", 2616);
      assertEquals(5, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("const", "msg.in.after.for.name", 65536);
      assertEquals(5, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, astRoot0.getPosition());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("\n    ", "\n    ", 2);
      assertEquals(3, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(0, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("throw", "i^zgBw", (-50));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -50
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("-{>X%: _", "-{>X%: _", 2346);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // invalid property id (-{>X%: _#2346)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(";^9,'KxpGU1ye<:R; ", "@}[#lB7X)W;x<D+S", 882);
      assertEquals("@}[#lB7X)W;x<D+S", astRoot0.getSourceName());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(17, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(882, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("6mXld!oP!//o4}e&huI", "6mXld!oP!//o4}e&huI", 22);
      assertEquals(19, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      StringReader stringReader0 = new StringReader("(K`s)bWnLaVz,Z(R");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "(K`s)bWnLaVz,Z(R", 159);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("cGJ:7N@g,^Wqs#c-y^J", "cGJ:7N@g,^Wqs#c-y^J", 18);
      assertEquals(13, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(18, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("for", "for", 65536);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.nestingOfFunction = 1801;
      // Undeclared exception!
      try { 
        parser0.checkActivationName("arguments", 2017);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("continue", "head", 11);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // continue must be inside loop (head#11)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("l5HlI3&&U!C)QY{uo.", "l5HlI3&&U!C)QY{uo.", 65536);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(18, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.reportError("msg.fn.redecl");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // TypeError: redeclaration of function {0}.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("ioQ(}+g(G*", "ioQ(}+g(G*", 65536);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(65536, astRoot0.getLineno());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(10, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("for", "for", 2);
      assertEquals(3, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 141;
      AstRoot astRoot0 = parser0.parse("length", "language version", 150);
      assertEquals(6, astRoot0.getLength());
      assertEquals(150, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.nestingOfFunction = (-1883);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse(".~^B", ".~^B", 65536);
      assertEquals(4, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = parser0.parse("function ", "function ", 1);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(1, astRoot0.getEndLineno());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(9, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("W&5S:yh'l5W", "W&5S:yh'l5W", (-1801));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("true", "$", 117);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(117, astRoot0.getBaseLineno());
      assertEquals(3, astRoot0.getLength());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("DcI(`a-1t3(m,n}O?", "DcI(`a-1t3(m,n}O?", 19);
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(18, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(19, astRoot0.getLineno());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("%=G;-$ .:Y)v..vj", "$@]0*OW", 47);
      parser0.createDestructuringAssignment(47, astRoot0, astRoot0);
      assertEquals(16, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("blink", "322y#XM7;X&", 964);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(3, "322y#XM7;X&");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=5, ts.tokenBeg=4, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("void", "Xd}p`+Y", 65536);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(4, astRoot0.getLength());
      assertEquals("Xd}p`+Y", astRoot0.getSourceName());
  }
}
