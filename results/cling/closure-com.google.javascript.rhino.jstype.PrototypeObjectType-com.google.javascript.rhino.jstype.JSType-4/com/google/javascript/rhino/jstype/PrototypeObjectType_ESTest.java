/*

 * Tue Mar 03 18:44:13 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnknownType;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PrototypeObjectType_ESTest extends PrototypeObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "", (ObjectType) null);
      JSDocInfo jSDocInfo0 = mock(JSDocInfo.class, new ViolatedAssumptionAnswer());
      prototypeObjectType0.setPropertyJSDocInfo("Unknown class name", jSDocInfo0);
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = prototypeObjectType0.defineProperty("Unknown class name", (JSType) null, false, node0);
      assertTrue(prototypeObjectType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      assertNull(templateType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      Node node0 = Node.newNumber((double) 0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) allType0, node0);
      JSType.toMaybeTemplateType((JSType) functionType0);
      assertFalse(functionType0.isResolved());
      assertFalse(functionType0.isNoType());
      assertFalse(functionType0.isNoObjectType());
      assertTrue(functionType0.isFunctionType());
      assertFalse(functionType0.isNoResolvedType());
      assertFalse(functionType0.isAllType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) allType0, (List<JSType>) linkedList0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      boolean boolean0 = functionType0.isSubtype(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParameterizedType parameterizedType0 = JSType.toMaybeParameterizedType((JSType) null);
      assertNull(parameterizedType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSType.toMaybeParameterizedType((JSType) unknownType0);
      assertFalse(unknownType0.isNoResolvedType());
      assertFalse(unknownType0.isAllType());
      assertFalse(unknownType0.isResolved());
      assertFalse(unknownType0.isNoType());
      assertFalse(unknownType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noObjectType0, false);
      boolean boolean0 = instanceObjectType0.isNumber();
      assertTrue(noObjectType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      jSTypeRegistry0.createDefaultObjectUnion(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
      assertFalse(noObjectType0.isNoResolvedType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "3O;8-_%@xT");
      int int0 = errorFunctionType0.getPropertiesCount();
      assertEquals(0, int0);
      assertFalse(errorFunctionType0.isNoObjectType());
      assertFalse(errorFunctionType0.isNoType());
      assertTrue(errorFunctionType0.isFunctionType());
      assertFalse(errorFunctionType0.isAllType());
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.isNoResolvedType());
      assertFalse(errorFunctionType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("Named type with empty name component", (Node) null);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0);
      boolean boolean0 = instanceObjectType0.isSubtype(functionType0);
      assertTrue(instanceObjectType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionType functionType0 = JSType.toMaybeFunctionType((JSType) null);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(true);
      assertEquals("{}", string0);
      assertFalse(recordType0.isNoResolvedType());
      assertNotNull(string0);
      assertFalse(recordType0.isResolved());
      assertFalse(recordType0.isNoType());
      assertFalse(recordType0.isNoObjectType());
      assertFalse(recordType0.isAllType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("toString", (Node) null);
      ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, (Node) null, functionType0);
      boolean boolean0 = functionType0.defineProperty("A-~>]vwQVlC2W<qz", arrowType0, false, (Node) null);
      assertTrue(boolean0);
      
      boolean boolean1 = functionType0.hasProperty("A-~>]vwQVlC2W<qz");
      assertFalse(functionType0.isNoType());
      assertFalse(functionType0.isAllType());
      assertTrue(functionType0.isFunctionType());
      assertFalse(functionType0.isNoResolvedType());
      assertFalse(functionType0.isNominalConstructor());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0, true);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry1, true);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Ch!h@%eptB[lHP}-S", unknownType0, true);
      PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry1, "Not declared as a type name", prototypeObjectType0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry1);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      boolean boolean0 = prototypeObjectType1.isSubtype(jSType0);
      assertTrue(prototypeObjectType1.hasCachedValues());
      assertTrue(boolean0);
  }
}
