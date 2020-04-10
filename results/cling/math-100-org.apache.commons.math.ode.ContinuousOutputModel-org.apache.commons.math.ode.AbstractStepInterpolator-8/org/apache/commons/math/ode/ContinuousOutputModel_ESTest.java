/*

 * Tue Mar 03 15:35:52 GMT 2020
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
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.setInterpolatedTime((-2559.65513146611));
      assertEquals((-2559.65513146611), continuousOutputModel1.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.handleStep(dummyStepInterpolator0, true);
      assertEquals(Double.NaN, continuousOutputModel1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getFinalTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, continuousOutputModel1.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[9];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
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
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.previousTime = (-983.883300245);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.setInterpolatedTime(622.86467);
      assertEquals((-983.883300245), continuousOutputModel0.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      dummyStepInterpolator0.currentTime = (-177.3579779325295);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
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
  public void test06()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      assertFalse(dummyStepInterpolator0.isForward());
      
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.append(continuousOutputModel1);
      assertEquals(Double.NaN, continuousOutputModel1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getInitialTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel1.getFinalTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel0.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      dummyStepInterpolator0.previousTime = 0.1;
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(0.0);
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
  public void test09()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      dummyStepInterpolator1.currentTime = (-814.46858);
      continuousOutputModel0.handleStep(dummyStepInterpolator1, false);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.setInterpolatedTime((-2559.65513146611));
      assertEquals((-814.46858), continuousOutputModel1.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[9];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      continuousOutputModel1.handleStep(dummyStepInterpolator0, true);
      dummyStepInterpolator0.storeTime(0.0);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.setInterpolatedTime((-848.8048074));
      continuousOutputModel1.append(continuousOutputModel0);
      assertEquals(0.0, continuousOutputModel1.getFinalTime(), 0.01);
  }
}
