/*

 * Tue Mar 03 19:50:04 GMT 2020
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
import com.google.javascript.rhino.head.ast.ArrayComprehensionLoop;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchStatement;
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
      IRFactory iRFactory0 = new IRFactory();
      StringLiteral stringLiteral0 = new StringLiteral((-3136));
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
      IRFactory iRFactory0 = new IRFactory();
      ElementGet elementGet0 = new ElementGet();
      iRFactory0.checkMutableReference(elementGet0);
      assertEquals((-1), elementGet0.getLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement();
      FunctionCall functionCall0 = new FunctionCall(170, 36);
      functionCall0.setJsDocNode((Comment) null);
      IRFactory iRFactory0 = new IRFactory();
      Node node0 = iRFactory0.transform(breakStatement0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Yield yield0 = new Yield();
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(2792, 3646, yield0, name0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(propertyGet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: YIELD
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536);
      iRFactory0.decompile(numberLiteral0);
      assertEquals((-1), numberLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-108));
      assertEquals(66, objectLiteral0.getType());
      
      IRFactory iRFactory0 = new IRFactory();
      iRFactory0.decompile(objectLiteral0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      // Undeclared exception!
      try { 
        iRFactory0.parse("hi]&b<q7gT'V;5J*D", "", (-1197));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-108));
      ElementGet elementGet0 = new ElementGet(12, 24);
      elementGet0.addChildAfter(objectLiteral0, objectLiteral0);
      Name name0 = new Name(2);
      PropertyGet propertyGet0 = new PropertyGet(26, 538, elementGet0, name0);
      // Undeclared exception!
      try { 
        propertyGet0.addChildBefore(objectLiteral0, objectLiteral0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // newChild had siblings in addChildBefore
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
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
  public void test09()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      XmlElemRef xmlElemRef0 = new XmlElemRef(127);
      xmlElemRef0.getNamespace();
      NativeArray nativeArray0 = new NativeArray(4096L);
      xmlElemRef0.setType(2);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(xmlElemRef0, (AstNode) null).when(functionNode0).getMemberExprNode();
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
  public void test10()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement();
      SwitchStatement switchStatement0 = new SwitchStatement(1);
      switchStatement0.getJsDocNode();
      assertEquals(114, switchStatement0.getType());
      
      IRFactory iRFactory0 = new IRFactory();
      Node node0 = iRFactory0.transform(breakStatement0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      Name name0 = new Name(65536, 65536);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      Object[] objectArray0 = new Object[18];
      iRFactory0.isDestructuring(arrayComprehensionLoop0);
      objectArray0[0] = (Object) name0;
      objectArray0[1] = (Object) arrayComprehensionLoop0;
      objectArray0[2] = (Object) name0;
      objectArray0[3] = (Object) compilerEnvirons0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(functionNode0).getFunctionName();
      doReturn("").when(functionNode0).getName();
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
  public void test12()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ElementGet elementGet0 = new ElementGet();
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(elementGet0, name0);
      // Undeclared exception!
      try { 
        iRFactory0.decompilePropertyGet(propertyGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      Node node0 = iRFactory0.transform(arrayLiteral0);
      assertEquals("65", node0.toString());
      
      iRFactory0.isDestructuring(arrayLiteral0);
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      assertEquals((-1), node0.getLineno());
      assertEquals(66, node0.getType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      StringReader stringReader0 = new StringReader("bold");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "bold", 1003);
      // Undeclared exception!
      try { 
        astRoot0.setString("msg.no.paren.arg");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.AstRoot cannot be cast to com.google.javascript.rhino.head.ast.Name
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      node0.putProp(2213, objectLiteral0);
      assertEquals("66", node0.toString());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(22, (-1765));
      iRFactory0.transform(objectLiteral0);
      NumberLiteral numberLiteral0 = new NumberLiteral((-1007));
      // Undeclared exception!
      try { 
        numberLiteral0.labelId();
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
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      assertEquals(65, arrayLiteral0.getType());
      
      Node node0 = iRFactory0.transform(arrayLiteral0);
      assertEquals("65", node0.toString());
      
      iRFactory0.decompile(arrayLiteral0);
      assertEquals((-1), arrayLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(22, (-1765));
      iRFactory0.transform(objectLiteral0);
      FunctionNode functionNode0 = new FunctionNode();
      // Undeclared exception!
      try { 
        functionNode0.getExistingIntProp(4295);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(116);
      iRFactory0.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      PropertyGet propertyGet0 = new PropertyGet((-1254));
      iRFactory0.isDestructuring(propertyGet0);
      // Undeclared exception!
      try { 
        iRFactory0.transform(propertyGet0);
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
      IRFactory iRFactory1 = new IRFactory();
      StringReader stringReader0 = new StringReader("bold");
      AstRoot astRoot0 = iRFactory0.parse((Reader) stringReader0, "bold", 1003);
      ScriptNode scriptNode0 = iRFactory1.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        scriptNode0.setString("msg.no.paren.arg");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.AstRoot cannot be cast to com.google.javascript.rhino.head.ast.Name
         //
         verifyException("com.google.javascript.rhino.head.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ForLoop forLoop0 = new ForLoop((-124));
      List<AstNode> list0 = forLoop0.getStatements();
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn((Name) null).when(functionNode0).getMemberExprNode();
      doReturn(list0).when(functionNode0).getParams();
      doReturn(true).when(functionNode0).isExpressionClosure();
      iRFactory0.decompileFunctionHeader(functionNode0);
      FunctionCall functionCall0 = new FunctionCall();
      // Undeclared exception!
      try { 
        iRFactory0.transform(functionCall0);
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
      BreakStatement breakStatement0 = new BreakStatement(125, 148);
      breakStatement0.getBreakLabel();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) iRFactory0;
      objectArray0[1] = (Object) null;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(breakStatement0, (AstNode) null).when(functionNode0).getMemberExprNode();
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory((CompilerEnvirons) null, errorReporter0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      assertEquals(66, objectLiteral0.getType());
      
      Node node0 = iRFactory0.transform(objectLiteral0);
      node0.addChildrenToFront(objectLiteral0);
      assertTrue(node0.hasChildren());
  }
}
