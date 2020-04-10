/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 06:15:54 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Not declared as a constructor");
      JSType[] jSTypeArray0 = new JSType[5];
      jSTypeArray0[0] = (JSType) templateType0;
      jSTypeArray0[1] = (JSType) noResolvedType0;
      jSTypeArray0[2] = (JSType) noObjectType0;
      jSTypeArray0[3] = (JSType) templateType0;
      jSTypeArray0[4] = (JSType) noObjectType0;
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) templateType0, (JSType) noResolvedType0, (JSType) templateType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noObjectType0, jSTypeArray0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.hasAnyTemplateInternal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.matchConstraint(noResolvedType0);
      assertFalse(noResolvedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.collapseUnion();
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noObjectType0);
      JSType jSType1 = jSType0.collapseUnion();
      assertFalse(jSType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newString("^U$[{x");
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "Unknown class name", node0, noObjectType0);
      ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, (Node) null, enumType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) arrowType0, (JSType) arrowType0, (JSType) enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.collapseUnion();
      assertFalse(jSType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Named type with empty name component", 1, 0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) namedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.collapseUnion();
      assertNotNull(jSType0);
      assertFalse(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) voidType0, (JSType) noObjectType0, (JSType) voidType0, (JSType) voidType0, (JSType) noObjectType0, (JSType) voidType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.collapseUnion();
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      // Undeclared exception!
      try { 
        unionType0.setValidator((Predicate<JSType>) null);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      Predicate<JSType> predicate0 = (Predicate<JSType>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = unionType0.setValidator(predicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) voidType0, (JSType) noObjectType0, (JSType) voidType0, (JSType) voidType0, (JSType) noObjectType0, (JSType) voidType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      String string0 = unionType0.toDebugHashCodeString();
      assertEquals("{({268},function (this:me, {8}): me,{268},{268},function (this:me, {8}): me,{268})}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("Not declared as a constructor", "Not declared as a constructor", 65263, 1);
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(jSType0.isResolved());
      assertTrue(noResolvedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ImmutableList<VoidType> immutableList0 = ImmutableList.of(voidType0, voidType0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>(immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      unionType0.resolveInternal((ErrorReporter) null, (StaticScope<JSType>) null);
      assertTrue(voidType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noObjectType0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("`J1K=", "", 0, 554629);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) booleanType0, jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(booleanType0);
      JSType.TypePair jSType_TypePair1 = unionType0.getTypesUnderEquality(jSType_TypePair0.typeB);
      assertNotSame(jSType_TypePair0, jSType_TypePair1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noObjectType0);
      BooleanLiteralSet booleanLiteralSet0 = jSType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      BooleanLiteralSet booleanLiteralSet0 = unionType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType0.isParameterizedType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.getTypesUnderShallowEquality(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.isNumber();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noObjectType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType1 = JSType.getGreatestSubtype(jSType0, (JSType) allType0);
      assertSame(jSType1, jSType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createNullableType(noObjectType0);
      String string0 = unionType0.toStringHelper(false);
      assertEquals("(NoObject|null)", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "nb\"93n9(");
      Node node0 = errorFunctionType0.getParametersNode();
      ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, node0, errorFunctionType0, true);
      JSType jSType0 = errorFunctionType0.getPropertyType("");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) errorFunctionType0, (JSType) arrowType0, (JSType) errorFunctionType0, (JSType) noObjectType0, (JSType) arrowType0, (JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0, jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.getRestrictedUnion(noObjectType0);
      assertTrue(errorFunctionType0.hasCachedValues());
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.contains(noResolvedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noObjectType0, noObjectType0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, parameterizedType0, noObjectType0);
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createNullableType(noObjectType0);
      boolean boolean0 = unionType0.contains(indexedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      ImmutableList<JSType> immutableList1 = ImmutableList.of((JSType) unionType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType1 = new UnionType(jSTypeRegistry0, immutableList1);
      unionType0.getLeastSupertype(unionType1);
      assertTrue(unionType1.equals((Object)unionType0));
      assertFalse(unionType0.equals((Object)unionType1));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) unionType0, (JSType) unionType0, (JSType) unionType0);
      UnionType unionType1 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType1.getLeastSupertype(unionType0);
      assertFalse(unionType1.equals((Object)unionType0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      // Undeclared exception!
      try { 
        unionType0.getGreatestSubtype((JSType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a constructor");
      JSType jSType0 = unionType0.meet(errorFunctionType0);
      assertFalse(jSType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = unionType0.meet(allType0);
      assertFalse(jSType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(unionType0);
      RecordType recordType1 = (RecordType)unionType0.meet(jSType0);
      assertTrue(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = booleanType0.autoboxesTo();
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0, jSType0, (JSType) booleanType0, jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "|");
      unionType0.meet(errorFunctionType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.getLeastSupertype(noResolvedType0);
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ImmutableList<VoidType> immutableList0 = ImmutableList.of(voidType0, voidType0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>(immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.isNumberValueType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.findPropertyType("Unknown class name");
      unionType0.getLeastSupertype(jSType0);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("Not declared as a constructor", "Not declared as a constructor", 1, 1);
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      Node node0 = new Node(355, 0, 3);
      ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, node0, unionType0);
      unionType0.getTypesUnderInequality(arrowType0);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ImmutableList<VoidType> immutableList0 = ImmutableList.of(voidType0, voidType0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>(immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.meet(voidType0);
      assertFalse(jSType0.isEnumType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("Not declared as a type name", "Not declared as a type name", (-991), (-338));
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.isNullable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noObjectType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.isNullable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noObjectType0);
      jSType0.testForEquality(noObjectType0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.testForEquality(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.restrictByNotNullOrUndefined();
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.autobox();
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noObjectType0);
      boolean boolean0 = jSType0.canBeCalled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.canBeCalled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Not declared as a type name", 1, 1);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) namedType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.canAssignTo(namedType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.canAssignTo(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newNumber((double) 0);
      ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, node0, noObjectType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) arrowType0, (JSType) noObjectType0, (JSType) noObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.findPropertyType("cZ:kI");
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noObjectType0);
      JSType jSType1 = jSType0.findPropertyType("Not declared as a constructor");
      assertFalse(jSType1.isParameterizedType());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ImmutableList<VoidType> immutableList0 = ImmutableList.of(voidType0, voidType0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>(immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.findPropertyType("Unknown class name");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.matchesObjectContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ImmutableList<VoidType> immutableList0 = ImmutableList.of(voidType0, voidType0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>(immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesObjectContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.matchesStringContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.matchesStringContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.matchesNumberContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.matchesUint32Context();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      JSType[] jSTypeArray0 = new JSType[2];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) unionType0, jSTypeArray0);
      jSTypeRegistry0.registerTypeImplementingInterface(functionType0, functionType0);
      assertFalse(functionType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("Not declared as a constructor", "Not declared as a constructor", 65263, 1);
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, (JSType) noResolvedType0, (JSType) noResolvedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType1 = unionType0.getLeastSupertype(noObjectType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertNotSame(unionType0, jSType1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noObjectType0);
      // Undeclared exception!
      try { 
        jSType0.visit((Visitor<IndexedType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.UnionType", e);
      }
  }
}
