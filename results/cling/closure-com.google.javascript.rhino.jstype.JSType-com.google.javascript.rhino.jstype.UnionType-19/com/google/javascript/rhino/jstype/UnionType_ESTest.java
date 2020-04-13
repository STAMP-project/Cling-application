/*

 * Tue Mar 03 18:50:43 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "oC )-moS1) TQ>kC7y", 9, (-1));
      AllType allType0 = new AllType(jSTypeRegistry0);
      namedType0.testForEqualityHelper(allType0, namedType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      boolean boolean0 = JSType.isEquivalent(nullType0, (JSType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(stringType0);
      assertFalse(jSType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      JSType jSType0 = unionType0.restrictByNotNullOrUndefined();
      JSType jSType1 = jSType0.getLeastSupertype(unionType0);
      assertFalse(jSType1.isParameterizedType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      AllType allType0 = new AllType(jSTypeRegistry0);
      Node node0 = new Node(0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType(",", node0, allType0);
      JSType jSType0 = allType0.getLeastSupertype(enumType0);
      assertTrue(jSType0.hasDisplayName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = allType0.getTypesUnderEquality(nullType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      boolean boolean0 = JSType.isEquivalent(unionType0, unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = JSType.isEquivalent((JSType) null, (JSType) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[1];
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_NUMBER_STRING;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      ObjectType objectType0 = jSType0.dereference();
      assertTrue(objectType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null, (FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, true);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) voidType0);
      Node node0 = jSTypeRegistry1.createParametersWithVarArgs((List<JSType>) immutableList0);
      ArrowType arrowType0 = jSTypeRegistry1.createArrowType(node0, voidType0);
      voidType0.testForEquality(arrowType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSType[] jSTypeArray0 = new JSType[6];
      TemplateType templateType0 = JSType.toMaybeTemplateType(jSTypeArray0[3]);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoType();
      TemplateType templateType0 = JSType.toMaybeTemplateType(jSType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry((ErrorReporter) null);
      NullType nullType0 = new NullType(jSTypeRegistry1);
      JSType jSType0 = nullType0.restrictByNotNullOrUndefined();
      priorityQueue0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      boolean boolean0 = unionType0.hasAnyTemplateInternal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.findPropertyType("Not declared as a constructor");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(objectType0, stringType0);
      boolean boolean0 = JSType.isSubtypeHelper(allType0, parameterizedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType jSType0 = JSType.getGreatestSubtype((JSType) nullType0, (JSType) unionType0);
      assertFalse(jSType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.canAssignTo(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[1];
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_NUMBER_STRING;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSType jSType1 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      boolean boolean0 = jSType1.canAssignTo(jSType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      boolean boolean0 = recordType0.canTestForShallowEqualityWith(recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      boolean boolean0 = unionType0.equals(unknownType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, linkedHashSet0);
      linkedHashSet0.add((JSType) null);
      boolean boolean0 = linkedHashSet0.add(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[5];
      jSTypeArray0[4] = (JSType) stringType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(stringType0, jSTypeArray0);
      JSType.TypePair jSType_TypePair0 = functionType0.getTypesUnderShallowEquality(jSTypeArray0[4]);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      ObjectType objectType0 = jSTypeRegistry0.findCommonSuperObject(recordType0, recordType0);
      assertFalse(objectType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = noObjectType0.getPropertyType("");
      numberType0.testForEquality(jSType0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      unionType0.testForEqualityHelper(noType0, unionType0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(unionType0);
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry1.createConstructorTypeWithVarArgs(unionType0, jSTypeArray0);
      functionType0.testForEquality(jSType_TypePair0.typeB);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((ObjectType) null, (JSType) booleanType0, (List<JSType>) linkedList0);
      booleanType0.testForEquality(jSType0);
  }
}
