/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:42:23 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HighamHall54Integrator_ESTest extends HighamHall54Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.78125, 0.78125, 0.0, 0.0);
      double[][] doubleArray0 = new double[7][3];
      double[] doubleArray1 = new double[2];
      double double0 = highamHall54Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray0[2], 0.78125);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2923.74067743773), 0.0, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[7][3];
      // Undeclared exception!
      try { 
        highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray1[0], 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.ode.HighamHall54Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 2.9475147891527724, 0.0);
      String string0 = highamHall54Integrator0.getName();
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals("Higham-Hall 5(4)", string0);
  }
}
