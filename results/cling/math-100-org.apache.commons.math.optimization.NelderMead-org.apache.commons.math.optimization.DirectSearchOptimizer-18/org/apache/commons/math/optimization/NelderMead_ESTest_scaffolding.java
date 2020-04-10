/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 15:04:11 GMT 2020
 */

package org.apache.commons.math.optimization;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class NelderMead_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.optimization.NelderMead"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NelderMead_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.optimization.ConvergenceChecker",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.stat.descriptive.UnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
      "org.apache.commons.math.optimization.DirectSearchOptimizer",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.random.RandomGenerator",
      "org.apache.commons.math.stat.descriptive.moment.VectorialMean",
      "org.apache.commons.math.stat.descriptive.moment.Mean",
      "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance",
      "org.apache.commons.math.optimization.CostException",
      "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.random.RandomVectorGenerator",
      "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
      "org.apache.commons.math.random.NormalizedRandomGenerator",
      "org.apache.commons.math.random.NotPositiveDefiniteMatrixException",
      "org.apache.commons.math.optimization.NelderMead",
      "org.apache.commons.math.optimization.PointCostPair",
      "org.apache.commons.math.optimization.DirectSearchOptimizer$1",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.random.CorrelatedRandomVectorGenerator",
      "org.apache.commons.math.random.UniformRandomGenerator",
      "org.apache.commons.math.optimization.CostFunction",
      "org.apache.commons.math.DimensionMismatchException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math.optimization.ConvergenceChecker", false, NelderMead_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.math.optimization.CostFunction", false, NelderMead_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NelderMead_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.DirectSearchOptimizer",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.random.UniformRandomGenerator",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.stat.descriptive.moment.VectorialMean",
      "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.moment.Mean",
      "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
      "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance",
      "org.apache.commons.math.DimensionMismatchException",
      "org.apache.commons.math.random.RandomAdaptor",
      "org.apache.commons.math.random.NotPositiveDefiniteMatrixException",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.InvalidMatrixException"
    );
  }
}
