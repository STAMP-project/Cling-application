/*

 * Tue Mar 03 19:17:57 GMT 2020
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
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "): ");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.getTypesUnderShallowInequality(unionType0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, (List<JSType>) immutableList0);
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, functionType0).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType1 = FunctionType.forInterface(jSTypeRegistry1, "(p]./]:O", (Node) null);
      ObjectType objectType0 = functionType1.getInstanceType();
      functionType1.resolveInternal(simpleErrorReporter0, objectType0);
      assertFalse(functionType0.hasInstanceType());
      assertFalse(functionType0.isFunctionPrototypeType());
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Not declared as a type name", (Node) null);
      // Undeclared exception!
      try { 
        functionType0.findPropertyType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "NoResolvedType");
      Iterable<Node> iterable0 = errorFunctionType0.getParameters();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.isEmptyType();
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "TWcV@;'w_%J");
      int int0 = errorFunctionType0.getMaxArguments();
      assertEquals(3, int0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseStringType();
      boolean boolean0 = jSType0.isEnumType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "'U{>7Td)ed_Q(Y+w}", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      noType0.hasDisplayName();
      assertFalse(noType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Node node0 = Node.newNumber((-1220.82));
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, "Unknown class name", node0);
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "): ");
      errorFunctionType0.hasDisplayName();
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("com.google.javascript.rhino.jstype.JSTypeRegistry$1", node0, node0, (JSType) allType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      int int0 = noType0.getMaxArguments();
      assertFalse(noType0.isInterface());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "'U{>7Td)ed_Q(Y+w}", (Node) null);
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry1);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0);
      FunctionType functionType1 = jSTypeRegistry1.createFunctionTypeWithVarArgs((JSType) functionType0, (List<JSType>) immutableList0);
      boolean boolean0 = functionType1.isOrdinaryFunction();
      assertTrue(boolean0);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "): ");
      boolean boolean0 = errorFunctionType0.isOrdinaryFunction();
      assertFalse(errorFunctionType0.isInterface());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "(p]./]:O", (Node) null);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(boolean0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "'U{>7Td)ed_Q(Y+w}", (Node) null);
      boolean boolean0 = functionType0.setPrototype((ObjectType) null, (Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = noType0.cloneWithoutArrowType();
      assertFalse(functionType0.hasCachedValues());
      
      StringType stringType0 = new StringType(jSTypeRegistry0);
      NoType noType1 = (NoType)JSType.getGreatestSubtype((JSType) functionType0, (JSType) stringType0);
      assertFalse(noType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.setPrototypeBasedOn((ObjectType) noResolvedType0, (Node) null);
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ")';: ");
      boolean boolean0 = errorFunctionType0.hasImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      boolean boolean0 = noType0.hasImplementedInterfaces();
      assertTrue(noType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
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
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, (List<JSType>) immutableList0);
      functionType0.getTypesUnderShallowEquality(recordType0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "]");
      int int0 = errorFunctionType0.getMinArguments();
      assertEquals(0, int0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "}");
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(errorFunctionType0);
      jSType0.getTypesUnderShallowInequality(errorFunctionType0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WJs4YHB47$n&HKLEgb");
      Iterable<ObjectType> iterable0 = errorFunctionType0.getAllExtendedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[2];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) noType0, jSTypeArray0);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Set<String> set0 = noObjectType0.getOwnPropertyNames();
      assertFalse(noObjectType0.isInterface());
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "(p]./]:O", (Node) null);
      assertTrue(functionType0.hasInstanceType());
      
      ObjectType objectType0 = functionType0.getInstanceType();
      functionType0.resolveInternal(simpleErrorReporter0, objectType0);
      Set<String> set0 = functionType0.getOwnPropertyNames();
      assertEquals(1, set0.size());
      assertFalse(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "): ");
      errorFunctionType0.getAllImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ")';: ");
      FunctionType functionType0 = errorFunctionType0.getBindReturnType(2230);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = noResolvedType0.getBindReturnType(1);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "mDFVZ:$tt", (ObjectType) null, true);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "(p]./]:O", (Node) null);
      functionType0.getTypesUnderEquality(prototypeObjectType0);
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.getTypesUnderEquality(noResolvedType0);
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ")';: ");
      JSType jSType0 = jSTypeRegistry0.createDefaultObjectUnion(errorFunctionType0);
      jSType0.testForEquality(errorFunctionType0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "(p]./]:O", (Node) null);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(functionType0, functionType0);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "): ");
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      errorFunctionType0.getLeastSupertype(booleanType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      JSType jSType0 = unknownType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertFalse(jSType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType jSType0 = noType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "}");
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = noResolvedType0.getGreatestSubtype(errorFunctionType0);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      noObjectType0.getTypesUnderInequality(booleanType0);
      assertFalse(noObjectType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ")';: ");
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = noResolvedType0.getLeastSupertype(errorFunctionType0);
      assertFalse(jSType0.isInterface());
  }
}
