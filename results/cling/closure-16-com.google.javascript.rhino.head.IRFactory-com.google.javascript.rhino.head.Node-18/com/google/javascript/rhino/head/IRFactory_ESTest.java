/*

 * Tue Mar 03 19:49:46 GMT 2020
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
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.ErrorNode;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlPropRef;
import com.google.javascript.rhino.head.ast.Yield;
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
      ArrayLiteral arrayLiteral0 = new ArrayLiteral((-2410), 11);
      iRFactory0.decompile(arrayLiteral0);
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      SwitchStatement switchStatement0 = new SwitchStatement(165);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(5, 786);
      arrayLiteral0.setJsDocNode((Comment) null);
      Yield yield0 = new Yield(8, 25, switchStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(yield0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ErrorNode errorNode0 = new ErrorNode(65536, 65536);
      iRFactory0.isDestructuring(errorNode0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(astRoot0).getType();
      doReturn(">Q\"[%[E3*o;7)").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: >Q\"[%[E3*o;7)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(0);
      ContinueStatement continueStatement0 = new ContinueStatement(104);
      // Undeclared exception!
      try { 
        functionNode0.replaceChild(continueStatement0, continueStatement0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536);
      ElementGet elementGet0 = new ElementGet(numberLiteral0, numberLiteral0);
      iRFactory0.decompileElementGet(elementGet0);
      assertEquals((-1), elementGet0.getLineno());
      assertEquals((-1), numberLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Name name0 = new Name(65536);
      ElementGet elementGet0 = mock(ElementGet.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(elementGet0).getTarget();
      // Undeclared exception!
      try { 
        iRFactory0.decompileElementGet(elementGet0);
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
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      assertEquals(66, objectLiteral0.getType());
      
      iRFactory0.decompile(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
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
  public void test08()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode(65536);
      AstRoot astRoot0 = new AstRoot();
      astRoot0.addChildToFront(functionNode0);
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
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
      IRFactory iRFactory0 = new IRFactory();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      AstRoot astRoot0 = iRFactory0.parse("msg.bad.destruct.op", "msg.bad.destruct.op", 65536);
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0, errorReporter0);
      iRFactory1.transformTree(astRoot0);
      assertEquals(30, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ElementGet elementGet0 = new ElementGet(25, 25);
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(1161, 26, elementGet0, name0);
      // Undeclared exception!
      try { 
        iRFactory0.decompilePropertyGet(propertyGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      Name name0 = new Name(748);
      FunctionNode functionNode0 = new FunctionNode(25, name0);
      iRFactory0.isDestructuring(objectLiteral0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      Name name0 = new Name(748);
      FunctionNode functionNode0 = new FunctionNode(25, name0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(0);
      functionNode0.addChildrenToFront(functionNode0);
      IRFactory iRFactory0 = new IRFactory();
      // Undeclared exception!
      try { 
        iRFactory0.transform(functionNode0);
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1620, 65536);
      iRFactory0.transform(objectLiteral0);
      FunctionNode functionNode0 = new FunctionNode(8);
      // Undeclared exception!
      try { 
        functionNode0.getExistingIntProp(1620);
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
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      xmlPropRef0.hasConsistentReturnUsage();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(functionNode0).getType();
      doReturn((String) null).when(functionNode0).toString();
      // Undeclared exception!
      try { 
        iRFactory0.transform(functionNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: null
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode(65536);
      iRFactory0.isDestructuring(functionNode0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      astRoot0.addChildrenToBack(astRoot0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1, 1);
      astRoot0.addChildToFront(objectLiteral0);
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
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlElemRef xmlElemRef0 = new XmlElemRef(127);
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
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode(0);
      functionNode0.addParam(functionNode0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(functionNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: FUNCTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      ScriptNode scriptNode0 = iRFactory0.transformTree(astRoot0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1, 1);
      // Undeclared exception!
      try { 
        objectLiteral0.setScope(scriptNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlElemRef xmlElemRef0 = new XmlElemRef(127);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(18, 21);
      List<AstNode> list0 = arrayLiteral0.getElements();
      assertEquals(65, arrayLiteral0.getType());
      
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(xmlElemRef0, arrayLiteral0).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals("65", node0.toString());
  }
}
