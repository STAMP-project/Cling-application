/*

 * Tue Mar 03 19:26:29 GMT 2020
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
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression1);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("D2+Kc;{gKCJp&Eg");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("=+#j+C3d9(AD");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordParameter("The new child node already has a parent.", jSTypeExpression0);
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("z9}]aE@h<&7?");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordIdGenerator();
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("3)hUJU7*+=#? /7:_");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordFileOverview("Ckgh~Gt5$,]NW#k");
      jSDocInfoBuilder0.recordIdGenerator();
      boolean boolean0 = jSDocInfoBuilder0.recordIdGenerator();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("'7FiahIT c(3ofIF{DC");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("D2+Kc;{gKCJp&Eg");
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordParameter("e<nbLY>fKi|J", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("l&o");
      assertFalse(jSDocInfoBuilder0.isJavaDispatch());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression1);
      Node node0 = new Node(16, 1024, 16);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      Set<String> set0 = jSDocInfo0.getModifies();
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("3cArL`HtGsdbci\"");
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getReturnType();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordFileOverview("com.google.javascript.rhino.jstype.RecordType");
      Node node0 = new Node((-2664));
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "Sn<{]`");
      boolean boolean0 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordDescription("com.google.javascript.rhino.jstype.ArrowType");
      jSDocInfoBuilder0.hasParameter((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecationReason("((K+VI|r9[;D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      jSDocInfoBuilder0.recordDeprecationReason("");
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecationReason("com.google.javascript.rhino.JSDocInfo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoShadow();
      boolean boolean0 = jSDocInfoBuilder0.recordNoShadow();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, (-2807), 16, (-4645), 37, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      boolean boolean0 = jSDocInfo0.setDeprecationReason("ct=X");
      assertTrue(boolean0);
      
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordSuppressions((Set<String>) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.hasParameter("String has leading or trailing whitespace");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions((Set<String>) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, (-2807), 16, (-4645), 37, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.addAuthor("ct=X");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConstancy();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = new Node(4096, 4096, (-953));
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeExpression0).getRoot();
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression1);
      jSDocInfoBuilder0.recordExterns();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("`FAv02RO");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview(":8");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.markAnnotation("=maAom", (-139), 1352);
      jSDocInfoBuilder0.markTypeNode((Node) null, 4096, 29, 1073741823, 4096, false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("'7FiahIT c(3ofIF{DC");
      Node node0 = Node.newNumber(0.0);
      jSDocInfoBuilder0.markTypeNode(node0, 40, 0, (-286), 512, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.markName("Or(", 65536, 65536);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordOriginalCommentString("sourcename");
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder1.recordOriginalCommentString("com.google.javascript.rhino.JSDocInfo");
      assertFalse(jSDocInfoBuilder1.isPopulated());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordReturnDescription("O%wBoJcUkJ,");
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString("");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      jSDocInfoBuilder0.recordBlockDescription("SfFT,gyDVw");
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("n/-S");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("sourcename");
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterType("");
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.markName("INC", 437, 437);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("");
      jSDocInfoBuilder0.recordReturnDescription("((K+VI|r9[;D");
      boolean boolean0 = jSDocInfoBuilder0.recordType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("D2+Kc;{gKCJp&Eg");
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.JSDocInfo");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.addReference("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.recordDescription("com.google.javascript.rhino.jstype.ArrowType");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter((String) null);
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.hasParameter("");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.addReference("-.V{($xr ");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordLends("");
      jSDocInfoBuilder0.isDescriptionRecorded();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordFileOverview("5IvdI[");
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("D2+Kc;{gKCJp&Eg");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("G>^%;");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("n/-S");
      jSDocInfoBuilder0.recordDescription("n/-S");
      jSDocInfoBuilder0.recordParameter("n/-S", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("_|H~h0[52|]");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      jSDocInfoBuilder0.recordMeaning("");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("kS@&7X,gh");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression1);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 37, 16, 0, 0, false);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("");
      jSDocInfoBuilder0.markTypeNode(node0, (-2582), (-747), 16, 36, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTemplateTypeNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getTypeNodes();
      jSDocInfoBuilder0.recordDescription("((K+VI|r9[;D");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("Or(");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordVersion("}w4z7x,0=4w-AYl=szJ");
      jSDocInfoBuilder0.recordVersion("}w4z7x,0=4w-AYl=szJ");
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.recordVersion(" %$0@L *z0Xmwp9t$%");
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordParameter("5IvdI[", (JSTypeExpression) null);
      jSDocInfo0.getThrownTypes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.isDescriptionRecorded();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("Object");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning("Object");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("<O}U-Erq,Ku1");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning((String) null);
      jSDocInfoBuilder0.recordLends((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      boolean boolean2 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "com.google.common.base.Predicates$IsEqualToPredicate");
      assertTrue(boolean2 == boolean0);
      
      boolean boolean3 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "k.A\"Qy7");
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("=+#j+C3d9(AD");
      jSDocInfoBuilder0.markTypeNode(node0, (-2580), (-747), 16, 36, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordParameter("The new child node already has a parent.", jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("z9}]aE@h<&7?");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfo0.setDeprecationReason("ct=X");
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview(",nc3D*5i^/>");
      jSDocInfoBuilder0.markAnnotation("O'+}ZT~pLiaFh", 1610612736, 4);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile(",nc3D*5i^/>", true);
      jSDocInfoBuilder0.markName("dSh&[%h?", (StaticSourceFile) simpleSourceFile0, (-1466), (-1328));
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("7N");
      jSDocInfoBuilder0.recordFileOverview("7N");
      jSDocInfoBuilder0.markName("7N", (-2034458190), (-2034458190));
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      Node node0 = Node.newString("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.markTypeNode(node0, 4, 42, 1, 131072, false);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(boolean0);
      
      boolean boolean1 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      boolean boolean2 = jSDocInfoBuilder0.recordConstructor();
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertTrue(boolean2 == boolean1);
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "HaA`*<C|4");
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordParameter("HaA`*<C|4", jSTypeExpression0);
      jSDocInfoBuilder0.recordFileOverview("HaA`*<C|4");
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordReturnDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      jSDocInfoBuilder0.recordReturnDescription((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplicitCast();
      boolean boolean0 = jSDocInfoBuilder0.recordImplicitCast();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      jSDocInfoBuilder1.recordParameter("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", (JSTypeExpression) null);
      boolean boolean1 = jSDocInfoBuilder1.recordParameter("", (JSTypeExpression) null);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("", jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("UNKNOWN");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("(K+VI|r9;D");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("((K+VI|r9[;D");
      jSDocInfoBuilder0.markTypeNode(node0, (-2582), (-747), 16, 36, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.hasParameter("BwJ`?439Js");
      jSDocInfoBuilder0.markAnnotation("UNKNOWN", 2889, (-1102));
      Node node0 = new Node(2024, (-2260), 2024);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 1048576, 4, 65536, 2889, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 1048576
         // end-line: 65536
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("");
      assertFalse(boolean0);
      
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(16, nodeArray0);
      jSDocInfoBuilder0.markTypeNode(node0, 39, 4095, 8, 46, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "NEG");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "\"f*pR}Mv9j&glW|M");
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "i~i293z&w");
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordInterface();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "\"f*pR}Mv9j&glW|M");
      assertTrue(jSDocInfoBuilder0.isInterfaceRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLendsName("5IvdI[");
      jSDocInfo0.getParameterType("5IvdI[");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "is_constant_name");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterType("_o@>6^ZDY |#ZOYh");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "((K+=I|r9[;D");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("com.google.common.base.Predicates$CompositionPredicate");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("com.google.common.base.Predicates$CompositionPredicate");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("y<rW`en3-oVR");
      jSDocInfoBuilder0.recordTypedef((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("Undefined");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("");
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("apply");
      jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordDefineType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordModifies((Set<String>) null);
      jSDocInfoBuilder0.hasParameter("");
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.markName(" (", 536870912, 536870912);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("1pMQC{4TI>rvRW");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setDeprecationReason("");
      jSDocInfoBuilder0.recordMeaning("/'w7Ec");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("'7FiahIT c(3ofIF{DC");
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("'7FiahIT c(3ofIF{DC");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setType((JSTypeExpression) null);
      jSDocInfo0.getType();
      assertTrue(jSDocInfo0.hasType());
      
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("Object");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("n/-S");
      jSDocInfoBuilder0.recordDescription("n/-S");
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("NUMBER_STRING_BOOLEAN");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordMeaning(" O.ELf_XT$0D'uidg");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordMeaning("x");
      jSDocInfoBuilder0.hasParameter("x");
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("JSDocInfo");
      jSDocInfoBuilder0.recordBlockDescription("K^);$:eS");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordEnumParameterType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("");
      boolean boolean1 = jSDocInfoBuilder0.hasParameter("");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordMeaning("!#HoBQ*AXEu_D~3:OF");
      jSDocInfoBuilder0.hasParameter("\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordMeaning((String) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("]%");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      jSDocInfoBuilder0.recordVersion("Hv");
      jSDocInfoBuilder0.recordVersion("Hv");
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      jSDocInfoBuilder0.recordTemplateTypeNames(list0);
      jSDocInfoBuilder0.recordConsistentIdGenerator();
      boolean boolean0 = jSDocInfoBuilder0.recordConsistentIdGenerator();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.addReference("JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.setLicense("UNKNOWN");
      jSDocInfo0.getParameterType("?o]|LN,Et|");
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordLends("y<rW`en3-oVR");
      jSDocInfoBuilder0.recordDescription("y<rW`en3-oVR");
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("UNKNOWN", 2889, (-1102));
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getEnumParameterType();
      Node node0 = new Node(2024, (-2260), 2024);
      // Undeclared exception!
      try { 
        jSDocInfoBuilder0.markTypeNode(node0, 1048576, 4, 65536, 2889, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Recorded bad position information
         // start-line: 1048576
         // end-line: 65536
         //
         verifyException("com.google.javascript.rhino.SourcePosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, (-2807), 16, (-4616), 37, true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node1 = new Node(32768, 1024, 39);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node1);
      jSDocInfo0.getType();
      assertTrue(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      jSDocInfoBuilder0.recordSuppressions(set0);
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordNoCompile();
      // Undeclared exception!
      try { 
        jSDocInfo0.setTypedefType((JSTypeExpression) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // API tried to add two incompatible type tags. This should have been blocked and emitted a warning.
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordType(jSTypeExpression0);
      boolean boolean1 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(boolean1);
      
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean2 = jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression1);
      boolean boolean3 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(boolean3 == boolean2);
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean3 == boolean0);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean3);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordReturnDescription("Or(");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addAuthor("7N");
      jSDocInfoBuilder0.markAnnotation("chJYNF_{qeN8XL", 1352, (-1879048190));
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1), (-1879048190), 948, 948, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("=+#j+C3d9(AD");
      jSDocInfoBuilder0.markTypeNode(node0, (-2580), (-747), 16, 36, false);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.addAuthor(",nc3D*5i^/>");
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      Node node0 = Node.newString(210, "JSDocInfo");
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("");
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("|M<ejGlG&eH'");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("G>^%;");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordBlockDescription("c3.o0o6Dks__-+8;w@");
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfoBuilder0.recordMeaning("NEG");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
      
      jSDocInfoBuilder0.recordOriginalCommentString("chJYNF_{qeN8XL");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("s`y^)XM?.^<{~");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordLends("{D6kJ `/L7");
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("sourcename");
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = new Node(4096, 4096, (-953));
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeExpression0).getRoot();
      boolean boolean0 = jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypeNodes();
      boolean boolean1 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setLicense("upI3");
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("jL;#_v(|MWFXBX");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordBlockDescription("+|");
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfo0.declareParam((JSTypeExpression) null, (String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      jSDocInfoBuilder0.recordModifies(linkedHashSet0);
      jSDocInfoBuilder0.recordParameter("Cb", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordModifies(linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterNames();
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(4, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 2732, 52);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "BSL'-mxRhiN$k");
      jSDocInfoBuilder0.recordParameter("BSL'-mxRhiN$k", jSTypeExpression0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      boolean boolean0 = jSDocInfoBuilder0.recordTemplateTypeNames((List<String>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression1);
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
  public void test148()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordModifies((Set<String>) null);
      jSDocInfoBuilder0.hasParameter("");
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(16, nodeArray0);
      jSDocInfoBuilder0.markTypeNode(node0, 39, 4095, 8, 46, false);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("");
      jSDocInfoBuilder0.markTypeNode(node0, (-2582), 48, 16, 36, false);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("n/-S");
      jSDocInfoBuilder0.recordMeaning((String) null);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("NUMBER_STRING_BOOLEAN");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = new Node(4096, 4096, (-953));
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeExpression0).getRoot();
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("'7FiahIT c(3ofIF{DC");
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("r))");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("negative size: ");
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("negative size: ", true);
      jSDocInfoBuilder0.markName("|)qM+R{HwmI$Ct*%+C", (StaticSourceFile) simpleSourceFile0, (-132), (-132));
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLendsName("5IvdI[");
      jSDocInfoBuilder0.recordDescription("5IvdI[");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.getParameterNames();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("+|");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, (-2807), 16, (-4645), 37, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      boolean boolean0 = jSDocInfo0.setDeprecationReason("ct=X");
      assertTrue(boolean0);
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, 3871, 3871, (-4616), 37, true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfo0.declareParam((JSTypeExpression) null, "Oe+eDpQ|=@4b");
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("Ys1`(SxC2v@cx!6a", "=+#j+C3d9(AD").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      jSDocInfoBuilder0.markTypeNode(node0, 16, 35, (-4015), 0, false);
      jSDocInfoBuilder0.recordReturnDescription((String) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getSuppressions();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("+x");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      jSDocInfoBuilder0.recordOriginalCommentString("com.google.common.base.Predicates$InPredicate");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      Node node0 = Node.newString("|lkY<^Y-qod#L?p\"");
      JSTypeExpression jSTypeExpression1 = new JSTypeExpression(node0, "c9onrkH{c1");
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder1.recordOriginalCommentString("#19A");
      assertFalse(jSDocInfoBuilder1.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLendsName("5IvdI[");
      jSDocInfo0.getParameterType("5IvdI[");
      assertFalse(jSDocInfo0.containsDeclaration());
      
      jSDocInfoBuilder0.markName(" (", 536870912, 536870912);
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordParameter("n/-S", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("_|H~h0[52|]");
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordParameter("Cb", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("Cb");
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("JRIyl");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.setDeprecationReason("ct=X");
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoAlias();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.addModifies("5IvdI[");
      jSDocInfo0.getParameterType("5IvdI[");
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = Node.newNumber(2257.644778594, 305, (-2090970918));
      jSDocInfoBuilder0.markTypeNode(node0, (-1320), 44, 48, 16, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, ",nc3D*5i^/>");
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning((String) null);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      assertFalse(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(boolean1 == boolean0);
      assertFalse(jSDocInfoBuilder0.isInterfaceRecorded());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setType((JSTypeExpression) null);
      jSDocInfo0.getType();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("<O}U-Erq,Ku1");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("=maAom", (-139), 1352);
      jSDocInfoBuilder0.markTypeNode((Node) null, 4096, 29, 1073741823, 4096, false);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder1.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder1.addReference("JA$(/Ib1_7yEF");
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("");
      jSDocInfoBuilder0.markTypeNode(node0, (-2582), (-747), 16, 36, false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.addReference("SfFT,gyDVw");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression1);
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setTypedefType((JSTypeExpression) null);
      jSDocInfo0.getTypedefType();
      assertTrue(jSDocInfo0.hasTypedefType());
      
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markAnnotation("e;Y", 731, 731);
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.markName("com.google.common.collect.ArrayListMultimap", 1, (-1994091957));
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile((String) null, true);
      jSDocInfoBuilder0.markName((String) null, (StaticSourceFile) simpleSourceFile0, 1809, 1073741824);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordPreserveTry();
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("jL;#_v(|MWFXBX");
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordThisType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("Array").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("*]&]", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("*]&]");
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression0);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.hasParameter("]%");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setTypedefType((JSTypeExpression) null);
      jSDocInfo0.getTypedefType();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, (-2807), 16, (-4616), 37, true);
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("");
      jSDocInfoBuilder0.markTypeNode(node0, (-2582), (-747), 16, 36, false);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "");
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("n'&!cv;C.mD*");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("J?6~58>/5a+?~2}Og", (JSTypeExpression) null);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordOriginalCommentString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertFalse(jSDocInfo0.isConstant());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordOriginalCommentString(",nc3D*5i^/>");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      
      Set<String> set0 = jSDocInfo0.getSuppressions();
      assertFalse(jSDocInfo0.isConstant());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      jSDocInfoBuilder0.recordOriginalCommentString("..S_zgN4hvl{Nyh}");
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordOriginalCommentString("BSL'-mxRhiN$k");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = Node.newString(4, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 2732, 52);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, "BSL'-mxRhiN$k");
      boolean boolean0 = jSDocInfoBuilder0.recordParameter("BSL'-mxRhiN$k", jSTypeExpression0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = new Node(4096, 4096, (-953));
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeExpression0).getRoot();
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordDescription("com.google.javascript.rhino.JSDocInfo");
      jSDocInfo0.getTypeNodes();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfo0.hasType());
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setType((JSTypeExpression) null);
      jSDocInfo0.getType();
      assertTrue(jSDocInfo0.hasType());
      
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("jL;#_v(|MWFXBX", "jL;#_v(|MWFXBX").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      Node node0 = new Node((-86), 1024, 148);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getType();
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypedefType();
      assertFalse(jSDocInfo0.containsDeclaration());
      
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("y<rW`en3-oVR").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder1.recordConstructor();
      assertTrue(jSDocInfoBuilder1.isConstructorRecorded());
      
      boolean boolean0 = jSDocInfoBuilder0.recordLends("com.google.common.base.Predicates$CompositionPredicate");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("com.google.javascript.rhino.JSDocInfo");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
      assertFalse(jSDocInfoBuilder1.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.recordBaseType((JSTypeExpression) null);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = new Node(32, (-1), (-1));
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeExpression0).getRoot();
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfo0.getTypeNodes();
      jSDocInfoBuilder0.recordNoAlias();
      assertFalse(jSDocInfoBuilder0.isPopulatedWithFileOverview());
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordThisType(jSTypeExpression0);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordPreserveTry();
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("r))");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordExterns();
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordMeaning("n'&!cv;C.mD*");
      jSDocInfoBuilder0.recordMeaning("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordLends("NUMBER_STRING");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, (-2807), 16, (-4645), 37, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("prev is not a child of this node.");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, ".<");
      Node node1 = Node.newString("V!Qr+[");
      jSDocInfoBuilder0.markTypeNode(node1, 2254, 97, 1610612736, 2, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("8u");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, (-2807), 16, (-4645), 37, true);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression0);
      jSDocInfoBuilder0.recordReturnDescription("apply");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      jSDocInfoBuilder0.recordReturnDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnDescription("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordExterns();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setLicense("upI3");
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.containsDeclaration());
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("O'+}ZT~pLiaFh");
      jSDocInfoBuilder0.markAnnotation("O'+}ZT~pLiaFh", 1610612736, 4);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile(",nc3D*5i^/>", true);
      jSDocInfoBuilder0.markName("dSh&[%h?", (StaticSourceFile) simpleSourceFile0, (-1466), (-1328));
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.markName("Or(", 65536, 65536);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getTypeNodes();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordPreserveTry();
      jSDocInfoBuilder0.recordDescription("com.google.javascript.rhino.jstype.ArrowType");
      jSDocInfoBuilder0.hasParameter((String) null);
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setLicense("upI3");
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordPreserveTry();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      jSDocInfo0.setBaseType((JSTypeExpression) null);
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isImplicitCast());
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordNoCompile();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isExpose());
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn("Array").when(jSTypeExpression0).toString();
      jSDocInfoBuilder0.recordBaseType(jSTypeExpression0);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("g=", false);
      jSDocInfoBuilder0.markName("g=", (StaticSourceFile) simpleSourceFile0, 12, (-747));
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jSDocInfoBuilder0.recordType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("..S_zgN4hvl{Nyh}");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordExtendedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build((Node) null);
      jSDocInfoBuilder0.recordNoTypeCheck();
      // Undeclared exception!
      try { 
        jSDocInfo0.setTypedefType((JSTypeExpression) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // API tried to add two incompatible type tags. This should have been blocked and emitted a warning.
         //
         verifyException("com.google.javascript.rhino.JSDocInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordFileOverview("");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("((K+VI|r9[;D");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder1.recordFileOverview("((K+VI|r9[;D");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("85IvdI[");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordFileOverview("08A0AO*i0-}j");
      boolean boolean0 = jSDocInfoBuilder0.recordReturnType((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      jSDocInfoBuilder0.recordTemplateTypeNames(linkedList0);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordOriginalCommentString("1&?2wBri%6ety{VE2lv");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setType((JSTypeExpression) null);
      jSDocInfo0.getType();
      assertTrue(jSDocInfo0.hasType());
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordNoAlias();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PROTECTED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordFileOverview("5IvdI[");
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      boolean boolean0 = jSDocInfoBuilder0.recordFileOverview("08A0AO*i0-}j");
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameter("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordNoCompile();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("'7FiahIT c(3ofIF{DC");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordLends("");
      jSDocInfoBuilder0.isDescriptionRecorded();
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLendsName("5IvdI[");
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.hasFileOverview());
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isExpose());
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setLicense("upI3");
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordParameter("J?6~58>/5a+?~2}Og", (JSTypeExpression) null);
      jSDocInfoBuilder0.hasParameter("J?6~58>/5a+?~2}Og");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      JSDocInfo jSDocInfo0 = jSDocInfoBuilder0.build(node0);
      jSDocInfo0.addModifies("m2\"k8W89-Q9+rr>yH6!");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("BwJ`?439Js");
      assertFalse(boolean0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(true);
      jSDocInfo0.addModifies("o!4{>");
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordReturnDescription("jL;#_v(|MWFXBX");
      jSDocInfoBuilder0.isPopulatedWithFileOverview();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.getTypedefType();
      assertFalse(jSDocInfo0.isExpose());
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLendsName("5IvdI[");
      jSDocInfoBuilder0.recordOriginalCommentString("?WTqgzh;B_(fa~*");
      assertFalse(jSDocInfoBuilder0.shouldParseDocumentation());
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfo0.getParameterNames();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setLendsName("5IvdI[");
      jSDocInfo0.getParameterType("5IvdI[");
      Set<String> set0 = jSDocInfo0.getSuppressions();
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      boolean boolean0 = jSDocInfoBuilder0.recordSuppressions(set0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordExtendedInterface(jSTypeExpression0);
      jSDocInfoBuilder0.recordLends("");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.addReference("com.google.javascript.rhino.JSDocInfo");
      jSDocInfoBuilder0.addReference("xrcp\u0006}b#N=Z{");
      Node node0 = new Node(344, 344, 128);
      jSDocInfoBuilder0.markTypeNode(node0, 4, 12, 1073741824, (-2092419962), true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoAlias();
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoAlias();
      boolean boolean0 = jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordParameterDescription("((K+VI|r9[;D", (String) null);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "com.google.common.base.Predicates$IsEqualToPredicate");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "k.A\"Qy7");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.hasParameter("BwJ`?439Js");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.markAnnotation("((_[;#tVZ8PA}AsX", (-2357), 536870912);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("(w&F+KPo$P#", true);
      jSDocInfoBuilder0.markName("F;CFgY^~", (StaticSourceFile) simpleSourceFile0, 4369, 4369);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markName((String) null, (-130), 0);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter((String) null, jSTypeExpression0);
      jSDocInfoBuilder0.hasParameter("]%");
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test257()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.markName((String) null, (-130), 0);
      boolean boolean0 = jSDocInfoBuilder0.hasParameter("nKc6<'m+{)");
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
  }

  @Test(timeout = 4000)
  public void test258()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "+E,~n");
      jSDocInfoBuilder0.recordThrowType(jSTypeExpression0);
      jSDocInfoBuilder0.recordTypedef(jSTypeExpression0);
      jSDocInfoBuilder0.recordNoTypeCheck();
      boolean boolean0 = jSDocInfoBuilder0.recordNoTypeCheck();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test259()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordNoTypeCheck();
      jSDocInfoBuilder0.recordNoTypeCheck();
      jSDocInfoBuilder0.recordParameter("", (JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.recordLends("\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test260()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordDescription("((K+VI|r9[;D");
      jSDocInfoBuilder0.recordDescription("Or(");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
  }

  @Test(timeout = 4000)
  public void test261()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.getModifies();
      jSDocInfoBuilder0.markAnnotation("chJYNF_{qeN8XL", 1352, (-1879048190));
      jSDocInfoBuilder0.markTypeNode((Node) null, (-1), (-1879048190), 948, 948, true);
      assertTrue(jSDocInfoBuilder0.isPopulated());
  }

  @Test(timeout = 4000)
  public void test262()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.markTypeNode(node0, (-2807), 16, (-4645), 37, true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.shouldParseDocumentation());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      assertNotNull(set0);
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test263()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("D2+Kc;{gKCJp&Eg", jSTypeExpression1);
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.PRIVATE;
      boolean boolean0 = jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test264()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordDeprecated();
      boolean boolean0 = jSDocInfoBuilder0.recordDeprecated();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test265()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordParameter("com.google.javascript.rhino.JSDocInfo", jSTypeExpression1);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test266()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordType(jSTypeExpression0);
      JSTypeExpression jSTypeExpression1 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      jSDocInfoBuilder0.recordDefineType(jSTypeExpression1);
      assertTrue(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.JSDocInfo");
      boolean boolean0 = jSDocInfoBuilder0.recordBlockDescription("com.google.javascript.rhino.JSDocInfo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test267()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      boolean boolean0 = jSDocInfoBuilder1.recordDescription("");
      assertTrue(jSDocInfoBuilder1.isDescriptionRecorded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test268()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test269()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo(false);
      jSDocInfo0.setLicense("upI3");
      jSDocInfo0.getTypeNodes();
      boolean boolean0 = jSDocInfoBuilder0.recordMeaning("< `eig%(NNhw");
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test270()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordDescription("n/-S");
      jSDocInfoBuilder0.recordDescription("n/-S");
      assertTrue(jSDocInfoBuilder0.isDescriptionRecorded());
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setDeprecationReason("ct=X");
      jSDocInfo0.getTypeNodes();
      assertFalse(jSDocInfo0.isConstant());
  }

  @Test(timeout = 4000)
  public void test271()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.INHERITED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "com.google.common.base.Predicates$IsEqualToPredicate");
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription((JSTypeExpression) null, "k.A\"Qy7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test272()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      JSDocInfo.Visibility jSDocInfo_Visibility0 = JSDocInfo.Visibility.INHERITED;
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(jSTypeExpression0).isOptionalArg();
      jSDocInfoBuilder0.recordVisibility(jSDocInfo_Visibility0);
      JSTypeExpression jSTypeExpression1 = JSTypeExpression.makeOptionalArg(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder0.recordThrowDescription(jSTypeExpression1, "qCf\"YG'g(][J\"7,");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test273()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordImplementedInterface((JSTypeExpression) null);
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test274()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      Node node0 = Node.newString("");
      JSTypeExpression jSTypeExpression0 = new JSTypeExpression(node0, (String) null);
      JSDocInfoBuilder jSDocInfoBuilder1 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordConstructor();
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      
      jSDocInfoBuilder1.recordTypedef(jSTypeExpression0);
      boolean boolean0 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression0);
      assertTrue(jSDocInfoBuilder1.isPopulated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test275()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      assertFalse(jSDocInfoBuilder0.isPopulated());
      
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      boolean boolean0 = jSDocInfoBuilder0.recordDescription("upI3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test276()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordConstructor();
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      boolean boolean0 = jSDocInfoBuilder0.isDescriptionRecorded();
      assertTrue(jSDocInfoBuilder0.isPopulated());
      assertTrue(jSDocInfoBuilder0.isConstructorRecorded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test277()  throws Throwable  {
      JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
      jSDocInfoBuilder0.recordThrowType((JSTypeExpression) null);
      jSDocInfoBuilder0.recordLends("");
      jSDocInfoBuilder0.recordNoCompile();
      boolean boolean0 = jSDocInfoBuilder0.recordNoCompile();
      assertTrue(jSDocInfoBuilder0.isPopulatedWithFileOverview());
      assertFalse(boolean0);
  }
}
