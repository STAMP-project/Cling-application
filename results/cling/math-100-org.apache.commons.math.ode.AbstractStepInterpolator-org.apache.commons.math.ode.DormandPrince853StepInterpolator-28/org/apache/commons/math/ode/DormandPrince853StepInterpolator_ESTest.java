/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 10:37:39 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
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
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(0, 0, 0).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      dormandPrince853StepInterpolator0.storeTime(1500.622224001772);
      ObjectInput objectInput1 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput1).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput1).readDouble();
      doReturn(0, 0, 0).when(objectInput1).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput1);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
      assertEquals(0.0, dormandPrince853StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[1][5];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderConverter0, doubleArray0, doubleArray1, true);
      assertTrue(dormandPrince853StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(0, 0, 0).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator1 = new DormandPrince853StepInterpolator(dormandPrince853StepInterpolator0);
      assertEquals(0.0, dormandPrince853StepInterpolator1.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator1 = new DormandPrince853StepInterpolator(dormandPrince853StepInterpolator0);
      assertEquals(Double.NaN, dormandPrince853StepInterpolator1.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(7);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(2.382468931778144, 2.382468931778144, 2.382468931778144, 1382.93, 0.0).when(objectInput0).readDouble();
      doReturn(324, 6, 637).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getPreviousTime(), 0.01);
  }
}
