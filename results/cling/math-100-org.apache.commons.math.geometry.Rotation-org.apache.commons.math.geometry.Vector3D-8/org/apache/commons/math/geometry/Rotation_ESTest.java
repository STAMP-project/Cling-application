/*

 * Tue Mar 03 15:48:35 GMT 2020
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
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 1354.8110755015243, (-4803.3742157), (-2617.96));
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals(2.2227610625514775, vector3D0.getAlpha(), 0.01);
      assertEquals((-0.7423696856044759), vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(0.40615602387227856, (-877.0), 3.141592653589793, 3.141592653589793, false);
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
      double[][] doubleArray0 = new double[3][5];
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 1596.4, 1596.4, 0.930535574400245);
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.5);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x5 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.zero;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation((-0.6), (-0.6), (-0.6), 3.141592653589793, true);
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, 1017.395057753105);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-0.999999999999998));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.0000000000000009);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.revert();
      double double0 = rotation1.getAngle();
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(3.141592653589793, 3.141592653589793, 0.0);
      Vector3D vector3D1 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      Vector3D vector3D2 = rotation0.getAxis();
      Vector3D vector3D3 = Vector3D.minusK;
      Rotation rotation1 = new Rotation(vector3D3, vector3D1, vector3D2, vector3D3);
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
  public void test08()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-33.746192069805765), 1.2246467991473532E-16, (-31.501845190651864));
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][1];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-33.746192069805765));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x1 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 1.2246467991473532E-16, (-31.501845190651864));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 39.885082924606);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.4999999999999999, 0.4999999999999999, 0.4999999999999999, 467.27, false);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9999999999), 4.442882938158366, (-1.0), 0.720836632844875, false);
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
  public void test13()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 3.141592653589793, 812658.5127157166, 0.0);
      RotationOrder rotationOrder1 = RotationOrder.ZYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertArrayEquals(new double[] {(-1.5707963267948968), 2.391729583921882, (-1.5707963267948966)}, doubleArray0, 0.01);
      assertEquals((-0.9305326966409487), rotation0.getQ2(), 0.01);
      assertEquals((-2.2423823014825727E-17), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.zero;
      Vector3D vector3D1 = new Vector3D(1.0, 1.0, (-2480.408400515));
      Rotation rotation0 = new Rotation(vector3D1, 1.0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, (-2480.408400515));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(0.25, 0.25, 0.25, (-1114.601697676551), false);
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
  public void test16()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation((-1526.659489892), (-0.999999999999998), (-0.999999999999998), 1047.384113, false);
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
  public void test17()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][3];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.0000000000000009);
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
      Rotation rotation0 = new Rotation(1177.8600497868335, 1177.8600497868335, 0.0, 1177.8600497868335, true);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {2.356194490192345, 1.2309594173407747, 2.356194490192345}, doubleArray0, 0.01);
      assertEquals(0.5773502691896257, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals((-1.5707963267948966), vector3D1.getDelta(), 0.01);
      assertEquals(3.141592653589793, vector3D1.getAlpha(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.zero;
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
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[2][2];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-2365.4889116));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 2x2 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation((-522.13022), (-522.13022), (-522.13022), (-522.13022), true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
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
  public void test23()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
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
  public void test24()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.0556216756888587E7, 1.0556216756888587E7, 0.0, 3.141592653589793, false);
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
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals((-1.0), vector3D0.getX(), 0.01);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.zero;
      Vector3D vector3D1 = Vector3D.plusK;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D1, vector3D0, vector3D1, vector3D0);
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
      Vector3D vector3D0 = Vector3D.zero;
      // Undeclared exception!
      try { 
        Vector3D.angle(vector3D0, vector3D0);
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
      Vector3D vector3D0 = new Vector3D(3.141592653589793, 3.141592653589793, 0.0);
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(0.9999999999999999, vector3D1.getNorm(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(0.7071067811865475, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(0.0, vector3D2.getZ(), 0.01);
      assertEquals(0.0, vector3D0.getX(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation();
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
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 3.141592653589793, 3.141592653589793, 3.141592653589793);
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
      Vector3D vector3D0 = new Vector3D(0.0, (-31.501845190651864), 0.0);
      Vector3D vector3D1 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      assertEquals(0.0, rotation0.getQ0(), 0.01);
      assertEquals(-0.0, rotation0.getQ1(), 0.01);
      assertEquals(-0.0, rotation0.getQ2(), 0.01);
      assertEquals(1.0, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(1.5707963267948966, vector3D1.getDelta(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, (-31.501845190651864), 0.0);
      Vector3D vector3D1 = Vector3D.plusJ;
      double double0 = Vector3D.angle(vector3D0, vector3D1);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D0 = new Vector3D(0.0, (-31.501845190651864), 0.0);
      Rotation rotation0 = new Rotation(vector3D0, 0.0);
      RotationOrder rotationOrder1 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder1);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][4];
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 1.2246467991473532E-16, (-31.501845190651864));
      RotationOrder rotationOrder1 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 39.885082924606);
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
      Rotation rotation0 = new Rotation();
      double[][] doubleArray0 = rotation0.getMatrix();
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      
      Rotation rotation1 = new Rotation(doubleArray0, 3677.21598703103);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-0.9999999999), (-0.9999999999), (-0.9999999999));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.47415988186583563, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {2.141592653689793, 0.9999999998999997, 2.141592653689793}, doubleArray0, 0.01);
      assertEquals(0.4794255385603239, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 1039.9700572, 1039.9700572, 1039.9700572);
      double double0 = rotation0.getAngle();
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals(0.9986770270777595, rotation0.getQ2(), 0.01);
      assertEquals(3.039248385064488, double0, 0.01);
      assertEquals(0.005281394775929619, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double double0 = rotation0.getAngle();
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Rotation rotation0 = new Rotation();
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
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, (-31.501845190651864), 0.0);
      Rotation rotation0 = new Rotation(vector3D0, 0.0);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, -0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getAngle(), 0.01);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }
}
