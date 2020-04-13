/*

 * Tue Mar 03 18:47:14 GMT 2020
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
import com.google.javascript.rhino.jstype.EnumElementType;
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
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      StaticScope<JSType> staticScope0 = (StaticScope<JSType>) mock(StaticScope.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.getType(staticScope0, "E%MfU6", "Unknown class name", 0, 1357);
      boolean boolean0 = numberType0.canTestForEqualityWith(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[7];
      jSTypeArray0[1] = (JSType) allType0;
      boolean boolean0 = JSType.isEquivalent(jSTypeArray0[1], jSTypeArray0[3]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.FUNCTION_INSTANCE_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, objectType0, objectType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = indexedType0.getTypesUnderInequality(allType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[5];
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(noObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSTypeArray0[1], jSTypeArray0);
      jSTypeArray0[2] = (JSType) functionType0;
      JSType jSType1 = JSType.getGreatestSubtype(jSType0, jSTypeArray0[2]);
      assertFalse(jSType1.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType((JSTypeRegistry) null);
      noResolvedType0.testForEquality(booleanType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, treeSet0);
      AllType allType0 = new AllType((JSTypeRegistry) null);
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
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      JSType jSType0 = allType0.getLeastSupertype(recordType0);
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowEquality(unionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, arrayDeque0);
      boolean boolean0 = JSType.isEquivalent(unionType0, unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSType[] jSTypeArray0 = new JSType[6];
      boolean boolean0 = JSType.isEquivalent(jSTypeArray0[5], jSTypeArray0[5]);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      boolean boolean0 = unionType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = noResolvedType0.getPropertyType("p(uT`c");
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowEquality(booleanType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "MAT!RI2H-C.?]g");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.autobox();
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType jSType0 = numberType0.autobox();
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = objectType0.canTestForShallowEqualityWith(noResolvedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, arrayDeque0);
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) unionType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      StringType stringType0 = new StringType(jSTypeRegistry0);
      ImmutableList<StringType> immutableList0 = ImmutableList.of(stringType0, stringType0);
      ImmutableList<JSType> immutableList1 = ImmutableList.copyOf((Collection<? extends JSType>) immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList1);
      JSType jSType0 = unionType0.findPropertyType("Named type with empty name component");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "com.google.javascript.rhino.JSDocInfo", "OVv", 15, (-2498));
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) namedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType jSType0 = unionType0.meet(nullType0);
      assertFalse(jSType0.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null, (FunctionType) null, (FunctionType) null, (FunctionType) null, (FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NullType nullType0 = new NullType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(nullType0);
      boolean boolean0 = unionType0.canAssignTo(jSType_TypePair0.typeA);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType jSType0 = nullType0.restrictByNotNullOrUndefined();
      boolean boolean0 = nullType0.canAssignTo(jSType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, noResolvedType0, "Unknown class name");
      enumElementType0.testForEquality(noResolvedType0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[3];
      JSTypeNative jSTypeNative0 = JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNativeArray0[0];
      jSTypeNativeArray0[2] = jSTypeNativeArray0[1];
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      boolean boolean0 = jSType0.canTestForShallowEqualityWith(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, arrayDeque0);
      Predicate<JSType> predicate0 = Predicate.isEqual((Object) unionType0);
      boolean boolean0 = predicate0.test(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      JSType jSType0 = unionType0.getRestrictedUnion(unionType0);
      boolean boolean0 = jSType0.equals("Not declared as a type name");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = booleanType0.autoboxesTo();
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType jSType1 = jSType0.getGreatestSubtype(nullType0);
      assertTrue(jSType1.matchesNumberContext());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType jSType0 = numberType0.autoboxesTo();
      JSType jSType1 = numberType0.getGreatestSubtype(jSType0);
      assertTrue(jSType1.isNullable());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[5];
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(noObjectType0, noObjectType0);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(functionType0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionType(jSTypeArray0[1], jSTypeArray0);
      jSTypeArray0[2] = (JSType) functionType1;
      JSType jSType1 = JSType.getGreatestSubtype(jSType0, jSTypeArray0[2]);
      assertFalse(jSType1.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoType();
      JSType jSType1 = JSType.getLeastSupertype(jSType0, jSType0);
      assertFalse(jSType1.isEnumElementType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      boolean boolean0 = unionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoType();
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType1 = booleanType0.autoboxesTo();
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, jSType1, "");
      enumElementType0.testForEquality(jSType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      unionType0.testForEqualityHelper(noType0, noType0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[5];
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(noObjectType0, noObjectType0);
      jSTypeArray0[0] = (JSType) functionType0;
      boolean boolean0 = noObjectType0.canTestForEqualityWith(jSTypeArray0[0]);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "MAT!RI2H-C.?]g");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.getTypesUnderEquality(errorFunctionType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = booleanType0.autoboxesTo();
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, jSType0, "");
      Vector<JSType> vector0 = new Vector<JSType>();
      JSType jSType1 = jSTypeRegistry0.createFunctionType((ObjectType) enumElementType0, (JSType) booleanType0, (List<JSType>) vector0);
      enumElementType0.testForEquality(jSType1);
  }
}
