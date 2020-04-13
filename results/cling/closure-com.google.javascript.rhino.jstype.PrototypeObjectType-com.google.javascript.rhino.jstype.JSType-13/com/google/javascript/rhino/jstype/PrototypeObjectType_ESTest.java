/*

 * Tue Mar 03 18:45:23 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Nic,DEmpQo", (ObjectType) null, false);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("appendable", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "}");
      TemplateType templateType1 = JSType.toMaybeTemplateType((JSType) templateType0);
      assertNotNull(templateType1);
      assertFalse(templateType1.isResolved());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)booleanType0.autoboxesTo();
      JSType.getGreatestSubtype((JSType) instanceObjectType0, (JSType) booleanType0);
      assertTrue(instanceObjectType0.hasCachedValues());
      assertFalse(booleanType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      recordType0.matchConstraint(recordType0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
      assertTrue(recordType0.isRecordType());
      assertFalse(recordType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSType.toMaybeParameterizedType((JSType) recordType0);
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0, false);
      boolean boolean0 = instanceObjectType0.isSubtype(noResolvedType0);
      assertFalse(instanceObjectType0.isResolved());
      assertFalse(instanceObjectType0.isNoResolvedType());
      assertTrue(boolean0);
      assertFalse(instanceObjectType0.isAllType());
      assertFalse(instanceObjectType0.isNoType());
      assertFalse(instanceObjectType0.isNoObjectType());
      assertFalse(instanceObjectType0.isNativeObjectType());
      assertFalse(instanceObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(noType0);
      assertFalse(jSType0.isNoObjectType());
      assertFalse(noType0.isTemplateType());
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(jSType0.isResolved());
      assertFalse(noType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      int int0 = errorFunctionType0.getPropertiesCount();
      assertFalse(errorFunctionType0.isNoResolvedType());
      assertEquals(0, int0);
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(errorFunctionType0.isNoType());
      assertFalse(errorFunctionType0.isNoObjectType());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isResolved());
      assertFalse(errorFunctionType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_CONSTRUCTOR_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(functionType0);
      assertFalse(jSType0.isResolved());
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(jSType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isAllType());
      assertNotNull(string0);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isNoResolvedType());
      assertEquals("{}", string0);
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn("Not declared as a constructor", "Not declared as a constructor").when(objectType0).toString();
      doReturn(true).when(objectType0).isNativeObjectType();
      doReturn(true).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "N{e>*Lh&t=", objectType0);
      PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry0, "Unknown class name", prototypeObjectType0);
      boolean boolean0 = prototypeObjectType0.isSubtype(prototypeObjectType1);
      assertTrue(prototypeObjectType1.hasCachedValues());
      assertTrue(boolean0);
  }
}
