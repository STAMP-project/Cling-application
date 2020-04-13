/*

 * Tue Mar 03 19:27:21 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      // Undeclared exception!
      try { 
        NodeUtil.getCatchBlock(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isVarOrSimpleAssignLhs(node0, node0);
      assertFalse(node0.isAssign());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = node0.cloneTree();
      assertNotSame(node1, node0);
      assertEquals((-1), node1.getLineno());
      assertEquals(44, node1.getType());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.isLiteralValue(node0, true);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getFirstChild();
      doReturn(0).when(node1).getType();
      doReturn(false, false).when(node1).isFunction();
      boolean boolean1 = NodeUtil.referencesThis(node1);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(true).when(node0).isExprResult();
      // Undeclared exception!
      try { 
        NodeUtil.isExprCall(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Node node0 = Node.newNumber(0.0, (-1072), 123);
      NodeUtil.isExprCall(node0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getLoopCodeBlock(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getLastChild();
      doReturn(true).when(node0).isFunction();
      // Undeclared exception!
      try { 
        NodeUtil.referencesThis(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil$MatchNodeType", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(1731);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1731
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn((-1548)).when(node1).getType();
      boolean boolean0 = NodeUtil.containsType(node1, 0);
      assertFalse(boolean0);
      assertTrue(node0.isParamList());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NEW node, got TRUE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("*_T");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      Node node1 = new Node((-1431), node0, 33, 6158);
      assertEquals(139263, node1.getSourcePosition());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals((-1431), node1.getType());
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.evaluatesToLocalValue(node0);
      boolean boolean0 = node0.isSyntheticBlock();
      assertEquals(44, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      NodeUtil.newVarNode("in", node0);
      Node node1 = null;
      try {
        node1 = new Node(42, node0, node0, 122, 53);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first new child has existing parent
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      // Undeclared exception!
      try { 
        node1.getExistingIntProp(45);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // missing prop: 45
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(true).when(node0).isExprResult();
      // Undeclared exception!
      try { 
        NodeUtil.isPrototypePropertyDeclaration(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile(node1);
      assertTrue(node1.isVoid());
      assertNull(staticSourceFile0);
      assertEquals(0, node1.getSourcePosition());
      assertEquals(122, node1.getType());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isVarDeclaration(node0);
      assertFalse(boolean0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace("c3/&g!f2=a");
      assertEquals("c3/&g!f2=a", string0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.getImpureBooleanValue(node1);
      assertTrue(node1.isVoid());
      assertEquals(0, node1.getSourcePosition());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = Node.newString("N", (-771), (-771));
      NodeUtil.NumbericResultPredicate nodeUtil_NumbericResultPredicate0 = new NodeUtil.NumbericResultPredicate();
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 1185, nodeUtil_NumbericResultPredicate0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getCharno());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Node node0 = Node.newNumber(1351.0130280721326, (-3558), 1495);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      boolean boolean0 = NodeUtil.has(node0, nodeUtil_MatchDeclaration0, nodeUtil_BooleanResultPredicate0);
      assertEquals(39, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[4];
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      assertFalse(node0.isName());
      
      int int0 = NodeUtil.getNameReferenceCount(node0, (String) null);
      assertEquals((-1), node0.getLineno());
      assertEquals(0, int0);
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newName(codingConvention0, "{SyntheticVarsDeclar}", node0, "typeof");
      boolean boolean0 = NodeUtil.isSimpleOperator(node1);
      assertEquals(38, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, (Node) null).when(node0).getFirstChild();
      doReturn(118).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Node node0 = NodeUtil.numberNode(118, (Node) null);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(118).when(node1).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1);
      assertTrue(boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = Node.newString((-1783), "D4", 111, (-482));
      Node node1 = NodeUtil.numberNode((-2813.5501488015566), node0);
      assertEquals((-1), node1.getLineno());
      assertTrue(node1.isNumber());
      assertEquals((-1783), node0.getType());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
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
  public void test031()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.mayEffectMutableState(node1);
      assertTrue(node1.isVoid());
      assertEquals(0, node1.getSourcePosition());
      
      Node node2 = new Node(32);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node2);
      assertEquals(32, node2.getType());
      assertEquals((-1), node2.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      boolean boolean0 = NodeUtil.containsType(node0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      doReturn(true).when(node1).isName();
      NodeUtil.redeclareVarsInsideBranch(node1);
      Node node2 = new Node(127, node0, 4095, 21);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node2);
      assertEquals(127, node2.getType());
      assertEquals(16773141, node2.getSourcePosition());
      assertTrue(boolean0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      assertEquals(43, node0.getType());
      
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      Node node1 = Node.newNumber((double) 42);
      boolean boolean0 = nodeUtil_MayBeStringResultPredicate0.apply(node1);
      assertFalse(boolean0);
      assertTrue(node1.isNumber());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      assertTrue(node0.isString());
      
      Node node1 = NodeUtil.newVarNode("in", node0);
      Node node2 = node1.removeFirstChild();
      assertEquals(118, node1.getType());
      assertEquals((-1), node2.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      // Undeclared exception!
      try { 
        node1.getChildBefore(node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.getInputId(node1);
      assertEquals(0, node1.getSourcePosition());
      assertEquals(122, node1.getType());
      assertTrue(node1.isVoid());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidPropertyName("Boolean");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      String string0 = NodeUtil.getSourceName(node1);
      assertNull(string0);
      assertEquals(0, node1.getCharno());
      assertEquals(122, node1.getType());
      assertEquals(0, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Node node0 = Node.newNumber((double) 35);
      try { 
        node0.setString("2CT&dxO{i)54*3E");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NUMBER 35.0 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node0).getType();
      NodeUtil.getImpureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(107, 107, 107).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = node0.removeChildren();
      assertNull(node1);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = node0.removeFirstChild();
      assertNull(node1);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      NodeUtil.isExprAssign(node1);
      assertEquals(0, node1.getSourcePosition());
      assertTrue(node1.isVoid());
      assertEquals(122, node1.getType());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.mayEffectMutableState(node1);
      assertEquals(0, node1.getCharno());
      assertEquals(122, node1.getType());
      
      boolean boolean0 = NodeUtil.isValidSimpleName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node.SideEffectFlags node_SideEffectFlags0 = new Node.SideEffectFlags();
      // Undeclared exception!
      try { 
        node0.setSideEffectFlags(node_SideEffectFlags0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // setIsNoSideEffectsCall only supports CALL and NEW nodes, got FALSE
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = node0.isUnscopedQualifiedName();
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Node node0 = Node.newString(1420, "", 104, 1420);
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1420
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(true).when(node0).isCall();
      doReturn(false).when(node0).isNoSideEffectsCall();
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Node node0 = Node.newNumber(406.0, 16, 2074);
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("406", string0);
      assertNotNull(string0);
      assertEquals(67610, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      String string0 = NodeUtil.opToStr(63);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.redeclareVarsInsideBranch(node1);
      assertEquals(0, node1.getCharno());
      assertEquals(122, node1.getType());
      assertTrue(node1.isVoid());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(15).when(node0).getType();
      boolean boolean0 = NodeUtil.isRelationalOperation(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      NodeUtil.isForIn(node1);
      assertFalse(node1.isFor());
      assertTrue(node1.isVoid());
      assertEquals(0, node1.getCharno());
      assertEquals(0, node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getNearestFunctionName(node0);
      Node node1 = new Node(46, node0, node0, node0, node0);
      assertEquals(46, node1.getType());
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
      assertTrue(node1.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1);
      assertFalse(boolean0);
      
      NodeUtil.isEmptyBlock(node1);
      assertTrue(node1.isVoid());
      assertEquals(0, node1.getCharno());
      assertEquals(0, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getImpureBooleanValue(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      assertFalse(node0.isExprResult());
      
      boolean boolean0 = NodeUtil.isPrototypePropertyDeclaration(node0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.opToStr(35);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(30, (-1748)).when(node0).getType();
      NodeUtil.isLiteralValue(node0, true);
      SyntheticAst syntheticAst0 = new SyntheticAst("*_T");
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isFunction());
      
      NodeUtil.getNearestFunctionName(node0);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[4];
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      assertFalse(node0.isFunction());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(31);
      boolean boolean1 = NodeUtil.referencesThis(node0);
      assertEquals(44, node0.getType());
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      Node node1 = NodeUtil.newVarNode("in", node0);
      Node node2 = null;
      try {
        node2 = new Node(1590, node0, node1, node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = NodeUtil.booleanNode(false);
      Node node2 = null;
      try {
        node2 = new Node(15, node0, (Node) null, node1, 92, 16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals("true", string0);
      
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-390)).when(node0).getType();
      boolean boolean0 = NodeUtil.isRelationalOperation(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      Node node0 = new Node(32);
      Node node1 = new Node((-2062), node0, (-2323), 2);
      assertEquals((-2062), node1.getType());
      assertEquals((-1), node1.getLineno());
      
      NodeUtil.mayEffectMutableState(node0);
      assertTrue(node0.isTypeOf());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(32, node0.getType());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getLineno());
      
      int int0 = NodeUtil.getInverseOperator((-4096));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getChildCount();
      doReturn(true).when(node0).isTry();
      boolean boolean0 = NodeUtil.hasFinally(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      // Undeclared exception!
      try { 
        peepholeRemoveDeadCode0.tryFoldDo(node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Node node0 = Node.newString((-1783), "D4", 111, (-482));
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertEquals((-1783), node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(8);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      Node[] nodeArray0 = new Node[6];
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = new Node(1655, 1539, 1539);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1655
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.mayEffectMutableState(node1);
      boolean boolean0 = NodeUtil.isCallOrNew(node1);
      assertFalse(boolean0);
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isVoid());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      String string0 = node0.toString(true, false, true);
      assertEquals("TRUE", string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      try { 
        node0.getDouble();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // FALSE is not a number node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = NodeUtil.isAssociative(1539);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Node node0 = Node.newString("in");
      Node node1 = NodeUtil.newVarNode("in", node0);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean0 = nodeUtil_MayBeStringResultPredicate0.apply(node1);
      assertEquals((-1), node1.getSourcePosition());
      assertFalse(node1.isName());
      assertTrue(node1.isVar());
      assertTrue(node0.isString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1);
      assertEquals(0, node1.getSourcePosition());
      assertEquals(122, node1.getType());
      
      Node node2 = new Node(32);
      boolean boolean1 = NodeUtil.mayBeStringHelper(node2);
      assertEquals((-1), node2.getCharno());
      assertFalse(node2.isThis());
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      String string0 = NodeUtil.trimJsWhiteSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      String string0 = NodeUtil.getStringValue(node0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals("in", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = NodeUtil.opToStr(98);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(115, 30, (-790)).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals("false", string0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      NodeUtil.redeclareVarsInsideBranch(node0);
      assertFalse(node0.isName());
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertFalse(node0.isFunction());
      assertFalse(node0.isThis());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      // Undeclared exception!
      try { 
        AbstractPeepholeOptimization.validateResult(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = node0.isQualifiedName();
      assertEquals(44, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "", node0, "");
      NodeUtil.isSwitchCase(node1);
      assertEquals(0, node1.getCharno());
      assertEquals(38, node1.getType());
      assertTrue(node1.isName());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      // Undeclared exception!
      try { 
        NodeUtil.getPrototypePropertyName(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Node node0 = Node.newNumber(155.974591);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(11);
      boolean boolean1 = NodeUtil.isBooleanResult(node0);
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getCharno());
      assertEquals(39, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.mayHaveSideEffects(node0);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isTrue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isSimpleOperator(node0);
      SyntheticAst syntheticAst0 = new SyntheticAst("{");
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(16, 50, 49).when(node1).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node1, abstractCompiler0);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node2).getFirstChild();
      doReturn(node0).when(node2).getParent();
      doReturn(true).when(node2).isFunction();
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionName(node2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      node0.addSuppression("th2ef/=$Fe6Lyut~");
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean0 = nodeUtil_MayBeStringResultPredicate0.apply(node0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getSourcePosition());
      
      boolean boolean1 = NodeUtil.isSimpleOperatorType(31);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = Node.newString("", 312, (-465));
      node0.useSourceInfoIfMissingFromForTree(node0);
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      Node node1 = new Node(46, node0, node0, node0, node0);
      assertTrue(node0.isFalse());
      assertEquals(46, node1.getType());
      assertEquals((-1), node0.getCharno());
      assertFalse(node1.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      boolean boolean0 = node0.isSyntheticBlock();
      assertFalse(boolean0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = new Node(45, node0, node0, 31, 97);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node1);
      assertEquals(45, node1.getType());
      assertEquals(127073, node1.getSourcePosition());
      assertEquals(44, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.opToStr(32);
      assertNotNull(string0);
      
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = new Node(45, node0, node0, 31, 97);
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode("sBj#sz,-i[y", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-3109)).when(node0).getType();
      doReturn((String) null).when(node0).toString();
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Node node0 = Node.newString("", 312, (-465));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(45, 29, 4095, 86).when(node1).getType();
      doReturn((String) null).when(node1).toString();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodenull
         //  parent:STRING 
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      String string0 = NodeUtil.opToStr(37);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.nodeTypeMayHaveSideEffects(node1);
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isVoid());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      Node node2 = new Node(32);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node2);
      assertEquals(32, node2.getType());
      assertFalse(boolean0);
      
      NodeUtil.nodeTypeMayHaveSideEffects(node1);
      assertTrue(node1.isVoid());
      assertEquals(0, node1.getSourcePosition());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Node node0 = new Node((-1587), (-1587), (-1587));
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertFalse(node0.isGetProp());
      assertTrue(boolean0);
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals((-1587), node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Node node0 = new Node(32);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      boolean boolean1 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertEquals(32, node0.getType());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Node node0 = Node.newString("in");
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean1 = nodeUtil_MayBeStringResultPredicate0.apply(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertTrue(node0.isFalse());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Node node0 = Node.newString("in");
      NodeUtil.evaluatesToLocalValue(node0);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(40, node0.getType());
      assertFalse(boolean0);
  }
}
