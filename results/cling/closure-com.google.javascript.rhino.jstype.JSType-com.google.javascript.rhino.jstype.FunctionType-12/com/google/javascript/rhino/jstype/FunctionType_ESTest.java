/*

 * Tue Mar 03 19:17:37 GMT 2020
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
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
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
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      Node node0 = new Node(105, 105, 105);
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createInterfaceType((String) null, node0);
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "9h$1F^'a+", (Node) null);
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSType jSType0 = functionType0.resolveInternal(errorReporter0, functionType0);
      assertTrue(jSType0.isInterface());
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNumberType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0, jSType0, jSType0, jSType0, jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs(jSType0, (List<JSType>) immutableList0);
      functionType0.isPropertyTypeDeclared("Not declared as a type name");
      assertFalse(functionType0.hasCachedValues());
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      Iterable<Node> iterable0 = errorFunctionType0.getParameters();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "bind", (Node) null);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      functionType0.testForEquality(nullType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[4];
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) booleanType0, jSTypeArray0);
      ImmutableList<ObjectType> immutableList0 = ImmutableList.of((ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0);
      functionType0.setImplementedInterfaces(immutableList0);
      assertFalse(functionType0.isVoidType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNumberType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0, jSType0, jSType0, jSType0, jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs(jSType0, (List<JSType>) immutableList0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) functionType0, jSTypeArray0);
      functionType1.getMaxArguments();
      assertTrue(functionType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[4];
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseBooleanType();
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType(jSType0, jSTypeArray0);
      boolean boolean0 = functionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(555).when(node0).getType();
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, "function (", node0);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) objectType0, jSTypeArray0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      functionType0.getTypesUnderShallowEquality(nullType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) objectType0, jSTypeArray0);
      JSType.getLeastSupertype((JSType) functionType0, (JSType) objectType0);
      assertTrue(functionType0.hasCachedValues());
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(105).when(node0).getType();
      ObjectType objectType0 = mock(ObjectType.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Named type with empty name component";
      stringArray0[1] = "";
      stringArray0[2] = "Unknown class name";
      ImmutableList<String> immutableList0 = ImmutableList.copyOf(stringArray0);
      FunctionType functionType0 = null;
      try {
        functionType0 = new FunctionType(jSTypeRegistry0, "", node0, (ArrowType) null, objectType0, immutableList0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
      Node node0 = Node.newNumber((double) 0, 0, 0);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ImmutableList<String> immutableList0 = ImmutableList.of("Unknown class name");
      FunctionType functionType0 = null;
      try {
        functionType0 = new FunctionType(jSTypeRegistry0, "Not declared as a constructor", node0, arrowType0, noType0, immutableList0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNumberType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0, jSType0, jSType0, jSType0, jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs(jSType0, (List<JSType>) immutableList0);
      int int0 = functionType0.getMaxArguments();
      assertEquals(Integer.MAX_VALUE, int0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "W]VoP]rf");
      int int0 = errorFunctionType0.getMaxArguments();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.isOrdinaryFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = noResolvedType0.getBindReturnType(88);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSType[] jSTypeArray0 = new JSType[6];
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) null, false, jSTypeArray0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowInequality(functionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "bind", (Node) null);
      JSType.TypePair jSType_TypePair0 = functionType0.getTypesUnderShallowInequality(functionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "9h$1F^'a+", (Node) null);
      boolean boolean0 = functionType0.setPrototype((ObjectType) null, (Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[4];
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) booleanType0, jSTypeArray0);
      assertTrue(functionType0.isConstructor());
      
      FunctionType functionType1 = functionType0.cloneWithoutArrowType();
      assertFalse(functionType1.hasCachedValues());
      assertNotSame(functionType1, functionType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Node node0 = Node.newString(1350, "3Fp91*gm,", 1, 1350);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "3Fp91*gm,");
      NoType noType0 = new NoType(jSTypeRegistry0);
      noType0.setPrototypeBasedOn((ObjectType) unresolvedTypeExpression0, node0);
      assertFalse(noType0.isFunctionPrototypeType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.hasImplementedInterfaces();
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      JSType jSType0 = JSType.getLeastSupertype((JSType) recordType0, (JSType) recordType0);
      assertFalse(jSType0.isBooleanValueType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) objectType0, jSTypeArray0);
      int int0 = functionType0.getMinArguments();
      assertEquals(1, int0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "W]VoP]rf");
      Iterable<ObjectType> iterable0 = errorFunctionType0.getAllExtendedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) noResolvedType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) noResolvedType0, jSTypeArray0);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) objectType0, jSTypeArray0);
      Set<String> set0 = functionType0.getOwnPropertyNames();
      assertFalse(functionType0.hasInstanceType());
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "UcQoy5", (Node) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      functionType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      Set<String> set0 = functionType0.getOwnPropertyNames();
      assertTrue(functionType0.hasInstanceType());
      assertEquals(1, set0.size());
      assertFalse(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.getAllImplementedInterfaces();
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = noResolvedType0.getTypesUnderInequality(booleanType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      FunctionType functionType0 = errorFunctionType0.getBindReturnType(1006);
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = noResolvedType0.getBindReturnType(1);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) objectType0, jSTypeArray0);
      functionType0.getTypesUnderEquality(objectType0);
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "bind", (Node) null);
      JSType.TypePair jSType_TypePair0 = functionType0.getTypesUnderEquality(functionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) objectType0;
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) objectType0, jSTypeArray0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) functionType0, jSTypeArray0);
      functionType0.getTypesUnderShallowEquality(functionType1);
      assertTrue(functionType1.hasCachedValues());
      assertFalse(functionType0.equals((Object)functionType1));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, recordType0, recordType0);
      JSType jSType0 = indexedType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) noResolvedType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) noResolvedType0, jSTypeArray0);
      functionType0.getTypesUnderShallowEquality(jSTypeArray0[1]);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) noObjectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) noObjectType0, jSTypeArray0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[0] = (JSType) objectType0;
      jSTypeArray0[1] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) objectType0, jSTypeArray0);
      functionType0.getTypesUnderInequality(jSTypeArray0[0]);
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = nullType0.getTypesUnderInequality(nullType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) noResolvedType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) noResolvedType0, jSTypeArray0);
      JSType.TypePair jSType_TypePair0 = noResolvedType0.getTypesUnderShallowEquality(jSTypeArray0[1]);
      functionType0.getLeastSupertype(jSType_TypePair0.typeA);
      assertTrue(functionType0.hasCachedValues());
  }
}
