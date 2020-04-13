/*

 * Tue Mar 03 18:44:09 GMT 2020
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
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NullType;
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.getGreatestSubtypeWithProperty((JSType) null, "kh\"UsI,+");
      JSType.toMaybeTemplateType(jSType0);
      assertFalse(jSType0.isResolved());
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(jSType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.FUNCTION_INSTANCE_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, objectType0, "Named type with empty name component");
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType.getGreatestSubtype((JSType) nullType0, (JSType) enumElementType0);
      assertTrue(enumElementType0.hasCachedValues());
      assertFalse(enumElementType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(recordType0, recordType0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, parameterizedType0, recordType0);
      boolean boolean0 = JSType.isSubtypeHelper(indexedType0, recordType0);
      assertTrue(indexedType0.isRecordType());
      assertFalse(indexedType0.isNoResolvedType());
      assertFalse(indexedType0.isNativeObjectType());
      assertFalse(boolean0);
      assertFalse(indexedType0.hasReferenceName());
      assertFalse(indexedType0.isNoObjectType());
      assertFalse(indexedType0.isNoType());
      assertFalse(indexedType0.isResolved());
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
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      JSType.toMaybeParameterizedType((JSType) objectType0);
      assertFalse(objectType0.isNoResolvedType());
      assertFalse(objectType0.isNoType());
      assertFalse(objectType0.isNoObjectType());
      assertFalse(objectType0.isAllType());
      assertFalse(objectType0.isResolved());
      assertFalse(objectType0.hasReferenceName());
      assertFalse(objectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noObjectType0, true);
      boolean boolean0 = instanceObjectType0.isSubtype(noObjectType0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(instanceObjectType0.isNoObjectType());
      assertTrue(boolean0);
      assertFalse(instanceObjectType0.isResolved());
      assertFalse(instanceObjectType0.isNoType());
      assertFalse(instanceObjectType0.isNoResolvedType());
      assertFalse(instanceObjectType0.isNominalType());
      assertFalse(instanceObjectType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      Node node0 = Node.newString("r#");
      JSType jSType0 = jSTypeRegistry0.createFromTypeNodes(node0, "r#", (StaticScope<JSType>) null);
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(jSType0.isNoObjectType());
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNoType());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.hasReferenceName());
      assertEquals("{}", string0);
      assertFalse(recordType0.isNativeObjectType());
      assertNotNull(string0);
      assertFalse(recordType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(objectType0).toString();
      doReturn((ObjectType.Property) null, (ObjectType.Property) null, (ObjectType.Property) null).when(objectType0).getSlot(anyString());
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "TK( Mq!Lz5", objectType0);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("toString", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.FUNCTION_INSTANCE_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, objectType0, "Named type with empty name component");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, objectType0, (JSType) null);
      JSType.getLeastSupertype((JSType) indexedType0, (JSType) enumElementType0);
      assertTrue(enumElementType0.hasCachedValues());
      assertFalse(enumElementType0.isAllType());
  }
}
