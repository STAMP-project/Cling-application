/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:34:01 GMT 2019
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
      double[][] doubleArray0 = new double[11][1];
      double[] doubleArray1 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray1, doubleArray1);
      dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray1, 0.0);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[16][1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      double[] doubleArray1 = new double[1];
      double double0 = dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray1, 732.9369293220012);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[16][1];
      double[] doubleArray1 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray1, doubleArray1);
      double double0 = dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray1, 1346.229363707);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-745.656963667), (-745.656963667), 2.675424484351598, (-745.656963667));
      String string0 = dormandPrince853Integrator0.getName();
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", string0);
  }
}
