/*

 * Tue Mar 03 14:55:56 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DormandPrince853StepInterpolator_ESTest extends DormandPrince853StepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn((-30.674084731089398), (-30.674084731089398), (-2928.1), 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(5, 5, 132).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(132);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      dormandPrince853StepInterpolator0.writeBaseExternal(objectOutputStream0);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(1.3333333333333333, (-4055.1196183949), 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(159, 0, 0).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      StepInterpolator stepInterpolator0 = dormandPrince853StepInterpolator0.doCopy();
      assertTrue(stepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn((-30.674084731089398), (-30.674084731089398), (-2928.1), 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(5, 5, 132).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      dormandPrince853StepInterpolator0.doCopy();
      assertEquals(0.0, dormandPrince853StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[0][4];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderDifferentialEquations0, doubleArray0, doubleArray1, true);
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.computeInterpolatedState(0.0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.DormandPrince853StepInterpolator", e);
      }
  }
}
