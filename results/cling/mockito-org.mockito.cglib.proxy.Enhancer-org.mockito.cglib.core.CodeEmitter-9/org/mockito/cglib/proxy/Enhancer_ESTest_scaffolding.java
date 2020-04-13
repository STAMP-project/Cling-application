/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 14:20:28 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Enhancer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.cglib.proxy.Enhancer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Enhancer_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.cglib.core.Customizer",
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.proxy.Callback",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.ClassNameReader$1",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.core.ObjectSwitchCallback",
      "org.mockito.cglib.core.NamingPolicy",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.cglib.core.GeneratorStrategy",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.Local",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.mockito.asm.ByteVector",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.cglib.core.ClassNameReader$EarlyExitException",
      "org.mockito.cglib.core.MethodWrapper",
      "org.mockito.cglib.core.DuplicatesPredicate",
      "org.mockito.cglib.core.DebuggingClassWriter$1",
      "org.mockito.cglib.proxy.CallbackGenerator$Context",
      "org.mockito.asm.Item",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.core.Transformer",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.cglib.core.MethodWrapper$MethodWrapperKey",
      "org.mockito.cglib.core.ProcessSwitchCallback",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.asm.FieldWriter",
      "org.mockito.cglib.core.EmitUtils$ParameterTyper",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.asm.ClassReader",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.ClassEmitter$3",
      "org.mockito.cglib.proxy.Enhancer",
      "org.mockito.cglib.core.ProcessArrayCallback",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Opcodes",
      "org.mockito.asm.Edge",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.RejectModifierPredicate",
      "org.mockito.cglib.core.Signature",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.cglib.core.VisibilityPredicate",
      "org.mockito.cglib.proxy.CallbackFilter",
      "org.mockito.asm.Attribute",
      "org.mockito.cglib.core.EmitUtils$8",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.cglib.core.EmitUtils$9",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.core.Predicate",
      "org.mockito.cglib.core.EmitUtils$7",
      "org.mockito.cglib.proxy.Factory",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.cglib.proxy.Enhancer$EnhancerKey",
      "org.mockito.asm.ClassVisitor",
      "org.mockito.cglib.proxy.Enhancer$1",
      "org.mockito.cglib.core.CodeGenerationException",
      "org.mockito.cglib.proxy.Enhancer$2",
      "org.mockito.cglib.core.CollectionUtils",
      "org.mockito.asm.MethodVisitor",
      "org.mockito.asm.Frame",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.mockito.cglib.core.ClassGenerator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.mockito.asm.ClassVisitor", false, Enhancer_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Enhancer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.asm.Frame",
      "org.mockito.asm.Edge",
      "org.mockito.asm.ClassReader",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.proxy.Enhancer",
      "org.mockito.cglib.proxy.NoOpGenerator",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator",
      "org.mockito.cglib.proxy.InvocationHandlerGenerator",
      "org.mockito.cglib.proxy.LazyLoaderGenerator",
      "org.mockito.cglib.proxy.DispatcherGenerator",
      "org.mockito.cglib.proxy.FixedValueGenerator",
      "org.mockito.cglib.proxy.CallbackInfo",
      "org.mockito.cglib.core.MethodWrapper",
      "org.mockito.cglib.core.MethodInfoTransformer",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.internal.MockHandler",
      "org.mockito.internal.invocation.MatchersBinder",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.internal.verification.RegisteredInvocations",
      "org.mockito.internal.creation.MethodInterceptorFilter",
      "org.mockito.internal.creation.cglib.CGLIBHacker",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.internal.creation.DelegatingMethod",
      "org.mockito.internal.util.MockName",
      "org.mockito.internal.creation.SerializableMockitoMethodProxy",
      "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod",
      "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"
    );
  }
}
