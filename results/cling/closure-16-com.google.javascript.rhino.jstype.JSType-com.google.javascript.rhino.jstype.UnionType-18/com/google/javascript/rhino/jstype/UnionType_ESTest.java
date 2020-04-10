/*

 * Tue Mar 03 18:50:50 GMT 2020
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
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      StringType stringType0 = new StringType(jSTypeRegistry1);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) unknownType0, (JSType) stringType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(unknownType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      JSType.TypePair jSType_TypePair0 = recordType0.getTypesUnderShallowEquality(unknownType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) unionType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(unionType0, jSTypeArray0);
      NoObjectType noObjectType0 = (NoObjectType)unionType0.meet(functionType0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noObjectType0, true);
      UnionType unionType1 = (UnionType)jSTypeRegistry0.createOptionalType(instanceObjectType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      unionType1.getTypesUnderInequality(allType0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[7];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) nullType0, false, jSTypeArray0);
      JSType.TypePair jSType_TypePair0 = nullType0.getTypesUnderEquality(functionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<NoObjectType> immutableList0 = ImmutableList.of((NoObjectType) noResolvedType0, (NoObjectType) noResolvedType0, (NoObjectType) noResolvedType0, (NoObjectType) noResolvedType0);
      ImmutableList<JSType> immutableList1 = ImmutableList.copyOf((Iterable<? extends JSType>) immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList1);
      unionType0.testForEquality(unionType0);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      AllType allType0 = new AllType((JSTypeRegistry) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      // Undeclared exception!
      try { 
        allType0.getLeastSupertype(noObjectType0);
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType jSType0 = JSType.getGreatestSubtype((JSType) unionType0, (JSType) unionType0);
      assertTrue(jSType0.isUnionType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      AllType allType0 = new AllType(jSTypeRegistry0);
      boolean boolean0 = JSType.isEquivalent(allType0, allType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) unionType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(unionType0, jSTypeArray0);
      NoObjectType noObjectType0 = (NoObjectType)unionType0.meet(functionType0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noObjectType0, false);
      UnionType unionType1 = (UnionType)jSTypeRegistry0.createOptionalType(instanceObjectType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      unionType1.canTestForShallowEqualityWith(allType0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) unionType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(unionType0, jSTypeArray0);
      ObjectType objectType0 = functionType0.dereference();
      assertTrue(objectType0.isObject());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry1);
      JSType jSType0 = modificationVisitor0.caseBooleanType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0, jSType0, jSType0, (JSType) unionType0);
      UnionType unionType1 = new UnionType(jSTypeRegistry1, immutableList0);
      ObjectType objectType0 = unionType1.dereference();
      assertFalse(objectType0.isCheckedUnknownType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(numberType0);
      numberType0.testForEquality(jSType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = noResolvedType0.getPropertyType("");
      TemplateType templateType0 = JSType.toMaybeTemplateType(jSType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.findPropertyType("j+}z~TMrQrGr!?KNM ");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType jSType0 = jSTypeRegistry0.createNamedType("36]F!35U|(V,~B[OY=", "Not declared as a type4`ame", 33726817, (-2040));
      JSType jSType1 = jSTypeRegistry0.createDefaultObjectUnion(jSType0);
      assertFalse(jSType1.isEnumElementType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(unionType0);
      assertFalse(jSType0.isVoidType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<NoObjectType> immutableList0 = ImmutableList.of((NoObjectType) noResolvedType0, (NoObjectType) noResolvedType0, (NoObjectType) noResolvedType0, (NoObjectType) noResolvedType0);
      ImmutableList<JSType> immutableList1 = ImmutableList.copyOf((Iterable<? extends JSType>) immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList1);
      boolean boolean0 = unionType0.canAssignTo(unionType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) arrowType0, jSTypeArray0);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Named type with empty name component", functionType0);
      boolean boolean0 = functionType0.canAssignTo(prototypeObjectType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = recordType0.getTypesUnderInequality(noResolvedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) unionType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(unionType0, jSTypeArray0);
      boolean boolean0 = unionType0.canTestForShallowEqualityWith(functionType0);
      assertTrue(functionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString("", (-691928529), 33);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("", node0, nullType0);
      boolean boolean0 = enumType0.equals(unionType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.equals(simpleErrorReporter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) allType0, (JSType) allType0, (JSType) allType0, (JSType) allType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      boolean boolean0 = unionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) unionType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(unionType0, jSTypeArray0);
      NoObjectType noObjectType0 = (NoObjectType)unionType0.meet(functionType0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noObjectType0, false);
      UnionType unionType1 = (UnionType)jSTypeRegistry0.createOptionalType(instanceObjectType0);
      unionType1.getTypesUnderEquality(noObjectType0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      JSType jSType0 = unionType0.autobox();
      vector0.add(jSType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(unionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.restrictByNotNullOrUndefined();
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>(1);
      UnionType unionType1 = new UnionType(jSTypeRegistry0, arrayList0);
      arrayList0.add(jSType0);
      unionType1.testForEquality(unionType1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[0] = (JSType) unionType0;
      jSTypeArray0[1] = (JSType) unionType0;
      jSTypeArray0[2] = (JSType) unionType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(unionType0, jSTypeArray0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) functionType0, jSTypeArray0[0], jSTypeArray0[0], jSTypeArray0[1], jSTypeArray0[0], jSTypeArray0[2], (JSType) unionType0, jSTypeArray0[1], (JSType) unionType0, (JSType) unionType0, (JSType) functionType0);
      UnionType unionType1 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType1.getTypesUnderEquality(functionType0);
      assertTrue(functionType0.hasCachedValues());
  }
}
