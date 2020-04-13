/*

 * Tue Mar 03 19:25:07 GMT 2020
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
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.ReorderConstantExpression;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
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
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.getPureBooleanValue(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = new Node(29);
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertEquals(29, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getLoopCodeBlock(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getCharno());
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
      int int0 = NodeUtil.precedence(47);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = new Node(86);
      try { 
        node0.setString("&&");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // ASSIGN is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isImmutableValue(node0);
      try { 
        node0.getString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // FALSE is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn((String) null).when(node0).getSourceFileName();
      String string0 = NodeUtil.getSourceName(node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Node node0 = Node.newString("P\"", (-1254), (-1254));
      node0.addChildToFront(node0);
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isRegExp());
      
      Node node1 = NodeUtil.newVarNode("n!&:", node0);
      NodeUtil.isNameReferenced(node1, "");
      assertTrue(node1.isVar());
      assertEquals(0, node0.getChildCount());
      assertEquals((-1), node1.getLineno());
      assertEquals(118, node1.getType());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(node0).getType();
      boolean boolean0 = NodeUtil.isNumericResultHelper(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Node node0 = Node.newString(102, "Fh\"ny%1!$QH3NL");
      node0.putIntProp(102, 120);
      node0.addSuppression("GET_BOOLEAN");
      assertTrue(node0.isInc());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Node node0 = Node.newString(395, "", 395, 65136);
      assertEquals(1622015, node0.getSourcePosition());
      assertEquals(395, node0.getType());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-307), (-307), (-1811));
      Node node1 = new Node(2, node0, node0, 50, 36);
      assertEquals(204836, node1.getSourcePosition());
      assertEquals(39, node0.getType());
      assertEquals(2, node1.getType());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(29);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = new Node(929);
      assertFalse(node0.isExprResult());
      
      NodeUtil.isExprAssign(node0);
      boolean boolean0 = NodeUtil.isLiteralValue(node0, true);
      assertFalse(boolean0);
      assertEquals(929, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(true).when(node0).hasChildren();
      doReturn(true).when(node0).isBlock();
      // Undeclared exception!
      try { 
        NodeUtil.hasCatchHandler(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).hasChildren();
      doReturn(true).when(node0).isBlock();
      boolean boolean0 = NodeUtil.hasCatchHandler(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Node node0 = Node.newString("F,");
      // Undeclared exception!
      try { 
        node0.getExistingIntProp((-3076));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // missing prop: -3076
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Node node0 = new Node(75, 888, 888);
      NodeUtil.redeclareVarsInsideBranch(node0);
      assertEquals(3638136, node0.getSourcePosition());
      assertEquals(75, node0.getType());
      assertFalse(node0.isFunction());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(102, 92, 89, 40, 407).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
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
  public void test021()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(16, 45).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Node node0 = Node.newString(115, "Fh\"ny%1!$QH3NL");
      NodeUtil.isNumericResult(node0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodeFOR Fh\"ny%1!$QH3NL
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Double) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode((-43.8794776), node0);
      assertFalse(node1.isName());
      
      NodeUtil.isVarDeclaration(node1);
      assertEquals(0, node1.getSourcePosition());
      assertEquals(39, node1.getType());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(0).when(node0).getType();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, 0, predicate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(35).when(node0).getType();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getNodeTypeReferenceCount(node0, (-1780), predicate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Node node0 = Node.newString(102, "Fh\"ny%1!$QH3NL");
      // Undeclared exception!
      try { 
        node0.addChildAfter(node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.containsType(node0, 44, predicate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-4279), 4, 30, 36, 0).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = Node.newString(37, ".");
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node0, 22);
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
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isCall());
      
      boolean boolean0 = NodeUtil.isFunctionObjectCall(node0);
      assertFalse(boolean0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Node node1 = NodeUtil.newVarNode("new:", node0);
      int int0 = NodeUtil.getNameReferenceCount(node1, "first new child has existing sibling");
      assertEquals(0, int0);
      assertEquals(118, node1.getType());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Node node0 = Node.newString("xj(f~fZF1._2)");
      NodeUtil.copyNameAnnotations(node0, node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Node node0 = Node.newString("P\"", (-1254), (-1254));
      Node node1 = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, node0);
      assertEquals(40, node0.getType());
      assertEquals(29, node1.getType());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isImmutableValue(node0);
      boolean boolean0 = NodeUtil.isBooleanResult(node0);
      assertTrue(boolean0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Node node0 = new Node(29);
      NodeUtil.getNumberValue(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(29, node0.getType());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Node node0 = new Node(29, 29, 401);
      boolean boolean0 = NodeUtil.isGet(node0);
      assertEquals(29, node0.getType());
      assertFalse(boolean0);
      assertEquals(119185, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = Node.newNumber((-3172.899756775392));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(node0, node0).when(node1).getParent();
      doReturn(108).when(node1).getType();
      doReturn(true).when(node1).isGetProp();
      Node node2 = NodeUtil.getBestLValueOwner(node1);
      assertEquals((-1), node2.getCharno());
      assertEquals(39, node2.getType());
      assertNotNull(node2);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isImmutableValue(node0);
      boolean boolean0 = NodeUtil.isExprCall(node0);
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      Predicate<Node> predicate0 = PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE;
      boolean boolean0 = NodeUtil.has(node0, predicate0, predicate0);
      assertEquals(43, node0.getType());
      assertTrue(boolean0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = Node.newNumber(32.0, 35, (-3014));
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "m", node0, "");
      assertEquals(38, node1.getType());
      assertEquals((-1), node1.getLineno());
      
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType((-294));
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchNodeType0);
      assertTrue(node0.isNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = Node.newString("||", 2050, (-1952));
      Node node1 = NodeUtil.numberNode(36.92068394018416, node0);
      Node node2 = new Node(15, node0, node0, node1, 43, 0);
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode("||", node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = Node.newString("P\"", (-1254), (-1254));
      NodeUtil.isImmutableValue(node0);
      Node node1 = new Node(37, node0, node0, 40, 114);
      assertEquals(40, node0.getType());
      assertEquals(163954, node1.getSourcePosition());
      assertEquals((-1), node0.getLineno());
      assertEquals(37, node1.getType());
      assertFalse(node1.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidPropertyName("GET_BOOLEAN");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = Node.newString("F,");
      node0.setOptionalArg(false);
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("]E+=4%?*G~&WaRhJ:?", (Node) null);
      assertEquals(118, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(148, 148).when(node0).getType();
      NodeUtil.getImpureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = Node.newString("*=", 3622, 49);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      String string0 = NodeUtil.arrayToString(node1);
      assertEquals(14835761, node0.getSourcePosition());
      assertEquals("*=", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Node node0 = new Node(929);
      Node node1 = node0.removeChildren();
      assertEquals(929, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = Node.newString(119, "Fh\"ny%1!$QH3NL");
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NEW node, got WITH
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSDocInfo) null).when(node0).getJSDocInfo();
      doReturn(true, false).when(node0).isFunction();
      JSDocInfo jSDocInfo0 = NodeUtil.getFunctionJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(jSDocInfo0).when(node0).getJSDocInfo();
      doReturn(true).when(node0).isFunction();
      JSDocInfo jSDocInfo1 = NodeUtil.getFunctionJSDocInfo(node0);
      assertNull(jSDocInfo1.getVisibility());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getVarsDeclaredInBranch(node0);
      assertFalse(node0.isName());
      assertTrue(node0.isFalse());
      assertFalse(node0.isFunction());
      assertEquals((-1), node0.getSourcePosition());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(54);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(6002);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchNodeType0);
      assertTrue(node0.isTrue());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isExprCall(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getLineno());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(54, 37, 35).when(node1).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = NodeUtil.mayEffectMutableState(node1, abstractCompiler0);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("FTh\"ny%1!$QH3?N1");
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Double) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.numberNode((-43.8794776), node0);
      boolean boolean0 = NodeUtil.mayBeString(node1, true);
      assertEquals(39, node1.getType());
      assertFalse(boolean0);
      assertEquals(0, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertEquals(44, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertEquals(43, node0.getType());
      
      Node node1 = NodeUtil.newVarNode("new:", node0);
      NodeUtil.getVarsDeclaredInBranch(node1);
      assertFalse(node0.isFunction());
      assertFalse(node1.isName());
      assertTrue(node1.isVar());
      assertEquals((-1), node1.getLineno());
      assertFalse(node0.isVar());
      assertFalse(node0.isName());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
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
  public void test061()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(401, 29).when(node0).getType();
      boolean boolean0 = NodeUtil.isBooleanResult(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node1 = peepholeSimplifyRegExp0.optimizeSubtree(node0);
      assertEquals(417894, node1.getSourcePosition());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(closureCodingConvention0, "..o@\"Zqay");
      assertFalse(node0.isString());
      assertEquals(2, node0.getChildCount());
      assertTrue(node0.isGetProp());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      // Undeclared exception!
      try { 
        peepholeRemoveDeadCode0.tryFoldFor(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-307), (-307), (-1811));
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      
      boolean boolean1 = NodeUtil.isAssociative(52);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getImpureBooleanValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(43, node0.getType());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(0).when(node0).getType();
      doReturn(false, false).when(node0).isFunction();
      NodeUtil.referencesThis(node0);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getParent();
      doReturn(0, 0, 0, 0).when(node1).getType();
      doReturn((String) null).when(node1).toString();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1, nodeUtil_MayBeStringResultPredicate0);
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
  public void test068()  throws Throwable  {
      Node node0 = Node.newString("||", 2050, (-1952));
      boolean boolean0 = node0.isNoSideEffectsCall();
      assertTrue(node0.isString());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = Node.newString("xj(f~fZF1._2)");
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-1119), 23).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(12, 40, 53).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      node0.getChildBefore((Node) null);
      assertEquals(40, node0.getType());
      assertEquals(417894, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
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
  public void test074()  throws Throwable  {
      Node node0 = Node.newString("xj(f~fZF1._2)", (-2872), (-797));
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
  public void test075()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      Node node1 = new Node(45, node0, node0, node0, node0, 29, 15);
      // Undeclared exception!
      try { 
        node1.addChildrenToBack(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-307), (-307), (-1811));
      ReorderConstantExpression reorderConstantExpression0 = new ReorderConstantExpression();
      reorderConstantExpression0.optimizeSubtree(node0);
      assertTrue(node0.isNumber());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(888);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-307), (-307), (-1811));
      NodeUtil.getVarsDeclaredInBranch(node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType(29);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = Node.newNumber((-3172.899756775392));
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isFor());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      node0.setSourceEncodedPositionForTree(105);
      assertEquals(105, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(154, 0).when(node0).getType();
      NodeUtil.isBooleanResult(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(node1).isTry();
      // Undeclared exception!
      try { 
        NodeUtil.maybeAddFinally(node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-307), (-307), (-1811));
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertTrue(boolean0);
      
      Node node1 = new Node(2, node0, node0, 50, 36);
      assertEquals(204836, node1.getSourcePosition());
      assertEquals(2, node1.getType());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = Node.newString("xj(f~fZF1._2)");
      String string0 = NodeUtil.trimJsWhiteSpace("xj(f~fZF1._2)");
      assertEquals("xj(f~fZF1._2)", string0);
      
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(12);
      NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchNodeType0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node0).getType();
      doReturn(false).when(node0).isEmpty();
      doReturn(false).when(node0).isNull();
      NodeUtil.getArrayElementStringValue(node0);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getParent();
      doReturn(0, 0, 0, 0).when(node1).getType();
      doReturn((String) null).when(node1).toString();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1, nodeUtil_MayBeStringResultPredicate0);
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
  public void test085()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
      NodeUtil.getPureBooleanValue(node0);
      assertEquals(417894, node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertEquals(43, node0.getType());
      
      Node node1 = NodeUtil.newVarNode("new:", node0);
      NodeUtil.isImmutableValue(node1);
      assertTrue(node1.isVar());
      assertEquals((-1), node1.getLineno());
      
      NodeUtil.getBestLValueName(node0);
      assertNotSame(node0, node1);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
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
  public void test088()  throws Throwable  {
      NodeUtil.isSimpleOperatorType(888);
      Node node0 = new Node(75, 888, 888);
      boolean boolean0 = NodeUtil.isStatementBlock(node0);
      assertFalse(boolean0);
      assertEquals(3638136, node0.getSourcePosition());
      assertEquals(75, node0.getType());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-307), (-307), (-1811));
      boolean boolean0 = node0.isQualifiedName();
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean0);
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSDocInfo) null).when(node1).getJSDocInfo();
      doReturn(node0).when(node1).getParent();
      NodeUtil.getBestJSDocInfo(node1);
      assertFalse(node0.isAnd());
      assertFalse(node0.isVar());
      assertTrue(node0.isParamList());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = Node.newString(102, "Fh\"ny%1!$QH3NL", 102, 102);
      boolean boolean0 = NodeUtil.isNumericResult(node0);
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.isLiteralValue(node0, true);
      assertEquals(417894, node0.getSourcePosition());
      assertTrue(node0.isInc());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = Node.newString("s EcxQ~]=oCU");
      assertFalse(node0.isExprResult());
      
      boolean boolean0 = NodeUtil.isPrototypePropertyDeclaration(node0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getSourcePosition());
      
      boolean boolean1 = NodeUtil.isSimpleOperatorType(409);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isImmutableValue(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isFalse());
      
      Node node1 = Node.newString("new:", 35, 30);
      String string0 = node1.toStringTree();
      assertEquals("STRING new: 35\n", string0);
      assertEquals(143390, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      node0.setLineno(46);
      assertEquals(46, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
      Node node1 = new Node(2, node0, node0, node0, node0, 31, 52);
      assertEquals(417894, node0.getSourcePosition());
      assertTrue(node1.hasOneChild());
      assertEquals(2, node1.getType());
      assertEquals(127028, node1.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "m", node0, "");
      assertEquals(417894, node1.getSourcePosition());
      assertEquals(38, node1.getType());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail((-1291));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1291
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.newVarNode("new:", node0);
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode("new:", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(63).when(node0).getType();
      NodeUtil.getImpureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:STRING FTh\"ny%1!$QH3?N1 102
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = Node.newString("xj(f~fZF1._2)");
      Node node1 = new Node(116, node0, node0, node0);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(12);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1, nodeUtil_MatchNodeType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodeBREAK
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Node node0 = Node.newString(115, "Fh\"ny%1!$QH3NL");
      node0.addSuppression("GET_BOOLEAN");
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodeFOR Fh\"ny%1!$QH3NL [jsdoc_info: JSDocInfo]
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      assertFalse(node0.isGetProp());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(54, 37, 35).when(node1).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node1, abstractCompiler0);
      assertTrue(boolean0);
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
      // Undeclared exception!
      try { 
        NodeUtil.precedence(4095);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 4095
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Node node0 = Node.newString("FTh\"ny%1!$QH3?N1", 102, 102);
      NodeUtil.evaluatesToLocalValue(node0);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
      assertEquals(417894, node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Node node0 = Node.newString(119, "Fh\"ny%1!$QH3NL");
      NodeUtil.mayHaveSideEffects(node0);
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NEW node, got WITH
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(29);
      boolean boolean1 = NodeUtil.isAssociative(52);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue(".");
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }
}
