/*

 * Tue Mar 03 19:38:24 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.LetNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.Yield;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      CompilerEnvirons compilerEnvirons1 = CompilerEnvirons.ideEnvirons();
      FunctionNode functionNode0 = new FunctionNode();
      ErrorReporter errorReporter1 = compilerEnvirons1.getErrorReporter();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, errorReporter1);
      Node node0 = iRFactory1.decompileFunctionHeader(functionNode0);
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      AstRoot astRoot0 = new AstRoot(65536);
      iRFactory0.transformTree(astRoot0);
      LetNode letNode0 = new LetNode((-2539));
      // Undeclared exception!
      try { 
        iRFactory0.decompile(letNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: LETEXPR
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(compilerEnvirons0).getLanguageVersion();
      doReturn(true).when(compilerEnvirons0).isIdeMode();
      doReturn(true, true, false).when(compilerEnvirons0).isStrictMode();
      doReturn(true).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).reportWarningAsError();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompile(objectLiteral0);
      CompilerEnvirons compilerEnvirons1 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, defaultErrorReporter0);
      AstRoot astRoot0 = iRFactory0.parse("yield ", "yield ", 8);
      iRFactory1.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(10, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      AstRoot astRoot0 = new AstRoot(113);
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(arrayLiteral0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.transform(arrayLiteral0);
      PropertyGet propertyGet0 = new PropertyGet(18);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(propertyGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.isDestructuring(astRoot0);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals("\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Node node0 = Node.newTarget();
      iRFactory0.isDestructuring(node0);
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons1 = new CompilerEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, defaultErrorReporter0);
      AstRoot astRoot0 = iRFactory1.parse("yield ", "gQyhu~P.[kS8s}", 2927);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(10, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(compilerEnvirons0).getLanguageVersion();
      doReturn(true).when(compilerEnvirons0).isIdeMode();
      doReturn(true, true, false).when(compilerEnvirons0).isStrictMode();
      doReturn(true).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).reportWarningAsError();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      CompilerEnvirons compilerEnvirons1 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, defaultErrorReporter0);
      AstRoot astRoot0 = iRFactory0.parse("yield ", "yield ", 8);
      Name name0 = new Name(149, (-1477), "[@p1'o_yI");
      FunctionNode functionNode0 = new FunctionNode((-2931), name0);
      iRFactory0.decompileFunctionHeader(functionNode0);
      iRFactory1.transformTree(astRoot0);
      assertEquals(10, astRoot0.getEncodedSourceEnd());
      assertEquals("\u0088'\u0005yieldR\u0001", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(false).when(compilerEnvirons1).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons1);
      AstRoot astRoot0 = new AstRoot(0);
      iRFactory0.transformTree(astRoot0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(131);
      IRFactory iRFactory1 = new IRFactory();
      iRFactory1.decompileArrayLiteral(arrayLiteral0);
      assertEquals(19, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot(113);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals(3, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(false).when(compilerEnvirons1).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons1);
      NumberLiteral numberLiteral0 = new NumberLiteral();
      iRFactory0.decompile(numberLiteral0);
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = iRFactory1.parse("", "I>,,/", 133);
      iRFactory0.transformTree(astRoot0);
      assertEquals(4, astRoot0.getEncodedSourceEnd());
      assertEquals(3, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Yield yield0 = new Yield(65536, 65536);
      iRFactory0.transform(yield0);
      AstRoot astRoot0 = new AstRoot(26);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceEnd());
      assertEquals("H\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      AstRoot astRoot0 = new AstRoot(65536);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      
      Yield yield0 = new Yield(2, (-1374));
      IRFactory iRFactory1 = new IRFactory();
      Node node0 = iRFactory1.transform(yield0);
      assertEquals(72, node0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode();
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompileFunctionHeader(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NumberLiteral numberLiteral0 = new NumberLiteral();
      iRFactory0.transform(numberLiteral0);
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(objectLiteral0).getElements();
      // Undeclared exception!
      try { 
        iRFactory0.decompileObjectLiteral(objectLiteral0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      
      boolean boolean0 = iRFactory0.isDestructuring(objectLiteral0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(16, 11);
      // Undeclared exception!
      try { 
        iRFactory0.transform(parenthesizedExpression0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons1 = new CompilerEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, defaultErrorReporter0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory1.decompile(objectLiteral0);
      AstRoot astRoot0 = iRFactory1.parse("yield ", "gQyhu~P.[kS8s}", 2927);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(10, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlElemRef xmlElemRef0 = new XmlElemRef(0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(xmlElemRef0, xmlElemRef0).when(functionNode0).getMemberExprNode();
      // Undeclared exception!
      try { 
        iRFactory0.decompileFunctionHeader(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(compilerEnvirons0).getLanguageVersion();
      doReturn(true).when(compilerEnvirons0).isIdeMode();
      doReturn(true, true, false).when(compilerEnvirons0).isStrictMode();
      doReturn(true).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).reportWarningAsError();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      CompilerEnvirons compilerEnvirons1 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, defaultErrorReporter0);
      AstRoot astRoot0 = iRFactory0.parse("yield ", "yield ", 8);
      iRFactory1.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory1.decompile(astRoot0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: SCRIPT
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
