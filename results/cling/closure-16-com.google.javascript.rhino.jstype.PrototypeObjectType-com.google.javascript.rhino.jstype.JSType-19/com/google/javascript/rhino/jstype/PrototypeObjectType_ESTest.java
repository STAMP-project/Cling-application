/*

 * Tue Mar 03 18:47:24 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
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
import com.google.javascript.rhino.jstype.ModificationVisitor;
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, (String) null, (ObjectType) null);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("Unknown class name", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSType[] jSTypeArray0 = new JSType[4];
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) null, jSTypeArray0);
      boolean boolean0 = functionType0.defineDeclaredProperty("<[bqc[(?p|Yr[V?nF5J", (JSType) null, (Node) null);
      assertTrue(boolean0);
      assertFalse(functionType0.isAllType());
      assertFalse(functionType0.isNoType());
      assertFalse(functionType0.isNoObjectType());
      assertTrue(functionType0.isFunctionType());
      assertFalse(functionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSType[] jSTypeArray0 = new JSType[4];
      TemplateType templateType0 = JSType.toMaybeTemplateType(jSTypeArray0[0]);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType.toMaybeTemplateType((JSType) recordType0);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(objectType0, objectType0);
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = (JSType) parameterizedType0;
      jSTypeRegistry0.createFunctionType((JSType) parameterizedType0, true, jSTypeArray0);
      assertTrue(objectType0.hasCachedValues());
      assertFalse(objectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      recordType0.getTypesUnderInequality(recordType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)recordType0.getGreatestSubtypeHelper(recordType0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.hasCachedValues());
      assertFalse(instanceObjectType0.isNoResolvedType());
      assertFalse(instanceObjectType0.isResolved());
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(instanceObjectType0.isNoObjectType());
      assertTrue(instanceObjectType0.hasReferenceName());
      assertTrue(instanceObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType.toMaybeParameterizedType((JSType) voidType0);
      assertFalse(voidType0.isNoType());
      assertFalse(voidType0.isAllType());
      assertFalse(voidType0.isNoObjectType());
      assertFalse(voidType0.isResolved());
      assertFalse(voidType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoType();
      JSType jSType1 = jSTypeRegistry0.createDefaultObjectUnion(jSType0);
      assertFalse(jSType1.isNoObjectType());
      assertFalse(jSType0.isAllType());
      assertFalse(jSType1.isResolved());
      assertFalse(jSType1.isNoResolvedType());
      assertFalse(jSType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      int int0 = objectType0.getPropertiesCount();
      assertFalse(objectType0.isResolved());
      assertFalse(objectType0.isNoResolvedType());
      assertFalse(objectType0.isNoType());
      assertFalse(objectType0.isNoObjectType());
      assertEquals(0, int0);
      assertFalse(objectType0.isNativeObjectType());
      assertFalse(objectType0.hasReferenceName());
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
      PrototypeObjectType prototypeObjectType0 = (PrototypeObjectType)jSTypeRegistry0.createAnonymousObjectType();
      String string0 = prototypeObjectType0.toStringHelper(true);
      assertFalse(prototypeObjectType0.isAllType());
      assertFalse(prototypeObjectType0.isNoType());
      assertFalse(prototypeObjectType0.isNoObjectType());
      assertFalse(prototypeObjectType0.isNativeObjectType());
      assertNotNull(string0);
      assertFalse(prototypeObjectType0.hasReferenceName());
      assertEquals("{}", string0);
      assertFalse(prototypeObjectType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry1, (String) null);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "7$_'vb {O- BQz&U+", templateType0, true);
      PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry1, ": ", prototypeObjectType0, true);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[0] = (JSType) prototypeObjectType1;
      // Undeclared exception!
      try { 
        jSTypeRegistry1.createOptionalParameters(jSTypeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[4];
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("<[bqc[(?p|Yr[V?nF5J", (Node) null);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0);
      jSTypeArray0[0] = (JSType) instanceObjectType0;
      jSTypeArray0[1] = (JSType) functionType0;
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
