/*

 * Tue Mar 03 19:31:08 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.EcmaError;
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
import java.util.Locale;
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
      AstRoot astRoot0 = parser0.parse("msg.bad.throw.eol", "msg.no.paren.catch", 4);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      Node node0 = parser0.createName(127, ")] # 6w", (Node) null);
      assertNotNull(node0);
      assertEquals("127", node0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("A$39+oo(ihWr,y- ", "A$39+oo(ihWr,y- ", 57343);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (A$39+oo(ihWr,y- #57343)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 31;
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
        parser0.parse("[]", "[]", (-56));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("etV<#&_h", "E", 25);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // illegal character (E#25)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.no.while.do", "Z7!_BTK'ZDdGuV6]H", 1961);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (Z7!_BTK'ZDdGuV6]H#1961)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(true, false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, true, false, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.no.while.do", "G,G3", 784);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (G,G3#784)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("{}`+j:%S syBw*", "", (-1887));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1887
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval((ErrorReporter) null);
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("weGqExgr|Xp|@//DD", "weGqExgr|Xp|@//DD", 1060);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: missing name after .@ (weGqExgr|Xp|@//DD#1060)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("/HJNzIu]-", "HSeUtSZi", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated regular expression literal (HSeUtSZi#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("jaMkR0{q<=]zFFs", "jaMkR0{q<=]zFFs", 65536);
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(15, astRoot0.getLength());
      assertEquals(65536, astRoot0.getLineno());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 12;
      // Undeclared exception!
      try { 
        parser0.parse("3Z{e2$(?XV=`", "_QTP,s;?", 12);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (_QTP,s;?#12)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("\"+h0i^;Ih(\"Gl?~;s]Gs", "\"+h0i^;Ih(\"Gl?~;s]Gs", 65536);
      assertEquals(20, astRoot0.getLength());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("default", "default", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // not a valid default namespace statement. Syntax is: default xml namespace = EXPRESSION; (default#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("u./OA%ev:od6paL~ ;P", "u./OA%ev:od6paL~ ;P", (-3616));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3616
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("while", "while", 3013);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ( before condition (while#3013)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, true, true).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.no.while.do", "Z7!_BTK'ZDdGuV6]H", 1961);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (Z7!_BTK'ZDdGuV6]H#1961)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("Z.O^))eb");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "Z.O^))eb", 4);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (Z.O^))eb#4)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 12;
      // Undeclared exception!
      try { 
        parser0.parse("D:expected return type ", "D:expected return type ", 12);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (D:expected return type #12)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("[em-S;fkI", "L>/ZDW0hWI", 153);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ] after element list (L>/ZDW0hWI#153)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.dup.obj.lit.prop.strict", "msg.dup.obj.lit.prop.strict");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("s%H/p[[", "s%H/p[[", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ] after element list (s%H/p[[#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("TySRUDRRAHf.rK(wq$)?", "TySRUDRRAHf.rK(wq$)?", 102);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (TySRUDRRAHf.rK(wq$)?#102)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("switch", "switch", 65536);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Locale locale0 = Locale.GERMAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      compilerEnvirons0.setActivationNames(set0);
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.nestingOfFunction = 41;
      // Undeclared exception!
      try { 
        parser0.parse("msg.bad.return", "msg.bad.return", (-12));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval(errorCollector0);
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("@[@6-qG", "A", 1435);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: missing name after .@ (A#1435)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("var", (String) null, 16);
      assertEquals(3, astRoot0.getLength());
      assertEquals(16, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("X58If*y1>s4vi|<E", "X58If*y1>s4vi|<E", (-1073741822));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("C={G~", "C={G~", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing : after property id (C={G~#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      parser0.defineSymbol(25, (String) null);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(Integer.MAX_VALUE, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Parser parser0 = new Parser();
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(objectLiteral0).getElements();
      // Undeclared exception!
      try { 
        parser0.destructuringObject(objectLiteral0, 0, "~xz/{|uJ:b8I", objectLiteral0, nativeArray0);
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
      
      AstRoot astRoot0 = parser0.parse("let", "(Ljava/lang/Object;)Z", 65536);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(3, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("with", "with", (-1218));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("oG9AtE+X9>jQ&@>", "oG9AtE+X9>jQ&@>", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after .@ (oG9AtE+X9>jQ&@>#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("uu6?-o'^#?7\"9uw", "uu6?-o'^#?7\"9uw", (-3188));
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
      PropertyGet propertyGet0 = new PropertyGet(38, 65536);
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
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("kE+?)3z~mp++uY~", "kE+?)3z~mp++uY~", 2900);
      assertEquals(15, astRoot0.getLength());
      assertEquals(2900, astRoot0.getBaseLineno());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("+R;hcecy", "+R;hcecy", 128);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // illegal character (+R;hcecy#128)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("<})(h1W^]I<", ", ts.tokenBeg=", 82);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (, ts.tokenBeg=#82)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("this", "Y", 65536);
      assertEquals("Y", astRoot0.getSourceName());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(3, astRoot0.getLength());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("Y&=P5uKGI[t!", "Y&=P5uKGI[t!", 65536);
      assertEquals(12, astRoot0.getLength());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setRecoverFromErrors(false);
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("\"+h0i^;Ih(\"Gl?~;s]Gs", (String) null, 2242);
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(19, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("vv..p)e#fA", "-H", 784);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // XML runtime not available (-H#784)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("0/Y,k;@u/F3)w7H$Y", "0/Y,k;@u/F3)w7H$Y", 38);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (0/Y,k;@u/F3)w7H$Y#38)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("\n}", "msg.no.paren.cond", (-180));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -179
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("throw", "throw", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (throw#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("Tj$rKq@ajWBSy?Y{", "Tj$rKq@ajWBSy?Y{", 23);
      assertEquals(16, astRoot0.getLength());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(23, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("js~B}7m-");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "js~B}7m-", 55296);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(55296, astRoot0.getEndLineno());
      assertEquals(8, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("do", "do", 65536);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(2, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setRecoverFromErrors(false);
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(";.]o$^@%.{5r\"|aS", ";.]o$^@%.{5r\"|aS", 127);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(127, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("myr==`WB=m#^:\"|l%C", "myr==`WB=m#^:\"|l%C", 65536);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(10, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(65536, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("tgq0RfgT:<[:G0F", "_z", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // illegally formed XML syntax (_z#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("for (", "for (", 1);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (for (#1)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("continue", (String) null, (-56));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.reportError("msg.no.paren.after.with", "B^");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ) after with-statement object
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("for", "for", (-2605));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("],4={0jmB#", "myr==`WB=m#^:\"|l%C", 68);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(10, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 415;
      AstRoot astRoot0 = parser0.parse("length", "length", 18);
      assertEquals(6, astRoot0.getLength());
      assertEquals(18, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("D:expected return type ", "D:expected return type ", (-1578));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("0/Y,k;@u/F3)w7H$Y", "D:expected return type ", 65536);
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("&--QtXh\tu8y", "&--QtXh\tu8y", 65536);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(11, astRoot0.getLength());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("true", "true", 1);
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(3, astRoot0.getLength());
      assertEquals(1, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("(new Boolean(false))", "(new Boolean(false))", (-3188));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.no.brace.switch", "msg.no.brace.switch", 65536);
      // Undeclared exception!
      try { 
        parser0.destructuringAssignmentHelper(22, astRoot0, astRoot0, "msg.no.brace.switch");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side. (msg.no.brace.switch#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("msg.no.paren.after.wth");
      parser0.parse((Reader) stringReader0, "msg.no.paren.after.wth", 16);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(1, "msg.no.paren.after.wth", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=22, ts.tokenBeg=21, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
