/*

 * Tue Mar 03 19:48:17 GMT 2020
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
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.ArrayComprehension;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ConditionalExpression;
import com.google.javascript.rhino.head.ast.DoLoop;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyStatement;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.LetNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.WithStatement;
import com.google.javascript.rhino.head.ast.XmlElemRef;
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
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      StringLiteral stringLiteral0 = new StringLiteral(1075);
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
      Block block0 = new Block(650);
      // Undeclared exception!
      try { 
        block0.getExistingIntProp(26);
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
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(65536, 65536);
      iRFactory0.decompile(arrayLiteral0);
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      IRFactory iRFactory0 = new IRFactory();
      iRFactory0.checkMutableReference(withStatement0);
      assertEquals((-1), withStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      XmlElemRef xmlElemRef0 = new XmlElemRef(65536);
      iRFactory0.isDestructuring(xmlElemRef0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(26).when(astRoot0).getType();
      doReturn("K}yVz").when(astRoot0).toString();
      doReturn(true).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: K}yVz
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(65536, 65536, "");
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("").when(functionNode0).getName();
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
      IRFactory iRFactory0 = new IRFactory();
      Yield yield0 = new Yield(147);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(54, 145);
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      Name name0 = new Name(2, 126, "OASdRAr7H;xP)");
      PropertyGet propertyGet0 = new PropertyGet(4, 126, yield0, name0);
      Node node0 = iRFactory0.transform(propertyGet0);
      assertEquals(33, node0.getType());
      assertTrue(node0.hasChildren());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayComprehension arrayComprehension0 = new ArrayComprehension(4);
      arrayComprehension0.setJsDocNode((Comment) null);
      assertEquals((-1), arrayComprehension0.getLineno());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      // Undeclared exception!
      try { 
        astRoot0.removeChild((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Yield yield0 = new Yield(147);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(54, 145);
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals(66, node0.getType());
      
      Name name0 = new Name(2, 126, "OASdRAr7H;xP)");
      PropertyGet propertyGet0 = new PropertyGet(4, 126, yield0, name0);
      Node node1 = iRFactory0.transform(propertyGet0);
      assertEquals((-1), node1.getLineno());
      assertEquals(33, node1.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Name name0 = new Name(65536, 65536, "");
      PropertyGet propertyGet0 = new PropertyGet(26, 117, name0, name0);
      assertEquals(33, propertyGet0.getType());
      
      iRFactory0.decompilePropertyGet(propertyGet0);
      assertEquals((-1), propertyGet0.getLineno());
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(compilerEnvirons0).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = new AstRoot(1);
      iRFactory0.transformTree(astRoot0);
      SwitchStatement switchStatement0 = new SwitchStatement(149);
      // Undeclared exception!
      try { 
        switchStatement0.setScope((Scope) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(0, (-308));
      assertEquals(66, objectLiteral0.getType());
      
      iRFactory0.decompile(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(158);
      iRFactory0.transform(variableDeclaration0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(23, 143);
      // Undeclared exception!
      try { 
        objectLiteral0.setString("node is not a child");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.ObjectLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Name name0 = new Name();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      // Undeclared exception!
      try { 
        name0.addChildBefore(arrayLiteral0, arrayLiteral0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(1);
      ElementGet elementGet0 = new ElementGet(9, 2);
      elementGet0.addChildrenToFront(functionNode0);
      assertTrue(elementGet0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("eval");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "", 18);
      // Undeclared exception!
      try { 
        astRoot0.removeChild((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayComprehension arrayComprehension0 = new ArrayComprehension(652, 152);
      StringReader stringReader0 = new StringReader("eval");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "", 7);
      // Undeclared exception!
      try { 
        astRoot0.removeChild(arrayComprehension0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = iRFactory1.parse("Rq<yDw", "language version", 7);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(13, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(103, name0);
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
  public void test21()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Yield yield0 = new Yield(147);
      Name name0 = new Name(2, 126, "OASdRAr7H;xP)");
      PropertyGet propertyGet0 = new PropertyGet(4, 126, yield0, name0);
      Node node0 = iRFactory0.transform(propertyGet0);
      assertEquals("33", node0.toString());
      assertEquals((-1), node0.getLineno());
      
      Node node1 = iRFactory0.createName(65536, "OASdRAr7H;xP)", yield0);
      assertEquals("65536", node1.toString());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      EmptyStatement emptyStatement0 = new EmptyStatement(20, 3266);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(0, (-308));
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals(66, node0.getType());
      
      iRFactory0.decompile(emptyStatement0);
      assertEquals((-1), emptyStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.parse("eval", "eval", 4);
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
  public void test24()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(2, 13, (AstNode) null);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals((-1), node0.getLineno());
      assertEquals("4", node0.toString());
      
      Node node1 = iRFactory0.createName(2, "error reporter", returnStatement0);
      assertTrue(node1.hasChildren());
      assertEquals(2, node1.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NewExpression newExpression0 = new NewExpression((-3019), 154);
      newExpression0.hasConsistentReturnUsage();
      ScriptNode scriptNode0 = new ScriptNode(2);
      ScriptNode scriptNode1 = (ScriptNode)iRFactory0.transform(scriptNode0);
      assertEquals((-1), scriptNode1.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(884, 0);
      iRFactory0.isDestructuring(conditionalExpression0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(conditionalExpression0, conditionalExpression0).when(functionNode0).getMemberExprNode();
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
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      BreakStatement breakStatement0 = new BreakStatement(149, 149);
      DoLoop doLoop0 = new DoLoop(2);
      List<AstNode> list0 = doLoop0.getStatements();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn((Name) null).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals(118, doLoop0.getType());
      
      Node node0 = iRFactory0.transform(breakStatement0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536, 65536);
      iRFactory0.transform(objectLiteral0);
      LetNode letNode0 = new LetNode(4030, (-3048));
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(118);
      // Undeclared exception!
      try { 
        keywordLiteral0.setScope(letNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals("66", node0.toString());
      
      iRFactory0.isDestructuring(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }
}
