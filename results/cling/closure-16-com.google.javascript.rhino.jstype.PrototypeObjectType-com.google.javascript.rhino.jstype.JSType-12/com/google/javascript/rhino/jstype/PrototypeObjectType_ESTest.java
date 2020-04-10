/*

 * Tue Mar 03 18:45:18 GMT 2020
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
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NullType;
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
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      JSType.toMaybeTemplateType((JSType) errorFunctionType0);
      assertFalse(errorFunctionType0.isNoResolvedType());
      assertTrue(errorFunctionType0.isFunctionType());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isResolved());
      assertFalse(errorFunctionType0.isNoObjectType());
      assertFalse(errorFunctionType0.isNoType());
      assertFalse(errorFunctionType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) noObjectType0;
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

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      recordType0.testForEquality(recordType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      RecordType recordType1 = (RecordType)JSType.getLeastSupertype((JSType) recordType0, (JSType) recordType0);
      assertFalse(recordType1.isAllType());
      assertFalse(recordType1.isNoType());
      assertFalse(recordType1.isNoObjectType());
      assertFalse(recordType1.isNativeObjectType());
      assertFalse(recordType1.hasReferenceName());
      assertFalse(recordType1.isResolved());
      assertFalse(recordType1.isNoResolvedType());
      assertFalse(recordType0.hasCachedValues());
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
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoType();
      JSType.toMaybeParameterizedType(jSType0);
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(jSType0.isAllType());
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Not declared as a type name");
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(templateType0).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry1, "Not declared as a type name", (ObjectType) null);
      boolean boolean0 = prototypeObjectType0.isSubtype(nullType0);
      assertFalse(prototypeObjectType0.isNoResolvedType());
      assertTrue(prototypeObjectType0.hasReferenceName());
      assertFalse(prototypeObjectType0.isResolved());
      assertFalse(prototypeObjectType0.isAllType());
      assertFalse(prototypeObjectType0.isNoObjectType());
      assertFalse(prototypeObjectType0.isNoType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Not declared as a type name");
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(templateType0);
      assertFalse(jSType0.isResolved());
      assertTrue(templateType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      jSTypeRegistry0.createDefaultObjectUnion(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.isNativeObjectType());
      assertEquals(0, int0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
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
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      boolean boolean0 = errorFunctionType0.isSubtype(errorFunctionType0);
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isResolved());
      assertFalse(errorFunctionType0.isNoObjectType());
      assertTrue(boolean0);
      assertFalse(errorFunctionType0.isAllType());
      assertFalse(errorFunctionType0.isNoResolvedType());
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(errorFunctionType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(objectType0).toString();
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "{...}", objectType0, false);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = prototypeObjectType0.defineProperty("Not declared as a type name", prototypeObjectType0, true, node0);
      assertTrue(boolean0);
      
      boolean boolean1 = prototypeObjectType0.hasProperty("Not declared as a type name");
      assertFalse(prototypeObjectType0.isNativeObjectType());
      assertTrue(boolean1);
      assertFalse(prototypeObjectType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(objectType0).toString();
      doReturn((ObjectType.Property) null, (ObjectType.Property) null, (ObjectType.Property) null).when(objectType0).getSlot(anyString());
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "jsdoc_info", objectType0, true);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isResolved());
      assertEquals("{}", string0);
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isAllType());
      assertNotNull(string0);
      assertFalse(recordType0.isNativeObjectType());
  }
}
