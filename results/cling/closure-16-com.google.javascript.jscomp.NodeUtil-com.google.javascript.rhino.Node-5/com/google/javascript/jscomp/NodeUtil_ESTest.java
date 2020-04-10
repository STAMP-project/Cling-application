/*

 * Tue Mar 03 19:23:47 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.GatherRawExports;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeCollectPropertyAssignments;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.ArrayList;
import java.util.List;
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
      Node node0 = NodeUtil.booleanNode(false);
      // Undeclared exception!
      try { 
        NodeUtil.maybeAddFinally(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(0).when(node0).getType();
      doReturn(false, false).when(node0).isFunction();
      boolean boolean0 = NodeUtil.referencesThis(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node1).getType();
      boolean boolean1 = NodeUtil.isLiteralValue(node1, false);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Node node0 = Node.newString((-538), "", (-538), 30);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn("").when(node1).getSourceFileName();
      String string0 = NodeUtil.getSourceName(node1);
      assertNotNull(string0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals((-538), node0.getType());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn("S[7D4wI4N#tYp0").when(node0).getQualifiedName();
      boolean boolean0 = NodeUtil.isPrototypeProperty(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      Node node0 = new Node(31);
      NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchShallowStatement0);
      assertEquals(31, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
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
  public void test007()  throws Throwable  {
      Node node0 = Node.newString("D", 50, 50);
      boolean boolean0 = NodeUtil.referencesThis(node0);
      assertEquals(204850, node0.getSourcePosition());
      assertFalse(boolean0);
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence((-1317));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1317
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      Node node0 = new Node(48);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchShallowStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 48
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Node node0 = new Node(4307, 2, 103);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      boolean boolean0 = NodeUtil.containsType(node1, 16);
      assertEquals(4307, node0.getType());
      assertEquals(8295, node1.getSourcePosition());
      assertTrue(node1.isVoid());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      NodeUtil.getPrototypeClassName(node0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isParamList());
      assertEquals(83, node0.getType());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isNew();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.constructorCallHasSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isExprResult();
      boolean boolean1 = NodeUtil.isPrototypePropertyDeclaration(node1);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Node node0 = Node.newString("g86`", 148, (-299));
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(false).when(node0).isFunction();
      doReturn(false).when(node0).isName();
      NodeUtil.redeclareVarsInsideBranch(node0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(51).when(node0).getType();
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
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
  public void test018()  throws Throwable  {
      Node node0 = new Node(160);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(32, 46).when(node1).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1);
      assertTrue(boolean0);
      assertEquals((-1), node0.getLineno());
      assertEquals(160, node0.getType());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Node node0 = NodeUtil.newUndefinedNode((Node) null);
      NodeUtil.getSourceFile(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(122, node0.getType());
      assertFalse(node0.isDelProp());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Node node0 = Node.newString((-538), "", (-538), 30);
      NodeUtil.isVarDeclaration(node0);
      assertEquals((-1), node0.getCharno());
      assertEquals((-538), node0.getType());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(node0).getString();
      doReturn(4).when(node0).getType();
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
  public void test022()  throws Throwable  {
      Node node0 = Node.newString("/YY<");
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertFalse(node0.isExprResult());
      
      boolean boolean1 = NodeUtil.isPrototypePropertyDeclaration(node0);
      assertTrue(boolean1 == boolean0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getSourcePosition());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      Node node1 = NodeUtil.newUndefinedNode((Node) null);
      assertEquals(122, node1.getType());
      
      GatherRawExports gatherRawExports0 = new GatherRawExports((AbstractCompiler) null);
      Set<String> set0 = gatherRawExports0.getExportedVariableNames();
      boolean boolean0 = NodeUtil.isValidDefineValue(node0, set0);
      assertEquals((-1), node0.getCharno());
      assertEquals(83, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Node node0 = Node.newString("+infinity", (-808), (-808));
      NodeUtil.getNearestFunctionName(node0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
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
  public void test026()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isName();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      boolean boolean0 = NodeUtil.isNameReferenced(node0, "xI;j]M|8_L/;#R!M", predicate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(88).when(node0).getType();
      int int0 = NodeUtil.getOpFromAssignmentOp(node0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(529, 17).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertFalse(boolean0);
      
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newName(codingConvention0, "TT", node1);
      GatherRawExports gatherRawExports0 = new GatherRawExports((AbstractCompiler) null);
      Set<String> set0 = gatherRawExports0.getExportedVariableNames();
      boolean boolean1 = NodeUtil.isValidDefineValue(node2, set0);
      assertEquals(38, node2.getType());
      assertEquals(0, node2.getSourcePosition());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      GatherRawExports gatherRawExports0 = new GatherRawExports((AbstractCompiler) null);
      Set<String> set0 = gatherRawExports0.getExportedVariableNames();
      boolean boolean1 = NodeUtil.isValidDefineValue(node1, set0);
      assertTrue(node1.isName());
      assertEquals((-1), node1.getLineno());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[7];
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1387, 38, 108).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Double double0 = NodeUtil.getStringNumberValue("-TRQ$HXtg,l");
      assertEquals(Double.NaN, (double)double0, 0.01);
      assertNotNull(double0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, (Node) null).when(node0).getFirstChild();
      doReturn(118).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getParent();
      doReturn(false).when(node1).isBlock();
      doReturn(false).when(node1).isFunction();
      boolean boolean0 = nodeUtil_MatchShallowStatement0.apply(node1);
      GatherRawExports gatherRawExports0 = new GatherRawExports((AbstractCompiler) null);
      Set<String> set0 = gatherRawExports0.getExportedVariableNames();
      boolean boolean1 = NodeUtil.isValidDefineValue(node0, set0);
      assertTrue(boolean1 == boolean0);
      assertEquals(83, node0.getType());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(boolean0);
      assertTrue(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(true);
      boolean boolean0 = NodeUtil.isLiteralValue(node0, true);
      assertTrue(boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Node node0 = new Node(2257);
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
  public void test038()  throws Throwable  {
      int int0 = NodeUtil.getInverseOperator(41);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      boolean boolean0 = NodeUtil.containsType(node0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      doReturn(false).when(node0).isNull();
      boolean boolean0 = NodeUtil.isNullOrUndefined(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isNull();
      boolean boolean0 = NodeUtil.isNullOrUndefined(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getNext();
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newVarNode("source_file", node0);
      // Undeclared exception!
      try { 
        NodeUtil.getPrototypePropertyName(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "TT", node0);
      NodeUtil.setDebugInformation(node1, node1, "A~%k1R@V,d");
      GatherRawExports gatherRawExports0 = new GatherRawExports((AbstractCompiler) null);
      Set<String> set0 = gatherRawExports0.getExportedVariableNames();
      NodeUtil.isValidDefineValue(node1, set0);
      assertTrue(node1.isName());
      assertEquals(0, node1.getCharno());
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Node node0 = NodeUtil.booleanNode(false);
      NodeUtil.getInputId(node0);
      assertFalse(node0.isScript());
      assertTrue(node0.isFalse());
      assertEquals((-1), node0.getSourcePosition());
      assertEquals(43, node0.getType());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("XMLHttpRequest", (Node) null);
      assertEquals((-1), node0.getSourcePosition());
      assertTrue(node0.isVar());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
      Node node0 = new Node(831);
      // Undeclared exception!
      try { 
        peepholeCollectPropertyAssignments0.error((DiagnosticType) null, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 831
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Node node0 = Node.newString("+infinity", (-808), (-808));
      Node node1 = NodeUtil.newVarNode("\"}\u0006{XYZ", node0);
      // Undeclared exception!
      try { 
        NodeUtil.getObjectLitKeyName(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unexpected node type: VAR
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(86).when(node0).getType();
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Node node0 = Node.newNumber(1459.545928163236);
      Node node1 = new Node(1872, node0, node0);
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, false, false).when(predicate0).apply(any(com.google.javascript.rhino.Node.class));
      int int0 = NodeUtil.getCount(node1, predicate0, predicate0);
      assertEquals(1872, node1.getType());
      assertEquals((-1), node1.getSourcePosition());
      assertEquals(1, int0);
      assertFalse(node1.hasMoreThanOneChild());
      
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertEquals((-1), node0.getLineno());
      assertEquals(39, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Node node0 = Node.newString("infinity");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(33, 33).when(node1).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1, abstractCompiler0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isString());
      
      boolean boolean1 = NodeUtil.isValidPropertyName("T<R");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(1062, 15).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertFalse(boolean0);
      
      Node node1 = NodeUtil.newUndefinedNode((Node) null);
      assertEquals((-1), node1.getLineno());
      assertTrue(node1.isVoid());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Integer integer0 = new Integer(865);
      Object object0 = new Object();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(integer0, object0).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "toUpperCase", node0, "_l0x");
      assertEquals(0, node1.getSourcePosition());
      assertEquals(38, node1.getType());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
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
  public void test054()  throws Throwable  {
      Node node0 = new Node(4307, 2, 103);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(true).when(node1).isCall();
      doReturn(false).when(node1).isNoSideEffectsCall();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.functionCallHasSideEffects(node1, abstractCompiler0);
      assertEquals(8295, node0.getSourcePosition());
      assertTrue(boolean0);
      assertEquals(4307, node0.getType());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(node0).isScript();
      InputId inputId0 = NodeUtil.getInputId(node0);
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(96, 65279, (-802)).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      Node node1 = new Node(39, 30, 41);
      NodeUtil.isExprCall(node1);
      assertEquals(122921, node1.getSourcePosition());
      assertEquals(39, node1.getType());
      assertEquals(41, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(false).when(node0).isFunction();
      doReturn(false).when(node0).isName();
      NodeUtil.getVarsDeclaredInBranch(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node1).getType();
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Node node0 = Node.newString("+infinity", 27, 27);
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = new NodeUtil.MayBeStringResultPredicate();
      boolean boolean0 = NodeUtil.valueCheck(node0, nodeUtil_MayBeStringResultPredicate0);
      assertEquals(110619, node0.getSourcePosition());
      assertTrue(node0.isString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Node node0 = new Node(48);
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isForIn(node0);
      assertFalse(node0.isFor());
      assertFalse(boolean1 == boolean0);
      assertEquals(48, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node0).getType();
      NodeUtil.getImpureBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Node node0 = Node.newString("/YY<");
      boolean boolean0 = node0.isOnlyModifiesThisCall();
      boolean boolean1 = NodeUtil.isSimpleOperator(node0);
      assertTrue(boolean1 == boolean0);
      assertTrue(node0.isString());
      assertEquals((-1), node0.getLineno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Node node0 = new Node(4307, 2, 103);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      boolean boolean0 = NodeUtil.isSimpleOperator(node1);
      assertTrue(boolean0);
      
      NodeUtil.MayBeStringResultPredicate nodeUtil_MayBeStringResultPredicate0 = NodeUtil.MAY_BE_STRING_PREDICATE;
      int int0 = NodeUtil.getCount(node1, nodeUtil_MayBeStringResultPredicate0, nodeUtil_MayBeStringResultPredicate0);
      assertEquals(4307, node0.getType());
      assertEquals(8295, node1.getSourcePosition());
      assertEquals(122, node1.getType());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      boolean boolean0 = NodeUtil.isLoopStructure(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn((-252), 3, 93).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      boolean boolean0 = NodeUtil.isLatin("Jz}>iO2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Node node0 = new Node(48);
      NodeUtil.mayHaveSideEffects(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionBody(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(101).when(node0).getType();
      boolean boolean0 = NodeUtil.isImmutableValue(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node1).isGetElem();
      doReturn(false).when(node1).isGetProp();
      boolean boolean1 = NodeUtil.isGet(node1);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(1062, 15).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node1 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node1, 41);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(43).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      boolean boolean0 = NodeUtil.isAssociative(47);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(node0).isGetElem();
      doReturn(false).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[0];
      Node node1 = NodeUtil.newCallNode(node0, nodeArray0);
      assertTrue(node1.isCall());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(54).when(node0).getChildCount();
      doReturn(true).when(node0).isFor();
      boolean boolean0 = NodeUtil.isForIn(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Node node0 = Node.newNumber(1459.545928163236);
      Node node1 = new Node(1872, node0, node0);
      boolean boolean0 = NodeUtil.isImmutableValue(node1);
      assertEquals(1872, node1.getType());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.isNumber());
      assertTrue(node1.hasOneChild());
      assertEquals((-1), node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidQualifiedName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(96, 65279, (-802)).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      Node node1 = new Node(39, 30, 41);
      boolean boolean0 = NodeUtil.mayBeStringHelper(node1);
      assertEquals(39, node1.getType());
      assertEquals(122921, node1.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      NodeUtil.isCommutative(43);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getParent();
      doReturn(0, 0, 0, 0).when(node0).getType();
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
  public void test077()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(1062, 15).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node1 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).getParent();
      doReturn(false).when(node2).isBlock();
      doReturn(false).when(node2).isFunction();
      boolean boolean0 = nodeUtil_MatchShallowStatement0.apply(node2);
      assertFalse(boolean0);
      assertTrue(node1.isParamList());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(101).when(node0).getType();
      NodeUtil.isImmutableValue(node0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      assertTrue(jSTypeRegistry0.shouldTolerateUndefinedValues());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(54, 31, 4).when(node0).getType();
      boolean boolean0 = NodeUtil.mayEffectMutableState(node0, (AbstractCompiler) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(1062, 15).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = NodeUtil.newQualifiedNameNode(codingConvention0, "");
      GatherRawExports gatherRawExports0 = new GatherRawExports((AbstractCompiler) null);
      Set<String> set0 = gatherRawExports0.getExportedVariableNames();
      boolean boolean1 = NodeUtil.isValidDefineValue(node1, set0);
      assertTrue(boolean1 == boolean0);
      assertTrue(node1.isName());
      assertEquals((-1), node1.getCharno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(codingConvention0).isConstant(anyString());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, (Node) null).when(node0).getProp(anyInt());
      Node node1 = NodeUtil.newName(codingConvention0, "toUpperCase", node0, "_l0x");
      boolean boolean0 = NodeUtil.canBeSideEffected(node1, (Set<String>) null);
      assertEquals(38, node1.getType());
      assertEquals(0, node1.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(54, 54, 54).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(96, 65279, (-802)).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      Node node1 = new Node(39, 30, 41);
      boolean boolean0 = NodeUtil.isBooleanResultHelper(node1);
      assertEquals(122921, node1.getSourcePosition());
      assertTrue(node1.isNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(1062, 15).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertFalse(boolean0);
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node1 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(stack0, node1.COLUMN_MASK).when(node2).getProp(anyInt());
      Node node3 = NodeUtil.newName(codingConvention0, "TT", node2);
      Node node4 = NodeUtil.numberNode((-944.6033), node3);
      assertEquals(38, node3.getType());
      assertEquals(0, node4.getCharno());
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention(jqueryCodingConvention0);
      Node node1 = NodeUtil.newQualifiedNameNode((CodingConvention) googleCodingConvention0, "aJ", node0, "aJ");
      // Undeclared exception!
      try { 
        NodeUtil.getConditionExpression(node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NAME aJ [originalname: aJ] does not have a condition.
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = NodeUtil.opToStrNoFail(18);
      assertEquals("<<", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "Gp\"Rrx\n(");
      boolean boolean0 = NodeUtil.mayBeStringHelper(node0);
      assertTrue(boolean0);
      assertEquals(38, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      int int0 = NodeUtil.precedence(30);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Node node0 = Node.newString(0, "cLw6;.SU");
      Node node1 = new Node(0, node0, node0, node0, node0, 0, 0);
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(96, 65279, (-802)).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      Node node1 = new Node(39, 30, 41);
      node1.wasEmptyNode();
      assertEquals(122921, node1.getSourcePosition());
      assertEquals(39, node1.getType());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Node node0 = Node.newString("/YY<");
      Node node1 = NodeUtil.newUndefinedNode(node0);
      assertTrue(node1.isVoid());
      assertEquals((-1), node1.getLineno());
      
      boolean boolean0 = NodeUtil.isSimpleOperator(node0);
      assertTrue(node0.isString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(node0).isGetProp();
      Node[] nodeArray0 = new Node[7];
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
  public void test093()  throws Throwable  {
      Node.newNumber(0.0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(512, 118, 97).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Node node0 = Node.newString("D", 50, 50);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not an assignment op:STRING D 50
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(239);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 239
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(node0).getType();
      NodeUtil.nodeTypeMayHaveSideEffects(node0);
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).getParent();
      doReturn(0, 0, 0, 0).when(node1).getType();
      doReturn((String) null).when(node1).toString();
      Predicate<Node> predicate0 = (Predicate<Node>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue(node1, predicate0);
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
  public void test097()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).getFirstChild();
      doReturn(970, 95, 95).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Node node0 = new Node(48);
      boolean boolean0 = NodeUtil.mayBeString(node0);
      assertTrue(boolean0);
      
      boolean boolean1 = NodeUtil.mayHaveSideEffects(node0);
      assertEquals(48, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      Node node0 = new Node(39, 30, 41);
      NodeUtil.evaluatesToLocalValue(node0, nodeUtil_MatchShallowStatement0);
      assertEquals(122921, node0.getSourcePosition());
      assertTrue(node0.isNumber());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(jqueryCodingConvention0, "Gp\"Rrx\n(");
      assertFalse(node0.isRegExp());
      
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node1 = peepholeSimplifyRegExp0.optimizeSubtree(node0);
      assertEquals((-1), node1.getCharno());
      assertEquals(38, node0.getType());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Node node0 = Node.newString("infinity");
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(node1).getFirstChild();
      doReturn(33, 33).when(node1).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node1, abstractCompiler0);
      boolean boolean1 = NodeUtil.isGet(node0);
      assertTrue(boolean1 == boolean0);
      assertEquals(40, node0.getType());
      assertEquals((-1), node0.getCharno());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(node0).getType();
      AbstractCompiler abstractCompiler0 = mock(AbstractCompiler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = NodeUtil.mayHaveSideEffects(node0, abstractCompiler0);
      assertTrue(boolean0);
      
      CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(codingConvention0).isConstant(anyString());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(node1).getProp(anyInt());
      Node node2 = NodeUtil.newName(codingConvention0, "TT", node1);
      GatherRawExports gatherRawExports0 = new GatherRawExports((AbstractCompiler) null);
      Set<String> set0 = gatherRawExports0.getExportedVariableNames();
      boolean boolean1 = NodeUtil.isValidDefineValue(node2, set0);
      assertEquals(38, node2.getType());
      assertEquals(0, node2.getSourcePosition());
      assertFalse(boolean1);
  }
}
