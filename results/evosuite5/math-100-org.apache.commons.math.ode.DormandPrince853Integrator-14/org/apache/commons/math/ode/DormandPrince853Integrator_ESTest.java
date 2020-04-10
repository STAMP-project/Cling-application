/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:22:09 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.ode.DormandPrince853Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DormandPrince853Integrator_ESTest extends DormandPrince853Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[16][3];
      double[] doubleArray1 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(941.48, 941.48, doubleArray0[1], doubleArray1);
      double double0 = dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray1, (-0.4831900357003607));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      double[][] doubleArray0 = new double[19][4];
      double[] doubleArray1 = new double[2];
      dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray1, (-31.349878835776));
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      double[][] doubleArray0 = new double[19][4];
      double[] doubleArray1 = new double[0];
      double[] doubleArray2 = new double[2];
      dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray2, 0.0);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-0.35032884874997366), (-0.322376179245283), 0.0, (-1828.934));
      String string0 = dormandPrince853Integrator0.getName();
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", string0);
  }
}
