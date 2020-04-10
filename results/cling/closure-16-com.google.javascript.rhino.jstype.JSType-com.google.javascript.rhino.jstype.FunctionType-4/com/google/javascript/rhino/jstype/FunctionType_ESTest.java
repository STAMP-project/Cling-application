/*

 * Tue Mar 03 19:16:49 GMT 2020
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
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import com.google.javascript.rhino.jstype.VoidType;
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
        FunctionType.forInterface(jSTypeRegistry0, "&{E##W'HX}", node0);
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
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSType jSType0 = functionType0.resolveInternal(simpleErrorReporter0, functionType0);
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      ObjectType objectType0 = functionType0.getInstanceType();
      JSType[] jSTypeArray0 = new JSType[5];
      jSTypeArray0[0] = (JSType) objectType0;
      jSTypeArray0[1] = (JSType) functionType0;
      jSTypeArray0[2] = (JSType) objectType0;
      jSTypeArray0[3] = (JSType) functionType0;
      jSTypeArray0[4] = (JSType) functionType0;
      FunctionType functionType1 = jSTypeRegistry0.createConstructorType((JSType) functionType0, false, jSTypeArray0);
      functionType1.resolveInternal((ErrorReporter) null, objectType0);
      assertTrue(functionType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      functionType0.getPropertyType("Not declared as a constructor");
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      int int0 = noObjectType0.getMinArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(105).when(node0).getType();
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "&{E##W'HX}", node0);
      ObjectType[] objectTypeArray0 = new ObjectType[4];
      objectTypeArray0[0] = (ObjectType) functionType0;
      objectTypeArray0[1] = (ObjectType) functionType0;
      objectTypeArray0[2] = (ObjectType) functionType0;
      objectTypeArray0[3] = (ObjectType) functionType0;
      ImmutableList<ObjectType> immutableList0 = ImmutableList.of((ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, (ObjectType) functionType0, objectTypeArray0);
      functionType0.setImplementedInterfaces(immutableList0);
      assertTrue(functionType0.isObject());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      boolean boolean0 = noResolvedType0.canTestForShallowEqualityWith(voidType0);
      assertTrue(boolean0);
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
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType jSType0 = voidType0.restrictByNotNullOrUndefined();
      boolean boolean0 = jSType0.isEnumType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      int int0 = errorFunctionType0.getMaxArguments();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseBooleanType();
      Node node0 = Node.newString("", 1, 1);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, node0);
      functionType0.hasDisplayName();
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      ObjectType objectType0 = errorFunctionType0.getInstanceType();
      objectType0.hasDisplayName();
      assertTrue(objectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a type name");
      errorFunctionType0.getGreatestSubtype(voidType0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = new Node(105, 105, 1);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "@", node0);
      FunctionType functionType1 = functionType0.cloneWithoutArrowType();
      assertTrue(functionType1.isConstructor());
      assertFalse(functionType0.isConstructor());
      assertTrue(functionType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString(8448, "");
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType jSType0 = nullType0.restrictByNotNullOrUndefined();
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createConstructorType("", node0, node0, jSType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "com.google.javascript.rhino.jstype.AllType", (Node) null);
      int int0 = functionType0.getMaxArguments();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = Node.newNumber((-1174.360603883));
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(jSTypeRegistry1).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn(templateType0, templateType0, templateType0).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn(templateType0, templateType0, templateType0, templateType0, templateType0).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry1, "com.google.javascript.rhino.jstype.AllType", (Node) null);
      FunctionType functionType1 = functionType0.cloneWithoutArrowType();
      int int0 = functionType1.getMaxArguments();
      assertFalse(functionType1.isNominalConstructor());
      assertTrue(functionType1.hasCachedValues());
      assertFalse(functionType0.isConstructor());
      assertEquals(Integer.MAX_VALUE, int0);
      assertFalse(functionType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      ObjectType objectType0 = functionType0.getInstanceType();
      FunctionType functionType1 = jSTypeRegistry0.createFunctionType((JSType) objectType0, (Node) null);
      JSType jSType0 = functionType1.getGreatestSubtype(functionType0);
      assertTrue(jSType0.isOrdinaryFunction());
      assertFalse(functionType0.isOrdinaryFunction());
      assertFalse(functionType1.hasInstanceType());
      assertNotSame(jSType0, functionType1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noResolvedType0, noResolvedType0);
      indexedType0.getTypesUnderShallowInequality(noResolvedType0);
      assertFalse(indexedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      FunctionType functionType0 = errorFunctionType0.getBindReturnType(105);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      boolean boolean0 = functionType0.hasImplementedInterfaces();
      assertFalse(boolean0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "prototype", (Node) null);
      boolean boolean0 = functionType0.setPrototype((ObjectType) null, (Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null, (Node) null).when(jSTypeRegistry0).createParametersWithVarArgs(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((ObjectType) null, (ObjectType) null, (ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = noResolvedType0.cloneWithoutArrowType();
      assertFalse(functionType0.hasCachedValues());
      assertFalse(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.StringType");
      boolean boolean0 = errorFunctionType0.hasImplementedInterfaces();
      assertTrue(errorFunctionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      JSType[] jSTypeArray0 = new JSType[4];
      jSTypeArray0[0] = (JSType) recordType0;
      JSType jSType0 = jSTypeRegistry0.createNamedType("Unknown class name", ">NBD66Q[7Vs(;4Vh(s", 0, 0);
      jSTypeArray0[1] = jSType0;
      jSTypeArray0[2] = (JSType) recordType0;
      // Undeclared exception!
      try { 
        jSTypeRegistry0.createUnionType(jSTypeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.UnionTypeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      int int0 = noResolvedType0.getMinArguments();
      assertEquals(0, int0);
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      Node node0 = Node.newNumber(0.0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) voidType0, node0);
      voidType0.getTypesUnderShallowInequality(functionType0);
      assertFalse(functionType0.hasInstanceType());
      assertFalse(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      noObjectType0.getAllExtendedInterfaces();
      assertFalse(noObjectType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "com.google.javascript.rhino.jstype.AllType", (Node) null);
      functionType0.getImplementedInterfaces();
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "uneect propid ", (Node) null);
      Set<String> set0 = functionType0.getOwnPropertyNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(unknownType0, unknownType0, unknownType0).when(jSTypeRegistry1).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn(unknownType0, unknownType0).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry1, "Bv", (Node) null);
      ObjectType objectType0 = functionType0.getTopMostDefiningType("function (this:Bv): ?");
      assertNotNull(objectType0);
      
      Set<String> set0 = functionType0.getOwnPropertyNames();
      assertFalse(set0.isEmpty());
      assertFalse(functionType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "", (Node) null);
      ObjectType objectType0 = functionType0.getInstanceType();
      functionType0.getGreatestSubtype(objectType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      NoObjectType noObjectType0 = (NoObjectType)modificationVisitor0.caseNoObjectType();
      FunctionType functionType0 = noObjectType0.getBindReturnType(105);
      assertFalse(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      noResolvedType0.getTypesUnderInequality(noResolvedType0);
      assertFalse(noResolvedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("this:", (Node) null);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionTypeWithNewThisType(functionType0, functionType0);
      assertFalse(functionType1.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0);
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) immutableList0);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, unresolvedTypeExpression0, unresolvedTypeExpression0);
      JSType jSType0 = JSType.getLeastSupertype((JSType) nullType0, (JSType) indexedType0);
      assertFalse(jSType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "uneect propid ", (Node) null);
      JSType jSType0 = functionType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertTrue(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, unknownType0, unknownType0);
      JSType jSType0 = indexedType0.getRestrictedTypeGivenToBooleanOutcome(false);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType jSType0 = noResolvedType0.getGreatestSubtype(voidType0);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewThisType(noObjectType0, noObjectType0);
      JSType jSType0 = noObjectType0.getGreatestSubtype(functionType0);
      assertFalse(jSType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      JSType jSType1 = modificationVisitor0.caseNoObjectType();
      jSType1.getTypesUnderEquality(jSType0);
      assertFalse(jSType1.isInterface());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, booleanType0, "%s (%s must be less than size (s)");
      JSType.TypePair jSType_TypePair0 = booleanType0.getTypesUnderInequality(enumElementType0);
      assertNotNull(jSType_TypePair0);
  }
}
