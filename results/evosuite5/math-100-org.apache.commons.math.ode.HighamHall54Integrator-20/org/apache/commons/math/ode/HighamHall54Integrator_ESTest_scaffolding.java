/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 13 14:30:38 GMT 2019
 */

package org.apache.commons.math.ode;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class HighamHall54Integrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.ode.HighamHall54Integrator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HighamHall54Integrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.ode.HighamHall54StepInterpolator",
      "org.apache.commons.math.ode.DerivativeException",
      "org.apache.commons.math.ode.SwitchingFunctionsHandler",
      "org.apache.commons.math.ode.FirstOrderIntegrator",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math.ode.ContinuousOutputModel",
      "org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.StepNormalizer",
      "org.apache.commons.math.ode.FirstOrderConverter",
      "org.apache.commons.math.ode.SwitchState",
      "org.apache.commons.math.ode.AbstractStepInterpolator",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.ode.DummyStepInterpolator",
      "org.apache.commons.math.analysis.UnivariateRealSolver",
      "org.apache.commons.math.ode.StepHandler",
      "org.apache.commons.math.ode.DummyStepHandler",
      "org.apache.commons.math.ode.RungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.StepInterpolator",
      "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math.ode.IntegratorException",
      "org.apache.commons.math.ode.FirstOrderDifferentialEquations",
      "org.apache.commons.math.ode.SwitchingFunction",
      "org.apache.commons.math.ode.HighamHall54Integrator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HighamHall54Integrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math.ode.HighamHall54Integrator",
      "org.apache.commons.math.ode.AbstractStepInterpolator",
      "org.apache.commons.math.ode.RungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.HighamHall54StepInterpolator",
      "org.apache.commons.math.ode.DummyStepHandler",
      "org.apache.commons.math.ode.SwitchingFunctionsHandler",
      "org.apache.commons.math.ode.SwitchState",
      "org.apache.commons.math.ode.StepNormalizer",
      "org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.ContinuousOutputModel",
      "org.apache.commons.math.ode.FirstOrderConverter",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ode.IntegratorException"
    );
  }
}
