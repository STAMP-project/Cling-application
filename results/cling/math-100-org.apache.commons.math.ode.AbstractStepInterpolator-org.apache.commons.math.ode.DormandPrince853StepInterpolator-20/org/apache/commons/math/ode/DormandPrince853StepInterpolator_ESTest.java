/*

 * Tue Mar 03 14:56:56 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
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
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[10];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      dummyStepInterpolator0.writeExternal(objectOutput0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(0, 0, 0).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      dormandPrince853StepInterpolator0.writeExternal(objectOutput0);
      assertFalse(dormandPrince853StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(0, 0, 0).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      dormandPrince853StepInterpolator0.computeInterpolatedState((-2140.3056254), (-2140.3056254));
      assertFalse(dormandPrince853StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      StepInterpolator stepInterpolator0 = dormandPrince853StepInterpolator0.doCopy();
      assertNotSame(dormandPrince853StepInterpolator0, stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn((-1542.0), 0.0, (-1542.0), (-3.4046500868740456E-4), 6.8812326946963).when(objectInput0).readDouble();
      doReturn(10, 10, 16).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      StepInterpolator stepInterpolator0 = dormandPrince853StepInterpolator0.doCopy();
      assertNotSame(dormandPrince853StepInterpolator0, stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[0][9];
      dormandPrince853StepInterpolator0.reinitialize((FirstOrderDifferentialEquations) null, doubleArray0, doubleArray1, true);
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.computeInterpolatedState(0.0, 3099.6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.DormandPrince853StepInterpolator", e);
      }
  }
}
