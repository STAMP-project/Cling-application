/*

 * Tue Mar 03 19:33:57 GMT 2020
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
      AstRoot astRoot0 = parser0.parse("msg.bad.throw.eol", "msg", 104);
      assertEquals(17, astRoot0.getLength());
      assertEquals("msg", astRoot0.getSourceName());
      assertEquals(104, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      Node node0 = parser0.createName(65536, "", (Node) null);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertNotNull(node0);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(65536, node0.getType());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("Kvv.:S2cc4Dz`H_Y#");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "Kvv.:S2cc4Dz`H_Y#", 65536);
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 5;
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
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("Kvv.:S2cc4Dz`H_Y#");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, (String) null, 65536);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("W|vJd\"", "W|vJd\"", 15);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated string literal (W|vJd\"#15)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setXmlAvailable(false);
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("^~5CQj{Z0fN7.@79VM", "^~5CQj{Z0fN7.@79VM", (-1338));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      assertTrue(compilerEnvirons0.isXmlAvailable());
      
      compilerEnvirons0.setXmlAvailable(false);
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("msg.no.paren.switch", "msg.no.paren.switch", 1446);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("{a}J", ":", 7);
      assertEquals(4, astRoot0.getLength());
      assertEquals(7, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("l} ,Kz!^/A*/", "l} ,Kz!^/A*/", 38);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(10, astRoot0.getLength());
      assertEquals(38, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("5p*xuM9&5hfz)y", "0tEA>-", 1610);
      assertEquals("0tEA>-", astRoot0.getSourceName());
      assertEquals(14, astRoot0.getLength());
      
      parser0.defineSymbol(109, "Lmkpg#3Uy)O8<DTT");
      assertTrue(compilerEnvirons0.recoverFromErrors());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 13;
      AstRoot astRoot0 = parser0.parse("(eval)", "u-,\f.", 45);
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(6, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("newChild had siblings in addChildAfter", "$", (-3342));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.undef.prop.delete", "msg.undef.prop.delete", 113);
      assertEquals(21, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(" @ npNim=JY}Q?Ri:Fz", "No id for constructor property", 4);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(19, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("NVv@*Z", "NVv@*Z", 2022);
      assertEquals(6, astRoot0.getLength());
      assertEquals(2022, astRoot0.getBaseLineno());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse(";.SI^C3n8E", ";.SI^C3n8E", (-680));
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
        parser0.parse("while (", "while (", 1783);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (while (#1783)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorCollector0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false, true).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, true).when(compilerEnvirons0).isXmlAvailable();
      doReturn(true, false).when(compilerEnvirons0).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("m.<SVSnAPd<'$SZR", "m.<SVSnAPd<'$SZR", 538);
      assertEquals(11, astRoot0.getLength());
      assertEquals(538, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("[~IgE;E<P+`d>#1", "[~IgE;E<P+`d>#1", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ] after element list ([~IgE;E<P+`d>#1#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.too.deep.parser.recursion", "msg.too.deep.parser.recursion");
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
        parser0.parse("H%", "g/5.8Ie+", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (g/5.8Ie+#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("_aTG..|`>$wr4>-n{", "b", 124);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (b#124)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(")/1Eq\"C\"'4+b", ")/1Eq\"C\"'4+b", 4);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, astRoot0.getPosition());
      assertEquals(8, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(4, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("switch", "switch", 65536);
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(65536, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("<UKG:Azl3T@\"o%", "<UKG:Azl3T@\"o%", 2);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(1, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      parser0.defineSymbol((-2604), (String) null);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(2, (String) null, true);
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
      AstRoot astRoot0 = parser0.parse("Fj-B;w&vzCtD>0", "Fj-B;w&vzCtD>0", 1);
      assertEquals(14, astRoot0.getLength());
      assertEquals(1, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isRecordingComments();
      doReturn(false, false).when(compilerEnvirons0).isStrictMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("kWP_bj_//Z&");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "msg.no.curly.let", 985);
      assertEquals(985, astRoot0.getBaseLineno());
      assertEquals(7, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("No Context associated with current Thread", "No Context associated with current Thread", (-1572));
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
  public void test33()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("oK2P4++", "pl-gu2o3-[1|Y", 65536);
      assertTrue(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("vL&LUHZ[+{<l1", "input", 0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // invalid property id
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = parser0.parse("try", "try", 65536);
      assertEquals(65536, astRoot0.getBaseLineno());
      assertEquals(3, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("<a_'Z", "<a_'Z", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("this", " 9}NLwL&WTzsQ", 65536);
      assertTrue(compilerEnvirons0.isIdeMode());
      assertEquals(3, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse(":c[n7{.aV8Vv", "", 1977);
      assertEquals(13, astRoot0.getLength());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(1977, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("bm:v,mw-hC bybI?(w", "bm:v,mw-hC bybI?(w", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (bm:v,mw-hC bybI?(w#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("!2h,X82&", "msg.no.brace.block", 1685);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals("msg.no.brace.block", astRoot0.getSourceName());
      assertEquals(8, astRoot0.getLength());
      assertEquals(1685, astRoot0.getLineno());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorCollector0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false, false, false).when(compilerEnvirons0).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("&`|;$h:@", "Kvv.:S2cc4Dz`H_Y#", 65536);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(" if (", " if (", 65536);
      assertEquals(5, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("debugger;\n");
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "debugger;\n", 12);
      assertEquals(9, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(12, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("throw", "throw", 25);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (throw#25)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      NativeArray nativeArray0 = new NativeArray(65536);
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(objectLiteral0).getElements();
      // Undeclared exception!
      try { 
        parser0.destructuringObject(objectLiteral0, 0, "c", objectLiteral0, nativeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("_F^6hAg^{@`pY*(4Z7", "_F^6hAg^{@`pY*(4Z7", 4);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(18, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse("do", "do", 2);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(2, astRoot0.getLength());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(2, astRoot0.getBaseLineno());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("J:;-Kfni$4eicE7rk(", "J:;-Kfni$4eicE7rk(", 65536);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(18, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("for", "for", (-2556));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2556
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = parser0.parse("continue", "$HrInJW}v/+", 2258);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(2258, astRoot0.getLineno());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(7, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("S.(_xg`@kh%,", "byte", 1132);
      assertEquals(6, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(1132, astRoot0.getLineno());
      assertFalse(compilerEnvirons0.reportWarningAsError());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("^~5CQj{Z0fN7.@79VM", "^~5CQj{Z0fN7.@79VM", 3417);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(18, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(3417, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("false", "false", 65536);
      // Undeclared exception!
      try { 
        parser0.createDestructuringAssignment(0, astRoot0, astRoot0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side. (false#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.reportError("msg.var.redecl", "msg.var.redecl");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // TypeError: redeclaration of var {0}.
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
        parser0.parse("No id for constructor property", "catch", (-321));
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("aFLuISW8B$O+[~{Gl", "aFLuISW8B$O+[~{Gl", 238);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(13, astRoot0.getLength());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(238, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 5;
      AstRoot astRoot0 = parser0.parse("msg.no.brace.block", "msg.no.brace.block", 36);
      assertEquals(36, astRoot0.getLineno());
      assertEquals(18, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("8m0@qDe*1DX:s7?Z", "8m0@qDe*1DX:s7?Z", 24);
      assertEquals(16, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("](F<R$qCg,7v", "com.google.javascript.rhino.head.ast.ArrayLiteral", (-1997));
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("msg.bad.decr", "", 238);
      assertEquals(0, astRoot0.getPosition());
      assertEquals(12, astRoot0.getLength());
      assertEquals("", astRoot0.getSourceName());
      assertEquals(238, astRoot0.getLineno());
      
      parser0.defineSymbol(154, "");
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("AXmf36T=_UDQ", "AXmf36T=_UDQ", 65536);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(2, "P");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=12, ts.tokenBeg=11, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
