/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 21:43:37 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.Visitor;
import java.util.HashMap;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProxyObjectType_ESTest extends ProxyObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      JSType jSType0 = parameterizedType0.collapseUnion();
      assertFalse(jSType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(templateType0, templateType0);
      ObjectType objectType0 = parameterizedType0.getTypeOfThis();
      assertNull(objectType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, (JSType) null);
      ObjectType objectType0 = proxyObjectType0.getTypeOfThis();
      assertNull(objectType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, allType0);
      JSType jSType0 = parameterizedType0.getIndexType();
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      JSType jSType0 = parameterizedType0.getIndexType();
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, numberType0);
      JSType jSType0 = proxyObjectType0.getParameterType();
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(templateType0, templateType0);
      JSType jSType0 = parameterizedType0.getLeastSupertype(templateType0);
      assertFalse(jSType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, numberType0);
      FunctionType functionType0 = proxyObjectType0.getConstructor();
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, errorFunctionType0);
      FunctionType functionType0 = proxyObjectType0.getConstructor();
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, (JSType) null);
      Set<String> set0 = proxyObjectType0.getOwnPropertyNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      Set<String> set0 = templateType0.getOwnPropertyNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, (ObjectType) null, noResolvedType0);
      boolean boolean0 = indexedType0.hasOwnProperty("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Named type with empty name component");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noType0, templateType0);
      boolean boolean0 = indexedType0.hasOwnProperty("Not declared as a constructor");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, (JSType) null);
      boolean boolean0 = proxyObjectType0.hasProperty("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noResolvedType0, noResolvedType0);
      indexedType0.setPropertyJSDocInfo("Not declared as a type name", (JSDocInfo) null);
      assertFalse(indexedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, (ObjectType) null, noResolvedType0);
      indexedType0.setPropertyJSDocInfo("Not declared as a type name", (JSDocInfo) null);
      assertFalse(indexedType0.isFunctionPrototypeType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType((ObjectType) null, (JSType) null);
      JSDocInfo jSDocInfo0 = parameterizedType0.getOwnPropertyJSDocInfo("}66.X'YC");
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Named type with empty name component");
      JSDocInfo jSDocInfo0 = templateType0.getOwnPropertyJSDocInfo("Not declared as a type name");
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, errorFunctionType0);
      proxyObjectType0.setJSDocInfo((JSDocInfo) null);
      assertEquals(BooleanLiteralSet.TRUE, proxyObjectType0.getPossibleToBooleanOutcomes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, (ObjectType) null, (JSType) null);
      indexedType0.setJSDocInfo((JSDocInfo) null);
      assertFalse(indexedType0.isNullType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType((ObjectType) null, (JSType) null);
      JSType jSType0 = parameterizedType0.getPropertyType("Not declared as a constructor");
      assertFalse(jSType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      Set<String> set0 = parameterizedType0.getPropertyNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, (JSType) null);
      Set<String> set0 = parameterizedType0.getPropertyNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType((ObjectType) null, (JSType) null);
      int int0 = parameterizedType0.getPropertiesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      int int0 = templateType0.getPropertiesCount();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, (JSType) null);
      boolean boolean0 = parameterizedType0.isPropertyInExterns("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      boolean boolean0 = parameterizedType0.isPropertyInExterns("Named type with empty name component");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, (JSType) null);
      boolean boolean0 = proxyObjectType0.isPropertyTypeInferred("PHVd16&CIKX_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Named type with empty name component");
      boolean boolean0 = templateType0.isPropertyTypeInferred("Not declared as a constructor");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IndexedType indexedType0 = new IndexedType((JSTypeRegistry) null, (ObjectType) null, (JSType) null);
      Node node0 = indexedType0.getPropertyNode("Not declared as a constructor");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, errorFunctionType0);
      Node node0 = proxyObjectType0.getPropertyNode("Not declared as a constructor");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ProxyObjectType proxyObjectType0 = new ProxyObjectType((JSTypeRegistry) null, (JSType) null);
      boolean boolean0 = proxyObjectType0.isPropertyTypeDeclared("Not declared as a type name");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, (ObjectType) null, noResolvedType0);
      boolean boolean0 = indexedType0.removeProperty("Not declared as a type name");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      boolean boolean0 = templateType0.removeProperty("GVWJPuj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, (JSType) null);
      boolean boolean0 = parameterizedType0.defineSynthesizedProperty("C>HA2Y^", (JSType) null, (Node) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, allType0);
      ObjectType objectType0 = parameterizedType0.getImplicitPrototype();
      assertNull(objectType0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      AllType allType0 = new AllType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, allType0);
      Iterable<ObjectType> iterable0 = parameterizedType0.getCtorImplementedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      Iterable<ObjectType> iterable0 = parameterizedType0.getCtorImplementedInterfaces();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, (JSType) null);
      FunctionType functionType0 = parameterizedType0.getOwnerFunction();
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      FunctionType functionType0 = templateType0.getOwnerFunction();
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, numberType0);
      boolean boolean0 = proxyObjectType0.isNativeObjectType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      ObjectType objectType0 = jSTypeRegistry0.createObjectType((ObjectType) templateType0);
      boolean boolean0 = templateType0.differsFrom(objectType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, booleanType0);
      // Undeclared exception!
      try { 
        proxyObjectType0.hasReferenceName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.ProxyObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      JSType[] jSTypeArray0 = new JSType[2];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      boolean boolean0 = parameterizedType0.defineInferredProperty("Unknown class name", noType0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, (ObjectType) null, allType0);
      String string0 = indexedType0.getNormalizedReferenceName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noResolvedType0, noResolvedType0);
      String string0 = parameterizedType0.getDisplayName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, (JSType) null);
      ObjectType.Property objectType_Property0 = parameterizedType0.getSlot("Unknown class name");
      assertNull(objectType_Property0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      boolean boolean0 = parameterizedType0.canTestForShallowEqualityWith(noType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, (ObjectType) null, (JSType) null);
      // Undeclared exception!
      try { 
        parameterizedType0.toMaybeTemplateType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.ProxyObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, errorFunctionType0);
      proxyObjectType0.canBeCalled();
      assertTrue(proxyObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.ProxyObjectType");
      boolean boolean0 = templateType0.isCheckedUnknownType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.ProxyObjectType", ")", 1790, 1790);
      Visitor<NoType> visitor0 = (Visitor<NoType>) mock(Visitor.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(visitor0).caseUnknownType();
      NoType noType0 = namedType0.visit(visitor0);
      assertNull(noType0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "d76k$");
      boolean boolean0 = templateType0.isOrdinaryFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      EnumElementType enumElementType0 = parameterizedType0.toMaybeEnumElementType();
      assertNull(enumElementType0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "setIsNoSideEffectsCall only supports CALL and NEW nodes, got ");
      boolean boolean0 = templateType0.isConstructor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      AllType allType0 = new AllType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, (ObjectType) null, allType0);
      // Undeclared exception!
      try { 
        indexedType0.hasAnyTemplateInternal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.ProxyObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      boolean boolean0 = templateType0.isInstanceType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(templateType0);
      assertTrue(jSType0.canBeCalled());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      boolean boolean0 = templateType0.matchesStringContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test59()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noType0, noType0);
      String string0 = indexedType0.toDebugHashCodeString();
      assertEquals("{proxy:function (this:me, {9}): me}", string0);
      assertTrue(indexedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "?Bhsldkch')K4", "?Bhsldkch')K4", 2985, 2985);
      namedType0.matchConstraint(namedType0);
      assertFalse(namedType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, (JSType) null);
      // Undeclared exception!
      try { 
        proxyObjectType0.toMaybeParameterizedType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.ProxyObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      boolean boolean0 = parameterizedType0.matchesUint32Context();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a type name", "?Bhsldkch')K4", 0, (-465));
      JSDocInfo jSDocInfo0 = namedType0.getJSDocInfo();
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, noObjectType0, noObjectType0);
      indexedType0.canAssignTo(indexedType0);
      assertTrue(indexedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(noResolvedType0, noResolvedType0);
      UnknownType unknownType0 = (UnknownType)parameterizedType0.findPropertyType("");
      assertFalse(unknownType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "parenthesized");
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "`j6hRYFb-Q~Q", 0, 0);
      JSType jSType0 = namedType0.resolveInternal(simpleErrorReporter0, templateType0);
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      boolean boolean0 = templateType0.isEmptyType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "Fk\"Q{tl'0NOw*");
      boolean boolean0 = templateType0.isNullable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noResolvedType0, noResolvedType0);
      String string0 = parameterizedType0.toString();
      assertEquals("NoResolvedType.<NoResolvedType>", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      boolean boolean0 = templateType0.isInterface();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      jSTypeRegistry0.resolveTypesInScope(templateType0);
      assertFalse(templateType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, errorFunctionType0);
      proxyObjectType0.matchesObjectContext();
      assertTrue(proxyObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, noType0, noType0);
      JSType.TypePair jSType_TypePair0 = parameterizedType0.getTypesUnderInequality(noType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, (String) null);
      EnumType enumType0 = templateType0.toMaybeEnumType();
      assertNull(enumType0);
  }
}
