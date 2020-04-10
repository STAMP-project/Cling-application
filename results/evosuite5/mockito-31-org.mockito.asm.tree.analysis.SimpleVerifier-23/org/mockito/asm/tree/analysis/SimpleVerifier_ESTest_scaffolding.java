/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Aug 17 08:02:20 GMT 2019
 */

package org.mockito.asm.tree.analysis;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SimpleVerifier_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.asm.tree.analysis.SimpleVerifier"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimpleVerifier_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.asm.tree.LineNumberNode",
      "org.mockito.asm.tree.LdcInsnNode",
      "org.mockito.asm.tree.analysis.AnalyzerException",
      "org.mockito.asm.ClassReader",
      "org.mockito.asm.tree.analysis.SimpleVerifier",
      "org.mockito.asm.Type",
      "org.mockito.asm.tree.IntInsnNode",
      "org.mockito.asm.tree.VarInsnNode",
      "org.mockito.asm.tree.FrameNode",
      "org.mockito.asm.tree.analysis.BasicInterpreter",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.tree.analysis.BasicValue",
      "org.mockito.asm.tree.InsnNode",
      "org.mockito.asm.tree.analysis.Interpreter",
      "org.mockito.asm.Opcodes",
      "org.mockito.asm.tree.LabelNode",
      "org.mockito.asm.tree.AbstractInsnNode",
      "org.mockito.asm.tree.FieldInsnNode",
      "org.mockito.asm.Edge",
      "org.mockito.asm.Label",
      "org.mockito.asm.tree.analysis.SourceValue",
      "org.mockito.asm.Attribute",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.asm.tree.MultiANewArrayInsnNode",
      "org.mockito.asm.tree.IincInsnNode",
      "org.mockito.asm.ByteVector",
      "org.mockito.asm.tree.analysis.Value",
      "org.mockito.asm.Item",
      "org.mockito.asm.tree.analysis.BasicVerifier",
      "org.mockito.asm.ClassVisitor",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.asm.MethodVisitor",
      "org.mockito.asm.Frame",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.asm.tree.TableSwitchInsnNode",
      "org.mockito.asm.tree.JumpInsnNode",
      "org.mockito.asm.tree.LookupSwitchInsnNode",
      "org.mockito.asm.ClassWriter",
      "org.mockito.asm.tree.analysis.SmallSet",
      "org.mockito.asm.tree.MethodInsnNode",
      "org.mockito.asm.tree.TypeInsnNode"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimpleVerifier_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.asm.tree.analysis.BasicInterpreter",
      "org.mockito.asm.tree.analysis.BasicVerifier",
      "org.mockito.asm.tree.analysis.SimpleVerifier",
      "org.mockito.asm.Opcodes",
      "org.mockito.asm.Type",
      "org.mockito.asm.tree.analysis.BasicValue",
      "org.mockito.asm.tree.AbstractInsnNode",
      "org.mockito.asm.tree.VarInsnNode",
      "org.mockito.asm.tree.IntInsnNode",
      "org.mockito.asm.tree.analysis.SourceValue",
      "org.mockito.asm.tree.MultiANewArrayInsnNode",
      "org.mockito.asm.tree.analysis.SmallSet",
      "org.mockito.asm.tree.IincInsnNode",
      "org.mockito.asm.tree.MethodInsnNode",
      "org.mockito.asm.tree.analysis.AnalyzerException",
      "org.mockito.asm.tree.InsnNode",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.asm.Label",
      "org.mockito.asm.tree.LabelNode",
      "org.mockito.asm.tree.TableSwitchInsnNode",
      "org.mockito.asm.tree.FieldInsnNode",
      "org.mockito.asm.tree.LineNumberNode",
      "org.mockito.asm.tree.FrameNode",
      "org.mockito.asm.tree.TypeInsnNode",
      "org.mockito.asm.tree.JumpInsnNode",
      "org.mockito.asm.tree.LookupSwitchInsnNode",
      "org.mockito.asm.tree.LdcInsnNode",
      "org.mockito.asm.ClassReader",
      "org.mockito.asm.Attribute",
      "org.mockito.asm.Frame",
      "org.mockito.asm.ByteVector",
      "org.mockito.asm.Edge"
    );
  }
}
