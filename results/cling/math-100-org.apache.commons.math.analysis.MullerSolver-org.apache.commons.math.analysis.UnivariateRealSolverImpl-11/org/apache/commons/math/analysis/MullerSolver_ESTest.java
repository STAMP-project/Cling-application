/*

 * Tue Mar 03 14:53:37 GMT 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
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
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(793.111, (-1157.843355083324));
      assertEquals(793.111, double0, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.3913285495);
      doubleArray0[1] = 2499.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(1.0E-15, 1.0E-15);
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
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 1.548853314169718E56;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1162.71123), 2445.686608110645);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1162.71123), 4330.28619836344, (-1162.71123));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1162.71123 initial=-1162.71123 upper=4330.28619836344
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 573.703;
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(0.0027288149750495094, 573.703);
      double double1 = mullerSolver0.solve2(2685.881, 573.703);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(double1, double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(573.703, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.3913285495);
      doubleArray0[1] = 2499.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(1.0E-15, 1.0E-15);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(2499.0, 2499.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2499.0,2499.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1168.6241280833149), (-1168.6241280833149), (-1168.6241280833149), (-1168.6241280833149), 1.548853314169718E56).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1168.6241280833149), 1.324797272813929E56, 7.839751567432073E25);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [7.839751567432073E25,1.324797272813929E56]  Values: [1.548853314169718E56,1.548853314169718E56]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 573.703;
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0027288149750495094, 573.703);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1.0), 724.785046264, 1361.1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1.0 initial=1361.1 upper=724.785046264
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 573.703;
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(0.0027288149750495094, 573.703);
      assertEquals(573.703, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1.0), 2997.64917538232, 1361.1);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(573.703, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.4);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve((-932.4), Double.POSITIVE_INFINITY, 2499.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-1.0), 2499.0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.3913285495);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve((-932.3913285495), 1377.51, (-2.0));
      assertEquals(0.0, double0, 0.01);
      
      mullerSolver0.solve(0.0, (-453.8380192671665));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1829.0154204161754), 2445.686608110645);
      assertEquals((-5.6843418860808015E-14), double0, 0.01);
      
      double double1 = mullerSolver0.getResult();
      assertEquals((-5.6843418860808015E-14), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0;
      doubleArray0[4] = (-1407.515227115319);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, 4196.704226);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(1.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(2422.057526474, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(0.0, (-1.0));
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1151.506;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2261.9766076458), 3022.0, 1151.506);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(5.875496071894304E-7, 899.107385, 1750.2192368);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [5.875496071894304E-7,899.107385]  Values: [6.765668979762723E-4,1035327.5484718101]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-416.16), (-416.16), (-416.16));
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-416.16), double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), 0.0, (-1.0), 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(1.0, 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), 0.0, (-1.0)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0;
      doubleArray0[4] = (-1407.515227115319);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve(0.0, 2.0);
      assertEquals(0.16326260603103904, double1, 0.01);
      
      double double2 = mullerSolver1.getResult();
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver1.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
      assertEquals(0.16326260603103904, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 573.703;
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0027288149750495094, 573.703);
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
  public void test18()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), 0.0, (-1.0)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(0.0, 0.0);
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
  public void test19()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), 0.0, (-1.0)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0;
      doubleArray0[4] = (-1407.515227115319);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve(0.0, 4196.704226);
      assertEquals(0.16326260603103815, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 4.9E-324;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-145.25620384), 0.95);
      assertEquals(71.84689807999999, double0, 0.01);
      
      double double1 = mullerSolver0.solve(4.9E-324, 0.0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(4.9E-324, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1.0), 2997.64917538232, 1361.1);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(793.0919446368, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [793.0919446368,-1.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1407.515227115319), 1.0, (-1168.6241280833149));
      // Undeclared exception!
      try { 
        mullerSolver0.solve(134.0, (-1352.463366389773));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [134.0,-1352.463366389773]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), 0.0, (-1.0), 0.95, 0.95).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2106.295), (-2010.4883445089793));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-2010.4883445089793), 6.283185307179586);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2010.4883445089793,6.283185307179586]  Values: [0.95,0.95]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.4);
      doubleArray0[1] = 2499.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(1.0E-15, 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-149.9701449011965), (-2.5243548967072378E-29));
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals((-2.5243548967072378E-29), double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = (-1207.6588);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1207.6588), 1151.506);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(1151.506, 2499.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1151.506,2499.0]  Values: [-3.2419602597775275E24,-7.350350405209314E26]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1151.506;
      doubleArray0[3] = (-4040.2722);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(1.0E-15, 6.283185307179586, 3.141592653589793);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.5338605013690875, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 14543.144388462355;
      doubleArray0[2] = 391.072108794;
      doubleArray0[3] = (-1781.3641162527);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      
      double double0 = mullerSolver0.solve((-0.5692837364726953), 74.873, 1.7375980848911288);
      assertEquals(1.7244520957350602, double0, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1.0), 2997.64917538232, 1361.1);
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
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0E-15;
      doubleArray0[1] = 1151.506;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1829.0), 2445.686608110645);
      mullerSolver0.getResult();
      try { 
        mullerSolver0.solve((-1829.0), (-8.6842795434783E-19), (-1.0));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1829.0154204161754), 2445.686608110645);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1097.5911531844783), 1.0E-15, 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1097.5911531844783 initial=1.0E-15 upper=1.0E-15
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(1151.506, 1.0E-15);
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
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0027288149750495094, (-1.0));
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
  public void test33()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1111.8424804067631, 1.0, (-1407.515227115319), 1111.8424804067631).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1.0, 1111.8424804067631);
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
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.3913285495);
      doubleArray0[1] = 2499.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve((-932.3913285495), 3076.0273997307604, 2499.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(1.0E-15, 1.0E-15);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-15, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-637.6287774779624);
      doubleArray0[3] = (-637.6287774779624);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2800.31144831104), 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-637.6287774779624), 4.9E-324);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-2.2169184232737586E-19), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-637.6287774779624);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2800.31144831104), 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-637.6287774779624), 4.9E-324);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, 152.749);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-790.7), 2222.684960814, (-790.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-790.7 initial=-790.7 upper=2222.684960814
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-1168.6241280833149);
      doubleArray0[3] = 152.749;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(1.0, 152.749);
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
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.3913285495);
      doubleArray0[1] = 2499.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(1.0E-15, 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(1.0E-15, 1.0E-15);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1157.843355083324), (-1157.843355083324), (-1157.843355083324), (-1157.843355083324), 1.548853314169718E56).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve2((-1157.843355083324), 0.0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1168.6241280833149), (-1168.6241280833149), (-1168.6241280833149), (-1168.6241280833149), 1.548853314169718E56).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve2((-1168.6241280833149), 0.0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.4);
      doubleArray0[1] = 2499.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(1.0E-15, 1.0E-15);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      
      double double0 = mullerSolver0.solve2((-1.0), 2499.0);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-1.0);
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-350.0), 0.95, (-229.5167484141614));
      assertEquals((-1.0), double0, 0.01);
      
      mullerSolver0.solve2((-1.0), 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 34.845958697915655, 1.0, 3563.65, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-1745.4), (-1745.4));
      assertEquals((-1745.4), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1745.4), 0.0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertNotEquals(double1, double0, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(904.9547168354763, 2838.3, (-1226.344), 904.9547168354763, (-1226.344)).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver0.solve(1.0E-14, 329.0);
      try { 
        mullerSolver1.solve2(0.0, 2711.877554445445);
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
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.11896457504532236;
      doubleArray0[2] = (-3894.3666050972047);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1.0), 1.0E-6);
      assertEquals((-0.0055270120647099375), double0, 0.01);
      
      double double1 = mullerSolver0.solve(1.0E-6, 4.922371073947526E89, 0.11896457504532236);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.005527012064709937, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.11896457504532236;
      doubleArray0[2] = (-3894.3666050972047);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1.0), 1.0E-6);
      assertEquals((-0.0055270120647099375), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-3214.0), 0.0, (-1.0));
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-0.0055270120647099375), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = 1.548853314169718E56;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-358.52974577979), 1.0);
      try { 
        mullerSolver0.solve((-1.0), 1.548853314169718E56);
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
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1151.506;
      doubleArray0[2] = (-4040.2722);
      doubleArray0[3] = (-4040.2722);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.setFunctionValueAccuracy(1151.506);
      mullerSolver0.solve(3.291195509735889E-7, 1151.506);
      double double0 = mullerSolver0.solve2((-4040.2722), 0.45330945717592064);
      assertEquals(1151.506, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1.1314964611112788), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1151.506;
      doubleArray0[3] = (-4040.2722);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(1.0E-15, 1045.626088);
      try { 
        mullerSolver0.solve2((-4040.2722), Double.POSITIVE_INFINITY);
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
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.548853314169718E56;
      doubleArray0[1] = 1.548853314169718E56;
      doubleArray0[4] = 1.548853314169718E56;
      doubleArray0[5] = 1.548853314169718E56;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-358.52974577979), 1.0);
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1.0), 1.548853314169718E56);
      assertEquals((-1.0), double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 1151.506;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(1151.506, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-145.25620384), 0.95);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.11896457504532236;
      doubleArray0[2] = (-3894.3666050972047);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(1.0E-6, 4.922371073947526E89, 0.11896457504532236);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-3214.0), 8.350769696952988E55);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-3214.0,8.350769696952988E55]  Values: [-4.022801257974772E10,-2.7157503588227572E115]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 573.703;
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1.0), 2997.64917538232, 1361.1);
      assertEquals(573.703, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(2685.881, 573.703);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(573.703, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-1.0);
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-350.0), 0.95, (-229.5167484141614));
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.solve2(4898.503, (-1.0));
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 573.703;
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0027288149750495094, 573.703);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(604.849819771, 1889.1256928);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [604.849819771,1889.1256928]  Values: [-31.146819771000082,-1315.4226928]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-932.3913285495);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-932.3913285495), 3076.0273997307604, 2499.0);
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
  public void test58()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1157.843355083324), (-1157.843355083324), (-1157.843355083324), (-1157.843355083324), 1.548853314169718E56).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve2((-1157.843355083324), (-8.730152396406439));
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-1407.515227115319);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve((-1407.515227115319), 6010182.715665554);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-1023.999999), 4.666746879353129E32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1023.999999,4.666746879353129E32]  Values: [1.548853314169718E56,1.548853314169718E56]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-21.63983513389312), (-3894.3666050972047), (-21.63983513389312), 1.0E-6, (-3894.3666050972047)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      try { 
        mullerSolver0.solve((-3894.3666050972047), 1.0E-6);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }
}
