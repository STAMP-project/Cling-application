/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 05:26:27 GMT 2019
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
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
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
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.Collection;
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_CONSTRUCTOR_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      Node node0 = Node.newString("Unknown class name");
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeRegistry1).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn(node0).when(jSTypeRegistry1).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn(functionType0).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn(functionType0, functionType0, functionType0, functionType0, functionType0).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry1, "Named type with empty name component");
      errorFunctionType0.getParameters();
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) stringType0, (Node) null);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(boolean0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node0).getType();
      // Undeclared exception!
      try { 
        FunctionType.forInterface(jSTypeRegistry0, "Not declared as a constructor", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      ImmutableList<BooleanType> immutableList0 = ImmutableList.of(booleanType0, booleanType0);
      ImmutableList<JSType> immutableList1 = ImmutableList.copyOf((Collection<? extends JSType>) immutableList0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) noObjectType0, (List<JSType>) immutableList1);
      int int0 = functionType0.getMinArguments();
      assertFalse(functionType0.hasInstanceType());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_CONSTRUCTOR_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      int int0 = errorFunctionType0.getMinArguments();
      assertEquals(0, int0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[6];
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_FUNCTION_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNativeArray0[0];
      jSTypeNativeArray0[2] = jSTypeNative0;
      JSTypeNative jSTypeNative1 = JSTypeNative.GREATEST_FUNCTION_TYPE;
      jSTypeNativeArray0[3] = jSTypeNative1;
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
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Aj3D%_+P6[zB90%P", (Node) null);
      functionType0.getAllExtendedInterfaces();
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      ImmutableList<ObjectType> immutableList0 = ImmutableList.of((ObjectType) errorFunctionType0);
      errorFunctionType0.setImplementedInterfaces(immutableList0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "IsAssignableFrom(");
      errorFunctionType0.getAllImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "9Rc;,\u0004T])`nv&8|", (Node) null);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "g.F", (String) null, (-1254), (-1254));
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, namedType0, "Nq+c~{\"vR]!K|(R");
      JSType jSType0 = enumElementType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType0.isBooleanValueType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "?V~@yO/PDbuf");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0, (JSType) errorFunctionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = (JSType) noResolvedType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) noResolvedType0, true, jSTypeArray0);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Unknown class name");
      JSType.TypePair jSType_TypePair0 = nullType0.getTypesUnderShallowInequality(templateType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[6];
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_FUNCTION_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSTypeNative jSTypeNative1 = JSTypeNative.BOOLEAN_TYPE;
      jSTypeNativeArray0[1] = jSTypeNative1;
      jSTypeNativeArray0[2] = jSTypeNative0;
      jSTypeNativeArray0[3] = jSTypeNative1;
      jSTypeNativeArray0[4] = jSTypeNativeArray0[1];
      jSTypeNativeArray0[5] = jSTypeNativeArray0[4];
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(errorFunctionType0, jSType0);
      jSType0.getTypesUnderShallowInequality(parameterizedType0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      noType0.getTypesUnderInequality(noType0);
      assertFalse(noType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = JSType.filterNoResolvedType(noResolvedType0);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.REFERENCE_ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      functionType0.getLeastSupertype(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertFalse(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_CONSTRUCTOR_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      Node node0 = Node.newString("Unknown class name");
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeRegistry1).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn(node0).when(jSTypeRegistry1).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((FunctionType) null).when(jSTypeRegistry1).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn(functionType0).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn(functionType0, functionType0, functionType0, objectType0, objectType0).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry1, "Named type with empty name component");
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, functionType0, "Unknown class name");
      enumElementType0.getTypesUnderInequality(errorFunctionType0);
      assertTrue(objectType0.hasCachedValues());
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      errorFunctionType0.getTypesUnderShallowEquality(voidType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      noObjectType0.getTypesUnderEquality(unknownType0);
      assertFalse(noObjectType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = JSType.getLeastSupertype((JSType) noResolvedType0, (JSType) noObjectType0);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "NvsUS(uKgOf");
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseBooleanType();
      errorFunctionType0.getLeastSupertype(jSType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      errorFunctionType0.hasDisplayName();
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      noObjectType0.hasDisplayName();
      assertFalse(noObjectType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoObjectType();
      JSType[] jSTypeArray0 = new JSType[5];
      jSTypeArray0[4] = jSType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs(jSType0, jSTypeArray0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithNewThisType(functionType0, functionType0);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "G", (Node) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSType jSType0 = functionType0.resolveInternal(simpleErrorReporter0, functionType0);
      assertFalse(jSType0.isConstructor());
      assertTrue(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      errorFunctionType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      Node node0 = Node.newString("");
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType((String) null, node0, node0, (JSType) noType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      Set<String> set0 = noType0.getOwnPropertyNames();
      assertEquals(0, set0.size());
      assertFalse(noType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.FUNCTION_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Set<String> set0 = objectType0.getOwnPropertyNames();
      assertFalse(objectType0.isInterface());
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      noType0.getAllImplementedInterfaces();
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      errorFunctionType0.setPrototypeBasedOn(errorFunctionType0);
      assertFalse(errorFunctionType0.isFunctionPrototypeType());
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      int int0 = noResolvedType0.getMaxArguments();
      assertFalse(noResolvedType0.isInterface());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.isEnumType();
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      StringType stringType0 = new StringType(jSTypeRegistry0);
      stringType0.testForEquality(errorFunctionType0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = noResolvedType0.cloneWithoutArrowType();
      assertFalse(functionType0.isInterface());
      assertFalse(functionType0.hasCachedValues());
      assertFalse(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString("Unknown class name");
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      errorFunctionType0.defineInferredProperty("Not declared as a type name", (JSType) null, node0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "?V~@yO/PDbuf");
      int int0 = errorFunctionType0.getMaxArguments();
      assertEquals(3, int0);
      assertFalse(errorFunctionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "function (", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "com.google.common.base.Predicates$InPredicate");
      FunctionType functionType0 = errorFunctionType0.getBindReturnType(0);
      assertFalse(functionType0.hasInstanceType());
  }
}
