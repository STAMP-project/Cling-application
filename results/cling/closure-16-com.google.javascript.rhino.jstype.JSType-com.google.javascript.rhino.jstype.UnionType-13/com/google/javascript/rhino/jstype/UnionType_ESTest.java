/*

 * Tue Mar 03 18:49:43 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      boolean boolean0 = JSType.isEquivalent(allType0, errorFunctionType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry1);
      JSType jSType0 = noResolvedType0.getPropertyType("Named type with empty name component");
      JSType.TypePair jSType_TypePair0 = numberType0.getTypesUnderInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = JSType.isEquivalent((JSType) null, (JSType) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, hashSet0);
      boolean boolean0 = unionType0.isTemplateType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, hashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowEquality(unknownType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      TreeSet<BooleanType> treeSet0 = new TreeSet<BooleanType>();
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>((SortedSet<? extends JSType>) treeSet0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      NoType noType0 = (NoType)unionType0.restrictByNotNullOrUndefined();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) unknownType0, (JSType) noType0);
      UnionType unionType1 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType1.getTypesUnderInequality(allType0);
      assertFalse(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      noResolvedType0.testForEquality(unionType0);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      TreeSet<BooleanType> treeSet0 = new TreeSet<BooleanType>();
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>((SortedSet<? extends JSType>) treeSet0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType jSType0 = allType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.canBeCalled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = allType0.getLeastSupertype(recordType0);
      assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null, (FunctionType) null, (FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayDeque0);
      boolean boolean0 = unionType0.canTestForShallowEqualityWith(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry((ErrorReporter) null, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      ImmutableList<AllType> immutableList0 = ImmutableList.of(allType0, allType0, allType0, allType0);
      ImmutableList<JSType> immutableList1 = ImmutableList.copyOf((Collection<? extends JSType>) immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry1, immutableList1);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[0];
      NoType noType0 = (NoType)jSTypeRegistry1.createUnionType(jSTypeNativeArray0);
      unionType0.getTypesUnderEquality(noType0);
      assertFalse(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      boolean boolean0 = JSType.isEquivalent(allType0, (JSType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      boolean boolean0 = unionType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, errorFunctionType0, errorFunctionType0);
      JSType.TypePair jSType_TypePair0 = indexedType0.getTypesUnderInequality(errorFunctionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.autobox();
      assertFalse(jSType0.isNullType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) objectType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = booleanType0.findPropertyType("com.google.javascript.rhino.jstype.JSType$2");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.findPropertyType("");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", 6158, 139);
      JSType jSType0 = namedType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowEquality(namedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      JSType jSType0 = JSType.getGreatestSubtype((JSType) numberType0, (JSType) unionType0);
      assertFalse(jSType0.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      TreeSet<BooleanType> treeSet0 = new TreeSet<BooleanType>();
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>((SortedSet<? extends JSType>) treeSet0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType jSType0 = unionType0.restrictByNotNullOrUndefined();
      priorityQueue0.add(jSType0);
      boolean boolean0 = unionType0.canAssignTo(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Not declared as a type name");
      boolean boolean0 = templateType0.equals(templateType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      StringType stringType0 = new StringType(jSTypeRegistry0);
      boolean boolean0 = stringType0.equals("Unknown class name");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(voidType0);
      voidType0.testForEquality(jSType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(unionType0);
      JSType jSType0 = unionType0.getLeastSupertype(jSType_TypePair0.typeA);
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      boolean boolean0 = templateType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoObjectType();
      boolean boolean0 = jSType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      boolean boolean0 = numberType0.canTestForEqualityWith(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      TreeSet<BooleanType> treeSet0 = new TreeSet<BooleanType>();
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>((SortedSet<? extends JSType>) treeSet0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(allType0);
      JSType.TypePair jSType_TypePair1 = jSType_TypePair0.typeA.getTypesUnderEquality(jSType_TypePair0.typeA);
      assertFalse(jSType_TypePair1.equals((Object)jSType_TypePair0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      NoObjectType noObjectType0 = (NoObjectType)modificationVisitor0.caseNoObjectType();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      JSType[] jSTypeArray0 = new JSType[0];
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) unknownType0, (JSType) unknownType0, (JSType) unknownType0, (JSType) noObjectType0, (JSType) unknownType0, (JSType) unknownType0, (JSType) unknownType0, (JSType) unknownType0, (JSType) noObjectType0, (JSType) unknownType0, jSTypeArray0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) unknownType0, (List<JSType>) immutableList0);
      ImmutableList<JSType> immutableList1 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) unknownType0, (JSType) functionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList1);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      unionType0.getTypesUnderInequality(stringType0);
      assertTrue(functionType0.hasCachedValues());
      assertTrue(noObjectType0.hasCachedValues());
  }
}
