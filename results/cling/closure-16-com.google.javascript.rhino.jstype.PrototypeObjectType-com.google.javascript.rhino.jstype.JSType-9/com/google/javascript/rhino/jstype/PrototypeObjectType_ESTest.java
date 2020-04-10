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
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.VoidType;
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
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "", objectType0);
      JSType.toMaybeTemplateType((JSType) prototypeObjectType0);
      assertFalse(prototypeObjectType0.isResolved());
      assertFalse(prototypeObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.hasAnyTemplateInternal();
      assertFalse(noResolvedType0.isAllType());
      assertFalse(boolean0);
      assertFalse(noResolvedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Boolean", (ObjectType) null);
      Node node0 = new Node(1);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("Named type with empty name component", node0, prototypeObjectType0);
      boolean boolean0 = prototypeObjectType0.canTestForEqualityWith(enumType0);
      assertTrue(prototypeObjectType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      RecordType recordType1 = (RecordType)recordType0.getLeastSupertype(recordType0);
      assertFalse(recordType1.isNoObjectType());
      assertFalse(recordType1.isNoType());
      assertFalse(recordType1.hasReferenceName());
      assertFalse(recordType1.isNativeObjectType());
      assertFalse(recordType1.isAllType());
      assertFalse(recordType1.isNoResolvedType());
      assertFalse(recordType0.hasCachedValues());
      assertFalse(recordType1.isResolved());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType jSType0 = voidType0.restrictByNotNullOrUndefined();
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "toString", (Node) null, jSType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      JSType.toMaybeParameterizedType((JSType) enumElementType0);
      assertFalse(enumElementType0.isNoResolvedType());
      assertFalse(enumElementType0.isResolved());
      assertFalse(enumElementType0.isNoObjectType());
      assertFalse(enumElementType0.isAllType());
      assertFalse(enumElementType0.isNoType());
      assertFalse(voidType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0, false);
      boolean boolean0 = instanceObjectType0.isString();
      assertTrue(noResolvedType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      jSTypeRegistry0.createDefaultObjectUnion(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(noResolvedType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.hasReferenceName());
      assertEquals(0, int0);
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("{...}", (Node) null);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0, false);
      boolean boolean0 = instanceObjectType0.isSubtype(functionType0);
      assertTrue(instanceObjectType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GREATEST_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      boolean boolean0 = functionType0.isSubtype(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.isNativeObjectType());
      assertEquals("{}", string0);
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isResolved());
      assertNotNull(string0);
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("{...}", (Node) null);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0, false);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      instanceObjectType0.setPropertyJSDocInfo("toString", jSDocInfo0);
      assertTrue(instanceObjectType0.hasCachedValues());
  }
}
