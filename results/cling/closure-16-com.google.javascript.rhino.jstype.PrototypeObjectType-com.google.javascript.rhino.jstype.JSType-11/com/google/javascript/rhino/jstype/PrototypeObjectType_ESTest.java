/*

 * Tue Mar 03 18:45:17 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
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
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "is_optional_param", objectType0);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("", jSDocInfo0);
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
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType.toMaybeTemplateType((JSType) noResolvedType0);
      assertFalse(noResolvedType0.isAllType());
      assertFalse(noResolvedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.hasAnyTemplateInternal();
      assertFalse(noResolvedType0.isAllType());
      assertFalse(noResolvedType0.isResolved());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      recordType0.testForEquality(recordType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)recordType0.getGreatestSubtypeHelper(recordType0);
      assertFalse(instanceObjectType0.isNoResolvedType());
      assertFalse(instanceObjectType0.isResolved());
      assertTrue(instanceObjectType0.hasReferenceName());
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(instanceObjectType0.isNoObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertTrue(instanceObjectType0.hasCachedValues());
      assertTrue(recordType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.PrototypeObjectType");
      JSType.toMaybeParameterizedType((JSType) templateType0);
      assertFalse(templateType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noType0, true);
      boolean boolean0 = instanceObjectType0.isSubtype(noType0);
      assertFalse(instanceObjectType0.isNoType());
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertTrue(boolean0);
      assertFalse(instanceObjectType0.isNoObjectType());
      assertFalse(instanceObjectType0.isAllType());
      assertFalse(instanceObjectType0.hasReferenceName());
      assertFalse(instanceObjectType0.isResolved());
      assertFalse(instanceObjectType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString("6H|~tiy=3KgL7`V}", (-2234), (-2234));
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "6H|~tiy=3KgL7`V}");
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "um*c+H[@o1@8t>Pi", unresolvedTypeExpression0);
      // Undeclared exception!
      try { 
        prototypeObjectType0.resolveInternal(simpleErrorReporter0, unresolvedTypeExpression0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.jstype.UnionType cannot be cast to com.google.javascript.rhino.jstype.ObjectType
         //
         verifyException("com.google.javascript.rhino.jstype.PrototypeObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString("6H|~tiy=3KgL7`V}", (-2234), (-2234));
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "6H|~tiy=3KgL7`V}");
      JSType[] jSTypeArray0 = new JSType[3];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) unresolvedTypeExpression0, false, jSTypeArray0);
      int int0 = functionType0.getPropertiesCount();
      assertFalse(functionType0.isNoObjectType());
      assertFalse(functionType0.isAllType());
      assertEquals(0, int0);
      assertFalse(functionType0.isNoType());
      assertTrue(functionType0.isFunctionType());
      assertFalse(functionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[7];
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.PrototypeObjectType");
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) templateType0, jSTypeArray0);
      functionType0.getGreatestSubtype(templateType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString("6H|~tiy=3KgL7`V}", (-2234), (-2234));
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "6H|~tiy=3KgL7`V}");
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[0] = (JSType) unresolvedTypeExpression0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) unresolvedTypeExpression0, false, jSTypeArray0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(functionType0, node0);
      hashMap0.put("COMMA", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      jSTypeArray0[1] = (JSType) recordType0;
      jSTypeArray0[2] = (JSType) unresolvedTypeExpression0;
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) unresolvedTypeExpression0, jSTypeArray0);
      String string0 = functionType1.toAnnotationString();
      assertTrue(functionType1.isFunctionType());
      assertFalse(functionType1.isNoType());
      assertFalse(functionType1.equals((Object)functionType0));
      assertEquals("function (?, {COMMA: Function}, ...[?]): ?", string0);
      assertFalse(functionType1.isNoObjectType());
  }
}
