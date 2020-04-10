/*

 * Tue Mar 03 19:43:29 GMT 2020
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
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyStatement;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.XmlElemRef;
import com.google.javascript.rhino.head.ast.Yield;
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
      doReturn(true).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceEnd());
      assertEquals("UV\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      CompilerEnvirons compilerEnvirons1 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, defaultErrorReporter0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory1.transformTree(astRoot0);
      FunctionNode functionNode0 = new FunctionNode();
      Node node0 = iRFactory0.decompileFunctionHeader(functionNode0);
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(astRoot0).getType();
      doReturn("").when(astRoot0).toString();
      doReturn(false).when(astRoot0).isInStrictMode();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(139);
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
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
  public void test04()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(1);
      iRFactory0.decompile(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot(119);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals("ST\u0088", astRoot0.getEncodedSource());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(errorReporter0).when(compilerEnvirons1).getErrorReporter();
      doReturn(false).when(compilerEnvirons1).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons1);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral((-76));
      iRFactory0.decompile(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot(1984);
      iRFactory0.transformTree(astRoot0);
      assertEquals(2, astRoot0.getEncodedSourceStart());
      assertEquals(3, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(1);
      iRFactory0.isDestructuring(arrayLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot(457);
      ScriptNode scriptNode0 = iRFactory0.transformTree(astRoot0);
      iRFactory0.isDestructuring(scriptNode0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536, 220);
      iRFactory0.isDestructuring(numberLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(true).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      Name name0 = new Name(20, "error reporter");
      FunctionNode functionNode0 = new FunctionNode(1, name0);
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
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      iRFactory0.decompileObjectLiteral(objectLiteral0);
      ReturnStatement returnStatement0 = new ReturnStatement(1);
      Yield yield0 = new Yield(150, (-61), returnStatement0);
      Node node0 = iRFactory0.transform(yield0);
      assertEquals("72", node0.toString());
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      FunctionCall functionCall0 = new FunctionCall(67108864, 162);
      List<AstNode> list0 = functionCall0.getArguments();
      ArrayLiteral arrayLiteral0 = mock(ArrayLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(arrayLiteral0).getElements();
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
      AstRoot astRoot0 = mock(AstRoot.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(astRoot0).getType();
      doReturn("Dy*O|C#").when(astRoot0).toString();
      doReturn(true).when(astRoot0).isInStrictMode();
      // Undeclared exception!
      try { 
        iRFactory0.transformTree(astRoot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't transform: Dy*O|C#
         //
         verifyException("com.google.javascript.rhino.head.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, (ErrorReporter) null);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536, 243);
      iRFactory0.transform(numberLiteral0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      Name name0 = new Name(149, 21, "@8r#W1F*LDFKj'");
      PropertyGet propertyGet0 = new PropertyGet(objectLiteral0, name0);
      iRFactory0.decompilePropertyGet(propertyGet0);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(astRoot0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: unexpected token: SCRIPT
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = new AstRoot((-1303));
      iRFactory0.transformTree(astRoot0);
      FunctionNode functionNode0 = new FunctionNode(1, (Name) null);
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
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Block block0 = new Block(65536);
      iRFactory0.transform(block0);
      NativeArray nativeArray0 = new NativeArray(18);
      ArrayLiteral arrayLiteral0 = mock(ArrayLiteral.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(arrayLiteral0).getElements();
      // Undeclared exception!
      try { 
        iRFactory0.decompileArrayLiteral(arrayLiteral0);
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
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = (NumberLiteral)iRFactory0.createNumber((-1807.4311314));
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(267, 1);
      iRFactory0.isDestructuring(arrayLiteral0);
      NumberLiteral numberLiteral1 = (NumberLiteral)iRFactory0.transform(numberLiteral0);
      assertEquals(26, Node.LAST_PROP);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      ReturnStatement returnStatement0 = new ReturnStatement(1);
      Yield yield0 = new Yield(150, (-61), returnStatement0);
      FunctionNode functionNode0 = new FunctionNode();
      iRFactory0.decompileFunctionHeader(functionNode0);
      Node node0 = iRFactory0.transform(yield0);
      assertEquals("72", node0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      ElementGet elementGet0 = mock(ElementGet.class, new ViolatedAssumptionAnswer());
      doReturn(43, 834).when(elementGet0).getType();
      NumberLiteral numberLiteral0 = new NumberLiteral(617, (-739));
      iRFactory0.transform(numberLiteral0);
      // Undeclared exception!
      try { 
        iRFactory0.decompile(elementGet0);
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
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(true).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536, 220);
      iRFactory0.decompile(numberLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(3, astRoot0.getEncodedSourceStart());
      assertEquals(4, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isGeneratingSource();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536, 220);
      iRFactory0.decompile(numberLiteral0);
      AstRoot astRoot0 = new AstRoot();
      iRFactory0.transformTree(astRoot0);
      assertEquals(4, astRoot0.getEncodedSourceEnd());
      assertEquals(3, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(true, true, false).when(compilerEnvirons0).isStrictMode();
      doReturn(true, false).when(compilerEnvirons0).isXmlAvailable();
      doReturn(false).when(compilerEnvirons0).reportWarningAsError();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(compilerEnvirons1).isGeneratingSource();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, defaultErrorReporter0);
      AstRoot astRoot0 = iRFactory0.parse("qo2jT*l", "qo2jT*l", 131);
      iRFactory1.transformTree(astRoot0);
      assertEquals(0, astRoot0.getEncodedSourceStart());
      assertEquals(14, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isStrictMode();
      doReturn(false, false).when(compilerEnvirons0).isXmlAvailable();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      CompilerEnvirons compilerEnvirons1 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(compilerEnvirons1).isGeneratingSource();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons1, errorReporter0);
      AstRoot astRoot0 = iRFactory0.parse("qo2jT*l", "qo2jT*l", 131);
      iRFactory1.transformTree(astRoot0);
      assertEquals(14, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory1 = new IRFactory(compilerEnvirons0);
      XmlElemRef xmlElemRef0 = new XmlElemRef();
      xmlElemRef0.getNamespace();
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) xmlElemRef0;
      objectArray0[2] = (Object) defaultErrorReporter0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      FunctionNode functionNode0 = mock(FunctionNode.class, new ViolatedAssumptionAnswer());
      doReturn((Name) null).when(functionNode0).getFunctionName();
      doReturn(xmlElemRef0, (AstNode) null).when(functionNode0).getMemberExprNode();
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
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      Block block0 = new Block(65536);
      iRFactory0.transform(block0);
      EmptyStatement emptyStatement0 = new EmptyStatement(110, 134);
      iRFactory0.decompile(emptyStatement0);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn((ErrorReporter) null).when(compilerEnvirons0).getErrorReporter();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(65536, 243);
      iRFactory0.decompile(numberLiteral0);
      ReturnStatement returnStatement0 = new ReturnStatement(1);
      Yield yield0 = new Yield(150, (-61), returnStatement0);
      Node node0 = iRFactory0.transform(yield0);
      assertEquals("72", node0.toString());
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      NumberLiteral numberLiteral0 = (NumberLiteral)iRFactory0.createNumber((-1807.4311314));
      Name name0 = new Name(6, 1, "{.I");
      PropertyGet propertyGet0 = new PropertyGet(24, 45, numberLiteral0, name0);
      iRFactory0.transform(propertyGet0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      iRFactory0.decompileArrayLiteral(arrayLiteral0);
  }
}
