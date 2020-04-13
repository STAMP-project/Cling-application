/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 15:43:11 GMT 2020
 */

package org.apache.commons.math.stat.inference;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TTestImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.stat.inference.TTestImpl"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TTestImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl",
      "org.apache.commons.math.stat.inference.TTestImpl",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.stat.descriptive.moment.Kurtosis",
      "org.apache.commons.math.stat.descriptive.moment.ThirdMoment",
      "org.apache.commons.math.distribution.ContinuousDistribution",
      "org.apache.commons.math.stat.descriptive.SummaryStatistics",
      "org.apache.commons.math.stat.descriptive.moment.GeometricMean",
      "org.apache.commons.math.stat.descriptive.summary.SumOfSquares",
      "org.apache.commons.math.util.DoubleArray",
      "org.apache.commons.math.stat.descriptive.moment.SecondMoment",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.stat.descriptive.UnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
      "org.apache.commons.math.stat.StatUtils",
      "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics",
      "org.apache.commons.math.stat.descriptive.StatisticalSummary",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.util.ResizableDoubleArray",
      "org.apache.commons.math.special.Gamma$1",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.stat.descriptive.moment.Skewness",
      "org.apache.commons.math.stat.inference.TTest",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.distribution.Distribution",
      "org.apache.commons.math.stat.descriptive.summary.Product",
      "org.apache.commons.math.stat.descriptive.moment.Mean",
      "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues",
      "org.apache.commons.math.distribution.DistributionFactory",
      "org.apache.commons.math.stat.descriptive.moment.Variance",
      "org.apache.commons.math.distribution.TDistribution",
      "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
      "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl",
      "org.apache.commons.math.stat.descriptive.summary.Sum",
      "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.rank.Min",
      "org.apache.commons.math.stat.descriptive.DescriptiveStatistics",
      "org.apache.commons.math.stat.descriptive.moment.FourthMoment",
      "org.apache.commons.math.distribution.TDistributionImpl",
      "org.apache.commons.math.stat.descriptive.rank.Percentile",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.stat.descriptive.rank.Max",
      "org.apache.commons.math.stat.descriptive.summary.SumOfLogs",
      "org.apache.commons.math.distribution.AbstractDistribution"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TTestImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.summary.Sum",
      "org.apache.commons.math.stat.descriptive.summary.SumOfSquares",
      "org.apache.commons.math.stat.descriptive.summary.Product",
      "org.apache.commons.math.stat.descriptive.summary.SumOfLogs",
      "org.apache.commons.math.stat.descriptive.rank.Min",
      "org.apache.commons.math.stat.descriptive.rank.Max",
      "org.apache.commons.math.stat.descriptive.moment.Mean",
      "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
      "org.apache.commons.math.stat.descriptive.moment.Variance",
      "org.apache.commons.math.stat.descriptive.moment.SecondMoment",
      "org.apache.commons.math.stat.descriptive.rank.Percentile",
      "org.apache.commons.math.stat.descriptive.moment.GeometricMean",
      "org.apache.commons.math.stat.StatUtils",
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.distribution.TDistributionImpl",
      "org.apache.commons.math.stat.descriptive.DescriptiveStatistics",
      "org.apache.commons.math.util.ResizableDoubleArray",
      "org.apache.commons.math.stat.descriptive.moment.Kurtosis",
      "org.apache.commons.math.stat.descriptive.moment.ThirdMoment",
      "org.apache.commons.math.stat.descriptive.moment.FourthMoment",
      "org.apache.commons.math.stat.descriptive.moment.Skewness",
      "org.apache.commons.math.stat.descriptive.SummaryStatistics",
      "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics",
      "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues",
      "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics",
      "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl",
      "org.apache.commons.math.stat.descriptive.moment.StandardDeviation",
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.analysis.BrentSolver",
      "org.apache.commons.math.stat.descriptive.rank.Median"
    );
  }
}
