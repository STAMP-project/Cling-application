/*

 * Tue Mar 03 18:47:06 GMT 2020
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
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
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
      NullType nullType0 = new NullType((JSTypeRegistry) null);
      boolean boolean0 = JSType.isEquivalent(nullType0, (JSType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      boolean boolean0 = unionType0.isTemplateType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ObjectType objectType0 = jSTypeRegistry0.createObjectType("yLJ1", (Node) null, (ObjectType) noObjectType0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, objectType0, objectType0);
      boolean boolean0 = indexedType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSType.TypePair jSType_TypePair0 = noType0.getTypesUnderInequality(unknownType0);
      JSType.TypePair jSType_TypePair1 = jSType_TypePair0.typeA.getTypesUnderShallowEquality(unknownType0);
      assertFalse(jSType_TypePair1.equals((Object)jSType_TypePair0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(unionType0);
      JSType.TypePair jSType_TypePair1 = jSType_TypePair0.typeA.getTypesUnderEquality(jSType_TypePair0.typeA);
      assertNotSame(jSType_TypePair0, jSType_TypePair1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.isEnumType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newNumber(0.0);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, ">O\"V;Ma'FkW]UKJS@8C");
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.getLeastSupertype(unresolvedTypeExpression0);
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayDeque0);
      NoType noType0 = (NoType)unionType0.autobox();
      JSType.getGreatestSubtype((JSType) unionType0, (JSType) noType0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, stack0);
      boolean boolean0 = JSType.isEquivalent(unionType0, unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = JSType.isEquivalent((JSType) null, (JSType) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, linkedList0);
      boolean boolean0 = unionType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSType jSType0 = unknownType0.getGreatestSubtype((JSType) null);
      assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) objectType0, (JSType) objectType0, (JSType) objectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.autobox();
      assertTrue(objectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, hashSet0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      hashSet0.add(booleanType0);
      JSType jSType0 = unionType0.autobox();
      assertFalse(jSType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) unionType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      boolean boolean0 = noType0.hasAnyTemplate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType jSType0 = numberType0.findPropertyType("Not declared as a type name");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.findPropertyType("bbVfEm^5?+|");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.EnumType", "com.google.javascript.rhino.jstype.EnumType", 0, 0);
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(namedType0, (JSType) null).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry1, stack0);
      JSType.TypePair jSType_TypePair0 = namedType0.getTypesUnderShallowInequality(unionType0);
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(jSType_TypePair0.typeB);
      assertFalse(jSType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(noResolvedType0, noResolvedType0);
      JSType.TypePair jSType_TypePair0 = functionType0.getTypesUnderShallowEquality(noResolvedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AllType allType0 = new AllType((JSTypeRegistry) null);
      boolean boolean0 = allType0.canAssignTo(allType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NullType nullType0 = new NullType((JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSType[] jSTypeArray0 = new JSType[7];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) nullType0, jSTypeArray0);
      boolean boolean0 = nullType0.canAssignTo(functionType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, hashSet0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      hashSet0.add(booleanType0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      unionType0.getTypesUnderInequality(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry1, "Unknown class name", "j!YO^|<bc", 0, 1632);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry1, hashMap0);
      JSType jSType0 = namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      unionType0.testForEqualityHelper(jSType0, unionType0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null, (FunctionType) null, (FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.canTestForShallowEqualityWith(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry1);
      boolean boolean0 = stringType0.equals(voidType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NullType nullType0 = new NullType((JSTypeRegistry) null);
      boolean boolean0 = nullType0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) objectType0, (JSType) objectType0, (JSType) objectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.getTypesUnderEquality(unionType0);
      assertTrue(objectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      JSType jSType0 = unionType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, (JSType) null);
      boolean boolean0 = proxyObjectType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, hashSet0);
      boolean boolean0 = unionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, hashSet0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      hashSet0.add(booleanType0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      unionType0.getTypesUnderInequality(noType0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((FunctionType) null, (FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "DHnI");
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      NullType nullType0 = new NullType(jSTypeRegistry1);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) errorFunctionType0, (JSType) nullType0, (JSType) nullType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry1, immutableList0);
      // Undeclared exception!
      try { 
        unionType0.testForEquality(errorFunctionType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }
}
