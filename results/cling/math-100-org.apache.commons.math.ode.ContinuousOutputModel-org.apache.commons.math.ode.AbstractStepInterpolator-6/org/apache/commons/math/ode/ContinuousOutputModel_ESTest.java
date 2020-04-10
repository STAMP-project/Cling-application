/*

 * Tue Mar 03 15:37:31 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ContinuousOutputModel_ESTest extends ContinuousOutputModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertEquals(Double.NaN, continuousOutputModel0.getInterpolatedTime(), 0.01);
      
      continuousOutputModel0.setInterpolatedTime(0.0);
      assertEquals(0.0, continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      assertTrue(dummyStepInterpolator0.isForward());
      
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      assertEquals(Double.NaN, continuousOutputModel1.getInitialTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getFinalTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.append(continuousOutputModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = mock(DummyStepInterpolator.class, new ViolatedAssumptionAnswer());
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      continuousOutputModel0.handleStep(dummyStepInterpolator1, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(318.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      PipedInputStream pipedInputStream0 = new PipedInputStream(2146305640);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(pipedOutputStream0);
      dummyStepInterpolator0.writeBaseExternal(objectOutputStream0);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      dummyStepInterpolator0.storeTime((-1.4697087307900192));
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.setInterpolatedTime(934.043);
      assertEquals((-1.4697087307900192), continuousOutputModel0.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      dummyStepInterpolator0.previousTime = 1757.571985440156;
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.setInterpolatedTime(934.043);
      assertEquals(1757.571985440156, continuousOutputModel0.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      assertEquals(Double.NaN, continuousOutputModel0.getInterpolatedTime(), 0.01);
      
      continuousOutputModel0.setInterpolatedTime(934.043);
      assertEquals(934.043, continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.currentTime = 2373.59072098;
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.setInterpolatedTime(1345.1166);
      assertEquals(2373.59072098, continuousOutputModel1.getFinalTime(), 0.01);
  }
}
