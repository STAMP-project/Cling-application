/*

 * Tue Mar 03 15:50:51 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
import org.apache.commons.math.geometry.NotARotationMatrixException;
import org.apache.commons.math.geometry.Rotation;
import org.apache.commons.math.geometry.RotationOrder;
import org.apache.commons.math.geometry.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Rotation_ESTest extends Rotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rotation rotation0 = new Rotation((-884.3880100351365), 865.3, 1280.0, 0.25, true);
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals(0.5600507471404959, vector3D0.getX(), 0.01);
      assertEquals(0.8284582876919391, vector3D0.getY(), 0.01);
      assertEquals((-0.49677771904402923), rotation0.getQ0(), 0.01);
      assertEquals(1.618082600209068E-4, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation(2030.5, (-106.91792477957802), (-1.7998199999999998), (-106.91792477957802), false);
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
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(1825.9167791816287, (-621.316300002), (-1.0), 1825.9167791816287, true);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][2];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.6255495219867468);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x2 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation(1826.878718857436, 1826.878718857436, 1826.878718857436, (-0.4343164012407884), true);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D0 = new Vector3D();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, 0.5773502637511007);
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
      Vector3D vector3D0 = Vector3D.plusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(rotationOrder0, (-43.578361270532), Double.NaN, (-43.578361270532));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation((-884.3880100351365), 865.3, 1280.0, 0.25, true);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 865.3);
      assertEquals((-0.7190005666755865), rotation1.getQ2(), 0.01);
      
      double[] doubleArray1 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.7190005666755865, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {0.741518177347331, (-0.773731128734028), 1.6182393639915615}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation(1825.9167791816287, (-621.316300002), (-1.0), 1825.9167791816287, true);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][2];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 1.6255495219867468);
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
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
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
      Rotation rotation0 = new Rotation(1825.9167791816287, 1825.9167791816287, 1825.9167791816287, (-0.4343164012407884), true);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][2];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-1.592878705798528E28));
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
      Vector3D vector3D0 = Vector3D.plusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][1];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-0.9999999999));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation((-568.121690655856), (-568.121690655856), 1825.9167791816287, (-1.635268873873111E-4), false);
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
      Rotation rotation0 = new Rotation(1826.878718857436, 1826.878718857436, 1826.878718857436, (-0.4343164012407884), true);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D0 = new Vector3D();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, 0.5773502637511007);
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
      Rotation rotation0 = new Rotation(3146.7, 0.5403023058681398, 233130.63648436527, 0.5403023058681398, false);
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
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, (-0.5));
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[6][2];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 20.652592080582);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 6x2 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[6][2];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1193.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 6x2 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
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
      Rotation rotation0 = new Rotation((-0.1), (-0.1), 1911.1397, 0.0, false);
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation(2692.7885975, 2692.7885975, 2692.7885975, 110493.1408925834, false);
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
  public void test26()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-453.9391422576428), (-2056.601839158), (-453.9391422576428));
      double double0 = rotation0.getAngle();
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(3.118909564408915, double0, 0.01);
      assertEquals((-0.5400806978823939), rotation0.getQ3(), 0.01);
      assertEquals((-0.8415368171722226), rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(1.0, vector3D2.getZ(), 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(-0.0, vector3D2.getX(), 0.01);
      assertEquals(1.5707963267948966, vector3D2.getDelta(), 0.01);
      assertEquals(3.141592653589793, vector3D2.getAlpha(), 0.01);
      assertEquals((-1.0), vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.955336489125606, 1193.0, 1193.0, 20.652592080582, true);
      Vector3D vector3D0 = rotation0.getAxis();
      Vector3D vector3D1 = vector3D0.orthogonal();
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(0.7071067811865475, vector3D1.getY(), 0.01);
      assertEquals(5.661979846124321E-4, rotation0.getQ0(), 0.01);
      assertEquals((-0.012240451430578992), vector3D0.getDelta(), 0.01);
      assertEquals((-0.7070538094202948), vector3D0.getY(), 0.01);
      assertEquals(0.0, vector3D2.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Rotation rotation0 = new Rotation(1825.9167791816287, 1825.9167791816287, 1825.9167791816287, (-0.4343164012407884), true);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][2];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-1.592878705798528E28));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x2 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Vector3D vector3D1 = new Vector3D((-2691.15730658158), vector3D0, (-2691.15730658158), vector3D0, (-2691.15730658158), vector3D0);
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
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
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = Vector3D.minusJ;
      double double0 = Vector3D.angle(vector3D1, vector3D0);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Rotation rotation0 = new Rotation((-884.3880100351365), 865.3, 1280.0, 0.25, true);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.9658959304843218, 1.0151413713819342, 0.9664737647453733}, doubleArray0, 0.01);
      
      double[][] doubleArray1 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray1, 865.3);
      assertEquals(0.7190005666755865, rotation0.getQ2(), 0.01);
      assertEquals((-0.7190005666755865), rotation1.getQ2(), 0.01);
      assertEquals((-0.49677771904402923), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Rotation rotation0 = new Rotation(1825.9167791816287, 1825.9167791816287, (-1.0), 1825.9167791816287, true);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][2];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-1.592878705798528E28));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-0.6));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.955336489125606, 1193.0, 1193.0, 20.652592080582, true);
      double double0 = rotation0.getAngle();
      assertEquals(0.7070536960865748, rotation0.getQ2(), 0.01);
      assertEquals(0.7070536960865748, rotation0.getQ1(), 0.01);
      assertEquals(5.661979846124321E-4, rotation0.getQ0(), 0.01);
      assertEquals(0.012240143809173367, rotation0.getQ3(), 0.01);
      assertEquals(3.1404602575600644, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Rotation rotation0 = new Rotation(1825.9167791816287, 1825.9167791816287, 1825.9167791816287, (-0.4343164012407884), true);
      double double0 = rotation0.getAngle();
      assertEquals(0.5773502637453688, rotation0.getQ0(), 0.01);
      assertEquals(1.9106332495846703, double0, 0.01);
      assertEquals(0.5773502637453688, rotation0.getQ1(), 0.01);
      assertEquals(0.5773502637453688, rotation0.getQ2(), 0.01);
      assertEquals((-1.3732974671370037E-4), rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Rotation rotation0 = new Rotation(5.421010862427522E-20, 5.421010862427522E-20, 5.421010862427522E-20, 5.421010862427522E-20, true);
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
  public void test47()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(1.0, vector3D0.getX(), 0.01);
      assertEquals(0.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Rotation rotation0 = new Rotation((-720.407), (-1333.386), 438.213, 4800.966295285784, false);
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
}
