/*

 * Tue Mar 03 19:21:52 GMT 2020
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
import java.nio.charset.Charset;
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
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.recordVersion("b0E");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("J62Kl,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("*xS#q", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("*xS#q");
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("*xS#q", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("|GTb|m.Bb^\"G@");
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 39, 39);
      Node node0 = new Node(3000, 3000, 39);
      jSDocInfoBuilder0.markTypeNode(node0, (-253), 4182, 54, 16, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.setLendsName("");
      jSDocInfo0.getParameterType(")(391f*");
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 125, 3206);
      jSDocInfoBuilder0.markTypeNode(node0, 51, 256, 1073741824, 12, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.addSuppression("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfo0.getParameterType("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 125, 3206);
      jSDocInfoBuilder0.markTypeNode(node0, 51, 256, 1073741824, 12, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordIdGenerator();
      jSDocInfoBuilder0.recordFileOverview("M''<')D46d:sn.");
      boolean boolean0 = jSDocInfoBuilder0.recordIdGenerator();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder1.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordLends((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
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
  public void test010()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.hasParameter("");
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("$VALUES", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordInterface();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      jSDocInfoBuilder0.recordSuppressions(set0);
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 39, 39);
      jSDocInfoBuilder0.recordLends("THIS");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      jSDocInfoBuilder0.markTypeNode(node0, 51, 54, 1291, 22, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("UNKNOWN", "UNKNOWN").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      jSDocInfoBuilder0.recordFileOverview("UNKNOWN");
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("&_:jo4BX&qK-U,i5Zd'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.recordFileOverview("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder1.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordFileOverview("");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("^mtqH").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview("M''<')D46d:sn.");
      Node node0 = new Node(2899);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "&SkA5Hj5");
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning(")9.//>p~;T qS[#");
      jSDocInfoBuilder0.hasParameter("API tried to add two icompatible type tags. This should have been blacked and emitted a warning.");
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("Vr:><}_9#iB~:Gg7.JU", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordDeprecationReason("Vr:><}_9#iB~:Gg7.JU");
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecationReason("1]rSVaFmMyd~yR7yglS");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning(")9.//>p~;T qS[#");
      jSDocInfoBuilder0.hasParameter(")9.//>p~;T qS[#");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("k`]5_d/");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoShadow();
      boolean boolean0 = jSDocInfoBuilder0.recordNoShadow();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Locale locale0 = Locale.CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      jSDocInfoBuilder0.recordSuppressions(set0);
      jSDocInfoBuilder0.recordSuppressions(set0);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.jstype.BooleanType");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOverride();
      Node node0 = Node.newNumber((-2401.132235326353));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordSuppressions(set0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.hasParameter("RWn\fec");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addAuthor("rH`7]u$5");
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1741), (-3), 46, 46, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("Vr:><}_9#iB~:Gg7.JU");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("Vr:><}_9#iB~:Gg7.JU").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 0, 4095, 4096, 0, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.markName((String) null, 8, 8);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder1.recordOriginalCommentString("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder1.recordOriginalCommentString("M''<')D46d:sn.");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("r:><_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.recordReturnDescription("EvalError");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("EvalError");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.Node$NumberNode");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription(")<QkIa[ZN0c-");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("Z", (-1572), (-1572));
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterType("Z");
      jSDocInfoBuilder0.markName("sUIjYHf.ryopJU&", (-1267), (-2614));
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterType("CATCH");
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.markName("NUMBER_STRING_BOOLEAN", (-2082408384), 64);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("EvalError");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("EvalError");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("EvalError");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("EvalError");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Vr:><}_9#iB~:Gg7.JU");
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Z");
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.addReference("Z");
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("Z");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.hasParameter("The existing child node of the parent should not be null.");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.addReference("R.7cw)");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordMeaning("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordIdGenerator();
      jSDocInfoBuilder0.recordIdGenerator();
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("Vr:><}_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordFileOverview("op3k5 ");
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      // Undeclared exception!
      try { 
        jSDocInfo0.getTypeNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Z");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription(":><}_9#iB~:5Gg7.J");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("k`+9I;");
      jSDocInfoBuilder0.recordParameter("k`+9I;", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("q;i<a>nv6[sO");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("#Wi{/");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("JSDocInfo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning(")9.//>p~;T qS[#");
      jSDocInfoBuilder0.recordMeaning("API tried to add two icompatible type tags. This should have been blacked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.isDescriptionRecorded();
      assertFalse(jSDocInfoBuilder1.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1741), (-3), 46, 46, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString((-63), "node is not a child");
      jSDocInfoBuilder0.markTypeNode(node0, 8, 48, 16, 131072, true);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("@qzQu=b`}k");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Z");
      jSDocInfoBuilder0.recordMeaning("Z");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("3m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("{]L?,|m&xfA b");
      jSDocInfoBuilder0.recordMeaning((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("com.google.common.base.Predicates$AssignableFromPredicate");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Z");
      Node node0 = Node.newString(2632, "Z");
      jSDocInfoBuilder0.markTypeNode(node0, 49, 390, 53, 32768, false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("*xS#q", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("|GTb|m.Bb^\"G@");
      Node node0 = Node.newString((-1076), "^mtqH");
      jSDocInfoBuilder0.markTypeNode(node0, 2048, 3402, 368, (-1076), true);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression((String) null);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("Vr:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.markAnnotation("2%z!>", 2147, 2147);
      jSDocInfoBuilder0.markName("%7EwJ`M\"Uorcv2?pwz", (StaticSourceFile) null, 45, 29);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile(":lEB4pQ", true);
      jSDocInfoBuilder0.markName(":lEB4pQ", (StaticSourceFile) simpleSourceFile0, (-1527), (-1527));
      jSDocInfoBuilder0.recordFileOverview(":lEB4pQ");
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("k\"4lu;US");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      Node node0 = Node.newString(536870912, "com.google.javascript.rhino.Node$ObjectPropListItem");
      jSDocInfoBuilder0.markTypeNode(node0, 43, 16, 49, 143, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("Vr:><}_9#iB~:Gg7.JU");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("Vr:><}_9#iB~:Gg7.JU");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordFileOverview("UNKNOWN");
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("X8|x>9RrB`T6+ex.p");
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("Z");
      jSDocInfoBuilder0.recordReturnDescription("ooNSvM~v8rgGGe");
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.INHERITED;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("tqH");
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
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
      Node node0 = Node.newNumber((-2401.132235326353));
      jSDocInfoBuilder0.markTypeNode(node0, (-407), 4095, 30, 31, true);
      jSDocInfoBuilder0.recordLends("Vr:><}_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getSuppressions();
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder1.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder1.recordParameter(".0`J@:g~:*/", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("r:><}_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("ZER&lwZ1pr;");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("QvXYGWe");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("QvXYGWe", jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("K]wmBmF?N>^Qo5");
      jSDocInfoBuilder0.markTypeNode(node0, 46, 16, 16384, 48, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("^BI3Dd7m");
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString(4, "9MoWFgjn");
      jSDocInfoBuilder0.markTypeNode(node0, 2850, 49, (-1982292601), 31, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 131072, 131072);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      assertEquals(1, jSDocInfo0.getImplementedInterfaceCount());
      
      Node node0 = Node.newString((-2040109463), "The existing child node of the parent should not be null.");
      jSDocInfoBuilder0.markTypeNode(node0, 40, 16, 4095, (-1453), false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 51, 0, 12, 54, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfo0.getTemplateTypeNames();
      assertEquals(1, jSDocInfo0.getExtendedInterfacesCount());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Z");
      jSDocInfoBuilder0.markAnnotation("Z", (-1572), (-1572));
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1572), 127, 127, 8, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.hasParameter("The existing child node of the parent should not be null.");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 39, 39);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      jSDocInfoBuilder0.markTypeNode(node0, 51, 54, 1291, 22, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2334, 2334, 2334, 2334, false);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "6^rg0yE&F)ozF($");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "NULL");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "NULL");
      jSDocInfoBuilder0.recordInterface();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("0,4bm7");
      Node node0 = Node.newNumber(0.0, (-89), 1118);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("0,4bm7");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "0,4bm7");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterType(":lEB4pQ");
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, ":lEB4pQ");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "Js9.NKW.xy");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("$VALUES");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("r:><}_9#iB~:Gg7.JU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("Z");
      jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordReturnDescription("Vr:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordReturnDescription("Vr:><}_9#iB~:Gg7.JU");
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      boolean boolean0 = jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      assertEquals(1, jSDocInfo0.getExtendedInterfacesCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDefineType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString(1919, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      jSDocInfo0.getExtendedInterfaces();
      assertEquals(1, jSDocInfo0.getExtendedInterfacesCount());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.hasParameter("k`]5_d/");
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("Z", (-1572), (-1572));
      jSDocInfoBuilder0.markName("sUIjYHf.ryopJU&", (-1267), (-2614));
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordReturnDescription("Z");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("JOWxmvG)A");
      StaticSourceFile staticSourceFile0 = mock(StaticSourceFile.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markName("", staticSourceFile0, 45, 310);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression((String) null);
      jSDocInfoBuilder0.recordMeaning(" 9MilD)");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("negative size: ");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("I");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.hasReturnType());
      
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning(" 9MilD)");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.hasReturnType());
      
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("r:><_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("'q");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordMeaning("@^/6X;ZK1{8^6j+:x");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("{dPI|vgG;T0T%y");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("Yk");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("}McON6u;7&q 4dQOT1");
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("75J<Y");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("$VALUES", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("r:><}_9#iB~:Gg7.JU");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("BPp");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("r:><}_9#iB~:Gg7.JU");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      jSDocInfoBuilder0.recordVersion("com.google.javascript.rhino.JSDocInfo$Visibility");
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordVersion("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("0,4bm7");
      jSDocInfoBuilder0.addReference("0,4bm7");
      Node node0 = Node.newNumber(0.0, (-89), 1118);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("0,4bm7");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.hasTypedefType());
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("");
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordDescription("#Wi{/");
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 131072, 131072);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getEnumParameterType();
      Node node0 = Node.newString((-2040109463), "The existing child node of the parent should not be null.");
      jSDocInfoBuilder0.markTypeNode(node0, 40, 16, 4095, (-1453), false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      jSDocInfoBuilder0.markTypeNode((Node) null, 31, 8, 8, 15, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordPreserveTry();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordReturnDescription("");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordReturnDescription(" #Y*");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = new Node(8239, 1015, 8239);
      jSDocInfoBuilder0.addAuthor("Y2}Wc@_-@@7quIPrg");
      jSDocInfoBuilder0.markAnnotation("com.google.javascript.rhino.JSDocInfo", 44, 2);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 48, 29, (-263), (-505), true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 48
         // end-line: -263
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addAuthor("is_constant_name");
      jSDocInfoBuilder0.addAuthor("is_constant_name");
      Node node0 = Node.newString((-2104), "@qzQu=b`}k", (-2104), 128);
      jSDocInfoBuilder0.markTypeNode(node0, 55, 8, (-1968526675), 0, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordPreserveTry();
      // Undeclared exception!
      try { 
        jSDocInfo0.getTypeNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.hasParameter("Xg");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeExpression0).getRoot();
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addImplementedInterface(jSTypeExpression0);
      jSDocInfo0.getTypeNodes();
      assertEquals(1, jSDocInfo0.getImplementedInterfaceCount());
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("ea#.zv7U9");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      jSDocInfoBuilder0.isDescriptionRecorded();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newNumber((-1.0), (-1553), (-1553));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("0,4bm7");
      Node node0 = Node.newNumber(0.0, (-89), 1118);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfo0.getTemplateTypeNames();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVersion("The existing child node of the parent should not be null.");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("The existing child node of the parent should not be null.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = new Node(1213);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "CaR/d$");
      jSDocInfoBuilder1.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder1.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("e#t5:1CimcF");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("|GTb|m.Bb^\"G@");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordMeaning("PaC7ixf");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression((String) null);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.hasBaseType());
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("0,4bm7");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.recordOriginalCommentString("ARRAYLIT");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("Vr:><}_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder1.recordOriginalCommentString((String) null);
      assertFalse(jSDocInfoBuilder1.isPopulated());
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordLends("Pp&");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("}ytqpPdDM*^@0mo$");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString(1919, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeExpression0).getRoot();
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isExport());
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = new Node((-965), 1610612736, 131072);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "Vr:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordBlockDescription("Vr:><}_9#iB~:Gg7.JU");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("*xS#q", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("*xS#q", (JSTypeExpression) null);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("*xS#q", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("*xS#q", (JSTypeExpression) null);
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      boolean boolean0 = jSDocInfoBuilder0.recordModifies(set0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      jSDocInfoBuilder0.recordNoSideEffects();
      boolean boolean0 = jSDocInfoBuilder0.recordModifies((Set<String>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.addSuppression((String) null);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("e#t5:1CimcF", (JSTypeExpression) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "{!SSaY\"$a?$fZ");
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2334, 2334, 2334, 2334, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordLends("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("Xg");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.markTypeNode((Node) null, 31, 8, 8, 15, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfoBuilder0.recordSuppressions(linkedHashSet0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Locale locale0 = Locale.CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      jSDocInfoBuilder0.recordSuppressions(set0);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.jstype.BooleanType");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordMeaning("#Wi{/");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("JSDocInfo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordBlockDescription("r:><}_9#iB~:Gg7.JU");
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      jSDocInfoBuilder1.markAnnotation("r:><}_9#iB~:Gg7.JU", (-6113), (-6113));
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile((String) null, true);
      jSDocInfoBuilder1.markName("r:><}_9#iB~:Gg7.JU", (StaticSourceFile) simpleSourceFile0, (-6113), 2283);
      assertTrue(jSDocInfoBuilder1.isPopulated());
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("(jBE'MZ_,D=2_a&d`hJ");
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("z^", false);
      jSDocInfoBuilder0.markName("z^", (StaticSourceFile) simpleSourceFile0, 536870912, 16);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("??");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 125, 3206);
      jSDocInfoBuilder0.markTypeNode(node0, 51, 256, 1073741824, 12, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.addSuppression("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.hasReturnType());
      
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 39, 39);
      jSDocInfo0.getSuppressions();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      jSDocInfoBuilder0.markTypeNode(node0, 51, 54, 1291, 22, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOverride();
      Node node0 = Node.newNumber((-2401.132235326353));
      jSDocInfoBuilder0.markTypeNode(node0, (-407), 4095, 30, 31, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getSuppressions();
      assertTrue(jSDocInfo0.isOverride());
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("] H=vl!-h/v\"");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = new Node(1213);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "CaR/d$");
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordBlockDescription("d>bPHr1W");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("ARRAYLIT");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("K]wmBmF?N>^Qo5", true);
      jSDocInfoBuilder0.markName("H/r4pN&xfr3>Z7q](40", (StaticSourceFile) simpleSourceFile0, 16, 36);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("^BI(D7m");
      jSDocInfo0.getParameterType("com.google.common.collect.EmptyImmutableList");
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("");
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.hasParameter("M''<')D46d:sn.");
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      jSDocInfo0.getParameterNames();
      assertEquals(1, jSDocInfo0.getExtendedInterfacesCount());
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("0,4bm7");
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      Node node0 = Node.newNumber(0.0, (-89), 1118);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfo0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      jSDocInfo0.getParameterType("*xS#q");
      jSDocInfo0.addModifies("JSDocInfo");
      assertEquals(1, jSDocInfo0.getImplementedInterfaceCount());
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 39, 39);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      jSDocInfoBuilder0.markTypeNode(node0, 51, 54, 1291, 22, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      jSDocInfoBuilder0.markTypeNode(node0, 8198, 475, 46, 53, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("]Wb9fBO*yT4..I Mx>V", "O+ENhzCMCXMQbj").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("#Wi{/");
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = new Node(128);
      jSDocInfoBuilder0.addReference((String) null);
      jSDocInfoBuilder0.markTypeNode(node0, 2, 4, 502, 54, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview("M''<')D46d:sn.");
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression1);
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.hasReturnType());
      
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.markAnnotation("2%z!>", 2147, 2147);
      jSDocInfoBuilder0.markName("%7EwJ`M\"Uorcv2?pwz", (StaticSourceFile) null, 45, 29);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.markName("e=V8A*^6d", 35, 118);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("]Wb9fBO*yT4..I Mx>V", "O+ENhzCMCXMQbj").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("r:><_9#iB~:Gg7.JU");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordThisType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.hasParameter("");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("UNKNOWN", "UNKNOWN").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = new Node(8239, 1015, 8239);
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.isDescriptionRecorded();
      jSDocInfoBuilder0.markAnnotation("com.google.javascript.rhino.JSDocInfo", 44, 2);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 48, 29, (-263), (-505), true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 48
         // end-line: -263
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 0, 4095, 4096, 0, true);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("r:><}_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2334, 2334, 2334, 2334, false);
      jSDocInfoBuilder0.recordLends("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("R1^z.'|c5`f$R9(");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("e#t5:1CimcF", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordBlockDescription("e#t5:1CimcF");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("Y!B!4>>f[Or");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("|GTb|m.Bb^\"G@");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertFalse(jSDocInfo0.containsDeclaration());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("Z");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString("~C*A#e.za-N_Jmp");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordMeaning("*xS#q");
      jSDocInfo0.getTemplateTypeNames();
      assertEquals(1, jSDocInfo0.getImplementedInterfaceCount());
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("UNKNOWN", "UNKNOWN").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "r:><}_9#iB~:Gg7.JU");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecated();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypedefType();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "{!SSaY\"$a?$fZ");
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getThrownTypes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Z");
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Vr:><}_9#iB~:Gg7.JU");
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression((String) null);
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("|GTb|m.Bb^\"G@");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("^BI3Dd7m");
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      boolean boolean0 = jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      assertEquals(1, jSDocInfo0.getImplementedInterfaceCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfo0.getTemplateTypeNames();
      assertEquals(1, jSDocInfo0.getImplementedInterfaceCount());
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordMeaning("JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      jSDocInfo0.addSuppression((String) null);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isNoTypeCheck());
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("~PU1");
      jSDocInfoBuilder0.recordMeaning("W#]Du");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("Z", (-1572), (-1572));
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1572), 127, 127, 8, true);
      jSDocInfoBuilder0.recordDescription(":><}_9#iB~:5Gg7.J");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning(")9.//>p~;T qS[#");
      jSDocInfoBuilder0.recordLends("vrHh602JMND1WQ>Q");
      Node node0 = Node.newString(7, "rO5K??/", 7, 450);
      jSDocInfoBuilder0.markTypeNode(node0, 43, (-2516), 16, (-2024), false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 125, 3206);
      jSDocInfoBuilder0.markTypeNode(node0, 51, 256, 1073741824, 12, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 131072, 131072);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Node node0 = Node.newString((-2040109463), "The existing child node of the parent should not be null.");
      jSDocInfoBuilder0.markTypeNode(node0, 40, 16, 4095, (-1453), false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("Z");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("{dPI|vgG;T0T%y", jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("STRING");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isInterface());
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordExterns();
      // Undeclared exception!
      try { 
        jSDocInfo0.getTypeNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      // Undeclared exception!
      try { 
        jSDocInfo0.getTypeNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("m%B", 4, 1130);
      jSDocInfoBuilder0.recordBlockDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("Gwh)Sn!\"/32", true);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markName((String) null, (StaticSourceFile) simpleSourceFile0, 1130, 1048576);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markName("g", (StaticSourceFile) null, 42, 35);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("}N:2iP1:3ni");
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("}N:2iP1:3ni");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test257()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test258()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordLends("0,4bm7");
      jSDocInfoBuilder0.hasParameter("0,4bm7");
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test259()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression((String) null);
      jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isExterns());
  }

  @Test(timeout = 4000)
  public void test260()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test261()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      StaticSourceFile staticSourceFile0 = mock(StaticSourceFile.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markName("com.google.javascript.rhino.Node$NumberNode", staticSourceFile0, 0, 2468);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test262()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("0,4bm7");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test263()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString(", ...");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test264()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoTypeCheck();
      boolean boolean0 = jSDocInfoBuilder0.recordNoTypeCheck();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test265()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("QvXYGWe");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test266()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordFileOverview("qd5");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test267()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder1.recordFileOverview("VxQcm6");
      assertTrue(jSDocInfoBuilder1.isPopulatedWithFileOverview());
      
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test268()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.hasReturnType());
      
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("com.google.javascript.rhino.JSDocInfo");
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test269()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "UNKNOWN");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("|GTb|m.Bb^\"G@");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test270()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test271()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.hasReturnType());
  }

  @Test(timeout = 4000)
  public void test272()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test273()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("K]wmBmF?N>^Qo5");
      jSDocInfoBuilder0.markTypeNode(node0, 46, 16, 16384, 48, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression("^BI3Dd7m");
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test274()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PROTECTED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("7Ju!14");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test275()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordFileOverview("Lq{0yN{`J8");
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test276()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "NULL");
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "NULL");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("NULL", (JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test277()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "NULL");
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test278()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("Vr:><}_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test279()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("I");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test280()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addSuppression(".");
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test281()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isNoCompile());
  }

  @Test(timeout = 4000)
  public void test282()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression((String) null);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test283()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("The existing child node of the parent should not be null.");
      assertFalse(boolean0);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addModifies("The existing child node of the parent should not be null.");
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test284()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("e#t5:1CimcF", (JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test285()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Locale locale0 = Locale.KOREA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newNumber(0.0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("8N)|Zn8b");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test286()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("Vr:><}_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test287()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordPreserveTry();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      jSDocInfo0.getTemplateTypeNames();
      assertEquals(1, jSDocInfo0.getImplementedInterfaceCount());
  }

  @Test(timeout = 4000)
  public void test288()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference((String) null);
      jSDocInfoBuilder0.addReference((String) null);
      Node node0 = Node.newString((-450), "", 600, 600);
      jSDocInfoBuilder0.markTypeNode(node0, (-1571), 600, 116, 1024, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test289()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference("Z");
      jSDocInfoBuilder0.markAnnotation("Z", (-1572), (-1572));
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1572), 127, 127, 8, true);
      boolean boolean0 = jSDocInfoBuilder0.addReference("The existing child node of the parent should not be null.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test290()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("r:><_9#iB~:Gg7.JU");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test291()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "");
      jSDocInfoBuilder0.recordParameterDescription("The existing child node of the parent should not be null.", "The existing child node of the parent should not be null.");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, " 9MilD)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test292()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 131072, 131072);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      assertEquals(1, jSDocInfo0.getImplementedInterfaceCount());
      
      jSDocInfoBuilder0.markName("O\"mP&)&", 131072, 2479);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test293()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("Z", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("Z");
      jSDocInfoBuilder0.markAnnotation("Z", (-1572), (-1572));
      jSDocInfoBuilder0.markName("sUIjYHf.ryopJU&", (-1267), (-2614));
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test294()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("The existing child node of the parent should not be null.", 39, 39);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("R.7cw)", true);
      jSDocInfoBuilder0.markName("R.7cw)", (StaticSourceFile) simpleSourceFile0, 39, 39);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("The existing child node of the parent should not be null.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test295()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      StaticSourceFile staticSourceFile0 = mock(StaticSourceFile.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markName(", ...", staticSourceFile0, 852, 327);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter(", ...");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test296()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("ASSIGN_DIV");
      assertFalse(boolean0);
      
      jSDocInfoBuilder0.markName("ASSIGN_DIV", 53, 15);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test297()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordLends("NULL");
      boolean boolean0 = jSDocInfoBuilder0.recordNoTypeCheck();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test298()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoTypeCheck();
      jSDocInfoBuilder0.recordNoTypeCheck();
      jSDocInfoBuilder0.recordLends("6w^J^h,ZX");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("is_namespace");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test299()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("");
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test300()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString(4, "9MoWFgjn");
      jSDocInfoBuilder0.markTypeNode(node0, 2850, 49, (-1982292601), 31, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test301()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("JSDocInfo", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecationReason("R.7cw)");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test302()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecated();
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecated();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test303()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test304()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test305()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test306()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.isDescriptionRecorded();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test307()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordDescription("op3k5 ");
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test308()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.addSuppression((String) null);
      jSDocInfoBuilder0.recordMeaning(" 9MilD)");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test309()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("lXsBxfN,**U=");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      // Undeclared exception!
      try { 
        jSDocInfo0.getTypeNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test310()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("r:<_9#iB~:Gj.U");
      jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.addImplementedInterface((JSTypeExpression) null);
      // Undeclared exception!
      try { 
        jSDocInfo0.getTypeNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test311()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, ":lEB4pQ");
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "Js9.NKW.xy");
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PROTECTED;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test312()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "0,4bm7");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test313()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression1);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test314()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("");
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordDescription("#Wi{/");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test315()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameterDescription((String) null, (String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordParameterDescription((String) null, "JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test316()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDeprecationReason("R.7cw)");
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test317()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addExtendedInterface((JSTypeExpression) null);
      // Undeclared exception!
      try { 
        jSDocInfo0.getTypeNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test318()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString(1919, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeExpression0).getRoot();
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test319()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }
}
