/*

 * Tue Mar 03 14:54:53 GMT 2020
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
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.setResult((-0.014629147162944722), (-2611));
      double double0 = mullerSolver0.getResult();
      assertEquals((-0.014629147162944722), double0, 0.01);
      
      double double1 = mullerSolver0.solve(0.0, 0.8092424804089048);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 4008.1929372575946).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(0.0, (-1521.5697620075362));
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
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2241.99418), (-2241.99418));
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
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
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(1.0E-15, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(4.0, 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 1.0E-6, (-1044.4947443), 3.141592653589793, 4.9E-324).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(2339.29194754534, 2339.29194754534);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(2339.29194754534, 2339.29194754534);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2339.29194754534,2339.29194754534]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(Double.NEGATIVE_INFINITY, 1.0, (-836.86442843673));
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(4319.006870036591, 0.0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-662.548123254415), 0.0, (-3339.6255652)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = 0.07714923209954816;
      doubleArray0[1] = (-3339.6255652);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve(775.627, (-3339.6255652));
      // Undeclared exception!
      try { 
        mullerSolver1.solve((-3339.6255652), 0.5, (-3339.6255652));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-3339.6255652 initial=-3339.6255652 upper=0.5
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = 2251.451537343158;
      doubleArray0[4] = (-55.539100223112634);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, 2251.451537343158);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(2.523282878872296, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [2.523282878872296,Infinity]  Values: [3.9108272176235914E-11,NaN]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.34019738594470433;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.setFunctionValueAccuracy((-0.33197801923208925));
      mullerSolver0.solve2((-0.33197801923208925), 4.9E-324);
      double double0 = mullerSolver0.solve((-0.33197801923208925), 1.0);
      assertEquals((-0.33197801923208925), mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[8] = (-3339.6255652);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver1.solve((-662.548123254415), 2008.0, 100.0);
      assertEquals((-0.0016313707298302293), double0, 0.01);
      
      double double1 = mullerSolver0.solve2(100.0, 0.0);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2155.6480644), 0.0077284199297469654, (-2155.6480644), (-2155.6480644), 2124.31719).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(2124.31719, 2337.7536802028835);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(2124.31719, (-0.8375586884325747));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2124.31719,-0.8375586884325747]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 4008.1929372575946, (-1521.5697620075362), (-1521.5697620075362)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1805.7852880165253, 1805.7852880165253);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(1209.8441360826089, 1805.7852880165253);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1209.8441360826089,1805.7852880165253]  Values: [-1521.5697620075362,-1521.5697620075362]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2.3611636735119457), 35.26093081009388, 35.26093081009388, 35.26093081009388, (-2.3611636735119457)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2.3611636735119457), 35.26093081009388);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(35.26093081009388, 35.26093081009388);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [35.26093081009388,35.26093081009388]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-92.17728592), 1233.02081, 1.4398695771689063E-5);
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(4.9E-324, 1.17580306380205E-6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [4.9E-324,1.17580306380205E-6]  Values: [4.9E-324,1.17580306380205E-6]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3.052091168825626, (-4.9E-324), (-4.9E-324), 1.2162753742166281, (-4.9E-324)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver1.solve(3.052091168825626, 35.26095494639239);
      assertEquals(3.052091168825626, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(1.0E-15, 3.052091168825626);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.5260465844128133, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve2(0.0, 0.8092424804089048);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve(1.5823999263996849, 0.0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(34.682794030718824, 2775.470684, (-1058.3789695937985));
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(34.682794030718824, double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-657.9445853116504), 0.0, (-3339.6255652), 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-3339.6255652), 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve(0.0, (-3339.6255652), 0.0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.setResult((-0.014629147162944722), (-2611));
      double double0 = mullerSolver0.getResult();
      assertEquals((-0.014629147162944722), double0, 0.01);
      
      double double1 = mullerSolver0.solve(1.0E-15, 0.0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-662.548123254415), 0.0, (-3339.6255652)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-187.691548), (-3213.0));
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
  public void test21()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-662.548123254415), 0.0, (-3339.6255652)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-662.548123254415), (-662.548123254415));
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
  public void test22()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-662.548123254415), 0.0, (-3339.6255652)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = 0.07714923209954816;
      doubleArray0[1] = (-3339.6255652);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve2(4.9E-324, (-0.4386739998382182));
      try { 
        mullerSolver1.solve((-9.547950402609419E45), 0.09650982296282273);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-63.498315339725806), 1.5823999263996849, 0.8092424804089048);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(0.8092424804089048, (-0.33197801923208925));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.8092424804089048,-0.33197801923208925]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-1353.18758258);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-1353.18758258), 393.13759978, (-4.9E-324));
      // Undeclared exception!
      try { 
        mullerSolver0.solve2(0.045085232298326616, (-1353.18758258));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.045085232298326616,-1353.18758258]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-1963.697274), 0.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(840.9, 1744.315859974047);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [840.9,1744.315859974047]  Values: [840.9,1744.315859974047]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(0.0, 0.8092424804089048);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(4.0, 0.0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve2((-0.33197801923208925), 4.9E-324);
      double double0 = mullerSolver0.getResult();
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-0.33197801923208925), 0.5, 1.0E-6);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve(Double.NEGATIVE_INFINITY, 1.0, (-836.86442843673));
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
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2242.07533031865);
      doubleArray0[6] = 0.08393463718766991;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1847.535025344308), (-3.552606467643212), (-1082.6656039073198));
      // Undeclared exception!
      try { 
        mullerSolver0.solve(0.08137831069582013, 1140.51487, 1.0E-6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=0.08137831069582013 initial=1.0E-6 upper=1140.51487
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      doubleArray0[2] = (-4.9E-324);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-1364.4912681243793), 549.29836592, 1.0);
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
      doReturn(1.0, 1.0, 1255.5123124575, 1.0, (-775.627)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1.0, 1255.5123124575);
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
  public void test32()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-63.498315339725806);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-2.0), 2241.0, (-1.5407251058692517E-6));
      assertEquals((-1.540725065751758E-6), double0, 0.01);
      
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction0);
      double double1 = mullerSolver1.solve2((-1058.3789695937985), (-3381.8));
      assertEquals((-1058.3789695937985), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1353.18758258);
      doubleArray0[2] = (-1353.18758258);
      doubleArray0[3] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-1353.18758258), 549.29836592, 1.0);
      assertEquals(0.0, double0, 0.01);
      
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve2((-4.9E-324), 3411.25961945949);
      assertEquals(1353.1883215750372, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve2((-123.62159955663262), 0.8092424804089048);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1963.697274), 1771.1236705856284, (-1.0));
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve2((-71.783047232441), 0.8092424804089048);
      assertEquals((-3.1554436208840472E-30), double0, 0.01);
      
      mullerSolver0.solve((-1963.697274), 0.0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), 0.07714923209954816, 0.07714923209954816, 0.07714923209954816, (-1.0)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve((-1.0), 8.382470332767603E11);
      try { 
        mullerSolver0.solve2((-1.0), 4.9E-324);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.5, 1255.5123124575);
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence((-60.065935555606664), 0.5, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-60.065935555606664 initial=0.5 upper=0.5
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve((-0.014629147162944722), 94.779518746516, 87.7282774544);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve(0.0, 0.8092424804089048);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-63.498315339725806), 1.5823999263996849, 0.8092424804089048);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-63.498315339725806), 1.5823999263996849, (-63.498315339725806));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-63.498315339725806 initial=-63.498315339725806 upper=1.5823999263996849
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-63.498315339725806);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-63.498315339725806), 34.682794030718824);
      double double0 = mullerSolver0.getResult();
      assertEquals((-1.5407251058692517E-6), double0, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2241.0;
      doubleArray0[4] = (-63.498315339725806);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-0.742600689614912), 2241.0);
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
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      
      mullerSolver0.setFunctionValueAccuracy((-0.33197801923208925));
      mullerSolver0.solve2((-0.33197801923208925), 4.9E-324);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver1.solve((-0.33197801923208925), 0.8092424804089048);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve2(0.0, 0.0);
      try { 
        mullerSolver0.solve((-1992.34106), Double.POSITIVE_INFINITY);
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve((-3525.9326181686), 0.07714923209954816);
      assertEquals((-3525.9326181686), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-2398.574909942311), 1698.59201488);
      assertEquals((-2398.574909942311), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2.3611636735119457), 35.261, 35.261, 35.261, (-2.3611636735119457)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      
      double double0 = mullerSolver0.solve((-2.3611636735119457), 35.261);
      assertEquals(16.449913974770784, double0, 0.01);
      
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-3853.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve2((-2.3611636735119457), 1510.35851285);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.setFunctionValueAccuracy((-0.33197801923208925));
      mullerSolver0.solve2((-0.33197801923208925), 4.9E-324);
      try { 
        mullerSolver0.solve(Double.NEGATIVE_INFINITY, 1.0E-6);
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
      doReturn((-662.548123254415), 0.0, (-3339.6255652)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (-3339.6255652);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve(775.627, (-3339.6255652));
      assertEquals((-3339.6255652), double0, 0.01);
      
      double double1 = mullerSolver1.solve((-662.548123254415), 2008.0, 100.0);
      assertEquals((-1.7523257047577716E-6), double1, 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-2.3611636735119457);
      doubleArray0[1] = (-3853.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction1.derivative();
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(1044.6324034301294, (-3853.0));
      assertEquals(1044.6324034301294, double0, 0.01);
      
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve2((-2.3611636735119457), 1510.35851285);
      assertEquals((-6.128117501977539E-4), double1, 0.01);
      assertEquals(1.0E-6, mullerSolver1.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve2((-0.33197801923208925), 4.9E-324);
      try { 
        mullerSolver0.solve(Double.NEGATIVE_INFINITY, 1.0E-6);
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
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.isBracketing(0.8092424804089048, 0.0, polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve(0.0, 0.0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-2398.574909942311);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver1.solve((-1.0), 3.141592653589793);
      assertEquals(2.704455304423048E-6, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-3525.9326181686), 0.07714923209954816);
      assertEquals((-3525.9326181686), double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1353.18758258);
      doubleArray0[2] = (-1353.18758258);
      doubleArray0[3] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(1.0, 2008.0, 2.0);
      try { 
        mullerSolver0.solve((-1199.2488803551057), 1353.1883215750372);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-1.0), (-1.0), 0.07714923209954816).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-2398.574909942311);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve((-1.0), 3.141592653589793);
      try { 
        mullerSolver0.solve2(1.0E-14, 3.141592653589793);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve2((-2.0), 0.8092424804089048);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve(1.0E-15, 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.setFunctionValueAccuracy((-0.33197801923208925));
      mullerSolver0.solve2((-0.33197801923208925), 4.9E-324);
      double double0 = mullerSolver0.solve((-0.33197801923208925), 0.5, 1.0E-6);
      assertEquals((-0.33197801923208925), mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-4.9E-324);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve((-1353.18758258), 549.29836592, 1.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(1.0, 2008.0, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1.0,2008.0]  Values: [-1.0E-323,-1.984E-320]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-63.498315339725806);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-2.0), 2241.0, (-1.5407251058692517E-6));
      assertEquals((-1.540725065751758E-6), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-2.0), 34.682794030718824);
      assertEquals(9.194673193756985E-7, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[8] = (-3339.6255652);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      mullerSolver0.solve2(2910.3350722826317, 0.0);
      double double0 = mullerSolver0.solve((-662.548123254415), 2008.0, 100.0);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-0.0016313707298302293), double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-63.498315339725806);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction1);
      double double0 = mullerSolver0.solve((-63.498315339725806), 34.682794030718824);
      assertEquals((-1.5407251058692517E-6), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-2.0), 34.682794030718824);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(9.194673193756985E-7, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.solve((-1963.697274), 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1963.697274), 1771.1236705856284, (-1.0));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 0.8092424804089048;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      mullerSolver0.solve((-1963.697274), 1771.1236705856284, (-1.0));
      // Undeclared exception!
      try { 
        mullerSolver0.solve(840.9, 1744.315859974047);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [840.9,1744.315859974047]  Values: [840.9,1744.315859974047]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }
}
