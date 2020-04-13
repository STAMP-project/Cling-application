/*

 * Tue Mar 03 15:35:40 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ConcurrentModificationException;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ContinuousOutputModel_ESTest extends ContinuousOutputModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      double[] doubleArray0 = new double[2];
      dummyStepInterpolator0.reinitialize(doubleArray0, false);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertFalse(dummyStepInterpolator0.isForward());
      
      continuousOutputModel0.setInterpolatedTime(0.0);
      assertEquals(Double.NaN, continuousOutputModel0.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.handleStep(dummyStepInterpolator0, false);
      assertEquals(Double.NaN, continuousOutputModel1.getInitialTime(), 0.01);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, continuousOutputModel1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
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
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.previousTime = (-39.273083227554);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.setInterpolatedTime(0.0);
      assertEquals((-39.273083227554), continuousOutputModel0.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      assertTrue(dummyStepInterpolator0.isForward());
      
      double[] doubleArray0 = new double[2];
      dummyStepInterpolator0.reinitialize(doubleArray0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertFalse(dummyStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      dummyStepInterpolator0.currentTime = 1.0;
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(1306.6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      double[] doubleArray0 = new double[2];
      dummyStepInterpolator0.reinitialize(doubleArray0, false);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertFalse(dummyStepInterpolator0.isForward());
      
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.append(continuousOutputModel1);
      assertEquals(Double.NaN, continuousOutputModel0.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      dummyStepInterpolator0.previousTime = 1502.538433102358;
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime((-1243.8345394167));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(1306.6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      double[] doubleArray0 = new double[2];
      dummyStepInterpolator0.reinitialize(doubleArray0, false);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      dummyStepInterpolator0.storeTime(15.697238121770845);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertEquals(15.697238121770845, dummyStepInterpolator0.getCurrentTime(), 0.01);
      
      continuousOutputModel0.setInterpolatedTime(0.0);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      assertEquals(0.0, continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      double[] doubleArray0 = new double[2];
      dummyStepInterpolator0.reinitialize(doubleArray0, false);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      dummyStepInterpolator0.storeTime(15.697238121770845);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.setInterpolatedTime(0.0);
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
}
