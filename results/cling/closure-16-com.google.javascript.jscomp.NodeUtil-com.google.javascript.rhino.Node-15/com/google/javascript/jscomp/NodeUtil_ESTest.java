/*

 * Tue Mar 03 19:24:13 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PipedInputStream;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = NodeUtil.opToStr(32);
      assertEquals("typeof", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.evaluatesToLocalValue(node0, nodeUtil_BooleanResultPredicate0);
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
  public void test02()  throws Throwable  {
      Node node0 = NodeUtil.numberNode(5938, (Node) null);
      boolean boolean0 = NodeUtil.isExprCall(node0);
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("").when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      NodeUtil.getLoopCodeBlock(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(Integer.MIN_VALUE, node0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = Node.newString((-1290), "X0\"\"HmQpS]YbvTBh", (-1290), (-1290));
      assertFalse(node0.isString());
      
      CompilerOptions compilerOptions0 = new CompilerOptions();
      NodeUtil.isNameReferenced(node0, "", compilerOptions0.sourceMapDetailLevel);
      assertFalse(node0.isCall());
      assertFalse(node0.isName());
      assertFalse(node0.isFunction());
      assertEquals((-1290), node0.getType());
      assertFalse(node0.isGetElem());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "", node0);
      assertTrue(node1.isName());
      
      Node node2 = NodeUtil.getRootOfQualifiedName(node1);
      assertEquals(0, node2.getCharno());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(46, 8, 13).when(node0).getType();
      NodeUtil.evaluatesToLocalValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node1).getSideEffectFlags();
      doReturn(true).when(node1).isCall();
      boolean boolean0 = NodeUtil.callHasLocalResult(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(node0).getString();
      doReturn(43).when(node0).getType();
      doReturn(false).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isConstantByConvention(jqueryCodingConvention0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-667));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(0).when(node1).getType();
      boolean boolean0 = NodeUtil.containsCall(node1);
      assertEquals((-1), node0.getLineno());
      assertEquals(39, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = new Node(34, (-1042), (-1042));
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertEquals(34, node0.getType());
      assertTrue(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = new Node(1237, 116, 10000);
      assertEquals(1237, node0.getType());
      assertEquals(479231, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(object0, object0, object0, object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      // Undeclared exception!
      try { 
        node1.getExistingIntProp(38);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // missing prop: 38
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = new Node(1014, node0, node0, node0, node0, 3549, (-534));
      assertEquals(1014, node1.getType());
      assertFalse(node1.hasMoreThanOneChild());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn((-300), 26).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-667));
      NodeUtil.getSourceFile(node0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isTypeOf());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(true).when(node0).isName();
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
  public void test17()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-3130)).when(node0).getType();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 46, predicate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("+infinity", "+infinity").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "", node0, "+infinity");
      NodeUtil.getNearestFunctionName(node1);
      assertTrue(node1.isName());
      assertEquals(0, node1.getSourcePosition());
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = Node.newString(37, "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction", 37, 37);
      NodeUtil.copyNameAnnotations(node0, node0);
      assertEquals(37, node0.getType());
      assertEquals(151589, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node0 = NodeUtil.newVarNode("S##.YESs&Y/|^%", (Node) null);
      // Undeclared exception!
      try { 
        peepholeRemoveDeadCode0.tryOptimizeBlock(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      assertTrue(node0.isParamList());
      
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node1 = NodeUtil.newVarNode("-infinity", node0);
      Node node2 = peepholeRemoveDeadCode0.tryOptimizeBlock(node1);
      assertTrue(node1.isVar());
      assertEquals((-1), node2.getCharno());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = Node.newString(37, "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction", 37, 37);
      // Undeclared exception!
      try { 
        node0.removeChildAfter(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // prev is not a child of this node.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(837, 2, 837, 16).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(false).when(node0).isScript();
      InputId inputId0 = NodeUtil.getInputId(node0);
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      node0.setWasEmptyNode(false);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getSourceName(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getCharno());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = node0.removeChildren();
      assertNull(node1);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2414, 355, 2414).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode(closureCodingConvention0, "0{UhGx2]");
      Node node2 = new Node(0, node1);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      Predicate<Node> predicate1 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(predicate1).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getCount(node2, predicate0, predicate1);
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(0, node2.getType());
      assertEquals(38, node1.getType());
      assertEquals(2, int0);
      assertEquals((-1), node2.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getLastChild();
      doReturn(86).when(node1).getType();
      boolean boolean0 = NodeUtil.mayBeString(node1);
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean0);
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("C");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected CALL node, got FALSE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = Node.newString(37, "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction", 37, 37);
      // Undeclared exception!
      try { 
        NodeUtil.nodeTypeMayHaveSideEffects(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, nodeUtil_BooleanResultPredicate0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isTrue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(false).when(node0).isFunction();
      doReturn(false).when(node0).isName();
      NodeUtil.redeclareVarsInsideBranch(node0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node node0 = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      NodeUtil.isTryFinallyNode(node0, node0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, nodeUtil_BooleanResultPredicate0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -2147483648
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-1164), (-1164), (-1164), 29, 101).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(113).when(node0).getType();
      boolean boolean0 = NodeUtil.isLoopStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-648));
      assertFalse(node0.isAssign());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(true).when(node1).isExprResult();
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-648));
      boolean boolean1 = NodeUtil.isPrototypePropertyDeclaration(node1);
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(39, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(object0, object0, object0, object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.isAssociative(52);
      boolean boolean0 = NodeUtil.isImmutableValue(node1);
      assertTrue(node1.isVoid());
      assertEquals(0, node1.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node0).getType();
      NodeUtil.getImpureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2414, 355, 2414).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode(closureCodingConvention0, "0{UhGx2]");
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getFirstChild();
      doReturn(true).when(node2).isCall();
      boolean boolean1 = NodeUtil.isSimpleFunctionObjectCall(node2);
      assertEquals(38, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
      assertFalse(node1.isGetElem());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = NodeUtil.opToStr(37);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = Node.newString(37, "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction", 37, 37);
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals(151589, node0.getSourcePosition());
      assertTrue(node0.isCall());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals(44, node0.getType());
      assertEquals("true", string0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(36).when(node0).getType();
      boolean boolean0 = NodeUtil.isLoopStructure(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Node node0 = new Node(52, 49, 42);
      boolean boolean0 = NodeUtil.isBooleanResultHelper(node0);
      assertEquals(52, node0.getType());
      assertEquals(200746, node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Node node0 = Node.newString(37, "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction", 37, 37);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      // Undeclared exception!
      try { 
        peepholeRemoveDeadCode0.tryOptimizeBlock(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.evaluatesToLocalValue(node0, nodeUtil_BooleanResultPredicate0);
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
      
      int int0 = NodeUtil.getInverseOperator(43);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("{`Y Ijg/b_l/D(%V").when(node0).getQualifiedName();
      NodeUtil.getPrototypePropertyName(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node1).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node1, node1);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(node2).isTry();
      // Undeclared exception!
      try { 
        NodeUtil.maybeAddFinally(node2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node0 = Node.newNumber((double) 1);
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
  public void test52()  throws Throwable  {
      Node node0 = NodeUtil.numberNode(5938, (Node) null);
      assertNotNull(node0);
      
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative((-16));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node node0 = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      Node node1 = NodeUtil.booleanNode(false);
      NodeUtil.evaluatesToLocalValue(node1, nodeUtil_BooleanResultPredicate0);
      // Undeclared exception!
      try { 
        NodeUtil.isVarArgsFunction(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isCallOrNew(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node1);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      try { 
        node0.getDouble();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // TRUE is not a number node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Node node0 = Node.newString(37, "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction", 37, 37);
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertFalse(boolean0);
      assertEquals(37, node0.getType());
      assertEquals(151589, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      node0.setSourceEncodedPositionForTree(126);
      assertEquals(126, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(86, 86, 47).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-667));
      boolean boolean1 = NodeUtil.isLatin("-667");
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      NodeUtil.getFunctionName(node1);
      NodeUtil.isVarDeclaration(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(44, node0.getType());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Node node0 = Node.newNumber((double) 53);
      Node node1 = node0.cloneTree();
      assertNotSame(node1, node0);
      assertEquals((-1), node1.getLineno());
      assertTrue(node1.isNumber());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(91);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("false", string0);
      assertEquals((-1), node0.getCharno());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      NodeUtil.isSimpleOperatorType((-667));
      Node node0 = Node.newString(124, ".t", 112, 1);
      assertEquals(112, node0.getLineno());
      
      node0.setLineno(48);
      assertEquals(1, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-667));
      NodeUtil.isSimpleOperatorType((-667));
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
  public void test67()  throws Throwable  {
      Node node0 = new Node(171);
      Node node1 = new Node((-16), node0, node0, 195, 51);
      // Undeclared exception!
      try { 
        NodeUtil.removeChild(node1, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 171
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("+infinity", "+infinity").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "", node0, "+infinity");
      NodeUtil.isPrototypeProperty(node1);
      assertEquals(0, node1.getSourcePosition());
      assertEquals(38, node1.getType());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isTrue());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node1);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(47).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Node node0 = Node.newString("j*<vrtN", 42, 88);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      NodeUtil.getFunctionName(node1);
      assertTrue(node0.isString());
      assertEquals(172120, node0.getSourcePosition());
      assertEquals(42, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      String string0 = NodeUtil.getFunctionName(node1);
      assertNull(string0);
      
      boolean boolean0 = node0.isNoSideEffectsCall();
      assertFalse(boolean0);
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-648));
      assertFalse(node0.isExprResult());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-648));
      boolean boolean1 = NodeUtil.isPrototypePropertyDeclaration(node0);
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(39, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isVarDeclaration(node0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getSourcePosition());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node1);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      NodeUtil.isSimpleOperatorType((-667));
      PipedInputStream pipedInputStream0 = new PipedInputStream(250);
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(pipedInputStream0, object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode(43, node0);
      assertEquals(0, node1.getSourcePosition());
      assertEquals(39, node1.getType());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      String string0 = NodeUtil.getFunctionName(node1);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertNull(string0);
      
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node2).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test77()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(7, 0, 0, 0, 0).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(46, 8, 13).when(node1).getType();
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node1);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test78()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("+infinity", "+infinity").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "", node0, "+infinity");
      String string0 = node1.toString();
      assertEquals("NAME  0 [originalname: +infinity] [source_file: +infinity]", string0);
      assertEquals(0, node1.getSourcePosition());
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isName());
      
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = NodeUtil.MAY_BE_STRING_PREDICATE;
      boolean boolean0 = NodeUtil.isNameReferenced(node0, "ov1r!`", nodeUtil_MayBeStringResultPredicate0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      NodeUtil.opToStr(40);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(91);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(908, (-1188), (-1188), 8298, 32).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("+infinity", "+infinity").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "", node0, "+infinity");
      boolean boolean0 = NodeUtil.mayBeString(node1, false);
      assertTrue(boolean0);
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(160);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 160
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node node0 = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      Node node1 = NodeUtil.booleanNode(false);
      NodeUtil.evaluatesToLocalValue(node1, nodeUtil_BooleanResultPredicate0);
      Node node2 = new Node(45, node0, node0, node1, node1, 41, 45);
      String string0 = NodeUtil.arrayToString(node2);
      assertEquals(Integer.MIN_VALUE, node0.getType());
      assertEquals(45, node2.getType());
      assertTrue(node2.hasMoreThanOneChild());
      assertEquals(167981, node2.getSourcePosition());
      assertEquals(43, node1.getType());
      assertEquals(2, node2.getChildCount());
      assertNull(string0);
      assertEquals((-1), node1.getCharno());
      assertEquals(41, node2.getLineno());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-667));
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-667));
      boolean boolean1 = NodeUtil.isConstantName(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(39, node0.getType());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      NodeUtil.opToStr((-667));
      Node node0 = Node.newNumber((double) (-667));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      String string0 = NodeUtil.arrayToString(node1);
      assertNotNull(string0);
      assertEquals("-667", string0);
      
      NodeUtil.isSimpleOperatorType((-667));
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node2).getLastChild();
      doReturn((String) null).when(node2).getString();
      doReturn(43).when(node2).getType();
      doReturn(true).when(node2).isGetProp();
      boolean boolean0 = NodeUtil.isConstantByConvention(codingConvention0, node2, node2);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      
      Node node3 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(35, 0, 0, 0, 0).when(node3).getType();
      doReturn(false).when(node3).isNull();
      boolean boolean1 = NodeUtil.mayBeString(node3);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node node0 = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      NodeUtil.newVarNode("iv!`[", node0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, nodeUtil_BooleanResultPredicate0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -2147483648
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Node node0 = Node.newString("zzBed8");
      Node[] nodeArray0 = new Node[3];
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
  public void test90()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.getArrayElementStringValue(node1);
      assertEquals(122, node1.getType());
      assertEquals(83, node0.getType());
      assertEquals((-1), node1.getLineno());
      assertTrue(node0.isParamList());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      String string0 = NodeUtil.getFunctionName(node1);
      assertNull(string0);
      
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(node0.isTrue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Node node0 = Node.newNumber((double) 122);
      NodeUtil.isSimpleOperatorType(30);
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      // Undeclared exception!
      try { 
        NodeUtil.isConstantByConvention(jqueryCodingConvention0, node0, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NUMBER 122.0 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = node0.isNoSideEffectsCall();
      assertEquals(44, node0.getType());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node1);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-667));
      assertFalse(node0.isGetProp());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-667));
      assertFalse(boolean0);
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      Node node0 = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      NodeUtil.isNameReferenced(node0, "ov1r!`[", nodeUtil_MayBeStringResultPredicate0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, nodeUtil_BooleanResultPredicate0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -2147483648
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("|=");
      assertEquals(Double.NaN, (double)double0, 0.01);
      assertNotNull(double0);
  }
}
