/*

 * Tue Mar 03 19:26:46 GMT 2020
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
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Set;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Node node0 = new Node(1913, 87855567, 87855567);
      NodeUtil.getLoopCodeBlock(node0);
      assertEquals(1913, node0.getType());
      assertEquals((-920846337), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = Node.newString(104, "(}Rh9(u\"IVdf");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getLastChild();
      doReturn(true).when(node1).isFunction();
      boolean boolean0 = NodeUtil.referencesThis(node1);
      assertEquals(104, node0.getType());
      assertFalse(boolean0);
      assertFalse(node0.isFunction());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      try { 
        node0.setString("Hxx3+FNu*:y&W0");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // FALSE is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = NodeUtil.getSourceName((Node) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(49).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn(true).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      doReturn((String) null).when(node0).toString();
      Node[] nodeArray0 = new Node[0];
      Node node1 = NodeUtil.newCallNode(node0, nodeArray0);
      NodeUtil.isImmutableValue(node1);
      node1.setSourceEncodedPositionForTree(48);
      assertEquals(0, node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Node node0 = Node.newNumber(Double.NEGATIVE_INFINITY, 1365, 65565);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(32).when(node1).getType();
      doReturn(false, false).when(node1).isFunction();
      boolean boolean0 = NodeUtil.referencesThis(node1);
      assertEquals(5595135, node0.getSourcePosition());
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Node node0 = Node.newString(109, "Ra", 109, 541);
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0);
      assertEquals(447005, node0.getSourcePosition());
      assertEquals(109, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
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
  public void test009()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(30, 0).when(node0).getType();
      doReturn(false).when(node0).isNew();
      // Undeclared exception!
      try { 
        NodeUtil.mayHaveSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
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
  @Ignore
  public void test011()  throws Throwable  {
      Stack<InputStream> stack0 = new Stack<InputStream>();
      Enumeration<InputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      JSSourceFile.fromInputStream("com.google.javascript.rhino.jstype.NumberType", (InputStream) bufferedInputStream0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn((StaticSourceFile) null).when(node0).getStaticSourceFile();
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile(node0);
      assertEquals("com.google.javascript.rhino.jstype.NumberType", staticSourceFile0.getName());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Node node0 = new Node(147, (-167), 49);
      boolean boolean0 = NodeUtil.isLiteralValue(node0, false);
      assertEquals(147, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(4, 3061, 470, 1451, 178).when(node0).getType();
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = Node.newString("<");
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
  public void test015()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn((StaticSourceFile) null).when(node0).getStaticSourceFile();
      StaticSourceFile staticSourceFile0 = NodeUtil.getSourceFile(node0);
      assertNull(staticSourceFile0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = Node.newString(136, "(,Ws");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      NodeUtil.arrayToString(node1);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, predicate0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 136
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(jSDocInfo0).when(node0).getJSDocInfo();
      JSDocInfo jSDocInfo1 = NodeUtil.getBestJSDocInfo(node0);
      assertEquals(0, jSDocInfo1.getExtendedInterfacesCount());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Node node0 = Node.newNumber((-2225.94), 16, 29);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(125).when(node1).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1);
      assertEquals(65565, node0.getSourcePosition());
      assertTrue(node0.isNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getCount(node0, predicate0, predicate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isCall();
      doReturn(true).when(node0).isNoSideEffectsCall();
      boolean boolean0 = NodeUtil.functionCallHasSideEffects(node0, (AbstractCompiler) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = new Node(1913, 87855567, 87855567);
      assertFalse(node0.isFunction());
      
      NodeUtil.getNearestFunctionName(node0);
      assertEquals((-920846337), node0.getSourcePosition());
      assertEquals(1913, node0.getType());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Node node0 = Node.newString("<");
      NodeUtil.evaluatesToLocalValue(node0);
      node0.isVarArgs();
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      int int0 = NodeUtil.getNameReferenceCount(node0, "");
      assertEquals(0, int0);
      assertEquals((-1), node0.getLineno());
      assertEquals(44, node0.getType());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Node node0 = new Node(48, 137, 23);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(48, node0.getType());
      assertEquals(561175, node0.getSourcePosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "JSC_UNRESOLVED_TYPE");
      NodeUtil.copyNameAnnotations(node0, node0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "O+F");
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(node0.isName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = Node.newString(48, "", 48, 48);
      Node node1 = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, node0);
      assertEquals(1, node1.getChildCount());
      
      node1.detachChildren();
      assertEquals(196656, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isGetElem();
      doReturn(false).when(node1).isGetProp();
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node0;
      Node node2 = NodeUtil.newCallNode(node1, nodeArray0);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node2);
      assertTrue(boolean0);
      assertEquals(2, node2.getChildCount());
      assertEquals(37, node2.getType());
      assertEquals((-1), node2.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = new Node(16, 16, 2813);
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
  public void test030()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(144, 144, 160).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      String string0 = "\\u0=5f*)EiW{%Y6n";
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getLastChild();
      doReturn(string0).when(node0).getString();
      doReturn(127).when(node0).getType();
      doReturn(true).when(node0).isGetProp();
      boolean boolean0 = NodeUtil.isConstantByConvention(codingConvention0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Node) null, "yM9{7SP").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("yM9{7SP", node0);
      // Undeclared exception!
      try { 
        NodeUtil.getRootOfQualifiedName(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator(54);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Node node0 = new Node(1913, 87855567, 87855567);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newName(codingConvention0, "", node0, "");
      boolean boolean0 = NodeUtil.isBooleanResult(node1);
      assertEquals(38, node1.getType());
      assertEquals((-920846337), node1.getSourcePosition());
      assertEquals(1913, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = NodeUtil.trimJsWhiteSpace(" Q");
      assertEquals("Q", string0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = Node.newString(94, "", 94, 4312);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(true).when(node1).isName();
      NodeUtil.getAssignedValue(node1);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals(94, node0.getType());
      assertEquals(389119, node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-342)).when(node0).getSideEffectFlags();
      doReturn(true).when(node0).isCall();
      boolean boolean0 = NodeUtil.callHasLocalResult(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = new Node(1913, 87855567, 87855567);
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
  public void test040()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("com.google.common.base.Suppliers$MemoizingSupplier", (Node) null);
      assertEquals(118, node0.getType());
      assertNotNull(node0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Node node0 = Node.newString(26, "!");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(26, 26).when(node1).getType();
      doReturn(false).when(node1).isEmpty();
      doReturn(false).when(node1).isNull();
      // Undeclared exception!
      try { 
        NodeUtil.getArrayElementStringValue(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = Node.newNumber((-2225.94), 16, 29);
      // Undeclared exception!
      try { 
        NodeUtil.getObjectLitKeyName(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected node type: NUMBER -2225.94 16
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Node node0 = Node.newString((-472), "<$T2NI", 110, 113);
      NodeUtil.getPureBooleanValue(node0);
      assertEquals((-472), node0.getType());
      assertEquals(450673, node0.getSourcePosition());
      assertEquals(110, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = NodeUtil.newQualifiedNameNode(codingConvention0, "JSC_UNRESOLVED_TYPE");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      Node node2 = node1.cloneTree();
      assertEquals(38, node0.getType());
      assertTrue(node2.isVoid());
      assertEquals((-1), node2.getSourcePosition());
      assertEquals(1, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = Node.newString("");
      Node node1 = NodeUtil.newName(codingConvention0, "", node0, "");
      String string0 = NodeUtil.getArrayElementStringValue(node1);
      assertTrue(node1.isName());
      assertFalse(node0.isNull());
      assertEquals((-1), node1.getLineno());
      assertNull(string0);
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Node) null, "yM9{7SP").when(node0).getProp(anyInt());
      doReturn(false).when(node0).isExprResult();
      Node node1 = NodeUtil.newVarNode("yM9{7SP", node0);
      NodeUtil.isExprAssign(node0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected expression nodeVAR 0 [source_file: yM9{7SP]
         //  parent:null
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Node node0 = Node.newString("<");
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(node0).getType();
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node1).isGetProp();
      Node[] nodeArray0 = new Node[0];
      Node node2 = NodeUtil.newCallNode(node1, nodeArray0);
      assertEquals(37, node2.getType());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isCallOrNew(node0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getLineno());
      
      boolean boolean1 = NodeUtil.isSimpleOperatorType(39);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isSimpleOperatorType(39);
      assertFalse(boolean0);
      
      Node node1 = node0.removeChildren();
      assertEquals((-1), node0.getCharno());
      assertEquals(43, node0.getType());
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
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
  public void test052()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1473);
      assertFalse(node0.isName());
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(true).when(node1).isCall();
      doReturn(false).when(node1).isNoSideEffectsCall();
      boolean boolean0 = NodeUtil.functionCallHasSideEffects(node1, (AbstractCompiler) null);
      assertTrue(boolean0);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      NodeUtil.evaluatesToLocalValue(node0);
      assertEquals((-1), node0.getCharno());
      assertEquals(44, node0.getType());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Node node0 = Node.newNumber((-1461.6), 54, 115);
      String string0 = NodeUtil.getStringValue(node0);
      assertEquals(221299, node0.getSourcePosition());
      assertTrue(node0.isNumber());
      assertEquals("-1461.6", string0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(36, 129, 31, 0).when(node0).getType();
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
  public void test056()  throws Throwable  {
      Node node0 = Node.newNumber((double) 2);
      boolean boolean0 = NodeUtil.isLiteralValue(node0, false);
      assertEquals((-1), node0.getLineno());
      assertEquals(39, node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = Node.newString("", 26, 26);
      Node node1 = new Node(8, node0, node0, node0, node0);
      assertTrue(node0.isString());
      assertEquals(106522, node0.getSourcePosition());
      assertEquals(8, node1.getType());
      assertTrue(node1.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = Node.newString((-472), "<$T2NI", 110, 113);
      boolean boolean0 = NodeUtil.mayBeString(node0, false);
      assertEquals(450673, node0.getSourcePosition());
      assertEquals((-472), node0.getType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst(",;CKmw.7lx8vMdCkrD");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      NodeUtil.redeclareVarsInsideBranch(node1);
      assertEquals(132, node0.getType());
      assertEquals(122, node1.getType());
      assertEquals((-1), node1.getLineno());
      assertEquals((-1), node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.evaluatesToLocalValue(node0);
      assertFalse(node0.isFunction());
      
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(43, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Node node0 = Node.newString("String node not created with Node.newString");
      boolean boolean0 = NodeUtil.isTryFinallyNode(node0, node0);
      assertFalse(boolean0);
      
      NodeUtil.evaluatesToLocalValue(node0, (Predicate<Node>) null);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isTry());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Node node0 = Node.newString("String node not created with Node.newString");
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = new Node(1913);
      assertFalse(node0.isGetProp());
      
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-658));
      assertFalse(boolean0);
      
      NodeUtil.getPrototypeClassName(node0);
      assertEquals((-1), node0.getCharno());
      assertEquals(1913, node0.getType());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = Node.newString("<");
      NodeUtil.evaluatesToLocalValue(node0);
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      NodeUtil.isConstantByConvention(jqueryCodingConvention0, node0, node0);
      assertTrue(node0.isString());
      assertFalse(node0.isGetProp());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Node node0 = Node.newString(94, "", 94, 4312);
      NodeUtil.isAssociative(54);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals(389119, node0.getSourcePosition());
      assertEquals(94, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Node) null, "yM9{7SP").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("yM9{7SP", node0);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node2 = NodeUtil.newQualifiedNameNode((CodingConvention) closureCodingConvention0, "<G.", node1, "<G.");
      assertEquals(2, node2.getChildCount());
      assertEquals(0, node2.getCharno());
      assertFalse(node2.isName());
      assertEquals(33, node2.getType());
      assertTrue(node1.isVar());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(googleCodingConvention0, "O+F");
      NodeUtil.isPrototypePropertyDeclaration(node0);
      assertTrue(node0.isName());
      assertEquals(38, node0.getType());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(44).when(node0).getType();
      NodeUtil.isSimpleOperator(node0);
      Node node1 = new Node(39, 44, 47);
      NodeUtil.NumbericResultPredicate nodeUtil_NumbericResultPredicate0 = new NodeUtil.NumbericResultPredicate();
      boolean boolean0 = nodeUtil_NumbericResultPredicate0.apply(node1);
      assertTrue(boolean0);
      assertEquals(180271, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = Node.newString(";\"m@ 9w7");
      NodeUtil.evaluatesToLocalValue(node0);
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertFalse(boolean0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseStringType();
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType((ObjectType) null, jSType0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("G9rxEtOo", node0, parameterizedType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      Set<String> set0 = enumElementType0.getPropertyNames();
      boolean boolean0 = NodeUtil.isValidDefineValue(node0, set0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      SyntheticAst syntheticAst0 = new SyntheticAst(",;CKmw.7lx8vMdCkrD");
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      boolean boolean0 = node0.isOnlyModifiesThisCall();
      assertTrue(node0.isScript());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((JSDocInfo) null).when(node0).getJSDocInfo();
      doReturn((Node) null).when(node0).getParent();
      JSDocInfo jSDocInfo0 = NodeUtil.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(115, 114, 52, 52).when(node0).getType();
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Node node0 = Node.newString(";\"m@ 9w7");
      NodeUtil.evaluatesToLocalValue(node0);
      assertFalse(node0.isNull());
      
      Node node1 = NodeUtil.booleanNode(true);
      String string0 = NodeUtil.getArrayElementStringValue(node1);
      assertEquals("true", string0);
      assertTrue(node1.isTrue());
      assertEquals((-1), node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isRelationalOperation(node0);
      assertFalse(boolean0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Node node0 = Node.newString("<");
      // Undeclared exception!
      try { 
        node0.getChildBefore(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidSimpleName("RegExp");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Node) null, "yM9{7SP").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("yM9{7SP", node0);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertTrue(boolean0);
      
      NodeUtil.isLiteralValue(node1, false);
      assertEquals(118, node1.getType());
      assertEquals(0, node1.getCharno());
      assertEquals(0, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Node) null, "yM9{7SP").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("yM9{7SP", node0);
      NodeUtil.isSymmetricOperation(node1);
      assertEquals(118, node1.getType());
      assertEquals(0, node1.getCharno());
      assertEquals(0, node1.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("{usu", "{usu").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) jqueryCodingConvention0, "{usu", node0, "{usu");
      Node node2 = new Node(50, node0, node0, node1, 44, 29);
      assertEquals(50, node2.getType());
      assertEquals(38, node1.getType());
      assertEquals(180253, node2.getSourcePosition());
      assertEquals(0, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Node node0 = Node.newNumber(Double.NEGATIVE_INFINITY, 1365, 65565);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0, "").when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newName(codingConvention0, "", node1, "");
      // Undeclared exception!
      try { 
        node0.replaceChild(node2, node2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[0];
      Node node1 = NodeUtil.newCallNode(node0, nodeArray0);
      boolean boolean0 = NodeUtil.isImmutableValue(node1);
      assertEquals((-1), node1.getLineno());
      assertEquals(37, node1.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = Node.newNumber((double) 2);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(43).when(node1).getType();
      NodeUtil.mayHaveSideEffects(node1);
      boolean boolean0 = NodeUtil.isLiteralValue(node0, false);
      assertEquals(39, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Node node0 = new Node(4741, 4095, (-1795));
      Node node1 = node0.getAncestor(16);
      assertNull(node1);
      
      boolean boolean0 = NodeUtil.isLiteralValue(node0, false);
      assertEquals(4741, node0.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertFalse(boolean0);
      assertFalse(node0.isFor());
      assertEquals((-1), node0.getLineno());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Node node0 = new Node(1913, 87855567, 87855567);
      Node node1 = NodeUtil.numberNode((-1661.462562837), node0);
      boolean boolean0 = NodeUtil.isBooleanResult(node1);
      assertEquals(1913, node0.getType());
      assertEquals((-920846337), node1.getSourcePosition());
      assertEquals(39, node1.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(104, 104, 2487).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[0];
      Node node1 = NodeUtil.newCallNode(node0, nodeArray0);
      boolean boolean0 = NodeUtil.isImmutableValue(node1);
      assertTrue(node1.isCall());
      assertFalse(boolean0);
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(44).when(node0).getType();
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
      
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node1).isGetElem();
      doReturn(false).when(node1).isGetProp();
      Node[] nodeArray0 = new Node[0];
      Node node2 = NodeUtil.newCallNode(node1, nodeArray0);
      Node node3 = NodeUtil.numberNode(0.0, node2);
      assertEquals((-1), node3.getLineno());
      assertEquals(37, node2.getType());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("false", string0);
      assertEquals(43, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(36, 1532, 1524).when(node0).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertTrue(boolean0);
      
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "JSC_UNRESOLVED_TYPE");
      Node node2 = NodeUtil.newUndefinedNode(node1);
      assertEquals((-1), node2.getSourcePosition());
      assertTrue(node1.isName());
      assertEquals(122, node2.getType());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      NodeUtil.isSimpleOperatorType(2);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(30, 0).when(node0).getType();
      doReturn(false).when(node0).isNew();
      // Undeclared exception!
      try { 
        NodeUtil.mayHaveSideEffects(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Node node0 = new Node(1913);
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-658));
      assertFalse(boolean0);
      
      NodeUtil.redeclareVarsInsideBranch(node0);
      assertFalse(node0.isFunction());
      assertEquals(1913, node0.getType());
      assertFalse(node0.isName());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(4312).when(node0).getType();
      NodeUtil.isSimpleOperator(node0);
      Node node1 = new Node(44, 4095, 45);
      boolean boolean0 = NodeUtil.isStatementBlock(node1);
      assertFalse(boolean0);
      assertEquals(16773165, node1.getSourcePosition());
      assertTrue(node1.isTrue());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Node node0 = Node.newNumber((double) 2);
      boolean boolean0 = NodeUtil.isSwitchCase(node0);
      assertFalse(boolean0);
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(36, 1532, 1524).when(node0).getType();
      NodeUtil.mayHaveSideEffects(node0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "JSC_UNRESOLVED_TYPE");
      // Undeclared exception!
      try { 
        NodeUtil.getObjectLitKeyName(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected node type: NAME JSC_UNRESOLVED_TYPE
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[0];
      Node node1 = NodeUtil.newCallNode(node0, nodeArray0);
      NodeUtil.isImmutableValue(node1);
      assertEquals(37, node1.getType());
      assertEquals((-1), node1.getLineno());
      
      Node node2 = new Node(39, 44, 47);
      NodeUtil.NumbericResultPredicate nodeUtil_NumbericResultPredicate0 = new NodeUtil.NumbericResultPredicate();
      boolean boolean0 = nodeUtil_NumbericResultPredicate0.apply(node2);
      assertTrue(boolean0);
      assertEquals(180271, node2.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = Node.newString("<");
      NodeUtil.evaluatesToLocalValue(node0);
      String string0 = NodeUtil.getArrayElementStringValue(node0);
      assertEquals("<", string0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      try { 
        node0.getString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // TRUE is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Node node0 = new Node(23, 31, 31);
      NodeUtil.mayHaveSideEffects(node0);
      SyntheticAst syntheticAst0 = new SyntheticAst("!==");
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Node.newString(136, "(,Ws");
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(32, 39, 50, 51).when(node0).getType();
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
  public void test102()  throws Throwable  {
      Node node0 = Node.newString((-967), "w:@tu4h4$u", 1079, (-967));
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(true).when(node1).isNew();
      doReturn(false).when(node1).isNoSideEffectsCall();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.constructorCallHasSideEffects(node1, abstractCompiler0);
      assertEquals((-967), node0.getType());
      assertFalse(node0.isName());
      assertEquals((-1), node0.getCharno());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Node node0 = Node.newString("8qC1W^]k");
      NodeUtil.evaluatesToLocalValue(node0);
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
  public void test104()  throws Throwable  {
      Node node0 = Node.newString("String node not created with Node.newString");
      NodeUtil.isStrWhiteSpaceChar(39);
      NodeUtil.evaluatesToLocalValue(node0, (Predicate<Node>) null);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.isSimpleOperatorType(39);
      Node.SideEffectFlags node_SideEffectFlags0 = new Node.SideEffectFlags(44);
      // Undeclared exception!
      try { 
        node0.setSideEffectFlags(node_SideEffectFlags0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // setIsNoSideEffectsCall only supports CALL and NEW nodes, got FALSE
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      int int0 = NodeUtil.precedence(32);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Node node0 = new Node(23, 31, 31);
      NodeUtil.mayHaveSideEffects(node0);
      node0.isSyntheticBlock();
      assertEquals(23, node0.getType());
      assertEquals(127007, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("<G");
      boolean boolean1 = NodeUtil.isSimpleOperatorType(3316);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(44).when(node0).getType();
      NodeUtil.isSimpleOperator(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getNext();
      doReturn(true).when(node1).isGetElem();
      doReturn(false).when(node1).isGetProp();
      doReturn((String) null).when(node1).toString();
      Node[] nodeArray0 = new Node[0];
      Node node2 = NodeUtil.newCallNode(node1, nodeArray0);
      node2.setSourceEncodedPositionForTree(48);
      assertEquals(48, node2.getCharno());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Node node0 = new Node(23, 31, 31);
      NodeUtil.mayHaveSideEffects(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:MUL 31
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isGetElem();
      doReturn(false).when(node1).isGetProp();
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node0;
      NodeUtil.newCallNode(node1, nodeArray0);
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode("", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Node node0 = Node.newNumber((double) 4312);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(4312).when(node1).getType();
      doReturn(true).when(node1).isName();
      boolean boolean0 = NodeUtil.isSimpleOperator(node1);
      assertFalse(boolean0);
      
      NodeUtil.getAssignedValue(node1);
      assertFalse(node0.isAssign());
      assertTrue(node0.isNumber());
      assertEquals((-1), node0.getLineno());
      assertFalse(node0.isVar());
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail((-2181));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -2181
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Node node0 = Node.newString("");
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
      
      boolean boolean1 = NodeUtil.isSimpleOperatorType((-183));
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(node1).isGetElem();
      doReturn(false, false, false).when(node1).isGetProp();
      doReturn((String) null, (String) null).when(node1).toString();
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node0;
      Node node2 = NodeUtil.newCallNode(node1, nodeArray0);
      NodeUtil.isSimpleOperatorType(0);
      NodeUtil.isFunctionObjectCallOrApply(node2);
      assertTrue(node2.isCall());
      assertFalse(node2.hasOneChild());
      assertEquals(37, node2.getType());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Node node0 = new Node(23, 31, 31);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(127007, node0.getSourcePosition());
      assertEquals(23, node0.getType());
      assertFalse(boolean0);
      
      boolean boolean1 = NodeUtil.isCommutative(108);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Node node0 = Node.newString("<");
      NodeUtil.evaluatesToLocalValue(node0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
      
      boolean boolean0 = NodeUtil.isCommutative(108);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Node) null, "yM9{7SP").when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("yM9{7SP", node0);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertTrue(boolean0);
      assertEquals(118, node1.getType());
      assertEquals(0, node1.getCharno());
      
      boolean boolean1 = NodeUtil.isSimpleOperatorType((-674));
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      Node node0 = Node.newString("String node not created with Node.newString");
      assertFalse(node0.isRegExp());
      
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node1 = peepholeSimplifyRegExp0.optimizeSubtree(node0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      Node node0 = Node.newString("String node not created with Node.newString");
      NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      NodeUtil.evaluatesToLocalValue(node0, (Predicate<Node>) null);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(4312).when(node0).getType();
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      boolean boolean1 = NodeUtil.isAssociative(4);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("w:@tu4h4$u");
      assertEquals(Double.NaN, (double)double0, 0.01);
      assertNotNull(double0);
  }
}
