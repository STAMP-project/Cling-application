/*

 * Tue Mar 03 14:50:35 GMT 2020
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
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(1151.987643504, 0.0, 0.0, 1151.987643504, (double)4).when(objectInput0).readDouble();
      doReturn(4, 4).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutput0);
      assertEquals(4.0, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[1][2];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getInterpolatedTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator1.isForward());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getPreviousTime(), 0.01);
      
      graggBulirschStoerStepInterpolator0.computeCoefficients((-1716), 2802.22527);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[7][8];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      graggBulirschStoerStepInterpolator0.computeCoefficients(2, (-3745.754));
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(0.0, (-1129.333715158), (-1129.333715158), 0.0).when(objectInput0).readDouble();
      doReturn(0, 0).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      graggBulirschStoerStepInterpolator0.computeCoefficients(0, (-1129.333715158));
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator2 = null;
      try {
        graggBulirschStoerStepInterpolator2 = new GraggBulirschStoerStepInterpolator(graggBulirschStoerStepInterpolator1);
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
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(0.0, (-1129.333715158), (-1129.333715158), 0.0).when(objectInput0).readDouble();
      doReturn(0, 0).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = (GraggBulirschStoerStepInterpolator)graggBulirschStoerStepInterpolator0.doCopy();
      graggBulirschStoerStepInterpolator1.computeCoefficients(0, (-1129.333715158));
      assertEquals(0.0, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(0.0, graggBulirschStoerStepInterpolator1.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      graggBulirschStoerStepInterpolator0.finalizeStep();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(0.0, (-1129.333715158), (-1129.333715158), 0.0).when(objectInput0).readDouble();
      doReturn(0, 0).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      graggBulirschStoerStepInterpolator0.computeCoefficients(0, (-1129.333715158));
      assertEquals(0.0, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(objectInput0).readBoolean();
      doReturn(0.0, (-1129.333715158), (-1129.333715158), 0.0).when(objectInput0).readDouble();
      doReturn(0, 0).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutput0);
      graggBulirschStoerStepInterpolator0.computeCoefficients(0, (-1129.333715158));
      assertEquals(0.0, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }
}
