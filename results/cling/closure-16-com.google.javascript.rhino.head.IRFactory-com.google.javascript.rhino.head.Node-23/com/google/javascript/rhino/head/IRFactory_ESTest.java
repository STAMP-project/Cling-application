/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 06:33:15 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyStatement;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.GeneratorExpressionLoop;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.WhileLoop;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlExpression;
import com.google.javascript.rhino.head.ast.XmlLiteral;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      StringLiteral stringLiteral0 = new StringLiteral(10, 18);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(stringLiteral0);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(65536, 65536);
      ElementGet elementGet0 = new ElementGet(arrayLiteral0, arrayLiteral0);
      iRFactory0.decompileElementGet(elementGet0);
      assertEquals((-1), elementGet0.getLineno());
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(2, 6, "{5DGk*|m74%ZPh#j");
      PropertyGet propertyGet0 = new PropertyGet(name0, name0);
      iRFactory0.transform(propertyGet0);
      FunctionNode functionNode0 = new FunctionNode();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(0, 65536);
      NewExpression newExpression0 = new NewExpression(1244);
      List<AstNode> list0 = newExpression0.getArguments();
      assertEquals(30, newExpression0.getType());
      
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(emptyStatement0, emptyStatement0).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertNotNull(node0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(0);
      Node node0 = iRFactory0.transform(arrayLiteral0);
      assertEquals("65", node0.toString());
      
      Name name0 = new Name(49, "R#0-N/<Ibr]u");
      FunctionNode functionNode0 = new FunctionNode(148, name0);
      iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals((-1), functionNode0.getLineno());
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(152);
      iRFactory0.decompile(numberLiteral0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(11).when(astRoot0).getType();
      doReturn("error reporter").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: error reporter
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(152);
      iRFactory0.isDestructuring(numberLiteral0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(11).when(astRoot0).getType();
      doReturn("error reporter").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: error reporter
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(65536, 65536);
      labeledStatement0.putProp(125, (Object) null);
      assertEquals((-1), labeledStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(0, 65536);
      iRFactory0.checkMutableReference(emptyStatement0);
      assertEquals((-1), emptyStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      NumberLiteral numberLiteral0 = new NumberLiteral(180, 1);
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      iRFactory0.transform(numberLiteral0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      // Undeclared exception!
      try { 
        arrayLiteral0.setString((String) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(0, 65536);
      iRFactory0.transform(emptyStatement0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      // Undeclared exception!
      try { 
        arrayLiteral0.setString("SwNBNG\"M");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.ArrayLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(2, 6, "{5DGk*|m74%ZPh#j");
      PropertyGet propertyGet0 = new PropertyGet(name0, name0);
      Node node0 = iRFactory0.transform(propertyGet0);
      assertEquals((-1), node0.getLineno());
      assertEquals(33, node0.getType());
      assertEquals((-1), propertyGet0.getLineno());
      
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(2, 6, "{5DGk*|m74%ZPh#j");
      PropertyGet propertyGet0 = new PropertyGet(name0, name0);
      Node node0 = iRFactory0.transform(propertyGet0);
      assertTrue(node0.hasChildren());
      assertEquals("33", node0.toString());
      assertEquals((-1), node0.getLineno());
      
      iRFactory0.decompile(propertyGet0);
      assertEquals((-1), propertyGet0.getLineno());
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(2, 6, "{5DGk*|m74%ZPh#j");
      PropertyGet propertyGet0 = new PropertyGet(name0, name0);
      assertEquals(33, propertyGet0.getType());
      
      Node node0 = iRFactory0.transform(propertyGet0);
      assertEquals((-1), propertyGet0.getLineno());
      assertTrue(node0.hasChildren());
      assertEquals("33", node0.toString());
      
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(702);
      boolean boolean0 = iRFactory0.isDestructuring(generatorExpressionLoop0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(0, 65536);
      iRFactory0.transform(emptyStatement0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      // Undeclared exception!
      try { 
        arrayLiteral0.labelId();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlElemRef xmlElemRef0 = new XmlElemRef(65536, 231);
      Node node0 = new Node(231, xmlElemRef0, xmlElemRef0, xmlElemRef0);
      node0.addChildToBack(xmlElemRef0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals((-1), astRoot0.getLineno());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Block block0 = new Block(22, 65536);
      iRFactory0.transform(block0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(2);
      // Undeclared exception!
      try { 
        arrayLiteral0.getExistingIntProp(7);
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
      IRFactory iRFactory0 = new IRFactory();
      Block block0 = new Block(22, 65536);
      WhileLoop whileLoop0 = new WhileLoop();
      block0.addChildrenToFront(whileLoop0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(block0);
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
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(0, 65536);
      XmlExpression xmlExpression0 = new XmlExpression(1);
      emptyStatement0.addChildToFront(xmlExpression0);
      XmlLiteral xmlLiteral0 = new XmlLiteral((-1508), 4);
      // Undeclared exception!
      try { 
        iRFactory0.transform(xmlLiteral0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NewExpression newExpression0 = new NewExpression(1065);
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(732);
      newExpression0.putProp(126, regExpLiteral0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(astRoot0).getType();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.AstRoot$MockitoMock$1946474576 cannot be cast to com.google.javascript.rhino.head.ast.ReturnStatement
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectLiteral0).isDestructuring();
      boolean boolean0 = iRFactory0.isDestructuring(objectLiteral0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(0);
      IRFactory iRFactory0 = new IRFactory();
      boolean boolean0 = iRFactory0.isDestructuring(arrayLiteral0);
      assertFalse(boolean0);
      assertEquals(65, arrayLiteral0.getType());
      
      Node node0 = iRFactory0.transform(arrayLiteral0);
      assertEquals(65, node0.getType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Name name0 = new Name(2, 6, "{5DGk*|m74%ZPh#j");
      EmptyStatement emptyStatement0 = new EmptyStatement(132, (-1650));
      SwitchStatement switchStatement0 = new SwitchStatement();
      // Undeclared exception!
      try { 
        emptyStatement0.replaceChild(name0, switchStatement0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(65536, 65536);
      Node node0 = Node.newString(4, "jzXkme?t!|B.x4-`");
      // Undeclared exception!
      try { 
        labeledStatement0.addChildBefore(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      NativeArray nativeArray0 = new NativeArray(1L);
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
  public void test25()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(1244);
      WhileLoop whileLoop0 = new WhileLoop(1042);
      // Undeclared exception!
      try { 
        newExpression0.setScope(whileLoop0);
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
      IRFactory iRFactory0 = new IRFactory();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(65536);
      Node node0 = iRFactory0.transform(variableDeclaration0);
      assertEquals(122, variableDeclaration0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-1828), (-1818));
      assertEquals(66, objectLiteral0.getType());
      
      iRFactory0.decompile(objectLiteral0);
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals((-1), node0.getLineno());
      assertEquals("66", node0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(0, 65536);
      ReturnStatement returnStatement0 = new ReturnStatement(13, 20, emptyStatement0);
      iRFactory0.isDestructuring(returnStatement0);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals((-1), node0.getLineno());
      assertEquals("4", node0.toString());
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NativeArray nativeArray0 = new NativeArray(1);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn((Name) null).when(functionNode0).getMemberExprNode();
      doReturn(nativeArray0).when(functionNode0).getParams();
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
  public void test30()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0);
      StringReader stringReader0 = new StringReader(" namespace");
      AstRoot astRoot0 = iRFactory1.parse((Reader) stringReader0, " namespace", 1);
      assertEquals(136, astRoot0.getType());
      
      Node node0 = iRFactory0.transform(astRoot0);
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(2, 6, "{5DGk*|m74%ZPh#j");
      PropertyGet propertyGet0 = new PropertyGet(name0, name0);
      Node node0 = iRFactory0.transform(propertyGet0);
      EmptyStatement emptyStatement0 = new EmptyStatement(132, (-1650));
      SwitchStatement switchStatement0 = new SwitchStatement();
      // Undeclared exception!
      try { 
        emptyStatement0.replaceChild(node0, switchStatement0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
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
}
