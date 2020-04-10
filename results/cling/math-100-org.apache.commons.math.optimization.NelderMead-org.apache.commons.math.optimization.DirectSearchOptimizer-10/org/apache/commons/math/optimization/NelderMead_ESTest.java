/*

 * Tue Mar 03 15:03:24 GMT 2020
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
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), 1.0E-11, (-292.3864600690712)).when(costFunction0).cost(any(double[].class));
      NelderMead nelderMead0 = new NelderMead();
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray0 = new double[3][6];
      try { 
        nelderMead0.minimize(costFunction0, (-148), convergenceChecker0, doubleArray0, (-2627), (long) (-148));
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
      doReturn((-3143.0), (-3143.0), 983.5753222861338, (-3143.0), (-3143.0)).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[3];
      try { 
        nelderMead0.minimize(costFunction0, 1299, convergenceChecker0, doubleArray0, doubleArray0, 0, (long) 1299);
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 1 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1577.8024), 2.0, 2.0, 2.0, (-1577.8024)).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true, true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[4][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      nelderMead0.minimize(costFunction0, 1081, convergenceChecker0, doubleArray1, 1081, (long) 1081);
      CostFunction costFunction1 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1577.8024), (-1577.8024), 2.0, (-1655.7087972616587), (double)2896).when(costFunction1).cost(any(double[].class));
      ConvergenceChecker convergenceChecker1 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker1).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      // Undeclared exception!
      nelderMead0.minimize(costFunction1, 137, convergenceChecker1, doubleArray0, doubleArray0, 137, 2566L);
  }
}
