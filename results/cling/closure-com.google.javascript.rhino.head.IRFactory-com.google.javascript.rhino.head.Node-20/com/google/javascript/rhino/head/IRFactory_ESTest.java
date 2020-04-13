/*

 * Tue Mar 03 19:50:47 GMT 2020
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
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.GeneratorExpression;
import com.google.javascript.rhino.head.ast.GeneratorExpressionLoop;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.WithStatement;
import com.google.javascript.rhino.head.ast.XmlMemberGet;
import com.google.javascript.rhino.head.ast.Yield;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      // Undeclared exception!
      try { 
        functionNode0.getExistingIntProp(730);
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
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ScriptNode scriptNode0 = new ScriptNode(324);
      iRFactory0.checkMutableReference(scriptNode0);
      assertEquals((-1), scriptNode0.getLineno());
      assertEquals((-1), scriptNode0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(65536);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(astRoot0).getType();
      doReturn("M%8+mANMU]]%J").when(astRoot0).toString();
      doReturn(true).when(astRoot0).isInStrictMode();
      iRFactory0.isDestructuring(name0);
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: M%8+mANMU]]%J
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      iRFactory0.transform(variableDeclaration0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.setJsDocNode((Comment) null);
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      GeneratorExpression generatorExpression0 = new GeneratorExpression(120, 65536);
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(generatorExpression0, name0, 15);
      PropertyGet propertyGet1 = new PropertyGet(propertyGet0, name0, 7);
      // Undeclared exception!
      try { 
        iRFactory0.decompilePropertyGet(propertyGet1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: GENEXPR
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      assertEquals(66, objectLiteral0.getType());
      
      iRFactory0.decompile(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(180);
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(9).when(astRoot0).getType();
      doReturn("language version").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: language version
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      iRFactory0.isDestructuring((Node) null);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(19).when(astRoot0).getType();
      doReturn("]Kqz").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: ]Kqz
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(65536);
      iRFactory0.isDestructuring(parenthesizedExpression0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(astRoot0).getType();
      doReturn(true).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.AstRoot$MockitoMock$1351772692 cannot be cast to com.google.javascript.rhino.head.ast.ReturnStatement
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression(120, 65536);
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(generatorExpression0, name0, 15);
      WithStatement withStatement0 = new WithStatement(1, 2);
      name0.addChildrenToFront(withStatement0);
      name0.addChildrenToFront(propertyGet0);
      assertTrue(name0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
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
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      Name name0 = new Name(65536);
      SwitchCase switchCase0 = new SwitchCase(5, 0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(astRoot0).getType();
      doReturn("M%8+mANMU]]%J").when(astRoot0).toString();
      doReturn(true).when(astRoot0).isInStrictMode();
      name0.addChildrenToBack(switchCase0);
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: M%8+mANMU]]%J
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      iRFactory0.transform(variableDeclaration0);
      SwitchStatement switchStatement0 = new SwitchStatement(1);
      switchStatement0.getJsDocNode();
      assertEquals(114, switchStatement0.getType());
      assertEquals((-1), switchStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(17);
      boolean boolean0 = xmlMemberGet0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), xmlMemberGet0.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name();
      Name name1 = new Name(1, "9?0K>vbp*C14BKhzGa<");
      FunctionNode functionNode0 = new FunctionNode(19, name0);
      iRFactory0.transform(name1);
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
  public void test15()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      iRFactory0.transform(variableDeclaration0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      boolean boolean0 = iRFactory0.isDestructuring(arrayLiteral0);
      assertEquals((-1), arrayLiteral0.getLineno());
      assertEquals(65, arrayLiteral0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536, 2549);
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      FunctionNode functionNode0 = new FunctionNode((-1087));
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
  public void test17()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name();
      WithStatement withStatement0 = new WithStatement(1, 2);
      name0.addChildrenToFront(withStatement0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(name0);
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
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(65536, 19);
      Node node0 = iRFactory0.transform(objectLiteral0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      // Undeclared exception!
      try { 
        arrayLiteral0.replaceChild(node0, node0);
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
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Yield yield0 = new Yield(13);
      assertEquals(72, yield0.getType());
      
      Node node0 = iRFactory0.transform(yield0);
      assertEquals(72, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop();
      Yield yield0 = new Yield(1, 65536, generatorExpressionLoop0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(yield0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals(66, node0.getType());
      
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      Name name0 = new Name((-367), 1, "3<,%{qcn0%");
      PropertyGet propertyGet0 = new PropertyGet(10, 2, arrayLiteral0, name0);
      iRFactory0.decompilePropertyGet(propertyGet0);
      assertEquals((-1), propertyGet0.getLineno());
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      SwitchCase switchCase0 = new SwitchCase(5, 0);
      switchCase0.putProp(135, iRFactory0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(astRoot0).getType();
      doReturn("M%8+mANMU]]%J").when(astRoot0).toString();
      doReturn(true).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: M%8+mANMU]]%J
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ScriptNode scriptNode0 = new ScriptNode(65536);
      boolean boolean0 = iRFactory0.isDestructuring(scriptNode0);
      assertEquals(136, scriptNode0.getType());
      assertFalse(boolean0);
      
      ScriptNode scriptNode1 = (ScriptNode)iRFactory0.transform(scriptNode0);
      assertNotNull(scriptNode1);
      assertEquals((-1), scriptNode1.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = iRFactory0.parse("A-nTmqx1", "", 2);
      assertEquals(136, astRoot0.getType());
      
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0, defaultErrorReporter0);
      Node node0 = iRFactory1.transform(astRoot0);
      assertTrue(node0.hasChildren());
  }
}
