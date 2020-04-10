/*

 * Tue Mar 03 19:42:18 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyStatement;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.XmlElemRef;
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
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      iRFactory0.transform(returnStatement0);
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      // Undeclared exception!
      try { 
        iRFactory0.transform(regExpLiteral0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      AstRoot astRoot0 = new AstRoot(25);
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceEnd());
      assertEquals(2, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      EmptyStatement emptyStatement0 = new EmptyStatement(65536);
      iRFactory0.decompile(emptyStatement0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      iRFactory0.transform(returnStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(returnStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: RETURN
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      Node node0 = iRFactory0.transform(returnStatement0);
      boolean boolean0 = iRFactory0.isDestructuring(node0);
      assertFalse(boolean0);
      assertEquals(4, node0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      iRFactory0.transform(returnStatement0);
      Name name0 = new Name(125, 50);
      FunctionNode functionNode0 = new FunctionNode(143, name0);
      // Undeclared exception!
      try { 
        iRFactory0.decompileFunctionHeader(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      ScriptNode scriptNode0 = iRFactory0.transformTree(astRoot0);
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
  public void test07()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(65536);
      iRFactory0.transformTree(astRoot0);
      ReturnStatement returnStatement0 = new ReturnStatement();
      // Undeclared exception!
      try { 
        iRFactory0.transform(returnStatement0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(26, 2);
      iRFactory0.transform(arrayLiteral0);
      PropertyGet propertyGet0 = new PropertyGet(18, (-1036));
      ElementGet elementGet0 = new ElementGet(propertyGet0, returnStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.decompileElementGet(elementGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      iRFactory0.isDestructuring(objectLiteral0);
      AstRoot astRoot0 = new AstRoot(25);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(65536);
      iRFactory0.transformTree(astRoot0);
      NumberLiteral numberLiteral0 = new NumberLiteral(26, "ipCqH$Io:8Ie");
      boolean boolean0 = iRFactory0.isDestructuring(numberLiteral0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.isDestructuring(objectLiteral0);
      AstRoot astRoot0 = new AstRoot(25);
      iRFactory0.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NewExpression newExpression0 = new NewExpression();
      List<AstNode> list0 = newExpression0.getArguments();
      Name name0 = new Name(984, 4);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("_reInit").when(functionNode0).getName();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot(17);
      iRFactory0.transformTree(astRoot0);
      assertEquals(11, astRoot0.getEncodedSourceStart());
      assertEquals(12, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot(2);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals(3, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = new AstRoot(25);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(25);
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceEnd());
      assertEquals(2, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      iRFactory0.transform(returnStatement0);
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
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
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      iRFactory0.transform(returnStatement0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(141);
      iRFactory0.decompile(objectLiteral0);
      assertEquals(25, Node.EXPRESSION_CLOSURE_PROP);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      Name name0 = new Name(1, 140, "ipCqH$Io:8Ie");
      PropertyGet propertyGet0 = new PropertyGet(objectLiteral0, name0);
      iRFactory0.decompilePropertyGet(propertyGet0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(18, astRoot0.getEncodedSourceEnd());
      assertEquals("UVl'\fipCqH$Io:8Ie\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionCall functionCall0 = new FunctionCall(65536);
      List<AstNode> list0 = functionCall0.getArguments();
      BreakStatement breakStatement0 = new BreakStatement();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(breakStatement0, breakStatement0).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot();
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
  public void test19()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(65536);
      iRFactory0.transformTree(astRoot0);
      NumberLiteral numberLiteral0 = new NumberLiteral(26, "ipCqH$Io:8Ie");
      IRFactory iRFactory1 = new IRFactory();
      iRFactory1.decompile(numberLiteral0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      AstRoot astRoot0 = new AstRoot(2);
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
  public void test21()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      iRFactory0.transform(returnStatement0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(26, 2);
      iRFactory0.decompile(arrayLiteral0);
      assertEquals(24, Node.JSDOC_PROP);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      LinkedList<ObjectProperty> linkedList0 = new LinkedList<ObjectProperty>();
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(objectLiteral0).getElements();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(10).when(astRoot0).getType();
      doReturn("msg.bad.default.value").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: msg.bad.default.value
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionCall functionCall0 = new FunctionCall(65536);
      List<AstNode> list0 = functionCall0.getArguments();
      BreakStatement breakStatement0 = new BreakStatement();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(breakStatement0, breakStatement0).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(5, astRoot0.getEncodedSourceStart());
      assertEquals("xR\u0001WX\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(false).when(compilerEnvirons1).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons1);
      AstRoot astRoot0 = new AstRoot((-2217));
      iRFactory0.transformTree(astRoot0);
      FunctionNode functionNode0 = new FunctionNode();
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
  public void test25()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionCall functionCall0 = new FunctionCall(65536);
      List<AstNode> list0 = functionCall0.getArguments();
      ArrayLiteral arrayLiteral0 = mock(ArrayLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(arrayLiteral0).getElements();
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      ArrayLiteral arrayLiteral1 = mock(ArrayLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(arrayLiteral1).getElements();
      iRFactory0.decompileArrayLiteral(arrayLiteral1);
      BreakStatement breakStatement0 = new BreakStatement();
      breakStatement0.getBreakLabel();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(breakStatement0, (AstNode) null).when(functionNode0).getMemberExprNode();
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
  public void test26()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      UnaryExpression unaryExpression0 = new UnaryExpression();
      // Undeclared exception!
      try { 
        iRFactory0.transform(unaryExpression0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals("4", node0.toString());
      
      ArrayLiteral arrayLiteral0 = new ArrayLiteral((-3782), 2755);
      boolean boolean0 = iRFactory0.isDestructuring(arrayLiteral0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode(18);
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot(2);
      iRFactory0.transformTree(astRoot0);
      assertEquals(4, astRoot0.getEncodedSourceStart());
      assertEquals(5, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlElemRef xmlElemRef0 = new XmlElemRef(65536, 65536);
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
  public void test30()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      iRFactory0.transform(returnStatement0);
      FunctionNode functionNode0 = new FunctionNode();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      Name name0 = new Name(1, 140, "ipCqH$Io:8Ie");
      PropertyGet propertyGet0 = new PropertyGet(objectLiteral0, name0);
      iRFactory0.decompilePropertyGet(propertyGet0);
      Node node0 = iRFactory0.transform(propertyGet0);
      assertEquals(33, node0.getType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement();
      iRFactory0.transform(returnStatement0);
      NumberLiteral numberLiteral0 = new NumberLiteral((-387), "");
      iRFactory0.decompile(numberLiteral0);
      assertEquals(1, Node.PROPERTY_FLAG);
  }
}
