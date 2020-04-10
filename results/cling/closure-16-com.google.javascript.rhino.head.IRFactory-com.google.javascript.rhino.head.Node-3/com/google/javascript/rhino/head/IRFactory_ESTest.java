/*

 * Tue Mar 03 19:43:48 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyStatement;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.LetNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      StringLiteral stringLiteral0 = new StringLiteral();
      PropertyGet propertyGet0 = mock(PropertyGet.class, new ViolatedAssumptionAnswer());
      doReturn(stringLiteral0).when(propertyGet0).getTarget();
      // Undeclared exception!
      try { 
        iRFactory0.decompilePropertyGet(propertyGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LetNode letNode0 = new LetNode(1889);
      // Undeclared exception!
      try { 
        letNode0.getExistingIntProp(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LetNode letNode0 = new LetNode(1889);
      Assignment assignment0 = new Assignment(7, letNode0, letNode0, 1);
      letNode0.addChild(assignment0);
      IRFactory iRFactory0 = new IRFactory();
      // Undeclared exception!
      try { 
        iRFactory0.transform(assignment0);
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
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      EmptyStatement emptyStatement0 = new EmptyStatement(114, 65536);
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      emptyStatement0.setJsDocNode((Comment) null);
      ReturnStatement returnStatement0 = new ReturnStatement(19, 8, (AstNode) null);
      assertEquals(4, returnStatement0.getType());
      
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(emptyStatement0, returnStatement0).when(functionNode0).getMemberExprNode();
      doReturn(nativeArray0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals((-1), node0.getLineno());
      assertEquals(4, node0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(114, 0);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals((-1), node0.getLineno());
      assertEquals(4, node0.getType());
      
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      assertEquals(66, objectLiteral0.getType());
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context.getCurrentContext();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = new NumberLiteral();
      Name name0 = new Name(0, 18);
      PropertyGet propertyGet0 = new PropertyGet(numberLiteral0, name0, 10);
      // Undeclared exception!
      try { 
        iRFactory0.decompilePropertyGet(propertyGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      // Undeclared exception!
      try { 
        newExpression0.labelId();
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
      PropertyGet propertyGet0 = new PropertyGet();
      NumberLiteral numberLiteral0 = new NumberLiteral();
      numberLiteral0.addChildBefore(propertyGet0, (Node) null);
      assertTrue(numberLiteral0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      EmptyStatement emptyStatement0 = new EmptyStatement(114, 65536);
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = iRFactory0.isDestructuring(emptyStatement0);
      assertFalse(boolean0);
      
      ReturnStatement returnStatement0 = new ReturnStatement(19, 8, (AstNode) null);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(emptyStatement0, returnStatement0).when(functionNode0).getMemberExprNode();
      doReturn(nativeArray0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals(128, emptyStatement0.getType());
      assertEquals(4, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      EmptyStatement emptyStatement0 = new EmptyStatement(114, 65536);
      iRFactory0.decompile(emptyStatement0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn((-2770)).when(astRoot0).getType();
      doReturn("").when(astRoot0).toString();
      doReturn(true).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NativeArray nativeArray0 = new NativeArray(65536);
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
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot(2);
      iRFactory0.transformTree(astRoot0);
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(127, name0);
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
  public void test13()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ElementGet elementGet0 = new ElementGet(65536, 2803);
      ElementGet elementGet1 = mock(ElementGet.class, new ViolatedAssumptionAnswer());
      doReturn(elementGet0).when(elementGet1).getTarget();
      // Undeclared exception!
      try { 
        iRFactory0.decompileElementGet(elementGet1);
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
      EmptyStatement emptyStatement0 = new EmptyStatement(114, 65536);
      assertEquals(128, emptyStatement0.getType());
      
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(emptyStatement0, emptyStatement0).when(functionNode0).getMemberExprNode();
      doReturn(nativeArray0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      EmptyStatement emptyStatement0 = new EmptyStatement(114, 65536);
      assertEquals(128, emptyStatement0.getType());
      
      iRFactory0.decompile(emptyStatement0);
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ReturnStatement returnStatement0 = new ReturnStatement(19, 8, (AstNode) null);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(emptyStatement0, returnStatement0).when(functionNode0).getMemberExprNode();
      doReturn(nativeArray0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals("4", node0.toString());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = iRFactory0.parse("toLocale;DateString", "", 265);
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
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
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      EmptyStatement emptyStatement0 = new EmptyStatement(114, 65536);
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ReturnStatement returnStatement0 = new ReturnStatement(19, 8, (AstNode) null);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(emptyStatement0, returnStatement0).when(functionNode0).getMemberExprNode();
      doReturn(nativeArray0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn((-2770)).when(astRoot0).getType();
      doReturn("").when(astRoot0).toString();
      doReturn(true).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      EmptyStatement emptyStatement0 = new EmptyStatement(114, 65536);
      assertEquals(128, emptyStatement0.getType());
      
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(emptyStatement0, emptyStatement0).when(functionNode0).getMemberExprNode();
      doReturn(nativeArray0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      boolean boolean0 = objectLiteral0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(113);
      iRFactory0.transform(variableDeclaration0);
      assertEquals(122, variableDeclaration0.getType());
      
      FunctionNode functionNode0 = new FunctionNode();
      List<AstNode> list0 = functionNode0.getParams();
      FunctionNode functionNode1 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode1).getFunctionName();
      doReturn((Name) null).when(functionNode1).getMemberExprNode();
      doReturn(list0).when(functionNode1).getParams();
      doReturn(true).when(functionNode1).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode1);
      assertEquals((-1), functionNode0.getLineno());
      assertEquals(109, functionNode0.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlElemRef xmlElemRef0 = new XmlElemRef();
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
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(113);
      iRFactory0.transform(variableDeclaration0);
      FunctionNode functionNode0 = new FunctionNode();
      PropertyGet propertyGet0 = new PropertyGet(4);
      propertyGet0.addChildrenToFront(functionNode0);
      propertyGet0.addChildrenToFront(variableDeclaration0);
      assertEquals(122, variableDeclaration0.getType());
      assertTrue(propertyGet0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot(2);
      ScriptNode scriptNode0 = iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        switchStatement0.setScope(scriptNode0);
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
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(140, 1354);
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals((-1), node0.getLineno());
      assertEquals(66, node0.getType());
  }
}
