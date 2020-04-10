/*

 * Tue Mar 03 19:37:02 GMT 2020
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
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.XmlPropRef;
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
      NumberLiteral numberLiteral0 = new NumberLiteral();
      AstRoot astRoot0 = new AstRoot(2);
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(numberLiteral0);
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
      AstRoot astRoot0 = new AstRoot((-2802));
      iRFactory0.transformTree(astRoot0);
      NumberLiteral numberLiteral0 = new NumberLiteral();
      // Undeclared exception!
      try { 
        iRFactory0.decompile(numberLiteral0);
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
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceEnd());
      assertEquals(2, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      IRFactory iRFactory1 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(28);
      iRFactory0.transformTree(astRoot0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(8);
      ObjectProperty objectProperty0 = new ObjectProperty();
      objectLiteral0.addElement(objectProperty0);
      // Undeclared exception!
      try { 
        iRFactory1.decompileObjectLiteral(objectLiteral0);
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
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(functionNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: FUNCTION
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
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      AstRoot astRoot0 = new AstRoot();
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
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot();
      ScriptNode scriptNode0 = iRFactory0.transformTree(astRoot0);
      iRFactory0.isDestructuring(scriptNode0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals("\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(151);
      iRFactory0.isDestructuring(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals("ST\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = new NumberLiteral();
      iRFactory0.transform(numberLiteral0);
      AstRoot astRoot0 = new AstRoot(2);
      iRFactory0.transformTree(astRoot0);
      assertEquals(4, astRoot0.getEncodedSourceEnd());
      assertEquals("(S\u0000\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.decompileFunctionHeader(functionNode0);
      iRFactory0.transformTree(astRoot0);
      assertEquals(4, astRoot0.getEncodedSourceStart());
      assertEquals("WXU\u0001\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0);
      iRFactory1.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      IRFactory iRFactory1 = new IRFactory();
      AstRoot astRoot0 = new AstRoot((-1177));
      iRFactory0.transformTree(astRoot0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1);
      ObjectProperty objectProperty0 = new ObjectProperty();
      objectLiteral0.addElement(objectProperty0);
      // Undeclared exception!
      try { 
        iRFactory1.decompileObjectLiteral(objectLiteral0);
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
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
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
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(65536);
      iRFactory0.isDestructuring(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot((-1177));
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(1997);
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Name name0 = new Name(126, 65536);
      NativeArray nativeArray0 = new NativeArray(65535L);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("e").when(functionNode0).getName();
      doReturn((List) null).when(functionNode0).getParams();
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
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompile(objectLiteral0);
      AstRoot astRoot0 = new AstRoot(2);
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceEnd());
      assertEquals("UV\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      NumberLiteral numberLiteral0 = new NumberLiteral(158, ";gHV.");
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(numberLiteral0, xmlPropRef0).when(functionNode0).getMemberExprNode();
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
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Name name0 = new Name(65536, 61, ",");
      NewExpression newExpression0 = new NewExpression(4, 25);
      List<AstNode> list0 = newExpression0.getArguments();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("").when(functionNode0).getName();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot(125);
      iRFactory0.transformTree(astRoot0);
      assertEquals(7, astRoot0.getEncodedSourceEnd());
      assertEquals(6, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(156);
      iRFactory0.decompile(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot(125);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals(3, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      IRFactory iRFactory1 = new IRFactory();
      AstRoot astRoot0 = iRFactory0.parse("com.google.javascript.rhino.head.ContinuationPending", "", 2);
      iRFactory1.transformTree(astRoot0);
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode((-1488), name0);
      // Undeclared exception!
      try { 
        iRFactory1.decompileFunctionHeader(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = new AstRoot(125);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      
      boolean boolean0 = iRFactory0.isDestructuring((Node) null);
      assertFalse(boolean0);
  }
}
