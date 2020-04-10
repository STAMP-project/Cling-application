/*

 * Tue Mar 03 19:19:23 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-1068), 2472).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0, abstractCompiler0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString("ZD_bt[PD_U~`S-qVpj", 118, 118);
      // Undeclared exception!
      try { 
        NodeUtil.removeChild(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = Node.newNumber(Double.NaN);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals((-1), node0.getCharno());
      assertEquals(39, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = Node.newString(45, "2k=E6JuxA3}l6oXGBu", (-620), 15);
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertEquals(45, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn("com.google.javascript.jscomp.CoalesceVariableNames").when(node1).getSourceFileName();
      doReturn(true).when(node1).isName();
      doReturn("!N\"@Vp10-").when(node1).toString();
      Node node2 = NodeUtil.getRootOfQualifiedName(node1);
      String string0 = NodeUtil.getSourceName(node2);
      assertEquals("com.google.javascript.jscomp.CoalesceVariableNames", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isExprCall(node0);
      assertFalse(boolean0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = Node.newString(45, "2k=E6JuxA3}l6oXGBu", (-620), 15);
      NodeUtil.getLoopCodeBlock(node0);
      assertEquals(45, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode(16, node0);
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isNumber());
      
      Node node2 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isSimpleOperator(node2);
      assertEquals((-1), node2.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(0).when(node0).getType();
      doReturn(false, false).when(node0).isFunction();
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("!N\"@Vp10-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getLastChild();
      doReturn(true).when(node0).isGetProp();
      // Undeclared exception!
      try { 
        NodeUtil.getPrototypeClassName(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = new Node(12);
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NEW node, got EQ
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0, inlineVariables_Mode0, node0, inlineVariables_Mode0).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newUndefinedNode(node1);
      assertEquals(0, node2.getCharno());
      assertTrue(node2.isVoid());
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(32, 51, 51).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("/%:VfIp", (Node) null);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(108).when(node1).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1);
      assertTrue(node0.isVar());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isName();
      doReturn(true).when(node0).isThis();
      doReturn("").when(node0).toString();
      Node node1 = NodeUtil.getRootOfQualifiedName(node0);
      assertEquals(54, Node.SLASH_V);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile((Node) null);
      assertNull(staticSourceFile0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = Node.newString(45, "2k=E6JuxA3}l6oXGBu", (-620), 15);
      boolean boolean0 = NodeUtil.isVarDeclaration(node0);
      assertEquals(45, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(node0).getString();
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isGetProp();
      doReturn(true).when(node0).isName();
      doReturn((String) null).when(node0).toString();
      Node node1 = NodeUtil.getRootOfQualifiedName(node0);
      // Undeclared exception!
      try { 
        NodeUtil.isConstantByConvention((CodingConvention) null, node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, (Node) null).when(node0).getParent();
      doReturn(0, 0).when(node0).getType();
      doReturn(false, false).when(node0).isCall();
      doReturn(false, false).when(node0).isFunction();
      doReturn(false, false).when(node0).isGetElem();
      doReturn(false, false).when(node0).isGetProp();
      doReturn(false, false).when(node0).isName();
      doReturn(false, false).when(node0).isNew();
      doReturn(false, false).when(node0).isString();
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      int int0 = NodeUtil.getCount(node0, sourceMap_DetailLevel0, sourceMap_DetailLevel0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = Node.newNumber((double) 38, 140, 2);
      NodeUtil.getNearestFunctionName(node0);
      assertEquals(573442, node0.getSourcePosition());
      assertTrue(node0.isNumber());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isFunction();
      doReturn(false).when(node0).isName();
      NodeUtil.redeclareVarsInsideBranch(node0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = Node.newString("ZD_bt[PD_U~`S-qVpj", 118, 118);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      int int0 = NodeUtil.getNameReferenceCount(node1, "ZD_bt[PD_U~`S-qVpj");
      assertEquals(483446, node1.getSourcePosition());
      assertEquals(40, node0.getType());
      assertEquals(0, int0);
      assertTrue(node1.isVoid());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      boolean boolean0 = NodeUtil.containsFunction(node1);
      assertEquals(122, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = Node.newNumber(0.0, 43, 39);
      node0.detachChildren();
      assertEquals(176167, node0.getSourcePosition());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(1523, nodeArray0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0, (Node) null).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      // Undeclared exception!
      try { 
        NodeUtil.getBestLValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = new Node(64, 64, 1763);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
      assertTrue(node0.isObjectLit());
      assertEquals(263907, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = Node.newNumber((double) 38, 140, 2);
      // Undeclared exception!
      try { 
        NodeUtil.getRootOfQualifiedName(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator((-1150));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.isSimpleOperator(node0);
      NodeUtil.setDebugInformation(node0, node0, "E=6iUx<^");
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(39, 16).when(node0).getType();
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      boolean boolean0 = NodeUtil.valueCheck(node0, nodeUtil_BooleanResultPredicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = Node.newNumber(0.0, 43, 39);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getNext();
      doReturn(true).when(node1).isName();
      doReturn("com.google.javascript.jscomp.CoalesceVariableNames").when(node1).toString();
      Node node2 = NodeUtil.getRootOfQualifiedName(node1);
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode("jz.',uw!MyvSQTA7L", node2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = new Node(63, 63, 63);
      NodeUtil.isPrototypeProperty(node0);
      assertEquals(258111, node0.getSourcePosition());
      assertTrue(node0.isArrayLit());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InputId inputId0 = NodeUtil.getInputId((Node) null);
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      node0.setWasEmptyNode(false);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = Node.newString(61, ",Xs_(bmI7'M2*");
      String string0 = NodeUtil.getSourceName(node0);
      assertEquals(61, node0.getType());
      assertNull(string0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = new Node(63, 63, 63);
      Node node1 = new Node((-814));
      node0.addChildrenToBack(node1);
      node0.cloneTree();
      assertEquals(1, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidSimpleName("$&fl%j)8-k");
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      doReturn(true).when(node0).isName();
      doReturn((String) null).when(node0).toString();
      Node node1 = NodeUtil.getRootOfQualifiedName(node0);
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node1);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isCall();
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertFalse(boolean0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(false).when(node1).isFunction();
      doReturn(false).when(node1).isName();
      NodeUtil.getVarsDeclaredInBranch(node1);
      assertFalse(node0.isFunction());
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "#D_]N");
      // Undeclared exception!
      try { 
        NodeUtil.isVarDeclaration(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("4");
      assertNotNull(double0);
      assertEquals(4.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(49, 0).when(node0).getType();
      NodeUtil.getImpureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Node node0 = NodeUtil.numberNode(0.0, (Node) null);
      assertFalse(node0.isExprResult());
      
      NodeUtil.isPrototypePropertyDeclaration(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(39, node0.getType());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Node node0 = NodeUtil.numberNode(0.0, (Node) null);
      assertNotNull(node0);
      
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Node node0 = Node.newString("ZD_bt[PD_U~`S-qVpj", 118, 118);
      // Undeclared exception!
      try { 
        node0.addChildBefore(node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The existing child node of the parent should not be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Node node0 = new Node(63, 63, 63);
      boolean boolean0 = NodeUtil.isRelationalOperation(node0);
      assertEquals(258111, node0.getSourcePosition());
      assertTrue(node0.isArrayLit());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(true).when(node0).isNew();
      doReturn(false).when(node0).isNoSideEffectsCall();
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Node node0 = new Node(12);
      boolean boolean0 = NodeUtil.isStatementBlock(node0);
      assertEquals(12, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(97).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Node node0 = new Node(63, 63, 63);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertTrue(node0.isArrayLit());
      assertEquals(258111, node0.getSourcePosition());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Node node0 = Node.newString(64, ",Xs_(bmI7'M2*");
      // Undeclared exception!
      try { 
        node0.addChildrenAfter(node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode(16, node0);
      assertFalse(node1.isString());
      
      CompilerOptions compilerOptions0 = new CompilerOptions();
      boolean boolean0 = NodeUtil.isNameReferenced(node1, "Unknown class name", compilerOptions0.sourceMapDetailLevel);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.isSimpleOperator(node1);
      assertFalse(node1.isGetElem());
      assertTrue(node1.isNumber());
      assertEquals(0, node1.getSourcePosition());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean0);
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(16);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = new Node(36, node0, node0, node0);
      assertEquals(36, node1.getType());
      assertTrue(node1.hasOneChild());
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Node node0 = Node.newNumber((double) 38, 140, 2);
      String string0 = node0.toString(false, false, false);
      assertEquals(573442, node0.getSourcePosition());
      assertEquals("NUMBER 38.0", string0);
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, (AbstractCompiler) null);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Node node0 = Node.newString(",!9g-l$yo5E&h!p", 41, 2962);
      try { 
        node0.getDouble();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // STRING ,!9g-l$yo5E&h!p 41 is not a number node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertFalse(boolean0);
      assertFalse(node0.isFor());
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Node node0 = Node.newNumber((double) 38, 140, 2);
      node0.addChildToFront(node0);
      // Undeclared exception!
      try { 
        node0.setSourceEncodedPositionForTree(116);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Node node0 = Node.newNumber((double) 38, 140, 2);
      node0.setSourceEncodedPositionForTree(116);
      assertEquals(116, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isSimpleOperator(node0);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = NodeUtil.BOOLEAN_RESULT_PREDICATE;
      // Undeclared exception!
      try { 
        NodeUtil.visitPostOrder(node0, (NodeUtil.Visitor) null, nodeUtil_BooleanResultPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      String string0 = NodeUtil.arrayToString(node1);
      assertNotNull(string0);
      assertEquals("false", string0);
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isSimpleOperator(node0);
      NodeUtil.setDebugInformation(node0, node0, "E=6iUx<^");
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Node node0 = Node.newString(61, ",Xs_(bmI7'M2*");
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
      
      NodeUtil.getVarsDeclaredInBranch(node0);
      assertEquals(61, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isFunction());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("/%:VfIp", (Node) null);
      NodeUtil.mayEffectMutableState(node0);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertTrue(node0.isVar());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Node node0 = NodeUtil.newUndefinedNode((Node) null);
      node0.addChildrenAfter(node0, (Node) null);
      assertFalse(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(10, 1024, 12).when(node0).getType();
      doReturn(true).when(node0).isName();
      doReturn("tj&!B#vJdzE3 Kw3JY^").when(node0).toString();
      Node node1 = NodeUtil.getRootOfQualifiedName(node0);
      boolean boolean0 = NodeUtil.isGetOrSetKey(node1);
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node1);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode(16, node0);
      boolean boolean0 = NodeUtil.isSwitchCase(node1);
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Node node0 = new Node(63, 63, 63);
      Node node1 = NodeUtil.booleanNode(true);
      NodeUtil.isSimpleOperator(node1);
      // Undeclared exception!
      try { 
        NodeUtil.isConstantByConvention((CodingConvention) null, node1, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // TRUE is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(21, 51, 51).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      SyntheticAst syntheticAst0 = new SyntheticAst("KIGfX");
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Node node0 = Node.newString(130, "%", 130, 145);
      try { 
        node0.setDouble(808.9164139865);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // EXPR_RESULT % 130 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Node node0 = Node.newString("^:sLRNef<e,R&S");
      node0.addSuppression("^:sLRNef<e,R&S");
      assertEquals((-1), node0.getCharno());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Node node0 = new Node(12);
      node0.setLineno((-192));
      assertEquals(12, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Node node0 = Node.newString((-1771), "N");
      NodeUtil.mayEffectMutableState(node0);
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      // Undeclared exception!
      try { 
        peepholeRemoveDeadCode0.tryFoldDo(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("");
      assertNotNull(double0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(35);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown op 35: GETELEM
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(node0.isName());
      
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = NodeUtil.BOOLEAN_RESULT_PREDICATE;
      boolean boolean1 = NodeUtil.isNameReferenced(node0, "E=6iUx<^", nodeUtil_BooleanResultPredicate0);
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getCharno());
      assertEquals(44, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      int int0 = NodeUtil.precedence(32);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = node0;
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node0, nodeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Node node0 = Node.newNumber((double) 38, 140, 2);
      Node node1 = NodeUtil.newVarNode("A*=h", node0);
      assertEquals(573442, node1.getSourcePosition());
      assertTrue(node1.isVar());
      assertFalse(node0.isName());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Node node0 = new Node(63, 63, 63);
      NodeUtil.isSimpleOperator(node0);
      // Undeclared exception!
      try { 
        NodeUtil.isConstantByConvention((CodingConvention) null, node0, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // ARRAYLIT 63 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(1046);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1046
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(21, 51, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
      
      Node node1 = NodeUtil.booleanNode(true);
      NodeUtil.copyNameAnnotations(node1, node1);
      assertTrue(node1.isTrue());
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(44, node1.getType());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isGetProp();
      Node node2 = NodeUtil.getPrototypeClassName(node1);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(95, 95, 95).when(node0).getType();
      // Undeclared exception!
      try { 
        NodeUtil.mayEffectMutableState(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("com.google.javascript.jscomp.CoalesceVariableNames");
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      doReturn(true).when(node0).isName();
      doReturn((String) null).when(node0).toString();
      Node node1 = NodeUtil.getRootOfQualifiedName(node0);
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(53, nodeArray0);
      assertFalse(node0.isRegExp());
      
      peepholeSimplifyRegExp0.optimizeSubtree(node0);
      assertEquals(53, node0.getType());
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(21, 51, 51).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      boolean boolean1 = NodeUtil.isAssociative(53);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("!N\"@Vp10-");
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }
}
