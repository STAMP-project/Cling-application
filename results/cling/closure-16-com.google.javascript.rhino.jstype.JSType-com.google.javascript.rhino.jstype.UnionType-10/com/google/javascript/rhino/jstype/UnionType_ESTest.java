/*

 * Tue Mar 03 18:47:40 GMT 2020
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
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoObjectType();
      boolean boolean0 = jSType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(stringType0);
      assertFalse(jSType0.isNullType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Vector<JSType> vector0 = new Vector<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, vector0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry1, "Not declared as a type name", (String) null, (-2760), (-2760));
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry1, (String) null, namedType0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry1, prototypeObjectType0, "6");
      JSType jSType0 = namedType0.resolveInternal(simpleErrorReporter0, enumElementType0);
      JSType jSType1 = JSType.getGreatestSubtype((JSType) unionType0, jSType0);
      assertNull(jSType1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      numberType0.testForEquality(allType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GLOBAL_THIS;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSTypeNative jSTypeNative1 = JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
      ObjectType objectType1 = jSTypeRegistry0.getNativeObjectType(jSTypeNative1);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType1);
      JSType.getGreatestSubtype(jSType0, (JSType) objectType0);
      assertTrue(objectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Node node0 = new Node((-601), (-601), (-601));
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, ")}", node0, allType0);
      JSType jSType0 = allType0.getLeastSupertype(enumType0);
      assertFalse(jSType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      Node node0 = Node.newString("Not declared as a constructor");
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) unionType0, node0);
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_OBJECT_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType jSType1 = JSType.getGreatestSubtype((JSType) functionType0, jSType0);
      assertFalse(jSType1.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringType stringType0 = new StringType((JSTypeRegistry) null);
      boolean boolean0 = JSType.isEquivalent(stringType0, stringType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      boolean boolean0 = JSType.isEquivalent((JSType) null, noObjectType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashSet<JSType> hashSet0 = new HashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, hashSet0);
      boolean boolean0 = unionType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[3];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, jSTypeArray0);
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(functionType0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0);
      JSType jSType0 = JSType.getGreatestSubtype((JSType) instanceObjectType0, jSType_TypePair0.typeA);
      assertTrue(jSType0.matchesStringContext());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GLOBAL_THIS;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType jSType1 = jSType0.autobox();
      assertFalse(jSType1.isRecordType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.autobox();
      assertFalse(jSType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) noObjectType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      ImmutableList<NumberType> immutableList0 = ImmutableList.of(numberType0, numberType0, numberType0, numberType0, numberType0, numberType0, numberType0, numberType0, numberType0, numberType0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>(immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      JSType jSType0 = unionType0.findPropertyType("Named type with empty name component");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.findPropertyType("Not declared as a type name");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "BmSL.7o,%R=");
      JSType jSType0 = jSTypeRegistry0.createOptionalType(templateType0);
      assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GLOBAL_THIS;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType jSType1 = JSType.getGreatestSubtype(jSType0, (JSType) objectType0);
      assertFalse(jSType1.isVoidType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GLOBAL_THIS;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      boolean boolean0 = jSType0.canAssignTo(objectType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_RESOLVED_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderEquality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      boolean boolean0 = unionType0.canTestForShallowEqualityWith(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, false);
      VoidType voidType0 = new VoidType(jSTypeRegistry1);
      boolean boolean0 = unionType0.equals(voidType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      boolean boolean0 = unknownType0.equals(simpleErrorReporter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = voidType0.getTypesUnderShallowEquality(recordType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.GLOBAL_THIS;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowInequality(objectType0);
      JSType.TypePair jSType_TypePair1 = jSType0.getTypesUnderEquality(jSType_TypePair0.typeA);
      assertNotSame(jSType_TypePair1, jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(unionType0);
      JSType jSType0 = unionType0.getLeastSupertype(jSType_TypePair0.typeB);
      assertFalse(jSType0.isStringValueType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_RESOLVED_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      boolean boolean0 = objectType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType.TypePair jSType_TypePair0 = objectType0.getTypesUnderInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      noObjectType0.testForEquality(recordType0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      errorFunctionType0.testForEquality(errorFunctionType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      Node node0 = new Node(0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) unionType0, node0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      stringType0.testForEquality(functionType0);
  }
}
