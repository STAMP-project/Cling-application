/*

 * Tue Mar 03 19:49:54 GMT 2020
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
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.CatchClause;
import com.google.javascript.rhino.head.ast.ConditionalExpression;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.LetNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlMemberGet;
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
      IRFactory iRFactory0 = new IRFactory();
      StringLiteral stringLiteral0 = new StringLiteral();
      ElementGet elementGet0 = new ElementGet(stringLiteral0, stringLiteral0);
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
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ElementGet elementGet0 = new ElementGet();
      elementGet0.putProp(65536, (Object) null);
      AstRoot astRoot0 = new AstRoot(3);
      iRFactory0.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals((-1), astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Object[] objectArray0 = new Object[8];
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
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ElementGet elementGet0 = new ElementGet();
      elementGet0.putProp(316, "Unexpected return type ");
      elementGet0.removeProp(85);
      AstRoot astRoot0 = new AstRoot(3091);
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlElemRef xmlElemRef0 = new XmlElemRef(65536);
      FunctionNode functionNode0 = new FunctionNode(9);
      xmlElemRef0.addChildToFront(functionNode0);
      assertTrue(xmlElemRef0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      Node node0 = Node.newString(244, "Unexpected return type ");
      // Undeclared exception!
      try { 
        elementGet0.replaceChild(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(137);
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(arrayLiteral0, name0);
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
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(4, (-1670));
      ElementGet elementGet0 = new ElementGet(objectLiteral0, objectLiteral0);
      iRFactory0.decompileElementGet(elementGet0);
      assertEquals((-1), elementGet0.getLineno());
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(true).when(compilerEnvirons0).isRecordingComments();
      doReturn(false).when(compilerEnvirons0).isStrictMode();
      doReturn(true, true).when(compilerEnvirons0).isXmlAvailable();
      doReturn(true, false, false).when(compilerEnvirons0).recoverFromErrors();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      doReturn((EvaluatorException) null).when(errorReporter0).runtimeError(anyString() , anyString() , anyInt() , anyString() , anyInt());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("E~|`yr4E{*CO/'>IPY");
      // Undeclared exception!
      try { 
        iRFactory0.parse((Reader) stringReader0, "", 65536);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(65536, 65536);
      // Undeclared exception!
      try { 
        conditionalExpression0.labelId();
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
      NewExpression newExpression0 = new NewExpression(2);
      XmlPropRef xmlPropRef0 = new XmlPropRef(12);
      // Undeclared exception!
      try { 
        xmlPropRef0.addChildBefore(newExpression0, newExpression0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet();
      elementGet0.putProp(23, xmlMemberGet0);
      // Undeclared exception!
      try { 
        elementGet0.getExistingIntProp(3);
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
      ElementGet elementGet0 = new ElementGet();
      BreakStatement breakStatement0 = new BreakStatement();
      breakStatement0.addChildrenToFront(elementGet0);
      assertTrue(breakStatement0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      LetNode letNode0 = new LetNode();
      // Undeclared exception!
      try { 
        elementGet0.setScope(letNode0);
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
      Name name0 = new Name(1, (-1776), "Unexpected return type ");
      FunctionNode functionNode0 = new FunctionNode(12, name0);
      functionNode0.addChildToBack(name0);
      LabeledStatement labeledStatement0 = new LabeledStatement();
      // Undeclared exception!
      try { 
        functionNode0.removeChild(labeledStatement0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      ScriptNode scriptNode0 = iRFactory0.transformTree(astRoot0);
      iRFactory0.isDestructuring(scriptNode0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      boolean boolean0 = astRoot0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ContinueStatement continueStatement0 = new ContinueStatement(102, (Name) null);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(2442, 81, continueStatement0);
      assertEquals(87, parenthesizedExpression0.getType());
      
      Node node0 = iRFactory0.transform(parenthesizedExpression0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name();
      NewExpression newExpression0 = new NewExpression(2);
      List<AstNode> list0 = newExpression0.getArguments();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("").when(functionNode0).getName();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(false).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      XmlPropRef xmlPropRef0 = new XmlPropRef(12);
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
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = iRFactory1.parse("msg.modify.sealed", "", 1);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertTrue(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ElementGet elementGet0 = new ElementGet();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(elementGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals("66", node0.toString());
      
      boolean boolean0 = iRFactory0.isDestructuring(objectLiteral0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals((-1), node0.getLineno());
      assertEquals(66, node0.getType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(19, 0);
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
  public void test25()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral((-1668));
      // Undeclared exception!
      try { 
        arrayLiteral0.setString("\"");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.ArrayLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      UnaryExpression unaryExpression0 = new UnaryExpression((-19));
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
      AstRoot astRoot0 = iRFactory0.parse("", "3)q\"M:Rltf", 2442);
      Yield yield0 = new Yield(65536, 65536, astRoot0);
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(yield0, name0, 23);
      // Undeclared exception!
      try { 
        iRFactory0.transform(propertyGet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = (NumberLiteral)iRFactory0.createNumber(0.0);
      AstRoot astRoot0 = new AstRoot(3);
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
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      StringLiteral stringLiteral0 = new StringLiteral();
      iRFactory0.isDestructuring(stringLiteral0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(16).when(astRoot0).getType();
      doReturn("each ").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: each 
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NewExpression newExpression0 = new NewExpression(1361, 125);
      List<AstNode> list0 = newExpression0.getArguments();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn((Name) null).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn((-1112)).when(astRoot0).getType();
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
  public void test31()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Context.getCurrentContext();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      CatchClause catchClause0 = new CatchClause(65536, 121);
      catchClause0.getVarName();
      NativeArray nativeArray0 = new NativeArray(5774L);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(catchClause0, (AstNode) null).when(functionNode0).getMemberExprNode();
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
}
