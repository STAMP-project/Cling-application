/*

 * Tue Mar 03 15:51:17 GMT 2020
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
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 67.02151950288973, 3.141592653589793, 3.141592653589793);
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals((-5.3015343500636375E-17), rotation0.getQ0(), 0.01);
      assertEquals(0.5240368887520366, vector3D0.getDelta(), 0.01);
      assertEquals((-0.8658062641007631), vector3D0.getX(), 0.01);
      assertEquals(3.063939963778951E-17, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(0.9414537912490922, 6.162975822039155E-33, 3458.539774713, (-1436.3956018085), false);
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
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-76378.39364603278), (-76378.39364603278), (-76378.39364603278));
      double[][] doubleArray0 = new double[3][4];
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x4 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = new Vector3D();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, 525.117883224);
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 1.0, 0.9999999999, 298.272679739);
      double[][] doubleArray0 = rotation0.getMatrix();
      double[] doubleArray1 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.9999999999999997, 0.9999999999000002, 2.962970301559447}, doubleArray1, 0.01);
      
      Rotation rotation1 = new Rotation(doubleArray0, 0.6331248967298331);
      assertEquals(2.5371858797171436, rotation0.getAngle(), 0.01);
      assertEquals((-0.297624463535725), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = rotation0.getAxis();
      Rotation rotation1 = new Rotation(vector3D0, 203.319618261);
      double[][] doubleArray0 = rotation1.getMatrix();
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      double[] doubleArray1 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.5707963267948966), 2.2576884312532206, 1.5707963267948966}, doubleArray1, 0.01);
      
      Rotation rotation2 = new Rotation(doubleArray0, 203.319618261);
      assertEquals(0.0, rotation2.getQ3(), 0.01);
      assertEquals(2.257688431253221, rotation1.getAngle(), 0.01);
      assertEquals((-0.4277048281989605), rotation2.getQ0(), 0.01);
      assertEquals(0.0, rotation2.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = rotation0.getAxis();
      Rotation rotation1 = new Rotation(vector3D0, 203.319618261);
      double[][] doubleArray0 = rotation1.getMatrix();
      Rotation rotation2 = new Rotation(doubleArray0, 203.319618261);
      double double0 = rotation2.getAngle();
      assertEquals(-0.0, rotation1.getQ2(), 0.01);
      assertEquals((-0.4277048281989605), rotation2.getQ0(), 0.01);
      assertEquals(0.0, rotation2.getQ3(), 0.01);
      assertEquals(2.2576884312532206, double0, 0.01);
      assertEquals((-0.9039184586760566), rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      Rotation rotation0 = new Rotation(1.0, 1.0, 681122.278993838, 1.0, true);
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
  public void test08()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-76378.39364603278), (-76378.39364603278), (-76378.39364603278));
      double[][] doubleArray0 = new double[3][4];
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder1);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x4 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, (-1436.3956018085));
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][2];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-1892.702));
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
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(821.10704664, 774.5976457290129, 821.10704664, 821.10704664, false);
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
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(0.9651450910001605, 2057.9985741663, 649.0066872561694, 2057.9985741663, false);
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
      Rotation rotation0 = new Rotation();
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rotation rotation0 = new Rotation(958.8761228443663, (-6.624753161274846E10), 5.9145062476799995E7, 1.2597934811702036E29, false);
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
      Vector3D vector3D0 = Vector3D.minusJ;
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][2];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 1.0, (-1.0), 1.0);
      Vector3D vector3D0 = rotation0.getAxis();
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(0.6923626978336089, vector3D0.getY(), 0.01);
      assertEquals((-0.7071067811865476), vector3D1.getY(), 0.01);
      assertEquals(0.5656758145325667, rotation0.getQ0(), 0.01);
      assertEquals((-0.20314474961744228), vector3D0.getZ(), 0.01);
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
      Rotation rotation0 = new Rotation(1.0, 1.0, 8.829987043425575, 8.829987043425575, false);
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = new Vector3D();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, 525.117883224);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation(2317.021303962637, 2317.021303962637, 2317.021303962637, 2317.021303962637, true);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
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
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.6486836335988968), 0.6646247741555764, (-682.336985576226), 0.5403023058681398, true);
      double double0 = rotation0.getAngle();
      assertEquals((-9.506781005391542E-4), rotation0.getQ0(), 0.01);
      assertEquals(3.1396912971023108, double0, 0.01);
      assertEquals(7.918398788788584E-4, rotation0.getQ3(), 0.01);
      assertEquals((-0.9999987602220306), rotation0.getQ2(), 0.01);
      assertEquals(9.740406341994726E-4, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D1);
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
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(1.5707963267948966, vector3D1.getDelta(), 0.01);
      assertEquals(3.141592653589793, vector3D1.getAlpha(), 0.01);
      assertEquals(1.0, vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.applyInverseTo(vector3D0);
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(0.0, vector3D2.getZ(), 0.01);
      assertEquals((-1.5707963267948966), vector3D0.getDelta(), 0.01);
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
      Vector3D vector3D0 = Vector3D.minusJ;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      rotation0.getAngles(rotationOrder0);
      assertEquals((-1.0), vector3D0.getY(), 0.01);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 67.02151950288973, 3.141592653589793, 3.141592653589793);
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
  public void test34()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals((-1.5707963267948966), vector3D1.getDelta(), 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = new Vector3D((-1.0), vector3D0, (-1214.99778892), vector3D0, (-0.9999999894077938), vector3D0, (-2812.026), vector3D0);
      double double0 = Vector3D.angle(vector3D0, vector3D1);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(4029.023788909408, vector3D1.getNorm(), 0.01);
      assertEquals(-0.0, vector3D1.getDelta(), 0.01);
      assertEquals(-0.0, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, (-1436.3956018085));
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      RotationOrder rotationOrder1 = RotationOrder.ZYX;
      double[] doubleArray1 = rotation0.getAngles(rotationOrder1);
      double[][] doubleArray2 = new double[3][2];
      doubleArray2[0] = doubleArray0;
      doubleArray2[1] = doubleArray1;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray2, 2586.4641142);
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
      Rotation rotation0 = new Rotation((-0.1), (-2382.3922), (-0.6), 0.9998793145874947, true);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][9];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-0.1));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-1099.35));
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
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double double0 = rotation0.getAngle();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      rotation0.getAngles(rotationOrder0);
      assertEquals((-1.0), vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, vector3D0.getX(), 0.01);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[1][6];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, Double.NaN);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 1x6 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }
}
