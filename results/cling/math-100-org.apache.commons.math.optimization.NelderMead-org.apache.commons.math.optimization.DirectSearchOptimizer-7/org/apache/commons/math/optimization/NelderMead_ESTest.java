/*

 * Tue Mar 03 15:01:32 GMT 2020
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
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1687.5792147).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker1 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker1).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray0 = new double[1][1];
      nelderMead0.minimize(costFunction0, 11, convergenceChecker1, doubleArray0, (-2499), (long) (-2499));
      CostFunction costFunction1 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction1).cost(any(double[].class));
      double[] doubleArray1 = new double[1];
      try { 
        nelderMead0.minimize(costFunction1, (-3841), convergenceChecker0, doubleArray1, doubleArray1, 11, 0L);
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 11 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      NelderMead nelderMead0 = new NelderMead();
      double[][] doubleArray0 = new double[1][1];
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(costFunction0).cost(any(double[].class));
      // Undeclared exception!
      try { 
        nelderMead0.minimize(costFunction0, 11, convergenceChecker0, doubleArray0, 11, (long) (-2499));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[2];
      try { 
        nelderMead0.minimize(costFunction0, 7, convergenceChecker0, doubleArray0, doubleArray0, 7, (long) 7);
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 7 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1845.694, 1845.694, (-1784.994189808), 1845.694, 1182.8164).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      nelderMead0.minimize(costFunction0, 2098, convergenceChecker0, doubleArray0, doubleArray0, 2098, (long) 2098);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[4];
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker1 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker1).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray1 = new double[1][1];
      nelderMead0.minimize(costFunction0, 11, convergenceChecker1, doubleArray1, (-2499), (long) (-2499));
      CostFunction costFunction1 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(9.223372036854776E18, 0.0, 0.0, (-1174.23), 0.0).when(costFunction1).cost(any(double[].class));
      nelderMead0.minimize(costFunction1, 11, convergenceChecker0, doubleArray0, doubleArray0);
      nelderMead0.iterateSimplex();
      nelderMead0.iterateSimplex();
  }
}
