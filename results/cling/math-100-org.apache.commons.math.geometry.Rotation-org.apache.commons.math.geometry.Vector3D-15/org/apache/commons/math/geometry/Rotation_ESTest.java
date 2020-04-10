/*

 * Tue Mar 03 15:51:08 GMT 2020
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
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, (-2070.292));
      Vector3D vector3D1 = rotation0.getAxis();
      assertEquals((-3.141592653589793), vector3D1.getAlpha(), 0.01);
      assertEquals((-0.008779245056073071), rotation0.getQ0(), 0.01);
      assertEquals(-0.0, vector3D1.getX(), 0.01);
      assertEquals(1.0, vector3D1.getZ(), 0.01);
      assertEquals(0.9999614616855219, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation((-1132.534170626), (-1132.534170626), 382.45534, 382.45534, false);
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
  public void test02()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 488.736668091473, 818.379, 2186.89);
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D0 = new Vector3D();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, 488.736668091473);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      
      double[][] doubleArray1 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray1, 501.22120278);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rotation rotation0 = new Rotation((-2726.9342461056176), (-2726.9342461056176), 9.980226263475014, 9.980226263475014, true);
      double double0 = rotation0.getAngle();
      assertEquals(1.5708097212677221, double0, 0.01);
      assertEquals(0.0025879019325926785, rotation0.getQ2(), 0.01);
      assertEquals((-0.7071020455094068), rotation0.getQ1(), 0.01);
      assertEquals((-0.7071020455094068), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-0.31018283565098054));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-0.31018283565098054));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D1 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation();
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
  public void test09()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.0, 0.0, 0.0, 1.0, false);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
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
  public void test10()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-0.19), (-3234.49386332), (-2241.54377367));
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D0 = new Vector3D();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, (-389.0));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1316.7698363341801), 0.9999999999999978, 0.9999999999999978, 0.9999999999999978, false);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
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
  public void test12()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-2365.461627287), (-2365.461627287), (-2365.461627287));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.15764086611448017, (-0.15764086611448025), 0.15764086611448017}, doubleArray0, 0.01);
      assertEquals(0.2654813348833962, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Vector3D vector3D1 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
  public void test14()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation();
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
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), 2665.9294652735834, 2665.9294652735834);
      Vector3D vector3D0 = rotation0.getAxis();
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(0.19087743704538898, vector3D0.getZ(), 0.01);
      assertEquals(0.846327000501889, vector3D1.getAlpha(), 0.01);
      assertEquals(3.1290019911406666, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      // Undeclared exception!
      try { 
        vector3D0.orthogonal();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // null norm
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles((RotationOrder) null);
      double[][] doubleArray0 = new double[0][9];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, Double.NaN);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[][] doubleArray0 = new double[3][8];
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder1);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x8 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][6];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-2673.651597811611));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Vector3D vector3D1 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation();
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
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1374.0), (-2691.54495667), (-1087.6682665), (-1130.708571373), false);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
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
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-2365.461627287), (-2365.461627287), (-2365.461627287));
      double double0 = rotation0.getAngle();
      assertEquals(0.012361113853613591, rotation0.getQ3(), 0.01);
      assertEquals(2.9859104555022054, double0, 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals(0.9968952775480188, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Vector3D vector3D1 = Vector3D.zero;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D1, vector3D0, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        Vector3D.angle(vector3D0, vector3D1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // null norm
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = new Vector3D((-2670.26726), vector3D0, (-2670.26726), vector3D0, (-2670.26726), vector3D0);
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      assertEquals(-0.0, vector3D1.getDelta(), 0.01);
      assertEquals(0.9999999999999999, rotation0.getQ3(), 0.01);
      assertEquals(0.0, rotation0.getQ0(), 0.01);
      assertEquals(-0.0, vector3D1.getY(), 0.01);
      assertEquals(-0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.applyTo(vector3D0);
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(Double.NaN, vector3D2.getNorm(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][8];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x8 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, 3.141592653589793);
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
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
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
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals((-1.5707963267948966), vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D1 = rotationOrder0.getA2();
      double double0 = Vector3D.angle(vector3D1, vector3D0);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(1.5707963267948966, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      Rotation rotation0 = new Rotation(doubleArray0, 1.893261826040903);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      double[] doubleArray1 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, 2.0943951023931957, 3.141592653589793}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Rotation rotation0 = new Rotation();
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
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(0.0, vector3D0.getY(), 0.01);
      assertEquals((-1.0), vector3D0.getX(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-0.19), (-3234.49386332), (-2241.54377367));
      double double0 = rotation0.getAngle();
      assertEquals(0.6070570107236, rotation0.getQ0(), 0.01);
      assertEquals((-0.4012801199381305), rotation0.getQ1(), 0.01);
      assertEquals(1.8368889265739052, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1.5997458975998446), (-1.5997458975998446), (-1.5997458975998446), (-1.5997458975998446), false);
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
}
