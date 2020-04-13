/*

 * Tue Mar 03 19:22:13 GMT 2020
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
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeCollectPropertyAssignments;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.ReorderConstantExpression;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.JSDocInfo;
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
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = Node.newString("DqMr");
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
  public void test002()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isExprCall(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isPrototypeProperty(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertFalse(node0.isGetElem());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("o@jc{%)N[C").when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2389).when(node0).getType();
      Node node1 = NodeUtil.getLoopCodeBlock(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-1496), 4095, (-1496)).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node1).getChildCount();
      doReturn(true).when(node1).isFor();
      boolean boolean1 = NodeUtil.isForIn(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getPureBooleanValue(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isFalse());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Node node0 = Node.newString("M|up)Wy.w0D|x#W h4A", (-995), 118);
      NodeUtil.isImmutableValue(node0);
      boolean boolean0 = node0.isOptionalArg();
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = NodeUtil.getSourceName((Node) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(node0).getString();
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isConstantByConvention(codingConvention0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isGetProp());
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(object0, object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode(0.0, node0);
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node1, (AbstractCompiler) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NEW node, got NUMBER
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = Node.newString(114, "q", 65377, 65377);
      assertEquals(267788287, node0.getSourcePosition());
      assertEquals(114, node0.getType());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(14, 1126, 1126).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node2 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      Node node3 = new Node(114, node2, node1);
      assertTrue(node3.isDo());
      assertEquals((-1), node3.getCharno());
      assertFalse(node3.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      // Undeclared exception!
      try { 
        node0.getExistingIntProp(32);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // missing prop: 32
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = Node.newString("undefined", (-1676), 2493);
      // Undeclared exception!
      try { 
        NodeUtil.getConditionExpression(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // STRING undefined does not have a condition.
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Node node0 = Node.newString("DqMr");
      SourceFile sourceFile0 = SourceFile.fromFile("DqMr");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(sourceFile0).when(node1).getStaticSourceFile();
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile(node1);
      assertNotNull(staticSourceFile0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isThis());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
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
  public void test019()  throws Throwable  {
      Node node0 = Node.newString(51, "ggPD5Cwd9", (-2236), 118);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      boolean boolean1 = NodeUtil.isNumericResultHelper(node0);
      assertEquals(51, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean1 == boolean0);
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = NodeUtil.BOOLEAN_RESULT_PREDICATE;
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, (-4745), nodeUtil_BooleanResultPredicate0);
      assertEquals(0, int0);
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(30).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Node node0 = Node.newNumber((double) 14);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      boolean boolean0 = NodeUtil.has(node0, nodeUtil_BooleanResultPredicate0, nodeUtil_BooleanResultPredicate0);
      assertFalse(boolean0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(14, 1126, 1126).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      Node node1 = Node.newNumber((double) 14);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node1, (-1172));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Node node0 = Node.newString("?2W'Yv", 112, 112);
      int int0 = node0.getLength();
      assertEquals(0, int0);
      
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(458864, node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = new Node(151, (-1468), 136);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0, node0).when(node1).getParent();
      doReturn(152).when(node1).getType();
      doReturn(true).when(node1).isGetProp();
      Node node2 = NodeUtil.getBestLValueOwner(node1);
      assertEquals(151, node2.getType());
      assertNotNull(node2);
      assertEquals((-1), node2.getLineno());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(40);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(131, 969, 131).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = new Node((-848), 40, 53);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(false).when(node1).isName();
      int int0 = NodeUtil.getNameReferenceCount(node1, "G]P+WZqg]v");
      assertEquals(0, int0);
      assertEquals((-848), node0.getType());
      assertEquals(163893, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, (Node) null).when(node0).getFirstChild();
      doReturn(118).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Node node0 = Node.newString("M|up)Wy.w0D|x#W h4A", (-995), 118);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(118).when(node1).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node1, abstractCompiler0);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(object0, object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode(0.0, node0);
      node1.detachChildren();
      assertEquals(0, node1.getSourcePosition());
      assertTrue(node1.isNumber());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getLastChild();
      doReturn("K3/[c]DcfP09|S2Q").when(node0).getString();
      doReturn(50).when(node0).getType();
      doReturn(true).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isConstantByConvention(codingConvention0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = new Node(2);
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
  public void test035()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.has(node0, predicate0, predicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.containsCall(node0);
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(21);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(14, 1126, 1126).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getParent();
      doReturn(true).when(node1).isFunction();
      doReturn(true).when(node1).isName();
      NodeUtil.redeclareVarsInsideBranch(node1);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = new Node(151, (-1468), 136);
      boolean boolean0 = NodeUtil.isNullOrUndefined(node0);
      assertEquals(151, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.isNullOrUndefined(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(47).when(node0).getType();
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getSideEffectFlags();
      doReturn(true).when(node0).isCall();
      boolean boolean0 = NodeUtil.callHasLocalResult(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = Node.newString("DqMr");
      NodeUtil.getInputId(node0);
      assertFalse(node0.isScript());
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      NodeUtil.getPureBooleanValue(node0);
      assertTrue(node0.isParamList());
      assertEquals((-1), node0.getLineno());
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = Node.newString("NaN");
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(40, node0.getType());
      assertEquals("NaN", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = new Node(151, (-1468), 136);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0, node0).when(node1).getParent();
      doReturn(152, 38, 2493, 44).when(node1).getType();
      doReturn(true).when(node1).isGetProp();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node1, abstractCompiler0);
      Node node2 = NodeUtil.getBestLValueOwner(node1);
      assertEquals((-1), node2.getLineno());
      assertEquals(151, node2.getType());
      assertNotNull(node2);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("*=", "*=", "*=", "*=").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newUndefinedNode(node0);
      // Undeclared exception!
      try { 
        node1.setSideEffectFlags(36);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // setIsNoSideEffectsCall only supports CALL and NEW nodes, got VOID
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSDocInfo) null).when(node0).getJSDocInfo();
      doReturn(true, false).when(node0).isFunction();
      JSDocInfo jSDocInfo0 = NodeUtil.getFunctionJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CompilerOptions.Reach compilerOptions_Reach0 = CompilerOptions.Reach.NONE;
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(compilerOptions_Reach0, compilerOptions_Reach0).when(node0).getProp(anyInt());
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) null);
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "DkO!#o2Qc@JK(1", node0, "DkO!#o2Qc@JK(1");
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = new Node(3, 3, 3);
      node0.isUnscopedQualifiedName();
      assertEquals(3, node0.getType());
      assertEquals(12291, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Node node0 = Node.newString(43, "second new child has existing parent", 1865, 36);
      node0.removeFirstChild();
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(7639076, node0.getSourcePosition());
      assertEquals(43, node0.getType());
      assertEquals(1865, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isCall();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(true).when(node0).isCall();
      doReturn(false).when(node0).isNoSideEffectsCall();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = new Node(151, (-1468), 136);
      NodeUtil.getVarsDeclaredInBranch(node0);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(40);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = new Node(0, node0, node0, node0, node0, (-1464), 49);
      assertTrue(node0.isFalse());
      assertEquals(0, node1.getType());
      assertEquals((-1), node1.getLineno());
      assertFalse(node1.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertFalse(boolean0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = Node.newString("ulPb&H]jx,er^n", 48, 4095);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn((Node) null).when(node1).getParent();
      doReturn(false).when(node1).isFunction();
      doReturn(true).when(node1).isName();
      NodeUtil.redeclareVarsInsideBranch(node1);
      assertEquals(40, node0.getType());
      assertEquals(200703, node0.getSourcePosition());
      assertFalse(node0.isFunction());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = Node.newString("DqMr");
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = NodeUtil.MAY_BE_STRING_PREDICATE;
      boolean boolean0 = nodeUtil_MayBeStringResultPredicate0.apply(node0);
      assertTrue(boolean0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.newQualifiedNameNode((CodingConvention) null, "com.google.javascript.rhino.jstype.AllType", node0, "3l|r+;J>U4P^IG");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(14, 1126, 1126).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      Node node1 = Node.newNumber((double) 14);
      boolean boolean1 = NodeUtil.isForIn(node1);
      assertEquals((-1), node1.getLineno());
      assertEquals(39, node1.getType());
      assertFalse(boolean1 == boolean0);
      assertFalse(node1.isFor());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      NodeUtil.getInverseOperator(2389);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node1 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      Node node2 = new Node(114, node1, node0);
      assertTrue(node2.hasMoreThanOneChild());
      assertTrue(node2.isDo());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("%=");
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Node node0 = new Node(151, (-1468), 122);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0, (Node) null).when(node1).getParent();
      doReturn(152, 38, 2493, 0).when(node1).getType();
      doReturn(false).when(node1).isGetElem();
      doReturn(false).when(node1).isGetProp();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node1, abstractCompiler0);
      NodeUtil.getBestLValueOwner(node1);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(151, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = new Node(108);
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node0, (Node[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Node node0 = Node.newString((-1701), "undefined");
      boolean boolean0 = node0.isLocalResultCall();
      assertEquals((-1), node0.getLineno());
      assertEquals((-1701), node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSDocInfo) null).when(node0).getJSDocInfo();
      doReturn((Node) null).when(node0).getParent();
      JSDocInfo jSDocInfo0 = NodeUtil.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(42).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(4095).when(node1).getType();
      boolean boolean0 = NodeUtil.isImmutableValue(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isLoopStructure(node0);
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isFalse());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Node node0 = new Node(151, (-1468), 136);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertEquals(151, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(40);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(112);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for DEFAULT_CASE (type 112)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
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
      Node node0 = Node.newString(51, "ggPD5Cwd9", (-2236), 118);
      Node node1 = new Node(32, node0, node0, node0);
      assertEquals(32, node1.getType());
      assertEquals(51, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.isLiteralValue(node0, false);
      boolean boolean0 = NodeUtil.isGet(node0);
      assertFalse(boolean0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = NodeUtil.isLatin("K3/[c]DcfP09|S2Q");
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-1496), 4095, (-1496)).when(node0).getType();
      boolean boolean1 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = new Node(134, (-1471), 122);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0, node0).when(node1).getParent();
      doReturn(152).when(node1).getType();
      doReturn(true).when(node1).isGetProp();
      Node node2 = NodeUtil.getBestLValueOwner(node1);
      assertNotNull(node2);
      
      boolean boolean0 = NodeUtil.isImmutableValue(node2);
      assertEquals(134, node2.getType());
      assertEquals((-1), node2.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals("false", string0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(14, 1126, 1126).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      Node node1 = Node.newNumber((double) 14);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = NodeUtil.MAY_BE_STRING_PREDICATE;
      boolean boolean1 = nodeUtil_MayBeStringResultPredicate0.apply(node1);
      assertEquals((-1), node1.getSourcePosition());
      assertFalse(boolean1 == boolean0);
      assertEquals(39, node1.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Node node0 = new Node(1916, 1916, 1916);
      NodeUtil.isSimpleOperatorType(1293);
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertEquals(1916, node0.getType());
      assertTrue(boolean0);
      assertEquals(7849852, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = new Node(134, (-1471), 122);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.isImmutableValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(134, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = new Node(151, (-1468), 136);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      NodeUtil.getVarsDeclaredInBranch(node0);
      assertFalse(node0.isName());
      assertEquals(151, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isDelProp());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(39);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(36).when(node0).getType();
      boolean boolean1 = NodeUtil.isImmutableValue(node0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(14, 1126, 1126).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertTrue(boolean0);
      
      Node node1 = Node.newNumber((double) 14);
      PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
      Node node2 = peepholeCollectPropertyAssignments0.optimizeSubtree(node1);
      assertFalse(node2.isScript());
      assertEquals((-1), node2.getCharno());
      assertEquals(39, node2.getType());
      assertFalse(node2.isBlock());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = node0.isQualifiedName();
      assertFalse(boolean0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isSwitchCase(node0);
      assertFalse(boolean0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(111);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for CASE (type 111)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = Node.newString(51, "ggPD5Cwd9", (-2236), 118);
      NodeUtil.isImmutableValue(node0);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) closureCodingConvention0, "ggPD5Cwd9", node0, "%=");
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = NodeUtil.MAY_BE_STRING_PREDICATE;
      boolean boolean0 = nodeUtil_MayBeStringResultPredicate0.apply(node1);
      assertEquals(51, node0.getType());
      assertTrue(boolean0);
      assertEquals((-1), node1.getCharno());
      assertTrue(node1.isName());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node1 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      Node node2 = new Node(114, node1, node0);
      assertFalse(node2.isFunction());
      assertTrue(node2.isDo());
      assertEquals((-1), node2.getCharno());
      
      NodeUtil.getNearestFunctionName(node1);
      assertTrue(node1.isParamList());
      assertEquals(83, node1.getType());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = Node.newString(53, "com.google.javascript.rhino.jstype.AllType", 50, 30);
      Node node1 = new Node(1, node0, node0);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(node2).isFunction();
      // Undeclared exception!
      try { 
        NodeUtil.getNearestFunctionName(node2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(41).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(18).when(node1).getType();
      boolean boolean0 = NodeUtil.isImmutableValue(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isExprResult());
      
      boolean boolean0 = NodeUtil.isPrototypePropertyDeclaration(node0);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = Node.newNumber(2350.2, (-48), (-48));
      NodeUtil.isSimpleOperatorType(2);
      boolean boolean0 = NodeUtil.isBooleanResultHelper(node0);
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(86, 86, 86).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
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
      Node node0 = new Node(38, 121, (-371));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(29, 1, 42, (-1680)).when(node1).getType();
      doReturn("").when(node1).toString();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression node
         //  parent:NAME
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("<%");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean0 = nodeUtil_MayBeStringResultPredicate0.apply(node1);
      assertEquals((-1), node1.getLineno());
      assertTrue(node0.isScript());
      assertEquals(122, node1.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = Node.newString("NaN");
      node0.setLineno(86);
      assertEquals(86, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence((-1244));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1244
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node1).getType();
      doReturn((String) null).when(node1).toString();
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("<%");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean1 = nodeUtil_MayBeStringResultPredicate0.apply(node1);
      assertTrue(node0.isScript());
      assertTrue(node1.isVoid());
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node1.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = NodeUtil.newVarNode("length", node0);
      // Undeclared exception!
      try { 
        node1.addChildToBack(node0);
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
      Node node0 = NodeUtil.booleanNode(false);
      assertTrue(node0.isFalse());
      
      Node node1 = NodeUtil.newVarNode("LCD/fhBW M|jB!H_z", node0);
      boolean boolean0 = NodeUtil.containsCall(node1);
      assertFalse(boolean0);
      assertEquals((-1), node1.getCharno());
      assertTrue(node1.isVar());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Node node0 = Node.newNumber(2350.2, (-48), (-48));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(36, 117, 1610612736, 51).when(node1).getType();
      doReturn("MQT}").when(node1).toString();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodeMQT}
         //  parent:NUMBER 2350.2
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Node node0 = new Node(1916, 1916, 1916);
      NodeUtil.isSimpleOperatorType(1293);
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertEquals(7849852, node0.getSourcePosition());
      assertEquals(1916, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("<%");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      NodeUtil.copyNameAnnotations(node0, node0);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(node0.isScript());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ReorderConstantExpression reorderConstantExpression0 = new ReorderConstantExpression();
      Node node0 = Node.newString(43, "second new child has existing parent", 1865, 36);
      Node node1 = reorderConstantExpression0.optimizeSubtree(node0);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node1);
      assertEquals(7639076, node1.getSourcePosition());
      assertTrue(node0.isFalse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1192, 665, 45).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      boolean boolean1 = NodeUtil.isCommutative(43);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Node node0 = Node.newString("?2W'Yv", 112, 112);
      NodeUtil.evaluatesToLocalValue(node0);
      Node node1 = node0.getAncestor(1);
      assertEquals(458864, node0.getSourcePosition());
      assertNull(node1);
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Node node0 = Node.newString(43, "second new child has existing parent", 1865, 36);
      NodeUtil.evaluatesToLocalValue(node0);
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
  public void test111()  throws Throwable  {
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = new Node((-1913), (-1913), 3);
      Node node1 = peepholeSimplifyRegExp0.optimizeSubtree(node0);
      assertEquals((-1), node1.getCharno());
      assertEquals((-1913), node0.getType());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(40).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1192, 665, 45).when(node1).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(14, 1126, 1126).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      boolean boolean1 = NodeUtil.isAssociative(54);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("%a=");
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }
}
