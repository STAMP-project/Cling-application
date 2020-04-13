/*

 * Tue Mar 03 19:16:42 GMT 2020
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
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionType_ESTest extends FunctionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = Node.newNumber((-1.0));
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, ") must not be negative", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newNumber((-2957.5276000023));
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0);
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(instanceObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, node0);
      ObjectType objectType0 = FunctionType.getTopDefiningInterface(functionType0, "~oh'AK:");
      assertFalse(instanceObjectType0.hasCachedValues());
      assertNull(objectType0);
      assertFalse(functionType0.isConstructor());
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noResolvedType0, noResolvedType0);
      JSType[] jSTypeArray0 = new JSType[4];
      jSTypeArray0[3] = (JSType) indexedType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) null, jSTypeArray0);
      assertFalse(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null, (JSType) null);
      ImmutableList<String> immutableList0 = ImmutableList.of("", "", "Not declared as a constructor", "", "Named type with empty name component");
      FunctionType functionType0 = new FunctionType(jSTypeRegistry0, "jf1(fj", (Node) null, arrowType0, (ObjectType) null, immutableList0, false, true);
      int int0 = functionType0.getMaxArguments();
      assertEquals(Integer.MAX_VALUE, int0);
      assertFalse(functionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(105).when(node0).getType();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "R91lR*P?I4m]]I?}al", node0);
      assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      ObjectType objectType0 = errorFunctionType0.getTypeOfThis();
      errorFunctionType0.getTypesUnderShallowEquality(objectType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      JSType jSType0 = numberType0.autoboxesTo();
      JSType[] jSTypeArray0 = new JSType[6];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, jSTypeArray0);
      functionType0.getTypesUnderShallowEquality(numberType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Node node0 = new Node((-2606), (-2635), 105);
      Node node1 = new Node(105, node0, node0, node0, node0, (-244), 31);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType("@B*c\"B ed3+`WT", node1, node1, (JSType) null);
      assertTrue(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newNumber((-1.0), 85, 2);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType jSType0 = voidType0.restrictByNotNullOrUndefined();
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("Y**iW]lB_*'3", node0, node0, jSType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "NLF9u_9?jf'", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Function", "Function", 54, Integer.MIN_VALUE);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) namedType0;
      jSTypeArray0[1] = (JSType) namedType0;
      ImmutableList<JSType> immutableList0 = ImmutableList.copyOf(jSTypeArray0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) namedType0, (List<JSType>) immutableList0);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(boolean0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      objectType0.getTypesUnderShallowInequality(recordType0);
      assertTrue(objectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = Node.newNumber((-2976.0826088270837));
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      boolean boolean0 = noType0.setPrototype((ObjectType) null, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Function", "Function", 54, Integer.MIN_VALUE);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) namedType0;
      jSTypeArray0[1] = (JSType) namedType0;
      ImmutableList<JSType> immutableList0 = ImmutableList.copyOf(jSTypeArray0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) namedType0, (List<JSType>) immutableList0);
      functionType0.setPrototypeBasedOn(functionType0);
      assertTrue(functionType0.isFunctionPrototypeType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.setPrototypeBasedOn(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.hasImplementedInterfaces();
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, (String) null, (Node) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, objectType0);
      JSType[] jSTypeArray0 = new JSType[6];
      jSTypeArray0[5] = (JSType) recordType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(proxyObjectType0, jSTypeArray0);
      functionType0.getTypesUnderShallowEquality(recordType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      int int0 = noType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Function", "Function", 54, Integer.MIN_VALUE);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) namedType0;
      jSTypeArray0[1] = (JSType) namedType0;
      ImmutableList<JSType> immutableList0 = ImmutableList.copyOf(jSTypeArray0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) namedType0, (List<JSType>) immutableList0);
      functionType0.getAllExtendedInterfaces();
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Function", (Node) null);
      functionType0.getImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      Set<String> set0 = noResolvedType0.getOwnPropertyNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "5&`$@osJ wyKX 8%y");
      errorFunctionType0.getAllImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      JSType.TypePair jSType_TypePair0 = errorFunctionType0.getTypesUnderInequality(errorFunctionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "`|hK7;D[tSsX", (Node) null);
      FunctionType functionType1 = functionType0.getBindReturnType(3);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, objectType0, objectType0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(indexedType0, jSTypeArray0);
      FunctionType functionType1 = functionType0.getBindReturnType(1);
      assertFalse(functionType1.equals((Object)functionType0));
      assertFalse(functionType1.hasInstanceType());
      assertTrue(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "`|hK7;D[tSsX", (Node) null);
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSType jSType0 = functionType0.resolveInternal(errorReporter0, (StaticScope<JSType>) null);
      assertFalse(jSType0.isConstructor());
      assertTrue(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = JSType.getLeastSupertype((JSType) booleanType0, (JSType) numberType0);
      assertFalse(jSType0.isParameterizedType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "XrW_fD /.kdb1r`");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, templateType0, templateType0);
      JSType jSType0 = indexedType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType0.isNumberValueType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Function", "Function", 36, Integer.MIN_VALUE);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) namedType0;
      jSTypeArray0[1] = (JSType) namedType0;
      ImmutableList<JSType> immutableList0 = ImmutableList.copyOf(jSTypeArray0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) namedType0, (List<JSType>) immutableList0);
      FunctionType functionType1 = (FunctionType)functionType0.resolveInternal(simpleErrorReporter0, functionType0);
      JSType.TypePair jSType_TypePair0 = functionType1.getTypesUnderShallowEquality(namedType0);
      jSType_TypePair0.typeB.getRestrictedTypeGivenToBooleanOutcome(false);
      assertTrue(functionType1.isOrdinaryFunction());
      assertFalse(functionType1.hasInstanceType());
      assertFalse(functionType1.hasCachedValues());
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Function", "Function", 54, Integer.MIN_VALUE);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) namedType0;
      jSTypeArray0[1] = (JSType) namedType0;
      ImmutableList<JSType> immutableList0 = ImmutableList.copyOf(jSTypeArray0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) namedType0, (List<JSType>) immutableList0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(functionType0, jSTypeArray0[0]);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, recordType0, noResolvedType0);
      noResolvedType0.getTypesUnderShallowEquality(indexedType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType[] jSTypeArray0 = new JSType[6];
      jSTypeArray0[3] = jSType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, jSTypeArray0);
      functionType0.getTypesUnderInequality(jSTypeArray0[3]);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = Node.newNumber((-2957.5276000023));
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      EnumType enumType0 = jSTypeRegistry0.createEnumType("", node0, jSType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderInequality(enumElementType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Function", "Function", 54, Integer.MIN_VALUE);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) namedType0;
      jSTypeArray0[1] = (JSType) namedType0;
      ImmutableList<JSType> immutableList0 = ImmutableList.copyOf(jSTypeArray0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) namedType0, (List<JSType>) immutableList0);
      functionType0.resolveInternal(simpleErrorReporter0, functionType0);
      JSType.TypePair jSType_TypePair0 = jSTypeArray0[0].getTypesUnderEquality(jSTypeArray0[0]);
      assertNotNull(jSType_TypePair0);
  }
}
