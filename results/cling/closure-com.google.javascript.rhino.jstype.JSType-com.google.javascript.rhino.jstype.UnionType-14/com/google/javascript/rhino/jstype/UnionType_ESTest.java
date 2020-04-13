/*

 * Tue Mar 03 18:49:49 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "slash_v", parameterizedType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) parameterizedType0, (JSType) prototypeObjectType0, (JSType) prototypeObjectType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.collapseUnion();
      assertTrue(noType0.hasCachedValues());
      assertTrue(prototypeObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "M$1#h/.vNV`|[/#l8WC", "2rQ[U", (-1144), (-1206));
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, namedType0, namedType0);
      ObjectType objectType0 = jSTypeRegistry0.findCommonSuperObject(parameterizedType0, namedType0);
      namedType0.testForEqualityHelper(objectType0, parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, hashSet0);
      boolean boolean0 = unionType0.isTemplateType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      boolean boolean0 = errorFunctionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) parameterizedType0, "slash_v", "Unknown class name", 1, 487737408);
      JSType jSType1 = unionType0.getGreatestSubtype(jSType0);
      assertFalse(jSType1.isRecordType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      unionType0.testForEqualityHelper(allType0, allType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(noType0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noType0, jSType_TypePair0.typeB);
      unionType0.testForEqualityHelper(allType0, indexedType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, linkedHashSet0);
      BooleanType booleanType0 = new BooleanType((JSTypeRegistry) null);
      // Undeclared exception!
      try { 
        booleanType0.getLeastSupertype(unionType0);
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      JSType jSType0 = unionType0.getGreatestSubtype(allType0);
      assertSame(unionType0, jSType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) parameterizedType0, (JSType) noType0, (JSType) noType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.collapseUnion();
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = JSType.isEquivalent((JSType) null, (JSType) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      boolean boolean0 = unionType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSType jSType0 = mock(JSType.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(jSType0, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(unionType0);
      JSType jSType1 = JSType.getGreatestSubtype(jSType_TypePair0.typeB, (JSType) unionType0);
      assertFalse(jSType1.isConstructor());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AllType allType0 = new AllType((JSTypeRegistry) null);
      JSType jSType0 = allType0.autobox();
      assertFalse(jSType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      ObjectType objectType0 = numberType0.dereference();
      assertFalse(objectType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoType();
      boolean boolean0 = booleanType0.canTestForShallowEqualityWith(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, hashSet0);
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) unionType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) parameterizedType0, (JSType) noType0, (JSType) noType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.hasAnyTemplateInternal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AllType allType0 = new AllType((JSTypeRegistry) null);
      JSType jSType0 = allType0.findPropertyType("d7x5-^");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, hashSet0);
      BooleanType booleanType0 = new BooleanType((JSTypeRegistry) null);
      JSType jSType0 = booleanType0.getGreatestSubtype(unionType0);
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      boolean boolean0 = noType0.canAssignTo(allType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, hashSet0);
      BooleanType booleanType0 = new BooleanType((JSTypeRegistry) null);
      boolean boolean0 = booleanType0.canAssignTo(unionType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noResolvedType0, noResolvedType0);
      noResolvedType0.testForEqualityHelper(parameterizedType0, parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null, (FunctionType) null, (FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      boolean boolean0 = unionType0.canTestForShallowEqualityWith(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      boolean boolean0 = allType0.equals(parameterizedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      boolean boolean0 = unionType0.equals(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) parameterizedType0, (JSType) noType0, (JSType) noType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.findPropertyType("array too small: %s < %s");
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, " bW1~c|vmq^r");
      boolean boolean0 = errorFunctionType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, hashSet0);
      boolean boolean0 = unionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) parameterizedType0, (JSType) noType0, (JSType) noType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.getTypesUnderEquality(noType0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "slash_v", parameterizedType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) parameterizedType0, (JSType) prototypeObjectType0, (JSType) prototypeObjectType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(prototypeObjectType0);
      JSType.TypePair jSType_TypePair1 = unionType0.getTypesUnderInequality(jSType_TypePair0.typeA);
      assertNotSame(jSType_TypePair0, jSType_TypePair1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[4];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) numberType0, false, jSTypeArray0);
      functionType0.testForEquality(numberType0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[4];
      jSTypeArray0[3] = (JSType) numberType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) numberType0, true, jSTypeArray0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, functionType0, functionType0);
      numberType0.testForEquality(parameterizedType0);
  }
}
