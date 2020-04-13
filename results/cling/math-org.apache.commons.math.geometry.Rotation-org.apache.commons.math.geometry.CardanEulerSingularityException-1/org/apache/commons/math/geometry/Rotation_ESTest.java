/*

 * Tue Mar 03 15:50:46 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
import org.apache.commons.math.geometry.NotARotationMatrixException;
import org.apache.commons.math.geometry.Rotation;
import org.apache.commons.math.geometry.RotationOrder;
import org.apache.commons.math.geometry.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Rotation_ESTest extends Rotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(0.5, 736507.303123544, 0.09361216218660043, (-1644.641566451964), true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {2.5723885760867356E-7, 0.0044660489469666685, (-3.141591295255583)}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      assertEquals((-0.002233022617779045), rotation0.getQ3(), 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      assertEquals(0.9999975068016477, rotation0.getQ1(), 0.01);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(0.0, 0.0, (-1382.48021), (-5584.0334), true);
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
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, (-1.0), false);
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
  public void test03()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, (-1.0));
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, (-13.006389812200146), true);
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
  public void test04()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.applyInverseTo(rotation0);
      Rotation rotation1 = new Rotation(0.0, 0.0, (-1.0), 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
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
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, 736507.303123544, 0.09361216218660043, (-1644.641566451964), true);
      rotation0.applyInverseTo(rotation0);
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
  public void test06()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, (-1.0));
      Rotation rotation1 = new Rotation(0.0, (-0.8360786704813704), 0.0, 0.0, true);
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
      try { 
        rotation1.getAngles(rotationOrder1);
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
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, (-1.0));
      Rotation rotation1 = new Rotation(0.0, (-0.8360786704813704), 0.0, 0.0, true);
      assertEquals((-1.0), rotation1.getQ1(), 0.01);
      
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertEquals(1.0, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {(-1.5707963267948966), 1.0, 1.5707963267948966}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.9101868888080973, 1.9101868888080973, 1.9101868888080973, (-223.846585), true);
      Rotation rotation1 = new Rotation(1017.7924072682559, (-223.846585), 0.25, 1861.80511007, false);
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
  public void test09()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.25, (-127.61732895), 1.1131174306118465);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-2.891592653589793), (-1.187969847181522), (-2.0284752229779466)}, doubleArray0, 0.01);
      assertEquals(2.033636198646156, rotation0.getAngle(), 0.01);
      
      Rotation rotation1 = new Rotation(0.25, 0.25, (-823.1), 1.1131174306118465, true);
      assertEquals(3.0372949621173395E-4, rotation1.getQ1(), 0.01);
      assertEquals(0.0013523463856969435, rotation1.getQ3(), 0.01);
      assertEquals((-0.9999989933275129), rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
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
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
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
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, (-1.0));
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, (-13.006389812200146), true);
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-0.9999999999), (-0.9999999999), 0.25, (-922.03226454363), true);
      RotationOrder rotationOrder1 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.applyInverseTo(rotation0);
      RotationOrder rotationOrder1 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, (-1.0));
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.9999999999, (-0.9999999999), true);
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
  public void test16()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9999999999), (-0.9999999999), 0.25, (-922.03226454363), true);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation1 = new Rotation(238.4993077865, (-0.5), (-922.03226454363), (-2135.03930898361), false);
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
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation((-0.9999999999), (-0.9999999999), 0.25, (-922.03226454363), true);
      Rotation rotation1 = new Rotation(0.25, 2658.4930601427113, 0.25, 1.0539705956715077E11, false);
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
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation(0.0, 0.22984884706593015, (-1834.419095672), 0.0, true);
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
  public void test19()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.applyInverseTo(rotation0);
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
  public void test20()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.25, (-127.61732895), 1.1131174306118465);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(0.25, 0.25, (-823.1), 1.1131174306118465, true);
      Rotation rotation2 = null;
      try {
        rotation2 = new Rotation(doubleArray0, (-1811.0920066200285));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9999999999), (-0.9999999999), 0.25, (-922.03226454363), true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(2.7113985741774915E-4, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {(-2.8955294301194803), 3.1393567765813724, (-2.897698550759319)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      RotationOrder rotationOrder1 = RotationOrder.YZY;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder1);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation((-18.902480135107982), (-18.902480135107982), (-18.902480135107982), (-18.902480135107982), true);
      Rotation rotation1 = rotation0.revert();
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
  public void test24()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
  }
}
