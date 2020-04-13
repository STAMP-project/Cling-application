/*

 * Tue Mar 03 14:55:51 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math.ode.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DormandPrince853StepInterpolator_ESTest extends DormandPrince853StepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[8][2];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutput0);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[1][5];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderDifferentialEquations0, doubleArray0, doubleArray1, true);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      dormandPrince853StepInterpolator0.writeExternal(objectOutput0);
      assertTrue(dormandPrince853StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(0, 0, 0).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      ObjectInput objectInput1 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput1).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput1).readDouble();
      doReturn(0, 0, 0).when(objectInput1).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput1);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[1][5];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderDifferentialEquations0, doubleArray0, doubleArray1, true);
      StepInterpolator stepInterpolator0 = dormandPrince853StepInterpolator0.doCopy();
      assertTrue(stepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator1 = new DormandPrince853StepInterpolator(dormandPrince853StepInterpolator0);
      assertEquals(Double.NaN, dormandPrince853StepInterpolator1.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[1][3];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderDifferentialEquations0, doubleArray0, doubleArray1, true);
      dormandPrince853StepInterpolator0.computeInterpolatedState((-121.62908488184713), (-121.62908488184713));
      assertTrue(dormandPrince853StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn((-3528.74), 0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(1, 0, 0).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
  }
}
