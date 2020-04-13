/*

 * Tue Mar 03 19:27:39 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeCollectPropertyAssignments;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.ReorderConstantExpression;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.io.File;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      NodeUtil.isSimpleOperatorType(36);
      Node node0 = NodeUtil.booleanNode(false);
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
  public void test002()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      Node node1 = NodeUtil.getLoopCodeBlock(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
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
  public void test004()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn((-1719)).when(node0).getType();
      doReturn(false, false).when(node0).isFunction();
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isString());
      
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, (-2024), sourceMap_DetailLevel0);
      assertFalse(node0.isGetElem());
      assertFalse(node0.isCall());
      assertEquals(0, int0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(132, 0, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Node node0 = Node.newString("</ul>");
      assertEquals(40, node0.getType());
      
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) closureCodingConvention0, "com.google.javascript.jscomp.AbstractMessageFormatter", node0, "isDef");
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean0 = NodeUtil.containsType(node1, 57, nodeUtil_MayBeStringResultPredicate0);
      assertFalse(boolean0);
      assertTrue(node1.isGetProp());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
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
  public void test009()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = NodeUtil.newExpr(node1);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node2);
      assertEquals(0, node2.getCharno());
      assertEquals(130, node2.getType());
      assertEquals(38, node1.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      assertFalse(node0.isAssign());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(true).when(node1).isExprResult();
      boolean boolean0 = NodeUtil.isPrototypePropertyDeclaration(node1);
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = NodeUtil.newExpr(node1);
      NodeUtil.isSimpleOperator(node2);
      Node node3 = null;
      try {
        node3 = new Node(54, node1, node2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first new child has existing parent
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Node node0 = Node.newNumber((double) 64);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.isExprAssign(node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Charset charset0 = Charset.defaultCharset();
      SourceFile sourceFile0 = SourceFile.fromFile("vn+]wZxRT ]VBS", charset0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(sourceFile0).when(node1).getStaticSourceFile();
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile(node1);
      assertEquals(44, node0.getType());
      assertNotNull(staticSourceFile0);
      assertEquals((-1), node0.getCharno());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = Node.newString("jP4etAVs)c?2!_", (-1004), 116);
      assertTrue(node1.isString());
      assertEquals((-1), node1.getCharno());
      
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertTrue(node0.isString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.isSimpleOperator(node1);
      node1.addSuppression((String) null);
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(80);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 80
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(38, node0, node0);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node1, abstractCompiler0);
      // Undeclared exception!
      try { 
        NodeUtil.isImmutableValue(node1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NAME is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      doReturn(true, false).when(codingConvention0).isConstantKey(anyString());
      Object object0 = new Object();
      File file0 = new File("jQuery.prototype.extend");
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("jQuery.prototype.extend", object0, jSSourceFile0, jSSourceFile0, object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "jQuery.prototype.extend", node0, "Recorded bad position information\nstart-char: ");
      assertEquals(0, node1.getSourcePosition());
      assertFalse(node1.isString());
      assertEquals(33, node1.getType());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn((StaticSourceFile) null).when(node0).getStaticSourceFile();
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile(node0);
      assertNull(staticSourceFile0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.isLiteralValue(node0, true);
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      int int0 = NodeUtil.getCount(node0, nodeUtil_BooleanResultPredicate0, nodeUtil_BooleanResultPredicate0);
      assertEquals(1, int0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(584);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 584
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Node node0 = Node.newString(",6#Z\"o)8U/]o4]xBc)");
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals(",6#Z\"o)8U/]o4]xBc)", string0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = Node.newString("<<=");
      NodeUtil.copyNameAnnotations(node0, node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(38, node0, node0);
      Node node2 = new Node(51, node1);
      Node node3 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node2).when(node3).getFirstChild();
      doReturn(51).when(node3).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node3, abstractCompiler0);
      assertTrue(node1.isName());
      assertEquals((-1), node1.getLineno());
      assertTrue(boolean0);
      assertFalse(node1.hasMoreThanOneChild());
      assertTrue(node2.isIn());
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = Node.newString(2533, "@nosideeffects may only appear in externs files.", 2532, 64);
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
  public void test028()  throws Throwable  {
      Node node0 = Node.newString("'mul2fz\"Z{B", 124, (-2969));
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
  public void test029()  throws Throwable  {
      String string0 = NodeUtil.opToStrNoFail(45);
      assertEquals("===", string0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator((-2083));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
      Node node0 = Node.newString("'mul2fz\"Z{B", 124, (-2969));
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      DiagnosticType diagnosticType0 = DiagnosticType.make("<Cv;G81tcx8D|J\"cw?", checkLevel0, "+infinity");
      // Undeclared exception!
      try { 
        peepholeCollectPropertyAssignments0.error(diagnosticType0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractPeepholeOptimization", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(51).when(node1).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node1, abstractCompiler0);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertTrue(boolean0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = Node.newString(",6#Z\"o)8U/]o4]xBc)");
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      boolean boolean0 = NodeUtil.isNameReferenced(node1, ",6#Z\"o)8U/]o4]xBc)");
      assertEquals(40, node0.getType());
      assertTrue(boolean0);
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = Node.newString(",6#Z\"o)8U/]o4]xBc)");
      boolean boolean0 = NodeUtil.isVarDeclaration(node0);
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Node node0 = Node.newNumber(4.0, 83, 83);
      NodeUtil.isImmutableValue(node0);
      boolean boolean0 = NodeUtil.isNumericResultHelper(node0);
      assertEquals(340051, node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isExprResult());
      
      NodeUtil.isExprAssign(node0);
      assertTrue(node0.isFalse());
      
      Node node1 = new Node(2);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1);
      assertTrue(boolean0);
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(38, node0, node0);
      Node node2 = new Node(51, node1);
      NodeUtil.isImmutableValue(node2);
      // Undeclared exception!
      try { 
        NodeUtil.canBeSideEffected(node1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NAME is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = new Node(1167);
      // Undeclared exception!
      try { 
        node0.getAncestor((-3155));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      NodeUtil.isValidDefineValue(node1, treeSet0);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction(node1, 87855567);
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
      Node node0 = Node.newString(",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.isPrototypeProperty(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = new Node(1326, (-1515), 5);
      NodeUtil.getInputId(node0);
      assertEquals(1326, node0.getType());
      assertFalse(node0.isScript());
      assertEquals((-1), node0.getCharno());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = Node.newString("</ul>");
      assertTrue(node0.isString());
      
      Node node1 = NodeUtil.newVarNode("U2U_FUNCTION_TYPE", node0);
      assertEquals((-1), node1.getCharno());
      assertTrue(node1.isVar());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("", (Node) null);
      assertTrue(node0.isVar());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      node0.children();
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      NodeUtil.getPureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isExprResult();
      NodeUtil.isExprAssign(node0);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(54);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      NodeUtil.isValidSimpleName("goog.asserts.assertNumber");
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "goog.asserts.assertNumber");
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertEquals(2, node0.getChildCount());
      assertFalse(boolean0);
      assertFalse(node0.isString());
      assertEquals(33, node0.getType());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.getNumberValue(node1);
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node1, (Node[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node.SideEffectFlags node_SideEffectFlags0 = new Node.SideEffectFlags();
      // Undeclared exception!
      try { 
        node0.setSideEffectFlags(node_SideEffectFlags0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // setIsNoSideEffectsCall only supports CALL and NEW nodes, got TRUE
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Node node0 = Node.newString("</ul>");
      assertTrue(node0.isString());
      
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) closureCodingConvention0, "com.google.javascript.jscomp.AbstractMessageFormatter", node0, "isDef");
      boolean boolean0 = NodeUtil.isGet(node1);
      assertTrue(boolean0);
      assertEquals((-1), node1.getCharno());
      assertEquals(2, node1.getChildCount());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSDocInfo) null).when(node0).getJSDocInfo();
      doReturn(true, false).when(node0).isFunction();
      JSDocInfo jSDocInfo0 = NodeUtil.getFunctionJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(jSDocInfo0).when(node0).getJSDocInfo();
      doReturn(true).when(node0).isFunction();
      JSDocInfo jSDocInfo1 = NodeUtil.getFunctionJSDocInfo(node0);
      assertFalse(jSDocInfo1.hasEnumParameterType());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      NodeUtil.isSimpleOperatorType(36);
      Node node0 = NodeUtil.booleanNode(false);
      node0.addSuppression("Jo(v");
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = Node.newString("condition always evaluates to {2}\nleft : {0}\nright: {1}", 84, 65377);
      Node node1 = new Node((-2), node0, node0);
      assertEquals((-2), node1.getType());
      assertEquals((-1), node1.getSourcePosition());
      assertFalse(node1.hasMoreThanOneChild());
      
      Node node2 = node0.detachFromParent();
      assertEquals(348159, node2.getSourcePosition());
      assertEquals(40, node2.getType());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Node node0 = new Node(42);
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0, (AbstractCompiler) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected CALL node, got THIS
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = Node.newNumber((-3124.3), (-1325), (-1325));
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertEquals("-3124.3", string0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = Node.newString(",6#Z\"o)8U/]o4]xBc)");
      boolean boolean0 = NodeUtil.isAssociative((-436));
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertTrue(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = new Node(119, 119, 5);
      Node node1 = new Node((-3006), node0, node0, node0, node0, 137, 2);
      assertEquals(561154, node1.getSourcePosition());
      assertEquals((-3006), node1.getType());
      assertTrue(node1.hasOneChild());
      assertEquals(487429, node0.getSourcePosition());
      assertEquals(119, node0.getType());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(false).when(node1).isFunction();
      doReturn(false).when(node1).isName();
      NodeUtil.getVarsDeclaredInBranch(node1);
      assertEquals(83, node0.getType());
      assertFalse(node0.isNull());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = NodeUtil.newExpr(node1);
      assertTrue(node2.isExprResult());
      assertEquals(0, node2.getSourcePosition());
      
      NodeUtil.isVarDeclaration(node1);
      assertTrue(node1.isName());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = NodeUtil.newExpr(node1);
      NodeUtil.isVarDeclaration(node2);
      assertEquals(0, node2.getCharno());
      assertTrue(node2.isExprResult());
      
      NodeUtil.getNumberValue(node1);
      assertEquals(38, node1.getType());
      assertTrue(node1.isName());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = Node.newNumber((double) 64);
      Node node1 = new Node(64, node0, node0, node0, 54, 119);
      assertEquals(64, node1.getType());
      assertEquals(221303, node1.getSourcePosition());
      
      NodeUtil.getBestLValueOwner(node0);
      assertEquals((-1), node0.getCharno());
      assertEquals(39, node0.getType());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(36);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(51, node0);
      NodeUtil.isImmutableValue(node1);
      node0.setSourceFileForTesting("jP4etAVs)c?2!_");
      // Undeclared exception!
      try { 
        NodeUtil.removeChild(node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid attempt to remove node: STRING jP4etAVs)c?2!_ [source_file: jP4etAVs)c?2!_] of STRING jP4etAVs)c?2!_ [source_file: jP4etAVs)c?2!_]
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = NodeUtil.newExpr(node1);
      NodeUtil.isSimpleOperator(node2);
      node1.isEquivalentTo(node2);
      assertEquals(0, node2.getCharno());
      assertEquals(130, node2.getType());
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(84);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 84
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.getArrayElementStringValue(node1);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      boolean boolean0 = NodeUtil.isValidDefineValue(node1, treeSet0);
      assertFalse(node1.isNull());
      assertEquals(0, node1.getCharno());
      assertEquals(38, node1.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = Node.newString("<<=", 2452, 89);
      NodeUtil.isSimpleOperatorType(29);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:STRING <<= 2452
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals(44, node0.getType());
      assertEquals("true", string0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.isSimpleOperator(node1);
      // Undeclared exception!
      try { 
        node1.clonePropsFrom(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Node has existing properties.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      boolean boolean0 = NodeUtil.isLoopStructure(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "goog.asserts.assertNumber");
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
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
  public void test074()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
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
  public void test075()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidSimpleName("undefined");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1543, 88, 95);
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
  public void test077()  throws Throwable  {
      ReorderConstantExpression reorderConstantExpression0 = new ReorderConstantExpression();
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = reorderConstantExpression0.optimizeSubtree(node0);
      assertEquals((-1), node1.getLineno());
      assertEquals(43, node1.getType());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.isSimpleOperator(node1);
      boolean boolean0 = NodeUtil.mayBeString(node1);
      assertEquals(0, node1.getCharno());
      assertTrue(boolean0);
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      assertFalse(node0.isFunction());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(36);
      assertFalse(boolean0);
      
      NodeUtil.getNearestFunctionName(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(38, node0, node0);
      Node node2 = new Node(51, node1);
      NodeUtil.isImmutableValue(node0);
      // Undeclared exception!
      try { 
        NodeUtil.removeChild(node0, node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid attempt to remove node: NAME of STRING jP4etAVs)c?2!_
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Node node0 = Node.newNumber((double) 64);
      Node node1 = new Node(64, node0, node0, node0, 54, 119);
      assertEquals(221303, node1.getSourcePosition());
      assertTrue(node1.isObjectLit());
      
      NodeUtil.getBestLValueOwner(node0);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertFalse(node0.isGetElem());
      assertTrue(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(8, 50, 51).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = Node.newNumber(46.72297119);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node1, 0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      try { 
        node1.getDouble();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NAME ,6#Z\"o)8U/]o4]xBc) 0 [originalname: ,6#Z\"o)8U/]o4]xBc)] [is_constant_name: 1] [source_file: ,6#Z\"o)8U/]o4]xBc)] is not a number node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node1).getType();
      boolean boolean1 = NodeUtil.isImmutableValue(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      boolean boolean0 = NodeUtil.isForIn(node1);
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      node1.detachChildren();
      boolean boolean0 = NodeUtil.isSimpleOperator(node1);
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = NodeUtil.newExpr(node1);
      NodeUtil.isSimpleOperator(node2);
      // Undeclared exception!
      try { 
        node2.removeChildAfter(node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no next sibling.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Node node0 = new Node(42);
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      int int0 = NodeUtil.getCount(node0, nodeUtil_BooleanResultPredicate0, nodeUtil_BooleanResultPredicate0);
      assertEquals(0, int0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isThis());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-2922), (-2922), (-2922)).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertTrue(boolean0);
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getFirstChild();
      doReturn(154).when(node1).getType();
      boolean boolean1 = NodeUtil.mayEffectMutableState(node1);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Node.newString("jP4etAVs)c?2!_", (-1004), 116);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(36);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = Node.newNumber((-3124.3), (-1325), (-1325));
      NodeUtil.getPureBooleanValue(node0);
      assertEquals(39, node0.getType());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = Node.newString(48, "jP4etAVs)c?2!_");
      NodeUtil.isImmutableValue(node0);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertEquals(48, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Node node0 = Node.newString(",6#Z\"o)8U/]o4]xBc)");
      assertFalse(node0.isName());
      
      boolean boolean0 = NodeUtil.isVarDeclaration(node0);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      boolean boolean1 = NodeUtil.isValidDefineValue(node0, treeSet0);
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = NodeUtil.newExpr(node1);
      NodeUtil.isVarDeclaration(node2);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      boolean boolean0 = NodeUtil.isValidDefineValue(node2, treeSet0);
      assertTrue(node1.isName());
      assertTrue(node2.isExprResult());
      assertEquals(0, node2.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.isSimpleOperator(node1);
      NodeUtil.getArrayElementStringValue(node1);
      assertFalse(node1.isEmpty());
      assertEquals(0, node1.getSourcePosition());
      assertEquals(38, node1.getType());
      assertTrue(node1.isName());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(657, 101, (-1449)).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(38, node0, node0);
      assertFalse(node1.isFunction());
      
      NodeUtil.getNearestFunctionName(node1);
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(38, node1.getType());
      assertTrue(node0.isString());
      assertTrue(node1.isName());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, abstractCompiler0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isExprResult();
      boolean boolean1 = NodeUtil.isPrototypePropertyDeclaration(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(8, 50, 51).when(node0).getType();
      NodeUtil.mayEffectMutableState(node0);
      // Undeclared exception!
      try { 
        NodeUtil.precedence(107);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 107
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = Node.newNumber((double) 64);
      Node node1 = new Node(64, node0, node0, node0, 54, 119);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getFirstChild();
      doReturn(64).when(node2).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node2, abstractCompiler0);
      assertTrue(node1.isObjectLit());
      assertEquals(221303, node1.getSourcePosition());
      assertEquals(39, node0.getType());
      assertTrue(node1.hasOneChild());
      assertEquals((-1), node0.getCharno());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(36);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = NodeUtil.newExpr(node1);
      assertFalse(node2.isName());
      
      NodeUtil.isVarDeclaration(node2);
      boolean boolean0 = NodeUtil.isSimpleOperator(node2);
      assertTrue(node1.isName());
      assertTrue(node2.isExprResult());
      assertEquals(0, node2.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = Node.newNumber((double) 64);
      Node node1 = new Node(64, node0, node0, node0, 54, 119);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getFirstChild();
      doReturn(64).when(node2).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node2, abstractCompiler0);
      assertEquals(221303, node1.getSourcePosition());
      assertFalse(boolean0);
      assertEquals(64, node1.getType());
      
      boolean boolean1 = NodeUtil.isImmutableValue(node0);
      assertTrue(boolean1);
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(38, node0, node0);
      NodeUtil.isSimpleOperatorType(36);
      // Undeclared exception!
      try { 
        NodeUtil.canBeSideEffected(node1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NAME is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(51, node0);
      node0.setSourceFileForTesting("jP4etAVs)c?2!_");
      NodeUtil.isSimpleOperatorType(36);
      // Undeclared exception!
      try { 
        NodeUtil.removeChild(node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid attempt to remove node: STRING jP4etAVs)c?2!_ [source_file: jP4etAVs)c?2!_] of STRING jP4etAVs)c?2!_ [source_file: jP4etAVs)c?2!_]
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      Node node2 = Node.newString(",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.isSimpleOperator(node2);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction(node1, 87855567);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail((-3687));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -3687
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
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
  public void test108()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-2922), (-2922), (-2922)).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertTrue(boolean0);
      
      Node node1 = Node.newString(48, "9Sw");
      assertFalse(node1.isGetProp());
      
      NodeUtil.getPrototypeClassName(node1);
      assertEquals(48, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(8, 50, 51).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      boolean boolean1 = NodeUtil.isCommutative(40);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Node node0 = Node.newString("jP4etAVs)c?2!_");
      Node node1 = new Node(51, node0);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node1, abstractCompiler0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
      assertEquals(51, node1.getType());
      assertEquals((-1), node1.getCharno());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(36);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(node1).getType();
      doReturn(false).when(node1).isNull();
      boolean boolean1 = NodeUtil.mayBeString(node1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = new Node(2);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1);
      boolean boolean1 = NodeUtil.mayBeString(node0);
      assertEquals(43, node0.getType());
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "goog.asserts.assertNumber");
      NodeUtil.mayEffectMutableState(node0);
      Node node1 = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, node0);
      assertTrue(node0.isGetProp());
      assertEquals(29, node1.getType());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(",6#Z\"o)8U/]o4]xBc)", ",6#Z\"o)8U/]o4]xBc)").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, ",6#Z\"o)8U/]o4]xBc)", node0, ",6#Z\"o)8U/]o4]xBc)");
      NodeUtil.isAssociative((-436));
      boolean boolean0 = NodeUtil.isSimpleOperator(node1);
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1298, 41).when(node0).getType();
      doReturn(false).when(node0).isEmpty();
      doReturn(false).when(node0).isNull();
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("w!LGj+Ihb;c");
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }
}
