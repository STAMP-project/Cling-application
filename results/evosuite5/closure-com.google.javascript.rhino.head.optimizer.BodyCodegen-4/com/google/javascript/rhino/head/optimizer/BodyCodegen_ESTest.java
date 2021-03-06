/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 22:29:40 GMT 2019
 */

package com.google.javascript.rhino.head.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Jump;
import com.google.javascript.rhino.head.ast.Label;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.XmlDotQuery;
import com.google.javascript.rhino.head.optimizer.BodyCodegen;
import com.google.javascript.rhino.head.optimizer.Codegen;
import com.google.javascript.rhino.head.optimizer.OptFunctionNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BodyCodegen_ESTest extends BodyCodegen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ScriptNode scriptNode0 = new ScriptNode();
      Node node0 = Node.newTarget();
      scriptNode0.addChildrenToFront(node0);
      Codegen codegen0 = new Codegen();
      codegen0.compileToClassFile(compilerEnvirons0, "=@J'Hy", scriptNode0, "language version", false);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "()Ljava/lang/String;", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can only mark label once
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ScriptNode scriptNode0 = new ScriptNode(11);
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery(19);
      scriptNode0.addChildrenToFront(xmlDotQuery0);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "error reporter", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad tree in codegen
         //
         verifyException("com.google.javascript.rhino.head.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ScriptNode scriptNode0 = new ScriptNode();
      UnaryExpression unaryExpression0 = new UnaryExpression(160, 2, scriptNode0, false);
      scriptNode0.addChildrenToFront(unaryExpression0);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "T", scriptNode0, "U.btF~3tHQ", false);
      assertEquals(2390, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ScriptNode scriptNode0 = new ScriptNode();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(scriptNode0);
      scriptNode0.addChildrenToFront(expressionStatement0);
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "error reporter", scriptNode0, "error reporter", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      Label label0 = new Label(24, 140, "error reporter");
      scriptNode0.addChildrenToFront(label0);
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "language version", false);
      assertEquals(2422, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ScriptNode scriptNode0 = new ScriptNode(160);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(8);
      scriptNode0.addChildrenToFront(variableDeclaration0);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "language version", false);
      assertEquals(2424, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ScriptNode scriptNode0 = new ScriptNode(150);
      EmptyExpression emptyExpression0 = new EmptyExpression(2, 0);
      scriptNode0.addChildrenToFront(emptyExpression0);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "error reporter", false);
      assertEquals(2441, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ScriptNode scriptNode0 = new ScriptNode();
      SwitchStatement switchStatement0 = new SwitchStatement(170);
      scriptNode0.addChildrenToFront(switchStatement0);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "error reporter", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      FunctionNode functionNode0 = new FunctionNode(130);
      AstRoot astRoot0 = new AstRoot(12);
      astRoot0.addChildrenToFront(functionNode0);
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "error reporter", astRoot0, "error reporter", false);
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
      Codegen codegen0 = new Codegen();
      AstRoot astRoot0 = new AstRoot();
      ThrowStatement throwStatement0 = new ThrowStatement();
      astRoot0.addChildrenToFront(throwStatement0);
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "error reporter", astRoot0, "error reporter", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ScriptNode scriptNode0 = new ScriptNode();
      ReturnStatement returnStatement0 = new ReturnStatement();
      scriptNode0.addChildrenToFront(returnStatement0);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "error reporter", false);
      assertEquals(2457, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.setType(2);
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "language version", functionNode0, "RVEA\f.\"$ZN1]6g", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      AstRoot astRoot0 = new AstRoot();
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.addChildToBack(astRoot0);
      astRoot0.addFunction(functionNode0);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "error reporter", astRoot0, "language version", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        context0.compileString("com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.head.ast.AstRoot", (-2581), (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setGenerateDebugInfo(false);
      ScriptNode scriptNode0 = new ScriptNode(11);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "error reporter", false);
      assertEquals(2355, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ScriptNode scriptNode0 = new ScriptNode();
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(1, 13);
      scriptNode0.addRegExp(regExpLiteral0);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "error reporter", scriptNode0, "error reporter", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ScriptNode scriptNode0 = new ScriptNode(0);
      Jump jump0 = new Jump(5, 11);
      scriptNode0.addChildrenToFront(jump0);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "|*U#O|8L<^x=(F6D", scriptNode0, "error reporter", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setGenerateObserverCount(true);
      ScriptNode scriptNode0 = new ScriptNode(160);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "language version", scriptNode0, "language version", false);
      assertEquals(2516, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BodyCodegen.FinallyReturnPoint bodyCodegen_FinallyReturnPoint0 = new BodyCodegen.FinallyReturnPoint();
  }
}
