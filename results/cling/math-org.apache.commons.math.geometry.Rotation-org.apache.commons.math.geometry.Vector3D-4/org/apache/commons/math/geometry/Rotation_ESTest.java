/*

 * Tue Mar 03 15:50:14 GMT 2020
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
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, 614.7);
      Vector3D vector3D1 = rotation0.getAxis();
      assertEquals(0.8647821010151645, rotation0.getQ0(), 0.01);
      assertEquals(-0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(-0.0, vector3D1.getDelta(), 0.01);
      assertEquals((-0.5021473068371449), rotation0.getQ1(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1346.40920551), (-1346.40920551), (-1346.40920551), (-1346.40920551), true);
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals((-0.6154797086703874), vector3D0.getDelta(), 0.01);
      assertEquals((-2.356194490192345), vector3D0.getAlpha(), 0.01);
      assertEquals((-0.5773502691896258), vector3D0.getY(), 0.01);
      assertEquals((-0.5), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(377909.90574972314, 377909.90574972314, 0.6, (-1438.037309527), false);
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
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = new double[3][1];
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 737.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x1 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, 614.7437724367146);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = Vector3D.zero;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, 614.7437724367146);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, 614.7437724367146);
      double[][] doubleArray0 = rotation0.getMatrix();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray1 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {1.0083876668848673, -0.0, -0.0}, doubleArray1, 0.01);
      
      Rotation rotation1 = new Rotation(doubleArray0, 614.7437724367146);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals(1.0083876668848675, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1733.8120749), (-1733.8120749), (-1733.8120749), 1739.709, true);
      double double0 = rotation0.getAngle();
      assertEquals((-0.499574678730429), rotation0.getQ2(), 0.01);
      assertEquals((-0.499574678730429), rotation0.getQ1(), 0.01);
      assertEquals(0.5012737985514164, rotation0.getQ3(), 0.01);
      assertEquals((-0.499574678730429), rotation0.getQ0(), 0.01);
      assertEquals(2.095377200614557, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
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
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = new double[3][1];
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 737.1818069435213);
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-1.0));
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
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D1 = Vector3D.plusJ;
      Vector3D vector3D2 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D1, vector3D2, vector3D2, vector3D0);
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
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-0.999999999999998), 74.76984158, 74.76984158);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.652852526844304, rotation0.getQ0(), 0.01);
      assertEquals(0.3037276351875801, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {2.1415926535897953, 0.6283821061550332, 2.5132105474347606}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D1 = rotationOrder0.getA1();
      Vector3D vector3D2 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D2, vector3D1, vector3D0);
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
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = new Vector3D(4363682.857249001, (-614.7437724367134), (-614.7437724367134));
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Vector3D vector3D2 = new Vector3D((-614.7437724367134), vector3D1, 0.0, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D2, (-827.38078246));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = Vector3D.minusJ;
      Vector3D vector3D2 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D2);
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
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
  public void test16()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.8990394386084923), (-0.8990394386084923), (-0.8990394386084923), (-0.8990394386084923), true);
      rotation0.getAngles((RotationOrder) null);
      double[][] doubleArray0 = new double[2][9];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-0.8990394386084923));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 2x9 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(285.1957123486, 285.1957123486, (-0.19));
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals((-4.7108098989583454E-4), vector3D0.getDelta(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals((-0.7853981633974483), vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][5];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-1.0));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation((-992.5873097771621), 0.3857195095274214, 10.643836042112342, (-992.5873097771621), false);
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
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(1.0, vector3D0.getZ(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = Vector3D.zero;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D1, vector3D0, vector3D1);
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
      Vector3D vector3D0 = new Vector3D();
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
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.applyInverseTo(vector3D0);
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(0.0, vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, (-3076.20809905));
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
  public void test31()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 2302.954270043469, (-2516.0708073905), (-2849.21984));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.1668549621505794, 2.7966845186652036, 0.2046968059422634}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
      assertEquals((-1.5707963267948966), vector3D1.getDelta(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(3.141592653589793, vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Vector3D vector3D2 = rotationOrder0.getA2();
      double double0 = Vector3D.angle(vector3D1, vector3D2);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, 614.7);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      RotationOrder rotationOrder1 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder1);
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 1.2339422214695826E7);
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-1.0));
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
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, (-564.0));
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.0);
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
  public void test40()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, 614.7437724367146);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-2517.082005));
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
      Rotation rotation0 = new Rotation((-0.0010877829172637157), 1.0, 1.0, 0.0, true);
      double double0 = rotation0.getAngle();
      assertEquals(0.7071065720117838, rotation0.getQ2(), 0.01);
      assertEquals(0.7071065720117838, rotation0.getQ1(), 0.01);
      assertEquals(3.1400542965386635, double0, 0.01);
      assertEquals((-7.691784497193239E-4), rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double double0 = rotation0.getAngle();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, 614.7437724367146);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {1.0083876668848673, -0.0, -0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }
}
