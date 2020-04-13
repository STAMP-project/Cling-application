/*

 * Tue Mar 03 18:44:39 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[4];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) null, jSTypeArray0);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      functionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      assertTrue(functionType0.hasCachedValues());
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
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Y#N{", (Node) null);
      JSType.toMaybeTemplateType((JSType) functionType0);
      assertTrue(functionType0.isFunctionType());
      assertFalse(functionType0.isResolved());
      assertFalse(functionType0.isAllType());
      assertFalse(functionType0.isNoResolvedType());
      assertFalse(functionType0.isNoType());
      assertFalse(functionType0.isNoObjectType());
      assertFalse(functionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null, (FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(objectType0).toString();
      doReturn(false).when(objectType0).isNativeObjectType();
      doReturn(false).when(objectType0).isUnknownType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, ".jcT?F2ot'!2lY", objectType0, true);
      // Undeclared exception!
      try { 
        prototypeObjectType0.testForEquality(prototypeObjectType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      assertTrue(recordType0.isRecordType());
      
      recordType0.isSubtype(recordType0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType.toMaybeParameterizedType((JSType) noObjectType0);
      assertFalse(noObjectType0.isNoType());
      assertFalse(noObjectType0.isResolved());
      assertFalse(noObjectType0.isAllType());
      assertFalse(noObjectType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "Y#N{", 2, 42);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Y#N{", namedType0, false);
      boolean boolean0 = prototypeObjectType0.isSubtype(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "3g72");
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(templateType0);
      assertTrue(templateType0.isTemplateType());
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(unknownType0);
      assertFalse(unknownType0.isNoType());
      assertFalse(jSType0.isTemplateType());
      assertFalse(jSType0.isNoResolvedType());
      assertFalse(jSType0.isNoObjectType());
      assertFalse(jSType0.isResolved());
      assertFalse(jSType0.equals((Object)unknownType0));
      assertFalse(unknownType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      recordType0.getPropertiesCount();
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(objectType0).toString();
      doReturn(0).when(objectType0).getPropertiesCount();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "2aI<@Lh4M~hSz", objectType0, false);
      int int0 = prototypeObjectType0.getPropertiesCount();
      assertFalse(prototypeObjectType0.isNativeObjectType());
      assertFalse(prototypeObjectType0.isResolved());
      assertEquals(0, int0);
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
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = (JSType) noObjectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) noObjectType0, jSTypeArray0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) functionType0, (JSType) noObjectType0, jSTypeArray0[0], (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      Node node0 = Node.newNumber(0.0, 1, 4095);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "{");
      unresolvedTypeExpression0.getLeastSupertype(unionType0);
      assertTrue(functionType0.hasCachedValues());
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[4];
      Node node0 = Node.newString("com.google.javascript.rhino.jstype.JSType", (-8), 1);
      ObjectType.Property objectType_Property0 = new ObjectType.Property("GE", jSTypeArray0[1], false, node0);
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn("Unknown class name", "GE").when(objectType0).toString();
      doReturn(objectType_Property0).when(objectType0).getSlot(anyString());
      doReturn(true).when(objectType0).isNativeObjectType();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "", objectType0, true);
      boolean boolean0 = prototypeObjectType0.hasProperty("Unknown class name");
      assertFalse(prototypeObjectType0.isNoType());
      assertTrue(prototypeObjectType0.isNativeObjectType());
      assertFalse(prototypeObjectType0.isNoObjectType());
      assertFalse(prototypeObjectType0.isNoResolvedType());
      assertTrue(prototypeObjectType0.hasReferenceName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertNotNull(string0);
      assertFalse(recordType0.isNoResolvedType());
      assertEquals("{}", string0);
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
  }
}
