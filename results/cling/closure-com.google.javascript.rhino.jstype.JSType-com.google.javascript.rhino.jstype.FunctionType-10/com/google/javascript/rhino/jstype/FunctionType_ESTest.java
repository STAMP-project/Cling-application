/*

 * Tue Mar 03 19:17:57 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumType;
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
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.UnionType;
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, objectType0, objectType0);
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((EnumType) null, indexedType0, (EnumType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((EnumType) null, indexedType0).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "tgHO", (Node) null);
      FunctionType functionType1 = FunctionType.forInterface(jSTypeRegistry1, "cgIp`}", (Node) null);
      FunctionType functionType2 = (FunctionType)functionType1.resolveInternal(simpleErrorReporter0, functionType0);
      assertFalse(functionType2.isConstructor());
      assertFalse(functionType2.equals((Object)functionType0));
      assertTrue(functionType2.hasInstanceType());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) objectType0;
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) objectType0, jSTypeArray0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) functionType0, jSTypeArray0[1], jSTypeArray0[1], jSTypeArray0[0], (JSType) functionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      String string0 = unionType0.toDebugHashCodeString();
      assertTrue(functionType0.hasCachedValues());
      assertEquals("{(function ({767513558}): function (this:me, {1253635361}): me,function ({767513558}): function (this:me, {1253635361}): me,function ({767513558}): function (this:me, {1253635361}): me,function ({767513558}): function (this:me, {1253635361}): me,function ({767513558}): function (this:me, {1253635361}): me,function (function ({767513558}): function (this:me, {1253635361}): me, function ({767513558}): function (this:me, {1253635361}): me): function ({767513558}): function (this:me, {1253635361}): me,function ({767513558}): function (this:me, {1253635361}): me,function ({767513558}): function (this:me, {1253635361}): me,function ({767513558}): function (this:me, {1253635361}): me,function (function ({767513558}): function (this:me, {1253635361}): me, function ({767513558}): function (this:me, {1253635361}): me): function ({767513558}): function (this:me, {1253635361}): me)}", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      functionType0.getPropertyType("prototype");
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      ObjectType objectType1 = FunctionType.getTopDefiningInterface(objectType0, "Not declared as a constructor");
      assertNull(objectType1);
      assertFalse(objectType0.isNominalConstructor());
      assertFalse(objectType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "[4SDu:Lkwy($l=g/mG{", (Node) null);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      stringType0.testForEquality(functionType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("|5", "|5", (-3491), (-3491));
      NoType noType0 = new NoType(jSTypeRegistry0);
      ImmutableList<ObjectType> immutableList0 = ImmutableList.of((ObjectType) noType0, (ObjectType) noType0, (ObjectType) jSType0, (ObjectType) jSType0);
      noType0.setImplementedInterfaces(immutableList0);
      assertTrue(noType0.isObject());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) noResolvedType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) noResolvedType0, true, jSTypeArray0);
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      int int0 = noResolvedType0.getMaxArguments();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "DcO6ig_LiVDcmkUhc", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, "Use SerializedForm", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      ObjectType objectType0 = functionType0.getTypeOfThis();
      boolean boolean0 = objectType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.REGEXP_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "fRPCSwt#c2i");
      JSType jSType0 = functionType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
      assertFalse(jSType0.isEnumType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      int int0 = noResolvedType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      ObjectType objectType0 = functionType0.getTypeOfThis();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      errorFunctionType0.getGreatestSubtype(objectType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = new Node(1);
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("baw", node0, node0, (JSType) noObjectType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.REGEXP_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      int int0 = functionType0.getMaxArguments();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "tgHO", (Node) null);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      JSType jSType1 = jSType0.autobox();
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowInequality(jSType1);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("|5", "|5", (-3491), (-3491));
      NoType noType0 = new NoType(jSTypeRegistry0);
      Node node0 = Node.newNumber((double) 1, 1, 1);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("Not declared as a constructor", node0, jSType0);
      JSType.TypePair jSType_TypePair0 = noType0.getTypesUnderShallowInequality(enumType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("|5", "|5", (-3487), (-3487));
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[8];
      jSTypeArray0[0] = (JSType) noType0;
      jSTypeArray0[1] = (JSType) noType0;
      jSTypeArray0[2] = (JSType) noType0;
      jSTypeArray0[3] = (JSType) noType0;
      jSTypeArray0[4] = jSType0;
      jSTypeArray0[5] = (JSType) noType0;
      jSTypeArray0[6] = (JSType) noType0;
      jSTypeArray0[7] = jSType0;
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      noType0.setPrototypeBasedOn((ObjectType) noType0, node0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.JSType");
      boolean boolean0 = errorFunctionType0.hasImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createInterfaceType((String) null, (Node) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType[] jSTypeArray0 = new JSType[2];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) objectType0, jSTypeArray0);
      functionType0.getBindReturnType(45);
      assertFalse(objectType0.isNominalConstructor());
      assertTrue(objectType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.JSType");
      int int0 = errorFunctionType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      Iterable<ObjectType> iterable0 = functionType0.getAllExtendedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "1u\"@#:b_HNTKh", (Node) null);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      Set<String> set0 = functionType0.getOwnPropertyNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "tgHO", (Node) null);
      functionType0.setPrototypeBasedOn(functionType0);
      Set<String> set0 = functionType0.getOwnPropertyNames();
      assertFalse(functionType0.isFunctionPrototypeType());
      assertEquals(1, set0.size());
      assertFalse(functionType0.isConstructor());
      assertTrue(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
      FunctionType functionType0 = (FunctionType)jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      FunctionType functionType1 = functionType0.getBindReturnType(45);
      assertTrue(functionType1.equals((Object)functionType0));
      assertFalse(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = noResolvedType0.getBindReturnType(0);
      assertFalse(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = nullType0.getTypesUnderEquality(noResolvedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = (NamedType)jSTypeRegistry0.createNamedType("", "", (-3491), (-3491));
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) namedType0, (Node) null);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithNewThisType(functionType0, namedType0);
      assertTrue(functionType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.REGEXP_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionType functionType1 = FunctionType.forInterface(jSTypeRegistry0, "1u\"@#:b_HNTKh", (Node) null);
      FunctionType functionType2 = functionType1.supAndInfHelper(functionType0, true);
      assertFalse(functionType1.isConstructor());
      assertFalse(functionType1.isOrdinaryFunction());
      assertTrue(functionType1.hasInstanceType());
      assertFalse(functionType0.equals((Object)functionType1));
      assertFalse(functionType2.equals((Object)functionType0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      FunctionType functionType0 = (FunctionType)unionType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(objectType0.hasCachedValues());
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      objectType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertFalse(objectType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noResolvedType0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowEquality(noResolvedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) objectType0;
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) objectType0, jSTypeArray0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) objectType0, (JSType) functionType0, jSTypeArray0[1], jSTypeArray0[1], jSTypeArray0[0], (JSType) functionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      functionType0.getTypesUnderInequality(unionType0);
      assertFalse(functionType0.isOrdinaryFunction());
      assertTrue(objectType0.isOrdinaryFunction());
      assertFalse(objectType0.equals((Object)functionType0));
      assertFalse(objectType0.isNominalConstructor());
      assertFalse(functionType0.equals((Object)objectType0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(noResolvedType0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      jSType0.canTestForEqualityWith(noObjectType0);
      assertFalse(noObjectType0.isInterface());
      assertFalse(noResolvedType0.isInterface());
  }
}
