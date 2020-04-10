/*

 * Tue Mar 03 14:55:22 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.HighamHall54StepInterpolator;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
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
      doReturn(false).when(objectInput0).readBoolean();
      doReturn((-1698.676741304), (-670.9405), (-482.3748587936501), (-482.3748587936501), 0.0).when(objectInput0).readDouble();
      doReturn(2, 2, 35).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      dormandPrince853StepInterpolator0.writeExternal(objectOutput0);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.writeExternal(objectOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DormandPrince853StepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn((-1698.676741304), (-670.9405), (-482.3748587936501), (-482.3748587936501), 0.0).when(objectInput0).readDouble();
      doReturn(2, 2, 35).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      dormandPrince853StepInterpolator0.computeInterpolatedState((-1.3020833333333333), (-1.3020833333333333));
      assertEquals(0.0, dormandPrince853StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      StepInterpolator stepInterpolator0 = highamHall54StepInterpolator0.doCopy();
      assertEquals(Double.NaN, stepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[6][8];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderConverter0, doubleArray0, doubleArray1, true);
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(1.7238497241035307, 1.7238497241035307, 1.7238497241035307, 1.7238497241035307, (double)7).when(objectInput0).readDouble();
      doReturn(589, 7, 589).when(objectInput0).readInt();
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.readExternal(objectInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.ode.DormandPrince853StepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn((-1698.676741304), (-670.9405), (-482.3748587936501), (-482.3748587936501), 0.0).when(objectInput0).readDouble();
      doReturn(2, 2, 35).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator1 = new DormandPrince853StepInterpolator(dormandPrince853StepInterpolator0);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getPreviousTime(), 0.01);
  }
}
