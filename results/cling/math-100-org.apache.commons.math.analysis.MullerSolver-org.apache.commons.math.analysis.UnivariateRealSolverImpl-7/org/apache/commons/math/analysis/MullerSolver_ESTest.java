/*

 * Tue Mar 03 14:53:06 GMT 2020
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
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1.0E-15;
      doubleArray0[2] = 1978.7067;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve((-2083.48077342407), 1978.7067);
      assertEquals(0.0, double0, 0.01);
      
      mullerSolver0.getResult();
      double double1 = mullerSolver0.solve(0.0, 1.0E-15);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-3680.7), 0.0);
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2104.55701992081, 0.0, 1.0E-14).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1.0E-15, (-87.743265918));
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-946.0758), (-946.0758));
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
      double[] doubleArray0 = new double[11];
      doubleArray0[1] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve2((-1792.4950008659982), 1973.9397);
      mullerSolver0.getResult();
      mullerSolver0.setMaximalIterationCount((-893));
      try { 
        mullerSolver0.solve((-1792.4950008659982), 1973.9397);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-893) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve2((-910.0), 0.0);
      double double1 = mullerSolver0.solve(724.669234, 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.95, 0.95, 0.95).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1978.7067, 926.5387);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(748.772, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [748.772,0.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve((-910.0), 35.323861206111005, 2.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-4.9E-324), 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve2((-910.0), 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1239.2), 1.0, (-910.0));
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-1239.2), 1.0, (-910.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(1.0E-15, 1978.7067);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1.0E-15,1978.7067]  Values: [1.0E-15,1978.7067]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1160.3130228;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(1160.3130228, 0.0);
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence((-910.0), 1978.7067, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-910.0 initial=1978.7067 upper=0.0
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1792.4950008659982), 1973.9397);
      mullerSolver0.setMaximalIterationCount((-893));
      try { 
        mullerSolver0.solve2((-1792.4950008659982), 4.9E-324);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-893) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[1] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve2((-1.0), (-2095.478809248));
      double double0 = mullerSolver0.solve((-1792.4950008659982), 1511.67, 7.997138891369104E-5);
      assertEquals((-0.9999999999999999), double0, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1792.4950008659982), 1.0941201904003868E32, (-1625.102653));
      assertEquals(9.007199254740992E15, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(0.0, (-1792.4950008659982));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve((-910.0), 32.0345, 2.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-1856.4047235015587), 1.0E-15);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-495.18), 0.0, (-495.18), (-2109.873)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1.0E-14, 1.0E-14);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1965.5614765828), 2.0, (-2.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1965.5614765828,2.0]  Values: [-2109.873,-2109.873]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1160.3130228;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-910.0), 684.6114016841657);
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
  public void test17()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2611.0), (-2611.0), 1257.581813, (-2611.0), 1257.581813).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      try { 
        mullerSolver0.solve((-2611.0), Double.POSITIVE_INFINITY);
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1792.4950008659982), (-1878.6), (-1.5557105377234235E-42), 2274.351077393292, (-1792.4950008659982)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (-1.5557105377234235E-42);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      mullerSolver0.isBracketing(1160.3130228, (-1878.6), polynomialFunction1);
      try { 
        mullerSolver0.solve((-1.5557105377234235E-42), 2274.351077393292);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1160.3130228;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-910.0), 1978.7067);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
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
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 2374.276;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve2((-0.5999565271598613), 463.331);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-910.0), 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(676.4828655252231, 1223.2, 1223.2, 676.4828655252231, (-2.8416133054770312E12)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(4.9E-324, 1223.2);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-2.8416133054770312E12), (-2.8416133054770312E12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-2.8416133054770312E12,-2.8416133054770312E12]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2.8416133054789937E12);
      doubleArray0[1] = 6.283185307179586;
      doubleArray0[2] = 6.283185307179586;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(6.283185307179586, (-672500.9118384849));
      double double1 = mullerSolver0.solve2((-672500.9118384849), (-672500.9118384849));
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(double1, double0, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-672500.9118384849), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1160.3130228;
      doubleArray0[2] = 1978.6827572909528;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-1881.54461018419), 684.6114016841657, 0.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(0.32485834546779097, 2437.363585);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.32485834546779097,2437.363585]  Values: [2445.8962362783714,9646698.910799524]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(0.0, 1.0E-15, 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.5;
      doubleArray0[1] = (-1341.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(0.5, (-4.9E-324));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(0.5, (-1200.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.5,-1200.7]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-2083.48077342407), 1978.7067);
      double double0 = mullerSolver0.getResult();
      assertEquals(0.0, double0, 0.01);
      
      mullerSolver0.solve(724.669234, 0.0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1160.3130228;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(1160.3130228, 0.0);
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
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1160.3130228;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(1160.3130228, 0.0);
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
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[1] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.setMaximalIterationCount(0);
      mullerSolver0.solve2(179.635177, (-1.0));
      try { 
        mullerSolver0.solve((-1107.668500005), 1229.436817598507);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-910.0), 35.323861206111005, 2.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(4.9E-324, 4.9E-324);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [4.9E-324,4.9E-324]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = 1229.436817598507;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-2.8416133054812017E12), 3635.521864314996, (-2302.1396));
      // Undeclared exception!
      try { 
        mullerSolver0.solve(1229.436817598507, (-2.8416133054812017E12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1229.436817598507,-2.8416133054812017E12]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1160.3130228;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(1160.3130228, 0.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(0.32485834546779097, 2437.363585);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.32485834546779097,2437.363585]  Values: [0.32485834546779097,2437.363585]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2(Double.POSITIVE_INFINITY, 1973.9397);
      assertEquals(1973.9397, double0, 0.01);
      
      double double1 = mullerSolver0.solve(3781.5721735177, 3781.5721735177);
      assertEquals(3781.5721735177, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(676.4828655252231, 1223.2, 1223.2, 676.4828655252231, (-2.8416133054770312E12)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(676.4828655252231, 1223.2);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-14.331183), 1223.2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-14.331183,1223.2]  Values: [-2.8416133054770312E12,-2.8416133054770312E12]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      doubleArray0[1] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve2((-1792.4950008659982), 1973.9397);
      double double0 = mullerSolver0.getResult();
      assertEquals((-6.3108872417680944E-30), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1792.4950008659982), 1511.67, 7.997138891369104E-5);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(1973.9397, 1973.9397);
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
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1792.4950008659982), 1973.9397);
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
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2.8416133054789937E12);
      doubleArray0[1] = 6.283185307179586;
      doubleArray0[2] = 6.283185307179586;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2.8416133054789937E12), 3594.9);
      assertEquals((-672500.9118384849), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-672500.9118384849), (-672500.9118384849));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-672500.9118384849), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1792.4950008659982), (-1878.6), (-1.5557105377234235E-42), 2274.351077393292, (-1792.4950008659982)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      mullerSolver0.isBracketing(1160.3130228, (-1878.6), polynomialFunction0);
      try { 
        mullerSolver0.solve((-1.5557105377234235E-42), 2274.351077393292);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1785.161903617929), 1973.9397);
      assertEquals(2.1387857870701986E-4, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1792.4950008659982), 1.0941201904003868E32, (-1625.102653));
      assertEquals(9.007199254740992E15, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double double0 = 676.4828655252231;
      double double1 = (-2.8416133054770312E12);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(676.4828655252231, 676.4828655252231, 676.4828655252231, 676.4828655252231, (-2.8416133054770312E12)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      
      double double2 = 6.856764287430522E-30;
      double double3 = mullerSolver0.solve2(6.856764287430522E-30, 676.4828655252231);
      assertEquals(338.24143276261157, double3, 0.01);
      
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double4 = mullerSolver1.solve(double2, double0);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
      assertEquals(6.856764287430522E-30, double4, 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver1.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      double double0 = 10.0;
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 10.0, 10.0, 10.0, (-2.8416133054815E12)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double1 = (-1973.65);
      try { 
        mullerSolver0.solve2((-1973.65), (-1.5557105377234235E-42));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-495.18), 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-495.18), (-495.18));
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence((-926.04529), (-495.18), (-2109.873));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-926.04529 initial=-495.18 upper=-2109.873
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1160.3130228;
      doubleArray0[2] = 1978.6827572909528;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(0.0, 684.6114016841657);
      assertEquals(0.0, double0, 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction1);
      assertEquals(100, mullerSolver1.getMaximalIterationCount());
      
      double double1 = mullerSolver1.solve((-1881.54461018419), 684.6114016841657, 0.0);
      assertEquals((-0.2932033997174473), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1792.4950008659982), 1973.9397);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1792.4950008659982), 1973.9397, (-1792.4950008659982));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1792.4950008659982 initial=-1792.4950008659982 upper=1973.9397
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      
      double double0 = mullerSolver0.solve((-1792.4950008659982), 1973.9397);
      assertEquals((-1.0397249765128843E-6), double0, 0.01);
      
      double double1 = mullerSolver0.getResult();
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1.0397249765128843E-6), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2.8416133054770312E12);
      doubleArray0[2] = 6.283185307179586;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-3.806398523506688E42), 3594.9);
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
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[1] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve2((-1.0), (-2095.478809248));
      mullerSolver0.setMaximalIterationCount((-893));
      try { 
        mullerSolver0.solve((-1792.4950008659982), 1973.9397);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-893) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double double0 = 676.4828655252231;
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver0.solve2(double0, double0);
      double double2 = mullerSolver0.solve(double0, double0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(double2, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(676.4828655252231, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[4] = (-2.8416133054812017E12);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-2.8416133054812017E12), 3635.521864314996, (-2302.1396));
      assertEquals((-9.482322195397216E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.functionValueAccuracy = 1973.9397;
      mullerSolver0.solve2((-1792.4950008659982), 1973.9397);
      mullerSolver0.setMaximalIterationCount((-893));
      try { 
        mullerSolver0.solve((-1792.4950008659982), 1973.9397);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-893) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[1] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1792.4950008659982), 1973.9397);
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve((double) (-893), (-1.0));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 2374.276;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve2((-0.5999565271598613), 463.331);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve(0.0, 1820.205126295);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[1] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1792.4950008659982), 1973.9397);
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1.0), (-1792.4950008659982));
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve2((-1792.4950008659982), 1973.9397);
      mullerSolver0.setMaximalIterationCount((-893));
      try { 
        mullerSolver0.solve((-278.21588109587), (-1.4655712318548064), (-1.465571231876768));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-893) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.95, 0.95, 0.95).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-1190.469), (-1630.2527094780319));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-2145.180483565), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2145.180483565,0.0]  Values: [0.95,0.95]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1792.4950008659982), 1973.9397);
      assertEquals((-1.465571231876768), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-278.21588109587), (-1.4655712318548064), (-1.465571231876768));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-1.465571231876768), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 2374.276;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.setFunctionValueAccuracy((-771.995044911088));
      mullerSolver0.solve2((-0.5999565271598868), 2374.276);
      double double0 = mullerSolver0.solve((-2790.21105425), 2374.276, (-910.0));
      assertEquals((-771.995044911088), mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2.8416133054789937E12);
      doubleArray0[1] = 6.283185307179586;
      doubleArray0[2] = 6.283185307179586;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2.8416133054789937E12), 3594.9);
      try { 
        mullerSolver0.solve2(6.283185307179586, 1.0317859154134895E13);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[1] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1792.4950008659982), 1973.9397);
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1.0), (-1792.4950008659982));
      assertEquals((-1.0), double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2.8416133054789937E12);
      doubleArray0[1] = 6.283185307179586;
      doubleArray0[2] = 6.283185307179586;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(6.283185307179586, (-672500.9118384849));
      try { 
        mullerSolver0.solve2(6.283185307179586, 1.0317859154134895E13);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[1] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1792.4950008659982), 1973.9397);
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve((double) (-893), (-1.0));
      assertEquals((-1.0), double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2.8416133054770312E12);
      doubleArray0[2] = 6.283185307179586;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-3.806398523506688E42), 3594.9);
      assertEquals((-672500.4118380669), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-3.806398523506688E42), 1223.2);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1.0E-15;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-910.0), 35.323861206111005, 2.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-1485.166479), (-1121.526));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1485.166479,-1121.526]  Values: [-1485.166479,-1121.526]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1792.4950008659982), 1973.9397);
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
  public void test66()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1792.4950008659982), 1973.9397);
      mullerSolver0.setMaximalIterationCount((-893));
      try { 
        mullerSolver0.solve((-278.21588109587), (-1.4655712318548064), (-1.465571231876768));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-893) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2.8416133054770312E12);
      doubleArray0[1] = 6.283185307179586;
      doubleArray0[2] = 6.283185307179586;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-3.806398523506688E42), 3594.9);
      assertEquals((-672500.9118382527), double0, 0.01);
      
      double double1 = mullerSolver0.solve2(3017.484253072304, (-672500.9118382527));
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(double1, double0, 0.01);
      assertEquals((-672500.9118382527), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      
      mullerSolver0.functionValueAccuracy = 1973.9397;
      mullerSolver0.solve2((-1792.4950008659982), 1973.9397);
      double double0 = mullerSolver0.solve((-1792.4950008659982), 1973.9397);
      assertEquals((-0.9375919010413004), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1792.4950008659982);
      doubleArray0[1] = (-1792.4950008659982);
      doubleArray0[2] = (-1792.4950008659982);
      doubleArray0[3] = (-1792.4950008659982);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1792.4950008659982), 1973.9397);
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve2(179.635177, (-1.0));
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-910.0);
      doubleArray0[1] = 1160.3130228;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(1160.3130228, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1646.5), 1620.213149665385, (-433.64787383223));
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 1978.7067;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-2790.21105425), 2374.276, (-910.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-910.0), 456.6514520816, (-1364.6));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-910.0 initial=-1364.6 upper=456.6514520816
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }
}
