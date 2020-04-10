/*

 * Tue Mar 03 15:00:43 GMT 2020
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
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[4];
      CostFunction costFunction1 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3393.95, (double)7, 530.707939553347, (-5809.7799824564345), 681.46995627).when(costFunction1).cost(any(double[].class));
      ConvergenceChecker convergenceChecker1 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(convergenceChecker1).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray1 = new double[4][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      nelderMead0.minimize(costFunction1, 0, convergenceChecker1, doubleArray1, 2, (-1L));
      try { 
        nelderMead0.minimize(costFunction0, 7, convergenceChecker0, doubleArray0, doubleArray0, 81, (long) 81);
        fail("Expecting exception: ConvergenceException");
      
      } catch(ConvergenceException e) {
         //
         // none of the 81 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)7, (double)7, (-2021.1), (-2021.1), 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[3];
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
}
