/*

 * Tue Mar 03 14:50:54 GMT 2020
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
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[1][2];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      graggBulirschStoerStepInterpolator1.computeCoefficients((-1), 0.0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getPreviousTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator1.isForward());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[5][3];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator1.computeCoefficients(115, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[0][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = (GraggBulirschStoerStepInterpolator)graggBulirschStoerStepInterpolator0.doCopy();
      graggBulirschStoerStepInterpolator1.computeCoefficients(1, 0.0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getPreviousTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator1.isForward());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[0][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      graggBulirschStoerStepInterpolator0.computeCoefficients(1, 0.0);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator1.copy();
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
      doReturn((-742.3690362232828), (-742.3690362232828), (-742.3690362232828), 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(7, 7).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      graggBulirschStoerStepInterpolator0.doCopy();
      assertEquals(0.0, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(0.0, 929.4396, 16.0, 929.4396).when(objectInput0).readDouble();
      doReturn(0, 0).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      graggBulirschStoerStepInterpolator0.finalizeStep();
      graggBulirschStoerStepInterpolator0.computeCoefficients((-1), (-794.9057878));
      assertEquals(929.4396, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[0][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutput0);
      graggBulirschStoerStepInterpolator0.computeCoefficients(1, 0.0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn((-742.3690362232828), (-742.3690362232828), (-742.3690362232828), 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(7, 7).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutput0);
      assertEquals(0.0, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }
}
