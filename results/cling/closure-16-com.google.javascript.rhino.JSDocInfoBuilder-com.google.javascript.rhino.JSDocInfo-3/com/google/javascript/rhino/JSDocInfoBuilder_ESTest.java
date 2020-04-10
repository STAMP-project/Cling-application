/*

 * Tue Mar 03 19:21:16 GMT 2020
 */

package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
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
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("c", (JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder1.recordVersion("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      boolean boolean0 = jSDocInfoBuilder1.recordVersion("c");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", jSTypeExpression1);
      jSDocInfoBuilder0.recordVersion("JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, (String) null);
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSTypeExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString(";5Lq!}[MJp>`&*hBo?", 1188, 1188);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.markTypeNode(node0, (-24), (-3410), 49, 35, true);
      jSDocInfo0.getParameterType("y WY\"$;df#\"");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PROTECTED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordFileOverview("JSDocInfo");
      jSDocInfoBuilder0.recordIdGenerator();
      boolean boolean0 = jSDocInfoBuilder0.recordIdGenerator();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordIdGenerator();
      jSDocInfoBuilder0.recordFileOverview("is_dispatcher");
      boolean boolean0 = jSDocInfoBuilder0.recordIdGenerator();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordInterface();
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = Node.newString((-254), "YWy,5", (-2431), (-1842));
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "YWy,5");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("T88g|aF5>W}O`M", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("T88g|aF5>W}O`M");
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, (String) null);
      jSDocInfoBuilder0.recordParameter("3B?8|6v+[]Xr0Y)", jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.hasParameter((String) null);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      Set<String> set0 = jSDocInfo0.getSuppressions();
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfoBuilder0.recordSuppressions(linkedHashSet0);
      jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions((Set<String>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("faFSSm");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getEnumParameterType();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(1, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 1023, 3711);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "VOID_TYPE");
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("gWcx.");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordInterface();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("i:b4ccCXQ=H");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("G$(HEaeW");
      jSDocInfoBuilder0.hasParameter("vT97uv/O]ONh L;7;");
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("Unknown class name");
      jSDocInfoBuilder0.hasParameter("{(");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("{(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("@W<IU%Y\"H", (-1), 1539);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode((Node) null, (-1), 1539, (-1), 1539, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-char: 1539
         // end-char: 1539
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoShadow();
      boolean boolean0 = jSDocInfoBuilder0.recordNoShadow();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
      
      jSDocInfoBuilder0.markTypeNode((Node) null, 1341, 1341, 1341, 25, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordLends((String) null);
      jSDocInfoBuilder0.hasParameter((String) null);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfoBuilder0.recordSuppressions(linkedHashSet0);
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions((Set<String>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.hasParameter("");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Locale locale0 = new Locale("");
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = new Node(Integer.MIN_VALUE, 1106, 1106);
      jSDocInfoBuilder0.markTypeNode(node0, 41, 29, 55296, Integer.MIN_VALUE, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.addAuthor("&YZn6");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("07_u.f*/bt^9DAfn*Q");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "a7=&JqYa2$tg#/$=");
      jSDocInfoBuilder0.recordConstancy();
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("u,[u?");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("Ep(nz2V", (-1957), (-1957));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.markTypeNode(node0, 30, 1, 0, 12, true);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("]0{&clB-lP}5'm`");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("#qn?4)M@2|!~Jfo,t-\"", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.markAnnotation("L<)", (-2414), 8192);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.markName("kYTf_Yaimx[m-u<Pq", (-2243), 8192);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.recordParameter("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder1.recordOriginalCommentString("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("6 ({xxv>};,<Uy=F,={");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, " }");
      boolean boolean1 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean1 == boolean0);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("`O'oE@%f*HObdV/8");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "]0{&clB-lP}5'm`");
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription(" is not a string node");
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, " is not a string node");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordBlockDescription("And(");
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordOriginalCommentString("k2L>)+b=,?,^");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterType("KgrY?Mi70");
      jSDocInfoBuilder0.markAnnotation("KgrY?Mi70", 36, (-409));
      jSDocInfoBuilder0.markName("KgrY?Mi70", 41, 30);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterType("]0{&clB-lP}5'm`");
      jSDocInfoBuilder0.markName("]0{&clB-lP}5'm`", (-2680), (-2680));
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription(">");
      jSDocInfoBuilder0.recordReturnDescription("");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription(">");
      jSDocInfoBuilder0.recordReturnDescription(">");
      boolean boolean0 = jSDocInfoBuilder0.recordType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("second new child has existing parent");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString(1, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 1023, 3711);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "VOID_TYPE");
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("gWcx.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference(".nDx$:c)C77tnm0j+");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("3B?8|6v+[]Xr0Y)");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      boolean boolean1 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(boolean1 == boolean0);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, (String) null);
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSTypeExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("mr< N@");
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newNumber(0.0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      // Undeclared exception!
      try { 
        jSDocInfo0.setEnumParameterType((JSTypeExpression) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // API tried to add two incompatible type tags. This should have been blocked and emitted a warning.
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("com.google.javascript.rhino.JSDocInfo");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("jAqN,1e7sc|s1k)|k");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("T88g|aF5>W}O`M", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("T88g|aF5>W}O`M");
      jSDocInfoBuilder0.recordDescription("0lnd_");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("position (");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.isDescriptionRecorded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("9?9]", 262113, (-3691));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2, 2, 2, 3301, true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      ImmutableList<String> immutableList0 = jSDocInfo0.getTemplateTypeNames();
      assertEquals(0, immutableList0.size());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      jSDocInfoBuilder0.recordVersion("jAqN,1e7sc|s1k)|k");
      jSDocInfoBuilder0.recordVersion((String) null);
      boolean boolean0 = jSDocInfoBuilder1.recordVersion("parts");
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "faFSSm");
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "gtQK@AK}er{nbt>{");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("directives", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("T88g|aF5>W}O`M", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("T88g|aF5>W}O`M");
      Node node0 = Node.newString((-1079), "", 1683, 215);
      jSDocInfoBuilder0.markTypeNode(node0, 4, 40, 35, 3775, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      Node node0 = new Node((-531));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("Uv\u0006e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("L<)", (-2414), 8192);
      jSDocInfoBuilder0.markName("kYTf_Yaimx[m-u<Pq", (-2243), 8192);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("kYTf_Yaimx[m-u<Pq");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("is_dispatcher");
      jSDocInfoBuilder0.markName("]0{&clB-lP}5'm`", (-2680), (-2680));
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      jSDocInfo0.getParameterNames();
      assertEquals(1, jSDocInfo0.getExtendedInterfacesCount());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2, 2, 2, 3301, true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Set<String> set0 = jSDocInfo0.getParameterNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordInterface();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview("lCgS3");
      jSDocInfoBuilder0.recordParameter("directives", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.jstype.PrototypeObjectType");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordReturnDescription("@W<IU%Y\"H");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("b\"H>lJ3e@Lb");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplicitCast();
      boolean boolean0 = jSDocInfoBuilder0.recordImplicitCast();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"&N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getSuppressions();
      jSDocInfoBuilder0.markTypeNode(node0, Integer.MIN_VALUE, 48, 37, 4095, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("3B?8|6v+[]Xr0Y)", (JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordParameter("3B?8|6v+[]Xr0Y)", (JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("]0{&clB-lP}5'm`");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordFileOverview("");
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.", jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "Error");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newNumber(0.0);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.markTypeNode(node0, 15, 36, (-2011), 42, false);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      Node node0 = Node.newNumber((double) 1490, 878, 2755);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("o%&F>aQ D):");
      assertFalse(boolean0);
      
      Node node0 = Node.newString("Ep(nz2V", (-1957), (-1957));
      jSDocInfoBuilder0.markTypeNode(node0, 30, 1, 0, 12, true);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "~4w\"f1ZI<m%vxLX");
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "O*|Lj.&V<,Ay4 ");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "");
      jSDocInfoBuilder0.recordInterface();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "Ul_F*9~r7OVUt");
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      jSDocInfoBuilder1.recordThrowDescription((JSTypeExpression) null, "vT97uv/O]ONh L;7;");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("vT97uv/O]ONh L;7;");
      boolean boolean0 = jSDocInfoBuilder1.recordThrowDescription((JSTypeExpression) null, "NEG");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterType("4~0Qvi/U");
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "faFSSm");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "gtQK@AK}er{nbt>{");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecationReason("L<)");
      jSDocInfoBuilder0.recordDeprecationReason("L<)");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription(">");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription(">");
      jSDocInfoBuilder0.recordReturnDescription(">");
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordReturnDescription(">n}iuaOgz<");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription(".)q,}YL4bA-6i~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("|vX~= v", 4867, 4867);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, ".Q=B'9=lpDp-:b");
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("|vX~= v");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, (String) null);
      jSDocInfoBuilder0.recordParameter("3B?8|6v+[]Xr0Y)", jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      jSDocInfoBuilder1.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter((String) null);
      boolean boolean0 = jSDocInfoBuilder1.recordConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.hasParameter("jAqN,1e7sc|s1k)|k");
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("\n", true);
      jSDocInfoBuilder0.markName("\n", (StaticSourceFile) simpleSourceFile0, 131072, 131072);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("/>\"lTuWWF*kDd$Fm");
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Set<String> set0 = jSDocInfo0.getParameterNames();
      assertFalse(set0.contains("API tried to add two incompatible type tags. This should have been blocked and emitted a warning."));
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordMeaning((String) null);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning((String) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Set<String> set0 = jSDocInfo0.getParameterNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = Node.newString((-254), "YWy,5", (-2431), (-1842));
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "YWy,5");
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      Collection<Node> collection0 = jSDocInfo0.getTypeNodes();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      jSDocInfoBuilder0.hasParameter("jAqN,1e7sc|s1k)|k");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("F8Gp|Z?8C_Gcvy\"DW");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("JSDocInfo");
      jSDocInfoBuilder0.recordBlockDescription((String) null);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "|[W5K]R");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("eIC,&?FfF,mo");
      jSDocInfoBuilder0.recordBlockDescription("\"fY");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter(";5Lq!}[MJp>`&*hBo?", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter(";5Lq!}[MJp>`&*hBo?");
      jSDocInfoBuilder0.recordMeaning("/>\"lTuWWF*kDd$Fm");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("\"=&iNBk,445}O5H");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("x", jSTypeExpression0);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("5");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("xPn(IweFWL[.v\n`a");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      jSDocInfoBuilder0.recordVersion("/>\"lTuWWF*kDd$Fm");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("vT97uv/O]ONh L;7;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.forLanguageTag("JSDocInfo");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      boolean boolean0 = jSDocInfoBuilder0.recordConsistentIdGenerator();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.addReference("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString(";5Lq!}[MJp>`&*hBo?", 1188, 1188);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("y WY\"$;df#\"");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordThisType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertTrue(boolean0);
      
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      assertNotNull(jSTypeExpression1);
      assertFalse(jSDocInfo0.isConstant());
      assertTrue(jSDocInfo0.containsDeclaration());
      assertFalse(jSDocInfo0.isConstructor());
      
      jSDocInfoBuilder0.markTypeNode(node0, 32, 15, 51, 4095, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("Ep(nz2V", (-1957), (-1957));
      jSDocInfoBuilder0.markTypeNode(node0, 30, 1, 0, 12, true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getReturnType();
      assertNull(jSTypeExpression0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      Node node0 = Node.newNumber(0.0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      // Undeclared exception!
      try { 
        jSDocInfo0.setEnumParameterType((JSTypeExpression) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // API tried to add two incompatible type tags. This should have been blocked and emitted a warning.
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordInterface();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordReturnDescription("P/VG;EcT;8TKb.uj");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordReturnDescription(">");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addAuthor("Ef$FId`MYD4%>_");
      jSDocInfoBuilder0.addAuthor((String) null);
      Node node0 = Node.newNumber((-1144.01364));
      jSDocInfoBuilder0.markTypeNode(node0, 1620, 2, 702, Integer.MIN_VALUE, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.INHERITED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVersion("JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("IMcq0zhk-\"'&-N:R");
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Collection<Node> collection0 = jSDocInfo0.getTypeNodes();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.", "API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("k2L>)+b=,?,^");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertFalse(jSDocInfo0.containsDeclaration());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordOriginalCommentString("]0{&clB-lP}5'm`");
      Set<String> set0 = jSDocInfo0.getModifies();
      assertFalse(set0.contains("]0{&clB-lP}5'm`"));
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder1.recordOriginalCommentString("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("");
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordBlockDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("AU-");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PROTECTED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter(";5Lq!}[MJp>`&*hBo?", (JSTypeExpression) null);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = jSDocInfoBuilder0.recordModifies(linkedHashSet0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("]0{&clB-lP}5'm`", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("And(", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoSideEffects();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = jSDocInfoBuilder0.recordModifies(linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newNumber((-339.29356), 5, 5);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      Set<String> set0 = jSDocInfo0.getParameterNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.forLanguageTag("TC%dG*Ec1au>lp|N=aj");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, (String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = Node.newString((-254), "YWy,5", (-2431), (-1842));
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "YWy,5");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2, 2, 65536, 3301, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.jstype.PrototypeObjectType");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newNumber(0.0);
      jSDocInfoBuilder0.recordLends("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.markTypeNode(node0, 15, 36, (-2011), 42, false);
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("Unknown class name");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("{(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = new Node(1861, 512, 512);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "[]");
      jSDocInfoBuilder0.recordThisType(jSTypeExpression1);
      jSDocInfoBuilder0.recordMeaning("[]");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("[]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("_J");
      jSDocInfoBuilder0.markName((String) null, 45, 51);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Set<String> set0 = jSDocInfo0.getParameterNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("|[W5K]R");
      jSDocInfoBuilder0.recordDescription("boqOR'yt");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString((-3754), "jGI", (-2448), (-3754));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      Node node0 = new Node(4846, 4846, (-1944));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.isNoAlias());
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("~l+IoR?m34n");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getSuppressions();
      jSDocInfoBuilder0.markTypeNode(node0, 35, (-559), 16, (-653), true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.", "API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordBlockDescription("IMcq0zhk-\"'&-N:R");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.documentBlock("");
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordBlockDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "]0{&clB-lP}5'm`");
      jSDocInfoBuilder0.recordOriginalCommentString("]0{&clB-lP}5'm`");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("Ep(nz2V", (-1957), (-1957));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("]0{&clB-lP}5'm`");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("");
      jSDocInfo0.getParameterType("j`");
      assertFalse(jSDocInfo0.isConstant());
      
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("", false);
      jSDocInfoBuilder0.markName("j`", (StaticSourceFile) simpleSourceFile0, 65500, 65500);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter(";5Lq!}[MJp>`&*hBo?", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.hasParameter(";5Lq!}[MJp>`&*hBo?");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, (String) null);
      jSDocInfoBuilder0.recordParameter("3B?8|6v+[]Xr0Y)", jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.hasParameter((String) null);
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("TYPEOF").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoAlias();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      jSDocInfo0.getParameterNames();
      assertEquals(1, jSDocInfo0.getExtendedInterfacesCount());
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordDescription("");
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.isDeprecated());
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2, 2, 65536, 3301, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordMeaning((String) null);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordDescription("");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference((String) null);
      Node node0 = new Node(Integer.MIN_VALUE, 1106, 1106);
      jSDocInfoBuilder0.markTypeNode(node0, 41, 29, 55296, Integer.MIN_VALUE, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "]0{&clB-lP}5'm`");
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      jSDocInfoBuilder1.recordThisType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder1.recordThisType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("|vX~= v", 4867, 4867);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, ".Q=B'9=lpDp-:b");
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("|vX~= v");
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = new Node(4846, 4846, (-1944));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.markName("INHERITED", (StaticSourceFile) null, 3869, 3869);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.", "API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("[]");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("]0{&cclO}6z5'm`").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("@7,{(gD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.hasParameter("/>\"lTuWWF*kDd$Fm");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordParameter("c", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.hasParameter("vT97uv/O]ONh L;7;");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newNumber(0.0);
      jSDocInfoBuilder0.markTypeNode(node0, 15, 36, (-2011), 42, false);
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"&N:R");
      Node node0 = Node.newString("IMcq0zhk-\"&N:R");
      jSDocInfoBuilder0.markTypeNode(node0, Integer.MIN_VALUE, 48, 37, 4095, true);
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getThisType();
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("directives", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordBlockDescription("_J");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
      
      jSDocInfoBuilder0.recordOriginalCommentString("]0{&cclO}6z5'm`");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("u'}N}=UIg3B'f%W@nk.");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("07_u.f*/bt^9DAfn*Q");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "a7=&JqYa2$tg#/$=");
      jSDocInfoBuilder0.recordParameter("AapeemdmQ128QIk", jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("a7=&JqYa2$tg#/$=");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder1.recordParameter("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.", jSTypeExpression0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder1.recordOriginalCommentString("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("JRWG_6IlZnR9");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PROTECTED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getThrownTypes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordParameter("c", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("vT97uv/O]ONh L;7;");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordExterns();
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      jSDocInfo0.getTemplateTypeNames();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "]0{&clB-lP}5'm`");
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfo0.getParameterNames();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.isJavaDispatch());
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfo0.getTemplateTypeNames();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newNumber(0.0);
      jSDocInfoBuilder0.markTypeNode(node0, 15, 36, (-2011), 42, false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      Node node0 = new Node(Integer.MIN_VALUE, 1106, 1106);
      jSDocInfoBuilder0.markTypeNode(node0, 41, 29, 55296, Integer.MIN_VALUE, true);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("_J");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
      
      Node node0 = Node.newNumber(0.0, (-2021), (-2021));
      jSDocInfoBuilder0.markTypeNode(node0, (-2028178999), 3472, 12, 46, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("DATE_TYPE");
      jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", (JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("directives", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("");
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("");
      jSDocInfo0.getTypeNodes();
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.markAnnotation("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 51, (-1727));
      jSDocInfoBuilder0.markName("j`", 48, 29);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("eIC,&?FfF,mo");
      jSDocInfoBuilder0.recordBlockDescription("\"fY");
      jSDocInfoBuilder0.markName("\"fY", (StaticSourceFile) null, 2, 264);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("2T$$CMb");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("");
      jSDocInfo0.getTypeNodes();
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getParameterNames();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("07_u.f*/bt^9DAfn*Q").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression1);
      jSDocInfoBuilder0.markName("Eqgc7G98", 64, 64);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString("");
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordThisType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder1.recordFileOverview((String) null);
      JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordFileOverview("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfo0.getTypedefType();
      jSDocInfoBuilder1.recordOriginalCommentString("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean1 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfo0.getTypedefType();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.hasTypedefType());
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      Node node0 = new Node(4846, 4846, (-1944));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "O*|Lj.&V<,Ay4 ");
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "vT97uv/O]ONh L;7;");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("vT97uv/O]ONh L;7;", (JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("|[W5K]R");
      jSDocInfoBuilder0.recordConstructor();
      Node node0 = Node.newString((-3754), "jGI", (-2448), (-3754));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstancy();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getParameterNames();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("");
      jSDocInfo0.getTypeNodes();
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordParameter("/>\"lTuWWF*kDd$Fm", (JSTypeExpression) null);
      jSDocInfo0.addModifies("/>\"lTuWWF*kDd$Fm");
      jSDocInfoBuilder0.hasParameter(";5Lq!}[MJp>`&*hBo?");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      jSDocInfo0.getParameterNames();
      assertEquals(1, jSDocInfo0.getExtendedInterfacesCount());
      
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      Node node0 = Node.newString("IMcq0zhk-\"'&-N:R");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder1.recordOriginalCommentString("API tried to add two incompati<le type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordModifies((Set<String>) null);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getParameterType((String) null);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(linkedHashSet0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      Node node0 = Node.newString("jAqN,1e7sc|s1k)|k");
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "jAqN,1e7sc|s1k)|k");
      jSDocInfoBuilder0.recordParameter("A$pL", jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("");
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions((Set<String>) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      Node node0 = Node.newString(1665, "H9Je");
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "H9Je");
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression1);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference((String) null);
      Node node0 = new Node(Integer.MIN_VALUE, 1106, 1106);
      jSDocInfoBuilder0.markTypeNode(node0, 41, 29, 55296, Integer.MIN_VALUE, true);
      boolean boolean0 = jSDocInfoBuilder0.addReference((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("IMcq0zhk-\"'&-N:R");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "DATE_TYPE");
      jSDocInfoBuilder0.recordParameterDescription("", "");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "xG");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test257()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("07_u.f*/bt^9DAfn*Q");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "a7=&JqYa2$tg#/$=");
      jSDocInfoBuilder0.recordThrowDescription(jSTypeExpression0, "]0{&clB-lP}5'm`");
      jSDocInfoBuilder0.recordParameterDescription((String) null, "07_u.f*/bt^9DAfn*Q");
      boolean boolean0 = jSDocInfoBuilder0.recordParameterDescription((String) null, "JSDocInfo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test258()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.markName("$z", 0, 2208);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test259()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("J9", 3711, (-4579));
      Node node0 = Node.newString(1, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 1023, 3711);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "VOID_TYPE");
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      jSDocInfoBuilder0.markName("VOID_TYPE", 29, 15);
      jSDocInfoBuilder0.hasParameter("gWcx.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test260()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.hasParameter("P/.");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("j`", (-25), (-25));
      jSDocInfoBuilder0.markName("com.google.javascript.rhino.jstype.ProxyObjectType", Integer.MIN_VALUE, (-25));
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test261()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.markName("$z", 0, 2208);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordLends("JSDocInfo");
      jSDocInfoBuilder0.hasParameter("Uv\u0006e");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test262()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markName("And(", (-2013265918), (-2389));
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("u'}N}=UIg3B'f%W@nk.");
      assertFalse(boolean0);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test263()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordNoTypeCheck();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test264()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("Error");
      jSDocInfoBuilder0.recordNoTypeCheck();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordNoTypeCheck();
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test265()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("IMcq0zhk-\"'&-N:R");
      jSDocInfoBuilder0.recordDescription("F8Gp|Z?8C_Gcvy\"DW");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("F8Gp|Z?8C_Gcvy\"DW");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test266()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(";5Lq!}[MJp>`&*hBo?", 1188, 1188);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getModifies();
      jSDocInfoBuilder0.markTypeNode(node0, (-24), (-3410), 49, 35, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test267()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("8]d7_Y_wlo3U&v[kT", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("8]d7_Y_wlo3U&v[kT", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecationReason("directives");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test268()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecated();
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecated();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test269()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordParameter("3B?8|6v+[]Xr0Y)", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test270()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.isDescriptionRecorded();
      assertFalse(jSDocInfoBuilder1.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test271()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("2z_l_e+L5jTcfx+");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test272()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "sho*LW?2u]e");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "sho*LW?2u]e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test273()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "jSLm!");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test274()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test275()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, (String) null);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      jSDocInfoBuilder1.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder1.recordConstructor();
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test276()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test277()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test278()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test279()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("");
      jSDocInfo0.getTypeNodes();
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }
}
