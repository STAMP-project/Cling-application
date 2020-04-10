/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 03:58:15 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
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
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
      assertEquals(0, int0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType((JSTypeRegistry) null, "b<d", (ObjectType) null, true);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        prototypeObjectType0.setPropertyJSDocInfo("b<d", jSDocInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.isSubtype(recordType0);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.hasReferenceName());
      assertTrue(boolean0);
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType.toMaybeFunctionType((JSType) noResolvedType0);
      assertFalse(noResolvedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, noObjectType0, "]&7+W:bj9/B[t");
      noObjectType0.testForEqualityHelper(enumElementType0, enumElementType0);
      assertTrue(enumElementType0.hasCachedValues());
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_OBJECT_FUNCTION_TYPE;
      FunctionType functionType0 = (FunctionType)jSTypeRegistry0.getNativeType(jSTypeNative0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      StringType stringType0 = (StringType)modificationVisitor0.caseStringType();
      assertFalse(stringType0.isEnumElementType());
      
      functionType0.testForEqualityHelper(functionType0, stringType0);
      assertFalse(stringType0.isResolved());
      assertFalse(stringType0.isNoObjectType());
      assertFalse(stringType0.isAllType());
      assertTrue(functionType0.isNominalConstructor());
      assertFalse(stringType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType.toMaybeParameterizedType((JSType) errorFunctionType0);
      assertFalse(errorFunctionType0.isNoType());
      assertFalse(errorFunctionType0.isAllType());
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(errorFunctionType0.isNoObjectType());
      assertFalse(errorFunctionType0.isNoResolvedType());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      jSTypeRegistry0.createOptionalType(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      Node node0 = Node.newString("T0", 51, 2);
      JSType jSType0 = jSTypeRegistry0.createFromTypeNodes(node0, "toString", errorFunctionType0);
      assertFalse(jSType0.isNoObjectType());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(errorFunctionType0.isNoType());
      assertFalse(errorFunctionType0.isTemplateType());
      assertFalse(jSType0.isResolved());
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(errorFunctionType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_OBJECT_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      JSType.toMaybeTemplateType(jSType0);
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(jSType0.isNoType());
      assertFalse(jSType0.isNoObjectType());
      assertFalse(jSType0.isAllType());
      assertTrue(jSType0.isNominalConstructor());
      assertFalse(jSType0.isResolved());
      assertTrue(jSType0.isFunctionType());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.findPropertyType((String) null);
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      Node node0 = Node.newString("Unknown class name", 51, 2);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = errorFunctionType0.defineProperty("com.google.common.collect.Lists$TransformingSequentialList", noResolvedType0, false, node0);
      assertFalse(errorFunctionType0.isNoObjectType());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isNoType());
      assertFalse(noResolvedType0.isAllType());
      assertTrue(errorFunctionType0.isFunctionType());
      assertTrue(boolean0);
      assertFalse(errorFunctionType0.isNoResolvedType());
      assertFalse(noResolvedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, false);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "}").when(objectType0).toString();
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false, true).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "X,", objectType0, true);
      PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry1, "Unknown class name", prototypeObjectType0, true);
      boolean boolean0 = prototypeObjectType1.isSubtype(prototypeObjectType0);
      assertTrue(prototypeObjectType1.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertEquals("{}", string0);
      assertFalse(recordType0.isResolved());
      assertNotNull(string0);
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isAllType());
  }
}
