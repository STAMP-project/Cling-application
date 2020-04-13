/*

 * Tue Mar 03 18:44:56 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PrototypeObjectType_ESTest extends PrototypeObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType.toMaybeTemplateType((JSType) errorFunctionType0);
      assertFalse(errorFunctionType0.isNoResolvedType());
      assertFalse(errorFunctionType0.isNoObjectType());
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(errorFunctionType0.isNoType());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isResolved());
      assertFalse(errorFunctionType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      PrototypeObjectType prototypeObjectType0 = (PrototypeObjectType)jSTypeRegistry0.createNativeAnonymousObjectType();
      prototypeObjectType0.testForEqualityHelper(prototypeObjectType0, prototypeObjectType0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      recordType0.matchConstraint(recordType0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoResolvedType());
      assertTrue(recordType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      JSType.toMaybeParameterizedType((JSType) templateType0);
      assertFalse(templateType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "85='R<y~YWTp", (ObjectType) null, true);
      prototypeObjectType0.getPropertiesCount();
      assertTrue(prototypeObjectType0.isNativeObjectType());
      assertFalse(prototypeObjectType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(objectType0).toString();
      doReturn(0).when(objectType0).getPropertiesCount();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "", objectType0, false);
      int int0 = prototypeObjectType0.getPropertiesCount();
      assertFalse(prototypeObjectType0.isResolved());
      assertEquals(0, int0);
      assertFalse(prototypeObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ")HWFi*C$}");
      boolean boolean0 = errorFunctionType0.isNumber();
      assertFalse(errorFunctionType0.isNoType());
      assertFalse(boolean0);
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(errorFunctionType0.isNoObjectType());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.hasCachedValues());
      assertFalse(errorFunctionType0.isNoResolvedType());
      assertFalse(errorFunctionType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
      assertNotNull(string0);
      assertEquals("{}", string0);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      ObjectType.Property objectType_Property0 = new ObjectType.Property("toString", (JSType) null, true, (Node) null);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null).when(objectType0).toString();
      doReturn(objectType_Property0).when(objectType0).getSlot(anyString());
      doReturn(true).when(objectType0).isNativeObjectType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "", objectType0, false);
      boolean boolean0 = prototypeObjectType0.hasProperty("");
      assertFalse(prototypeObjectType0.isResolved());
      assertFalse(prototypeObjectType0.isNativeObjectType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ")WFi*$}");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo(")WFi*$}", jSDocInfo0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      NoObjectType noObjectType0 = (NoObjectType)modificationVisitor0.caseNoObjectType();
      jSTypeRegistry0.createDefaultObjectUnion(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
  }
}
