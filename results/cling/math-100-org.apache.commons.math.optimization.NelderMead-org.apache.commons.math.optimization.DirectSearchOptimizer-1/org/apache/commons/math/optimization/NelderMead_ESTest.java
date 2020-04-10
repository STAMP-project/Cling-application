/*

 * Tue Mar 03 15:00:48 GMT 2020
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
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[6];
      try { 
        nelderMead0.minimize(costFunction0, (-2035), convergenceChecker0, doubleArray0, doubleArray0, (-2035), (long) (-2035));
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 1 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray0 = new double[1][3];
      try { 
        nelderMead0.minimize(costFunction0, (-2134085238), convergenceChecker0, doubleArray0, 31, 0L);
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 31 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-12, 1.0E-12, 516.2256768473533, 516.2256768473533, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      nelderMead0.minimize(costFunction0, 647, convergenceChecker0, doubleArray0, doubleArray0);
      nelderMead0.iterateSimplex();
      CostFunction costFunction1 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)647, 1.0E-12, 1671.266778394792, 1671.266778394792, (-774.218968806377)).when(costFunction1).cost(any(double[].class));
      ConvergenceChecker convergenceChecker1 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true, true).when(convergenceChecker1).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray1 = new double[1][3];
      // Undeclared exception!
      nelderMead0.minimize(costFunction1, 647, convergenceChecker1, doubleArray1, 911, (-1L));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      try { 
        nelderMead0.minimize(costFunction0, 647, convergenceChecker0, doubleArray0, doubleArray0);
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 1 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-12, 1564.490585961, 516.2256768473533, 516.2256768473533).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      nelderMead0.minimize(costFunction0, 647, convergenceChecker0, doubleArray0, doubleArray0);
      nelderMead0.iterateSimplex();
      CostFunction costFunction1 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(costFunction1).cost(any(double[].class));
      ConvergenceChecker convergenceChecker1 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(convergenceChecker1).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray1 = new double[1][3];
      // Undeclared exception!
      try { 
        nelderMead0.minimize(costFunction1, 647, convergenceChecker1, doubleArray1, 911, (-1L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.optimization.NelderMead", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead(2.0, 2.0, 2.0, 2.0);
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)3, (double)3, (double)3, 1669.4, 2.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, true, true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[7];
      nelderMead0.minimize(costFunction0, 52, convergenceChecker0, doubleArray0, doubleArray0, 52, (long) 52);
      nelderMead0.iterateSimplex();
  }
}
