/*

 * Tue Mar 03 14:54:16 GMT 2020
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
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-3.0711042866756888E16), (-3.0711042866756888E16));
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
  public void test01()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction1).value(anyDouble());
      mullerSolver0.f = univariateRealFunction1;
      double double0 = mullerSolver0.solve((-2139.212535175), 0.0);
      assertEquals((-2139.212535175), double0, 0.01);
      
      mullerSolver0.setResult(1.0E-6, (-1));
      double double1 = mullerSolver0.getResult();
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-115.49714367869), 0.5);
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
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3.0711042866756888E16);
      doubleArray0[1] = 671.223926350307;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(1.0E-14, 1.7274505808018148E-5);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(Double.POSITIVE_INFINITY, (-3599.6256677), (-3.0711042866756888E16));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity,-3599.6256677]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1536.56, 0.0, (-0.08487055030281015)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1536.56;
      doubleArray0[3] = (-0.08487055030281015);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2(1.8169853319704998E-6, 6.283185307179586);
      assertEquals(6.283185307179586, double0, 0.01);
      
      double double1 = mullerSolver1.solve(5.587199120782316E-5, 205709.4745580937, 1536.56);
      assertEquals(26.258152629575314, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1536.56, 0.0, (-0.08487055030281015)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1536.56;
      doubleArray0[5] = (-0.08487055030281015);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2(1.8169853319704998E-6, 6.283185307179586);
      assertEquals(6.283185307179586, double0, 0.01);
      
      double double1 = mullerSolver1.solve((-4259.16), 226.2659603, 1.8169853319704998E-6);
      assertEquals(100, mullerSolver1.getMaximalIterationCount());
      assertEquals(7.104908692537518, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 39.301554139846814;
      doubleArray0[3] = 39.301554139846814;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-4249.099473), 39.301554139846814, (-2463.8413727));
      assertEquals((-0.9999999999999489), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-1886.136849), 4.4199504819284575E-17);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-1.0000000000000078), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2137.8809075481918), (-2137.8809075481918), 1.0, (-2137.8809075481918), 1.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-2137.8809075481918), 2139.212535175, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1.0,2139.212535175]  Values: [1.0,1.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = (-2139.212535175);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(327.63624739518036, 0.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-3130.5146), 0.011132812499999999, 2350.152495179);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-3130.5146 initial=2350.152495179 upper=0.011132812499999999
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1536.56, 0.0, (-0.08487055030281015)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 4614.234096042223;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-0.08487055030281015), 4614.234096042223);
      assertEquals(4614.234096042223, double0, 0.01);
      
      double double1 = mullerSolver1.solve((-4259.16), 226.2659603, 1.8169853319704998E-6);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver1.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), (-2139.212535175), (-2139.212535175), 2.0, (-2265.6228041)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 0.0, 0.0).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver1.solve(0.0, 3368.0722986);
      try { 
        mullerSolver0.solve2(0.0, 3368.0722986);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2.995754432938178E16);
      doubleArray0[1] = (-2.995754432938178E16);
      doubleArray0[3] = 39.301554139846814;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-4249.099473), 39.301554139846814, (-2463.8413727));
      assertEquals((-1.0000000000000013), double0, 0.01);
      
      mullerSolver0.solve2((-1.0000000000000013), (-6.1455715678322992E16));
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = (-2139.212535175);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(0.0, 869.71848356);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-2139.212535175), 8.742236956505778);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2139.212535175,8.742236956505778]  Values: [-2.9368587476464333E10,-490478.9089333565]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 6.384146600154591E-46, (-2139.212535175), (-2139.212535175), 1.0E-15).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-4068.4), 1.0);
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
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3.0711042866756888E16);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-1277.5209), 1.7274505808018148E-5);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunctionLagrangeForm0);
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
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 39.301554139846814;
      doubleArray0[1] = 39.301554139846814;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-4249.099473), 39.301554139846814, (-2463.8413727));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(39.301554139846814, (-2463.8413727));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [39.301554139846814,-2463.8413727]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-14.225436231114113);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-1616.668206748545), 3231.8962281897);
      assertEquals(1.068323740379112E-6, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-1616.668206748545), 2225.758894928608);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.6797571086609595E-6, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = (-2139.212535175);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(327.63624739518036, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(0.0, 8.918939287416347);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 544.6033219123586;
      doubleArray0[2] = (-295.9583811846661);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-295.9583811846661), 544.6033219123586, 428.5630425078);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-295.9583811846661), 1.0E-14, 428.5630425078);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-295.9583811846661,1.0E-14]  Values: [175727.33010880862,544.6033219123527]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1536.56, 0.0, (-0.08487055030281015), 0.95, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve2(1.8169853319704998E-6, 6.283185307179586);
      assertEquals(6.283185307179586, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-0.08487055030281015), 4614.234096042223);
      assertEquals(4614.234096042223, double1, 0.01);
      
      double double2 = mullerSolver0.solve(Double.POSITIVE_INFINITY, 229.0124, 10.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double2, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), (-2139.212535175), (-2139.212535175)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 0.0, (-2139.212535175)).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver1.solve(0.0, (-2139.212535175));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(0.0, (-2139.212535175));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0,-2139.212535175]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = (-2139.212535175);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-2139.212535175), 3049.58668990284);
      assertEquals(1.8979138103694212E-4, double0, 0.01);
      
      double double1 = mullerSolver0.solve(326.364936151446, 0.0);
      assertEquals(0.0, double1, 0.01);
      
      double double2 = mullerSolver0.getResult();
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.8979138103694212E-4, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2136.7900503112965), 0.0, 0.0).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver1.solve((-2136.7900503112965), 3368.0722986);
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
  public void test23()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 0.0, (-14.225436231114113)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(3.141592653589793, (-2139.212535175));
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
  public void test24()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1536.56, 0.0, (-0.08487055030281015)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1536.56;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-0.08487055030281015), 4614.234096042223);
      // Undeclared exception!
      try { 
        mullerSolver1.solve((-4259.16), 226.2659603, 1.8169853319704998E-6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-4259.16,226.2659603]  Values: [1536.56,1536.56]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 39.301554139846814;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-4249.099473), 39.301554139846814, (-2463.8413727));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(39.301554139846814, (-2463.8413727));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [39.301554139846814,-2463.8413727]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-2.995754432938178E16);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-4249.099473), 39.301554139846814, (-2463.8413727));
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.getResult();
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 79.40191031276927;
      doubleArray0[2] = (-358.1617025041163);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-2075.6996705718343), 79.40191031276927, 1.0E-15);
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
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-2150.7134338179085);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2150.7134338179085), 2.5971146779288823);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-3589.0191613469), 2.5971146779288823, 2783.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-3589.0191613469 initial=2783.0 upper=2.5971146779288823
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(4.0, 1073.4853119245);
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
  public void test30()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2137.8809075481918), (-2137.8809075481918), 1.0, (-2137.8809075481918), 1.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-4068.4), (-2137.8809075481918));
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
  public void test31()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 6.384146600154591E-46, (-2139.212535175), (-2139.212535175), 1.0E-15).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction1).value(anyDouble());
      double double0 = mullerSolver0.solve((-2139.212535175), 0.0);
      assertEquals((-3208.8188027625), double0, 0.01);
      
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver1.solve2(1.0E-15, (-2.0));
      assertEquals(100, mullerSolver1.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver1.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), (-2139.212535175), 1.0, (-2139.212535175), 671.224).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 0.0, 0.0, 0.0, 0.0).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver1.solve2(0.0, (-2139.212535175));
      mullerSolver1.solve((-2.0), (-2.0));
      try { 
        mullerSolver0.solve2((-2.0), 3826.665526568782);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = (-2139.212535175);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, 0.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-3130.5146), 0.011132812499999999, 2350.152495179);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-3130.5146 initial=2350.152495179 upper=0.011132812499999999
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3.0711042866756888E16);
      doubleArray0[1] = 671.223926350307;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(1.0E-14, 1.7274505808018148E-5);
      assertEquals(1.0E-14, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1725.0), 671.223926350307, 1.7274505808018148E-5);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-2150.7134338179085);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2150.7134338179085), 2.5971146779288823);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-3589.0191613469), 2.5971146779288823, 2783.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-3589.0191613469 initial=2783.0 upper=2.5971146779288823
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2137.8809075481918), (-2137.8809075481918), 1.0, (-2137.8809075481918), 1.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1.0, 4.0);
      double double0 = mullerSolver0.getResult();
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0000223827076247, double0, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-1986.969810581619);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve((-904.3), 2364.468361);
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
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-3.0711042866756888E16);
      doubleArray0[1] = (-3.0711042866756888E16);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-3.0711042866756888E16), 2.5486573179023253E-5);
      assertEquals(1.0E-6, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-2139.0), 2.5486573179023253E-5);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals((-1.0), double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 6.384146600154591E-46, (-2139.212535175), (-2139.212535175), 1.0E-15).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction1).value(anyDouble());
      double double0 = mullerSolver0.solve2(1.5329702819144586E-5, 3168.8103284);
      assertEquals(3168.8103294, double0, 0.01);
      
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      double double1 = mullerSolver1.solve((-1.0), 1.0E-15);
      assertEquals((-1.0), double1, 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver1.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1536.56, 0.0, (-0.08487055030281015)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-0.08487055030281015);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver1.solve((-0.08487055030281015), 4614.234096042223);
      assertEquals(2.2341555345996306E-5, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-0.08487055030281015), 4614.234096042223);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(4614.234096042223, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 544.6033219123586;
      doubleArray0[2] = (-295.9583811846661);
      doubleArray0[3] = (-295.9583811846661);
      doubleArray0[4] = (-295.9583811846661);
      doubleArray0[5] = 544.6033219123586;
      doubleArray0[6] = (-295.9583811846661);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-295.9583811846661), 544.6033219123586, 428.5630425078);
      assertEquals(0.4957586751303942, double0, 0.01);
      
      mullerSolver0.solve2(0.4957586751303942, 544.6033219123586);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.5).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve2(4.2999187465611414E-69, 0.0);
      mullerSolver0.solve(1.3260539722114129, 4.2999187465611414E-69);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(4.2999187465611414E-69, 0.5, (-34.082));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [4.2999187465611414E-69,0.5]  Values: [0.5,0.5]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-358.1617025041163);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-2072.538331), 1.0, 1.0E-15);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-970.2605291658), 79.40191031276927);
      assertEquals((-3.7865323450608567E-29), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.000091552734375, 1.000091552734375, 1395.0531, 413405.92029604, (-92.08636238567854)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      try { 
        mullerSolver0.solve(1.000091552734375, 413405.92029604);
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
      doReturn((-1986.969810581619), (-1867.0), 1395.0530654798, 1395.0530654798, (-73.43021380695431)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      try { 
        mullerSolver0.solve((-1986.969810581619), 1395.0530654798);
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
      doReturn((-2137.8809075481918), (-2137.8809075481918), 1.0, (-2137.8809075481918), 1.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1591.8297792632);
      doubleArray0[6] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve((-4401.861416249996), 1.0, (-2137.8809075481918));
      try { 
        mullerSolver0.solve2((-2190.98919), 2.0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 6.384146600154591E-46, (-2139.212535175), (-2139.212535175), 1.0E-15).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 671.224;
      doubleArray0[7] = (-1155.02);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve2(1.8169853319704998E-6, 6.283185307179586);
      mullerSolver1.solve(0.0, 6.283185307179586);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(0.0, 567.771224361);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.0,567.771224361]  Values: [1.0E-15,1.0E-15]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-14.225436231114113);
      doubleArray0[1] = (-2139.212535175);
      doubleArray0[2] = (-14.225436231114113);
      doubleArray0[3] = (-14.225436231114113);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1398.467), 2546.238);
      assertEquals((-0.006650139209739114), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-0.006650139209739114), 6.283185307179586);
      assertEquals((-0.006650139209739114), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3.0711042866756888E16);
      doubleArray0[1] = (-3.0711042866756888E16);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-3.0711042866756888E16), 2.5486573179023253E-5);
      assertEquals(1.0E-6, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-3.0711042866756888E16), 292.035079216);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 543.8753097186294;
      doubleArray0[2] = (-295.9583811846661);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, 901690.0800000001, 543.8753097186294);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(10.0, 771.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [10.0,771.0]  Values: [-29051.962808747976,-1.759292521944844E8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 6.384146600154591E-46, (-2139.212535175), (-2139.212535175), 6.384146600154591E-46).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2139.212535175), 6.958007812499999E-4);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2((-2139.212535175), 1066.4170149483884);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2139.212535175,1066.4170149483884]  Values: [6.384146600154591E-46,6.384146600154591E-46]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1536.56, 0.0, (-0.08487055030281015)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-0.08487055030281015);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2(1.8169853319704998E-6, 6.283185307179586);
      assertEquals(6.283185307179586, double0, 0.01);
      
      double double1 = mullerSolver1.solve((-0.08487055030281015), 4614.234096042223);
      assertEquals(1.0E-6, mullerSolver1.getAbsoluteAccuracy(), 0.01);
      assertEquals(2.2341555345996306E-5, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3.0711042866756888E16);
      doubleArray0[1] = (-3.0711042866756888E16);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-3.0711042866756888E16), Double.POSITIVE_INFINITY, 2.0);
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver0.getResult();
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1045.2388101);
      doubleArray0[1] = 505.83560144012836;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2(1.0E-6, 505.83560144012836);
      assertEquals(2.066360705185984, double0, 0.01);
      
      double double1 = mullerSolver0.solve(505.83560144012836, 2.066360705185984);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(2.066360705185984, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2139.212535175), 0.0, (-14.225436231114113), (-14.225436231114113), (-14.225436231114113)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(2.146383316933089, 2.146383316933089);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-2139.212535175), (-14.225436231114113));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2139.212535175,-14.225436231114113]  Values: [-14.225436231114113,-14.225436231114113]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-3.0711042866756888E16);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-3.0711042866756888E16), Double.POSITIVE_INFINITY, 2.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(2.0, (-1572.9));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2.0,-1572.9]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (-2137.8809075481918);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.maximalIterationCount = 1;
      try { 
        mullerSolver0.solve((-2137.8809075481918), 2277.298, (-720.91));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2098.501284674606), (-2098.501284674606), (-2098.501284674606), (-2098.501284674606), 671.224).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-2098.501284674606);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve2((-2098.501284674606), 671.224);
      try { 
        mullerSolver0.solve((-2098.501284674606), (-0.6441858842858617));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }
}
