/*

 * Tue Mar 03 18:47:09 GMT 2020
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
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "NsLahFxnFhhs;e^,f0");
      voidType0.testForEquality(templateType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = JSType.isEquivalent((JSType) null, (JSType) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, arrayDeque0);
      boolean boolean0 = unionType0.isTemplateType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      TreeSet<JSType> treeSet0 = new TreeSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, treeSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowEquality(unknownType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, noResolvedType0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) enumElementType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(unionType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).createUnionType(any(com.google.javascript.rhino.jstype.JSType[].class));
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(unionType0);
      AllType allType0 = new AllType(jSTypeRegistry1);
      // Undeclared exception!
      try { 
        allType0.getLeastSupertype(jSType_TypePair0.typeA);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0, (JSType) nullType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(nullType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnknownType unknownType0 = new UnknownType((JSTypeRegistry) null, true);
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      boolean boolean0 = JSType.isEquivalent(unknownType0, unionType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(unionType0);
      boolean boolean0 = JSType.isEquivalent((JSType) null, jSType_TypePair0.typeA);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      boolean boolean0 = allType0.isNominalConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayDeque0);
      JSType jSType0 = unionType0.autobox();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      JSType jSType1 = JSType.getGreatestSubtype((JSType) unknownType0, jSType0);
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnknownType unknownType0 = new UnknownType((JSTypeRegistry) null, true);
      JSType jSType0 = unknownType0.autobox();
      assertFalse(jSType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) unionType0);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayDeque0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(unionType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      arrayDeque0.add(jSType_TypePair0.typeB);
      boolean boolean0 = unionType0.hasAnyTemplateInternal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNumberType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0, jSType0, jSType0, jSType0, jSType0, jSType0, jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      JSType jSType1 = unionType0.findPropertyType("Unknown class name");
      assertNull(jSType1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.findPropertyType("");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.createNamedType("2", "2", 397, 397);
      JSType[] jSTypeArray0 = new JSType[6];
      jSTypeArray0[5] = jSType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs(jSType0, jSTypeArray0);
      assertFalse(functionType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      NoResolvedType noResolvedType1 = (NoResolvedType)recordType0.getGreatestSubtype(noResolvedType0);
      assertEquals(0, noResolvedType1.getExtendedInterfacesCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      boolean boolean0 = allType0.canAssignTo(allType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      boolean boolean0 = recordType0.canAssignTo(noResolvedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, noResolvedType0, "Unknown class name");
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) enumElementType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, immutableList0);
      unionType0.testForEqualityHelper(enumElementType0, noResolvedType0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      boolean boolean0 = unionType0.canTestForShallowEqualityWith(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      boolean boolean0 = unionType0.equals(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AllType allType0 = new AllType((JSTypeRegistry) null);
      boolean boolean0 = allType0.equals("Unknown class name");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[5];
      jSTypeArray0[0] = (JSType) booleanType0;
      jSTypeArray0[3] = (JSType) booleanType0;
      jSTypeArray0[4] = (JSType) booleanType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) booleanType0, jSTypeArray0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) functionType0, jSTypeArray0[4], jSTypeArray0[3], jSTypeArray0[4], (JSType) functionType0);
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, immutableList0);
      // Undeclared exception!
      try { 
        unionType0.getTypesUnderEquality(jSTypeArray0[0]);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = allType0.getLeastSupertype(allType0);
      assertFalse(jSType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      Stack<JSType> stack0 = new Stack<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      boolean boolean0 = unionType0.hasDisplayName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayDeque0);
      JSType jSType0 = unionType0.autobox();
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      voidType0.testForEquality(jSType0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      ArrayDeque<JSType> arrayDeque0 = new ArrayDeque<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayDeque0);
      JSType jSType0 = unionType0.autobox();
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(jSType0);
      JSType.TypePair jSType_TypePair1 = jSType0.getTypesUnderInequality(jSType_TypePair0.typeA);
      assertFalse(jSType_TypePair1.equals((Object)jSType_TypePair0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, arrayList0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = noType0.getTypesUnderShallowEquality(unionType0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNumberType();
      noType0.testForEqualityHelper(jSType_TypePair0.typeB, jSType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null, (JSType) null, (JSType) null, (JSType) null, (JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      Stack<JSType> stack0 = new Stack<JSType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry1);
      Node node0 = Node.newString(1, "Unknown class name", (-896), (-1));
      FunctionType functionType0 = jSTypeRegistry1.createFunctionType((JSType) allType0, node0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) functionType0, (JSType) allType0, (JSType) allType0);
      stack0.addAll((Collection<? extends JSType>) immutableList0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, stack0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderEquality(unionType0);
      assertNotNull(jSType_TypePair0);
  }
}
