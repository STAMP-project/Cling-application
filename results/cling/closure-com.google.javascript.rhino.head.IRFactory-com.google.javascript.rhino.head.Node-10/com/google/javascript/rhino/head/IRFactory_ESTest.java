/*

 * Tue Mar 03 19:45:32 GMT 2020
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
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.GeneratorExpressionLoop;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.TryStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlMemberGet;
import com.google.javascript.rhino.head.ast.Yield;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
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
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(131);
      assertEquals(65, arrayLiteral0.getType());
      
      iRFactory0.decompile(arrayLiteral0);
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Object[] objectArray0 = new Object[3];
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
  public void test02()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = new NumberLiteral((double) 65536);
      Name name0 = new Name(18, 185, "w");
      PropertyGet propertyGet0 = new PropertyGet(numberLiteral0, name0, 2653);
      assertEquals(33, propertyGet0.getType());
      
      iRFactory0.decompilePropertyGet(propertyGet0);
      assertEquals((-1), propertyGet0.getLineno());
      assertEquals((-1), numberLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      // Undeclared exception!
      try { 
        tryStatement0.labelId();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression(46);
      ContinueStatement continueStatement0 = new ContinueStatement();
      // Undeclared exception!
      try { 
        unaryExpression0.addChildBefore(continueStatement0, continueStatement0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      FunctionNode functionNode0 = new FunctionNode(25, (Name) null);
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(25).when(astRoot0).getType();
      doReturn("").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
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
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Yield yield0 = new Yield(2, 1);
      XmlElemRef xmlElemRef0 = new XmlElemRef();
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(yield0, xmlElemRef0, 22);
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
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(4, name0);
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
  public void test08()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = new NumberLiteral(0.0);
      Name name0 = new Name(113, 22, "M<IQ&/1\"!|D]");
      PropertyGet propertyGet0 = new PropertyGet(numberLiteral0, name0, 1);
      Node node0 = iRFactory0.transform(propertyGet0);
      assertEquals(0.0, numberLiteral0.getNumber(), 0.01);
      assertEquals((-1), node0.getLineno());
      assertEquals(33, node0.getType());
      assertEquals((-1), propertyGet0.getLineno());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(5);
      assertEquals(66, objectLiteral0.getType());
      
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals("66", node0.toString());
      
      boolean boolean0 = iRFactory0.isDestructuring(objectLiteral0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Yield yield0 = new Yield(0, 1);
      iRFactory0.transform(yield0);
      NativeArray nativeArray0 = new NativeArray(11);
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
  public void test11()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(5);
      // Undeclared exception!
      try { 
        objectLiteral0.setString("L");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.ObjectLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      UnaryExpression unaryExpression0 = new UnaryExpression(169, 65536);
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
  public void test13()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(5);
      IRFactory iRFactory0 = new IRFactory();
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals(66, node0.getType());
      
      iRFactory0.decompile(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 46, (AstNode) null);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals((-1), node0.getLineno());
      assertEquals(4, node0.getType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(5);
      boolean boolean0 = objectLiteral0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals(66, objectLiteral0.getType());
      
      IRFactory iRFactory0 = new IRFactory();
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals((-1), node0.getLineno());
      assertEquals(66, node0.getType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Assignment assignment0 = new Assignment(65536, 65536);
      // Undeclared exception!
      try { 
        iRFactory0.transform(assignment0);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ScriptNode scriptNode0 = new ScriptNode(140);
      assertEquals(136, scriptNode0.getType());
      
      Node node0 = iRFactory0.transform(scriptNode0);
      assertNotNull(node0);
      assertEquals((-1), node0.getLineno());
      
      StringReader stringReader0 = new StringReader("$rdo:u]8}vwU");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "$rdo:u]8}vwU", 4);
      assertTrue(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536, 65536);
      iRFactory0.transform(objectLiteral0);
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(6);
      UnaryExpression unaryExpression0 = new UnaryExpression(154, 1613, generatorExpressionLoop0, true);
      // Undeclared exception!
      try { 
        iRFactory0.destructuringAssignmentHelper(100, objectLiteral0, unaryExpression0, "GeneratorExpression");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn((Name) null).when(functionNode0).getMemberExprNode();
      doReturn(linkedList0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      Yield yield0 = new Yield(0, 1);
      assertEquals(72, yield0.getType());
      
      Node node0 = iRFactory0.transform(yield0);
      assertEquals((-1), node0.getLineno());
      assertEquals("72", node0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
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
  public void test21()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536, 65536);
      assertEquals(66, objectLiteral0.getType());
      
      iRFactory0.transform(objectLiteral0);
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(6);
      UnaryExpression unaryExpression0 = new UnaryExpression(154, 1613, generatorExpressionLoop0, true);
      unaryExpression0.addChildrenToBack(generatorExpressionLoop0);
      assertTrue(unaryExpression0.hasChildren());
  }
}
