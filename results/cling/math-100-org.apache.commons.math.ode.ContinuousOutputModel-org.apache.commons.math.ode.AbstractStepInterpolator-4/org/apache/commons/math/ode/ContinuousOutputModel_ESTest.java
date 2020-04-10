/*

 * Tue Mar 03 15:35:08 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ConcurrentModificationException;
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
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel1.handleStep(dummyStepInterpolator0, false);
      assertTrue(dummyStepInterpolator0.isForward());
      
      continuousOutputModel0.append(continuousOutputModel1);
      assertEquals(Double.NaN, continuousOutputModel1.getInitialTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel0.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[8];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertEquals(Double.NaN, continuousOutputModel0.getInterpolatedTime(), 0.01);
      
      continuousOutputModel0.setInterpolatedTime(1564.6452534692);
      assertEquals(1564.6452534692, continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel1.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, continuousOutputModel0.getFinalTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel0.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[8];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.append(continuousOutputModel0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
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
        continuousOutputModel0.setInterpolatedTime((-2488.8453));
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
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = mock(DummyStepInterpolator.class, new ViolatedAssumptionAnswer());
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      continuousOutputModel0.handleStep(dummyStepInterpolator1, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(29.8402934266605);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2916);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0, 2916);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime((-25.69393346270375));
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
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      dummyStepInterpolator0.previousTime = 1053.4571;
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime((-169.216958654));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[3];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      dummyStepInterpolator0.storeTime((-805.55406082386));
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.append(continuousOutputModel0);
      assertEquals((-805.55406082386), continuousOutputModel0.getFinalTime(), 0.01);
      
      continuousOutputModel1.setInterpolatedTime(0.001);
      assertEquals(0.001, continuousOutputModel1.getInterpolatedTime(), 0.01);
  }
}
