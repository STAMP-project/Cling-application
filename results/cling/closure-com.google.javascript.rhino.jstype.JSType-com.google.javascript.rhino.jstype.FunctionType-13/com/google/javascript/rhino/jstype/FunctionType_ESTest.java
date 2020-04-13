/*

 * Tue Mar 03 19:16:52 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
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
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(105).when(node0).getType();
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Not declared as a type name", node0);
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[7];
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoObjectType();
      assertFalse(jSType0.isInterface());
      
      jSTypeArray0[0] = jSType0;
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, jSTypeArray0[0], "Named type with empty name component");
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry1, "com.google.javascript.rhino.jstype.UnionType", (Node) null);
      FunctionType functionType1 = (FunctionType)functionType0.resolveInternal(simpleErrorReporter0, enumElementType0);
      assertTrue(functionType1.hasInstanceType());
      assertFalse(functionType1.isConstructor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "AKrNmw<4to[Y:k(", (Node) null);
      ObjectType objectType0 = FunctionType.getTopDefiningInterface(functionType0, "AKrNmw<4to[Y:k(");
      assertNull(objectType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Iterable<Node> iterable0 = noObjectType0.getParameters();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      JSType jSType0 = JSType.getGreatestSubtype((JSType) numberType0, (JSType) errorFunctionType0);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[5];
      jSTypeArray0[4] = (JSType) noObjectType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(noObjectType0, jSTypeArray0);
      int int0 = functionType0.getMinArguments();
      assertTrue(functionType0.isConstructor());
      assertEquals(4, int0);
      assertFalse(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      noObjectType0.hasDisplayName();
      assertFalse(noObjectType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Node node0 = Node.newString(127, "Not declared as a type name");
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, "Not declared as a type name", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "0p']o?m4+{@l]iW76d`", "C8z", 1221, 0);
      boolean boolean0 = namedType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "com.google.javascript.rhino.InputId");
      Node node0 = Node.newString(3, "Not declared as a constructor");
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("Unknown class name", node0, node0, (JSType) errorFunctionType0);
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "AKrNmw<4to[Y:k(", (Node) null);
      FunctionType functionType1 = functionType0.getBindReturnType(122);
      boolean boolean0 = functionType1.isOrdinaryFunction();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.isOrdinaryFunction();
      assertFalse(noResolvedType0.isInterface());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.hasImplementedInterfaces();
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.getTypesUnderShallowInequality(noType0);
      assertFalse(noType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Node node0 = Node.newNumber(0.0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      boolean boolean0 = noObjectType0.setPrototype((ObjectType) null, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      noObjectType0.setPrototypeBasedOn(recordType0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(noObjectType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "AKrNmw<4to[Y:k(", (Node) null);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, recordType0, recordType0);
      JSType jSType0 = JSType.getGreatestSubtype((JSType) parameterizedType0, (JSType) recordType0);
      assertFalse(jSType0.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = noType0.getBindReturnType(35);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      noType0.getAllExtendedInterfaces();
      assertFalse(noType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "AKrNmw<4to[Y:k(", (Node) null);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      NoObjectType noObjectType0 = (NoObjectType)modificationVisitor0.caseNoObjectType();
      Set<String> set0 = noObjectType0.getOwnPropertyNames();
      assertEquals(0, set0.size());
      assertFalse(noObjectType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noObjectType0);
      instanceObjectType0.getPropertyNode("Not declared as a type name");
      Set<String> set0 = noObjectType0.getOwnPropertyNames();
      assertFalse(noObjectType0.isInterface());
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)stringType0.autoboxesTo();
      instanceObjectType0.getCtorImplementedInterfaces();
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertTrue(instanceObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "AKrNmw<4to[Y:k(", (Node) null);
      FunctionType functionType1 = functionType0.getBindReturnType(122);
      functionType0.setPrototypeBasedOn((ObjectType) functionType1, (Node) null);
      assertTrue(functionType1.isFunctionPrototypeType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      NoObjectType noObjectType0 = (NoObjectType)modificationVisitor0.caseNoObjectType();
      FunctionType functionType0 = noObjectType0.getBindReturnType(1);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(objectType0, objectType0);
      JSType.TypePair jSType_TypePair0 = objectType0.getTypesUnderEquality(parameterizedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NUMBER_STRING_BOOLEAN;
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[7];
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNative0;
      jSTypeNativeArray0[2] = jSTypeNative0;
      jSTypeNativeArray0[3] = jSTypeNative0;
      jSTypeNativeArray0[4] = jSTypeNative0;
      jSTypeNativeArray0[5] = jSTypeNative0;
      jSTypeNativeArray0[6] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      jSType0.getTypesUnderEquality(noObjectType0);
      assertFalse(noObjectType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = numberType0.getTypesUnderInequality(nullType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[0];
      NoType noType0 = (NoType)jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0);
      FunctionType functionType0 = (FunctionType)jSTypeRegistry0.createFunctionType((ObjectType) noType0, (JSType) noType0, (List<JSType>) immutableList0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "5-c");
      JSType jSType0 = templateType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)stringType0.autoboxesTo();
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Unknown class name", (Node) null);
      FunctionType functionType1 = (FunctionType)functionType0.resolveInternal(simpleErrorReporter0, instanceObjectType0);
      assertFalse(functionType1.isConstructor());
      assertTrue(instanceObjectType0.hasCachedValues());
      assertTrue(functionType1.hasInstanceType());
      assertTrue(instanceObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NUMBER_STRING_BOOLEAN;
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[7];
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNative0;
      jSTypeNativeArray0[2] = jSTypeNative0;
      jSTypeNativeArray0[3] = jSTypeNative0;
      jSTypeNativeArray0[4] = jSTypeNative0;
      jSTypeNativeArray0[5] = jSTypeNative0;
      jSTypeNativeArray0[6] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "IF", "Not declared as a constructor", 3, (-2357));
      JSType jSType1 = JSType.getLeastSupertype(jSType0, (JSType) namedType0);
      assertFalse(jSType1.isNoType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NUMBER_STRING_BOOLEAN;
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[7];
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNative0;
      jSTypeNativeArray0[2] = jSTypeNative0;
      jSTypeNativeArray0[3] = jSTypeNative0;
      jSTypeNativeArray0[4] = jSTypeNative0;
      jSTypeNativeArray0[5] = jSTypeNative0;
      jSTypeNativeArray0[6] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      jSType0.getTypesUnderInequality(noObjectType0);
      assertFalse(noObjectType0.isInterface());
  }
}
