/*

 * Tue Mar 03 18:44:24 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoObjectType;
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
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "_Rrl Y", objectType0, false);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("_Rrl Y", jSDocInfo0);
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString("4RbMn'f`)Hp0['");
      PrototypeObjectType prototypeObjectType0 = (PrototypeObjectType)jSTypeRegistry0.createNativeAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, prototypeObjectType0, prototypeObjectType0);
      boolean boolean0 = prototypeObjectType0.defineProperty("4RbMn'f`)Hp0['", parameterizedType0, true, node0);
      assertFalse(prototypeObjectType0.isNoType());
      assertTrue(prototypeObjectType0.isNativeObjectType());
      assertFalse(prototypeObjectType0.isNoObjectType());
      assertTrue(boolean0);
      assertFalse(prototypeObjectType0.isNoResolvedType());
      assertFalse(prototypeObjectType0.hasReferenceName());
      assertFalse(parameterizedType0.isResolved());
      assertFalse(prototypeObjectType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Node node0 = Node.newString("Unknown class name");
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "Named type with empty name component");
      JSType.toMaybeTemplateType((JSType) unresolvedTypeExpression0);
      assertFalse(unresolvedTypeExpression0.isNoType());
      assertFalse(unresolvedTypeExpression0.isNoObjectType());
      assertFalse(unresolvedTypeExpression0.isResolved());
      assertFalse(unresolvedTypeExpression0.isNoResolvedType());
      assertFalse(unresolvedTypeExpression0.isAllType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "Named type with empty name component", (Node) null, objectType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      enumType0.getTypesUnderShallowEquality(enumElementType0);
      assertTrue(enumElementType0.hasCachedValues());
      assertTrue(objectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      recordType0.matchConstraint(recordType0);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertTrue(recordType0.isRecordType());
      assertFalse(recordType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType.toMaybeParameterizedType((JSType) objectType0);
      assertFalse(objectType0.isAllType());
      assertFalse(objectType0.isNoType());
      assertTrue(objectType0.isNativeObjectType());
      assertFalse(objectType0.isNoObjectType());
      assertFalse(objectType0.isResolved());
      assertFalse(objectType0.isNoResolvedType());
      assertFalse(objectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isAllType());
      assertEquals(0, int0);
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = Node.newString("Named type with empty name component");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0, (JSType) null);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) arrowType0, node0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(functionType0, functionType0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = (JSType) parameterizedType0;
      FunctionType functionType1 = jSTypeRegistry0.createConstructorTypeWithVarArgs(noObjectType0, jSTypeArray0);
      assertFalse(functionType1.isNoObjectType());
      assertFalse(functionType1.isNoType());
      assertFalse(functionType1.isResolved());
      assertFalse(functionType1.isAllType());
      assertTrue(functionType1.isFunctionType());
      assertFalse(functionType1.isNominalConstructor());
      assertFalse(functionType1.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertEquals("{}", string0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.isNoResolvedType());
      assertFalse(recordType0.isAllType());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      jSTypeRegistry0.createDefaultObjectUnion(objectType0);
      assertTrue(objectType0.hasCachedValues());
      assertFalse(objectType0.hasReferenceName());
  }
}
