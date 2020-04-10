/*

 * Tue Mar 03 19:44:48 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.ArrayComprehension;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.ForInLoop;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.InfixExpression;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.XmlPropRef;
import com.google.javascript.rhino.head.ast.Yield;
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
      BreakStatement breakStatement0 = new BreakStatement();
      // Undeclared exception!
      try { 
        breakStatement0.getExistingIntProp((-959));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(105, 3);
      ElementGet elementGet0 = mock(ElementGet.class, new ViolatedAssumptionAnswer());
      doReturn(arrayLiteral0).when(elementGet0).getElement();
      doReturn(arrayLiteral0).when(elementGet0).getTarget();
      iRFactory0.decompileElementGet(elementGet0);
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setJsDocNode((Comment) null);
      Yield yield0 = new Yield();
      Node node0 = iRFactory0.transform(yield0);
      assertEquals("72", node0.toString());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(694);
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-3617));
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals((-1), node0.getLineno());
      assertEquals("4", node0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = iRFactory0.parse("Q}/AZ@'cP", "", 4);
      // Undeclared exception!
      try { 
        iRFactory1.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: -1
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
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
  public void test06()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(0);
      objectLiteral0.addChildToFront(objectLiteral0);
      assertTrue(objectLiteral0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536, "");
      assertEquals(40, numberLiteral0.getType());
      
      iRFactory0.decompile(numberLiteral0);
      assertEquals((-1), numberLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(162, (-81));
      // Undeclared exception!
      try { 
        iRFactory0.decompile(name0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(65536, 65536, "=0bL");
      FunctionNode functionNode0 = new FunctionNode(1, name0);
      iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals((-1), functionNode0.getBaseLineno());
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(694);
      InfixExpression infixExpression0 = new InfixExpression(returnStatement0, returnStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(infixExpression0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536);
      // Undeclared exception!
      try { 
        objectLiteral0.setScope((Scope) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayComprehension arrayComprehension0 = new ArrayComprehension();
      ForInLoop forInLoop0 = new ForInLoop();
      // Undeclared exception!
      try { 
        arrayComprehension0.setScope(forInLoop0);
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
      IRFactory iRFactory0 = new IRFactory();
      Object[] objectArray0 = new Object[3];
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
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      BreakStatement breakStatement0 = new BreakStatement();
      ElementGet elementGet0 = new ElementGet(breakStatement0, breakStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(elementGet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: BREAK
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = mock(ObjectLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectLiteral0).isDestructuring();
      iRFactory0.isDestructuring(objectLiteral0);
      AstRoot astRoot0 = new AstRoot(14);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3334);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      iRFactory0.isDestructuring(objectLiteral0);
      StringReader stringReader0 = new StringReader("");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "", 200);
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
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3334);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      iRFactory0.decompile(objectLiteral0);
      StringReader stringReader0 = new StringReader("");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "", 200);
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
  public void test19()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(65536);
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.isDestructuring(functionNode0);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlPropRef xmlPropRef0 = new XmlPropRef(2);
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
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(105, 3);
      List<AstNode> list0 = arrayLiteral0.getElements();
      assertEquals(65, arrayLiteral0.getType());
      
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(arrayLiteral0, arrayLiteral0).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals((-1), node0.getLineno());
      assertEquals(65, node0.getType());
  }
}
