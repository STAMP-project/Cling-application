/*

 * Tue Mar 03 19:43:24 GMT 2020
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
import com.google.javascript.rhino.head.Token;
import com.google.javascript.rhino.head.ast.ArrayComprehensionLoop;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.WithStatement;
import com.google.javascript.rhino.head.ast.XmlLiteral;
import com.google.javascript.rhino.head.ast.Yield;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536);
      // Undeclared exception!
      try { 
        objectLiteral0.getExistingIntProp(3839);
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
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(26, 22, token_CommentType0, "");
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-17), (-17));
      objectLiteral0.setJsDocNode((Comment) null);
      // Undeclared exception!
      try { 
        iRFactory0.transform(comment0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 161
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      NativeArray nativeArray0 = new NativeArray(65536);
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
      IRFactory iRFactory0 = new IRFactory();
      PropertyGet propertyGet0 = new PropertyGet((-269), 16);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(propertyGet0);
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
      RegExpLiteral regExpLiteral0 = new RegExpLiteral((-1620));
      Yield yield0 = new Yield(1679, 1679, regExpLiteral0);
      // Undeclared exception!
      try { 
        yield0.replaceChild(regExpLiteral0, regExpLiteral0);
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
      ObjectProperty objectProperty0 = new ObjectProperty();
      WithStatement withStatement0 = new WithStatement();
      withStatement0.addChildBefore(objectProperty0, (Node) null);
      assertTrue(withStatement0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(65536, "5g7YCSvEX%]!jK:lYD");
      iRFactory0.decompile(name0);
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(120, 18);
      iRFactory0.decompile(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name();
      NativeArray nativeArray0 = new NativeArray(0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("<>").when(functionNode0).getName();
      doReturn(nativeArray0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      EmptyExpression emptyExpression0 = new EmptyExpression(0);
      iRFactory0.isDestructuring(emptyExpression0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(16).when(astRoot0).getType();
      doReturn("<e1}${tUk").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: <e1}${tUk
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(26, 22, token_CommentType0, "");
      SwitchStatement switchStatement0 = new SwitchStatement(128);
      switchStatement0.getJsDocNode();
      // Undeclared exception!
      try { 
        iRFactory0.transform(comment0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: 161
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(65536);
      Node node0 = iRFactory0.transform(variableDeclaration0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = new NumberLiteral(2334, 2334);
      assertEquals(40, numberLiteral0.getType());
      
      iRFactory0.decompile(numberLiteral0);
      assertEquals((-1), numberLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536);
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals(66, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      StringReader stringReader0 = new StringReader("");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "", 151);
      // Undeclared exception!
      try { 
        astRoot0.setString("push");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.AstRoot cannot be cast to com.google.javascript.rhino.head.ast.Name
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Yield yield0 = new Yield(0, (-1318), (AstNode) null);
      assertEquals(72, yield0.getType());
      
      Node node0 = iRFactory0.transform(yield0);
      assertEquals((-1), node0.getLineno());
      assertEquals("72", node0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      RegExpLiteral regExpLiteral0 = new RegExpLiteral((-1620));
      Yield yield0 = new Yield(1679, 1679, regExpLiteral0);
      ThrowStatement throwStatement0 = new ThrowStatement((-1620), 65536, yield0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(throwStatement0);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536);
      iRFactory0.transform(objectLiteral0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(13);
      // Undeclared exception!
      try { 
        arrayLiteral0.labelId();
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536);
      iRFactory0.transform(objectLiteral0);
      ElementGet elementGet0 = new ElementGet(131);
      ElementGet elementGet1 = new ElementGet(elementGet0, objectLiteral0);
      // Undeclared exception!
      try { 
        iRFactory0.decompileElementGet(elementGet1);
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
      doReturn(false, true).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isStrictMode();
      doReturn(true, false, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(true, false).when(compilerEnvirons0).recoverFromErrors();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      AstRoot astRoot0 = iRFactory0.parse("Calling Context.exit without previous Context.enter", "Calling Context.exit without previous Context.enter", 143);
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
  public void test21()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      objectProperty0.hasConsistentReturnUsage();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(objectProperty0);
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
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name();
      iRFactory0.isDestructuring(name0);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(4);
      // Undeclared exception!
      try { 
        iRFactory0.transform(arrayComprehensionLoop0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Name name0 = new Name();
      XmlLiteral xmlLiteral0 = new XmlLiteral();
      name0.addChildrenToBack(xmlLiteral0);
      FunctionCall functionCall0 = new FunctionCall(25);
      ThrowStatement throwStatement0 = new ThrowStatement(23, 15, functionCall0);
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(throwStatement0);
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
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.decompileFunctionHeader(functionNode0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(5, astRoot0.getEncodedSourceEnd());
      assertEquals(4, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment(8, 127, token_CommentType0, "zs9&w k_e^C0)/$");
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1, 1);
      objectLiteral0.setJsDocNode(comment0);
      objectLiteral0.setJsDocNode(comment0);
      assertEquals(25, Node.EXPRESSION_CLOSURE_PROP);
  }
}
