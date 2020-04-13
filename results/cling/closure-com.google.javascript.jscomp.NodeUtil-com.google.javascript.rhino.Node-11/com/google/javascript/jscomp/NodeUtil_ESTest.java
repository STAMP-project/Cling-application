/*

 * Tue Mar 03 19:21:13 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.ReorderConstantExpression;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.getPureBooleanValue(node0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getCharno());
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      Node node1 = node0.cloneTree();
      assertEquals(0, node1.getType());
      assertEquals(0, node1.getSourcePosition());
      assertNotSame(node1, node0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = new Node(11);
      boolean boolean0 = NodeUtil.isNullOrUndefined(node0);
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(11, node0.getType());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
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
  public void test004()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isExprResult();
      boolean boolean0 = NodeUtil.isExprCall(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(5, 0, 14, 44).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Node node0 = Node.newString("jsdoc_info");
      NodeUtil.getLoopCodeBlock(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
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
      Node node0 = Node.newString("jsdoc_info");
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertTrue(node0.isString());
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(8);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 8
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Node node0 = new Node(11);
      try { 
        node0.setString("R");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // BITAND is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("").when(node0).getString();
      doReturn(8232).when(node0).getType();
      doReturn(false).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isConstantByConvention(codingConvention0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = new Node(16384, node0, 36, 54);
      boolean boolean0 = NodeUtil.containsType(node1, 31);
      assertEquals(147510, node1.getSourcePosition());
      assertEquals(16384, node1.getType());
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isGetProp());
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "", node0);
      assertEquals(38, node1.getType());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = Node.newString(85, "JSC_VAR_ARGS_MUST_BE_LAST", 1610612736, 1610612736);
      assertEquals(4095, node0.getSourcePosition());
      assertTrue(node0.isComma());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Node node0 = Node.newString(113, "incrdecr", 113, 113);
      Node node1 = new Node(113, node0, node0, node0, node0);
      Node node2 = null;
      try {
        node2 = new Node(113, node1, node0, node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(41).when(node0).getType();
      NodeUtil.getPureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Node node0 = new Node(48, 2, (-1));
      assertEquals(48, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = NodeUtil.opToStr(30);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-2927), 36, 42, 46).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(4095, 29).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getSourceFile(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Node node0 = Node.newNumber((double) 12, 120, 52);
      NodeUtil.isImmutableValue(node0);
      node0.getInputId();
      assertEquals(39, node0.getType());
      assertEquals(491572, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = new Node(42, 16, 42);
      assertFalse(node0.isName());
      
      NodeUtil.isVarDeclaration(node0);
      assertEquals(65578, node0.getSourcePosition());
      assertTrue(node0.isThis());
      assertEquals(16, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace("Infinity");
      assertEquals("Infinity", string0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(1654, nodeArray0);
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 32, nodeUtil_BooleanResultPredicate0);
      assertEquals(1654, node0.getType());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Node node0 = new Node(11);
      NodeUtil.getNearestFunctionName(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(11, node0.getType());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(true, true).when(node0).isFunction();
      // Undeclared exception!
      try { 
        NodeUtil.getNearestFunctionName(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(54, 52, 50, 47, 1761).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(53);
      boolean boolean1 = NodeUtil.isCallOrNew(node0);
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isTrue());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      Predicate<Node> predicate0 = PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE;
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 4, predicate0);
      assertEquals(0, int0);
      assertEquals(0, node0.getType());
      assertEquals(0, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      NodeUtil.copyNameAnnotations(node0, node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yUY1=:iL,FKte IG{m6");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertFalse(boolean0);
      assertTrue(node0.isName());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = NodeUtil.opToStr(77);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, node0);
      assertEquals(29, node1.getType());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = new Node(16384, node0, 36, 54);
      assertFalse(node1.isComma());
      assertFalse(node1.isOr());
      assertEquals(147510, node1.getSourcePosition());
      assertFalse(node1.isHook());
      assertEquals(16384, node1.getType());
      
      NodeUtil.getBestLValue(node0);
      assertFalse(node0.isAssign());
      assertFalse(node0.isHook());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(548, 19).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Node node0 = new Node(0, 0, 0);
      // Undeclared exception!
      try { 
        node0.detachFromParent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(144, 144, 64).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, (AbstractCompiler) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getLastChild();
      doReturn("empty_block").when(node0).getString();
      doReturn(16).when(node0).getType();
      doReturn(true).when(node0).isGetProp();
      // Undeclared exception!
      try { 
        NodeUtil.isConstantByConvention((CodingConvention) null, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator(2);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isGet(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = Node.newNumber((-2376.616182171));
      assertEquals(39, node0.getType());
      
      Node node1 = NodeUtil.newVarNode("|.e4Htzv0}_.-o:0k", node0);
      node0.isEquivalentToTyped(node1);
      assertEquals((-1), node1.getCharno());
      assertTrue(node1.isVar());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.ALL;
      boolean boolean0 = NodeUtil.has((Node) null, sourceMap_DetailLevel0, sourceMap_DetailLevel0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.isNullOrUndefined(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newNumber((-1978.0));
      Node node1 = NodeUtil.newName(closureCodingConvention0, "~]m_1X+;{", node0, "~]m_1X+;{");
      boolean boolean0 = nodeUtil_BooleanResultPredicate0.apply(node1);
      assertEquals(38, node1.getType());
      assertEquals((-1), node1.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Node node0 = new Node(11);
      Node node1 = new Node(16, node0, node0);
      boolean boolean0 = NodeUtil.mayBeString(node1, false);
      assertEquals(11, node0.getType());
      assertTrue(node1.hasOneChild());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node1.getLineno());
      assertEquals(16, node1.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = Node.newString("r>(");
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
  public void test051()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(false).when(node0).isScript();
      InputId inputId0 = NodeUtil.getInputId(node0);
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidSimpleName("prototype");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      node0.setWasEmptyNode(false);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = new Node(1221, 1221, 102);
      NodeUtil.getSourceName(node0);
      assertEquals(1221, node0.getType());
      assertEquals(5001318, node0.getSourcePosition());
      assertEquals(102, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = Node.newString("r>(");
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals("r>(", string0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Node node0 = Node.newString("JS`H");
      Node node1 = node0.removeFirstChild();
      assertNull(node1);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(googleCodingConvention0, "", node0);
      String string0 = NodeUtil.getArrayElementStringValue(node1);
      assertNull(string0);
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(32, (-1110), 53, 39, 100).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(17, 98, 0, 0, 0).when(node0).getType();
      doReturn(false).when(node0).isNull();
      NodeUtil.mayBeStringHelper(node0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = new Node(11);
      boolean boolean0 = NodeUtil.isValidPropertyName("[%!9ikh<hd=Gttm=]");
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean1 == boolean0);
      assertEquals(11, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Node node0 = Node.newString("JS`H");
      Node.SideEffectFlags node_SideEffectFlags0 = new Node.SideEffectFlags(32);
      // Undeclared exception!
      try { 
        node0.setSideEffectFlags(node_SideEffectFlags0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
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
  public void test063()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(52, 50, 72, 14).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn((Node) null, (Node) null).when(node0).getNext();
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      doReturn(false).when(node0).isFunction();
      doReturn(false).when(node0).isName();
      doReturn((String) null).when(node0).toString();
      Node node1 = NodeUtil.newVarNode("", node0);
      // Undeclared exception!
      try { 
        NodeUtil.redeclareVarsInsideBranch(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Node node0 = new Node(11);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isTryFinallyNode(node0, node0);
      assertTrue(boolean1 == boolean0);
      assertFalse(node0.isTry());
      assertEquals(11, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = Node.newString("jsdoc_info");
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(closureCodingConvention0, "Too many outstanding Tracers. Tracer.stop() is missing or Tracer.stop() is not wrapped in a try/finally block. Clearing to avoid memory leak.");
      assertEquals(2, node0.getChildCount());
      assertFalse(node0.hasOneChild());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(33, node0.getType());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = new Node(8239);
      NodeUtil.getImpureBooleanValue(node0);
      assertEquals(8239, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = new Node(11);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isGet(node0);
      assertEquals(11, node0.getType());
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(1654, nodeArray0);
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals(1654, node0.getType());
      assertFalse(node0.isReturn());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(816, 2141, 38, 41, 32).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(548, 30, (-1084), 1610612736, 30).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeString(node0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(46, 1048576).when(node0).getType();
      NodeUtil.isNumericResult(node0);
      Node node1 = Node.newNumber((double) 12, 120, 52);
      boolean boolean0 = NodeUtil.isImmutableValue(node1);
      assertTrue(boolean0);
      assertEquals(491572, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(118).when(node0).getChildCount();
      doReturn(object0, object0).when(node0).getProp(anyInt());
      doReturn(true, true).when(node0).isTry();
      NodeUtil.maybeAddFinally(node0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn("s9r1P~R\"G)3:", object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("s9r1P~R\"G)3:", node0);
      // Undeclared exception!
      try { 
        node1.addChildrenToBack((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "import");
      ReorderConstantExpression reorderConstantExpression0 = new ReorderConstantExpression();
      Node node1 = reorderConstantExpression0.optimizeSubtree(node0);
      assertTrue(node0.isName());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = new Node(11);
      assertFalse(node0.isFunction());
      
      boolean boolean0 = NodeUtil.isHoistedFunctionDeclaration(node0);
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(11, node0.getType());
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = Node.newString(".", 5, 5);
      Node node1 = new Node(42, node0, node0, node0);
      assertEquals(20485, node0.getSourcePosition());
      assertTrue(node0.isString());
      assertEquals(42, node1.getType());
      assertTrue(node1.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = NodeUtil.isAssociative(29);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = new Node(1221);
      Node[] nodeArray0 = new Node[0];
      Node node1 = NodeUtil.newCallNode(node0, nodeArray0);
      assertTrue(node1.isCall());
      assertEquals((-1), node1.getSourcePosition());
      
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals(1221, node0.getType());
      assertFalse(node0.isGetProp());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isFor());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Node node0 = new Node(999);
      node0.setSourceEncodedPositionForTree(1539);
      assertEquals(1539, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Node node0 = new Node(42, 16, 42);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = NodeUtil.BOOLEAN_RESULT_PREDICATE;
      boolean boolean0 = NodeUtil.containsType(node0, 0, nodeUtil_BooleanResultPredicate0);
      assertTrue(node0.isThis());
      assertFalse(boolean0);
      assertEquals(65578, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      NodeUtil.getPureBooleanValue(node0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.isSimpleOperatorType(53);
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
  public void test089()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isSimpleOperatorType(1);
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
  public void test090()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.isSimpleOperatorType(53);
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
  public void test091()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      boolean boolean0 = node0.isQualifiedName();
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode(15, node0);
      boolean boolean0 = NodeUtil.isSwitchCase(node1);
      assertFalse(boolean0);
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isNumber());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Node node0 = Node.newNumber((double) 12, 120, 52);
      NodeUtil.isImmutableValue(node0);
      node0.setSourceFileForTesting("");
      assertEquals((-2147483596), node0.getSourceOffset());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("W?Bm'LjIfp7qA X~F*)").when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      boolean boolean1 = NodeUtil.isSimpleOperatorType(8);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Node node0 = Node.newNumber((-69.57617), (-1869), 25);
      try { 
        node0.getString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NUMBER -69.57617 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "import");
      node0.addChildrenToBack(node0);
      assertEquals(1, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Node node0 = new Node(11);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertFalse(node0.isExprResult());
      
      boolean boolean1 = NodeUtil.isPrototypePropertyDeclaration(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean1 == boolean0);
      assertEquals(11, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.mayHaveSideEffects(node0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getCharno());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(53);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Node.newNumber(Double.NaN);
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) jqueryCodingConvention0, "new child has existing sibling", node0, "j=NR-");
      Node node2 = NodeUtil.newUndefinedNode(node1);
      assertTrue(node1.isName());
      assertEquals((-1), node2.getLineno());
      assertTrue(node2.isVoid());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = new Node(42, 16, 42);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:THIS 16
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = NodeUtil.opToStr(1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(120, 969, 2226, 120, 32).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention(closureCodingConvention0);
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "s9r1P~R\"G)3:");
      boolean boolean0 = NodeUtil.isNumericResultHelper(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean0);
      assertEquals(38, node0.getType());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      int int0 = NodeUtil.precedence(35);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Node node0 = new Node(11);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isConstantName(node0);
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertEquals(11, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Node node0 = new Node(879, 879, 879);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertEquals(879, node0.getType());
      assertEquals(3601263, node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = node0.useSourceInfoFrom(node0);
      assertEquals(44, node1.getType());
      assertEquals((-1), node1.getCharno());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(53);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Node[] nodeArray0 = new Node[7];
      Node node0 = Node.newNumber((double) 0, 0, 0);
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
  public void test109()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("s9r1P~R\"G)3:", node0);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node1, abstractCompiler0);
      assertEquals(118, node1.getType());
      assertEquals(0, node1.getSourcePosition());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(38);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown op 38: NAME
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(54);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 54
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Node node0 = new Node(11);
      boolean boolean0 = node0.isLocalResultCall();
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals((-1), node0.getCharno());
      assertEquals(11, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
      
      boolean boolean1 = NodeUtil.isSimpleOperatorType(53);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative((-3400));
      boolean boolean1 = NodeUtil.isSimpleOperatorType(53);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      assertFalse(node0.isRegExp());
      
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node1 = peepholeSimplifyRegExp0.optimizeSubtree(node0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node1.getCharno());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(53);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Node node0 = new Node(11);
      NodeUtil.mayHaveSideEffects(node0);
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(38);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown op 38: NAME
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }
}
