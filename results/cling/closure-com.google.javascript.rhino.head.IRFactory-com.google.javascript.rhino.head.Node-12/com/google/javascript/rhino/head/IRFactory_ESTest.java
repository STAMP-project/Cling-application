/*

 * Tue Mar 03 19:47:53 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.Token;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.WhileLoop;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.XmlString;
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
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.decompile(arrayLiteral0);
      assertNull(arrayLiteral0.getJsDoc());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      WhileLoop whileLoop0 = new WhileLoop();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(130, 1, token_CommentType0, "d&$r5^Bv(XhhV582C");
      whileLoop0.setJsDocNode(comment0);
      whileLoop0.removeProp(144);
      // Undeclared exception!
      try { 
        iRFactory0.transform(whileLoop0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(4);
      astRoot0.setJsDocNode((Comment) null);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(124, (-824));
      Node node0 = iRFactory0.transform(variableDeclaration0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      // Undeclared exception!
      try { 
        iRFactory0.destructuringAssignmentHelper((-260), objectLiteral0, objectLiteral0, "p0tUN)pJ>\"5Qn'KZ0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ReturnStatement returnStatement0 = new ReturnStatement(7, 17, objectLiteral0);
      boolean boolean0 = iRFactory0.isDestructuring(objectLiteral0);
      assertFalse(boolean0);
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertTrue(node0.hasChildren());
      assertEquals((-1), node0.getLineno());
      assertEquals(4, node0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(9, 8);
      // Undeclared exception!
      try { 
        switchStatement0.removeChild((Node) null);
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      NumberLiteral numberLiteral0 = new NumberLiteral(0.0);
      iRFactory0.decompile(numberLiteral0);
      assertEquals((-1), numberLiteral0.getLineno());
      assertEquals(0.0, numberLiteral0.getDouble(), 0.01);
      assertEquals(0.0, numberLiteral0.getNumber(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Name name0 = new Name(9, 12, "");
      assertEquals(39, name0.getType());
      
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      iRFactory0.decompile(name0);
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ReturnStatement returnStatement0 = new ReturnStatement(25, (-1261));
      iRFactory0.transform(returnStatement0);
      ElementGet elementGet0 = new ElementGet();
      // Undeclared exception!
      try { 
        elementGet0.getExistingIntProp(15);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ReturnStatement returnStatement0 = new ReturnStatement(7, 17, objectLiteral0);
      objectLiteral0.addChildrenToBack(objectLiteral0);
      Node node0 = iRFactory0.transform(returnStatement0);
      assertTrue(objectLiteral0.hasChildren());
      assertEquals(4, node0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.transform(objectLiteral0);
      NewExpression newExpression0 = new NewExpression(11);
      // Undeclared exception!
      try { 
        newExpression0.setString(" xml");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.NewExpression cannot be cast to com.google.javascript.rhino.head.ast.Name
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ReturnStatement returnStatement0 = new ReturnStatement(7, 17, objectLiteral0);
      iRFactory0.isDestructuring(returnStatement0);
      assertEquals(4, returnStatement0.getType());
      
      Node node0 = iRFactory0.transform(returnStatement0);
      assertEquals((-1), node0.getLineno());
      assertEquals(4, node0.getType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ReturnStatement returnStatement0 = new ReturnStatement(7, 17, objectLiteral0);
      FunctionNode functionNode0 = new FunctionNode(8);
      iRFactory0.transform(returnStatement0);
      ElementGet elementGet0 = new ElementGet(objectLiteral0, functionNode0);
      // Undeclared exception!
      try { 
        iRFactory0.decompileElementGet(elementGet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: FUNCTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(3009);
      AstRoot astRoot0 = new AstRoot(7);
      // Undeclared exception!
      try { 
        arrayLiteral0.setScope(astRoot0);
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
  @Ignore
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ReturnStatement returnStatement0 = new ReturnStatement(7, 17, objectLiteral0);
      objectLiteral0.addChild(returnStatement0);
      // Undeclared exception!
      iRFactory0.transform(returnStatement0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      IRFactory iRFactory1 = new IRFactory();
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn((Name) null).when(functionNode0).getMemberExprNode();
      doReturn(linkedList0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = iRFactory1.parse("msg.bad.for.in.destruct", "importClass", 3241);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals(38, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.transform(objectLiteral0);
      Name name0 = new Name(2, 17);
      FunctionNode functionNode0 = new FunctionNode(11, name0);
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      NumberLiteral numberLiteral0 = new NumberLiteral(0.0);
      Node node0 = iRFactory0.transform(numberLiteral0);
      XmlString xmlString0 = new XmlString(4, "q?a");
      // Undeclared exception!
      try { 
        node0.replaceChild(numberLiteral0, xmlString0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      NumberLiteral numberLiteral0 = new NumberLiteral(0.0);
      assertEquals(40, numberLiteral0.getType());
      
      Node node0 = iRFactory0.transform(numberLiteral0);
      assertEquals((-1), node0.getLineno());
      assertEquals(0.0, node0.getDouble(), 0.01);
      
      StringReader stringReader0 = new StringReader("&w~HpKXC+~at?%V/ c");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "+0H~Z5G\"j4P", 76);
      assertTrue(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.transform(objectLiteral0);
      ReturnStatement returnStatement0 = new ReturnStatement(7, 17, objectLiteral0);
      ObjectProperty objectProperty0 = new ObjectProperty(23);
      ElementGet elementGet0 = new ElementGet(objectProperty0, returnStatement0);
      // Undeclared exception!
      try { 
        elementGet0.getExistingIntProp(2148);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(573);
      iRFactory0.transformTree(astRoot0);
      SwitchStatement switchStatement0 = new SwitchStatement(9, 8);
      // Undeclared exception!
      try { 
        switchStatement0.removeChild((Node) null);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      IRFactory iRFactory1 = new IRFactory();
      AstRoot astRoot0 = iRFactory1.parse("msg.bad.for.in.destruct", "importClass", 3241);
      iRFactory0.transformTree(astRoot0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory1.decompileObjectLiteral(objectLiteral0);
      assertEquals(19, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlElemRef xmlElemRef0 = new XmlElemRef();
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
  public void test25()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.transform(objectLiteral0);
      FunctionNode functionNode0 = new FunctionNode(8);
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertNull(node0);
  }
}
