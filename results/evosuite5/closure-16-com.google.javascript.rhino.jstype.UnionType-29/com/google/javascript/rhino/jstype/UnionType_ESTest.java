/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 04:14:05 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.hasAnyTemplateInternal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) noObjectType0, (JSType) templateType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.hasAnyTemplateInternal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      jSType0.matchConstraint(errorFunctionType0);
      assertFalse(errorFunctionType0.isStringValueType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, (JSType) errorFunctionType0, jSType0, jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType1 = unionType0.collapseUnion();
      assertFalse(jSType1.isInterface());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = noObjectType0.getPropertyType(":(Q>N`!H");
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      JSType jSType2 = jSType1.collapseUnion();
      assertFalse(jSType2.isRecordType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) noObjectType0, (JSType) templateType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.collapseUnion();
      assertNotNull(jSType0);
      assertFalse(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.collapseUnion();
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "pN.6DmR6LTL");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      Predicate<JSType> predicate0 = (Predicate<JSType>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(predicate0).apply(any(com.google.javascript.rhino.jstype.JSType.class));
      boolean boolean0 = jSType0.setValidator(predicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "4NQEp7");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      String string0 = jSType0.toDebugHashCodeString();
      assertEquals("{(function (this:{1217283428}, {12}, {12}, {12}): {1217283428},{11},{6})}", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "[sV-S'|V|SW=GX");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      errorFunctionType0.setResolvedTypeInternal(jSType0);
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      priorityQueue0.add(errorFunctionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      // Undeclared exception!
      try { 
        unionType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      errorFunctionType0.setResolvedTypeInternal(unionType0);
      UnionType unionType1 = (UnionType)unionType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
      assertFalse(unionType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      unionType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
      assertTrue(errorFunctionType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ".");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderEquality(errorFunctionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      BooleanLiteralSet booleanLiteralSet0 = jSType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayDeque0);
      BooleanLiteralSet booleanLiteralSet0 = unionType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.EMPTY, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      JSType jSType1 = jSType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertFalse(jSType1.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.isNumber();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType1 = allType0.getGreatestSubtype(jSType0);
      assertSame(jSType1, jSType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      JSType jSType0 = noObjectType0.getPropertyType("Not declared as a type name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) templateType0, jSType0, (JSType) templateType0, jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.isSubtype(templateType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      String string0 = jSType0.toString();
      assertEquals("(function (new:, *=, *=, *=): |null|undefined)", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) noObjectType0, (JSType) templateType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.getRestrictedUnion(templateType0);
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "HQv5Ep7");
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      UnionType unionType1 = (UnionType)unionType0.getRestrictedUnion(errorFunctionType0);
      assertFalse(unionType1.equals((Object)unionType0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "E");
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      boolean boolean0 = unionType0.contains(errorFunctionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "YcswkS");
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      AllType allType0 = (AllType)unionType0.collapseUnion();
      assertNotNull(allType0);
      
      boolean boolean0 = unionType0.contains(allType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ",");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      JSType jSType1 = unionType0.getLeastSupertype(jSType0);
      assertFalse(jSType0.equals((Object)unionType0));
      assertTrue(jSType1.equals((Object)jSType0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      boolean boolean0 = jSType0.isEquivalentTo((JSType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType1 = unionType0.meet(jSType0);
      assertFalse(jSType1.isNumberValueType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(jSType0);
      JSType jSType1 = unionType0.meet(jSType_TypePair0.typeB);
      assertFalse(jSType1.isResolved());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      PrototypeObjectType prototypeObjectType0 = (PrototypeObjectType)jSTypeRegistry0.createAnonymousObjectType();
      NoType noType0 = (NoType)unionType0.meet(prototypeObjectType0);
      assertFalse(noType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      ErrorFunctionType errorFunctionType1 = new ErrorFunctionType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.UnionType");
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType1);
      JSType jSType2 = JSType.getGreatestSubtype(jSType1, jSType0);
      assertNotSame(jSType2, jSType1);
      assertFalse(jSType2.equals((Object)jSType1));
      assertFalse(jSType2.equals((Object)jSType0));
      assertNotSame(jSType2, jSType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "vv.5Zl>W^");
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(errorFunctionType0);
      UnionType unionType1 = (UnionType)unionType0.meet(jSType_TypePair0.typeA);
      assertFalse(unionType1.isNoType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) noObjectType0, (JSType) templateType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.getLeastSupertype(noObjectType0);
      assertSame(jSType0, unionType0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "+_<n#7+~'lBq7[v8~");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType1 = allType0.getLeastSupertype(jSType0);
      assertFalse(jSType1.isCheckedUnknownType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ",");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      JSType jSType1 = jSType0.getLeastSupertype(jSType0);
      assertSame(jSType1, jSType0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) noObjectType0, (JSType) templateType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.getLeastSupertype(templateType0);
      assertTrue(noObjectType0.hasCachedValues());
      assertNotSame(unionType0, jSType0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) noObjectType0, (JSType) templateType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.meet(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      boolean boolean0 = jSType0.isNullable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.isNullable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ";O}fd3");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      boolean boolean0 = jSType0.canTestForEqualityWith(errorFunctionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.testForEquality(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "[sV-S'|V|SW=GX");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      JSType jSType1 = jSType0.restrictByNotNullOrUndefined();
      assertFalse(jSType1.isCheckedUnknownType());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Rq");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      JSType jSType1 = jSType0.autobox();
      assertFalse(jSType1.isCheckedUnknownType());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ";O}fd3");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      boolean boolean0 = jSType0.canBeCalled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.canBeCalled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) templateType0, (JSType) templateType0, (JSType) templateType0, (JSType) templateType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.canAssignTo(templateType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "%s (%s) must not be negative");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      boolean boolean0 = jSType0.canAssignTo(errorFunctionType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.findPropertyType("Not declared as a type name");
      assertFalse(jSType0.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ";O}fd3");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      JSType jSType1 = jSType0.findPropertyType("Not declared as a type name");
      assertNull(jSType1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "YcswkS");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      boolean boolean0 = jSType0.matchesObjectContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = noObjectType0.getPropertyType(":(Q>N`!H");
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      boolean boolean0 = jSType1.matchesObjectContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(errorFunctionType0);
      boolean boolean0 = jSType0.matchesStringContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      boolean boolean0 = unionType0.matchesStringContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = noObjectType0.getPropertyType(":(Q>N`!H");
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      boolean boolean0 = jSType1.matchesUint32Context();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesInt32Context();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, linkedHashSet0);
      boolean boolean0 = linkedHashSet0.add(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0, (JSType) noType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, unionType0);
      JSType jSType0 = modificationVisitor0.caseParameterizedType(parameterizedType0);
      assertFalse(jSType0.isNullType());
  }
}
