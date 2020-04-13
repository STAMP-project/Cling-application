/*

 * Tue Mar 03 15:52:56 GMT 2020
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
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(935126.6804, 1.5688006143768712E35, 1904.53767, 0.0, true);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals(0.9999999999999999, rotation1.getQ1(), 0.01);
      assertEquals(5.960774567719257E-30, rotation1.getQ0(), 0.01);
      assertEquals(1.2140087481776539E-32, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.revert();
      assertEquals(Double.NaN, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 731.8990603758476, 3001.290515830836, (-1.0));
      Rotation rotation1 = new Rotation(6.21022347084206E273, 6.21022347084206E273, 2338.88496, 3001.290515830836, true);
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
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D1 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      Rotation rotation1 = new Rotation((-2388.132852476998), (-970.28247), Double.NaN, 3644.595148962899, true);
      RotationOrder rotationOrder1 = RotationOrder.YXY;
      try { 
        rotation0.getAngles(rotationOrder1);
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
      Rotation rotation0 = new Rotation(0.0, 647.0523347611434, 0.0, 0.0, false);
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
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D1 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
      Rotation rotation1 = new Rotation((-544.14455), (-1732.060690311), (-544.14455), (-544.14455), true);
      RotationOrder rotationOrder1 = RotationOrder.XYX;
      try { 
        rotation0.getAngles(rotationOrder1);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
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
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 3405440.3519172776, 2464.5900180956455, 3.141592653589793);
      RotationOrder rotationOrder1 = RotationOrder.YZY;
      Rotation rotation1 = new Rotation(3.141592653589793, 508.213, 3.141592653589793, 3405440.3519172776, true);
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
  public void test08()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(935126.6804, 1.5688006143768712E35, 1904.53767, 0.0, true);
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
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 2.465190328815662E-32, 0.9999962166548859, 2.465190328815662E-32);
      Vector3D vector3D0 = Vector3D.plusK;
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
      Vector3D vector3D1 = rotation0.applyInverseTo(vector3D0);
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D1, vector3D0);
      Rotation rotation1 = new Rotation(vector3D2, vector3D0);
      Rotation rotation2 = rotation1.applyInverseTo(rotation0);
      Rotation rotation3 = rotation2.applyInverseTo(rotation1);
      try { 
        rotation3.getAngles(rotationOrder1);
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
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-0.999999999999998), (-0.999999999999998), (-0.999999999999998), 1028.23267315919, true);
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
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(1.8882141233485212, 1.8882141233485212, 119.6675, 119.6675, false);
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
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation((-1108.0), (-1108.0), 0.9999, (-2445.126084), true);
      Rotation rotation1 = new Rotation((-0.999999999999998), (-2445.126084), 0.9999999999, 0.9999, false);
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
  public void test13()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.999999999999998), (-0.999999999999998), (-0.999999999999998), 1028.23267315919, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-0.7863707056155905), 0.0027507626214206557, (-2.357167032410487)}, doubleArray0, 0.01);
      assertEquals((-9.725411449649149E-4), rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = rotation0.applyTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation((-1.0), (-1.0), (-1.0), 1.0, true);
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
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation((-2.7355635032362153), (-2.7355635032362153), (-2.7355635032362153), (-2.7355635032362153), true);
      assertEquals((-0.5), rotation1.getQ2(), 0.01);
      assertEquals(2.0943951023931953, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), (-1.0), 5747198.43);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-0.9999999999999993), (-1.0000000000000004), 0.2454493678494654}, doubleArray0, 0.01);
      assertEquals((-0.7362212996722389), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-544.14455), (-1732.060690311), (-544.14455), (-544.14455), true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.999999999999998), (-0.999999999999998), (-0.999999999999998), 0.9999999999999996, true);
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
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.9999999999, 451.61122386, 0.9999999999, (-0.42850621361016483), false);
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
  public void test22()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation0 = new Rotation(0.5, 0.5, 0.5, 0.5, true);
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
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation0 = new Rotation(0.5, 3.141592653589793, 0.5, 3.141592653589793, false);
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
      Rotation rotation0 = new Rotation((-0.999999999999998), 0.5, (-0.999999999999998), (-27.9979625876931), false);
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
      Rotation rotation0 = new Rotation((-0.999999999999998), (-0.999999999999998), (-0.999999999999998), 1028.23267315919, true);
      Rotation rotation1 = new Rotation();
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
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      rotation0.revert();
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
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.999999999999998), (-0.999999999999998), (-0.999999999999998), 1028.23267315919, true);
      double[][] doubleArray0 = rotation0.getMatrix();
      assertEquals(3, doubleArray0.length);
      
      Rotation rotation1 = new Rotation(doubleArray0, 0.6966458658577674);
      assertEquals((-9.725411449649149E-4), rotation1.getQ2(), 0.01);
      assertEquals(0.9999985812445757, rotation0.getQ3(), 0.01);
      assertEquals((-9.725411449649149E-4), rotation0.getQ2(), 0.01);
      assertEquals((-9.725411449649149E-4), rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      rotation0.applyTo(rotation0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.6966458658577674);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 3405440.3519172776, 2464.5900180956455, 3.141592653589793);
      Rotation rotation1 = new Rotation(3405440.3519172776, 3.141592653589793, 2464.5900180956455, 2464.5900180956455, true);
      assertEquals(0.0020469933211930027, rotation1.getAngle(), 0.01);
      assertEquals(0.9999994762273385, rotation1.getQ0(), 0.01);
      
      RotationOrder rotationOrder1 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertArrayEquals(new double[] {0.0, 1.039315745532318, 1.5602149723421734}, doubleArray0, 0.01);
      assertEquals(1.8117439488153912, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.999999999999998), (-0.999999999999998), (-0.999999999999998), 1028.23267315919, true);
      Rotation rotation1 = new Rotation(1028.23267315919, (-0.999999999999998), (-637.536193969634), (-637.536193969634), false);
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
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation((-0.999999999999998), (-0.999999999999998), (-0.999999999999998), (-0.999999999999998), true);
      assertEquals((-0.5), rotation1.getQ0(), 0.01);
      assertEquals((-0.5), rotation1.getQ3(), 0.01);
      assertEquals(2.0943951023931953, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 2.465190328815662E-32, 0.9999962166548859, 2.465190328815662E-32);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {2.465190328815662E-32, 0.999996216654886, 2.465190328815662E-32}, doubleArray0, 0.01);
      assertEquals((-1.6726406943595057E-32), rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.999999999999998), (-0.999999999999998), (-0.999999999999998), (-0.999999999999998), true);
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
}
