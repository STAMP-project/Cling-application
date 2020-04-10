/*

 * Tue Mar 03 19:24:11 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CodingConventions;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(10000, 44).when(node0).getType();
      NodeUtil.getImpureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = Node.newNumber((-409.2464251711057), (-4587), (-4587));
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = NodeUtil.opToStr(32);
      assertEquals("typeof", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Node node0 = Node.newString("5C");
      boolean boolean0 = NodeUtil.isVarOrSimpleAssignLhs(node0, node0);
      assertFalse(boolean0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getCharno());
      assertFalse(node0.isAssign());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(". not found in graph").when(node0).getSourceFileName();
      String string0 = NodeUtil.getSourceName(node0);
      assertNotNull(string0);
      assertEquals(". not found in graph", string0);
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
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(node0.isTrue());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "5C");
      NodeUtil.getLoopCodeBlock(node0);
      assertTrue(node0.isName());
      assertEquals((-1), node0.getCharno());
      assertEquals(38, node0.getType());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getLastChild();
      doReturn(113).when(node0).getType();
      Node node1 = NodeUtil.getLoopCodeBlock(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(48, 300, 119).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-2721)).when(node1).getChildCount();
      doReturn(true).when(node1).isFor();
      boolean boolean1 = NodeUtil.isForIn(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
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
  public void test011()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "R");
      assertTrue(node0.isName());
      
      Node node1 = NodeUtil.getRootOfQualifiedName(node0);
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getImpureBooleanValue(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = Node.newString("", 54, 2);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(221186, node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn((String) null).when(node0).getSourceFileName();
      String string0 = NodeUtil.getSourceName(node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "5C");
      NodeUtil.isConstantByConvention(jqueryCodingConvention0, node0, node0);
      assertTrue(node0.isName());
      assertFalse(node0.isGetProp());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(38, node0.getType());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(14, 14).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Node node0 = Node.newString(15, "=");
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NEW node, got LE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Node node0 = Node.newNumber(Double.POSITIVE_INFINITY);
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      
      Node node1 = new Node(45, node0, node0);
      assertEquals((-1), node1.getLineno());
      assertEquals(45, node1.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      // Undeclared exception!
      try { 
        node0.getExistingIntProp(47);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // missing prop: 47
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Node node0 = Node.newNumber((-409.2464251711057), (-4587), (-4587));
      NodeUtil.redeclareVarsInsideBranch(node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getCharno());
      assertFalse(node0.isFunction());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-122607198), (-122607198), 1739, 1739, 1739).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
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
  public void test023()  throws Throwable  {
      Node node0 = Node.newString("sFsc;", 8207, 8207);
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
  public void test024()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "R");
      boolean boolean0 = node0.isQualifiedName();
      assertTrue(boolean0);
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn((StaticSourceFile) null).when(node0).getStaticSourceFile();
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile(node0);
      assertNull(staticSourceFile0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(77);
      int int0 = NodeUtil.getCount(node0, nodeUtil_MatchNodeType0, nodeUtil_MatchNodeType0);
      assertEquals(0, int0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isName();
      NodeUtil.BooleanResultPredicate nodeUtil_BooleanResultPredicate0 = new NodeUtil.BooleanResultPredicate();
      boolean boolean0 = NodeUtil.isNameReferenced(node0, " functions with name ", nodeUtil_BooleanResultPredicate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "5C");
      int int0 = NodeUtil.getNameReferenceCount(node0, "5C");
      assertEquals(1, int0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).getBooleanProp(anyInt());
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;", 8207, 8207);
      NodeUtil.copyNameAnnotations(node0, node0);
      assertEquals(33619967, node0.getSourcePosition());
      assertEquals(8207, node0.getType());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "5C");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
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
  public void test033()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(codingConvention0).isConstant(anyString());
      CodingConventions.Proxy codingConventions_Proxy0 = new CodingConventions.Proxy(codingConvention0);
      Node node0 = NodeUtil.newQualifiedNameNode(codingConventions_Proxy0, "Moving functions + variable into deeper modules");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getLastChild();
      doReturn("SAFE_TO_FOLD_WITH_ARGS").when(node1).getString();
      doReturn(103).when(node1).getType();
      doReturn(true).when(node1).isGetProp();
      NodeUtil.isConstantByConvention(codingConventions_Proxy0, node1, node1);
      assertTrue(node0.isName());
      assertEquals(38, node0.getType());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(84, 31).when(node0).getType();
      TernaryValue ternaryValue0 = NodeUtil.getImpureBooleanValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, ternaryValue0, (Node) null, (String) null).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newUndefinedNode(node1);
      // Undeclared exception!
      try { 
        NodeUtil.getRootOfQualifiedName(node2);
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
      Node node0 = new Node(3015);
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
  public void test036()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(12).when(node0).getType();
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isFor();
      boolean boolean1 = NodeUtil.isForIn(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace(" not found in graph");
      assertEquals("not found in graph", string0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = Node.newString("W{6S$M4`Np");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getNext();
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode("W{6S$M4`Np", node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(154).when(node0).getSideEffectFlags();
      doReturn(true).when(node0).isCall();
      boolean boolean0 = NodeUtil.callHasLocalResult(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getSideEffectFlags();
      doReturn(true).when(node0).isCall();
      boolean boolean0 = NodeUtil.callHasLocalResult(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      InputId inputId0 = NodeUtil.getInputId((Node) null);
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isExprResult();
      boolean boolean1 = NodeUtil.isExprAssign(node1);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      // Undeclared exception!
      try { 
        NodeUtil.getObjectLitKeyName(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected node type: FALSE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("generateExports");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = Node.newString("ses#;", 8207, 8207);
      NodeUtil.evaluatesToLocalValue(node0);
      NodeUtil.getVarsDeclaredInBranch(node0);
      assertEquals(33619967, node0.getSourcePosition());
      assertTrue(node0.isString());
      assertFalse(node0.isName());
      assertEquals(8207, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node node0 = Node.newString("KyMwMU,,C$YN;vfV");
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected CALL node, got STRING
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      NodeUtil.isAssociative(8207);
      Node node0 = Node.newString("ses#;", 8207, 8207);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertEquals(33619967, node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "");
      Node node1 = new Node(32, node0, node0, node0, node0);
      assertEquals(32, node1.getType());
      assertTrue(node0.isName());
      assertEquals((-1), node0.getCharno());
      assertTrue(node1.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("W{6S$M4`Np", node0);
      NodeUtil.mayBeString(node1, false);
      assertEquals(0, node1.getCharno());
      assertTrue(node1.isVar());
      assertEquals(0, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Node node0 = Node.newString("ses#;", 8207, 8207);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(false).when(node1).isFunction();
      doReturn(false).when(node1).isName();
      NodeUtil.getVarsDeclaredInBranch(node1);
      assertEquals(40, node0.getType());
      assertEquals(33619967, node0.getSourcePosition());
      assertFalse(node0.isFunction());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      assertEquals((-1), node1.getCharno());
      assertEquals(122, node1.getType());
      
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node2).getParent();
      NodeUtil.isTryCatchNodeContainer(node2);
      assertEquals(8207, node0.getType());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Node node0 = Node.newString("}a'`z|j16", 48, 48);
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertEquals(40, node0.getType());
      assertTrue(boolean0);
      assertEquals(196656, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isVar();
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(true).when(node1).isName();
      boolean boolean0 = NodeUtil.isVarDeclaration(node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "");
      assertFalse(node0.isExprResult());
      
      NodeUtil.isPrototypePropertyDeclaration(node0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isName());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Node node0 = Node.newString("}a'`z|j16", 48, 48);
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
  public void test057()  throws Throwable  {
      Node node0 = Node.newNumber(Double.POSITIVE_INFINITY);
      NodeUtil.getBestJSDocInfo(node0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(122, node1.getType());
      
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
      assertEquals(8207, node0.getType());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isLoopStructure(node0);
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      boolean boolean0 = NodeUtil.isRelationalOperation(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Node node0 = new Node(44);
      boolean boolean0 = NodeUtil.isStatementBlock(node0);
      assertFalse(boolean0);
      assertEquals(44, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node1).getType();
      boolean boolean1 = NodeUtil.isImmutableValue(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node0 = NodeUtil.booleanNode(true);
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
  public void test064()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "");
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
  public void test065()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "5C");
      NodeUtil.opToStr(103);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertFalse(boolean0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      boolean boolean0 = NodeUtil.isSymmetricOperation(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative(65500);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(48, 300, 119).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      Node node1 = Node.newString(42, " not found> in grap", 300, 4);
      node1.putBooleanProp((-274), false);
      assertEquals(1228804, node1.getSourcePosition());
      assertEquals(42, node1.getType());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionJSDocInfo(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Node node0 = Node.newString("Vz", 817, (-1523));
      Node node1 = new Node(4096, node0, node0, node0, 108, 15);
      assertEquals(442383, node1.getSourcePosition());
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(4096, node1.getType());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "");
      Node node1 = Node.newNumber((double) 51, 1872, 1524);
      assertEquals(7669236, node1.getSourcePosition());
      assertTrue(node1.isNumber());
      
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node0);
      assertTrue(node0.isName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(48, 300, 119).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      Node node1 = new Node(51);
      boolean boolean1 = NodeUtil.isCallOrNew(node1);
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(51, node1.getType());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Node node0 = Node.newNumber(2080.03155618, 3015, 3015);
      Node node1 = node0.getAncestor(8);
      assertNull(node1);
      assertEquals(12352455, node0.getSourcePosition());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Node node0 = Node.newNumber(2080.03155618, 3015, 3015);
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertEquals(12352455, node0.getSourcePosition());
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("iw('imn{/mT=", (Node) null);
      node0.setSourceEncodedPositionForTree(0);
      assertEquals(0, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(48, 300, 119).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isLatin(" not found> in grap");
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = Node.newString("ses#;", (-3113), (-3808));
      NodeUtil.evaluatesToLocalValue(node0);
      NodeUtil.getPureBooleanValue(node0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      assertTrue(node1.isVoid());
      assertEquals((-1), node1.getCharno());
      
      NodeUtil.getStringValue(node0);
      assertEquals(8207, node0.getType());
      assertFalse(node0.isDelProp());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      assertTrue(node1.isVoid());
      assertEquals((-1), node1.getLineno());
      
      NodeUtil.getImpureBooleanValue(node0);
      assertEquals(8207, node0.getType());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Node node0 = Node.newNumber(2080.03155618, 3015, 3015);
      NodeUtil.getImpureBooleanValue(node0);
      assertEquals(12352455, node0.getSourcePosition());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = Node.newNumber(Double.POSITIVE_INFINITY);
      Node node1 = Node.newString(8, "5C");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1);
      assertEquals(8, node1.getType());
      
      boolean boolean1 = NodeUtil.mayBeString(node0);
      assertFalse(boolean1 == boolean0);
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;");
      node0.addChildrenToFront(node0);
      assertTrue(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(84, 31).when(node0).getType();
      TernaryValue ternaryValue0 = NodeUtil.getImpureBooleanValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, ternaryValue0, (Node) null, (String) null).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newUndefinedNode(node1);
      NodeUtil.isNameReferenced(node2, "&&");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node2, abstractCompiler0);
      assertFalse(boolean0);
      assertEquals(0, node2.getSourcePosition());
      assertTrue(node2.isVoid());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(52, 4095).when(node0).getType();
      TernaryValue ternaryValue0 = NodeUtil.getImpureBooleanValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(ternaryValue0, ternaryValue0, ternaryValue0, ternaryValue0).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newUndefinedNode(node1);
      boolean boolean0 = node2.isQualifiedName();
      assertTrue(node2.isVoid());
      assertEquals(0, node2.getCharno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(52, 4095).when(node0).getType();
      TernaryValue ternaryValue0 = NodeUtil.getImpureBooleanValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(ternaryValue0, ternaryValue0, ternaryValue0, ternaryValue0).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newUndefinedNode(node1);
      boolean boolean0 = NodeUtil.isSwitchCase(node2);
      assertEquals(0, node2.getSourcePosition());
      assertEquals(122, node2.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention(jqueryCodingConvention0);
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, ".q$(");
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
  public void test088()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "O*=A:=/;XZuyuR$y");
      String string0 = NodeUtil.getPrototypePropertyName(node0);
      assertEquals("uyuR$y", string0);
      assertTrue(node0.isName());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(48, 300, 119).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      Node node1 = Node.newString(42, " not found> in grap", 300, 4);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getParent();
      doReturn(true).when(node2).isName();
      boolean boolean0 = NodeUtil.isVarDeclaration(node2);
      assertEquals(1228804, node1.getSourcePosition());
      assertFalse(boolean0);
      assertEquals(42, node1.getType());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      int int0 = NodeUtil.precedence(122);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(101);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = Node.newNumber(Double.POSITIVE_INFINITY);
      NodeUtil.getNearestFunctionName(node0);
      Node node1 = new Node(45, node0, node0);
      assertEquals(45, node1.getType());
      assertFalse(node1.hasMoreThanOneChild());
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Node node0 = Node.newNumber(2080.03155618, 3015, 3015);
      NodeUtil.isBooleanResult(node0);
      assertEquals(12352455, node0.getSourcePosition());
      assertEquals(39, node0.getType());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-143));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isName();
      boolean boolean1 = NodeUtil.isVarDeclaration(node1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(53, 1).when(node0).getType();
      TernaryValue ternaryValue0 = NodeUtil.getImpureBooleanValue(node0);
      Object object0 = new Object();
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(ternaryValue0, ternaryValue0, "jscomp_throw_param", object0).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newUndefinedNode(node1);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node2);
      assertEquals(0, node2.getCharno());
      assertFalse(boolean0);
      assertTrue(node2.isVoid());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "");
      Node node1 = NodeUtil.numberNode(53.0, node0);
      boolean boolean0 = NodeUtil.evaluatesToLocalValue(node1);
      assertEquals((-1), node1.getLineno());
      assertTrue(node1.isNumber());
      assertEquals(38, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "R");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      node1.isUnscopedQualifiedName();
      assertEquals((-1), node1.getLineno());
      assertEquals(122, node1.getType());
      
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertTrue(node0.isName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(84, 31).when(node0).getType();
      TernaryValue ternaryValue0 = NodeUtil.getImpureBooleanValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, ternaryValue0, (Node) null, (String) null).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newUndefinedNode(node1);
      NodeUtil.newUndefinedNode(node2);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayEffectMutableState(node2, abstractCompiler0);
      assertEquals(0, node2.getCharno());
      assertFalse(boolean0);
      assertEquals(122, node2.getType());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = Node.newNumber(2080.03155618, 3015, 3015);
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "", node0, "_");
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:NAME  3015 [originalname: _]
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "R");
      boolean boolean0 = node0.isUnscopedQualifiedName();
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean1);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = NodeUtil.opToStr((-1020));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "5C");
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertTrue(boolean0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(108);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for IF (type 108)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Node node0 = Node.newNumber(Double.POSITIVE_INFINITY);
      Node node1 = Node.newString(8, "5C");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1);
      assertEquals(8, node1.getType());
      
      boolean boolean1 = NodeUtil.isConstantName(node0);
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Node node0 = Node.newString(8, "5C");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(8, node0.getType());
      assertEquals((-1), node0.getLineno());
      
      boolean boolean1 = NodeUtil.isValidQualifiedName(" ");
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[1];
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
  public void test108()  throws Throwable  {
      Node node0 = Node.newNumber(Double.POSITIVE_INFINITY);
      assertTrue(node0.isNumber());
      
      Node node1 = NodeUtil.newVarNode("iw('imn{/mT=", node0);
      boolean boolean0 = NodeUtil.isSimpleOperator(node1);
      assertTrue(node1.isVar());
      assertEquals((-1), node1.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Node node0 = Node.newNumber(2080.03155618, 3015, 3015);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:NUMBER 2080.03155618 3015
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Node node0 = Node.newString("sFsc;", 8207, 8207);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn((-1), (-2921), 75, 76).when(node1).getType();
      doReturn("!==").when(node1).toString();
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression node!==
         //  parent:STRING sFsc; 8207
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;", 8207, 8207);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      assertEquals(33619967, node1.getSourcePosition());
      assertEquals(122, node1.getType());
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals(8207, node0.getType());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Node node0 = Node.newString("ses#;", 8207, 8207);
      NodeUtil.evaluatesToLocalValue(node0);
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertEquals(33619967, node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "");
      NodeUtil.getImpureBooleanValue(node0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(node0.isName());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Node node0 = Node.newString(8207, "sFsc;");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.evaluatesToLocalValue(node1);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertEquals(122, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(8207, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(84, 31).when(node0).getType();
      TernaryValue ternaryValue0 = NodeUtil.getImpureBooleanValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, ternaryValue0, (Node) null, (String) null).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newUndefinedNode(node1);
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayEffectMutableState(node2, abstractCompiler0);
      // Undeclared exception!
      try { 
        NodeUtil.getRootOfQualifiedName(node2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = Node.newNumber((-5631.608066868344));
      assertFalse(node0.isRegExp());
      
      Node node1 = peepholeSimplifyRegExp0.optimizeSubtree(node0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      NodeUtil.isAssociative(8207);
      Node node0 = Node.newString(8207, "sFsc;");
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 8207
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }
}
