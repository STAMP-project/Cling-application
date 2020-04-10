/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:28:25 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.ode.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HighamHall54Integrator_ESTest extends HighamHall54Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2659.7, 2659.7, 2659.7, 2659.7);
      double[][] doubleArray0 = new double[7][9];
      double double0 = highamHall54Integrator0.estimateError(doubleArray0, doubleArray0[4], doubleArray0[2], 0.0);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-25.69393346270375), (-961.4733879096), doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[7][4];
      double double0 = highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, (-2589.970121624));
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(29.8402934266605, 29.8402934266605, 29.8402934266605, (-0.04432804463693693));
      String string0 = highamHall54Integrator0.getName();
      assertEquals("Higham-Hall 5(4)", string0);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }
}
