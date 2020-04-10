/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Aug 21 16:04:47 GMT 2019
 */

package org.apache.commons.math.random;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EmpiricalDistributionImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.random.EmpiricalDistributionImpl"; 
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
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/rq3/botsing-integration-experiment"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EmpiricalDistributionImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.random.RandomData",
      "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl",
      "org.apache.commons.math.random.EmpiricalDistributionImpl",
      "org.apache.commons.math.random.EmpiricalDistribution",
      "org.apache.commons.math.stat.descriptive.SummaryStatistics",
      "org.apache.commons.math.random.RandomDataImpl",
      "org.apache.commons.math.stat.descriptive.moment.GeometricMean",
      "org.apache.commons.math.stat.descriptive.summary.SumOfSquares",
      "org.apache.commons.math.stat.descriptive.moment.SecondMoment",
      "org.apache.commons.math.stat.descriptive.UnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.StatisticalSummary",
      "org.apache.commons.math.random.RandomGenerator",
      "org.apache.commons.math.stat.descriptive.moment.Mean",
      "org.apache.commons.math.stat.descriptive.moment.Variance",
      "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
      "org.apache.commons.math.stat.descriptive.summary.Sum",
      "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.rank.Min",
      "org.apache.commons.math.stat.descriptive.rank.Max",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$DataAdapterFactory",
      "org.apache.commons.math.stat.descriptive.summary.SumOfLogs",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$StreamDataAdapter",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$ArrayDataAdapter",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$1",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$DataAdapter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EmpiricalDistributionImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.random.EmpiricalDistributionImpl",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$DataAdapter",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$ArrayDataAdapter",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$DataAdapterFactory",
      "org.apache.commons.math.random.EmpiricalDistributionImpl$StreamDataAdapter",
      "org.apache.commons.math.random.RandomDataImpl",
      "org.apache.commons.math.stat.descriptive.SummaryStatistics",
      "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
      "org.apache.commons.math.stat.descriptive.moment.SecondMoment",
      "org.apache.commons.math.stat.descriptive.summary.Sum",
      "org.apache.commons.math.stat.descriptive.summary.SumOfSquares",
      "org.apache.commons.math.stat.descriptive.rank.Min",
      "org.apache.commons.math.stat.descriptive.rank.Max",
      "org.apache.commons.math.stat.descriptive.summary.SumOfLogs",
      "org.apache.commons.math.stat.descriptive.moment.GeometricMean",
      "org.apache.commons.math.stat.descriptive.moment.Mean",
      "org.apache.commons.math.stat.descriptive.moment.Variance",
      "org.apache.commons.math.random.JDKRandomGenerator"
    );
  }
}
