/*

 * Tue Mar 03 19:18:57 GMT 2020
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
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
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
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import java.util.ArrayList;
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "NoObject");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, templateType0, templateType0);
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((EnumElementType) null, (EnumElementType) null, indexedType0, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((EnumElementType) null, indexedType0).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry1, "RecordProperty associated with a property should not be null!", (Node) null);
      JSType jSType0 = functionType0.resolveInternal((ErrorReporter) null, indexedType0);
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      noType0.getImplementedInterfaces();
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ObjectType.Property objectType_Property0 = noObjectType0.getSlot("Not declared as a type name");
      assertFalse(noObjectType0.isInterface());
      assertNull(objectType_Property0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      int int0 = noObjectType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "{:t}k$T", (Node) null);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      nullType0.testForEquality(functionType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_CONSTRUCTOR_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(functionType0, functionType0);
      JSType[] jSTypeArray0 = new JSType[9];
      FunctionType functionType1 = jSTypeRegistry0.createFunctionType((JSType) parameterizedType0, false, jSTypeArray0);
      int int0 = functionType1.getMinArguments();
      assertFalse(functionType1.hasInstanceType());
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ImmutableList<ObjectType> immutableList0 = ImmutableList.of((ObjectType) noType0);
      noType0.setImplementedInterfaces(immutableList0);
      assertFalse(noType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      int int0 = noObjectType0.getMaxArguments();
      assertFalse(noObjectType0.isInterface());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a constctor");
      int int0 = errorFunctionType0.getMaxArguments();
      assertEquals(3, int0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.hasDisplayName();
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(node0).getType();
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, "", node0);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "NoObject");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, templateType0, templateType0);
      boolean boolean0 = indexedType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      int int0 = noType0.getMinArguments();
      assertFalse(noType0.isInterface());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoType noType0 = new NoType(jSTypeRegistry0);
      Node node0 = Node.newString(1, "Unknown class name", (-778), (-2886));
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("", node0, node0, (JSType) noType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "RecordProperty associated with a property should not be null!", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      int int0 = noObjectType0.getMaxArguments();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "ANNOTATION");
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(errorFunctionType0, errorFunctionType0);
      JSType[] jSTypeArray0 = new JSType[9];
      jSTypeArray0[8] = (JSType) parameterizedType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) parameterizedType0, jSTypeArray0);
      boolean boolean0 = functionType0.isOrdinaryFunction();
      assertTrue(boolean0);
      assertFalse(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) noObjectType0, (List<JSType>) arrayList0);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(functionType0.hasInstanceType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Node node0 = Node.newString(">=YLgHz &#m(");
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, ">=YLgHz &#m(");
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) unresolvedTypeExpression0, "Unknown class name", "_eN4iz7k:G", 382, 0);
      JSType.TypePair jSType_TypePair0 = unresolvedTypeExpression0.getTypesUnderShallowInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "{:t}k$T", (Node) null);
      functionType0.setPrototypeBasedOn((ObjectType) noType0, (Node) null);
      assertTrue(noType0.isFunctionPrototypeType());
      assertFalse(noType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.setPrototypeBasedOn(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertTrue(functionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSType jSType0 = JSType.getLeastSupertype((JSType) recordType0, (JSType) recordType0);
      assertFalse(jSType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      int int0 = functionType0.getMinArguments();
      assertEquals(0, int0);
      assertFalse(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "{:t}k$T", (Node) null);
      LinkedList<ObjectType> linkedList0 = new LinkedList<ObjectType>();
      linkedList0.add((ObjectType) noType0);
      functionType0.setExtendedInterfaces(linkedList0);
      Iterable<ObjectType> iterable0 = functionType0.getAllExtendedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "RecordProperty associated with a property should not be null!", (Node) null);
      functionType0.getImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      Set<String> set0 = noResolvedType0.getOwnPropertyNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "{:t}k$T", (Node) null);
      functionType0.resolveInternal(simpleErrorReporter0, noType0);
      assertFalse(noType0.isInterface());
      
      functionType0.getOwnPropertyNames();
      assertFalse(functionType0.isConstructor());
      assertTrue(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      functionType0.getImplementedInterfaces();
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType[] jSTypeArray0 = new JSType[9];
      jSTypeArray0[8] = (JSType) functionType0;
      jSTypeRegistry0.createConstructorTypeWithVarArgs(functionType0, jSTypeArray0);
      assertFalse(functionType0.hasInstanceType());
      assertFalse(functionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionType functionType1 = functionType0.getBindReturnType(0);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.getTypesUnderEquality(numberType0);
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "{:t}k$T", (Node) null);
      functionType0.getGreatestSubtype(noType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = noResolvedType0.getPropertyType("Unknown class name");
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = (JSType) noResolvedType0;
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0, jSType0, (JSType) noResolvedType0, jSType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) noResolvedType0, (JSType) stringType0, (JSType) noResolvedType0, jSType0, jSTypeArray0);
      FunctionType functionType0 = (FunctionType)jSTypeRegistry0.createFunctionTypeWithVarArgs((ObjectType) noResolvedType0, (JSType) noResolvedType0, (List<JSType>) immutableList0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      numberType0.getLeastSupertype(functionType0);
      assertFalse(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not eclared as a constctor");
      JSType jSType0 = errorFunctionType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoObjectType();
      JSType jSType1 = jSType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertFalse(jSType1.isInterface());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionType functionType1 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      FunctionType functionType2 = (FunctionType)functionType1.getGreatestSubtype(functionType0);
      assertFalse(functionType2.hasInstanceType());
      assertTrue(functionType1.isInterface());
      assertFalse(functionType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      functionType0.getGreatestSubtype(noResolvedType0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.SYNTAX_ERROR_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a constructor");
      boolean boolean0 = errorFunctionType0.canTestForShallowEqualityWith(jSType0);
      assertTrue(errorFunctionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "NoObject");
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "RecordProperty associated with a property should not be null!", (Node) null);
      functionType0.getTypesUnderInequality(templateType0);
      assertTrue(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = JSType.getLeastSupertype((JSType) noResolvedType0, (JSType) functionType0);
      assertFalse(jSType0.isInterface());
  }
}
