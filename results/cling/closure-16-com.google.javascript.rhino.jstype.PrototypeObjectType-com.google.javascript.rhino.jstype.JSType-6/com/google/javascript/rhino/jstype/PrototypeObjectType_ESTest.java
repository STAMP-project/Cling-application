/*

 * Tue Mar 03 18:44:29 GMT 2020
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
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
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
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      TemplateType templateType1 = JSType.toMaybeTemplateType((JSType) templateType0);
      assertFalse(templateType1.isResolved());
      assertNotNull(templateType1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ObjectType objectType0 = jSTypeRegistry0.findCommonSuperObject(recordType0, recordType0);
      assertFalse(objectType0.isNoResolvedType());
      assertFalse(objectType0.isNoType());
      assertFalse(objectType0.isNoObjectType());
      assertFalse(objectType0.isResolved());
      assertTrue(recordType0.isRecordType());
      assertFalse(objectType0.isAllType());
      assertFalse(objectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      JSType.toMaybeParameterizedType((JSType) templateType0);
      assertFalse(templateType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      Node node0 = Node.newNumber((-1779.335839976287));
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) templateType0, node0);
      ObjectType objectType0 = jSTypeRegistry0.createObjectType("Unknown class name", node0, (ObjectType) templateType0);
      boolean boolean0 = objectType0.canAssignTo(functionType0);
      assertTrue(functionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(templateType0);
      assertTrue(templateType0.isTemplateType());
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, templateType0, templateType0);
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = (JSType) templateType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(indexedType0, jSTypeArray0);
      int int0 = functionType0.getPropertiesCount();
      assertFalse(functionType0.isResolved());
      assertFalse(functionType0.isNoType());
      assertFalse(functionType0.isNoObjectType());
      assertFalse(functionType0.isAllType());
      assertFalse(functionType0.isNoResolvedType());
      assertTrue(functionType0.isFunctionType());
      assertFalse(functionType0.isNominalConstructor());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0);
      ObjectType objectType0 = instanceObjectType0.getImplicitPrototype();
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) functionType0, (JSType) objectType0, (JSType) functionType0, (JSType) instanceObjectType0, (JSType) objectType0, (JSType) objectType0);
      FunctionType functionType1 = (FunctionType)jSTypeRegistry0.createFunctionTypeWithVarArgs(objectType0, (JSType) functionType0, (List<JSType>) immutableList0);
      jSTypeRegistry0.createDefaultObjectUnion(functionType1);
      assertTrue(functionType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      Node node0 = Node.newNumber(1840.928283641546);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(allType0, node0);
      hashMap0.putIfAbsent("Named type with empty name component", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      String string0 = recordType0.toStringHelper(true);
      assertNotNull(string0);
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoType());
      assertEquals("{Named type with empty name component: *}", string0);
      assertFalse(recordType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, jSType0, "Named type with empty name component");
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(enumElementType0, enumElementType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, (JSType) enumElementType0, (JSType) enumElementType0, (JSType) parameterizedType0, (JSType) enumElementType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      Node node0 = Node.newString("Unknown class name", 0, 1);
      ObjectType.Property objectType_Property0 = new ObjectType.Property((String) null, unionType0, false, node0);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn("Not declared as a type name", "", (String) null, "@sZ", "Not declared as a type name").when(objectType0).toString();
      doReturn(objectType_Property0, objectType_Property0, objectType_Property0, objectType_Property0).when(objectType0).getSlot(anyString());
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "", objectType0);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("5@%L+iy*mG", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(objectType0).toString();
      doReturn((ObjectType.Property) null, (ObjectType.Property) null, (ObjectType.Property) null).when(objectType0).getSlot(anyString());
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "", objectType0);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("5@%L+iy*mG", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }
}
