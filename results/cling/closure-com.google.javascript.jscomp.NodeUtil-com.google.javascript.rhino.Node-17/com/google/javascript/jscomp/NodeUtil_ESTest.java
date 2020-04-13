/*

 * Tue Mar 03 19:27:30 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = new Node(4095, node0, node0, node0);
      boolean boolean0 = NodeUtil.isVarOrSimpleAssignLhs(node0, node1);
      assertEquals(4095, node1.getType());
      assertFalse(boolean0);
      assertFalse(node1.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = node0.cloneTree();
      assertNotSame(node1, node0);
      assertEquals(44, node1.getType());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn("com.google.javascript.jscomp.FunctionNames$FunctionExpressionNamer").when(node0).getSourceFileName();
      String string0 = NodeUtil.getSourceName(node0);
      assertNotNull(string0);
      assertEquals("com.google.javascript.jscomp.FunctionNames$FunctionExpressionNamer", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Node node0 = Node.newNumber((double) 152, 152, 152);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      closureCodingConvention0.extractClassNameIfRequire(node0, node0);
      assertEquals(622744, node0.getSourcePosition());
      assertTrue(node0.isNumber());
      assertEquals(152, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode((-822.75622034001), node0);
      // Undeclared exception!
      try { 
        node1.useSourceInfoIfMissingFrom((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("j2(@YV[](|]");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      NodeUtil.getLoopCodeBlock(node0);
      assertFalse(node0.isIn());
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("j2(@YV[](|]");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertFalse(boolean0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-730), 9).when(node0).getType();
      boolean boolean0 = NodeUtil.isNumericResult(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(889);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 889
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Node node0 = Node.newNumber((double) 3);
      Node node1 = new Node(3, node0, node0);
      assertEquals(3, node1.getType());
      assertEquals((-1), node1.getLineno());
      assertTrue(node1.hasOneChild());
      
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getPureBooleanValue(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
      assertFalse(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("j2(@YV[](|]");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn((Node) null).when(node0).getNext();
      doReturn(false).when(node0).isName();
      doReturn((String) null).when(node0).toString();
      Node node1 = new Node(4095, node0, node0, node0);
      assertFalse(node1.isName());
      assertFalse(node1.hasMoreThanOneChild());
      
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.ALL;
      boolean boolean0 = NodeUtil.isNameReferenced(node1, (String) null, sourceMap_DetailLevel0);
      assertFalse(boolean0);
      assertEquals(4095, node1.getType());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = Node.newNumber((double) 3);
      assertFalse(node0.isExprResult());
      
      boolean boolean0 = NodeUtil.isExprAssign(node0);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.isImmutableValue(node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).hasChildren();
      doReturn(true).when(node0).isBlock();
      boolean boolean0 = NodeUtil.hasCatchHandler(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = Node.newNumber((double) 24, 24, (-1528));
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("j2(@YV[](|]");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertNull(string0);
      assertTrue(node0.isScript());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test018()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertFalse(node0.isFunction());
      
      boolean boolean1 = NodeUtil.isFunctionDeclaration(node0);
      assertEquals(38, node0.getType());
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
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
  public void test020()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      NodeUtil.NumbericResultPredicate nodeUtil_NumbericResultPredicate0 = new NodeUtil.NumbericResultPredicate();
      boolean boolean0 = nodeUtil_NumbericResultPredicate0.apply(node0);
      assertFalse(boolean0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("", (Node) null);
      // Undeclared exception!
      try { 
        node0.clonePropsFrom((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("j2(@YV[](|]");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      // Undeclared exception!
      try { 
        node0.clonePropsFrom(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Node has existing properties.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "charAt");
      NodeUtil.getStringValue(node0);
      assertEquals(38, node0.getType());
      assertFalse(node0.isGetElem());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile((Node) null);
      assertNull(staticSourceFile0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "Not an assignment op:", node0, "JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      // Undeclared exception!
      try { 
        NodeUtil.isVarDeclaration(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 12, sourceMap_DetailLevel0);
      assertEquals(38, node0.getType());
      assertFalse(node0.isCall());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.jstype.ErrorFunctionType").when(node0).getString();
      doReturn(2829).when(node0).getType();
      doReturn(false).when(node0).isGetProp();
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
  public void test028()  throws Throwable  {
      Node node0 = Node.newString(125, "CONSTANTS_ONLY");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertEquals(125, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isFunction();
      doReturn(false).when(node0).isVar();
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 0, nodeUtil_MatchDeclaration0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(node0).isFunction();
      // Undeclared exception!
      try { 
        NodeUtil.getNearestFunctionName(node0);
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
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      boolean boolean1 = NodeUtil.isNameReferenced(node0, "E7qA/", sourceMap_DetailLevel0);
      assertFalse(node0.isNew());
      assertTrue(node0.isName());
      assertFalse(node0.isCall());
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(54);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isGet(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      CodingConvention codingConvention1 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention1).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention1, "Not an assignment op:", node0, "JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      assertEquals((-1), node1.getCharno());
      
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertEquals(38, node0.getType());
      assertTrue(node0.isName());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "charAt");
      NodeUtil.copyNameAnnotations(node0, node0);
      assertTrue(node0.isName());
      assertFalse(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) jqueryCodingConvention0, "<r ]/@Lq]rERQ.O-Y", node0, "<r ]/@Lq]rERQ.O-Y");
      NodeUtil.copyNameAnnotations(node1, node1);
      assertEquals(33, node1.getType());
      assertTrue(node1.hasMoreThanOneChild());
      assertEquals(0, node1.getCharno());
      assertEquals(2, node1.getChildCount());
      assertEquals(0, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(13, 13).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node1).isFunction();
      doReturn(false).when(node1).isName();
      NodeUtil.redeclareVarsInsideBranch(node1);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Node node0 = Node.newNumber((double) 3);
      NodeUtil.isImmutableValue(node0);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertFalse(boolean0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("jF(@YVr2G](u^:]");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      node0.setType(20);
      NodeUtil.getInputId(node0);
      assertEquals(20, node0.getType());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Node node0 = Node.newNumber((double) 144, 144, 144);
      String string0 = NodeUtil.getSourceName(node0);
      assertEquals(589968, node0.getSourcePosition());
      assertEquals(39, node0.getType());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      CodingConvention codingConvention1 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention1).isConstant(anyString());
      node0.addChildToFront(node0);
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention1, "Not an assignment op:", node0, "JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      node1.isEquivalentTo(node0);
      assertEquals(0, node1.getChildCount());
      
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertEquals(1, node0.getChildCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) closureCodingConvention0, "Not an assignment op:", node0, "JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Node node2 = node1.copyInformationFrom(node0);
      assertEquals(38, node2.getType());
      assertEquals((-1), node2.getLineno());
      
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = node0.removeChildren();
      assertNull(node1);
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      assertEquals((-1), node1.getLineno());
      assertEquals(122, node1.getType());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      String string0 = NodeUtil.opToStr(31);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = Node.newString(543, "n}u");
      // Undeclared exception!
      try { 
        node0.setSideEffectFlags(54);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 543
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node node0 = Node.newNumber((double) 144, 144, 144);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:NUMBER 144.0 144
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = new Node(30, node0, node0, node0);
      boolean boolean0 = node1.isUnscopedQualifiedName();
      assertFalse(boolean0);
      assertTrue(node1.hasOneChild());
      assertEquals(30, node1.getType());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getFirstChild();
      doReturn(false).when(node1).isFunction();
      doReturn(false).when(node1).isName();
      NodeUtil.redeclareVarsInsideBranch(node1);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected CALL node, got NAME
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
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
  public void test052()  throws Throwable  {
      Node node0 = new Node(130);
      node0.setType(130);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(node1).isScript();
      InputId inputId0 = NodeUtil.getInputId(node1);
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("com.google.javascript.jscomp.NodeUtil");
      assertEquals(Double.NaN, (double)double0, 0.01);
      assertNotNull(double0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn((Node) null).when(node0).getNext();
      doReturn(false).when(node0).isFunction();
      doReturn(false).when(node0).isName();
      doReturn((String) null).when(node0).toString();
      Node node1 = new Node(4095, node0, node0, node0);
      assertTrue(node1.hasOneChild());
      
      NodeUtil.redeclareVarsInsideBranch(node1);
      assertFalse(node1.isName());
      assertFalse(node1.isFunction());
      assertEquals(4095, node1.getType());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
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
  public void test056()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertFalse(boolean0);
      assertFalse(node0.isFor());
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      int int0 = NodeUtil.getInverseOperator(35);
      assertEquals((-1), int0);
      
      Node node1 = new Node(53, node0, node0);
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(53, node1.getType());
      assertEquals(43, node0.getType());
      assertFalse(node1.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.mayHaveSideEffects(node0);
      boolean boolean0 = NodeUtil.isEmptyBlock(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) jqueryCodingConvention0, "<r ]/@Lq]rERQ.O-Y", node0, "<r ]/@Lq]rERQ.O-Y");
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      NodeUtil.evaluatesToLocalValue(node1, nodeUtil_MatchShallowStatement0);
      NodeUtil.getNearestFunctionName(node1);
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isGetProp());
      assertTrue(node1.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
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
  public void test061()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst("jF(@YVr2G](u^:]");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      Locale locale0 = Locale.GERMAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      NodeUtil.isValidDefineValue(node0, set0);
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      boolean boolean0 = NodeUtil.has(node0, nodeUtil_MatchShallowStatement0, nodeUtil_MatchShallowStatement0);
      assertTrue(boolean0);
      assertTrue(node0.isScript());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "charAt");
      boolean boolean0 = node0.isOnlyModifiesThisCall();
      assertFalse(boolean0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = Node.newNumber((double) 152, 152, 152);
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals(622744, node0.getSourcePosition());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      boolean boolean0 = NodeUtil.isRelationalOperation(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
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
  public void test066()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getCharno());
      
      boolean boolean0 = NodeUtil.isValidQualifiedName("c[<.-sv&uW$_FGxa");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
      
      int int0 = NodeUtil.getInverseOperator(38);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
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
  public void test069()  throws Throwable  {
      Node node0 = Node.newString(543, "n}u");
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(543, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
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
  public void test071()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(128).when(node0).getType();
      NodeUtil.isImmutableValue(node0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Object object0 = new Object();
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", object0).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newName(codingConvention0, "", node1, "");
      Node[] nodeArray0 = new Node[1];
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node2, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(node0).getProp(anyInt());
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) jqueryCodingConvention0, "<r ]/@Lq]rERQ.O-Y", node0, "<r ]/@Lq]rERQ.O-Y");
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node1, nodeUtil_MatchShallowStatement0);
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node1);
      assertEquals(2, node1.getChildCount());
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isGetProp());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
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
  public void test074()  throws Throwable  {
      Node node0 = new Node(144, 144, 144);
      Node node1 = new Node(144, node0, node0, 105, 1);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(45);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchNodeType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 144
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      boolean boolean0 = nodeUtil_BooleanResultPredicate0.apply(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = Node.newNumber(Double.NEGATIVE_INFINITY, (-2), (-416));
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getCharno());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(48);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("The new child node has siblings.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.isSwitchCase(node0);
      assertEquals(44, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode((-822.75622034001), node0);
      NodeUtil.isReferenceName(node1);
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      NodeUtil.evaluatesToLocalValue(node1, nodeUtil_MatchShallowStatement0);
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isNumber());
      assertEquals(39, node1.getType());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.isStatementBlock(node0);
      assertFalse(boolean0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("g>DDKRNi)5X4z|#9XN", object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "g>DDKRNi)5X4z|#9XN", node0, "com.google.common.collect.ImmutableMultimap$EntryCollection");
      NodeUtil.isPrototypeProperty(node1);
      assertEquals(0, node1.getCharno());
      assertEquals(38, node1.getType());
      assertEquals(0, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      node0.setVarArgs(false);
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = new Node(4095, node0, node0, node0);
      Node node2 = new Node((-224));
      node2.addChildrenToBack(node1);
      assertTrue(node2.hasChildren());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertFalse(boolean1);
      assertTrue(node0.isName());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("kjVce").when(node0).toString();
      Node node1 = new Node(30, node0, node0, node0);
      node1.addChildrenToBack(node1);
      assertFalse(node1.hasOneChild());
      assertEquals(2, node1.getChildCount());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isExprResult();
      NodeUtil.isPrototypePropertyDeclaration(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(node1).getProp(anyInt());
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node2 = NodeUtil.newQualifiedNameNode((CodingConvention) jqueryCodingConvention0, "<r ]/@Lq]rERQ.O-Y", node1, "<r ]/@Lq]rERQ.O-Y");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node2);
      assertEquals(2, node2.getChildCount());
      assertEquals(0, node2.getCharno());
      assertEquals(33, node2.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "tUS@c<~Ph$>,8<?{s", node0, "tUS@c<~Ph$>,8<?{s");
      Predicate<Node> predicate0 = PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE;
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.isSimpleOperator(node1);
      assertFalse(node0.isFalse());
      assertEquals(38, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE;
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "Not an assignment op:", node0, "JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.isConstantName(node1);
      assertTrue(boolean0);
      assertEquals((-1), node1.getCharno());
      assertTrue(node1.isName());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      node0.addSuppression("R");
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isFunction();
      NodeUtil.getNearestFunctionName(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(114, 0, 0).when(node1).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1, (AbstractCompiler) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      boolean boolean0 = NodeUtil.mayBeString(node1);
      assertFalse(boolean0);
      assertTrue(node1.isVoid());
      assertTrue(node0.isTrue());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      NodeUtil.isStrWhiteSpaceChar(4095);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "Not an assignment op:", node0, "JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      assertEquals(38, node1.getType());
      assertEquals(44, node0.getType());
      assertEquals((-1), node1.getLineno());
      
      int int0 = NodeUtil.getInverseOperator(38);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      boolean boolean0 = node0.isEquivalentTo(node0);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean1 = NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(0, node0.getChildCount());
      assertEquals(38, node0.getType());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(7);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 7
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int int0 = NodeUtil.precedence(29);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = new Node(16, node0, node0, node0, node0);
      assertEquals(16, node1.getType());
      
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertEquals(44, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.isConstantName(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(13, 13).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(87, 29).when(node1).getType();
      boolean boolean1 = NodeUtil.isBooleanResult(node1);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "Not an assignment op:", node0, "JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "Not an assignment op:");
      // Undeclared exception!
      try { 
        node1.appendStringTree(charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:TRUE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("", object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "", node0, "");
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node1;
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node1, nodeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      assertTrue(node0.isName());
      
      Node node1 = NodeUtil.newVarNode("", node0);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      NodeUtil.containsType(node1, (-807), sourceMap_DetailLevel0);
      assertTrue(node1.isVar());
      assertFalse(node1.isName());
      assertFalse(node1.isFunction());
      assertFalse(node1.isNew());
      assertEquals((-1), node1.getCharno());
      assertEquals(118, node1.getType());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      NodeUtil.opToStr(41);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode((-822.75622034001), node0);
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      NodeUtil.evaluatesToLocalValue(node1, nodeUtil_MatchShallowStatement0);
      assertEquals(39, node1.getType());
      assertEquals(0, node1.getSourcePosition());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertFalse(boolean0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertFalse(node0.isGetProp());
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getCharno());
      
      boolean boolean0 = NodeUtil.isCommutative(37);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
      
      boolean boolean0 = NodeUtil.isValidQualifiedName("JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "Not an assignment op:", node0, "JSC_CANNOT_USE_PROTOTYPE_AND_VAR");
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean0 = NodeUtil.mayBeString(node1);
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(38, node1.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, predicate0);
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean1 == boolean0);
      assertTrue(node0.isName());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      NodeUtil.evaluatesToLocalValue(node0, predicate0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
      
      boolean boolean0 = NodeUtil.isAssociative(4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("Y");
      assertEquals(Double.NaN, (double)double0, 0.01);
      assertNotNull(double0);
  }
}
