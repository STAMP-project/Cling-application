/*

 * Tue Mar 03 18:46:45 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(stringType0);
      boolean boolean0 = jSType_TypePair0.typeB.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      boolean boolean0 = JSType.isEquivalent(objectType0, objectType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "P<&}<Cs(}XwTF3ljr$@");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, templateType0, templateType0);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(indexedType0);
      assertFalse(jSType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(allType0);
      assertFalse(jSType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(stringType0);
      NoObjectType noObjectType0 = (NoObjectType)unionType0.meet(jSType_TypePair0.typeB);
      NamedType namedType0 = (NamedType)jSTypeRegistry0.getType((StaticScope<JSType>) noObjectType0, "+zP:9G'UQ7RD[#", "Unknown class name", 38, 0);
      UnknownType unknownType0 = (UnknownType)unionType0.getGreatestSubtype(namedType0);
      assertFalse(unknownType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) allType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) allType0, (List<JSType>) immutableList0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, functionType0, allType0);
      ImmutableList<JSType> immutableList1 = ImmutableList.of((JSType) functionType0, (JSType) allType0, (JSType) allType0, (JSType) functionType0, (JSType) parameterizedType0, (JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) functionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList1);
      unionType0.getTypesUnderInequality(allType0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(stringType0);
      NoObjectType noObjectType0 = (NoObjectType)unionType0.meet(jSType_TypePair0.typeB);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) stringType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) unionType0, (JSType) stringType0, (JSType) noObjectType0, jSType_TypePair0.typeA, jSType_TypePair0.typeA);
      UnionType unionType1 = new UnionType(jSTypeRegistry0, immutableList0);
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_FUNCTION_TYPE;
      FunctionType functionType0 = (FunctionType)jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      NoObjectType noObjectType1 = (NoObjectType)unionType1.getGreatestSubtype(functionType0);
      assertTrue(noObjectType1.hasCachedValues());
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).createUnionType(any(com.google.javascript.rhino.jstype.JSType[].class));
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry1);
      // Undeclared exception!
      try { 
        allType0.getLeastSupertype(unionType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) allType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) allType0, (List<JSType>) immutableList0);
      JSType jSType0 = allType0.getLeastSupertype(functionType0);
      assertFalse(jSType0.isUnionType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(stringType0);
      JSType jSType0 = unionType0.getGreatestSubtype(jSType_TypePair0.typeA);
      assertFalse(jSType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionType functionType0 = null;
      boolean boolean0 = JSType.isEquivalent(functionType0, functionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      boolean boolean0 = unionType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(stringType0);
      JSType jSType0 = unionType0.meet(jSType_TypePair0.typeB);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      JSType.TypePair jSType_TypePair1 = unknownType0.getTypesUnderShallowEquality(jSType0);
      assertNotSame(jSType_TypePair0, jSType_TypePair1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(parameterizedType0);
      JSType jSType1 = jSType0.autobox();
      assertFalse(jSType1.isFunctionPrototypeType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      ObjectType objectType0 = stringType0.dereference();
      assertFalse(objectType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(unionType0);
      TemplateType templateType0 = JSType.toMaybeTemplateType(jSType_TypePair0.typeA);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType jSType0 = stringType0.findPropertyType("Not declared as a constructor");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AllType allType0 = new AllType((JSTypeRegistry) null);
      JSType jSType0 = allType0.findPropertyType("Not declared as a constructor");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(stringType0);
      JSType jSType0 = stringType0.getGreatestSubtype(jSType_TypePair0.typeB);
      assertFalse(jSType0.isEnumType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(parameterizedType0);
      boolean boolean0 = jSType0.canAssignTo(parameterizedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry((ErrorReporter) null);
      NoType noType0 = new NoType(jSTypeRegistry1);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noType0.canTestForEqualityWith(noResolvedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      boolean boolean0 = unionType0.canTestForShallowEqualityWith(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      linkedList0.add((JSType) unionType0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry1, false);
      boolean boolean0 = linkedList0.remove((Object) unknownType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      Object object0 = new Object();
      boolean boolean0 = unionType0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0, true);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "THIS", (Node) null, instanceObjectType0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, enumType0, "Named type with empty name component");
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType("THIS", (Node) null, (Node) null, (JSType) enumElementType0);
      JSType jSType0 = functionType0.getGreatestSubtype(enumElementType0);
      assertFalse(jSType0.isStringValueType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(parameterizedType0);
      JSType jSType1 = jSType0.getRestrictedTypeGivenToBooleanOutcome(false);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderEquality(jSType1);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      JSType jSType0 = unionType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      boolean boolean0 = unionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(stringType0);
      stringType0.testForEqualityHelper(unionType0, jSType_TypePair0.typeB);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(stringType0);
      JSType jSType0 = unionType0.meet(jSType_TypePair0.typeB);
      JSType.TypePair jSType_TypePair1 = jSType0.getTypesUnderEquality(jSType_TypePair0.typeB);
      assertNotSame(jSType_TypePair0, jSType_TypePair1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, hashSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(unionType0);
      unionType0.testForEqualityHelper(jSType_TypePair0.typeA, unionType0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      JSType jSType0 = unionType0.getNativeType(jSTypeNative0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      voidType0.testForEquality(jSType0);
  }
}
