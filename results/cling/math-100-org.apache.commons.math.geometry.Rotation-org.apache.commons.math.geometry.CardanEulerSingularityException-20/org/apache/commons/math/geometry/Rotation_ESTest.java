/*

 * Tue Mar 03 15:52:50 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
import org.apache.commons.math.geometry.Rotation;
import org.apache.commons.math.geometry.RotationOrder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Rotation_ESTest extends Rotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, (-0.7031390869812061), 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 3.141592653589793}, doubleArray0, 0.01);
      assertEquals((-1.0), rotation0.getQ1(), 0.01);
      assertEquals(0.0, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1447.186), (-1447.186), 0.6);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {1.0882133048947615, (-1.088213304894761), (-2.5415926535897935)}, doubleArray0, 0.01);
      assertEquals(2.1577318073974765, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(0.6666666666666666, 0.9999, (-0.055541), 147766.95637141372, true);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 1220.997747, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, (-0.7031390869812061), 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ2(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.6666666666666663, 0.6666666666666663, 0.6666666666666663);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.6666666666666663, 0.666666666666667, 0.6666666666666663}, doubleArray0, 0.01);
      assertEquals(0.7426296260914389, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      Rotation rotation1 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.applyTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation1 = new Rotation();
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation();
      rotation0.applyInverseTo(rotation0);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ2(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      Rotation rotation1 = new Rotation(1009.3523177459136, (-1897.49125), 1.02, 2.0, false);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 39.63442140541, true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, (-3.141592653589793)}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.applyTo(rotation0);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 4.939211227525376, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.revert();
      assertEquals(Double.NaN, rotation1.getQ2(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ0(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 1.4797544079922737E12, (-276.0488406447), 1.4797544079922737E12);
      Rotation rotation1 = new Rotation(1.4797544079922737E12, 1.4797544079922737E12, (-989.10030445), (-989.10030445), true);
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation(1449.48, 1449.48, 1449.48, 1449.48, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation1 = new Rotation(rotationOrder0, 1.0, 1.0, 0.0);
      RotationOrder rotationOrder1 = RotationOrder.YXZ;
      try { 
        rotation0.getAngles(rotationOrder1);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, (-1.0), true);
      try { 
        rotation0.getAngles((RotationOrder) null);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 39.63442140541, true);
      double[][] doubleArray0 = rotation0.getMatrix();
      assertEquals(0.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      
      Rotation rotation1 = new Rotation(doubleArray0, 0.0);
      Rotation rotation2 = rotation0.applyTo(rotation1);
      assertEquals(0.0, rotation2.getAngle(), 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals(1.0, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, (-1.0), true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, (-1.0), false);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      Rotation rotation1 = new Rotation(3956.07, 0.0, (-1930.962291891), (-1930.962291891), false);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation(11.12057882738636, 11.12057882738636, 11.12057882738636, 11.12057882738636, true);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(2958.06796, (-1.5882943301344886E-10), 3176.0, 2604.90173072536, false);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }
}
