/*

 * Tue Mar 03 18:46:30 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(objectType0).toString();
      doReturn((ObjectType.Property) null, (ObjectType.Property) null, (ObjectType.Property) null).when(objectType0).getSlot(anyString());
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, (String) null, objectType0);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("?", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSType.toMaybeTemplateType((JSType) recordType0);
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      boolean boolean0 = noObjectType0.hasAnyTemplateInternal();
      assertFalse(noObjectType0.isResolved());
      assertFalse(boolean0);
      assertFalse(noObjectType0.isAllType());
      assertFalse(noObjectType0.isNoResolvedType());
      assertFalse(noObjectType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "Not declared as a constructor", (Node) null, recordType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      boolean boolean0 = enumType0.canTestForEqualityWith(enumElementType0);
      assertTrue(enumElementType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "Not declared as a constructor", (Node) null, recordType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      recordType0.getLeastSupertype(enumElementType0);
      assertTrue(enumElementType0.hasCachedValues());
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSType.toMaybeParameterizedType((JSType) recordType0);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseUnknownType();
      JSType jSType1 = jSTypeRegistry0.createDefaultObjectUnion(jSType0);
      assertFalse(jSType1.isResolved());
      assertFalse(jSType1.isTemplateType());
      assertFalse(jSType1.isNoObjectType());
      assertFalse(jSType0.isAllType());
      assertFalse(jSType0.isNoType());
      assertFalse(jSType1.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isResolved());
      assertEquals(0, int0);
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.isResolved());
      assertEquals("{}", string0);
      assertFalse(recordType0.hasReferenceName());
      assertNotNull(string0);
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) errorFunctionType0);
      assertTrue(functionType0.isNominalConstructor());
      assertFalse(functionType0.isResolved());
      assertFalse(functionType0.isNoResolvedType());
      assertFalse(functionType0.isAllType());
      assertNotNull(functionType0);
      assertFalse(functionType0.isNoObjectType());
      assertFalse(functionType0.isNoType());
      assertTrue(functionType0.isFunctionType());
  }
}
