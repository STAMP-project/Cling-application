/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:09:54 GMT 2019
 */

package org.apache.commons.math.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.CostFunction;
import org.apache.commons.math.optimization.MultiDirectional;
import org.apache.commons.math.optimization.NelderMead;
import org.apache.commons.math.optimization.PointCostPair;
import org.apache.commons.math.random.RandomVectorGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(550.866883142684, (-2.0), 245.346894316247, 295.2, 245.346894316247).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[2];
      nelderMead0.minimize(costFunction0, 0, convergenceChecker0, doubleArray0, doubleArray0, 2, (-1L));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(245.346894316247, 245.346894316247, 245.346894316247, 245.346894316247, 245.346894316247).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[6];
      PointCostPair pointCostPair0 = nelderMead0.minimize(costFunction0, 39, convergenceChecker0, doubleArray0, doubleArray0, 39, (long) 0);
      assertEquals(245.346894316247, pointCostPair0.getCost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[3];
      NelderMead nelderMead0 = new NelderMead();
      try { 
        nelderMead0.minimize(costFunction0, 1175, convergenceChecker0, doubleArray0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // none of the 1 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(245.346894316247).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray0 = new double[1][1];
      PointCostPair pointCostPair0 = nelderMead0.minimize(costFunction0, 0, convergenceChecker0, doubleArray0, 0, (long) 0);
      assertEquals(245.346894316247, pointCostPair0.getCost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(Double.NaN, 4259.72);
      // Undeclared exception!
      try { 
        multiDirectional0.getMinima();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(245.346894316247, 245.346894316247).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      MultiDirectional multiDirectional0 = new MultiDirectional();
      double[][] doubleArray0 = new double[2][8];
      // Undeclared exception!
      try { 
        multiDirectional0.minimize(costFunction0, 1134, convergenceChecker0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.optimization.MultiDirectional", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead(1.0E-11, 1.0E-11, 1.0E-11, 1.0E-11);
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nelderMead0.minimize(costFunction0, 0, convergenceChecker0, (RandomVectorGenerator) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(6124.895831521672, 1765.854);
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        multiDirectional0.minimize(costFunction0, (-1040), convergenceChecker0, (RandomVectorGenerator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }
}
