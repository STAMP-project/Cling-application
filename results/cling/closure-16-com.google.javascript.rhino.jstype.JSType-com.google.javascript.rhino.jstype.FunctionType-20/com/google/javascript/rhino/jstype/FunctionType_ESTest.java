/*

 * Tue Mar 03 19:18:41 GMT 2020
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
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.UnionType;
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
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSType jSType0 = functionType0.forceResolve(simpleErrorReporter0, functionType0);
      assertTrue(jSType0.isInterface());
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      JSType jSType0 = functionType0.getPropertyType("Not declared as a type name");
      assertNull(jSType0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Iterable<Node> iterable0 = noObjectType0.getParameters();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      JSType jSType1 = modificationVisitor0.caseStringType();
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderShallowEquality(jSType1);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<ObjectType> immutableList0 = ImmutableList.of((ObjectType) noObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0);
      // Undeclared exception!
      try { 
        noObjectType0.setImplementedInterfaces(immutableList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSTypeRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ArrayList<ObjectType> arrayList0 = new ArrayList<ObjectType>();
      noType0.setImplementedInterfaces(arrayList0);
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0, false);
      Node node0 = Node.newString("&4}BuVX.6XL2@tm=(Q5", (-359), 869);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "\u0007MU<%]", node0, instanceObjectType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      JSType.getGreatestSubtype((JSType) enumElementType0, (JSType) enumType0);
      assertTrue(instanceObjectType0.hasCachedValues());
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "lM4j6JAS-U", (Node) null, errorFunctionType0);
      boolean boolean0 = enumType0.isEnumType();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      boolean boolean0 = noType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, "w{Mtvpw", node0);
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      boolean boolean0 = errorFunctionType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      boolean boolean0 = functionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      errorFunctionType0.resolveInternal(simpleErrorReporter0, noObjectType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0, false);
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "lM4j6JAS-U", (Node) null, errorFunctionType0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) enumType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs(instanceObjectType0, jSTypeArray0);
      int int0 = functionType0.getMinArguments();
      assertEquals(2, int0);
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = recordType0.getGreatestSubtypeHelper(jSType0);
      assertTrue(jSType1.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      Node node0 = Node.newString("Not declared as a type name");
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("Not declared as a constructor", node0, node0, (JSType) allType0);
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
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "}$E!H9R", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) numberType0, (JSType) numberType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) numberType0, (List<JSType>) immutableList0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      functionType0.supAndInfHelper(noType0, true);
      assertTrue(functionType0.isOrdinaryFunction());
      assertFalse(functionType0.isConstructor());
      assertFalse(noType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "67p:4%*Kd^ ", (Node) null);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(boolean0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0, false);
      JSType.TypePair jSType_TypePair0 = errorFunctionType0.getTypesUnderShallowInequality(instanceObjectType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "*u;=6}\r1@w@r", (Node) null);
      boolean boolean0 = functionType0.setPrototype((ObjectType) null, (Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = noType0.cloneWithoutArrowType();
      assertFalse(functionType0.hasCachedValues());
      assertFalse(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = Node.newNumber(2963.238873626341, 1, 0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.setPrototypeBasedOn(objectType0, node0);
      assertFalse(objectType0.isFunctionPrototypeType());
      assertFalse(objectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      boolean boolean0 = errorFunctionType0.hasImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      boolean boolean0 = noType0.hasImplementedInterfaces();
      assertTrue(noType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      FunctionType functionType0 = errorFunctionType0.getBindReturnType(45);
      assertFalse(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      int int0 = errorFunctionType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      Iterable<ObjectType> iterable0 = noType0.getAllExtendedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Set<String> set0 = noObjectType0.getOwnPropertyNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.getImplementedInterfaces();
      noResolvedType0.getOwnPropertyNames();
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      errorFunctionType0.getAllImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = noResolvedType0.getBindReturnType(3);
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "*u;=6}\r1@w@r", (Node) null);
      FunctionType functionType1 = functionType0.getBindReturnType(1);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = noResolvedType0.getTypesUnderEquality(noResolvedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType jSType0 = JSType.filterNoResolvedType(noType0);
      assertTrue(jSType0.matchesNumberContext());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNumberType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs(jSType0, (List<JSType>) immutableList0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(functionType0, functionType0);
      assertTrue(functionType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[9];
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType(jSTypeArray0[3], jSTypeArray0);
      JSType.getLeastSupertype((JSType) functionType0, (JSType) booleanType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) unknownType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertFalse(jSType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "WI-IsL,1~myY1x,`");
      JSType jSType0 = errorFunctionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertTrue(jSType0.canBeCalled());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      NoObjectType noObjectType0 = (NoObjectType)recordType0.getGreatestSubtypeHelper(noResolvedType0);
      noResolvedType0.testForEqualityHelper(noObjectType0, recordType0);
      assertTrue(noObjectType0.hasCachedValues());
      assertTrue(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = noResolvedType0.getTypesUnderInequality(noResolvedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewThisType(noType0, noType0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = JSType.getLeastSupertype((JSType) noResolvedType0, (JSType) functionType0);
      assertSame(jSType0, functionType0);
  }
}
