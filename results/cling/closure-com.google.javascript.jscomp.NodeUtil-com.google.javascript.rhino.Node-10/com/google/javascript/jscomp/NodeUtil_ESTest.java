/*

 * Tue Mar 03 19:25:32 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.ByteArrayInputStream;
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
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "?v6H\"bW\u0004");
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
  public void test001()  throws Throwable  {
      Node node0 = new Node(30, 2, 54);
      Node node1 = node0.cloneTree();
      assertEquals(8246, node1.getSourcePosition());
      assertEquals(30, node1.getType());
      assertNotSame(node1, node0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      NodeUtil.isSimpleOperator(node0);
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
      doReturn((String) null).when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("cX sbO50Yg$.").when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isBooleanResultHelper(node0);
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean0);
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      Node node1 = NodeUtil.getLoopCodeBlock(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Node node0 = Node.newNumber(53.0, (-1697), (-1628));
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertFalse(boolean0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = NodeUtil.precedence(90);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isName();
      doReturn((String) null).when(node0).toString();
      Node node1 = NodeUtil.getRootOfQualifiedName(node0);
      assertEquals(29, Node.JSDOC_INFO_PROP);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Node node0 = new Node(30, 2, 54);
      NodeUtil.isConstantName(node0);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals(8246, node0.getSourcePosition());
      assertTrue(node0.isNew());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      try { 
        node0.setString((String) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // TRUE is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = Node.newNumber(53.0, (-1697), (-1628));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(3166).when(node1).getType();
      boolean boolean0 = NodeUtil.containsType(node1, 41);
      assertFalse(boolean0);
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = new Node(16, node0, 4095, 16);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getLastChild();
      doReturn(true).when(node2).isGetProp();
      // Undeclared exception!
      try { 
        NodeUtil.getPrototypeClassName(node2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // GT 4095 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NEW node, got FALSE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = Node.newString("", 4829, 4829);
      assertEquals(40, node0.getType());
      assertEquals(19783679, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      
      NodeUtil.isConstantName(node0);
      assertEquals(40, node0.getType());
      assertEquals(811116, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isExprResult();
      boolean boolean0 = NodeUtil.isPrototypePropertyDeclaration(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(43, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.isLiteralValue(node1, true);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Node node0 = new Node(32);
      NodeUtil.redeclareVarsInsideBranch(node0);
      assertFalse(node0.isName());
      assertTrue(node0.isTypeOf());
      assertEquals((-1), node0.getLineno());
      assertEquals(32, node0.getType());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(10000, (-2696), (-2696), 10000, (-2696)).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
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
  public void test022()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
      assertEquals(38, node0.getType());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
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
      SyntheticAst syntheticAst0 = new SyntheticAst("checkGlobalNames");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      NodeUtil.isSimpleOperator(node0);
      boolean boolean0 = NodeUtil.isExprCall(node0);
      assertFalse(boolean0);
      assertTrue(node0.isScript());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 31, predicate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isCall();
      doReturn(true).when(node0).isNoSideEffectsCall();
      boolean boolean0 = NodeUtil.functionCallHasSideEffects(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(2, nodeArray0, 43, 36);
      NodeUtil.NumbericResultPredicate nodeUtil_NumbericResultPredicate0 = NodeUtil.NUMBERIC_RESULT_PREDICATE;
      boolean boolean0 = NodeUtil.has(node0, nodeUtil_NumbericResultPredicate0, nodeUtil_NumbericResultPredicate0);
      assertEquals(176164, node0.getSourcePosition());
      assertFalse(boolean0);
      assertEquals(2, node0.getType());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newName(codingConvention0, "", node1);
      // Undeclared exception!
      try { 
        NodeUtil.newHasLocalResult(node2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      doReturn(true).when(node1).isName();
      NodeUtil.getVarsDeclaredInBranch(node1);
      assertTrue(node0.isParamList());
      assertEquals((-1), node0.getLineno());
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isGet(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = new Node(115, node0, node0, node0, node0, (-18), 8506);
      Predicate<Node> predicate0 = NodeUtil.MATCH_NOT_FUNCTION;
      int int0 = NodeUtil.getNodeTypeReferenceCount(node1, 36, predicate0);
      assertEquals((-1), node0.getLineno());
      assertEquals(0, int0);
      assertTrue(node1.isFor());
      assertFalse(node1.hasMoreThanOneChild());
      assertEquals((-1), node1.getSourcePosition());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
      NodeUtil.copyNameAnnotations(node0, node0);
      assertTrue(node0.isParamList());
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = new Node(49, node0, node0, node0, node0);
      assertTrue(node1.isThrow());
      assertFalse(node1.isOr());
      assertTrue(node1.hasOneChild());
      
      Node node2 = NodeUtil.getBestLValue(node0);
      assertTrue(node0.isFalse());
      assertNull(node2);
      assertFalse(node0.isHook());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isAssign());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-148), 19).when(node0).getType();
      boolean boolean0 = NodeUtil.isNumericResult(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
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
  public void test036()  throws Throwable  {
      Node node0 = new Node((-2801), 23, 23);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(94231, node0.getSourcePosition());
      assertEquals((-2801), node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = NodeUtil.opToStrNoFail(45);
      assertEquals("===", string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = node0.useSourceInfoIfMissingFromForTree(node0);
      assertEquals(43, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isGet(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.ALL;
      boolean boolean0 = NodeUtil.has(node0, sourceMap_DetailLevel0, sourceMap_DetailLevel0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("checkGlobalNames");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      boolean boolean1 = NodeUtil.isVarDeclaration(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isScript());
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.isNullOrUndefined(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(49);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown op 49: THROW
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      NodeUtil.isSimpleOperator(node0);
      Node node1 = NodeUtil.newVarNode("Infinity", node0);
      assertEquals(811116, node1.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = new Node(85, 85, 85);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getNext();
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode("eAp.\":", node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getInputId(node0);
      assertFalse(node0.isScript());
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(2, nodeArray0, 43, 36);
      node0.setOptionalArg(false);
      assertEquals(2, node0.getType());
      assertEquals(176164, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = new Node((-4038), 500, (-4038));
      NodeUtil.getSourceName(node0);
      assertEquals((-4038), node0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Node node0 = Node.newNumber(53.0, (-1697), (-1628));
      String string0 = node0.toString(true, true, false);
      assertEquals(39, node0.getType());
      assertEquals("NUMBER 53.0", string0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = Node.newString("checkGlobalNames");
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals("checkGlobalNames", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Node node0 = Node.newNumber(53.0, (-1697), (-1628));
      Node node1 = node0.removeChildren();
      assertNull(node1);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 16, 8);
      NodeUtil.getInverseOperator(2);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", byteArrayInputStream0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "", node0);
      node1.removeFirstChild();
      assertEquals(0, node1.getSourcePosition());
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("undefined");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(115, (-1974), (-1974)).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 16, 8);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", byteArrayInputStream0).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newName(codingConvention0, "", node1);
      node2.removeFirstChild();
      assertEquals(0, node2.getSourcePosition());
      assertEquals(38, node2.getType());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
      assertFalse(node0.isGetProp());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(true).when(node1).isCall();
      doReturn(false).when(node1).isNoSideEffectsCall();
      NodeUtil.functionCallHasSideEffects(node1);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isParamList());
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = Node.newString("checkGlobalNames");
      assertFalse(node0.isFunction());
      
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      boolean boolean0 = nodeUtil_MatchDeclaration0.apply(node0);
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean1 == boolean0);
      assertTrue(node0.isString());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = Node.newString("checkGlobalNames");
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(node0.isExprResult());
      
      boolean boolean1 = NodeUtil.isExprCall(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = Node.newString("eAp.\":", 22, 22);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertEquals(40, node0.getType());
      assertEquals(90134, node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = new Node((-3220), node0, node0, node0, node0);
      assertFalse(node1.hasMoreThanOneChild());
      
      NodeUtil.getVarsDeclaredInBranch(node1);
      assertFalse(node1.isFunction());
      assertEquals((-1), node0.getLineno());
      assertEquals((-3220), node1.getType());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2036, 412, 412).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      Node node1 = Node.newString("", 16, (-1899));
      Node node2 = NodeUtil.newVarNode("", node1);
      Node node3 = null;
      try {
        node3 = new Node(45, node2, node1, node1, (-433), 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(29).when(node0).getType();
      boolean boolean0 = NodeUtil.isBooleanResultHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node1 = peepholeSimplifyRegExp0.optimizeSubtree(node0);
      assertEquals(811116, node1.getSourcePosition());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      NodeUtil.isSimpleOperator(node0);
      NodeUtil.isForIn(node0);
      assertTrue(node0.isString());
      assertEquals(811116, node0.getSourcePosition());
      assertEquals(108, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(11, 11).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator(44);
      assertEquals((-1), int0);
      
      Node node0 = new Node((-1986));
      Node node1 = new Node((-418), node0, node0, 1, (-2611));
      assertEquals((-1986), node0.getType());
      assertEquals((-418), node1.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node1.hasOneChild());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("u");
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.getNearestFunctionName(node0);
      Node node1 = new Node((-1668), node0, node0, node0, node0, 0, 48);
      assertEquals(48, node1.getSourcePosition());
      assertEquals((-1668), node1.getType());
      assertFalse(node1.hasMoreThanOneChild());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(node0.isNull());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      NodeUtil.isSimpleOperator(node0);
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertTrue(boolean0);
      assertEquals(811116, node0.getSourcePosition());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Node node0 = new Node(1456, 1456, 1456);
      Node node1 = NodeUtil.numberNode(1, node0);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertEquals(1456, node0.getType());
      assertTrue(node1.isNumber());
      assertEquals(5965232, node1.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2846).when(node0).getType();
      boolean boolean0 = NodeUtil.isLoopStructure(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(2, nodeArray0, 43, 36);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "com.google.javascript.rhino.Node", node0, "A&");
      assertEquals(176164, node1.getSourcePosition());
      assertEquals(2, node0.getType());
      assertEquals(33, node1.getType());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Node node0 = new Node(30, 2, 54);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean0 = NodeUtil.valueCheck(node0, nodeUtil_MayBeStringResultPredicate0);
      assertEquals(8246, node0.getSourcePosition());
      assertTrue(node0.isNew());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "", node0);
      // Undeclared exception!
      try { 
        node1.addChildBefore(node1, node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The existing child node of the parent should not be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(361).when(node0).getType();
      boolean boolean0 = NodeUtil.isRelationalOperation(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Node node0 = Node.newString("checkGlobalNames");
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
  public void test078()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(16, 160).when(node0).getType();
      boolean boolean0 = NodeUtil.isNumericResult(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(43, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.isLiteralValue(node1, true);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = new Node(30, 2, 54);
      NodeUtil.isSymmetricOperation(node0);
      assertEquals(8246, node0.getSourcePosition());
      assertEquals(30, node0.getType());
      assertEquals(2, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2036, 412, 412).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      Node node1 = Node.newString("", 16, (-1899));
      Node node2 = new Node(45, node1, node1, node1, (-433), 2);
      assertTrue(node1.isString());
      assertEquals((-1), node2.getLineno());
      assertEquals((-1), node1.getLineno());
      assertEquals(45, node2.getType());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(29);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("checkGlobalNames");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      boolean boolean0 = nodeUtil_MatchDeclaration0.apply(node0);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertEquals(132, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "", node0);
      // Undeclared exception!
      try { 
        NodeUtil.setDebugInformation(node1, node1, "m<,g&!T^UYBGU\"(%4");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(true).when(node1).isCall();
      NodeUtil.isObjectCallMethod(node1, "#:j&9y>");
      boolean boolean0 = NodeUtil.isLiteralValue(node0, false);
      assertTrue(node0.isParamList());
      assertFalse(node0.isGetElem());
      assertFalse(node0.isGetProp());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(132, (-1), (-1)).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      doReturn(false).when(codingConvention0).isConstantKey(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "undefined.");
      boolean boolean1 = NodeUtil.isObjectCallMethod(node1, "K7Q4]mJ tH0:=eh:!(^");
      assertFalse(node1.isString());
      assertFalse(boolean1 == boolean0);
      assertTrue(node1.isGetProp());
      assertEquals(2, node1.getChildCount());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(26, (-1285), 24).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(43, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.isLiteralValue(node1, true);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertEquals(40, node0.getType());
      assertEquals(811116, node0.getSourcePosition());
      
      boolean boolean1 = NodeUtil.isLatin("BZ)[G");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = new Node(1456);
      Node node1 = NodeUtil.numberNode(1, node0);
      assertEquals((-1), node1.getCharno());
      
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertEquals(1456, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("false", string0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2825, (-1933), (-1933)).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
      
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newName(codingConvention0, "", node1);
      assertTrue(node2.isName());
      
      Node node3 = NodeUtil.newVarNode("d-k[(X=", node2);
      assertEquals(0, node3.getCharno());
      assertEquals(118, node3.getType());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(132, (-1), (-1)).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      doReturn(false).when(codingConvention0).isConstantKey(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "undefined.");
      NodeUtil.isStatementBlock(node1);
      assertEquals(2, node1.getChildCount());
      assertFalse(node1.hasOneChild());
      assertEquals(33, node1.getType());
      assertTrue(node1.isGetProp());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(12);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("checkGlobalNames");
      Node node0 = Node.newString("checkGlobalNames");
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      NodeUtil.isSimpleOperator(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getObjectLitKeyName(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected node type: STRING Infinity 198
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("checkGlobalNames");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      NodeUtil.isSimpleOperator(node0);
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
  public void test097()  throws Throwable  {
      Node node0 = new Node((-4038), 500, (-4038));
      NodeUtil.mayHaveSideEffects(node0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node1 = NodeUtil.newName(googleCodingConvention0, "", node0);
      node0.addChildrenToBack(node0);
      Node node2 = null;
      try {
        node2 = new Node(2262, node1, node1, node0, node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("checkGlobalNames");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertNull(string0);
      assertTrue(node0.isScript());
      assertFalse(node0.isNull());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(41).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(26, (-1285), 24).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isExprResult();
      boolean boolean1 = NodeUtil.isPrototypePropertyDeclaration(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Node node0 = new Node((-4038), 500, (-4038));
      NodeUtil.mayHaveSideEffects(node0);
      assertEquals((-4038), node0.getType());
      assertEquals((-1), node0.getLineno());
      
      Node node1 = Node.newNumber((double) 16);
      boolean boolean0 = NodeUtil.isBooleanResultHelper(node1);
      assertEquals((-1), node1.getLineno());
      assertEquals(39, node1.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = Node.newString("checkGlobalNames");
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(node0.isName());
      
      boolean boolean1 = NodeUtil.isVarDeclaration(node0);
      assertTrue(node0.isString());
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(17, 50, 86).when(node0).getType();
      // Undeclared exception!
      try { 
        NodeUtil.mayHaveSideEffects(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
      Node node1 = NodeUtil.numberNode(1, node0);
      assertEquals((-1), node1.getCharno());
      assertFalse(node1.hasChildren());
      
      boolean boolean0 = NodeUtil.isLiteralValue(node0, false);
      assertEquals(83, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      node0.setLineno(2752);
      assertEquals(2752, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Node node0 = Node.newString("g", 16, 1);
      node0.setLineno(4095);
      assertEquals(4095, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Node node0 = new Node(30, 2, 54);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertTrue(node0.isNew());
      assertEquals(8246, node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(121, 43, 121, 121, 43).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      String string0 = NodeUtil.opToStr(4677);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(115, (-1974), (-1974)).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 16, 8);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", byteArrayInputStream0).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newName(codingConvention0, "", node1);
      boolean boolean0 = NodeUtil.mayBeString(node2);
      assertEquals(0, node2.getCharno());
      assertTrue(node2.isName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = new Node((-3220), node0, node0, node0, node0);
      assertTrue(node1.hasOneChild());
      assertEquals((-3220), node1.getType());
      
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Node node0 = new Node((-4038), 500, (-4038));
      NodeUtil.mayHaveSideEffects(node0);
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node1 = peepholeRemoveDeadCode0.tryOptimizeBlock(node0);
      assertEquals((-1), node1.getLineno());
      assertEquals((-4038), node1.getType());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(103, 103, 16).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      NodeUtil.getSourceFile(node0);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertEquals(811116, node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Node node0 = Node.newString("checkGlobalNames");
      NodeUtil.isSimpleOperator(node0);
      String string0 = NodeUtil.opToStr(41);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Node node0 = new Node(30, 2, 54);
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
  public void test117()  throws Throwable  {
      Node node0 = new Node((-651), (-651), (-651));
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -651
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Node node0 = new Node(1456);
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertEquals(1456, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      assertFalse(node0.isGetProp());
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals(811116, node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(26, (-1314), 24).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      // Undeclared exception!
      try { 
        NodeUtil.precedence((-1192));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1192
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(132, (-1), (-1)).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      doReturn(false).when(codingConvention0).isConstantKey(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "undefined.");
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertTrue(boolean0);
      assertFalse(node1.isString());
      assertEquals(33, node1.getType());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodePARAM_LIST
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      boolean boolean1 = NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      assertTrue(boolean1 == boolean0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      Node node0 = Node.newString("Infinity", 198, 108);
      NodeUtil.isSimpleOperator(node0);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertEquals(811116, node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isAssociative(32);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("Infinity");
      assertNotNull(double0);
      assertEquals(Double.POSITIVE_INFINITY, (double)double0, 0.01);
  }
}
