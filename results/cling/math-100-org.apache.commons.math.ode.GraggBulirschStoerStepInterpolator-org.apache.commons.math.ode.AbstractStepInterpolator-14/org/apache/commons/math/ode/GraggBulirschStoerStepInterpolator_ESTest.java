/*

 * Tue Mar 03 14:49:27 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerStepInterpolator_ESTest extends GraggBulirschStoerStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[7][9];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getCurrentTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator1.isForward());
      
      graggBulirschStoerStepInterpolator0.computeCoefficients((-1295), 0.0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[12][8];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      graggBulirschStoerStepInterpolator0.computeCoefficients(0, (-2773.2184880602176));
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
      
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      double[][] doubleArray2 = new double[1][0];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray1, doubleArray2, true);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(graggBulirschStoerStepInterpolator0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator1.getPreviousTime(), 0.01);
      
      graggBulirschStoerStepInterpolator0.computeCoefficients(7, 1346.0);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      double[][] doubleArray2 = new double[1][0];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray1, doubleArray2, true);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      graggBulirschStoerStepInterpolator0.computeCoefficients(7, 1346.0);
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
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(0, 0).when(objectInput0).readInt();
      graggBulirschStoerStepInterpolator1.readExternal(objectInput0);
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
  public void test5()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn((-348.0), (-230.4), 0.0, (-230.4), 0.0).when(objectInput0).readDouble();
      doReturn(1, 1).when(objectInput0).readInt();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      double[][] doubleArray2 = new double[1][0];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray1, doubleArray2, true);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutput0);
      ObjectOutput objectOutput1 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutput1);
      graggBulirschStoerStepInterpolator0.computeCoefficients(7, 1346.0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[7][9];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      graggBulirschStoerStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
  }
}
