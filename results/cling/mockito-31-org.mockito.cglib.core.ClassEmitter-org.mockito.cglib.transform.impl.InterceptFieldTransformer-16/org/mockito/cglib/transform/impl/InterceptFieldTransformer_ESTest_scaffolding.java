/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 14:14:39 GMT 2020
 */

package org.mockito.cglib.transform.impl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class InterceptFieldTransformer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.cglib.transform.impl.InterceptFieldTransformer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(InterceptFieldTransformer_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.cglib.core.Block",
      "org.mockito.cglib.transform.ClassEmitterTransformer",
      "org.mockito.cglib.core.Constants",
      "org.mockito.asm.ClassReader",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.ClassEmitter$2",
      "org.mockito.cglib.core.ClassEmitter$3",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Opcodes",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.cglib.core.Signature",
      "org.mockito.asm.Attribute",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.transform.impl.InterceptFieldTransformer",
      "org.mockito.cglib.core.Local",
      "org.mockito.cglib.transform.impl.InterceptFieldTransformer$1",
      "org.mockito.asm.ByteVector",
      "org.mockito.cglib.transform.ClassTransformer",
      "org.mockito.asm.Item",
      "org.mockito.asm.ClassVisitor",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.cglib.core.CodeGenerationException",
      "org.mockito.asm.MethodVisitor",
      "org.mockito.cglib.core.CollectionUtils",
      "org.mockito.asm.Frame",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.ProcessSwitchCallback"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(InterceptFieldTransformer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.asm.Type",
      "org.mockito.cglib.transform.impl.InterceptFieldTransformer",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.cglib.core.Constants",
      "org.mockito.asm.ClassReader",
      "org.mockito.asm.ClassWriter",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Label",
      "org.mockito.asm.Frame"
    );
  }
}
