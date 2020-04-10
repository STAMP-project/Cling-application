/*

 * Tue Mar 03 19:40:51 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.EmptyStatement;
import com.google.javascript.rhino.head.ast.ErrorNode;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.InfixExpression;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlPropRef;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      Scope scope0 = iRFactory0.createScopeNode(6, 16);
      // Undeclared exception!
      try { 
        iRFactory0.transform(scope0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 6
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(1950, 1950);
      iRFactory0.decompile(emptyStatement0);
      AstRoot astRoot0 = new AstRoot(163);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement((-1094));
      iRFactory0.transform(returnStatement0);
      boolean boolean0 = iRFactory0.isDestructuring((Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement((-1094), (-1094));
      iRFactory0.transform(returnStatement0);
      Name name0 = new Name(25, "O?GBXWm-");
      FunctionNode functionNode0 = new FunctionNode(2, name0);
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ScriptNode scriptNode0 = new ScriptNode();
      AstRoot astRoot0 = new AstRoot(5);
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(scriptNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: SCRIPT
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ErrorNode errorNode0 = new ErrorNode(65536);
      AstRoot astRoot0 = new AstRoot(5);
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(errorNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: ERROR
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement((-1094), (-1094));
      iRFactory0.transform(returnStatement0);
      AstRoot astRoot0 = new AstRoot(24);
      iRFactory0.transformTree(astRoot0);
      assertEquals(4, astRoot0.getEncodedSourceEnd());
      assertEquals(3, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(244, "-_.!~*'()");
      iRFactory0.isDestructuring(name0);
      AstRoot astRoot0 = new AstRoot(50);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      String string0 = arrayLiteral0.makeIndent(1900);
      IRFactory iRFactory1 = new IRFactory();
      iRFactory0.isDestructuring(arrayLiteral0);
      AstRoot astRoot0 = iRFactory1.parse(string0, "error reporter", 1);
      iRFactory0.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals("\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(false).when(compilerEnvirons1).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons1);
      EmptyExpression emptyExpression0 = new EmptyExpression();
      iRFactory0.isDestructuring(emptyExpression0);
      AstRoot astRoot0 = new AstRoot(22);
      iRFactory0.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(25, "O?GBXWm-");
      AstRoot astRoot0 = new AstRoot(24);
      iRFactory0.transformTree(astRoot0);
      FunctionNode functionNode0 = new FunctionNode(2, name0);
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
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(1567);
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot(17);
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceEnd());
      assertEquals(2, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement((-1094));
      iRFactory0.transform(returnStatement0);
      XmlPropRef xmlPropRef0 = new XmlPropRef((-2252), 26);
      // Undeclared exception!
      try { 
        iRFactory0.transform(xmlPropRef0);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(6);
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      Scope scope0 = iRFactory0.createScopeNode(6, 16);
      // Undeclared exception!
      try { 
        iRFactory0.transform(scope0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 6
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(244, "-_.!~*'()");
      iRFactory0.transform(name0);
      AstRoot astRoot0 = new AstRoot(50);
      iRFactory0.transformTree(astRoot0);
      assertEquals(12, astRoot0.getEncodedSourceEnd());
      assertEquals("'\t-_.!~*'()\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      IRFactory iRFactory1 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(17);
      iRFactory0.transformTree(astRoot0);
      FunctionNode functionNode0 = new FunctionNode(148);
      Node node0 = iRFactory1.decompileFunctionHeader(functionNode0);
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement((-1094));
      iRFactory0.transform(returnStatement0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      ArrayLiteral arrayLiteral1 = (ArrayLiteral)arrayLiteral0.setType(24);
      ElementGet elementGet0 = new ElementGet(objectLiteral0, arrayLiteral1);
      // Undeclared exception!
      try { 
        iRFactory0.decompileElementGet(elementGet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: DIV
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(65536, 65536);
      iRFactory0.decompile(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals(3, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536, (-874));
      InfixExpression infixExpression0 = new InfixExpression(124, objectLiteral0, objectLiteral0, 127);
      Node node0 = iRFactory0.transform(infixExpression0);
      assertEquals(124, node0.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      FunctionNode functionNode0 = new FunctionNode((-49));
      iRFactory0.decompileFunctionHeader(functionNode0);
      iRFactory0.transformTree(astRoot0);
      assertEquals(4, astRoot0.getEncodedSourceStart());
      assertEquals("WXU\u0001\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement((-1094));
      iRFactory0.transform(returnStatement0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(2);
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      ReturnStatement returnStatement0 = new ReturnStatement(6378, 8, arrayLiteral0);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals(4, node0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals("4", node0.toString());
      
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      boolean boolean0 = iRFactory0.isDestructuring(arrayLiteral0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement((-1094));
      iRFactory0.transform(returnStatement0);
      FunctionNode functionNode0 = new FunctionNode();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536, 65536);
      iRFactory0.decompile(objectLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceEnd());
      assertEquals("UV\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(1950, 1950);
      iRFactory0.decompile(emptyStatement0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot(163);
      iRFactory1.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536, 120);
      iRFactory0.transform(numberLiteral0);
      iRFactory0.decompile(numberLiteral0);
      assertEquals(20, Node.GENERATOR_END_PROP);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, defaultErrorReporter0);
      XmlElemRef xmlElemRef0 = new XmlElemRef();
      // Undeclared exception!
      try { 
        iRFactory0.transform(xmlElemRef0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(1950, 1950);
      iRFactory0.decompile(emptyStatement0);
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode1).getFunctionName();
      doReturn(emptyStatement0, functionNode0).when(functionNode1).getMemberExprNode();
      // Undeclared exception!
      try { 
        iRFactory0.decompileFunctionHeader(functionNode1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement((-1094));
      iRFactory0.transform(returnStatement0);
      EmptyStatement emptyStatement0 = new EmptyStatement(2, 4);
      iRFactory0.decompile(emptyStatement0);
      assertEquals(1, Node.SPECIALCALL_EVAL);
  }
}
