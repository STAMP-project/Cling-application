/*

 * Tue Mar 03 19:17:53 GMT 2020
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
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.UnknownType;
import java.util.ArrayList;
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, "<^Jom", node0);
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      JSType jSType0 = functionType0.resolveInternal(simpleErrorReporter0, functionType0);
      assertTrue(jSType0.isInterface());
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      functionType0.getPropertyType(": ");
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Not declared as a constructor", 752, 0);
      JSType[] jSTypeArray0 = new JSType[9];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) namedType0, false, jSTypeArray0);
      int int0 = functionType0.getMinArguments();
      assertTrue(functionType0.hasInstanceType());
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<ObjectType> arrayList0 = new ArrayList<ObjectType>();
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[3];
      JSTypeNative jSTypeNative0 = JSTypeNative.ARRAY_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNative0;
      jSTypeNativeArray0[2] = jSTypeNative0;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      JSType[] jSTypeArray0 = new JSType[4];
      jSTypeArray0[3] = (JSType) instanceObjectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) instanceObjectType0, true, jSTypeArray0);
      functionType0.setImplementedInterfaces(arrayList0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertTrue(instanceObjectType0.hasCachedValues());
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[6];
      jSTypeArray0[5] = (JSType) noResolvedType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      assertFalse(node0.isIf());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      int int0 = noType0.getMaxArguments();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = new Node(105, 105, 105);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "p", node0);
      boolean boolean0 = functionType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = Node.newString(77, "0f-UF?R5g8.^<");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("0f-UF?R5g8.^<", node0, node0, (JSType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      int int0 = noObjectType0.getMaxArguments();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[3];
      JSTypeNative jSTypeNative0 = JSTypeNative.ARRAY_FUNCTION_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSTypeNative jSTypeNative1 = JSTypeNative.U2U_FUNCTION_TYPE;
      jSTypeNativeArray0[1] = jSTypeNative1;
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = new Node(105, 105, 105);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "p", node0);
      JSType.TypePair jSType_TypePair0 = functionType0.getTypesUnderShallowInequality(functionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, (Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = noType0.cloneWithoutArrowType();
      assertFalse(functionType0.hasCachedValues());
      assertFalse(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noType0, booleanType0);
      noType0.setPrototypeBasedOn(indexedType0);
      assertFalse(indexedType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = Node.newString(105, "p");
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "p", node0);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(boolean0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
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
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)recordType0.getGreatestSubtypeHelper(recordType0);
      assertTrue(instanceObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      int int0 = noResolvedType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Ug_;z!", (Node) null);
      Iterable<ObjectType> iterable0 = functionType0.getAllExtendedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.getAllImplementedInterfaces();
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Set<String> set0 = noObjectType0.getOwnPropertyNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      JSType[] jSTypeArray0 = new JSType[8];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) unknownType0, jSTypeArray0);
      FunctionType functionType1 = functionType0.getBindReturnType(77);
      assertTrue(functionType1.isOrdinaryFunction());
      assertFalse(functionType1.equals((Object)functionType0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noType0, booleanType0);
      JSType.TypePair jSType_TypePair0 = indexedType0.getTypesUnderEquality(nullType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewThisType(noType0, noType0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = functionType0.getTypesUnderInequality(stringType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = new Node(105, 105, 105);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "p", node0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithNewThisType(functionType0, functionType0);
      assertFalse(functionType1.isConstructor());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = new Node(105, 105, 105);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "p", node0);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "", node0, functionType0);
      ObjectType objectType0 = enumType0.getImplicitPrototype();
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, objectType0, "Unknown class name");
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, enumElementType0, objectType0);
      JSType.getLeastSupertype((JSType) functionType0, (JSType) parameterizedType0);
      assertTrue(objectType0.isNativeObjectType());
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[3];
      JSTypeNative jSTypeNative0 = JSTypeNative.ARRAY_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSTypeNative jSTypeNative1 = JSTypeNative.U2U_FUNCTION_TYPE;
      jSTypeNativeArray0[1] = jSTypeNative1;
      jSTypeNativeArray0[2] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      JSType jSType1 = jSType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType1.isNullType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = new Node(105, 105, 105);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "p", node0);
      JSType jSType0 = functionType0.resolveInternal(simpleErrorReporter0, functionType0);
      assertFalse(jSType0.isConstructor());
      assertTrue(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = new Node(105, 105, 105);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "p", node0);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "", node0, functionType0);
      ObjectType objectType0 = enumType0.getImplicitPrototype();
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, objectType0, "Unknown class name");
      EnumElementType enumElementType1 = (EnumElementType)JSType.getGreatestSubtype((JSType) enumElementType0, (JSType) functionType0);
      assertTrue(objectType0.isNativeObjectType());
      assertFalse(enumElementType1.hasCachedValues());
      assertTrue(functionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      noType0.getTypesUnderInequality(stringType0);
      assertFalse(noType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = Node.newString(105, "p", 105, 105);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "", node0, noObjectType0);
      ObjectType objectType0 = enumType0.getImplicitPrototype();
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, objectType0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) enumType0, (JSType) objectType0, (JSType) noObjectType0, (JSType) enumType0, (JSType) noObjectType0, (JSType) objectType0, (JSType) enumElementType0, (JSType) noObjectType0, (JSType) noObjectType0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) stringType0, (List<JSType>) immutableList0);
      assertTrue(objectType0.isNativeObjectType());
      assertFalse(functionType0.hasInstanceType());
  }
}
