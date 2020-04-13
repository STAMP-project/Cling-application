/*

 * Tue Mar 03 18:44:37 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = (NamedType)jSTypeRegistry0.createNamedType("Not declared as a ype name", ",6UGUW!4U+~$CI7", (-1), (-1));
      Node node0 = Node.newString(0, "H");
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, (String) null, namedType0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      boolean boolean0 = prototypeObjectType0.defineProperty("Named type with empty name component", noResolvedType0, false, node0);
      assertTrue(boolean0);
      
      prototypeObjectType0.setPropertyJSDocInfo("Named type with empty name component", jSDocInfo0);
      assertFalse(prototypeObjectType0.isNativeObjectType());
      assertFalse(prototypeObjectType0.hasReferenceName());
      assertFalse(prototypeObjectType0.isNoType());
      assertFalse(prototypeObjectType0.isNoResolvedType());
      assertFalse(prototypeObjectType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.toMaybeTemplateType((JSType) stringType0);
      assertFalse(stringType0.isAllType());
      assertFalse(stringType0.isNoResolvedType());
      assertFalse(stringType0.isNoObjectType());
      assertFalse(stringType0.isNoType());
      assertFalse(stringType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(noObjectType0, noObjectType0);
      JSType.getLeastSupertype((JSType) noObjectType0, (JSType) parameterizedType0);
      assertTrue(noObjectType0.hasCachedValues());
      assertFalse(noObjectType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseAllType();
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, jSType0, "o,U`%7*nOn7zPg_ *q");
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Named type with empty name component", enumElementType0);
      prototypeObjectType0.getTypesUnderInequality(enumElementType0);
      assertTrue(enumElementType0.hasCachedValues());
      assertFalse(jSType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.canTestForEqualityWith(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>(1273);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      boolean boolean0 = JSType.isSubtypeHelper(recordType0, recordType0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isNoObjectType());
      assertTrue(boolean0);
      assertFalse(recordType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VoidType voidType0 = new VoidType((JSTypeRegistry) null);
      JSType.toMaybeParameterizedType((JSType) voidType0);
      assertFalse(voidType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = (NamedType)jSTypeRegistry0.createNamedType("Not declared as a type name", "6UGUW!4U+~$CI7", (-1), (-1));
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      StringType stringType0 = (StringType)modificationVisitor0.caseStringType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, (String) null, namedType0);
      boolean boolean0 = prototypeObjectType0.canAssignTo(stringType0);
      assertFalse(prototypeObjectType0.isNativeObjectType());
      assertFalse(prototypeObjectType0.isNoResolvedType());
      assertFalse(prototypeObjectType0.isNoType());
      assertFalse(prototypeObjectType0.isNoObjectType());
      assertFalse(prototypeObjectType0.isResolved());
      assertFalse(prototypeObjectType0.hasReferenceName());
      assertFalse(prototypeObjectType0.isAllType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseAllType();
      JSType jSType1 = jSTypeRegistry0.createDefaultObjectUnion(jSType0);
      assertFalse(jSType0.isNoType());
      assertFalse(jSType1.isNoResolvedType());
      assertFalse(jSType1.isNoObjectType());
      assertFalse(jSType1.isResolved());
      assertFalse(jSType1.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      int int0 = objectType0.getPropertiesCount();
      assertFalse(objectType0.isNoResolvedType());
      assertFalse(objectType0.isNativeObjectType());
      assertFalse(objectType0.hasReferenceName());
      assertEquals(0, int0);
      assertFalse(objectType0.isResolved());
      assertFalse(objectType0.isNoType());
      assertFalse(objectType0.isAllType());
      assertFalse(objectType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType.toMaybeFunctionType((JSType) objectType0);
      assertFalse(objectType0.isNoResolvedType());
      assertTrue(objectType0.isNativeObjectType());
      assertFalse(objectType0.isNoObjectType());
      assertFalse(objectType0.isNoType());
      assertFalse(objectType0.isResolved());
      assertFalse(objectType0.hasReferenceName());
      assertFalse(objectType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = (NamedType)jSTypeRegistry0.createNamedType("Not declared aB a type name", ",6UGUW!4U+~$CI7", (-1), (-1));
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, (String) null, namedType0);
      prototypeObjectType0.setPrettyPrint(true);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("com.google.javascript.rhino.jstype.NoType", jSDocInfo0);
      String string0 = prototypeObjectType0.toStringHelper(true);
      assertFalse(prototypeObjectType0.isAllType());
      assertFalse(prototypeObjectType0.hasCachedValues());
      assertNotNull(string0);
      assertFalse(prototypeObjectType0.isNoResolvedType());
      assertEquals("{com.google.javascript.rhino.jstype.NoType: ?}", string0);
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
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "*I", objectType0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      prototypeObjectType0.setPropertyJSDocInfo("4\"y:x\"~n_?O0poTV", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn("Use SerializedForm", "Use SerializedForm").when(objectType0).toString();
      doReturn(true).when(objectType0).isNativeObjectType();
      doReturn(true).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Use SerializedForm", objectType0, false);
      NumberType numberType0 = new NumberType(jSTypeRegistry1);
      boolean boolean0 = prototypeObjectType0.isSubtype(numberType0);
      assertTrue(prototypeObjectType0.hasCachedValues());
      assertTrue(boolean0);
  }
}
