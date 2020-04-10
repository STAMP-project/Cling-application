/*

 * Tue Mar 03 18:46:53 GMT 2020
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
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoResolvedType;
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
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
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
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      boolean boolean0 = JSType.isEquivalent(errorFunctionType0, (JSType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      StringType stringType0 = (StringType)modificationVisitor0.caseStringType();
      Node node0 = Node.newNumber((-154.8774341222));
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "Named type with empty name component", node0, stringType0);
      stringType0.testForEqualityHelper(enumType0, unknownType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = JSType.isEquivalent((JSType) null, (JSType) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Node node0 = Node.newString("com.google.javascript.rhino.jstype.UnionType", (-5388), (-5388));
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "K;`x`>ssN!O");
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_OBJECT_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) unresolvedTypeExpression0, (JSType) unresolvedTypeExpression0, (JSType) unresolvedTypeExpression0, (JSType) unresolvedTypeExpression0, (JSType) unresolvedTypeExpression0, jSType0, jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.resolveInternal(simpleErrorReporter0, unresolvedTypeExpression0);
      assertTrue(jSType0.isResolved());
      assertTrue(unresolvedTypeExpression0.isResolved());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      nullType0.testForEquality(allType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = booleanType0.autoboxesTo();
      allType0.testForEqualityHelper(noResolvedType0, jSType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = recordType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.isParameterizedType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noType0, false);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) instanceObjectType0, (JSType) noType0, (JSType) instanceObjectType0, (JSType) instanceObjectType0, (JSType) instanceObjectType0, (JSType) noType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.findPropertyType("Not declared as a constructor");
      assertTrue(noType0.hasCachedValues());
      
      JSType jSType1 = noType0.getGreatestSubtype(jSType0);
      assertSame(jSType0, jSType1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(parameterizedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      boolean boolean0 = unionType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((FunctionType) null, (FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
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

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType jSType0 = voidType0.restrictByNotNullOrUndefined();
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "com.google.common.base.Predicates$CompositionPredicate");
      JSType jSType1 = templateType0.getGreatestSubtype(jSType0);
      assertFalse(jSType1.isInterface());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.autobox();
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSType[] jSTypeArray0 = new JSType[6];
      TemplateType templateType0 = JSType.toMaybeTemplateType(jSTypeArray0[1]);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseUnknownType();
      TemplateType templateType0 = JSType.toMaybeTemplateType(jSType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      boolean boolean0 = unionType0.hasAnyTemplateInternal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType jSType0 = numberType0.findPropertyType("");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.findPropertyType("Unknown class name");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry1.createRecordType(hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(unionType0);
      assertTrue(jSType0.matchesStringContext());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Vector<JSType> vector0 = new Vector<JSType>();
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry((ErrorReporter) null);
      UnionType unionType0 = new UnionType(jSTypeRegistry1, vector0);
      boolean boolean0 = noResolvedType0.canAssignTo(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noResolvedType0, (JSType) null);
      noResolvedType0.testForEquality(indexedType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null, noResolvedType0, noResolvedType0).when(jSTypeRegistry1).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry1, arrayList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(unionType0);
      boolean boolean0 = unionType0.canTestForShallowEqualityWith(jSType_TypePair0.typeB);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry1, (ObjectType) null, (JSType) null);
      // Undeclared exception!
      try { 
        unionType0.equals(parameterizedType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.ProxyObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      boolean boolean0 = voidType0.equals(linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = booleanType0.autoboxesTo();
      JSType jSType1 = booleanType0.getGreatestSubtype(jSType0);
      assertFalse(jSType1.isParameterizedType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) voidType0, (JSType) parameterizedType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.getLeastSupertype(unionType0);
      assertTrue(objectType0.hasCachedValues());
      assertSame(unionType0, jSType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType jSType0 = numberType0.autoboxesTo();
      boolean boolean0 = jSType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      numberType0.testForEquality(noType0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noType0, (JSType) null);
      JSType.TypePair jSType_TypePair0 = noType0.getTypesUnderEquality(indexedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      UnionType unionType1 = new UnionType(jSTypeRegistry1, vector0);
      JSType.TypePair jSType_TypePair0 = unionType1.getTypesUnderShallowInequality(unionType1);
      jSType_TypePair0.typeA.testForEquality(unionType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      JSType jSType0 = jSTypeRegistry0.createFunctionType((ObjectType) noResolvedType0, (JSType) noResolvedType0, (List<JSType>) arrayList0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType1 = booleanType0.autoboxesTo();
      allType0.testForEqualityHelper(jSType0, jSType1);
  }
}
