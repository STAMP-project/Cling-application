/*

 * Tue Mar 03 19:22:07 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.LinkedList;
import java.util.List;
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
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0, abstractCompiler0);
      assertEquals(83, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = Node.newString("9;pi sK*{u'W");
      boolean boolean0 = NodeUtil.isVarOrSimpleAssignLhs(node0, node0);
      assertFalse(boolean0);
      assertFalse(node0.isAssign());
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Node node0 = Node.newNumber((-2.147483648E9), 85, 85);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertEquals(348245, node0.getSourcePosition());
      assertTrue(node0.isNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(110);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for SWITCH (type 110)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = Node.newString(".iJc6a4S-", 45, (-2676));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(".iJc6a4S-").when(node1).getSourceFileName();
      NodeUtil.getSourceName(node1);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
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
  public void test007()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(49).when(node0).getType();
      Node node1 = NodeUtil.getLoopCodeBlock(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(22).when(node0).getType();
      boolean boolean0 = NodeUtil.isBooleanResultHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 2
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("\"fhZ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[2];
      Node node0 = NodeUtil.booleanNode(false);
      JSType jSType0 = jSTypeRegistry0.createNamedType("3Z6!Xh6", ".", 49, 4075);
      jSTypeArray0[1] = jSType0;
      Node node1 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      assertEquals(2, node1.getChildCount());
      assertTrue(node1.isParamList());
      
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Node node0 = NodeUtil.newUndefinedNode((Node) null);
      boolean boolean0 = NodeUtil.containsFunction(node0);
      assertTrue(node0.isVoid());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = Node.newString(2070, "+V96j.6dm~;DKv");
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0, (AbstractCompiler) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 2070
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      NodeUtil.redeclareVarsInsideBranch(node0);
      assertEquals(83, node0.getType());
      assertTrue(node0.isParamList());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(52, 1298, 52, (-2119), 32).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeString(node0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(true).when(node0).isExprResult();
      // Undeclared exception!
      try { 
        NodeUtil.isExprAssign(node0);
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
      Node node0 = Node.newString(30, "Z", 30, 2763);
      Node node1 = new Node(40, node0, node0, node0, node0);
      assertFalse(node1.hasMoreThanOneChild());
      
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1, abstractCompiler0);
      assertEquals(125643, node0.getSourcePosition());
      assertEquals(40, node1.getType());
      assertTrue(node0.isNew());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      NodeUtil.isImmutableValue(node0);
      NodeUtil.isForIn(node0);
      assertEquals(83, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Node node0 = new Node(32);
      NodeUtil.mayHaveSideEffects(node0);
      // Undeclared exception!
      try { 
        NodeUtil.isLValue(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn((StaticSourceFile) null).when(node0).getStaticSourceFile();
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile(node0);
      assertNull(staticSourceFile0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isName();
      boolean boolean0 = NodeUtil.isVarDeclaration(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = NodeUtil.opToStr(51);
      assertEquals("in", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Node node0 = new Node(64, 120, 64);
      NodeUtil.NumbericResultPredicate nodeUtil_NumbericResultPredicate0 = new NodeUtil.NumbericResultPredicate();
      boolean boolean0 = NodeUtil.isNameReferenced(node0, ".com.google.javascript.jscomp.ProcessCommonJSModules", nodeUtil_NumbericResultPredicate0);
      assertFalse(boolean0);
      assertEquals(491584, node0.getSourcePosition());
      assertTrue(node0.isObjectLit());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Node node0 = Node.newString(2101, "+V96j.6dm~;DKv");
      boolean boolean0 = NodeUtil.isCallOrNew(node0);
      assertEquals(2101, node0.getType());
      
      boolean boolean1 = NodeUtil.isSimpleOperatorType(1);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = new Node(3, 88, (-357));
      assertFalse(node0.isName());
      
      int int0 = NodeUtil.getNameReferenceCount(node0, "CNEDncXjgnu7/#U~");
      assertEquals(0, int0);
      assertEquals((-1), node0.getLineno());
      assertEquals(3, node0.getType());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = Node.newString(37, ":{-mF0{_Xy0b", 50, 111);
      Node node1 = NodeUtil.newName(codingConvention0, ":{-mF0{_Xy0b", node0, "<Ur9Gwy-77)z1qxs~'}");
      boolean boolean0 = NodeUtil.isSimpleOperator(node1);
      assertEquals(37, node0.getType());
      assertEquals(38, node1.getType());
      assertEquals(204911, node1.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isLiteralValue(node0, true);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = Node.newString("9;pi sK*{u'W");
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
  public void test030()  throws Throwable  {
      Node node0 = Node.newString(2070, "+V96j.6dm~;DKv");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = node0.isOnlyModifiesThisCall();
      assertEquals(2070, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isExprResult();
      boolean boolean0 = NodeUtil.isExprCall(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(37).when(node1).getType();
      boolean boolean1 = NodeUtil.isImmutableValue(node1);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Node node0 = Node.newString(37, ":{-mF0{_Xy0b", 50, 111);
      boolean boolean0 = NodeUtil.containsCall(node0);
      assertEquals(204911, node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Node node0 = NodeUtil.numberNode((-5990.4), (Node) null);
      assertNotNull(node0);
      
      NodeUtil.isImmutableValue(node0);
      boolean boolean0 = NodeUtil.mayBeString(node0, true);
      assertFalse(boolean0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-294)).when(node0).getSideEffectFlags();
      doReturn(true).when(node0).isCall();
      boolean boolean0 = NodeUtil.callHasLocalResult(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getSideEffectFlags();
      doReturn(true).when(node0).isCall();
      boolean boolean0 = NodeUtil.callHasLocalResult(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(126);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for LABEL (type 126)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = Node.newNumber((double) 42, 1965, 1965);
      NodeUtil.getInputId(node0);
      assertFalse(node0.isScript());
      assertEquals(39, node0.getType());
      assertEquals(8050605, node0.getSourcePosition());
      assertEquals(1965, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Node node0 = new Node(64, 120, 64);
      NodeUtil.getSourceName(node0);
      assertEquals(491584, node0.getSourcePosition());
      assertTrue(node0.isObjectLit());
      assertEquals(64, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:NUMBER 0.0
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      NodeUtil.getPureBooleanValue(node0);
      assertTrue(node0.isParamList());
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Node node0 = Node.newString("9;pi sK*{u'W");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      String string0 = NodeUtil.arrayToString(node1);
      assertEquals("9;pi sK*{u'W", string0);
      assertEquals((-1), node0.getSourcePosition());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      Node node1 = node0.removeFirstChild();
      assertNull(node1);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = Node.newNumber((-2.147483648E9), 85, 85);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = NodeUtil.BOOLEAN_RESULT_PREDICATE;
      boolean boolean0 = NodeUtil.valueCheck(node0, nodeUtil_BooleanResultPredicate0);
      assertEquals(348245, node0.getSourcePosition());
      assertTrue(node0.isNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidPropertyName("u^|gl(Q=r3\"Cao]%N");
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = Node.newString("9;pi sK*{u'W");
      // Undeclared exception!
      try { 
        node0.setSideEffectFlags(1322);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 1240, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
      
      Node node1 = NodeUtil.booleanNode(false);
      NodeUtil.getVarsDeclaredInBranch(node1);
      assertEquals(43, node1.getType());
      assertEquals((-1), node1.getLineno());
      assertFalse(node1.isName());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("Z$>5~)");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected CALL node, got SCRIPT
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(37).when(node0).getType();
      doReturn(true).when(node0).isCall();
      doReturn(false).when(node0).isNoSideEffectsCall();
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
  public void test049()  throws Throwable  {
      Node node0 = Node.newNumber((double) 54, 4095, 39);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals(16773159, node0.getSourcePosition());
      assertEquals("54", string0);
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, ":{-mF0{_Xy0b");
      // Undeclared exception!
      try { 
        node0.replaceChildAfter(node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // prev is not a child of this node.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Node node0 = Node.newString(2070, "+V96j.6dm~;DKv");
      NodeUtil.mayHaveSideEffects(node0);
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
  public void test052()  throws Throwable  {
      Node node0 = Node.newString(2101, "+V96j.6dm~;DKv");
      Node node1 = new Node(4, node0, node0, node0, node0);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Node node0 = Node.newString("vR-^7~Z9l!b8&k2z");
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      int int0 = NodeUtil.getCount(node0, nodeUtil_BooleanResultPredicate0, nodeUtil_BooleanResultPredicate0);
      assertEquals(0, int0);
      assertEquals((-1), node0.getLineno());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 1240, 1240).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      Node node1 = NodeUtil.booleanNode(false);
      boolean boolean1 = NodeUtil.isForIn(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(node1.isFor());
      assertEquals(43, node1.getType());
      assertEquals((-1), node1.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2260, 120, 2260).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "prev is not a child of this node.");
      assertEquals(2, node0.getChildCount());
      assertFalse(node0.isString());
      assertEquals((-1), node0.getLineno());
      assertEquals(33, node0.getType());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(25, (-1963)).when(node0).getType();
      NodeUtil.isLiteralValue(node0, true);
      SyntheticAst syntheticAst0 = new SyntheticAst("instanceof");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = Node.newString(37, ":{-mF0{_Xy0b", 50, 111);
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertEquals(204911, node0.getSourcePosition());
      assertEquals(37, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 1240, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      Node node1 = NodeUtil.booleanNode(false);
      assertFalse(node1.isFunction());
      
      boolean boolean1 = NodeUtil.referencesThis(node1);
      assertFalse(boolean1 == boolean0);
      assertEquals(43, node1.getType());
      assertEquals((-1), node1.getCharno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = Node.newString("Z");
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isNull());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      // Undeclared exception!
      try { 
        node0.removeChild(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      NodeUtil.isImmutableValue(node0);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertTrue(boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-646)).when(node0).getChildCount();
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      doReturn(true, true).when(node0).isTry();
      NodeUtil.maybeAddFinally(node0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(1692);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = new Node(3, 88, (-357));
      Node node1 = new Node(88, node0, node0, node0);
      assertFalse(node1.isName());
      
      int int0 = NodeUtil.getNameReferenceCount(node1, "CNEDncXjgnu7/#U~");
      assertEquals(3, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertEquals(88, node1.getType());
      assertFalse(node1.hasMoreThanOneChild());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      boolean boolean0 = NodeUtil.isGet(node0);
      boolean boolean1 = NodeUtil.isImmutableValue(node0);
      assertTrue(node0.isParamList());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = Node.newString("Z");
      assertFalse(node0.isCall());
      
      boolean boolean0 = NodeUtil.isSimpleFunctionObjectCall(node0);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 200, 1240).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
      
      Node node1 = NodeUtil.booleanNode(false);
      boolean boolean1 = NodeUtil.mayEffectMutableState(node1, (AbstractCompiler) null);
      assertEquals((-1), node1.getLineno());
      assertTrue(node1.isFalse());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      node0.setSourceEncodedPositionForTree(118);
      assertEquals(0, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Node node0 = NodeUtil.newUndefinedNode((Node) null);
      assertNotNull(node0);
      
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertFalse(node0.isNull());
      assertEquals("", string0);
      assertEquals((-1), node0.getCharno());
      assertEquals(122, node0.getType());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isGet(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(25, (-1963)).when(node1).getType();
      boolean boolean1 = NodeUtil.isLiteralValue(node1, true);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 1240, 1240).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = Node.newString(2471, ")@4M9`vJ<g9o\"}Nw[", (-4276), 29);
      assertEquals((-1), node1.getLineno());
      assertEquals(2471, node1.getType());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals("false", string0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Node node0 = new Node((-70));
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isSwitchCase(node0);
      assertFalse(node0.isDelProp());
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      NodeUtil.getPureBooleanValue(node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      NodeUtil.isPrototypeProperty(node0);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals(83, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 1240, 1240).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
      
      Node node1 = NodeUtil.booleanNode(false);
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node1);
      assertTrue(node1.isFalse());
      assertEquals((-1), node1.getLineno());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(12);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-518), 46, 15).when(node0).getType();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Node node0 = Node.newString(2070, "+V96j.6dm~;DKv");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
      
      NodeUtil.isPrototypePropertyDeclaration(node0);
      assertEquals(2070, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      NodeUtil.isSimpleOperatorType(1);
      SyntheticAst syntheticAst0 = new SyntheticAst("J");
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(0, 0, 0, 0).when(node0).getType();
      doReturn((String) null).when(node0).toString();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, predicate0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodenull
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      Node node1 = NodeUtil.numberNode(31, node0);
      boolean boolean0 = NodeUtil.isImmutableValue(node1);
      assertTrue(boolean0);
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("Z$>5~)");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      assertEquals(132, node0.getType());
      assertEquals(122, node1.getType());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      node0.setLineno(43);
      assertEquals(43, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Node node0 = Node.newString(366, ".", 366, 366);
      node0.setLineno(62);
      assertEquals(62, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = NodeUtil.opToStr(40);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Node node0 = new Node(80, 80, 80);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      node0.checkTreeEquals(node0);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertEquals(80, node0.getType());
      assertEquals(0, node0.getChildCount());
      assertEquals(327760, node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 1240, 1240).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      String string0 = NodeUtil.opToStr(54);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = new Node(306654252);
      Node[] nodeArray0 = new Node[8];
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
  public void test093()  throws Throwable  {
      Node node0 = Node.newString("Z");
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:STRING Z
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 200, 1240).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = NodeUtil.booleanNode(false);
      try { 
        node1.getString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // FALSE is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = NodeUtil.opToStr((-3842));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Node node0 = new Node(32);
      node0.getJSDocInfo();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertFalse(boolean0);
      assertTrue(node0.isTypeOf());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1240, 1240, 1240).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
      
      Node node1 = NodeUtil.booleanNode(false);
      assertFalse(node1.isGetProp());
      
      NodeUtil.getPrototypeClassName(node1);
      assertEquals(43, node1.getType());
      assertEquals((-1), node1.getLineno());
      assertEquals((-1), node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = new Node(32);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.mayBeString(node0);
      assertEquals(32, node0.getType());
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Node node0 = new Node(1240);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertEquals(1240, node0.getType());
      
      boolean boolean1 = NodeUtil.isValidQualifiedName("com.google.javascript.jscomp.ProcessCommonJSModules");
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = Node.newString("Z");
      NodeUtil.evaluatesToLocalValue(node0);
      assertFalse(node0.isExprResult());
      
      boolean boolean0 = NodeUtil.isExprAssign(node0);
      assertFalse(boolean0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, ":{-mF0{_Xy0b");
      NodeUtil.getPureBooleanValue(node0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isName());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(43, node0.getType());
      
      int int0 = NodeUtil.getInverseOperator(42);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      boolean boolean0 = NodeUtil.isAssociative((-975));
      Node node0 = new Node((-70));
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals((-70), node0.getType());
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("(/uf}heP");
      assertEquals(Double.NaN, (double)double0, 0.01);
      assertNotNull(double0);
  }
}
