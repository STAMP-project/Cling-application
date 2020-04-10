/*

 * Tue Mar 03 19:16:16 GMT 2020
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
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
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
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionType_ESTest extends FunctionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSType jSType0 = JSType.safeResolve((JSType) null, (ErrorReporter) null, (StaticScope<JSType>) null);
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      ObjectType.Property objectType_Property0 = errorFunctionType0.getSlot("Unknown class name");
      assertNull(objectType_Property0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoType noType0 = new NoType(jSTypeRegistry0);
      int int0 = noType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "W");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ImmutableList<ObjectType> immutableList0 = ImmutableList.of((ObjectType) instanceObjectType0, (ObjectType) noObjectType0, (ObjectType) instanceObjectType0, (ObjectType) noObjectType0, (ObjectType) instanceObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0, (ObjectType) noObjectType0);
      noObjectType0.setImplementedInterfaces(immutableList0);
      assertFalse(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[4];
      jSTypeArray0[3] = (JSType) noResolvedType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) noResolvedType0, true, jSTypeArray0);
      assertTrue(functionType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("~Ldcax+_;Jl!=N", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createInterfaceType("Unknown class name", node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Not declared as a constructor", (Node) null);
      JSType jSType0 = objectType0.getGreatestSubtype(functionType0);
      assertFalse(jSType0.isFunctionPrototypeType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "JbPJ#");
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      boolean boolean0 = errorFunctionType0.canTestForShallowEqualityWith(voidType0);
      assertTrue(errorFunctionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = Node.newString("", 528, (-1104));
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("Not declared as a constructor", node0, node0, (JSType) nullType0);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "JbPJ#");
      int int0 = errorFunctionType0.getMaxArguments();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      Vector<JSType> vector0 = new Vector<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) recordType0, (List<JSType>) vector0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      functionType0.canTestForShallowEqualityWith(errorFunctionType0);
      assertTrue(functionType0.isOrdinaryFunction());
      assertFalse(errorFunctionType0.hasCachedValues());
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0, (JSType) recordType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, (List<JSType>) immutableList0);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(functionType0.isConstructor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry1, "Unknown class name", (Node) null);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = nullType0.getTypesUnderShallowInequality(functionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSType.TypePair jSType_TypePair0 = unknownType0.getTypesUnderShallowInequality(allType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createOptionalParameters(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((Node) null, (Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      FunctionType functionType0 = errorFunctionType0.cloneWithoutArrowType();
      assertFalse(errorFunctionType0.hasCachedValues());
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "W");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      Node node0 = instanceObjectType0.getPropertyNode("BOOLEAN_OBJECT_TYPE");
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      noObjectType0.setPrototypeBasedOn((ObjectType) recordType0, node0);
      assertFalse(recordType0.isFunctionPrototypeType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.hasImplementedInterfaces();
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
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
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      int int0 = noObjectType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      NoType noType0 = (NoType)modificationVisitor0.caseNoType();
      Iterable<ObjectType> iterable0 = noType0.getAllExtendedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      Vector<JSType> vector0 = new Vector<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) recordType0, (List<JSType>) vector0);
      functionType0.getAllImplementedInterfaces();
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      Set<String> set0 = noResolvedType0.getOwnPropertyNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Xq0#%U<Dc7at][L)4Zk");
      errorFunctionType0.getImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionType) null).when(jSTypeRegistry0).getNativeFunctionType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry1).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoType noType0 = new NoType(jSTypeRegistry1);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = stringType0.getTypesUnderEquality(noType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      JSType.TypePair jSType_TypePair0 = objectType0.getTypesUnderInequality(unknownType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Not declared as a constructor", (Node) null);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithNewThisType(functionType0, functionType0);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "Not declared as a constructor", (Node) null);
      JSType jSType0 = functionType0.resolveInternal(simpleErrorReporter0, objectType0);
      assertTrue(jSType0.isInterface());
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      boolean boolean0 = allType0.isString();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType jSType0 = voidType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType0.isNullType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      Vector<JSType> vector0 = new Vector<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) recordType0, (List<JSType>) vector0);
      functionType0.canTestForShallowEqualityWith(functionType0);
      assertFalse(functionType0.hasCachedValues());
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.getTypesUnderShallowEquality(errorFunctionType0);
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      Vector<JSType> vector0 = new Vector<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) recordType0, (List<JSType>) vector0);
      functionType0.getGreatestSubtype(recordType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      errorFunctionType0.canTestForShallowEqualityWith(noObjectType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      Vector<JSType> vector0 = new Vector<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) recordType0, (List<JSType>) vector0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      functionType0.getTypesUnderInequality(nullType0);
      assertFalse(functionType0.hasInstanceType());
  }
}
