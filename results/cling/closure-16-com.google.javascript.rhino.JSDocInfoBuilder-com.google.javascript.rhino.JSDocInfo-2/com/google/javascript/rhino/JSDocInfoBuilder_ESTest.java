/*

 * Tue Mar 03 19:21:27 GMT 2020
 */

package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class JSDocInfoBuilder_ESTest extends JSDocInfoBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression1);
      jSDocInfoBuilder0.recordVersion(")vhgfSC3V[,A|'@lA");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("WL7#v )!\"~/");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("\t\n\u000B\f\r \u0085\u1680\u2028\u2029\u205F\u3000\u00A0\u180E\u202F", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("DEBUGGER");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("The existing 1hild node of the parent should not be null.");
      jSDocInfoBuilder0.markTypeNode(node0, (-1908874352), (-553), 48, 0, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.recordTemplateTypeNames((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("mO", 102, 4263);
      jSDocInfoBuilder0.markTypeNode((Node) null, 102, 1, 2579, 4263, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.markTypeNode((Node) null, 1, 102, 102, 4263, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordIdGenerator();
      jSDocInfoBuilder0.recordFileOverview("G8@76/-)/");
      boolean boolean0 = jSDocInfoBuilder0.recordIdGenerator();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("q2S},,!");
      jSDocInfoBuilder0.recordIdGenerator();
      boolean boolean0 = jSDocInfoBuilder0.recordIdGenerator();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("com.google.javascript.rhino.JSDocInfo");
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.build(node0);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordParameter(")%Q", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("GETTER_DEF");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Locale locale0 = new Locale(":u[t&YLw~38JiW)sKE");
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      jSDocInfoBuilder0.recordSuppressions(set0);
      jSDocInfoBuilder0.recordParameter("am index ", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("am index ", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview(")vhgfSC3V[,A|'@lA");
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      Node node0 = new Node(469, 469, 8);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      assertTrue(jSDocInfo0.hasTypedefType());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getReturnType();
      jSDocInfoBuilder0.recordFileOverview((String) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordMeaning(")vhgfSC3V[,A|'@lA");
      jSDocInfoBuilder0.hasParameter(")vhgfSC3V[,A|'@lA");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder1.recordFileOverview("*L-");
      assertTrue(jSDocInfoBuilder1.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      Node node0 = Node.newNumber(3394.7738000079, 256, 256);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. his should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("FH^`>C~u}<");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordFileOverview("q2S},,!");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "at index ");
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDeprecationReason("s/Q14uzW");
      jSDocInfoBuilder0.hasParameter("NUMBER");
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecationReason("is_namespace");
      jSDocInfoBuilder0.recordParameter("is_namespace", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordDeprecationReason(";Jtf.}p?5$pq");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("is_namespace", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning(")vhgfSC3V[,A|'@lA");
      jSDocInfoBuilder0.hasParameter(")vhgfSC3V[,A|'@lA");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("Nj:g!YAd");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoShadow();
      boolean boolean0 = jSDocInfoBuilder0.recordNoShadow();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 4096, 4096, (-2028178999), (-2028178999), true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Locale locale0 = new Locale(":u[t&YLw~38JiW)sKE");
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      jSDocInfoBuilder0.recordSuppressions(set0);
      jSDocInfoBuilder0.hasParameter("\u00A0\u180E\u202F");
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.hasParameter("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfoBuilder0.recordSuppressions(linkedHashSet0);
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(linkedHashSet0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("v", (-106), 3176);
      jSDocInfoBuilder0.addAuthor("");
      jSDocInfoBuilder0.markTypeNode(node0, 3121, 4, 1, (-3062), true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordConstancy();
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("8/O:n{uJOj|(xV", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview("");
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview(")vhgfSC3V[,A|'@lA");
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview(")vhgfSC3V[,A|'@lA");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = new Node(3130);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "8=d@7[yWmT?U2&aIa:");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, (-100), 261, (-100), (-2051), true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setDescription("com.google.javascript.rhino.JSDocInfo");
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression1);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = new Node(3130);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "8=d@7[yWmT?U2&aIa:");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.markTypeNode(node0, 42, 14, (-1994091957), (-4066), true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("O,G3;\"K", true);
      jSDocInfoBuilder0.markName((String) null, (StaticSourceFile) simpleSourceFile0, 4096, 1073741824);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString(";B%A`)^>;`w**");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordLends("2z");
      jSDocInfoBuilder0.recordReturnDescription("_`.etMUL@~hb");
      Node node0 = Node.newString((-791), "2z", 131072, 512);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, ";Jtf.}p?5$pq");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfo0.getThrownTypes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("Named type with empty name component");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterType("");
      assertFalse(jSDocInfo0.isConstant());
      
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markName((String) null, 2, 2);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("_`.etMUL@~hb");
      Node node0 = Node.newString((-791), "2z", 131072, 512);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, ";Jtf.}p?5$pq");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(16, "OR");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "NC=$9i\"1\"]D))%lFZ7");
      jSDocInfoBuilder0.recordParameter("OR", jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.hasParameter("OR");
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.hasParameter("B4$A^B//\"");
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.addReference("ir");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("/BVwHf=XDS=G{lL5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference("JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("3[-Brs%Q");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordMeaning("");
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("a37@p[5IR");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("JSDocInfo");
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("d?S4lBs");
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordDescription("v");
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordMeaning(")vhgfSC3V[,A|'@lA");
      Node node0 = new Node(469, 469, 8);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      // Undeclared exception!
      try { 
        jSDocInfo0.setReturnType(jSTypeExpression1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // API tried to add two incompatible type tags. This should have been blocked and emitted a warning.
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("");
      jSDocInfoBuilder0.recordDescription("");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("#lb6BcJ8)=_HM',K;q", (JSTypeExpression) null);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("#lb6BcJ8)=_HM',K;q");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("so1ZPsMr*qGY$");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("so1ZPsMr*qGY$");
      jSDocInfoBuilder0.recordParameter(")%Q", (JSTypeExpression) null);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("GETTER_DEF");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordMeaning("set1");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("!nxx");
      jSDocInfoBuilder1.isDescriptionRecorded();
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("'`,QK,$");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("a37@p[5IR");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter(">`X&~r^", jSTypeExpression0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 38, 43, 8287, 2, true);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter(">`X&~r^", (JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = new Node(469, 469, 8);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Node node0 = Node.newNumber(0.0);
      jSDocInfoBuilder0.markTypeNode(node0, 37, 8287, (-1447), 27, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markAnnotation("slash_v", 1502, 1502);
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 0, 38, 35, (-1146), false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getTypedefType();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression1);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      assertTrue(jSDocInfo0.hasTypedefType());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("[ASSb[A&LtIN&_4\"w");
      jSDocInfoBuilder0.recordMeaning((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("cV0auHDVo3GT3)I;G=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("d?S4lBs", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "unreachable");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordLends("C>tkG");
      jSDocInfoBuilder0.recordMeaning("!nxx");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("'`,QK,$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("JSDocInfo");
      Node node0 = Node.newNumber((double) (-312));
      jSDocInfoBuilder0.markTypeNode(node0, (-4977), 43, 2902, 660, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("is_namespace");
      Node node0 = Node.newNumber((double) (-312));
      jSDocInfoBuilder0.markTypeNode(node0, 52, 40, 53, (-1908874352), false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("com.google.javascript.rhino.JSDocInfo", (-1379), 1893);
      jSDocInfoBuilder0.markName("DEBUGGER", 1, 38);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("j=v;;{z/3w7HLy:5");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview(")vhgfSC3V[,A|'@lA");
      jSDocInfoBuilder0.recordFileOverview(")vhgfSC3V[,A|'@lA");
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("\"za", false);
      jSDocInfoBuilder0.markName(".Q_q", (StaticSourceFile) simpleSourceFile0, 120, 131072);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.markTypeNode((Node) null, 8, 65, (-821), 65, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertTrue(boolean0);
      
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression1);
      boolean boolean2 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertTrue(boolean2 == boolean1);
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning(")vhgfSC3V[,A|'@lA");
      jSDocInfoBuilder0.hasParameter(")vhgfSC3V[,A|'@lA");
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("rESc)*,X$fh");
      jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PROTECTED;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplicitCast();
      boolean boolean0 = jSDocInfoBuilder0.recordImplicitCast();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 4096, 4096, (-2028178999), (-2028178999), true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression1);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      JSTypeExpression jSTypeExpression2 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression2);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression2);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder1.recordFileOverview("\n\nTree2:\n");
      assertTrue(jSDocInfoBuilder1.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("am index ");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("am index ", (JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      Node node0 = Node.newNumber(3394.7738000079, 256, 256);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. his should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordParameter(":", jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("FH^`>C~u}<");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression1);
      jSDocInfoBuilder0.recordFileOverview(")vhgfSC3V[,A|'@lA");
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      boolean boolean0 = jSDocInfo0.setDeprecationReason("s/Q14uzW");
      assertTrue(boolean0);
      
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.markTypeNode((Node) null, (-636), (-4977), 2902, 2029, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.markTypeNode((Node) null, 1, 102, 102, 4263, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("mO", 102, 4263);
      jSDocInfoBuilder0.markTypeNode((Node) null, 102, 1, 2579, 4263, true);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString((-1053), "r#la:");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2657, 1666, 8192, (-3456), true);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("3[-Brs%Q");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = new Node(3130);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "8=d@7[yWmT?U2&aIa:");
      jSDocInfoBuilder0.recordThrowDescription(jSTypeExpression0, "[c,oM");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "O,G3;\"K");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newNumber(1.0, 8, 8);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "8/O:n{uJO<j|(xV");
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression0, "AT[jGChmr(W;");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "fnH)t");
      jSDocInfoBuilder0.recordInterface();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLicense("JSDocInfo");
      jSDocInfo0.getParameterType((String) null);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "itbs^91uz8m");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "TYPEOF");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterType("$");
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "$");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "QRvDPu(xA o(b\"Z");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("r\"ESc)*,XC'h");
      jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("DEBUGGER");
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("DEBUGGER");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDefineType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setDeprecationReason("s/Q14uzW");
      jSDocInfo0.getExtendedInterfaces();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordDeprecationReason("&\"7ip-5xRk^@`.");
      jSDocInfoBuilder0.hasParameter("`j]50`WCW");
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      jSDocInfoBuilder1.markAnnotation("API tried to add two incompatible type tags. his should have been blocked and emitted a warning.", (-1874), (-4394));
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile((String) null, false);
      jSDocInfoBuilder1.markName("Z#L_", (StaticSourceFile) simpleSourceFile0, (-4394), (-4394));
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markName("VhGRcw6xJ|^A", 253, 1408);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordReturnDescription("NE");
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "C>tkG");
      jSDocInfoBuilder0.recordMeaning("!nxx");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      jSDocInfoBuilder0.recordMeaning("'`,QK,$");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("('8lnpU9");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfo0.getThrownTypes();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder1.recordOriginalCommentString("v");
      assertFalse(jSDocInfoBuilder1.isPopulated());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = new Node(3130);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "8=d@7[yWmT?U2&Ia:");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("NE");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("so1ZPsMr*qGY$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription(" is not a string node");
      jSDocInfoBuilder0.hasParameter(" is not a string node");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("VCC1m~E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      assertTrue(jSDocInfo0.hasType());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExport();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "NUMBER");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("NO_RESOLVED_TYPE");
      jSDocInfoBuilder0.recordBlockDescription("NO_RESOLVED_TYPE");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("");
      jSDocInfoBuilder0.recordBlockDescription((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("]#{0|\"");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("is_namespace");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("API tried toadd two incompatible type tags. This should have been blocked nd emitted a warning.");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordMeaning((String) null);
      jSDocInfoBuilder0.hasParameter("/BVwHf=XDS=G{lL5");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      jSDocInfoBuilder0.recordVersion("3p^%m07");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("O,G3;\"K");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.recordTemplateTypeNames((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLicense("JSDocInfo");
      jSDocInfoBuilder0.addReference("$");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterType("V");
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordDescription("so1ZPsMr*qGY$");
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("so1ZPsMr*qGY$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("mO", 102, 4263);
      jSDocInfoBuilder0.markTypeNode((Node) null, 102, 1, 2579, 4263, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getEnumParameterType();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("#1", "#1").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      jSDocInfoBuilder0.markTypeNode((Node) null, 8, (-1879048190), (-679), 1286, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordLends("Aw1\"e}ldcIH+S3@{r");
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("USz@");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("mO", 102, 4263);
      jSDocInfoBuilder0.addAuthor("mO");
      jSDocInfoBuilder0.markTypeNode((Node) null, 102, 1, 2579, 4263, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addAuthor("d?S4lBs");
      jSDocInfoBuilder0.addAuthor("JSDocInfo");
      Node node0 = Node.newString("JSDocInfo");
      jSDocInfoBuilder0.markTypeNode(node0, 38, 4, 16, 4095, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordPreserveTry();
      Node node0 = Node.newString("BsDzqg ");
      jSDocInfoBuilder0.recordLends("J");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.shouldPreserveTry());
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("so1ZPsMr*qGY$");
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("com.google.common.base.Predicates$InPreicate");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordLends((String) null);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLicense("JSDocInfo");
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVersion("JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("Q4k;_FY OcK(6^?$K");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = new Node(3130);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "8=d@7[yWmT?U2&aIa:");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("('8lnpU9");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordOriginalCommentString(")vhgfSC3V[,A|'@lA");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getModifies();
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertFalse(jSDocInfo0.containsDeclaration());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecationReason((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("@#b95kC=$6B:,s");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("v");
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordLends((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "NUMBER");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("~,!%t ~wS;");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("Named type with empty name component");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", (JSTypeExpression) null);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.jstype.InstanceObjectType", (JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Locale locale0 = new Locale(":u[t&YLw~38JiW)sKE");
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      jSDocInfoBuilder0.recordParameter("am index ", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("am index ", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordModifies(set0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression0);
      jSDocInfoBuilder0.recordNoSideEffects();
      jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordModifies((Set<String>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfo0.getThrownTypes();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("O,G3;\"K", jSTypeExpression1);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean1 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("com.google.javascript.rhino.JSDocInfo");
      Node node0 = Node.newString((-90), "com.google.javascript.rhino.JSDocInfo", (-1610612734), (-537));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("d?S4lBs");
      jSDocInfoBuilder0.markTypeNode((Node) null, (-100), 261, (-100), (-2051), true);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("W@3<x=>dHm@WVr-9q");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("mO", 102, 4263);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("mO", (JSTypeExpression) null);
      jSDocInfoBuilder0.markTypeNode((Node) null, 102, 1, 2579, 4263, true);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("d?S4lBs", (JSTypeExpression) null);
      Node node0 = Node.newString("JSDocInfo");
      jSDocInfoBuilder0.markTypeNode(node0, 38, 4, 16, 4095, true);
      assertFalse(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("so1ZPsMr*qGY$");
      jSDocInfoBuilder0.hasParameter("com.google.common.base.Predicates$InPreicate");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("number");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      StaticSourceFile staticSourceFile0 = mock(StaticSourceFile.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markName("Named type with empty name component", staticSourceFile0, 8239, 8239);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("Named type with empty name component");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("so1ZPsMr*qGY$");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("DEBUGGER");
      jSDocInfoBuilder0.recordDescription("com.google.common.collect.EmptyImmutableSet");
      Node node0 = Node.newString(38, "T4p9Aa");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("BsDzqg ");
      jSDocInfoBuilder0.markTypeNode(node0, 55296, 1353, 47, 4095, false);
      jSDocInfoBuilder0.recordLends("J");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = new Node(469, 469, 8);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      assertTrue(jSDocInfo0.hasTypedefType());
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("y\"TI", 1024, Integer.MIN_VALUE);
      Node node0 = Node.newNumber(0.0, 4177, (-1256));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getSuppressions();
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 516, (-2074), (-824), 0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 516
         // end-line: -824
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getSuppressions();
      Node node0 = Node.newString("v", (-106), 3176);
      jSDocInfoBuilder0.markTypeNode(node0, 3121, 4, 1, (-3062), true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("STRING_VALUE_OR_OBJECT_TYPE");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "NUMBER");
      jSDocInfoBuilder0.recordBlockDescription("STRING_VALUE_OR_OBJECT_TYPE");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("uB?no@1e8^n[@n");
      jSDocInfoBuilder0.recordConstructor();
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "NUMBER");
      jSDocInfoBuilder0.recordBlockDescription("uB?no@1e8^n[@n");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder1.recordOriginalCommentString("DATE_FUNCTION_TYPE");
      assertTrue(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("so1ZPsMr*qGY$");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("so1ZPsMr*qGY$");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLicense("JSDocInfo");
      jSDocInfo0.getParameterType((String) null);
      assertFalse(jSDocInfo0.isConstant());
      
      jSDocInfoBuilder0.markName("JSDocInfo", 3000, 3000);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString(16, "OR");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "NC=$9i\"1\"]D))%lFZ7");
      jSDocInfoBuilder0.recordParameter("OR", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("OR");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("is_namespace", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("");
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("D~").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordLends("");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getParameterNames();
      assertTrue(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLicense("JSDocInfo");
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordMeaning((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("C>tkG");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "C>tkG");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 38, 43, 8287, 2, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.addReference("csm#");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("[c,oM");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString((-2186), "");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "`.j@e J.'Ml7#@4_v?");
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("com.google.javascript.rhino.JSDocInfo", (-1379), 1893);
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.markName("DEBUGGER", 1, 38);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.markName("+tSnN2O]`", 0, (-1543));
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString((-2186), "");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "`.j@e J.'Ml7#@4_v?");
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("s/Q14uzW");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("CHECKED_UNKNOWN_TYPE");
      boolean boolean0 = jSDocInfoBuilder0.recordThisType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("v").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("is_namespace");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      Node node0 = Node.newString(16, "OR");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "NC=$9i\"1\"]D))%lFZ7");
      jSDocInfoBuilder0.recordParameter("OR", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("OR");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordParameter(")%Q", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("GETTER_DEF");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      Node node0 = Node.newString((-2186), "");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "`.j@e J.'Ml7#@4_v?");
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      assertTrue(jSDocInfo0.hasTypedefType());
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLicense("JSDocInfo");
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.isDescriptionRecorded();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("slash_v", 1502, 1502);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 0, 38, 35, (-1146), false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.isDescriptionRecorded();
      jSDocInfoBuilder0.markAnnotation("\n\nTree2:\n", 869, 1300);
      Node node0 = Node.newString("\n\nTree2:\n", 1638, 1300);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 42, (-169), 8, (-2216), true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 42
         // end-line: 8
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("d?S4lBs");
      jSDocInfoBuilder0.markTypeNode((Node) null, (-100), 261, (-100), (-2051), true);
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("1EW#gI", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression1);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordBlockDescription("K/>%yzR'A>?Oa '{>?~");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordBlockDescription("");
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("5D>59");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordOriginalCommentString(")vhgfSC3V[,A|'@lA");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getSuppressions();
      assertTrue(jSDocInfo0.isNoAlias());
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("am index ");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("am index ", (JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("1EW#gI", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = new Node(469, 469, 8);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfo0.getEnumParameterType();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "C>tkG");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("3r%Y[=").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("G/8:q,:tH&B/");
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getThrownTypes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordParameter("1>l", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("1>l");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordParameter("fnH)t", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("DEBUGGER");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      boolean boolean0 = jSDocInfo0.setDeprecationReason("s/Q14uzW");
      assertTrue(boolean0);
      
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.isConstant());
      
      jSDocInfoBuilder0.recordOriginalCommentString("B4$A^B//\"");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder1.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType((JSTypeExpression) null);
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("so1ZPsMr*qGY$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordMeaning("number");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordLends("");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.isExterns());
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLicense("JSDocInfo");
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("d?S4lBs");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      Node node0 = Node.newString("JSDocInfo");
      jSDocInfoBuilder0.markTypeNode(node0, 38, 4, 16, 4095, true);
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordLends("NE");
      jSDocInfoBuilder0.markTypeNode((Node) null, 3158, 94, 94, (-405), false);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("mO", 102, 4263);
      jSDocInfoBuilder0.markTypeNode((Node) null, 102, 1, 2579, 4263, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("fnH)t", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordReturnDescription("DEBUGGER");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("DEBUGGER");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("s/Q14uzW");
      jSDocInfoBuilder0.recordParameter("8/O:n{uJOj|(xV", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("at index ");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfo0.getTypeNodes();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      Node node0 = Node.newString("KvCW8]zV7tf`)1:X!hP");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("mO", 102, 4263);
      jSDocInfoBuilder0.markName("mO", 4263, 102);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription(" ");
      jSDocInfoBuilder0.markName("com.google.javascript.rhino.JSDocInfo", (StaticSourceFile) null, (-1), 37);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordDescription("so1ZPsMr*qGY$");
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("com.google.common.base.Predicates$InPreicate");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("DEBUGGER");
      Node node0 = Node.newString(38, "T4p9Aa");
      jSDocInfoBuilder0.recordNoCompile();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      jSDocInfoBuilder0.markName("O,G3;\"K", 3000, 432);
      boolean boolean0 = jSDocInfoBuilder0.recordLends(">`X&~r^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("fnH)t");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview(";");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("]@g");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString(")vhgfSC3V[,A|'@lA");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = new Node(469, 469, 8);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test257()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordOriginalCommentString("FH^`>C~u}<");
      jSDocInfo0.getEnumParameterType();
      assertTrue(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test258()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test259()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test260()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test261()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordFileOverview("rM>");
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test262()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordFileOverview("rM>");
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test263()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "");
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "STRING_TYPE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test264()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordLends("(4l");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("(4l");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test265()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test266()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeExpression0).getRoot();
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression1);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test267()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfo0.getTypeNodes();
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test268()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      Node node0 = Node.newString("v", (-106), 3176);
      jSDocInfoBuilder0.markTypeNode(node0, 3121, 4, 1, (-3062), true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test269()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("BsDzqg ");
      jSDocInfoBuilder0.recordOriginalCommentString("BsDzqg ");
      jSDocInfoBuilder0.recordLends("J");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test270()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("zn2,bq?V(dod[9");
      Set<String> set0 = jSDocInfo0.getModifies();
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test271()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test272()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference("so1ZPsMr*qGY$");
      jSDocInfoBuilder0.markTypeNode((Node) null, 256, 1408, 256, 1408, true);
      boolean boolean0 = jSDocInfoBuilder0.addReference("VhGRcw6xJ|^A");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test273()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("y\"TI", 1024, Integer.MIN_VALUE);
      Node node0 = Node.newNumber(0.0, 4177, (-1256));
      jSDocInfoBuilder0.addReference("y\"TI");
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 516, (-2074), (-824), 0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 516
         // end-line: -824
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test274()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test275()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "");
      jSDocInfoBuilder0.recordParameterDescription("STRING_TYPE", "NUMBER");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "STRING_TYPE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test276()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      jSDocInfoBuilder1.markAnnotation("API tried to add two incompatible type tags. his should have been blocked and emitted a warning.", (-1874), (-4394));
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile((String) null, false);
      jSDocInfoBuilder1.markName("Z#L_", (StaticSourceFile) simpleSourceFile0, (-4394), (-4394));
      assertTrue(jSDocInfoBuilder1.isPopulated());
  }

  @Test(timeout = 4000)
  public void test277()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("JSDocInfo");
      jSDocInfoBuilder0.markAnnotation("com.google.javascript.rhino.JSDocInfo", (-1379), 1893);
      jSDocInfoBuilder0.markName("DEBUGGER", 1, 38);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("f 'P");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test278()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.markName("JSDocInfo", 3000, 3000);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("TYPEOF");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test279()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("");
      assertFalse(boolean0);
      
      jSDocInfoBuilder0.markName("com.google.javascript.rhino.JSDocInfo", (StaticSourceFile) null, (-1), 37);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test280()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoTypeCheck();
      jSDocInfoBuilder0.recordNoTypeCheck();
      jSDocInfoBuilder0.recordDescription("a37@p[5IR");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test281()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoTypeCheck();
      jSDocInfoBuilder0.recordNoTypeCheck();
      jSDocInfoBuilder0.recordParameter("G![#+W;VQY&-", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("njA):4j&qR9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test282()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("s/Q14uzW");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("at index ");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test283()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test284()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordInterface();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("5hR wv5>!`+%>");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("y");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test285()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getModifies();
      Node node0 = Node.newString("v", (-106), 3176);
      jSDocInfoBuilder0.markTypeNode(node0, 3121, 4, 1, (-3062), true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test286()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("am index ", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("am index ", (JSTypeExpression) null);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test287()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypeNodes();
      jSDocInfoBuilder0.markTypeNode(node0, (-1908874352), (-553), 48, 0, false);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test288()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecated();
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecated();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test289()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("Aw1\"e}ldcIH+S3@{r");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test290()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test291()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("this");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test292()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("d?S4lBs");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setDescription("com.google.javascript.rhino.JSDocInfo");
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test293()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "\n\nTree2:\n");
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "\n\nTree2:\n");
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test294()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test295()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      Node node0 = Node.newString((-2186), "");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "`.j@e J.'Ml7#@4_v?");
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test296()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test297()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter(")vhgfSC3V[,A|'@lA", jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder1.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder1.recordConstructor();
      assertTrue(jSDocInfoBuilder1.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test298()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("JSDocInfo");
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordDescription("-7");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test299()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameterDescription("9-~$F[E(yr6[DF", "9-~$F[E(yr6[DF");
      boolean boolean0 = jSDocInfoBuilder0.recordParameterDescription("9-~$F[E(yr6[DF", "9-~$F[E(yr6[DF");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test300()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("NUMBER_STRING");
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("NUMBER_STRING");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test301()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("v");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfo0.getTypeNodes();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.isJavaDispatch());
  }

  @Test(timeout = 4000)
  public void test302()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("P}OAgS$BS:=s6-m");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test303()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordParameter("O<wm=fX{U_2nJ", (JSTypeExpression) null);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getThrownTypes();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }
}
