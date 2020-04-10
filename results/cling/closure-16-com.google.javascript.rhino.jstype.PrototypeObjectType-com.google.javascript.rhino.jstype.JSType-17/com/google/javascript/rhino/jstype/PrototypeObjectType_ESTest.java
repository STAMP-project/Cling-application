/*

 * Tue Mar 03 18:46:47 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ">");
      JSType.toMaybeTemplateType((JSType) errorFunctionType0);
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.getTypesUnderEquality(recordType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSType jSType0 = null;
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType(jSType0);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) noType0, "Unknown class name", ";{T|OVVV3xcg#\"gMCFh", 3, 2977);
      JSType.toMaybeParameterizedType(jSType0);
      assertFalse(jSType0.isAllType());
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(jSType0.isResolved());
      assertFalse(jSType0.isNoObjectType());
      assertFalse(jSType0.isNoType());
      assertFalse(noType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "k");
      JSType[] jSTypeArray0 = new JSType[8];
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      jSTypeArray0[6] = (JSType) noResolvedType0;
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Named type with empty name component", templateType0, false);
      boolean boolean0 = prototypeObjectType0.isSubtype(jSTypeArray0[6]);
      assertTrue(boolean0);
      assertFalse(prototypeObjectType0.isNativeObjectType());
      assertFalse(prototypeObjectType0.isNoType());
      assertFalse(prototypeObjectType0.isNoObjectType());
      assertFalse(prototypeObjectType0.isAllType());
      assertFalse(prototypeObjectType0.isResolved());
      assertFalse(prototypeObjectType0.isNoResolvedType());
      assertTrue(prototypeObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      jSTypeRegistry0.createDefaultObjectUnion(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isNoObjectType());
      assertEquals(0, int0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoResolvedType());
      assertNotNull(string0);
      assertFalse(recordType0.hasReferenceName());
      assertEquals("{}", string0);
      assertFalse(recordType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(objectType0).toString();
      doReturn((ObjectType.Property) null, (ObjectType.Property) null, (ObjectType.Property) null).when(objectType0).getSlot(anyString());
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "", objectType0, true);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, ")6AdQv51L s*", ">", 462, 758);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, ")6AdQv51L s*", namedType0, true);
      PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry0, ",8wXR}4AjkhHK?)K^", prototypeObjectType0);
      jSTypeRegistry0.createOptionalType(prototypeObjectType1);
      assertTrue(prototypeObjectType1.hasCachedValues());
      assertTrue(prototypeObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      boolean boolean0 = errorFunctionType0.isSubtype(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertTrue(boolean0);
  }
}
