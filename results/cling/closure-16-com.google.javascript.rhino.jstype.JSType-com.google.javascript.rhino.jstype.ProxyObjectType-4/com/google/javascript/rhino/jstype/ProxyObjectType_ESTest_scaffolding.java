/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 18:38:31 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ProxyObjectType_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.rhino.jstype.ProxyObjectType"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/botsing-integration-experiment"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ProxyObjectType_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.collect.BiMap",
      "com.google.common.base.Function",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.collect.Multimap",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.common.collect.Maps",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.common.base.Preconditions",
      "com.google.javascript.rhino.JSDocInfo"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry", false, ProxyObjectType_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ProxyObjectType_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "com.google.common.primitives.Ints",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.common.collect.ImmutableEntry"
    );
  }
}
