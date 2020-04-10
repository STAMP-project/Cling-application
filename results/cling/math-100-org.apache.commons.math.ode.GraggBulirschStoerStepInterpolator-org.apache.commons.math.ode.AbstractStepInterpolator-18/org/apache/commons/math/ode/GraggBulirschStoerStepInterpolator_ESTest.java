/*

 * Tue Mar 03 14:51:08 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerStepInterpolator_ESTest extends GraggBulirschStoerStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(0, 0).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator1.readExternal(objectInput0);
      graggBulirschStoerStepInterpolator1.computeCoefficients(5, (-1916.2372743369));
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator2 = null;
      try {
        graggBulirschStoerStepInterpolator2 = new GraggBulirschStoerStepInterpolator(graggBulirschStoerStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[0][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator1.computeCoefficients(5, 19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[4][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      graggBulirschStoerStepInterpolator0.computeCoefficients((-1), 2021.3248769);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
      
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 706.0, (double)48).when(objectInput0).readDouble();
      doReturn(5, 48).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[0][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      graggBulirschStoerStepInterpolator1.copy();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.computeCoefficients(48, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 706.0, (double)48).when(objectInput0).readDouble();
      doReturn(5, 48).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutput0);
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.computeCoefficients(48, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }
}
