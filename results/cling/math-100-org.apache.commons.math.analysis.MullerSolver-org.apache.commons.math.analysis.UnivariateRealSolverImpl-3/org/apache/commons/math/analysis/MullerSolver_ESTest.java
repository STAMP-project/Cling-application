/*

 * Tue Mar 03 14:53:13 GMT 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.MullerSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MullerSolver_ESTest extends MullerSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2127.0755824501657), (-2218.0), (-2218.0), (-2127.0755824501657), 647.2741480347656).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2218.0), (-2127.0755824501657));
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = mullerSolver0.getResult();
      assertEquals((-2217.9999989336457), double0, 0.01);
      
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve((-4.9E-324), (-2218.0));
      assertEquals((-4.9E-324), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver1.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2930.342823415774), (-1922.4));
      // Undeclared exception!
      try { 
        mullerSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(Double.POSITIVE_INFINITY, (-2218.0));
      // Undeclared exception!
      try { 
        mullerSolver0.getIterationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(3925.757079506933, (-2125.428008709975));
      MullerSolver mullerSolver1 = null;
      try {
        mullerSolver1 = new MullerSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function can not be null.
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-765.21467);
      doubleArray0[2] = (-765.21467);
      doubleArray0[3] = (-765.21467);
      doubleArray0[4] = (-765.21467);
      doubleArray0[5] = (-765.21467);
      doubleArray0[6] = (-765.21467);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-2.0), (-0.6703320476030968));
      double double1 = mullerSolver0.solve2(2.7682987183652583E-5, (-0.6703320476030968));
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(double1, double0, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-0.6703320476030968), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[1] = (-2125.428008709975);
      doubleArray0[2] = (-2125.428008709975);
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1.0), 0.23982658460610679);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(325.784329574767, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [325.784329574767,2.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve(Double.POSITIVE_INFINITY, (-2218.0));
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence(2248.5093058, Double.POSITIVE_INFINITY, (-619.5176207397));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=2248.5093058 initial=Infinity upper=-619.5176207397
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-765.21467), (-765.21467), (-765.21467), 2812.88, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(433.93173218661, 2812.88);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(433.93173218661, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [433.93173218661,Infinity]  Values: [-3.7995789362644765E-140,-3.7995789362644765E-140]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (-778.8019812942468);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-778.8019812942468), 2.706720607193347E-4, 1.0E-6);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-778.8019812942468), 2452.97765365, (-778.8019812942468));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-778.8019812942468 initial=-778.8019812942468 upper=2452.97765365
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-765.21467), (-765.21467), (-765.21467), 2812.88, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2812.88;
      doubleArray0[1] = (-765.21467);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver1.solve2((-3.7995789362644765E-140), 0.95);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-765.21467), 2812.88, (-3.7995789362644765E-140));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-3.7995789362644765E-140,2812.88]  Values: [-3.7995789362644765E-140,-3.7995789362644765E-140]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-765.21467), (-765.21467), (-765.21467), 2807.2383538505, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-3.7995789362644765E-140), 10.0);
      MullerSolver mullerSolver1 = null;
      try {
        mullerSolver1 = new MullerSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function can not be null.
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1019.8570799), 4.278594795765567, 4.278594795765567, 4.278594795765567, (-1019.8570799)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.absoluteAccuracy = (-1019.8570799);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1019.8570799);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      mullerSolver0.isBracketing((-1019.8570799), (-1019.8570799), polynomialFunction0);
      mullerSolver0.setRelativeAccuracy((-1019.8570799));
      try { 
        mullerSolver0.solve((-1019.8570799), 532.988195050396);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-2034.9771991627022), (-2034.9771991627022), (-2034.9771991627022), (-2034.9771991627022)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-1219.78326), 2.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1219.78326), 0.0, (-1219.78326));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1219.78326,0.0]  Values: [-2034.9771991627022,-2034.9771991627022]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-765.21467), (-765.21467), (-765.21467), 2812.88, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      
      mullerSolver0.solve((-765.21467), 1113.75246);
      double double0 = mullerSolver0.getResult();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-765.21467), (-765.21467), (-765.21467), 2811.841788609975, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(6.283185307179586, 2811.841788609975);
      // Undeclared exception!
      try { 
        mullerSolver1.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-765.21467);
      doubleArray0[2] = (-765.21467);
      doubleArray0[3] = (-765.21467);
      doubleArray0[4] = (-765.21467);
      doubleArray0[5] = (-765.21467);
      doubleArray0[6] = (-765.21467);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve2((-5594.262528483), 1.0E-15);
      assertEquals((-0.6703320476030968), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-2.0), (-0.6703320476030968));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals((-0.6703320476030968), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2125.428008709975), 0.17665515572080037, (-2.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve(325.784329574767, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [325.784329574767,2.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-807.93991291595), (-807.93991291595), (-807.93991291595), 2813.47058321499, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      
      mullerSolver0.setFunctionValueAccuracy((-3.7995789362644765E-140));
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve((-434.04592679003), (-2219.2807327525634));
      try { 
        mullerSolver0.solve2((-3.7995789362644765E-140), 1.776961880750605E-5);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(Double.POSITIVE_INFINITY, (-2218.0));
      double double1 = mullerSolver0.solve2((-2218.0), 647.2741480347656);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(double1, double0, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-2218.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-807.93991291595), (-807.93991291595), (-807.93991291595), 2812.88, (-807.93991291595)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.setFunctionValueAccuracy(2812.88);
      assertEquals(2812.88, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = 2812.88;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve2((-807.93991291595), 4.0);
      double double0 = mullerSolver0.solve((-0.9999999999999817), 2812.88);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(6.283185307179586, 6.283185307179586, 6.283185307179586);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(6.283185307179586, double0, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2127.0755824501657), (-2218.0), (-2218.0)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve(Double.POSITIVE_INFINITY, (-2218.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-2127.0755824501657), (-2218.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-2127.0755824501657,-2218.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2127.0755824501657), (-2218.0), (-2218.0), (-2127.0755824501657), 647.2741480347656).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-2218.0), (-2127.0755824501657));
      assertEquals((-2217.9999989336457), double0, 0.01);
      
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      mullerSolver0.getResult();
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve(Double.POSITIVE_INFINITY, (-2218.0));
      assertEquals((-2218.0), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(Double.POSITIVE_INFINITY, (-1.8538370131546455E-57));
      // Undeclared exception!
      try { 
        mullerSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(Double.POSITIVE_INFINITY, (-1.8538370131546455E-57));
      MullerSolver mullerSolver1 = null;
      try {
        mullerSolver1 = new MullerSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function can not be null.
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[1] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-99.1), 3099.6045997576, 49.47260924621288);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(1205.0, (-1.0000000000000007));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1205.0,-1.0000000000000007]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[1] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2125.428008709975), 0.17665515572080037, (-2.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve(325.784329574767, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [325.784329574767,2.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2127.0755824501657), (-2218.0), (-2218.0), (-2127.0755824501657), 644.8314025186075).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2218.0), (-2127.0755824501657));
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve(Double.POSITIVE_INFINITY, (-2218.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-2218.0), Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2218.0,Infinity]  Values: [644.8314025186075,644.8314025186075]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[1] = (-2125.428008709975);
      doubleArray0[2] = (-2125.428008709975);
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1702.469), (-1.0));
      double double1 = mullerSolver0.solve((-1.0), 0.23982658460610679);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(double1, double0, 0.01);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1019.8570799), 4.278594795765567, 4.278594795765567, 4.278594795765567, (-1019.8570799)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.absoluteAccuracy = (-1019.8570799);
      mullerSolver0.solve((-1019.8570799), 4.278594795765567);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-1019.8570799), 4.278594795765567);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1019.8570799,4.278594795765567]  Values: [-1019.8570799,-1019.8570799]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[3] = (-1937.8028457137343);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-99.1), 3099.6045997576, (-1.0));
      assertEquals((-1.0312855596470232), double0, 0.01);
      
      double double1 = mullerSolver0.getResult();
      assertEquals((-1.0312855596470232), double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[3] = (-1937.8028457137343);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-99.1), 3099.6045997576, (-1.0));
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        mullerSolver1.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2125.428008709975), 0.4450936876808, (-2.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1.0000000000022575), 620.09056, (-1363.37268));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1.0000000000022575 initial=-1363.37268 upper=620.09056
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2218.0), (-1389.99787383182));
      // Undeclared exception!
      try { 
        mullerSolver0.getIterationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1019.8570799), 2.0, 2.0, 2.0, (-1019.8570799)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.absoluteAccuracy = (-1413.521131784);
      mullerSolver0.solve((-1019.8570799), 2.0);
      MullerSolver mullerSolver1 = null;
      try {
        mullerSolver1 = new MullerSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function can not be null.
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 2.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-1826.0), 2.0);
      assertEquals((-0.5), double0, 0.01);
      
      mullerSolver0.solve2((-0.5), (-60.70201687));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1019.8570799);
      doubleArray0[2] = (-1019.8570799);
      doubleArray0[5] = (-1019.8570799);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      
      double double0 = mullerSolver0.solve2((-1019.8570799), 3.141592653589793);
      assertEquals((-1.193859111321223), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1019.8570799), 194.0951341, (-1.0));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1.193859111321213), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[1] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2125.428008709975), 0.4450936876808, (-2.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1.0000000000022575), 620.09056, (-1363.37268));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1.0000000000022575 initial=-1363.37268 upper=620.09056
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1019.8570799), 2.0, 2.0, 2.0, (-1019.8570799)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      
      mullerSolver0.absoluteAccuracy = (-1019.8570799);
      mullerSolver0.solve((-1019.8570799), 2.0);
      double double0 = mullerSolver0.getResult();
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2924.2095820477066);
      doubleArray0[6] = (-2924.2095820477066);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-2924.2095820477066), 0.0, (-2067.474245));
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction1);
      // Undeclared exception!
      try { 
        mullerSolver1.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-807.93991291595), (-807.93991291595), (-807.93991291595), 2812.88, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.setFunctionValueAccuracy((-3.7995789362644765E-140));
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve2((-807.93991291595), (-807.93991291595));
      try { 
        mullerSolver0.solve((-1997.5), 0.4727707587523868);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-2218.0), 647.2741480347656);
      assertEquals((-2218.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-4.9E-324), (-2218.0));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-4.9E-324), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2125.428008709975), (-2218.0), (-2218.0), (-2125.428008709975), 646.1).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-2218.0), 1.708348463580478E-6);
      assertEquals((-2217.9999984977117), double0, 0.01);
      
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-2217.9999984977117);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction2);
      double double1 = mullerSolver1.solve2((-2217.9999984977117), 4429.25);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-807.93991291595), (-807.93991291595), (-807.93991291595), 2813.47058321499, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.setFunctionValueAccuracy((-3.7995789362644765E-140));
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = 2813.47058321499;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve2((-807.93991291595), 4.0);
      try { 
        mullerSolver0.solve((-8.609139335097925E-7), 1752.8128702222782);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2127.0755824501657), (-2218.0), (-2218.0), (-2127.0755824501657), 644.8314025186075).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve(Double.POSITIVE_INFINITY, (-2218.0));
      try { 
        mullerSolver0.solve((-2218.0), Double.POSITIVE_INFINITY);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-807.93991291595), (-807.93991291595), (-807.93991291595), 2813.47058321499, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.setFunctionValueAccuracy((-3.7995789362644765E-140));
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-3.7995789362644765E-140);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve2((-807.93991291595), 4.0);
      try { 
        mullerSolver0.solve((-8.609139335097925E-7), 1752.8128702222782);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2127.0755824501657), (-2218.0), (-2218.0), (-2127.0755824501657), 647.2741480347656).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-2218.0), (-2127.0755824501657));
      assertEquals((-2217.9999989336457), double0, 0.01);
      
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve2((-2218.0), 647.2741480347656);
      assertEquals((-2218.0), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[1] = (-2125.428008709975);
      doubleArray0[2] = (-2125.428008709975);
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2125.428008709975), 4754.211218812645);
      assertEquals((-0.9999999999989698), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1.0), 0.23982658460610679);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = 2812.246656595385;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction2);
      try { 
        mullerSolver0.solve((-1852.0226783298301), 1.4786395619361181E22);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(170.3380997, 170.3380997, 170.3380997, 170.3380997, (-1080.8449012)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-1080.8449012);
      doubleArray0[2] = 1.8394732251181267E-5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve((-1.0), 2.051320611826668E-4, 6.930538734195579E-6);
      try { 
        mullerSolver0.solve2(2701.9940559567544, Double.POSITIVE_INFINITY);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1019.8570799), 4.278594795765567, 4.278594795765567, 4.278594795765567, (-1019.8570799)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (-1019.8570799);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction1 = polynomialFunction0.derivative();
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver1.solve((-1019.8570799), 4.278594795765567);
      try { 
        mullerSolver0.solve2((-1019.8570799), 0.0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2924.2095820477066);
      doubleArray0[6] = (-2924.2095820477066);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-2924.2095820477066), 0.0, (-2067.474245));
      assertEquals((-0.6988271187713558), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-2067.474245), 1451.91);
      assertEquals((-0.6988271187715792), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[1] = (-2125.428008709975);
      doubleArray0[2] = (-2125.428008709975);
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2125.428008709975), 0.17665515572080037, (-2.0));
      assertEquals((-1.0), double0, 0.01);
      
      mullerSolver0.solve((-1.0), 0.23982658460610679);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2127.0755824501657), (-2218.0), (-2218.0), (-2127.0755824501657), 644.8314025186075).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve(Double.POSITIVE_INFINITY, (-2218.0));
      try { 
        mullerSolver0.solve2((-2127.0755824501657), 1.0E-15);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-800.2845163022728), (-800.2845163022728), (-800.2845163022728), 2807.2383538505, (-3.7995789362644765E-140)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.setFunctionValueAccuracy((-3.7995789362644765E-140));
      try { 
        mullerSolver0.solve2((-800.2845163022728), 2807.2383538505);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 433.93173218661;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-512.0326703528115), 433.93173218661, 2.765861154330196E-6);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2125.428008709975), (-2125.428008709975), (-2125.428008709975), (-2125.428008709975), 646.1).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-2125.428008709975), 1746.8674, 646.1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [646.1,1746.8674]  Values: [646.1,646.1]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2125.428008709975), (-2218.0), (-2218.0), (-2125.428008709975), 646.1).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2218.0), 1.708348463580478E-6);
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-2217.9999984977117);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      UnivariateRealFunction univariateRealFunction1 = polynomialFunction1.derivative();
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver1.solve((-2218.0), 3925.757079506933);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(1.708348463580478E-6, 3925.757079506933);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1.708348463580478E-6,3925.757079506933]  Values: [646.1,646.1]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[1] = (-2125.428008709975);
      doubleArray0[2] = (-2125.428008709975);
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      
      double double0 = mullerSolver0.solve((-1.0000000000022575), 620.09056, 1.0);
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-2288.41800811), (-1.0));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(double1, double0, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[1] = (-2125.428008709975);
      doubleArray0[2] = (-2125.428008709975);
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2125.428008709975), 0.17665515572080037, (-2.0));
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-1702.469), (-1.0));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (-2125.428008709975);
      doubleArray0[1] = (-2125.428008709975);
      doubleArray0[2] = (-2125.428008709975);
      doubleArray0[3] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2125.428008709975), 0.4450936876808, (-2.0));
      assertEquals((-1.0000000000022575), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1.0000000000022575), 620.09056, 1.0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-800.2845163022728);
      doubleArray0[1] = 2886.664;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-485.3202947993895), 4.9E-324);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-800.2845163022728), (-733.07));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-800.2845163022728,-733.07]  Values: [-800.2845163022728,-733.07]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (-778.8019812942468);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-778.8019812942468), 2.706720607193347E-4, 1.0E-6);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(1.0E-6, 3.141592653589793);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1.0E-6,3.141592653589793]  Values: [-0.0015576039625884936,-4893.357166070363]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-2217.9999984977117);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction2);
      double double0 = mullerSolver0.solve((-2218.0), 3922.098465024277);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-2217.9999984977117), 4429.25);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2924.2095820477066);
      doubleArray0[6] = (-2924.2095820477066);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-2924.2095820477066), 0.0, (-2067.474245));
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        mullerSolver1.getIterationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[1] = (-2125.428008709975);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.setMaximalIterationCount((-2817));
      try { 
        mullerSolver0.solve((-2125.428008709975), 0.4450936876808108, (-2.0));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-2,817) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }
}
