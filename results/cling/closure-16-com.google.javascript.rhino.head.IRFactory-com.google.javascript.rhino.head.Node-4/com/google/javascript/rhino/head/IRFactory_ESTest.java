/*

 * Tue Mar 03 19:45:00 GMT 2020
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
import com.google.javascript.rhino.head.ast.ArrayComprehensionLoop;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlPropRef;
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
      AstRoot astRoot0 = new AstRoot();
      // Undeclared exception!
      try { 
        astRoot0.getExistingIntProp(2);
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
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      iRFactory0.transform(returnStatement0);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(39);
      // Undeclared exception!
      try { 
        returnStatement0.setScope(arrayComprehensionLoop0);
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
      IRFactory iRFactory0 = new IRFactory();
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(100, (-1222));
      iRFactory0.checkMutableReference(keywordLiteral0);
      assertEquals((-1), keywordLiteral0.getType());
      assertEquals("-1", keywordLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3111, 2580);
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      VariableInitializer variableInitializer0 = new VariableInitializer(2);
      // Undeclared exception!
      try { 
        iRFactory0.transform(variableInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 122
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      iRFactory0.transform(returnStatement0);
      AstRoot astRoot0 = new AstRoot(156);
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceStart());
      assertEquals("\u0004R\u0001\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(11);
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("language version").when(functionNode0).getName();
      doReturn(linkedList0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3111, 2580);
      iRFactory0.isDestructuring(objectLiteral0);
      VariableInitializer variableInitializer0 = new VariableInitializer(2);
      // Undeclared exception!
      try { 
        iRFactory0.transform(variableInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 122
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      iRFactory0.transform(returnStatement0);
      XmlElemRef xmlElemRef0 = new XmlElemRef(17, (-4192));
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
  public void test08()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot((-1679));
      Name name0 = new Name(3, 11, "language version");
      PropertyGet propertyGet0 = new PropertyGet(astRoot0, name0, 4);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(propertyGet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: SCRIPT
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(11);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      assertEquals(66, objectLiteral0.getType());
      
      ElementGet elementGet0 = mock(ElementGet.class, new ViolatedAssumptionAnswer());
      doReturn((AstNode) null).when(elementGet0).getElement();
      doReturn(objectLiteral0).when(elementGet0).getTarget();
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
  public void test11()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      XmlElemRef xmlElemRef0 = new XmlElemRef(0);
      returnStatement0.putProp(7, xmlElemRef0);
      AstRoot astRoot0 = new AstRoot(156);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      // Undeclared exception!
      try { 
        objectLiteral0.addChildBefore(objectLiteral0, objectLiteral0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(2451);
      iRFactory0.transform(returnStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(arrayComprehensionLoop0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: FOR
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
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
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Assignment assignment0 = new Assignment(65536);
      ReturnStatement returnStatement0 = new ReturnStatement(5, 26);
      returnStatement0.putIntProp(16, 26);
      iRFactory0.transform(returnStatement0);
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
  public void test16()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isStrictMode();
      doReturn(false).when(compilerEnvirons0).isXmlAvailable();
      IRFactory iRFactory0 = new IRFactory();
      StringReader stringReader0 = new StringReader("atan");
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      AstRoot astRoot0 = iRFactory1.parse((Reader) stringReader0, "atan", 1058);
      assertEquals(136, astRoot0.getType());
      
      Node node0 = iRFactory0.transform(astRoot0);
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals(4, node0.getType());
      assertEquals((-1), node0.getLineno());
      
      AstRoot astRoot0 = iRFactory0.parse("bW", "msg.bad.for.in.lhs", 8);
      assertTrue(astRoot0.hasChildren());
      assertEquals(136, astRoot0.getType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      iRFactory0.transform(returnStatement0);
      Name name0 = new Name(11);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn((String) null).when(functionNode0).getName();
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
  public void test19()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      iRFactory0.transform(variableDeclaration0);
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals(4, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals(4, node0.getType());
      assertEquals((-1), node0.getLineno());
      
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3111, 2580);
      iRFactory0.isDestructuring(objectLiteral0);
      assertEquals(66, objectLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals("4", node0.toString());
      assertEquals((-1), node0.getLineno());
      
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3111, 2580);
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      assertEquals(66, objectLiteral0.getType());
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      ElementGet elementGet0 = new ElementGet((-1695), 9);
      elementGet0.addChildrenToFront(returnStatement0);
      VariableInitializer variableInitializer0 = new VariableInitializer(2);
      // Undeclared exception!
      try { 
        iRFactory0.transform(variableInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 122
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      Node node0 = iRFactory0.transform(arrayLiteral0);
      // Undeclared exception!
      try { 
        node0.replaceChild(arrayLiteral0, arrayLiteral0);
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
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.transform(arrayLiteral0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      // Undeclared exception!
      try { 
        objectLiteral0.labelId();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.transform(arrayLiteral0);
      iRFactory0.decompile(arrayLiteral0);
      assertEquals(1, Node.END_DROPS_OFF);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      IRFactory iRFactory0 = new IRFactory();
      astRoot0.hasConsistentReturnUsage();
      iRFactory0.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.transform(arrayLiteral0);
      // Undeclared exception!
      try { 
        iRFactory0.destructuringAssignmentHelper(16, arrayLiteral0, arrayLiteral0, "+|^Pd&ed\"0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      ElementGet elementGet0 = new ElementGet((-1695), 9);
      elementGet0.addChildrenToFront(node0);
      assertEquals(36, elementGet0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals("4", node0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.transform(arrayLiteral0);
      ReturnStatement returnStatement0 = new ReturnStatement(1, 25);
      AstRoot astRoot0 = new AstRoot(125);
      // Undeclared exception!
      try { 
        returnStatement0.setScope(astRoot0);
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
      Context context0 = new Context();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      ErrorReporter errorReporter1 = context0.setErrorReporter(errorReporter0);
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter1).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      XmlPropRef xmlPropRef0 = new XmlPropRef(110, (-1098));
      xmlPropRef0.getPropName();
      SwitchCase switchCase0 = new SwitchCase(3, 25);
      switchCase0.getStatements();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(xmlPropRef0, (AstNode) null).when(functionNode0).getMemberExprNode();
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
  public void test31()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals("4", node0.toString());
      assertEquals((-1), node0.getLineno());
      
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals((-1), functionNode0.getLineno());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(65536, 65536);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals((-1), node0.getLineno());
      assertEquals(4, node0.getType());
      
      XmlElemRef xmlElemRef0 = new XmlElemRef(0);
      returnStatement0.putProp(7, xmlElemRef0);
      assertEquals(77, xmlElemRef0.getType());
  }
}
