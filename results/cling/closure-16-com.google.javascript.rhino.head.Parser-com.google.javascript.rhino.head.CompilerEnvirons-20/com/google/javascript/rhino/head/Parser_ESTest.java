/*

 * Tue Mar 03 19:35:11 GMT 2020
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
import com.google.javascript.rhino.head.ast.Block;
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
      // Undeclared exception!
      try { 
        parser0.parse("j&&QM{FxINhIR~UF", "j&&QM{FxINhIR~UF", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (j&&QM{FxINhIR~UF#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.bad.throw.eol", "length", 687);
      assertEquals(17, astRoot0.getLength());
      assertEquals(687, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      Node node0 = parser0.createName(2724, "function", (Node) null);
      assertEquals("2724", node0.toString());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
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
      StringReader stringReader0 = new StringReader("return");
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "return", 766);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(5, astRoot0.getLength());
      assertEquals(766, astRoot0.getLineno());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(false, false, false).when(compilerEnvirons0).isXmlAvailable();
      StringReader stringReader0 = new StringReader("msg.bad.return");
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "msg.bad.return", 66);
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
      ErrorCollector errorCollector0 = new ErrorCollector();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorCollector0).when(compilerEnvirons0).getErrorReporter();
      doReturn(true, false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(true).when(compilerEnvirons0).isReservedKeywordAsIdentifier();
      doReturn(true, true, false).when(compilerEnvirons0).isStrictMode();
      doReturn(false, false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(true).when(compilerEnvirons0).reportWarningAsError();
      StringReader stringReader0 = new StringReader("msg.bad.return");
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "msg.bad.return", 65536);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("{}", (String) null, (-3426));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("NE|//(8|wvGvp!!tAMk");
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "+-C(j~p' r", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (+-C(j~p' r#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("<eval'ed string>", "<eval'ed string>", 65536);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(1, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("(obvrpTo<j.yYOg?/");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "(obvrpTo<j.yYOg?/", 86);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated regular expression literal ((obvrpTo<j.yYOg?/#86)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("delete");
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "delete", 160);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (delete#160)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      StringReader stringReader0 = new StringReader("this node type has no body");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "msgRno.sid.theffects", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (msgRno.sid.theffects#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("/=");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "hk=m1P0.)G>h67", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // unterminated regular expression literal (hk=m1P0.)G>h67#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("{y--HdBI>kyrRg1r)R", "msg.extra.trailing.semi", 2264);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (msg.extra.trailing.semi#2264)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.let.decl.not.in.block", "msg.let.decl.not.in.block", 65536);
      assertEquals(25, astRoot0.getLength());
      assertEquals(65536, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse(")9U?Bfxp9P:6I;RJKc`", (String) null, (-802));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("while (", "isNaN", 65536);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (isNaN#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(true, false).when(compilerEnvirons1).isIdeMode();
      doReturn(false).when(compilerEnvirons1).isReservedKeywordAsIdentifier();
      doReturn(false, false, false).when(compilerEnvirons1).isXmlAvailable();
      StringReader stringReader0 = new StringReader("msg.bad.return");
      Parser parser0 = new Parser(compilerEnvirons1);
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "msg.bad.return", 66);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after . operator (msg.bad.return#66)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("[object Call]", " ,hJ0btq&-e:@5W", 105);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ] after element list ( ,hJ0btq&-e:@5W#105)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.no.paren.parms", 38, 38);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("[tmv::hd>2|Dp", "error reporter", 120);
      assertEquals(1, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("!sEy^g(Z'Y\"{)q7g|");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "!sEy^g(Z'Y\"{)q7g|", (-1281));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader("var");
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "b+GRg1__p", 65536);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(3, astRoot0.getLength());
      assertEquals(65536, astRoot0.getBaseLineno());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.defineSymbol(65536, (String) null);
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(2, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("let", "wke", 74);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(3, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(74, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("null symbol name", "get", (-454));
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
      StringReader stringReader0 = new StringReader("*,<xx 4;p^v%|X{x");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "TIhZxf'@Bq $=ns)", 65536);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(16, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      StringReader stringReader0 = new StringReader("A)");
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      parser0.parse((Reader) stringReader0, "_L", 2098);
      parser0.defineSymbol(87, "u&nY{TdYAt=Y'`P.k7");
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse("with", "with", 1295);
      assertEquals(0, astRoot0.getPosition());
      assertEquals(4, astRoot0.getLength());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(1295, astRoot0.getLineno());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("new");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "eyS%/m;w%L>%", 1607);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(3, astRoot0.getLength());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(1607, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("-Mv*n/d1i1$@sc", "-Mv*n/d1i1$@sc", (-1561));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1561
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      Block block0 = new Block(65536);
      PropertyGet propertyGet0 = new PropertyGet();
      // Undeclared exception!
      try { 
        parser0.simpleAssignment(propertyGet0, block0);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("break", "break", 65536);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(4, astRoot0.getLength());
      assertEquals(65536, astRoot0.getLineno());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("+T92{<-Ae9");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "] dY,%1ebsWTh1(m9", (-2558));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2558
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("&R3)K,;Ibkq57?'MNIK", "&R3)K,;Ibkq57?'MNIK", 65536);
      assertEquals(19, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(65536, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("(Ljava/lang/Object;)Ljava/lang/String;", "msg.no.name.after.coloncolon", (-1610612734));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(false, false).when(compilerEnvirons1).isIdeMode();
      doReturn(true, false).when(compilerEnvirons1).recoverFromErrors();
      Parser parser0 = new Parser(compilerEnvirons1);
      // Undeclared exception!
      try { 
        parser0.parse("]@7YQfW}|6", "]@7YQfW}|6", 2729);
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
        parser0.parse("s,K%KCpqL3,K", "^*n)kye10c", (-432));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("rh:&", "rh:&", 90);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (rh:&#90)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      StringReader stringReader0 = new StringReader(" if ");
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, " if ", 2364);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(4, astRoot0.getLength());
      assertEquals(2364, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("default:\n", "default:\n", 22);
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(8, astRoot0.getLength());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("throw", "for", 161);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unexpected end of file (for#161)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      NativeArray nativeArray0 = new NativeArray(65536);
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(objectLiteral0).getElements();
      // Undeclared exception!
      try { 
        parser0.destructuringObject(objectLiteral0, 23, "s", objectLiteral0, nativeArray0);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("Ep-{@M^fi/?#", "Ep-{@M^fi/?#", 2977);
      assertEquals(2977, astRoot0.getLineno());
      assertEquals(11, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse(";YH>>2-q'v", "p", 0);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(8, astRoot0.getLength());
      assertEquals(0, astRoot0.getEndLineno());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("{2K,//ksnS?~DZ");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "{2K,//ksnS?~DZ", (-80));
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
      AstRoot astRoot0 = parser0.parse("h26JF455z:GM", "bIUi=S8''b[q+8T-exQ", 65536);
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("for (", "f3r", (-3391));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3391
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("continue", ",\n", 65536);
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(7, astRoot0.getLength());
      assertEquals(65536, astRoot0.getLineno());
      assertEquals(0, astRoot0.getPosition());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("const", "const", 65536);
      assertEquals(65536, astRoot0.getEndLineno());
      assertEquals(5, astRoot0.getLength());
      
      parser0.defineSymbol(12, "const", false);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.reportError("msg.generator.returns", "msg.generator.returns");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // TypeError: generator function {0} returns a value
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      StringReader stringReader0 = new StringReader("bIUi=S8''b[q+8T-exQ");
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "bIUi=S8''b[q+8T-exQ", 65536);
      assertEquals(19, astRoot0.getLength());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      assertTrue(compilerEnvirons0.isIdeMode());
      
      AstRoot astRoot0 = parser0.parse(" where it expected String, Number, Boolean or Scrhptable instance. Please check your Qode for missing Con~ext.javaToJS() call.", "(Ljava/lang/Objecd;)Ljava/lang/String;", 65536);
      assertEquals(126, astRoot0.getLength());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("V}T[M)1*{RsM)3&W =)", "V}T[M)1*{RsM)3&W =)", 148);
      assertEquals(19, astRoot0.getLength());
      assertEquals(148, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      AstRoot astRoot0 = parser0.parse("msgRno.sid.theffects", "msgRno.sid.theffects", 192);
      assertEquals(20, astRoot0.getLength());
      assertEquals(192, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("Hoz{g47D:*Fq", "Hoz{g47D:*Fq", 65536);
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("Z}p=0(q,c;j");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "*,%Dc*5dRUj>{&`", 89);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(11, astRoot0.getLength());
      assertEquals(89, astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("msg.no.sid.heffects");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "msg.no.sid.heffects", 53);
      // Undeclared exception!
      try { 
        parser0.createDestructuringAssignment(2, astRoot0, astRoot0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid assignment left-hand side. (msg.no.sid.heffects#53)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse(".P", ".P", 18);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(4, ".P");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=2, ts.tokenBeg=1, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
