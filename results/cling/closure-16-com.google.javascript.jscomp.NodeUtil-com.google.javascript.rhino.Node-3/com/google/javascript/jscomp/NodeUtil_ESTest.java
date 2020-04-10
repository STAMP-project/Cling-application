/*

 * Tue Mar 03 19:22:39 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ExploitAssigns;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.ReorderConstantExpression;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Node node0 = new Node(35);
      boolean boolean0 = NodeUtil.isTryFinallyNode(node0, node0);
      assertEquals(35, node0.getType());
      assertFalse(node0.isTry());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = Node.newNumber(Double.POSITIVE_INFINITY);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      NodeUtil.isLiteralValue(node0, false);
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertEquals(39, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn("JSC_FUNCTION_NAMESPACE_ERROR").when(node0).getSourceFileName();
      String string0 = NodeUtil.getSourceName(node0);
      assertEquals("JSC_FUNCTION_NAMESPACE_ERROR", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isPrototypeProperty(node0);
      assertEquals(43, node0.getType());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("").when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      Node node1 = NodeUtil.getLoopCodeBlock(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Node node0 = Node.newString(1581, "is_var_args_param");
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = NodeUtil.BOOLEAN_RESULT_PREDICATE;
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      int int0 = NodeUtil.getCount(node0, nodeUtil_BooleanResultPredicate0, sourceMap_DetailLevel0);
      assertFalse(node0.isCall());
      assertEquals(0, int0);
      assertFalse(node0.isGetProp());
      assertEquals(1581, node0.getType());
      assertFalse(node0.isNew());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      NodeUtil.isLiteralValue(node0, true);
      boolean boolean0 = node0.isSyntheticBlock();
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      NodeUtil.isLiteralValue(node0, true);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      // Undeclared exception!
      try { 
        googleCodingConvention0.isVarArgsParameter(node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NUMBER -1.0 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(44);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown op 44: TRUE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      Node node1 = Node.newString(89, "yyAS`;");
      node0.addChildrenToBack(node1);
      boolean boolean0 = NodeUtil.containsFunction(node0);
      assertTrue(node0.hasChildren());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
      NodeUtil.getPrototypeClassName(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isRegExp());
      assertTrue(node0.isParamList());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0, (AbstractCompiler) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NEW node, got NUMBER
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Node node0 = new Node(52);
      NodeUtil.mayBeStringHelper(node0);
      Node node1 = new Node(159);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 159
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      // Undeclared exception!
      try { 
        Node.newString((String) null, 115, 4579);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "goog.asserts.assertObject");
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertEquals(33, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.hasOneChild());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Node node0 = Node.newNumber(100.0, (-3072), 1299);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      String string0 = NodeUtil.arrayToString(node1);
      assertNotNull(string0);
      assertEquals("100", string0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      NodeUtil.isSimpleOperatorType(53);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node0, 25);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Node node0 = Node.newNumber(53.0, 102, 102);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getFirstChild();
      doReturn(node0).when(node1).getNext();
      doReturn(true).when(node1).isExprResult();
      doReturn("").when(node1).toString();
      ExploitAssigns exploitAssigns0 = new ExploitAssigns();
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node1;
      Node node2 = new Node(54, nodeArray0);
      // Undeclared exception!
      try { 
        exploitAssigns0.optimizeSubtree(node2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isName();
      doReturn(true).when(node0).isThis();
      doReturn((String) null).when(node0).toString();
      Node node1 = NodeUtil.getRootOfQualifiedName(node0);
      assertFalse(node1.isRegExp());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(52, 36, 50).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
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
  public void test024()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isName());
      
      boolean boolean0 = NodeUtil.isVarDeclaration(node0);
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      assertFalse(node0.isFunction());
      
      NodeUtil.getNearestFunctionName(node0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node1 = NodeUtil.newName(googleCodingConvention0, "R=Grt~A5h+", node0, "R=Grt~A5h+");
      NodeUtil.NumbericResultPredicate nodeUtil_NumbericResultPredicate0 = new NodeUtil.NumbericResultPredicate();
      boolean boolean0 = NodeUtil.isNameReferenced(node1, "JSC_JQUERY_UNABLE_TO_EXPAND_INVALID_NAME", nodeUtil_NumbericResultPredicate0);
      assertEquals(0, node1.getCharno());
      assertFalse(boolean0);
      assertTrue(node1.isName());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isFunction();
      doReturn(false).when(node0).isName();
      Collection<Node> collection0 = NodeUtil.getVarsDeclaredInBranch(node0);
      assertFalse(collection0.contains(node0));
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertEquals(38, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
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
  public void test032()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      node0.detachChildren();
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Node node0 = Node.newNumber(3423.2133742209553);
      assertFalse(node0.isHook());
      assertFalse(node0.isComma());
      assertFalse(node0.isOr());
      assertFalse(node0.isAnd());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0, node0).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      Node node2 = NodeUtil.getBestLValue(node1);
      assertFalse(node0.isAssign());
      assertNull(node2);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isName());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = new Node(15, node0, node0, node0);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertEquals(15, node1.getType());
      assertFalse(boolean0);
      assertTrue(node1.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
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
  public void test036()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = NodeUtil.booleanNode(true);
      Node node2 = new Node(31, node0, 133, 29);
      boolean boolean0 = node1.isEquivalentToTyped(node2);
      assertFalse(boolean0);
      assertFalse(node1.isThis());
      assertEquals(31, node2.getType());
      assertEquals(544797, node2.getSourcePosition());
      assertEquals((-1), node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = new Node(35);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean0 = NodeUtil.has(node0, nodeUtil_MayBeStringResultPredicate0, nodeUtil_MayBeStringResultPredicate0);
      assertTrue(boolean0);
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isGetElem());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      NodeUtil.evaluatesToLocalValue(node0);
      node0.addChildrenToBack(node0);
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.isNullOrUndefined(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "\n parent:");
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
      assertTrue(node0.isName());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace(". ");
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      String string0 = NodeUtil.opToStr(49);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      NodeUtil.getSourceName(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace(")\n");
      assertEquals(")", string0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = Node.newString(46, "<=", 46, 1433);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, false, false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getCount(node1, predicate0, predicate0);
      assertEquals(0, int0);
      
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      assertEquals(46, node0.getType());
      assertEquals(189849, node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(100).when(node0).getType();
      // Undeclared exception!
      try { 
        NodeUtil.mayBeString(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidSimpleName("yyAS`;");
      assertFalse(boolean0);
      
      Node node0 = Node.newNumber((double) 50, 1, 54);
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(4150, node0.getSourcePosition());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isGet(node0);
      boolean boolean1 = NodeUtil.isSimpleOperatorType(2);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "goog.asserts.assertObject");
      assertTrue(node0.isGetProp());
      assertEquals(2, node0.getChildCount());
      
      Double double0 = NodeUtil.getStringNumberValue(".not a StringNode");
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected CALL node, got TRUE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      NodeUtil.isForIn(node0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isFor());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(53);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node1 = NodeUtil.newName(googleCodingConvention0, "R=Grt~A5h+", node0, "R=Grt~A5h+");
      Node node2 = new Node(46, node1, node1, node1, node1, 1945, (-975));
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
      assertEquals((-1), node2.getLineno());
      assertEquals(46, node2.getType());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Node node0 = Node.newNumber(501.01, (-766), 958);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(false).when(node1).isFunction();
      doReturn(false).when(node1).isName();
      NodeUtil.getVarsDeclaredInBranch(node1);
      assertFalse(node0.isName());
      assertFalse(node0.isFunction());
      assertEquals((-1), node0.getCharno());
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = Node.newString("^:");
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1485, 1485, 86);
      Node node1 = new Node(1485, node0, node0, (-1559), 2);
      Node node2 = null;
      try {
        node2 = new Node(36, node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first new child has existing parent
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Node node0 = new Node(35);
      NodeUtil.getImpureBooleanValue(node0);
      assertTrue(node0.isGetElem());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(35, node0.getType());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      NodeUtil.isLiteralValue(node0, false);
      SyntheticAst syntheticAst0 = new SyntheticAst(". ");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-568), 0, 0, 0, 0).when(node0).getType();
      doReturn(true).when(node0).isNull();
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node1);
      boolean boolean1 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = Node.newString("yyAS`;");
      Node node1 = NodeUtil.numberNode(49, node0);
      boolean boolean0 = NodeUtil.mayBeString(node1);
      assertFalse(boolean0);
      assertEquals(40, node0.getType());
      assertEquals(39, node1.getType());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals("true", string0);
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isLoopStructure(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1485, 1485, 86);
      Node node1 = new Node(1485, node0, node0, (-1559), 2);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getFirstChild();
      doReturn(node1, node0).when(node2).getParent();
      doReturn(true, true).when(node2).isFunction();
      String string0 = NodeUtil.getNearestFunctionName(node2);
      assertEquals(6082646, node0.getSourcePosition());
      assertEquals(1485, node1.getType());
      assertNotNull(string0);
      assertEquals((-1), node1.getSourcePosition());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node1 = Node.newString("Infinity");
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node0;
      Node node2 = NodeUtil.newCallNode(node1, nodeArray0);
      assertFalse(node2.isGetProp());
      
      peepholeRemoveDeadCode0.mayEffectMutableState(node2);
      assertTrue(node2.isCall());
      assertFalse(node2.isName());
      assertEquals(2, node2.getChildCount());
      assertEquals(40, node1.getType());
      assertEquals((-1), node2.getCharno());
      assertTrue(node2.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1485, 1485, 86);
      Node node1 = new Node(1485, node0, node0, (-1559), 2);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getFirstChild();
      doReturn(node1, node1).when(node2).getParent();
      doReturn(true, true).when(node2).isFunction();
      NodeUtil.getNearestFunctionName(node2);
      boolean boolean0 = NodeUtil.isAssociative(54);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = NodeUtil.opToStrNoFail(122);
      assertEquals("void", string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).copyInformationFrom(any(com.google.javascript.rhino.Node.class));
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      // Undeclared exception!
      try { 
        node1.replaceChild(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      NodeUtil.isLiteralValue(node0, false);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      boolean boolean0 = nodeUtil_BooleanResultPredicate0.apply(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator(0);
      assertEquals((-1), int0);
      
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      boolean boolean1 = NodeUtil.isForIn(node0);
      assertEquals(38, node0.getType());
      assertFalse(node0.isFor());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(4095);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = Node.newString("yyAS`;");
      Node node2 = new Node(45, node0, node1, node0);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node2);
      assertEquals(45, node2.getType());
      assertTrue(node1.isString());
      assertEquals(1, node2.getChildCount());
      assertFalse(boolean0);
      assertEquals((-1), node1.getCharno());
      assertTrue(node2.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isGet(node0);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(43, node0.getType());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Node node0 = Node.newNumber((double) 50, 1, 54);
      NodeUtil.evaluatesToLocalValue(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node0, 25);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Node node0 = Node.newString(46, "<=", 46, 1433);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(43).when(node1).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1, (AbstractCompiler) null);
      assertEquals(46, node0.getType());
      assertEquals(189849, node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      NodeUtil.isForIn(node0);
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(45, (-1540), 14).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      boolean boolean0 = NodeUtil.isLiteralValue(node0, false);
      assertTrue(boolean0);
      
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention(googleCodingConvention0);
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) closureCodingConvention0, ". ", node0, "RegExp");
      assertEquals((-1), node1.getCharno());
      assertTrue(node1.isGetProp());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = NodeUtil.opToStr(50);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(48, 86, 1073741824).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = Node.newString(46, "<=", 46, 1433);
      NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      assertEquals(46, node0.getType());
      assertEquals(189849, node0.getSourcePosition());
      
      Node node1 = Node.newNumber((double) 47, (-121), 46);
      assertTrue(node1.isNumber());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("not a StringNode");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.getStringValue(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = new Node(102);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.getExceptionHandler(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Node node0 = Node.newString("");
      boolean boolean0 = node0.isQualifiedName();
      assertTrue(node0.isString());
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(38, node0.getType());
      
      Node node1 = Node.newString(89, "yyAS`;");
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node1);
      assertEquals((-1), node1.getCharno());
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(41).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isExprResult();
      boolean boolean0 = NodeUtil.isPrototypePropertyDeclaration(node0);
      boolean boolean1 = NodeUtil.isSimpleOperatorType(2);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1485, 1485, 86);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0, node0).when(node1).getParent();
      doReturn(true, true).when(node1).isFunction();
      NodeUtil.getNearestFunctionName(node1);
      boolean boolean0 = NodeUtil.isAssociative(54);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertTrue(node0.isName());
      
      Node node1 = Node.newNumber((double) 50, 1, 54);
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node1);
      assertTrue(node1.isNumber());
      assertEquals(4150, node1.getSourcePosition());
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "*q/cTf@l");
      try { 
        node0.setDouble(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NAME *q/cTf@l is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = Node.newString(46, "<=", 46, 1433);
      NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
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
  public void test092()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertFalse(boolean0);
      assertFalse(node0.hasChildren());
      
      String string0 = NodeUtil.trimJsWhiteSpace("mnb3BYT");
      assertEquals("mnb3BYT", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator(0);
      assertEquals((-1), int0);
      
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention(googleCodingConvention0);
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) closureCodingConvention0, ". ", node0, "RegExp");
      assertTrue(node0.isNumber());
      assertEquals((-1), node1.getCharno());
      assertTrue(node1.isGetProp());
      assertEquals(2, node1.getChildCount());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertFalse(boolean0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = NodeUtil.opToStr((-370));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-1), 0, (-1));
      NodeUtil.evaluatesToLocalValue(node0);
      Node node1 = new Node(46, node0);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertEquals(39, node0.getType());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(38, 32).when(node0).getType();
      boolean boolean0 = NodeUtil.isBooleanResult(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(113);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      NodeUtil.evaluatesToLocalValue(node0);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention(closureCodingConvention0);
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "RegExp", node0, "-infinity");
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(38, node0.getType());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      SyntheticAst syntheticAst0 = new SyntheticAst("com.google.common.collect.ArrayListMultimap");
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      NodeUtil.setDebugInformation(node0, node0, "[");
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.opToStrNoFail(46);
      assertEquals("!==", string0);
      
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = new Node(35);
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
  public void test103()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-883), 30, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.nodeTypeMayHaveSideEffects(node1, (AbstractCompiler) null);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Node node0 = new Node(52);
      Node node1 = NodeUtil.newVarNode("new child has existing sibling", node0);
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
  public void test105()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      ReorderConstantExpression reorderConstantExpression0 = new ReorderConstantExpression();
      reorderConstantExpression0.optimizeSubtree(node0);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(43, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      node0.addChildrenToBack(node0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getLineno());
      
      Node node1 = Node.newNumber((double) 50, 1, 54);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node1);
      assertTrue(node1.isNumber());
      assertEquals(4150, node1.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1485, 1485, 86);
      Node node1 = new Node(1485, node0, node0, (-1559), 2);
      node1.useSourceInfoFromForTree(node0);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getFirstChild();
      doReturn(node1, node1).when(node2).getParent();
      doReturn(true, true).when(node2).isFunction();
      NodeUtil.getNearestFunctionName(node2);
      assertEquals(86, node1.getCharno());
      assertEquals(6082646, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Node node0 = Node.newNumber((double) 50, 1, 54);
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(4150, node0.getSourcePosition());
      assertTrue(node0.isNumber());
      
      boolean boolean0 = NodeUtil.isValidSimpleName("JSCompiler_inline_label_");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1485, 1485, 86);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0, node0).when(node1).getParent();
      doReturn(true, true).when(node1).isFunction();
      String string0 = NodeUtil.getNearestFunctionName(node1);
      assertEquals("1485", string0);
      
      Node node2 = NodeUtil.numberNode(54, node0);
      assertEquals(6082646, node2.getSourcePosition());
      assertNotSame(node2, node0);
      assertTrue(node2.isNumber());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(46, 105, 50, 36, 153).when(node1).getType();
      doReturn(false).when(node1).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isFalse());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Node node0 = new Node(52);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isInstanceOf());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "yyAS`;");
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getCharno());
      
      boolean boolean1 = NodeUtil.isSimpleOperatorType(53);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(35, 30, 39).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      assertTrue(boolean0);
  }
}
