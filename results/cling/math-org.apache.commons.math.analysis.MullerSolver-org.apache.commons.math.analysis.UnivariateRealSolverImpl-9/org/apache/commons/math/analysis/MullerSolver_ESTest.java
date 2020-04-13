/*

 * Tue Mar 03 14:53:35 GMT 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.MullerSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
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
      doReturn(1.0E-6, 0.0, 4.9E-324).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(0.0, 349.4216946);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, 0.5, 1.0E-15, 1.0E-6, (-1175.13806)).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      try { 
        mullerSolver1.solve2((-2739.9792811), Double.POSITIVE_INFINITY);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, (-35.28108510802));
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
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, (-35.28108510802));
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
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 3890803.1234211;
      doubleArray0[3] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1.0), 319.213481121011, 1.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-2220.717711888359), Double.POSITIVE_INFINITY, (-2220.717711888359));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-2220.717711888359 initial=-2220.717711888359 upper=Infinity
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3890803.123421066, 4.0, 1.0, 3890803.123421066, (-2870.39295)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2870.39295), 3890803.123421066);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 3890803.1234205817;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        mullerSolver1.solve((-1.0), 2.0, 22.2475);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1.0 initial=22.2475 upper=2.0
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.1911403293330407E-58, 0.0, 1.1911403293330407E-58, 1.1911403293330407E-58, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(1.1911403293330407E-58, 1.1911403293330407E-58);
      assertEquals(1.1911403293330407E-58, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(1.1911403293330407E-58, 0.0);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1405.634331), 776.9699263302, 1.0E-15);
      try { 
        mullerSolver0.solve2((-1170.095550802711), Double.POSITIVE_INFINITY);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 1.0E-15, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(1.0E-15, 0.0);
      assertEquals(1.0E-15, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(634.0965622196524, 1.0E-6);
      assertEquals(1.0E-6, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1796.7), (-2814.576476061), (-1796.7), (-2814.576476061), 1788.44).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-2814.576476061), 1788.44, (-1796.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1796.7,1788.44]  Values: [1788.44,1788.44]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 3890803.1234211;
      doubleArray0[2] = (-2870.39295);
      doubleArray0[3] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(Double.POSITIVE_INFINITY, (-2.570163454919587E-7));
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-2220.717711888359), Double.POSITIVE_INFINITY, (-2220.717711888359));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-2220.717711888359 initial=-2220.717711888359 upper=Infinity
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-1769.356907491177);
      doubleArray0[4] = (-1769.356907491177);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      
      double double0 = mullerSolver0.solve2((-1769.356907491177), 0.0);
      assertEquals((-0.6299605249471206), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-1769.356907491177), 4.9E-324, 0.0);
      assertEquals((-0.6299605249474141), double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-499.1), (-431.81671503), (-499.1), (-1.0), 1789.4424447209328).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = 1789.4424447209328;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction1 = polynomialFunction0.derivative();
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction1);
      mullerSolver0.solve((-1.0), 2.0);
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction0);
      try { 
        mullerSolver1.solve2((-564.84), (-2.0));
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
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2(1.0E-15, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-864.40069764903), 1057.390821, 3.141592653589793);
      assertEquals(0.17619981673367485, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1.0), 319.213481121011, 1.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-2220.717711888359), Double.POSITIVE_INFINITY, (-2220.717711888359));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-2220.717711888359 initial=-2220.717711888359 upper=Infinity
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-6, 0.0, 4.9E-324).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(0.0, 349.4216946);
      assertEquals(349.4216946, double0, 0.01);
      
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, 0.5, 1.0E-15, 1.0E-6, (-1175.13806)).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      assertEquals(1.0E-6, mullerSolver1.getAbsoluteAccuracy(), 0.01);
      
      double double1 = mullerSolver1.solve2(0.0, 1.0E-15);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0000000005E-6, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 3890803.123421066;
      doubleArray0[2] = (-2870.39295);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1.0), 319.213481121011, 1.0);
      assertEquals((-2.570163454919609E-7), double0, 0.01);
      
      mullerSolver0.solve2((-2.570163454919609E-7), (-2.570163454919609E-7));
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1233.496121247292), 3003.86215672489);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(3003.86215672489, 3157.8160362144376, 3157.8160362144376);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [3003.86215672489,3157.8160362144376]  Values: [2.206784866945861E9,3.1311781740963464E9]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(0.0, (-35.28108510802));
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-1170.095550802711), 1170.376);
      assertEquals(0.1402255986445223, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 3890803.123421066;
      doubleArray0[2] = (-2870.39295);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-2.570163454919609E-7), (-2.570163454919609E-7));
      assertEquals((-2.570163454919609E-7), double0, 0.01);
      
      double double1 = mullerSolver0.solve(1.0, (-2.570163454919609E-7));
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-2.570163454919609E-7), double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0E-15;
      doubleArray0[1] = (-2612.774);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-2870.39295), 1.0135054084142362E-9);
      assertEquals((-3.9668583736548906E-17), double0, 0.01);
      
      double double1 = mullerSolver0.solve(0.0, 1234.892661583425);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 3890803.123421066;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1.0), 319.213481121011, 1.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(1.0, 3890803.123421066);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1.0,3890803.123421066]  Values: [3890803.123421066,1.5138348945223123E13]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.1911403293330407E-58, 0.0, 1.1911403293330407E-58, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(1.1911403293330407E-58, 1.1911403293330407E-58);
      assertEquals(1.1911403293330407E-58, double0, 0.01);
      
      double double1 = mullerSolver0.solve2(1.1911403293330407E-58, (-1788.11));
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.1911403293330407E-58, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1170.095550802711), 1.0E-15);
      assertEquals((-0.8656979721997963), double0, 0.01);
      
      mullerSolver0.getResult();
      double double1 = mullerSolver0.solve((-0.9113502703680123), 0.0);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.1911403293330407E-58, 0.0, 1.1911403293330407E-58).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1.1911403293330407E-58, 1.1911403293330407E-58);
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1442.415653710148), 0.0, (-1442.415653710148)).when(univariateRealFunction0).value(anyDouble());
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
  public void test25()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-6, 0.0, 4.9E-324).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, 0.5, 1.0E-15, 1.0E-6, (-1769.356907491177)).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      double double0 = mullerSolver1.solve(6.283185307179586, 1341.39);
      assertEquals(6.283185307179586, double0, 0.01);
      
      double double1 = mullerSolver0.solve(6.283185307179586, (-571.1));
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-571.1), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, (-35.28108510802));
      try { 
        mullerSolver0.solve2((-1891.0559225102), 1658607.1331049483);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2516.777183187449), 1.0E-15, (-35.28108510802));
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-21.8612945473238), (-390.8898), (-1453.69));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-21.8612945473238,-390.8898]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.1911403293330407E-58, 0.0, 1.1911403293330407E-58, 0.0, 1.1911403293330407E-58).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve(1.1911403293330407E-58, 0.0);
      mullerSolver0.solve(0.0, 0.0, 0.0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(0.0, 1.1911403293330407E-58);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.0,1.1911403293330407E-58]  Values: [1.1911403293330407E-58,1.1911403293330407E-58]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 3890803.123421066;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1.0), 319.213481121011, 1.0);
      double double0 = mullerSolver0.getResult();
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1405.634331), 776.9699263302, 1.0E-15);
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
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1170.095550802711), 1.0E-15, (-35.28108510802));
      assertEquals((-0.9113502703680123), double0, 0.01);
      
      double double1 = mullerSolver0.getResult();
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals((-0.9113502703680123), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1170.095550802711), 1.0E-15, (-35.28108510802));
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
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, (-35.28108510802));
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
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1170.095550802711), 1.0E-15, (-35.28108510802));
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-2315.5132942661057), (-1.0), 1.0E-14, (-2315.5132942661057)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-1.0), 1.0E-14);
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
  public void test36()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3890803.123421066, 4.0, 1.0, 3890803.123421066, (-2870.39295)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve((-2870.39295), 3890803.123421066);
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
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1170.095550802711), 1.0E-15, (-35.28108510802));
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
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-5.619892380561663);
      doubleArray0[5] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve(Double.NEGATIVE_INFINITY, 2255.81393817209, (-178.0));
      assertEquals(1412.3606197284626, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-5417.8965), 2607.6);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1412.3606197284628, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 1.0E-6).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, 0.5, 1.0E-6, (-1.0), 787.67).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      double double0 = mullerSolver0.solve((-1.0), (-1769.356907491177));
      assertEquals((-1.0), double0, 0.01);
      
      double double1 = mullerSolver1.solve2(831.4, 1969.4722031241736);
      assertEquals(1400.4361015620868, double1, 0.01);
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1796.7), (-1796.7), (-1796.7), (-1796.7), 1787.8046853400385).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      try { 
        mullerSolver0.solve((-1796.7), 1787.8046853400385);
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
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve(0.0, (-1370.3095432));
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1370.3095432), 3.0276697890447773E13, 3.0276697890447773E13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1370.3095432 initial=3.0276697890447773E13 upper=3.0276697890447773E13
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1170.095550802711), 1.0E-15, (-35.28108510802));
      assertEquals((-0.9113502703680123), double0, 0.01);
      
      double double1 = mullerSolver0.solve(0.0, (-35.28108510802));
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, 0.5, 1.0E-15, (-1.0), 787.67).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      mullerSolver1.solve((-1769.356907491177), (-2.0));
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
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2870.39295), 787.67);
      double double0 = mullerSolver0.getResult();
      assertEquals(8.387659954817558E-6, double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve2((-1769.356907491177), 1.0E-14);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, (-1769.356907491177), 1.0E-15, 1.0E-15, (-1769.356907491177)).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      try { 
        mullerSolver1.solve((-1769.356907491177), 1.0E-6);
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
      doReturn(0.0, 0.0, 1.0E-6).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve2((-1769.356907491177), 1.0E-14);
      assertEquals((-1769.356907491177), double0, 0.01);
      
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      double double1 = mullerSolver1.solve((-1.0), (-1769.356907491177));
      assertEquals(100, mullerSolver1.getMaximalIterationCount());
      assertEquals(1.0E-15, mullerSolver1.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver1.getRelativeAccuracy(), 0.01);
      assertEquals((-1.0), double1, 0.01);
      assertEquals(1.0E-6, mullerSolver1.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, 1473.0260553, 1.0E-15, 1.0E-6, (-1769.356907491177)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      mullerSolver0.solve2((-1518.4), 2410.23);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(1.0E-6, 1473.0260553);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1.0E-6,1473.0260553]  Values: [-1769.356907491177,-1769.356907491177]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve2((-1170.095550802711), 1.0E-15);
      mullerSolver0.solve(0.0, (-35.28108510802));
      double double0 = mullerSolver0.getResult();
      assertEquals((-0.8656979721997963), double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve((-965.572888984045), 20.3237482, (-17.64054255401));
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.15521816858434767, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 1.0E-15, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double double0 = mullerSolver0.solve(0.0, 1.0E-15);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-2385.2401461), 1.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0, double1, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-2612.774);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2612.774), 0.39206600823121596, (-1905.998));
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, 0.5, 1.0E-15, 1.0E-6, (-1769.356907491177)).when(univariateRealFunction1).value(anyDouble());
      MullerSolver mullerSolver1 = new MullerSolver(univariateRealFunction1);
      double double0 = mullerSolver1.solve(6.283185307179586, 1341.39);
      assertEquals(6.283185307179586, double0, 0.01);
      
      double double1 = mullerSolver0.solve(6.283185307179586, (-571.1));
      assertEquals(double1, double0, 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(6.283185307179586, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1170.095550802711), 1.0E-15, (-35.28108510802));
      try { 
        mullerSolver0.solve2((-1891.0559225102), 1658607.1331049483);
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
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2((-1170.095550802711), 1.0E-15);
      assertEquals((-0.8656979721997963), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-864.40069764903), 1057.390821, 3.141592653589793);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.17619981673367485, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-2315.463217452342), (-1.0), 26.05112226609369, (-2315.463217452342)).when(univariateRealFunction0).value(anyDouble());
      MullerSolver mullerSolver0 = new MullerSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[17];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver1 = new MullerSolver(polynomialFunction0);
      mullerSolver1.solve((-1.0), 0.0);
      try { 
        mullerSolver0.solve(0.0, 6.283185307179586);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1170.095550802711), 1.0E-15, (-35.28108510802));
      assertEquals((-0.9113502703680123), double0, 0.01);
      
      double double1 = mullerSolver0.solve2((-1170.095550802711), 1170.376);
      assertEquals(0.1402255986445223, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-2516.777183187449), 1.0E-15, (-35.28108510802));
      assertEquals((-0.9113502703680123), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-864.40069764903), 1057.390821, 3.141592653589793);
      assertEquals(0.17619981673367485, double1, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 3890803.123421066;
      doubleArray0[3] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-1.0), 319.213481121011, 1.0);
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
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-499.1);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-499.1), 1518.4199265014);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals((-1.9324311927890277E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve2(1.0E-15, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      
      double double1 = mullerSolver0.solve((-2516.777183187449), 1.0E-15, (-35.28108510802));
      assertEquals((-0.9113502703680123), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-864.40069764903), 1057.390821, 3.141592653589793);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-21.8612945473238), (-390.8898), (-1453.69));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-21.8612945473238,-390.8898]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.solve((-1170.095550802711), 1.0E-15, (-35.28108510802));
      assertEquals((-0.9113502703680123), double0, 0.01);
      
      double double1 = mullerSolver0.solve((-0.9113502703680123), 0.0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.solve((-2516.777183187449), 1.0E-15, (-35.28108510802));
      // Undeclared exception!
      try { 
        mullerSolver0.solve((-1170.095550802711), 2705.2170631, 2705.2170631);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-1170.095550802711 initial=2705.2170631 upper=2705.2170631
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }
}
