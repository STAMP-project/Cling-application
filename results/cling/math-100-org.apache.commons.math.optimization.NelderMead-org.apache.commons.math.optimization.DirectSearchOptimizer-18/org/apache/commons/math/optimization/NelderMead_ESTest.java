/*

 * Tue Mar 03 15:04:11 GMT 2020
 */

package org.apache.commons.math.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.CostFunction;
import org.apache.commons.math.optimization.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NelderMead_ESTest extends NelderMead_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead(0.0, 0.5, 0.0, 43.69796118014651);
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray0 = new double[1][2];
      try { 
        nelderMead0.minimize(costFunction0, (-4180), convergenceChecker0, doubleArray0, 8, (-362L));
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 8 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2195.6351, 2304.42535828429, 2304.42535828429, 2195.6351, (-356.477892269)).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      nelderMead0.minimize(costFunction0, 2853, convergenceChecker0, doubleArray0, doubleArray0, 2853, (-1L));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[7];
      try { 
        nelderMead0.minimize(costFunction0, (-1534), convergenceChecker0, doubleArray0, doubleArray0, 55, (long) (-1534));
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 55 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2195.6351, 2667.23176583, 2195.6351, (-356.477892269)).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      nelderMead0.minimize(costFunction0, 8, convergenceChecker0, doubleArray0, doubleArray0, (-868), (long) 8);
      CostFunction costFunction1 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2195.6351).when(costFunction1).cost(any(double[].class));
      double[][] doubleArray1 = new double[1][7];
      // Undeclared exception!
      try { 
        nelderMead0.minimize(costFunction1, (-868), (ConvergenceChecker) null, doubleArray1, 8, (-1225L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2195.6351, 2667.23176583, 2195.6351, (-356.477892269), 2304.42535828429).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      nelderMead0.minimize(costFunction0, 8, convergenceChecker0, doubleArray0, doubleArray0, (-868), (long) 8);
      nelderMead0.iterateSimplex();
      CostFunction costFunction1 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2195.6351).when(costFunction1).cost(any(double[].class));
      double[][] doubleArray1 = new double[1][7];
      // Undeclared exception!
      try { 
        nelderMead0.minimize(costFunction1, (-868), (ConvergenceChecker) null, doubleArray1, 8, (-1225L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }
}
