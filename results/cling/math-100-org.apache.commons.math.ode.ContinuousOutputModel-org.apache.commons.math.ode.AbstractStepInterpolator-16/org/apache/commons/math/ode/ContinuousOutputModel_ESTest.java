/*

 * Tue Mar 03 15:36:32 GMT 2020
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
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      continuousOutputModel0.setInterpolatedTime(1.0);
      assertEquals(1.0, continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      assertTrue(dummyStepInterpolator0.isForward());
      
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      assertEquals(Double.NaN, continuousOutputModel1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getInitialTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.previousTime = (-9.15095847217987);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.setInterpolatedTime(1.0);
      assertEquals((-9.15095847217987), continuousOutputModel0.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      dummyStepInterpolator0.currentTime = (-1122.3610572);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(700.1816);
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
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
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
  public void test07()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      dummyStepInterpolator0.previousTime = 93.4053241836243;
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(0.001);
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
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(700.1816);
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
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.storeTime(1.0);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.setInterpolatedTime((-3228.21));
      assertEquals((-3228.21), continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.storeTime(1.0);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.setInterpolatedTime((-3228.21));
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
