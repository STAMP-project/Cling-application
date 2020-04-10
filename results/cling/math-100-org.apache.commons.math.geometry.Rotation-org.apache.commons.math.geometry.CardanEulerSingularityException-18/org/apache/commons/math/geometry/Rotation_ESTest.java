/*

 * Tue Mar 03 15:52:40 GMT 2020
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
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(3602.288067285905, 3602.288067285905, 1.0, 3602.288067285905, true);
      assertEquals(1.9106332544128246, rotation1.getAngle(), 0.01);
      assertEquals(0.577350261774283, rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.9999, true);
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
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation((-2.220446049250313E-16), (-2.220446049250313E-16), (-2.220446049250313E-16), (-2.220446049250313E-16), false);
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
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(0.0, 2023.7248617845, 1612.3422846, 0.0, true);
      assertEquals(0.0, rotation1.getQ0(), 0.01);
      assertEquals(0.6231296071843876, rotation1.getQ2(), 0.01);
      assertEquals(0.7821185924463315, rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.revert();
      assertEquals(Double.NaN, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, (-4395.729422378598), (-4395.729422378598), true);
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation1 = new Rotation(0.0, 3.141592653589793, (-2.7755575615628914E-17), (-0.23580303087652166), true);
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
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-3878.9), 1.0, (-592.848));
      Rotation rotation0 = new Rotation(vector3D0, (-592.848));
      Rotation rotation1 = rotation0.revert();
      Vector3D vector3D1 = rotation1.getAxis();
      Rotation rotation2 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      try { 
        rotation2.getAngles(rotationOrder0);
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
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-1.0), (-1.0), 0.6, 0.6, true);
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
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Rotation rotation1 = rotation0.revert();
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
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(0.6, 1.0, (-2945.0), (-2945.0), true);
      Rotation rotation1 = new Rotation(vector3D0, 1.0);
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
  public void test11()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      Rotation rotation1 = new Rotation(vector3D0, 1.0);
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
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation((-737.16618179737), 0.0, 4607.168124485044, (-737.16618179737), true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.7853981633974483, 2.696527624177138, (-2.356194490192345)}, doubleArray0, 0.01);
      assertEquals((-0.15605874609859888), rotation0.getQ0(), 0.01);
      assertEquals(2.828194169982373, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(0.0, 2023.7248617845, 1612.3422846, 0.0, true);
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
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-3878.9), 1.0, (-592.848));
      Rotation rotation0 = new Rotation(vector3D0, (-592.848));
      Rotation rotation1 = rotation0.revert();
      assertEquals((-0.4408143844230372), rotation1.getQ0(), 0.01);
      assertEquals((-0.8872945580894059), rotation1.getQ1(), 0.01);
      assertEquals(2.2285811251188283, rotation1.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.29819595203183424, 2.182891334131921, 0.2987115621160569}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(3602.288067285905, 3602.288067285905, 1.0, 3602.288067285905, true);
      RotationOrder rotationOrder1 = RotationOrder.XYX;
      Vector3D vector3D1 = rotationOrder1.getA1();
      Rotation rotation1 = new Rotation(vector3D1, vector3D0);
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
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(0.0, (-0.7420624620533931), (-0.7420624620533931), (-678.7918693087872), false);
      Rotation rotation1 = new Rotation(vector3D0, (-4395.729422378598));
      Rotation rotation2 = rotation0.applyInverseTo(rotation1);
      try { 
        rotation2.getAngles(rotationOrder0);
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
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(1458.059881, 1966930.858193614, 450.70714051, (-1179.3), true);
      assertEquals(2.2914223037262852E-4, rotation1.getQ2(), 0.01);
      assertEquals(7.412864432791839E-4, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(rotationOrder0, 1.0, 1.0, (-1314.301424));
      assertEquals(1.367951496549312, rotation1.getAngle(), 0.01);
      assertEquals((-0.7750666571840364), rotation1.getQ0(), 0.01);
      assertEquals(0.13422952101413993, rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, (-4395.729422378598), (-4395.729422378598), true);
      Rotation rotation1 = rotation0.revert();
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
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, (-4395.729422379), (-4395.729422379), true);
      Rotation rotation1 = rotation0.revert();
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
  public void test21()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(0.9999999999, 0.9999999999, 1419.7952753655538, (-1.1999999999999975), false);
      Rotation rotation1 = new Rotation(0.9999999999, 1419.7952753655538, (-1.199999999999995), 0.35061946351161044, true);
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
      Rotation rotation0 = new Rotation(0.0, 0.0, (-4395.729422378598), (-4395.729422378598), true);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
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
      Rotation rotation0 = new Rotation((-1.0), (-1.0), (-1.0), (-0.9723221137823082), false);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation((-0.9441144954326106), 0.0, (-96.9908865283146), (-0.19), true);
      Rotation rotation1 = new Rotation((-0.19), 1.0, 1.0, 0.9999999999, false);
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
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, (-4395.729422378598), (-4395.729422378598), true);
      Vector3D vector3D0 = new Vector3D(0.0, 3.141592653589793, (-4395.729422378598));
      rotation0.revert();
      Vector3D vector3D1 = Vector3D.plusJ;
      Rotation rotation1 = new Rotation(vector3D0, vector3D0, vector3D1, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
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
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation((-55.97033), (-55.97033), (-55.97033), (-55.97033), true);
      Rotation rotation2 = null;
      try {
        rotation2 = new Rotation(doubleArray0, (-55.97033));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      rotation0.revert();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-55.97033));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, (-4395.729422378598), (-4395.729422378598), true);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertArrayEquals(new double[] {1.5707963267948966, 1.5707963267948968, 1.5707963267948966}, doubleArray0, 0.01);
      assertEquals((-0.7071067811865475), rotation0.getQ2(), 0.01);
      assertEquals((-0.7071067811865475), rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, (-4395.729422378598), (-4395.729422378598), true);
      Rotation rotation1 = rotation0.revert();
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
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation(920.934428685, 920.934428685, 920.934428685, 920.934428685, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.5707963267948966), 0.0, (-1.5707963267948966)}, doubleArray0, 0.01);
      assertEquals(0.5, rotation0.getQ2(), 0.01);
      assertEquals(0.5, rotation0.getQ1(), 0.01);
      assertEquals(0.5, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.revert();
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
  }
}
