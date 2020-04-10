/*

 * Tue Mar 03 19:21:41 GMT 2020
 */

package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      
      jSDocInfoBuilder0.recordVersion("00b|HZBt,M&.;F");
      jSDocInfoBuilder0.recordParameter("00b|HZBt,M&.;F", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("F#7U`q4;I2Z");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordVersion("F'B@}Q\"v3jMd(;?y");
      jSDocInfoBuilder0.recordParameter("z3''2Bt", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordVersion(",o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("T<3J-<i&u8q");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("+\";Ghx$,u", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("+\";Ghx$,u");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.addModifies("");
      jSDocInfo0.getParameterType("");
      jSDocInfoBuilder0.markTypeNode((Node) null, 1904, 1904, 1904, 110, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PROTECTED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.markTypeNode((Node) null, (-848), (-848), (-848), (-848), true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("+\";Ghx$,u");
      jSDocInfoBuilder0.recordIdGenerator();
      boolean boolean0 = jSDocInfoBuilder0.recordIdGenerator();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      boolean boolean1 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("t/Ye");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("already specified useForNull", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("already specified useForNull");
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("r_h#1nzb5%G+", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.hasParameter("xjHV2Nwfvz");
      assertFalse(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("z3''2Bt");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      Set<String> set0 = jSDocInfo0.getModifies();
      jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordFileOverview("|");
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("z3''2Bt");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("-9 <%!%oId");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordFileOverview(";fv,D/'\"8[CgcRzZ`A");
      Node node0 = Node.newNumber(1.0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("0kY;yP:Wt=)/;L_7:");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordDescription("j)(}6dcSiLN~Zh%");
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter(",Moc\"#S", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordDeprecationReason("B*\rf");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter(",Moc\"#S", (JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecationReason("!1!#X8W~yd.BK*:w5");
      jSDocInfoBuilder0.recordDeprecationReason("!1!#X8W~yd.BK*:w5");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("kp++(l_Z9{rUH", (JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("z3''2Bt");
      jSDocInfoBuilder0.recordMeaning("z3''2Bt");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("z3''2Bt");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoShadow();
      boolean boolean0 = jSDocInfoBuilder0.recordNoShadow();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.markAnnotation("*#W^On+X7I*?}H .", (-482), 300);
      Node node0 = Node.newString(300, "<%_Q+xr;j6Ev:\"Z0l", 16384, (-482));
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getModifies();
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 45, 1, 29, 4, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 45
         // end-line: 29
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(45, "*#W^On+X7I*?}H .", (-1278), 45);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getModifies();
      jSDocInfoBuilder0.markTypeNode(node0, (-2298), 31, (-568), 52, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Locale locale0 = Locale.forLanguageTag("J+?");
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      jSDocInfoBuilder0.recordSuppressions(set0);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("u");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.hasParameter((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addAuthor("u");
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1932735281), (-1932735281), (-987), (-2375), false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.recordConstancy();
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("z3''2Bt", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter("z3''2Bt", (JSTypeExpression) null);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview("Qfi=V");
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = new Node(4);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "com.google.javascrip.rhino.JSDocInfo");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.markTypeNode(node0, 4, 16, 4095, 40, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.markName("0Q.Bg*o(aA{", 8, (-1267));
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("IsEqualTo(");
      jSDocInfoBuilder0.recordOriginalCommentString("VMocp#S");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("0Q.Bg*o(aA{");
      boolean boolean0 = jSDocInfoBuilder0.recordInterface();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString("'26z++!$h?tux1B&Z(b");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString("Jc/!7R5`");
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      Node node0 = Node.newNumber(1613.52929533031);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "f3B^pB!T{");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      Node node0 = Node.newString(512, "", 512, 512);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "");
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression1);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("=Q<l*EjZ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("F3=$bei)Q");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterType("2-|R:iJ3YP`F");
      jSDocInfoBuilder0.markName("com.google.javascript.rhino.JSDocInfo", 3012, 3012);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("xjHV2Nwfvz");
      jSDocInfoBuilder0.recordReturnDescription("...[");
      boolean boolean0 = jSDocInfoBuilder0.recordType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(512, "", 512, 512);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "");
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter((String) null);
      boolean boolean0 = jSDocInfoBuilder0.addReference("{...}");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference((String) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter(";fv,D/'\"8[CgcRzZ`A");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newNumber((-1787.2103446563963));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("&");
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordIdGenerator();
      jSDocInfoBuilder0.recordIdGenerator();
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("com.google.common.collect.Lists$TransformingRandomAccessList");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDeprecationReason("hfyJ0");
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.isDescriptionRecorded();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("*#W^On+X7I*?}H .");
      jSDocInfoBuilder0.recordParameter("already specified useForNull", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("already specified useForNull");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(512, "", 512, 512);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("RANGE_ERROR_FUNCTION_TYPE");
      boolean boolean1 = jSDocInfoBuilder0.hasParameter((String) null);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("u");
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(boolean1);
      
      jSDocInfoBuilder0.recordMeaning("");
      boolean boolean2 = jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      assertFalse(jSDocInfoBuilder0.isJavaDispatch());
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean2 == boolean0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("z3''2Bt");
      jSDocInfoBuilder0.recordMeaning("z3''2Bt");
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordDescription("z3''2Bt");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.markAnnotation("com.google.common.collect.Maps", (-1), (-1));
      jSDocInfoBuilder0.recordParameter("oLP,~qE98!h", jSTypeExpression0);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode((Node) null, 524288, 50, 12, 35, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 524288
         // end-line: 12
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfo0.getReturnType();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      jSDocInfoBuilder0.markTypeNode((Node) null, 354, 2298, 354, 2298, false);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.isInterface());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("u");
      jSDocInfoBuilder0.recordDescription("; :7)itpf");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression0, "com.google.javascript.rhino.JSDocInfo");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.JSTypeExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      jSDocInfoBuilder1.recordMeaning("z3''2Bt");
      jSDocInfoBuilder1.recordMeaning("=>2Q(1BC>polV");
      boolean boolean0 = jSDocInfoBuilder0.recordLends((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("5%!@", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("00b|HZBt,M&.;F");
      Node node0 = new Node(131072);
      jSDocInfoBuilder0.markTypeNode(node0, 48, 27, 53, 37, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfo0.setSuppressions(linkedHashSet0);
      jSDocInfo0.getParameterNames();
      Node node0 = Node.newNumber((-1787.2103446563963));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterNames();
      Node node0 = Node.newNumber((-1787.2103446563963));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecationReason("lOp}T");
      jSDocInfoBuilder0.hasParameter("");
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("Fj", 1639, (-1566));
      jSDocInfoBuilder0.markName("6b'pVP;{-8ix7", (-2021161078), (-1566));
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("u");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("#Z_n})c;");
      jSDocInfoBuilder0.recordFileOverview("");
      jSDocInfoBuilder0.markName("JSDocInfo", (-1444), 480);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      jSDocInfoBuilder0.markTypeNode((Node) null, 354, 2298, 354, 2298, false);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.isConsistentIdGenerator());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("&");
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "`/0qQsZc+");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("PmW'oo?X`+~5h\"\"u f");
      jSDocInfoBuilder0.hasParameter("J+kWDe");
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("1u?zK`cGZ");
      jSDocInfoBuilder0.recordReturnDescription("1u?zK`cGZ");
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplicitCast();
      boolean boolean0 = jSDocInfoBuilder0.recordImplicitCast();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.addModifies("");
      jSDocInfoBuilder0.markTypeNode((Node) null, 53, (-1), 51, 8, true);
      jSDocInfo0.getSuppressions();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("+\";Ghx$,u", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("CATCH", (JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordFileOverview(";fv,D/'\"8[CgcRzZ`A");
      Node node0 = Node.newNumber(1.0);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("CATCH", (JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.addModifies("");
      jSDocInfo0.getExtendedInterfaces();
      jSDocInfoBuilder0.markTypeNode((Node) null, 1904, 1904, 1904, 110, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      Node node0 = Node.newString("1L", 849, 0);
      jSDocInfoBuilder0.markTypeNode(node0, 8, 1610612736, 2, 47, true);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("3#cjc#Ux1#N1R%");
      assertFalse(boolean0);
      
      Node node0 = Node.newNumber(0.0, 1596, 1596);
      jSDocInfoBuilder0.markTypeNode(node0, 40, 27591, 2629, (-1932735281), false);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder1.recordThrowDescription((JSTypeExpression) null, "|G^FN3e");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "uAip?G'%Xp2@mhG7l:");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordInterface();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowDescription(jSTypeExpression0, "cg)}12mbfkC");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.addModifies("");
      jSDocInfo0.getParameterType("");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, ";4{a\"QMi ");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterType((String) null);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, (String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "C");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("1u?zK`cGZ");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("1u?zK`cGZ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("xjHV2Nwfvz");
      jSDocInfoBuilder0.recordTypedef((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("...[");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordReturnDescription("&DTX>$8DOsoTdqT");
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordReturnDescription("&DTX>$8DOsoTdqT");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("oLP,~qE98!h");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      Node node0 = Node.newString("%I>Hz", (-1737), (-2013265951));
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, ")UEY&o|:qKM");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "*#W^On+X7I*?}H .");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Node node0 = Node.newNumber(1613.52929533031);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "f3B^pB!T{");
      jSDocInfo0.declareThrows(jSTypeExpression0);
      jSDocInfo0.getExtendedInterfaces();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("C4c'QB0#y'(](1b6hpz");
      jSDocInfoBuilder0.markName("xjHV2Nwfvz", 1508, 1508);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("JSDocInfo");
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setSuppressions((Set<String>) null);
      Set<String> set0 = jSDocInfo0.getParameterNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("z3''2Bt");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression1);
      Node node0 = Node.newString("%I>Hz", (-1737), (-2013265951));
      JSTypeExpression jSTypeExpression2 = new JSTypeExpression(node0, ")UEY&o|:qKM");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordDescription("e7tB:zE<N8h&r,Umh");
      jSDocInfoBuilder0.recordDescription("ReferenceError");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("expected one element but was: <");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("2-|R:iJ3YP`F");
      Node node0 = Node.newNumber(2565.389059436, 618, 520);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "ASSIGN_MOD");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getType();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstancy();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription(",Moc\"#S");
      jSDocInfoBuilder0.hasParameter("s5X ");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("7,-?([Mxq");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("z3''2Bt");
      jSDocInfoBuilder0.recordBlockDescription("z3''2Bt");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("");
      jSDocInfoBuilder0.recordParameter("+\";Ghx$,u", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("+\";Ghx$,u");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(512, "", 512, 512);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "");
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Collection<Node> collection0 = jSDocInfo0.getTypeNodes();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordVersion("00b|HZBt,M&.;F");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      jSDocInfoBuilder0.recordVersion("F#7U`q4;I2Z");
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
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
  public void test113()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.addReference("(H;Ig1ofs@:]CV");
      jSDocInfoBuilder0.recordDescription("NEG");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getParameterType("");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordDescription("&");
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getType();
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("U>qL", (-1), (-1));
      Node node0 = Node.newString("J+kWDe");
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 524288, 16, 512, 524288, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 524288
         // end-line: 512
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.containsDeclaration());
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      jSDocInfoBuilder0.markTypeNode(node0, 32, 261, 32, (-2013265918), true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      jSDocInfoBuilder0.markTypeNode((Node) null, 354, 2298, 354, 2298, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getType();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      jSDocInfoBuilder0.recordSuppressions(set0);
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newNumber((-1787.2103446563963));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("JpPUrBky-YW");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("hi87");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("URI_ERROR_TYPE", 512, 512);
      jSDocInfoBuilder0.addAuthor("5~,[*|he.0V5KDQ\"tHR");
      jSDocInfoBuilder0.addAuthor("9=#G~:`");
      jSDocInfoBuilder0.markTypeNode((Node) null, 2, (-1465), 1024, (-3462), true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("com.google.javascript.rhino.jstype.ObjectType$Property");
      jSDocInfoBuilder0.addAuthor("");
      jSDocInfoBuilder0.markTypeNode(node0, 65536, 46, 65535, 37, true);
      boolean boolean0 = jSDocInfoBuilder0.addAuthor((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Collection<Node> collection0 = jSDocInfo0.getTypeNodes();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfo0.setSuppressions(linkedHashSet0);
      jSDocInfo0.getParameterNames();
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordLends("0kY;yP:Wt=)/;L_7:");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("Gbc?-od");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordDescription("&");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder1.recordLends("lOp}T");
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      Node node0 = Node.newString(986, "N<LB(3*t");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfo0.getTemplateTypeNames();
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVersion("IsEqualTo(");
      boolean boolean0 = jSDocInfoBuilder0.recordVersion("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("Ye");
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("z3''2Bt");
      jSDocInfoBuilder0.recordBlockDescription("e*N&BG");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstancy();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.recordOriginalCommentString(",Moc\"#S");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordOriginalCommentString("Jc/!7R5`");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecationReason("IsEqualTo(");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("VMocp#S");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("0Q.Bg*o(aA{");
      assertFalse(jSDocInfoBuilder0.isJavaDispatch());
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.recordBlockDescription((String) null);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getTypedefType();
      jSDocInfoBuilder0.recordParameter("^5S^%/)1xb;pbl;i", jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("M*\rf", jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("z3''2Bt");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      Set<String> set0 = jSDocInfo0.getModifies();
      jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      jSDocInfoBuilder0.recordParameter((String) null, (JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordModifies(set0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoSideEffects();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      jSDocInfoBuilder0.recordModifies(set0);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("Vf\"|p", (JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Set<String> set0 = jSDocInfo0.getSuppressions();
      jSDocInfo0.setSuppressions(set0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null);
      jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("*_*{qgL|/1|JX\"Ww", jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      jSDocInfoBuilder0.recordParameter("*_*{qgL|/1|JX\"Ww", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription(":uSe'Tg");
      jSDocInfoBuilder0.recordDescription("com.google.common.collect.ImmutableCollection");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecationReason(",Moc\"#S");
      jSDocInfoBuilder0.hasParameter(",Moc\"#S");
      jSDocInfoBuilder0.markTypeNode((Node) null, 16384, 114, 16384, (-149), false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.markAnnotation("URI_ERROR_TYPE", 512, 512);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.markTypeNode((Node) null, 2, (-1465), 1024, (-3462), true);
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      jSDocInfoBuilder0.markTypeNode((Node) null, 1024, 29, 40, 2, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("Bm>ZBe");
      jSDocInfoBuilder0.recordMeaning((String) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("Bm>ZBe");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordMeaning("u");
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("2-|R:i3Y P`F;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription((String) null);
      jSDocInfoBuilder0.markName("*_*{qgL|/1|JX\"Ww", 65377, 65377);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfo0.setSuppressions(linkedHashSet0);
      jSDocInfo0.getParameterNames();
      jSDocInfoBuilder0.recordDescription("&");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("z3''2Bt");
      jSDocInfoBuilder0.recordDescription("z3''2Bt");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.hasReturnType());
      
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.markTypeNode((Node) null, 53, (-1), 51, 8, true);
      jSDocInfo0.getSuppressions();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("IsEqualTo(");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordBlockDescription("IsEqualTo(");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(",Moc\"#S");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordBlockDescription("IsEqualTo(");
      jSDocInfoBuilder0.recordBlockDescription("IsEqualTo(");
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, ")");
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("ReferenceError");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("expected one element but was: <");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("2-|R:i3Y P`F;");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordParameter("already specified useForNull", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("already specified useForNull");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      Node node0 = Node.newString(512, "", 512, 512);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "");
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter((String) null);
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      Node node0 = Node.newString(1019, "j@9C[R;dygCSNq(F9", (-1073741823), 4096);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "j@9C[R;dygCSNq(F9");
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfo0.setSuppressions(linkedHashSet0);
      jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordLends("0kY;yP:Wt=)/;L_7:");
      jSDocInfoBuilder0.recordNoCompile();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.isNoCompile());
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.addModifies("");
      jSDocInfo0.getParameterType("");
      jSDocInfoBuilder0.markName("?(InTAqCa", 1998, 65536);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newNumber(0.0, 1596, 1596);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.markTypeNode(node0, 40, 27591, 2629, (-1932735281), false);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordDescription("The new child node has siblings.");
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      jSDocInfo0.getReturnType();
      assertTrue(jSDocInfo0.hasReturnType());
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference("com.google.javascrip.rhino.JSDocInfo");
      Node node0 = new Node(4);
      jSDocInfoBuilder0.markTypeNode(node0, 4, 16, 4095, 40, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordExterns();
      Node node0 = Node.newString("%I>Hz", (-1737), (-2013265951));
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, ")UEY&o|:qKM");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      Node node0 = Node.newNumber(2565.389059436, 618, 520);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      JSTypeExpression jSTypeExpression0 = jSDocInfo0.getParameterType("ASSIGN_MOD");
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "ASSIGN_MOD");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      JSDocInfo jSDocInfo1 = jSDocInfoBuilder0.build(node0);
      jSDocInfo1.getType();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.markAnnotation("hoBzqED6", (-1927), 536870912);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("hoBzqED6", true);
      jSDocInfoBuilder0.markName("hoBzqED6", (StaticSourceFile) simpleSourceFile0, 536870912, 536870912);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.markName("com.google.javascript.rhino.JSDocInfo", 3012, 3012);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      Node node0 = new Node((-1372), (-1372), (-1372));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("Eval Error");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordThisType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("M*\rf");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("JT1N?'%'?H;3!4b[5").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordParameter("+\";Ghx$,u", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("+\";Ghx$,u");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("T<3J-<i&u8q");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfo0.getReturnType();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("Bm>ZBe");
      Node node0 = new Node(4);
      jSDocInfoBuilder0.markAnnotation("com.google.javascript.rhino.JSDocInfo", 38, 16384);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 54, (-218), 2, 2045, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 54
         // end-line: 2
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("Bm>ZBe");
      Node node0 = new Node(4);
      jSDocInfoBuilder0.markTypeNode(node0, 44, 8, 4095, 1, false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordLends("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.recordDescription("oLP,~qE98!h");
      jSDocInfoBuilder0.markTypeNode((Node) null, 1024, 29, 40, 2, false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordParameter(",Moc\"#S", jSTypeExpression0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("0kY;yP:Wt=)/;L_7:");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordBlockDescription("z3''2Bt");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("vI^)DH2JHS5dVmPL");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertFalse(jSDocInfo0.isConstant());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("r_h#1nzb5%G+", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString("9Cs2+r;5X|G");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("9Cs2+r;5X|G");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDescription("Bm>ZBe");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordHiddenness();
      jSDocInfo0.getReturnType();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(jSTypeExpression0).toString();
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder1.recordBaseType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "@`?");
      boolean boolean0 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordParameter("already specified useForNull", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("already specified useForNull");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordParameter("r_h#1nzb5%G+", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("xjHV2Nwfvz");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Node node0 = Node.newNumber(1613.52929533031);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "f3B^pB!T{");
      boolean boolean0 = jSDocInfo0.declareThrows(jSTypeExpression0);
      assertTrue(boolean0);
      
      jSDocInfo0.getExtendedInterfaces();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.recordOriginalCommentString("z3''2Bt");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.addModifies("");
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfo0.getExtendedInterfaces();
      jSDocInfoBuilder1.recordOriginalCommentString(";4{a\"QMi ");
      assertFalse(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordDescription("j)(}6dcSiLN~Zh%");
      jSDocInfoBuilder0.recordExterns();
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = Node.newString("%I>Hz", (-1737), (-2013265951));
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, ")UEY&o|:qKM");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("0kY;yP:Wt=)/;L_7:");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      Locale locale0 = Locale.ITALY;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.setSuppressions(set0);
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDeprecationReason("hfy_0");
      jSDocInfoBuilder0.recordConstructor();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.markAnnotation("URI_ERROR_TYPE", 512, 512);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfoBuilder0.recordSuppressions(linkedHashSet0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.markTypeNode((Node) null, 2, (-1465), 1024, (-3462), true);
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      Node node0 = new Node((-391), (-391), (-391));
      jSDocInfoBuilder0.markTypeNode(node0, 31, (-1265), 44, 131072, true);
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      Node node0 = Node.newString("ASSIGN_BITAND");
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "");
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.markTypeNode(node0, 36, 42, 47, 47, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
      
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1932735281), (-1932735281), (-987), (-2375), false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("CATCH", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordReturnDescription("hi87");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isOverride());
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("URI_ERROR_TYPE", 512, 512);
      jSDocInfoBuilder0.recordBlockDescription("e>RC:(![#w-::trT");
      jSDocInfoBuilder0.markName("X9#*", 512, (-1377));
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.jstype.NumberType");
      jSDocInfoBuilder0.markName(",", 83, 83);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("|hOs S");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("J+?");
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.hasParameter("u");
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLendsName("0kY;yP:Wt=)/;L_7:");
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isIdGenerator());
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = new Node((-4096), 724, 536870912);
      jSDocInfoBuilder0.markName("", (StaticSourceFile) null, (-1073741823), 40);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "`z}M*$'8[9fnM\"");
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("com.google.common.collect.ImmutableCollection");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString("RANGE_ERROR_TYPE");
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordFileOverview("pqyn@?$v)eG{7D|G");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("~8Ym=t&<h");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.JSDocInfo").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      Node node0 = Node.newNumber((-1197.113));
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("no next sibling.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.setReturnType((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfo0.getReturnType();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("z3''2Bt");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("JT1N?'%'?H;3!4b[5", jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription(jSTypeExpression1, "JT1N?'%'?H;3!4b[5");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("O?P*[(.DC");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoCompile();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      jSDocInfoBuilder0.recordSuppressions(set0);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfo0.setSuppressions(linkedHashSet0);
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecationReason((String) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addModifies((String) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("*#W^On+X7I*?}H .");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.addModifies("");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("Qfi=V");
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertNotNull(set0);
      
      boolean boolean0 = jSDocInfo0.setSuppressions(set0);
      assertTrue(boolean0);
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("NEG");
      jSDocInfoBuilder0.recordOriginalCommentString("(H;Ig1ofs@:]CV");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("2-|R:iJ3YP`F");
      Node node0 = Node.newNumber(2565.389059436, 618, 520);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterType("ASSIGN_MOD");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(linkedHashSet0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newString("COLON", (-1611), (-1611));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "COLON");
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("j)(}6dcSiLN~Zh%");
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfo0.getTemplateTypeNames();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference("oLP,~qE98!h");
      jSDocInfoBuilder0.addReference("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.markTypeNode((Node) null, 1024, 29, 40, 2, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("URI_ERROR_TYPE", 512, 512);
      jSDocInfoBuilder0.addReference("oLP,~qE98!h");
      jSDocInfoBuilder0.markTypeNode((Node) null, 2, (-1465), 1024, (-3462), true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      Node node0 = Node.newNumber((-1787.2103446563963));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameterDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", "00b|HZBt,M&.;F");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "oLP,~qE98!h");
      jSDocInfoBuilder0.markAnnotation("URI_ERROR_TYPE", 512, 512);
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.markName("X9#*", 512, (-1377));
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test257()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("*_*{qgL|/1|JX\"Ww");
      jSDocInfoBuilder0.markName("*_*{qgL|/1|JX\"Ww", 65377, 65377);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test258()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter(";fv,D/'\"8[CgcRzZ`A");
      assertFalse(boolean0);
      
      jSDocInfoBuilder0.markName(";fv,D/'\"8[CgcRzZ`A", (-1932735281), (-1932735281));
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test259()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("6rLXSp}", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoTypeCheck();
      boolean boolean0 = jSDocInfoBuilder0.recordLends("-N");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test260()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("JSDocInfo");
      jSDocInfoBuilder0.recordNoTypeCheck();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordNoTypeCheck();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test261()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("*#W^On+X7I*?}H .", (-482), 300);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Node node0 = Node.newString(300, "<%_Q+xr;j6Ev:\"Z0l", 16384, (-482));
      jSDocInfo0.getModifies();
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 45, 1, 29, 4, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 45
         // end-line: 29
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test262()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      Node node0 = Node.newString("y]UyKZIb");
      jSDocInfoBuilder0.markTypeNode(node0, 45, (-1789569705), 4095, 4, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test263()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecated();
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecated();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test264()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordParameter("CATCH", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test265()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test266()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDescription("S5");
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test267()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordDescription("Y2VglmjLhBAujKI2J{]");
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test268()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PUBLIC;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "2cAPcd");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test269()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test270()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test271()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordDescription("+\";Ghx$,u");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test272()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("C#");
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test273()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameterDescription("\u00A0\u180E\u202F", "RjV-:Er&6~f08Q7");
      boolean boolean0 = jSDocInfoBuilder0.recordParameterDescription("\u00A0\u180E\u202F", "RjV-:Er&6~f08Q7");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test274()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test275()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("#Z_n})c;");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test276()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }
}
