/*

 * Tue Mar 03 19:21:50 GMT 2020
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
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(43);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown op 43: FALSE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.isPrototypeProperty(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("&=").when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newNumber(199.93892427, 10, 10);
      NodeUtil.getLoopCodeBlock(node0);
      assertEquals(40970, node0.getSourcePosition());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(2120, (-1506), (-1506));
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertFalse(boolean0);
      assertEquals(2120, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(64, 64, 64);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals("[object Object]", string0);
      assertEquals(262208, node0.getSourcePosition());
      assertTrue(node0.isObjectLit());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = Node.newNumber((-243.86081686664));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn((-226)).when(node1).getType();
      boolean boolean0 = NodeUtil.containsFunction(node1);
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode(",ov", (Node) null);
      NodeUtil.getPrototypeClassName(node0);
      assertTrue(node0.isVar());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isNew();
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(105).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      NodeUtil.isExprAssign(node0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -331
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = Node.newString(1286, "undefinedNames");
      Node node1 = new Node(4, node0, node0, 121, (-1589));
      assertTrue(node1.isReturn());
      assertEquals(1286, node0.getType());
      assertFalse(node1.hasMoreThanOneChild());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(51);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      Node node0 = Node.newString(49, "!==");
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchShallowStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodeTHROW !==
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      doReturn(true).when(codingConvention0).isConstantKey(anyString());
      // Undeclared exception!
      try { 
        NodeUtil.newQualifiedNameNode(codingConvention0, "6j_k+z.HGP _m X", (Node) null, "    ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(node0).getString();
      doReturn(38).when(node0).getType();
      String string0 = NodeUtil.getStringValue(node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 0, predicate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace("|_");
      assertEquals("|_", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isFunction();
      String string0 = NodeUtil.getNearestFunctionName(node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.has(node0, predicate0, predicate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(112, 112, (-1523), 36, (-1425)).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isGet(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9'+Iq");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      assertEquals((-1), node1.getSourcePosition());
      assertEquals((-331), node0.getType());
      assertEquals(122, node1.getType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = Node.newString("^=");
      Node node1 = NodeUtil.numberNode(45, node0);
      assertEquals((-1), node1.getLineno());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(110);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(113).when(node0).getSideEffectFlags();
      doReturn(true).when(node0).isCall();
      boolean boolean1 = NodeUtil.callHasLocalResult(node0);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getChildCount();
      doReturn(29).when(node0).getType();
      Double double0 = NodeUtil.getNumberValue(node0);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = Node.newString("$jQ^yOR\"1JF");
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
  public void test31()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator(32);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      // Undeclared exception!
      try { 
        node0.addChildrenAfter((Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.has(node0, predicate0, predicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(110).when(node0).getSideEffectFlags();
      doReturn(true).when(node0).isCall();
      NodeUtil.callHasLocalResult(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getParent();
      doReturn(16, 770, 0, 0).when(node1).getType();
      doReturn((String) null).when(node1).toString();
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1, nodeUtil_MatchShallowStatement0);
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
  public void test36()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(false).when(node0).isScript();
      InputId inputId0 = NodeUtil.getInputId(node0);
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      String string0 = NodeUtil.getSourceName(node0);
      assertNull(string0);
      assertEquals((-331), node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      node0.children();
      assertEquals((-331), node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = Node.newString("", 43, 47);
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals(176175, node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = new Node((-472), (-472), (-472));
      Node node1 = new Node(0);
      // Undeclared exception!
      try { 
        node0.checkTreeEquals(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -472
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = node0.removeChildren();
      assertEquals(44, node0.getType());
      assertNull(node1);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(53).when(node1).getType();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getNodeTypeReferenceCount(node1, 50, predicate0);
      assertEquals(0, int0);
      
      CompilerOptions compilerOptions0 = new CompilerOptions();
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, compilerOptions0.sourceMapDetailLevel);
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      NodeUtil.isExprAssign(node0);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals((-331), node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      Node node1 = new Node(12, node0, node0, 49, 30);
      // Undeclared exception!
      try { 
        NodeUtil.getObjectLitKeyName(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected node type: EQ 49
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isCall();
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0, (AbstractCompiler) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(node1).isScript();
      InputId inputId0 = NodeUtil.getInputId(node1);
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      assertFalse(node0.isExprResult());
      
      boolean boolean0 = NodeUtil.isExprCall(node0);
      assertFalse(boolean0);
      
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Node node0 = new Node(133, 92, 92);
      Node node1 = new Node((-2897), node0, node0, 51, 4379);
      NodeUtil.redeclareVarsInsideBranch(node1);
      assertEquals(376924, node0.getSourcePosition());
      assertEquals(133, node0.getType());
      assertEquals((-2897), node1.getType());
      assertEquals(212991, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      Node node1 = NodeUtil.newVarNode("com.google.javascript.jscomp.TypeValidator", node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      peepholeSubstituteAlternateSyntax0.skipFinallyNodes(node0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodeVAR
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(closureCodingConvention0, "empty_block");
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(node0.isName());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention(googleCodingConvention0);
      Node node0 = NodeUtil.newQualifiedNameNode(closureCodingConvention0, "com.google.javascript.jscomp.CompilerOptions$DevMode");
      boolean boolean0 = NodeUtil.isGet(node0);
      assertEquals(2, node0.getChildCount());
      assertFalse(node0.isGetElem());
      assertTrue(boolean0);
      assertTrue(node0.hasMoreThanOneChild());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(210, 120, 30).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1624, 27591).when(node0).getType();
      NodeUtil.getImpureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Node node0 = Node.newString((-1106), "g]VOU~)P", (-1106), (-3147));
      NodeUtil.isPrototypePropertyDeclaration(node0);
      assertEquals((-1106), node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      node0.isNoSideEffectsCall();
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchShallowStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -331
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals((-331), node0.getType());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-472), 23).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Node node0 = Node.newString("^=");
      boolean boolean0 = NodeUtil.isRelationalOperation(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(true).when(node0).isNew();
      doReturn(false).when(node0).isNoSideEffectsCall();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Node node0 = Node.newNumber(825.8, (-1459), (-1459));
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
  public void test61()  throws Throwable  {
      NodeUtil.isSimpleOperatorType(1461);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(node0).isTry();
      // Undeclared exception!
      try { 
        NodeUtil.maybeAddFinally(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      NodeUtil.isSimpleOperatorType(110);
      Node node0 = new Node(54, 39, 31);
      boolean boolean0 = NodeUtil.isLiteralValue(node0, false);
      assertEquals(54, node0.getType());
      assertEquals(159775, node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertFalse(boolean0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      String string0 = node0.toString(true, false, true);
      assertEquals("TRUE", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Node node0 = new Node(2120, (-1527), (-1527));
      Node[] nodeArray0 = new Node[5];
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Node node0 = Node.newNumber((-750.563672004));
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isFor());
      assertEquals(39, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-5668), (-5668), (-5668), (-5668), (-5668)).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = Node.newString(32, "jQuery.expandedEach");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, compilerOptions0.sourceMapDetailLevel);
      assertFalse(node0.isTypeOf());
      
      boolean boolean1 = NodeUtil.mayBeString(node1, false);
      assertTrue(boolean1 == boolean0);
      assertEquals(32, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(109).when(node0).getType();
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertFalse(boolean0);
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node1).isGetProp();
      Node[] nodeArray0 = new Node[0];
      Node node2 = NodeUtil.newCallNode(node1, nodeArray0);
      assertTrue(node2.isCall());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Node node0 = new Node(28, 28, 28);
      NodeUtil.evaluatesToLocalValue(node0, (Predicate<Node>) null);
      assertEquals(28, node0.getType());
      assertEquals(114716, node0.getSourcePosition());
      
      Node node1 = new Node(4, (-2520), 4095);
      assertEquals(4, node1.getType());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Node node0 = new Node(45, 115, 16);
      node0.copyInformationFromForTree(node0);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(28);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Node node0 = Node.newString(28, "!==");
      NodeUtil.evaluatesToLocalValue(node0, (Predicate<Node>) null);
      boolean boolean0 = NodeUtil.mayBeString(node0, true);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(28, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      assertFalse(node0.isString());
      
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 116, sourceMap_DetailLevel0);
      assertEquals(0, int0);
      
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      assertFalse(node0.isGetElem());
      assertFalse(node0.isName());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isNew());
      assertFalse(node0.isCall());
      assertFalse(node0.isFunction());
      assertTrue(node0.isTrue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode(",ov", (Node) null);
      assertNotNull(node0);
      
      boolean boolean0 = NodeUtil.isSwitchCase(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(118, node0.getType());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Node node0 = Node.newString((-1106), "g]VOU~)P", (-1106), (-3147));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSDocInfo) null).when(node1).getJSDocInfo();
      doReturn(node0).when(node1).getParent();
      NodeUtil.getBestJSDocInfo(node1);
      assertFalse(node0.isFunction());
      assertFalse(node0.isComma());
      assertFalse(node0.isOr());
      assertFalse(node0.isName());
      assertFalse(node0.isAssign());
      assertEquals((-1106), node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Node node0 = Node.newString((-331), ":71cJJ9A'+Iq");
      node0.putBooleanProp((-2059), false);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -331
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Node node0 = new Node((-5668), (-5668), (-5668));
      // Undeclared exception!
      try { 
        node0.getString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -5668
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn("&=", (Node) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("&=", node0);
      node1.detachChildren();
      assertTrue(node1.isVar());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Node node0 = new Node(28, 28, 28);
      NodeUtil.evaluatesToLocalValue(node0, (Predicate<Node>) null);
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
      String string0 = NodeUtil.opToStr(1574);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      int int0 = NodeUtil.precedence(51);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Node node0 = new Node(28, 28, 28);
      NodeUtil.evaluatesToLocalValue(node0, (Predicate<Node>) null);
      NodeUtil.copyNameAnnotations(node0, node0);
      assertEquals(28, node0.getType());
      assertEquals(114716, node0.getSourcePosition());
      assertEquals(28, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(153, 153, 153).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = Node.newString(1286, "undefinedNames");
      Node node2 = new Node(4, node1, node1, 121, (-1589));
      assertEquals(1286, node1.getType());
      assertFalse(node2.hasMoreThanOneChild());
      assertEquals(4, node2.getType());
      assertEquals((-1), node2.getLineno());
      assertEquals((-1), node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Node node0 = new Node(28, 28, 28);
      NodeUtil.evaluatesToLocalValue(node0, (Predicate<Node>) null);
      assertEquals(114716, node0.getSourcePosition());
      assertEquals(28, node0.getType());
      
      boolean boolean0 = NodeUtil.isValidQualifiedName("RegExp");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(81, 81, 81).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = Node.newString(2182, "e", 23, 49);
      assertEquals(94257, node1.getSourcePosition());
      assertEquals(2182, node1.getType());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(103, 103, 103).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Node node0 = new Node(133, 92, 92);
      Node node1 = new Node((-2897), node0, node0, 51, 4379);
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode(" of ", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(4);
      NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchNodeType0);
      Node node1 = new Node(86);
      // Undeclared exception!
      try { 
        NodeUtil.mayBeString(node1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1309).when(node0).getType();
      doReturn("").when(node0).toString();
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      NodeUtil.opToStr(36);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(1470);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(42);
      boolean boolean1 = NodeUtil.isSimpleOperatorType(1470);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Node node0 = Node.newString("$jQ^yOR\"1JF");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0, node0).when(node1).getParent();
      doReturn(true, true).when(node1).isFunction();
      String string0 = NodeUtil.getNearestFunctionName(node1);
      assertEquals(40, node0.getType());
      assertNull(string0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      Node node1 = Node.newString(40, "jQuery.expandedEach");
      NodeUtil.evaluatesToLocalValue(node0, sourceMap_DetailLevel0);
      assertFalse(node0.isString());
      
      boolean boolean0 = NodeUtil.mayBeString(node1, true);
      assertTrue(boolean0);
      assertTrue(node1.isString());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Node node0 = Node.newString(43, ".");
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchShallowStatement0);
      boolean boolean0 = NodeUtil.mayBeString(node0, true);
      assertFalse(boolean0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.nodeTypeMayHaveSideEffects(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      NodeUtil.isAssociative(110);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(16, 770, 0, 0).when(node0).getType();
      doReturn((String) null).when(node0).toString();
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchShallowStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodenull
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }
}
