/*

 * Tue Mar 03 18:47:06 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import java.util.HashMap;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PrototypeObjectType_ESTest extends PrototypeObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(objectType0).toString();
      doReturn((ObjectType.Property) null, (ObjectType.Property) null, (ObjectType.Property) null).when(objectType0).getSlot(anyString());
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, (String) null, objectType0);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GREATEST_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      boolean boolean0 = functionType0.defineProperty("Not declared as a type name", functionType0, false, (Node) null);
      assertFalse(functionType0.isNoResolvedType());
      assertFalse(functionType0.isAllType());
      assertFalse(functionType0.isResolved());
      assertTrue(boolean0);
      assertFalse(functionType0.isNoType());
      assertTrue(functionType0.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType.toMaybeTemplateType((JSType) allType0);
      assertFalse(allType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)booleanType0.autoboxesTo();
      booleanType0.getTypesUnderInequality(instanceObjectType0);
      assertTrue(instanceObjectType0.hasCachedValues());
      assertFalse(booleanType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.isSubtype(recordType0);
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isResolved());
      assertTrue(boolean0);
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType.toMaybeParameterizedType((JSType) allType0);
      assertFalse(allType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noType0, false);
      boolean boolean0 = instanceObjectType0.isSubtype(noType0);
      assertFalse(instanceObjectType0.isResolved());
      assertFalse(instanceObjectType0.isAllType());
      assertFalse(instanceObjectType0.isNativeObjectType());
      assertTrue(boolean0);
      assertFalse(instanceObjectType0.hasReferenceName());
      assertFalse(instanceObjectType0.isNoResolvedType());
      assertFalse(instanceObjectType0.isNoType());
      assertFalse(instanceObjectType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "OlVuLT");
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(templateType0);
      assertTrue(templateType0.isTemplateType());
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString("Z42Ku=r)I`9kZ3/");
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType jSType0 = jSTypeRegistry0.createFromTypeNodes(node0, "com.google.javascript.rhino.jstype.TemplateType", objectType0);
      assertFalse(jSType0.isNoObjectType());
      assertTrue(objectType0.isNativeObjectType());
      assertFalse(objectType0.isTemplateType());
      assertFalse(objectType0.isAllType());
      assertFalse(jSType0.isResolved());
      assertFalse(objectType0.isNoType());
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(objectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertEquals(0, int0);
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GREATEST_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, objectType0, objectType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) objectType0);
      jSTypeRegistry0.createFunctionTypeWithVarArgs(objectType0, (JSType) indexedType0, (List<JSType>) immutableList0);
      assertTrue(objectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>(3878, 977.0F);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      String string0 = recordType0.toStringHelper(true);
      assertEquals("{}", string0);
      assertFalse(recordType0.isResolved());
      assertNotNull(string0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GREATEST_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn("@Sy", "Unknown class name").when(objectType0).toString();
      doReturn(true).when(objectType0).isNativeObjectType();
      doReturn(true).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "@Sy", objectType0);
      boolean boolean0 = prototypeObjectType0.isSubtype(functionType0);
      assertTrue(functionType0.hasCachedValues());
      assertTrue(boolean0);
  }
}
