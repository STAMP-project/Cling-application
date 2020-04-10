/*

 * Tue Mar 03 15:34:35 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      assertEquals(Double.NaN, continuousOutputModel0.getInitialTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel0.getFinalTime(), 0.01);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[8];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertEquals(Double.NaN, continuousOutputModel0.getInterpolatedTime(), 0.01);
      
      continuousOutputModel0.setInterpolatedTime(3650.02616);
      assertEquals(3650.02616, continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertTrue(dummyStepInterpolator0.isForward());
      
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      assertEquals(Double.NaN, continuousOutputModel1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getFinalTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
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
  public void test4()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = mock(DummyStepInterpolator.class, new ViolatedAssumptionAnswer());
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      continuousOutputModel0.handleStep(dummyStepInterpolator1, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(0.7777137798053443);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[8];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      dummyStepInterpolator0.currentTime = (-2355.86049);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertEquals((-2355.86049), dummyStepInterpolator0.getCurrentTime(), 0.01);
      
      continuousOutputModel0.setInterpolatedTime(3650.02616);
      assertEquals(Double.NaN, continuousOutputModel0.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      dummyStepInterpolator1.previousTime = (-22.0);
      continuousOutputModel0.handleStep(dummyStepInterpolator1, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime((-1798.217326239));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[8];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.setInterpolatedTime(3650.02616);
      assertEquals(3650.02616, continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[8];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.storeTime(851.43725661);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel0.setInterpolatedTime(0.0);
      assertEquals(851.43725661, continuousOutputModel0.getFinalTime(), 0.01);
  }
}
