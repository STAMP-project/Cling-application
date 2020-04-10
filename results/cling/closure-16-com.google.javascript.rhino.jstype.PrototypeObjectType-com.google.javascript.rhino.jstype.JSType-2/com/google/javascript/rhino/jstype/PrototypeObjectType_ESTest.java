/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 16:27:22 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoObjectType;
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "bind");
      int int0 = errorFunctionType0.getPropertiesCount();
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(errorFunctionType0.isNoType());
      assertFalse(errorFunctionType0.isAllType());
      assertFalse(errorFunctionType0.isNoObjectType());
      assertEquals(0, int0);
      assertFalse(errorFunctionType0.isResolved());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(objectType0).toString();
      doReturn((ObjectType.Property) null, (ObjectType.Property) null, (ObjectType.Property) null).when(objectType0).getSlot(anyString());
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, (String) null, objectType0);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        prototypeObjectType0.setPropertyJSDocInfo((String) null, jSDocInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, (String) null, noType0, false);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = prototypeObjectType0.defineProperty("Named type with empty name component", prototypeObjectType0, false, node0);
      assertTrue(boolean0);
      
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("Named type with empty name component", jSDocInfo0);
      assertFalse(prototypeObjectType0.isNativeObjectType());
      assertFalse(prototypeObjectType0.isAllType());
      assertFalse(prototypeObjectType0.hasCachedValues());
      assertFalse(prototypeObjectType0.isNoObjectType());
      assertFalse(prototypeObjectType0.isNoType());
      assertFalse(prototypeObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      Node node0 = Node.newString("Named type with empty name component");
      EnumType enumType0 = jSTypeRegistry0.createEnumType("Unknown class name", node0, noResolvedType0);
      JSType.getGreatestSubtype((JSType) errorFunctionType0, (JSType) enumType0);
      assertTrue(errorFunctionType0.hasCachedValues());
      assertTrue(errorFunctionType0.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType.toMaybeParameterizedType((JSType) noObjectType0);
      assertFalse(noObjectType0.isAllType());
      assertFalse(noObjectType0.isNoResolvedType());
      assertFalse(noObjectType0.isResolved());
      assertFalse(noObjectType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewThisType(noResolvedType0, noResolvedType0);
      jSTypeRegistry0.createOptionalNullableType(functionType0);
      assertTrue(functionType0.hasCachedValues());
      assertFalse(noResolvedType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(recordType0);
      boolean boolean0 = recordType0.isSubtype(jSType0);
      assertTrue(recordType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType.toMaybeTemplateType((JSType) noType0);
      assertFalse(noType0.isAllType());
      assertFalse(noType0.isNoResolvedType());
      assertFalse(noType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      boolean boolean0 = instanceObjectType0.isSubtype(errorFunctionType0);
      assertFalse(instanceObjectType0.isNoType());
      assertFalse(instanceObjectType0.isAllType());
      assertFalse(instanceObjectType0.isNoObjectType());
      assertFalse(instanceObjectType0.isResolved());
      assertFalse(instanceObjectType0.isNoResolvedType());
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(instanceObjectType0.isNativeObjectType());
      assertFalse(instanceObjectType0.hasReferenceName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>(1, 1);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isAllType());
      assertEquals("{}", string0);
      assertNotNull(string0);
  }
}
