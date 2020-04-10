/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 22:45:30 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.GeneratorExpressionLoop;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Context context0 = Context.getContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression();
      parser0.markDestructuring(parenthesizedExpression0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      parser0.markDestructuring(arrayLiteral0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(87, 1000);
      parser0.removeParens(parenthesizedExpression0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("for", "for", 764);
      parser0.checkMutableReference(astRoot0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = new Parser();
      Name name0 = new Name();
      parser0.simpleAssignment(name0, name0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser();
      ElementGet elementGet0 = new ElementGet(2, 2);
      // Undeclared exception!
      try { 
        parser0.simpleAssignment(elementGet0, elementGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot(29);
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
  public void test07()  throws Throwable  {
      Parser parser0 = new Parser();
      Name name0 = new Name(65536);
      PropertyGet propertyGet0 = new PropertyGet(5, 14, name0, name0);
      parser0.simpleAssignment(propertyGet0, propertyGet0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.createName(105, "*GIdN}Y", (Node) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = new Parser();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1974, 20);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      parser0.destructuringObject(objectLiteral0, 154, "t", objectLiteral0, linkedList0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser parser0 = new Parser();
      AstRoot astRoot0 = parser0.parse("msg.var.redecl", "17@-}Y", 52);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(13);
      parser0.destructuringAssignmentHelper(22, arrayLiteral0, astRoot0, "duplicate");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      compilerEnvirons0.setIdeMode(false);
      // Undeclared exception!
      try { 
        parser0.parse("Vkqgna)N=h*i&eJGyv ", "not Method or Constructor", 1463);
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
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 17;
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
  public void test13()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("Y.hB2($", "Y.hB2($", (-868));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -868
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 89;
      // Undeclared exception!
      try { 
        parser0.setRequiresActivation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("(Lorg/mozilla/javascript/Script;[Ljava/lang/String;)V", "com.google.javascript.rhino.head.P7rser$ParserException", 147);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse(">&[o]|", ">&[o]|", 18);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("bSVDt_to+{O!RYI-D", "u}g{I7ky'", 12);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("zXmp,[zvt.b2_?cs5#w", "zXmp,[zvt.b2_?cs5#w", (-3849));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3849
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("false", "false", 65536);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("/)8%|UAqz$@YE0lRJ", "/)8%|UAqz$@YE0lRJ", 114);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated regular expression literal (/)8%|UAqz$@YE0lRJ#114)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("Efx@*~", "msg.no.return.value", 65536);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("msg.detrut.~sign.noinit", "Uk]|\"z", 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing name after . operator (Uk]|\"z#2)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("Hv.@VZ_~", "Hv.@VZ_~", 14);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (Hv.@VZ_~#14)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("zhj.*0x!yU6x#cpUzM(", "zhj.*0x!yU6x#cpUzM(", 1399);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (zhj.*0x!yU6x#cpUzM(#1399)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      compilerEnvirons0.initFromContext(context0);
      parser0.parse("msg.let.decl.not.in.block", "msg.bad.namespace", 2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("l4[Y]cgrRh", "LS&n\"crSf-pu Ih8Y", 53);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (LS&n\"crSf-pu Ih8Y#53)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("m2bjl(3,KLR", "lp]6An}fGWuS&cN[|b", 764);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ) after argument list (lp]6An}fGWuS&cN[|b#764)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("securityDomain should be null if setSecurityController() was never called", "F}(]Z", 544);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("<H}%*[r|{|ugI*O(6^", "<H}%*[r|{|ugI*O(6^", 0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("v++U|ILFl~|", "v++U|ILFl~|", (-3750));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3750
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("Na8&+y-2^\"Q =w<", "", 65536);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated string literal (#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      parser0.parse("(new String(\"", "(new String(\"", 2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("r-C<<", "msg.bad.yield", 26);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("FzZ>Ux~adhK+g}EMc", "FzZ>Ux~adhK+g}EMc", 4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (FzZ>Ux~adhK+g}EMc#4)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("D(Q_tNY<t!<K-)|", "", (-966));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -966
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("f}3P_=E,)?1", "(C)Ljava/lang/String;", (-3856));
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
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
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
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      parser0.defineSymbol(781, (String) null, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("EM:", "EM:", 19);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of file (EM:#19)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("s:PmO`", "#{~CcBu", 22);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      parser0.parse("msg.destruct.assign.no.init", "msg.destruct.assign.no.init", 65536);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("for", "2,)", 65536);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ( after for (2,)#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("const", "com.google.javascript.rhino.head.ast.ReturnStatement", (-1308));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("var", "C'@d", 65536);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(1254, "var", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=3, ts.tokenBeg=2, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("default", "m", (-21));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("try", "try", 47);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("yield ", "yield ", (-1));
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
        parser0.parse("throw", "throw", 65536);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of file (throw#65536)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("*=;n@<TWU}`d@1on?", "1\"}e4HF0BvY/", 9);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("k6X:}g(=|", "o", (-3849));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse(";AU|@", "SETPROP", 65536);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse(" if (", "y", 86);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("do", "f2Q4cO4pC0tFCm0", 93);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("6+n{D=%{m.du", "-=yW", 17);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("{}");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "+`rFD^", (-1273));
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
      StringReader stringReader0 = new StringReader("n");
      parser0.parse((Reader) stringReader0, "n", 1656);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("i/m&LD", "D", 30);
      StringReader stringReader0 = new StringReader(")");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "t(.*,m6T_+l_k", 2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // parser reused
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("msg.bad.throw.eol");
      parser0.parse((Reader) stringReader0, ")P9", 1);
      // Undeclared exception!
      try { 
        parser0.parse("F]/0#!0cY", "F]/0#!0cY", (-3046));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // parser reused
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      // Undeclared exception!
      try { 
        parser0.parse("!2KUg", "!2KUg", 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (!2KUg#1)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      Context context1 = Context.enter(context0, contextFactory0);
      compilerEnvirons0.initFromContext(context1);
      parser0.parse("F7?Vb?51;1iAG3(@", "F7?Vb?51;1iAG3(@", 121);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("9=,?FGH2p:HJ[=k", "9=,?FGH2p:HJ[=k", 9);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("Q,:c_IALpbO\"", "Q,:c_IALpbO\"", 12);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("\n}", "\"@-#j'TJ:xu33", 2);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      parser0.destructuringAssignmentHelper(18, objectLiteral0, objectLiteral0, "\"@-#j'TJ:xu33");
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.reportError("msg.constructor.ambiguous", "t");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The choice of Java constructor {0} matching JavaScript argument types ({1}) is ambiguous; candidate constructors are: {2}
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("@09j#OB9vF:/o['p", (String) null, 120);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing name after .@
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.addWarning("l0Ip;*7[Sy_hX,eq+D", "$7k$azcm>j9g_|:");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property l0Ip;*7[Sy_hX,eq+D
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("msg.var.redecl", "17@-}Y", 19);
      parser0.addStrictWarning("17@-}Y", "msg.bad.assign.left");
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.addStrictWarning("", "");
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.eof();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.parse("msg.no.brace.try", "msg.no.brace.try", 707);
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(40);
      parser0.pushScope(generatorExpressionLoop0);
      // Undeclared exception!
      try { 
        parser0.pushScope(generatorExpressionLoop0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=16, ts.tokenBeg=15, currentToken=0
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.addWarning("length", 16, 4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property length
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("s|-H%4\"!%2%!JS|\"", "namespace", 0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.lookupMessage("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property 
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("switch");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "switch", 1);
      assertEquals(1, astRoot0.getLength());
      assertEquals(1, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.addError("i/m&LD", "msg.no.paren.arg");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("(new St{ing(\"", "FzZ>Ux~adhK+gEMc", 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing : after property id (FzZ>Ux~adhK+gEMc#1)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("Wk%N~<]$DI @@?ag@", "msg.no.brace.try", 18);
      parser0.pushScope(astRoot0);
      parser0.pushScope(astRoot0);
      assertEquals(17, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot();
      // Undeclared exception!
      try { 
        parser0.createDestructuringAssignment(5, astRoot0, astRoot0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("for", "for", 764);
      Node node0 = parser0.destructuringAssignmentHelper(0, astRoot0, astRoot0, "for");
      assertEquals(764, node0.getLineno());
      assertEquals(3, astRoot0.getLength());
      assertEquals("158", node0.toString());
      assertEquals(0, astRoot0.getAbsolutePosition());
  }
}
