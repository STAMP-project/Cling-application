/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 10:38:24 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DormandPrince853StepInterpolator_ESTest extends DormandPrince853StepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[][] doubleArray1 = new double[1][1];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderConverter0, doubleArray0, doubleArray1, true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("getCause", true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      dormandPrince853StepInterpolator0.writeExternal(objectOutputStream0);
      assertTrue(dormandPrince853StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      double[] doubleArray0 = new double[9];
      dormandPrince853StepInterpolator0.interpolatedState = doubleArray0;
      dormandPrince853StepInterpolator0.currentState = doubleArray0;
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.computeInterpolatedState((-1.0), (-727.228437162));
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
      double[] doubleArray0 = new double[9];
      dormandPrince853StepInterpolator0.interpolatedState = doubleArray0;
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.computeInterpolatedState(0.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DormandPrince853StepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[][] doubleArray1 = new double[1][1];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderConverter0, doubleArray0, doubleArray1, true);
      dormandPrince853StepInterpolator0.computeInterpolatedState(0, 0);
      assertTrue(dormandPrince853StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      double[] doubleArray0 = new double[0];
      dormandPrince853StepInterpolator0.interpolatedState = doubleArray0;
      dormandPrince853StepInterpolator0.computeInterpolatedState((-1.0), (-1.0));
      dormandPrince853StepInterpolator0.computeInterpolatedState((-1.0), 634.706911215);
      assertEquals(Double.NaN, dormandPrince853StepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[0][2];
      dormandPrince853StepInterpolator0.reinitialize((FirstOrderDifferentialEquations) null, doubleArray0, doubleArray1, false);
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator1 = new DormandPrince853StepInterpolator(dormandPrince853StepInterpolator0);
      assertFalse(dormandPrince853StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.storeTime(1582.881444);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      StepInterpolator stepInterpolator0 = dormandPrince853StepInterpolator0.doCopy();
      assertNotSame(stepInterpolator0, dormandPrince853StepInterpolator0);
  }
}
