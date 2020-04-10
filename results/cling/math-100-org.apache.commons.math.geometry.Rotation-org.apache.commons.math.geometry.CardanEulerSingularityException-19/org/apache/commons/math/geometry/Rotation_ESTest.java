/*

 * Tue Mar 03 15:52:52 GMT 2020
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
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.9999999999, 0.9999999999);
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(3513.88494138, (-1054.9129), 0.9999999999, 3513.88494138, false);
      assertEquals(3513.88494138, rotation1.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      rotation0.applyInverseTo(rotation0);
      Rotation rotation1 = new Rotation(0.0, 0.0, 2.0, (-3522.810627594959), true);
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
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
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
  public void test04()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation1.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation((-3.172423206), 0.0, 1.0249339392440847E39, (-0.1), true);
      rotation0.revert();
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
  public void test06()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(Double.NaN, Double.NaN, Double.NaN, Double.NaN, true);
      Rotation rotation1 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.applyInverseTo(rotation0);
      Vector3D vector3D1 = Vector3D.minusI;
      Vector3D vector3D2 = vector3D1.orthogonal();
      Rotation rotation1 = new Rotation(vector3D2, vector3D1, vector3D1, vector3D2);
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
      Rotation rotation0 = new Rotation(9.298, 9.298, 8.98247269981453E7, 0.9999999999999998, true);
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.0, 1.0, 1.0, 1.0, true);
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
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1844.3499055529717), (-1844.3499055529717), (-1844.3499055529717), (-1844.3499055529717), false);
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
  public void test12()  throws Throwable  {
      Rotation rotation0 = new Rotation(10.289768753699796, 0.0, 0.0, 10.289768753699796, true);
      Rotation rotation1 = new Rotation();
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
  public void test13()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.1), (-0.1), (-0.1), 0.7071067811865475, false);
      Rotation rotation1 = new Rotation();
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
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation1.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ3(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ2(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation((-1.0), 0.9999967715981617, (-1.0), (-1.0), true);
      Rotation rotation1 = new Rotation(483.7, (-89.119), (-89.119), 0.0, false);
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
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      rotation1.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation1.getQ3(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ2(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rotation rotation0 = new Rotation((-473.731), (-473.731), 0.0, 0.0, true);
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
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1016.0), (-1016.0), (-1309.4612493633153), 0.6311929544574291, false);
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
  public void test19()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.applyInverseTo(rotation0);
      Rotation rotation1 = new Rotation(0.6, 0.6, 3461.62, 3461.62, true);
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
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.0, 1.0, 1.0, 1.0, true);
      Rotation rotation1 = new Rotation();
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
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1844.3499055529717), 1917.977579931027, 1917.977579931027, 1917.977579931027, false);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
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
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 3153.372718);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-0.9685149280774379), (-0.9685149280774379), (-0.9685149280774379));
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-0.9685149280774379));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(Double.NaN, Double.NaN, Double.NaN, Double.NaN, true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      Rotation rotation1 = new Rotation(0.9999999999, 0.9999999999, 0.0, 0.0, false);
      Rotation rotation2 = rotation1.revert();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
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
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ2(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1289.20108274203), (-0.19), (-0.19));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.1480947702147115), (-0.19000000000000003), (-0.19)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation((-20.56575232135358), 0.0, 0.0, (-20.56575232135358), true);
      rotation0.revert();
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
