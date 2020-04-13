/*

 * Tue Mar 03 19:19:44 GMT 2020
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
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
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
        FunctionType.forInterface(jSTypeRegistry0, "The new child node has siblings.", node0);
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
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(105).when(node0).getType();
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "The new child node has silings.", node0);
      JSType jSType0 = functionType0.resolveInternal(simpleErrorReporter0, functionType0);
      assertFalse(jSType0.isConstructor());
      assertTrue(jSType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ObjectType objectType0 = noObjectType0.getPrototype();
      assertFalse(objectType0.isVoidType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      NoType noType0 = new NoType(jSTypeRegistry0);
      noType0.defineInferredProperty("thisType", errorFunctionType0, (Node) null);
      assertFalse(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      Iterable<Node> iterable0 = errorFunctionType0.getParameters();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType jSType0 = nullType0.getGreatestSubtype(numberType0);
      assertFalse(jSType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ImmutableList<ObjectType> immutableList0 = ImmutableList.of((ObjectType) noResolvedType0, (ObjectType) noResolvedType0, (ObjectType) noResolvedType0, (ObjectType) noResolvedType0);
      noResolvedType0.setImplementedInterfaces(immutableList0);
      assertFalse(noResolvedType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noResolvedType0, noResolvedType0);
      JSType[] jSTypeArray0 = new JSType[8];
      jSTypeArray0[7] = (JSType) indexedType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      assertFalse(node0.isCatch());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) instanceObjectType0, (JSType) instanceObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) instanceObjectType0, (List<JSType>) immutableList0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) functionType0, (List<JSType>) immutableList0);
      int int0 = functionType1.getMaxArguments();
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(functionType1.hasInstanceType());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "B[1(/#6=", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      boolean boolean0 = noType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) instanceObjectType0, (JSType) instanceObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) instanceObjectType0, (List<JSType>) immutableList0);
      FunctionType functionType1 = (FunctionType)functionType0.resolveInternal((ErrorReporter) null, (StaticScope<JSType>) null);
      assertFalse(functionType1.hasCachedValues());
      assertTrue(instanceObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      NoObjectType noObjectType0 = (NoObjectType)modificationVisitor0.caseNoObjectType();
      int int0 = noObjectType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedList0);
      JSType jSType0 = unionType0.getGreatestSubtype(errorFunctionType0);
      assertFalse(jSType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayDeque<ObjectType> arrayDeque0 = new ArrayDeque<ObjectType>();
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(objectType0).toString();
      doReturn(arrayDeque0).when(objectType0).getCtorExtendedInterfaces();
      doReturn(true).when(objectType0).hasProperty(anyString());
      ObjectType objectType1 = FunctionType.getTopDefiningInterface(objectType0, "kD8!ak@pp~!T");
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(objectType1).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(105).when(node0).getType();
      ImmutableList<String> immutableList0 = ImmutableList.of("");
      FunctionType functionType0 = null;
      try {
        functionType0 = new FunctionType(jSTypeRegistry0, "Named type with empty name component", node0, (ArrowType) null, objectType1, immutableList0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      Node node0 = Node.newString(0, "]");
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("Named type with empty name component", node0, node0, (JSType) errorFunctionType0);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) instanceObjectType0, (JSType) instanceObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) instanceObjectType0, (List<JSType>) immutableList0);
      int int0 = functionType0.getMaxArguments();
      assertEquals(2, int0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      int int0 = noResolvedType0.getMaxArguments();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) instanceObjectType0, (JSType) instanceObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) instanceObjectType0, (List<JSType>) immutableList0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      FunctionType functionType1 = (FunctionType)functionType0.getGreatestSubtype(errorFunctionType0);
      assertNotSame(functionType1, functionType0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(functionType0.isConstructor());
      assertFalse(errorFunctionType0.hasCachedValues());
      assertTrue(functionType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) instanceObjectType0, (JSType) instanceObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) instanceObjectType0, (List<JSType>) immutableList0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) functionType0, (List<JSType>) immutableList0);
      FunctionType functionType2 = functionType1.getBindReturnType(15);
      assertFalse(functionType2.hasInstanceType());
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(functionType2.equals((Object)functionType1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(105).when(node0).getType();
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "The new child node has silings.", node0);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(boolean0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      JSType.TypePair jSType_TypePair0 = errorFunctionType0.getTypesUnderShallowInequality(errorFunctionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "A6Cx9= &>p7;?fe02N", (Node) null);
      boolean boolean0 = functionType0.setPrototype((ObjectType) null, (Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, (List<JSType>) immutableList0);
      functionType0.setPrototypeBasedOn(functionType0);
      assertTrue(functionType0.isFunctionPrototypeType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      noType0.setPrototypeBasedOn((ObjectType) noType0, (Node) null);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      int int0 = errorFunctionType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      Iterable<ObjectType> iterable0 = errorFunctionType0.getAllExtendedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, false, jSTypeArray0);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      Set<String> set0 = noType0.getOwnPropertyNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      errorFunctionType0.hasImplementedInterfaces();
      errorFunctionType0.getOwnPropertyNames();
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "/W");
      errorFunctionType0.getAllImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, (List<JSType>) immutableList0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) functionType0, (List<JSType>) immutableList0);
      JSType jSType1 = functionType1.getGreatestSubtype(functionType0);
      assertTrue(functionType1.hasCachedValues());
      
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = jSType1;
      jSTypeRegistry0.createConstructorTypeWithVarArgs(noObjectType0, jSTypeArray0);
      assertFalse(noObjectType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) instanceObjectType0, (JSType) instanceObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) instanceObjectType0, (List<JSType>) immutableList0);
      FunctionType functionType1 = functionType0.getBindReturnType(15);
      assertFalse(functionType1.equals((Object)functionType0));
      assertFalse(functionType1.hasInstanceType());
      assertTrue(instanceObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      FunctionType functionType0 = errorFunctionType0.getBindReturnType(0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.getTypesUnderEquality(noResolvedType0);
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType(":-x0%|AcA2KpdR]nH<", (Node) null, (Node) null, (JSType) objectType0);
      functionType0.getTypesUnderInequality(objectType0);
      assertFalse(functionType0.isInterface());
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      FunctionType functionType0 = (FunctionType)jSTypeRegistry0.createFunctionTypeWithVarArgs(objectType0, (JSType) objectType0, (List<JSType>) linkedList0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      errorFunctionType0.getGreatestSubtype(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      boolean boolean0 = errorFunctionType0.canTestForShallowEqualityWith(objectType0);
      assertTrue(objectType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      errorFunctionType0.getLeastSupertype(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)jSTypeRegistry0.getNativeType(jSTypeNative0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) instanceObjectType0, (JSType) instanceObjectType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) instanceObjectType0, (List<JSType>) immutableList0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      errorFunctionType0.getTypesUnderInequality(functionType0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(functionType0.hasInstanceType());
  }
}
