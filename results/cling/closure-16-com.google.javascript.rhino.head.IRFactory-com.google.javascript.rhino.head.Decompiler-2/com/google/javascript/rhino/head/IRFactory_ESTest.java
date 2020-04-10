/*

 * Tue Mar 03 19:36:01 GMT 2020
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
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlMemberGet;
import com.google.javascript.rhino.head.ast.XmlPropRef;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536);
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      CompilerEnvirons compilerEnvirons1 = new CompilerEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1);
      AstRoot astRoot0 = iRFactory1.parse("toLocaleDateString", "toLocaleDateString", 6);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals(25, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(65536, 65536);
      ReturnStatement returnStatement0 = new ReturnStatement(10, 43);
      iRFactory0.transform(returnStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(name0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ReturnStatement returnStatement0 = new ReturnStatement(77, 216);
      iRFactory0.transform(returnStatement0);
      boolean boolean0 = iRFactory0.isDestructuring(returnStatement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(astRoot0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: SCRIPT
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(2);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(objectLiteral0);
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
      XmlElemRef xmlElemRef0 = new XmlElemRef(65536);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(4);
      List<AstNode> list0 = arrayLiteral0.getElements();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(xmlElemRef0, arrayLiteral0).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals("65", node0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.decompileFunctionHeader(functionNode0);
      ReturnStatement returnStatement0 = new ReturnStatement(10, 43);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals("4", node0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(1);
      iRFactory0.transformTree(astRoot0);
      boolean boolean0 = iRFactory0.isDestructuring(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536);
      iRFactory0.isDestructuring(objectLiteral0);
      CompilerEnvirons compilerEnvirons1 = new CompilerEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1);
      AstRoot astRoot0 = iRFactory1.parse("toLocaleDateString", "toLocaleDateString", 6);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(23, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Scope scope0 = new Scope();
      Assignment assignment0 = new Assignment(65536, scope0, scope0, 2);
      iRFactory0.isDestructuring(assignment0);
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons1).getErrorReporter();
      doReturn(false).when(compilerEnvirons1).isIdeMode();
      doReturn(false, false).when(compilerEnvirons1).isStrictMode();
      doReturn(false).when(compilerEnvirons1).isXmlAvailable();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1);
      AstRoot astRoot0 = iRFactory1.parse("toLocaleDateString", "toLocaleDateString", 5);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(23, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      CompilerEnvirons compilerEnvirons1 = new CompilerEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      AstRoot astRoot0 = iRFactory1.parse("toLocaleDateString", "toLocaleDateString", 6);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals(25, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = new NumberLiteral(139, 139);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.transform(numberLiteral0);
      iRFactory0.decompile(objectLiteral0);
      assertFalse(objectLiteral0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(1882, 22);
      AstRoot astRoot0 = new AstRoot(2);
      IRFactory iRFactory1 = new IRFactory();
      iRFactory1.transformTree(astRoot0);
      Node node0 = iRFactory0.transform(numberLiteral0);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(2);
      IRFactory iRFactory0 = new IRFactory();
      iRFactory0.transformTree(astRoot0);
      XmlPropRef xmlPropRef0 = new XmlPropRef();
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
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot(1);
      iRFactory0.transformTree(astRoot0);
      XmlPropRef xmlPropRef0 = new XmlPropRef(0, 19);
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
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot(6);
      iRFactory0.transformTree(astRoot0);
      assertEquals(5, astRoot0.getEncodedSourceEnd());
      assertEquals("WXU\u0001\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      FunctionNode functionNode0 = new FunctionNode(5);
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot((-2637));
      iRFactory0.transformTree(astRoot0);
      assertEquals(5, astRoot0.getEncodedSourceEnd());
      assertEquals(4, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-2275), 65536);
      ExpressionStatement expressionStatement0 = new ExpressionStatement(65536, 10, objectLiteral0);
      Assignment assignment0 = new Assignment(expressionStatement0, expressionStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(assignment0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-1254), 512);
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      AstRoot astRoot0 = new AstRoot(6);
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceEnd());
      assertEquals("UV\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-1254), 512);
      AstRoot astRoot0 = new AstRoot(6);
      iRFactory0.isDestructuring(objectLiteral0);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression();
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
  public void test21()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(65536, 65536);
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn(">>>").when(functionNode0).getName();
      doReturn(linkedList0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      ReturnStatement returnStatement0 = new ReturnStatement(10, 43);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals(5, Node.CASEARRAY_PROP);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(65536, 65536);
      ArrayLiteral arrayLiteral1 = new ArrayLiteral();
      arrayLiteral1.addElement(arrayLiteral0);
      iRFactory0.decompileArrayLiteral(arrayLiteral1);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(5, astRoot0.getEncodedSourceEnd());
      assertEquals("SSTT\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = new AstRoot((-2637));
      iRFactory0.transformTree(astRoot0);
      SwitchCase switchCase0 = new SwitchCase(29, 2658);
      ElementGet elementGet0 = new ElementGet(switchCase0, astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompileElementGet(elementGet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: CASE
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      XmlElemRef xmlElemRef0 = new XmlElemRef(1);
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(arrayLiteral0, xmlElemRef0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(xmlMemberGet0);
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
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(65536, 65536);
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("n#]~O^V").when(functionNode0).getName();
      doReturn(linkedList0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot(6);
      iRFactory0.transformTree(astRoot0);
      assertEquals(13, astRoot0.getEncodedSourceStart());
      assertEquals(14, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = new NumberLiteral(139, 139);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(16, 128);
      arrayLiteral0.addElement(numberLiteral0);
      iRFactory0.transform(numberLiteral0);
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
  }
}
