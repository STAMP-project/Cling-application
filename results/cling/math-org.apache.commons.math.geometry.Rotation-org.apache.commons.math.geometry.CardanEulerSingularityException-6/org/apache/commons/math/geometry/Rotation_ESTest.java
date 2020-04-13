/*

 * Tue Mar 03 15:52:06 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
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
      Rotation rotation0 = new Rotation(596.44, 3423.04940015192, (-1.0), 3003.0, true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.1298727365677899, rotation0.getQ0(), 0.01);
      assertEquals((-2.177465236533262E-4), rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {(-0.865608280878634), (-1.3454230048789029), (-2.0911913370592234)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(1.0, (-0.042647210051852645), (-2454.1), 1230.51113357928, false);
      assertEquals((-0.042647210051852645), rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(1675.4656306443173, 0.8122076972755887, 2.546165553810842E24, 2.546165553810842E24, true);
      rotation0.revert();
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
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation((-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), 3.141592653589793, true);
      Rotation rotation1 = new Rotation(vector3D0, 3.141592653589793);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotation1.applyInverseTo(rotation0);
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
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(0.1, 0.9999999999, 174.8064528696, (-2798.6), true);
      Vector3D vector3D1 = new Vector3D((-0.9980548681735015), vector3D0);
      Rotation rotation1 = new Rotation(vector3D0, vector3D1);
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
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation((-2798.6), 0.5663209849976987, (-0.9980548681735015), (-0.9980548681735015), false);
      Vector3D vector3D1 = new Vector3D((-0.9980548681735015), vector3D0);
      Rotation rotation1 = new Rotation(vector3D0, vector3D1);
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
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      Rotation rotation1 = new Rotation((-1111.705054767), 2.546165553810842E24, (-738.3259231), 702.8018218, true);
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
      Rotation rotation0 = new Rotation((-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), 3.141592653589793, true);
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation1 = new Rotation(vector3D0, 3.141592653589793);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
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
      Rotation rotation0 = new Rotation((-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), 3.141592653589793, false);
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation1 = new Rotation(vector3D0, 3.141592653589793);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
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
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
      
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation((-1111.705054767), (-738.3259231), (-738.3259231), (-1111.705054767), true);
      assertEquals(1.8818646429597785, rotation1.getAngle(), 0.01);
      assertEquals((-0.589034865048165), rotation1.getQ0(), 0.01);
      assertEquals((-0.39120062341168366), rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation((-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), true);
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
      Rotation rotation0 = new Rotation((-1.0), (-1.0), (-1.0), (-1.0), false);
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
      Rotation rotation0 = new Rotation((-2436.490638467027), (-2436.490638467027), (-2436.490638467027), 0.6, true);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation1 = new Rotation((-2436.490638467027), 0.9999, (-0.5773502633543536), (-0.1), false);
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
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.revert();
      assertEquals(Double.NaN, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), 3.141592653589793, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.06531284568350848), rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {(-0.8510385408586791), 0.18499631343236422, (-2.4218348676535757)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(1075.54252266793, (-0.19), (-1957.9), 1075.54252266793, false);
      Rotation rotation1 = new Rotation(596.44, 3423.04940015192, (-1.0), 3003.0, true);
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
      Rotation rotation0 = new Rotation((-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.5), rotation0.getQ1(), 0.01);
      assertEquals((-0.5), rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {(-1.5707963267948966), 0.0, (-1.5707963267948966)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(0.1, 0.9999999999, 174.8064528696, (-2798.6), true);
      assertEquals(0.062340610045968, rotation1.getQ2(), 0.01);
      assertEquals((-0.9980548681735015), rotation1.getQ3(), 0.01);
      assertEquals(3.5662648040938184E-4, rotation1.getQ1(), 0.01);
      assertEquals(3.141521328293689, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
      
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation((-2798.6), 0.5663209849976987, (-0.9980548681735015), (-0.9980548681735015), false);
      assertEquals((-0.9980548681735015), rotation1.getQ3(), 0.01);
      assertEquals((-0.9980548681735015), rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9999999999), 3.141592653589793, 3.141592653589793, (-1308.2581588), true);
      Rotation rotation1 = new Rotation(2401.772322, 0.5656758145325667, 866.6984, 0.6, false);
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
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), true);
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
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9999999999), (-769.5), (-0.9999999999), 1.0, false);
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
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.applyTo(rotation0);
      Rotation rotation1 = new Rotation((-1182.402750191), (-3567.478442003922), (-3567.478442003922), (-1182.402750191), true);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
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
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation((-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), (-0.20651200946156278), true);
      Rotation rotation1 = new Rotation(vector3D0, (-551.7809112867614));
      try { 
        rotation1.getAngles((RotationOrder) null);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.revert();
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
  public void test26()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), (-1.0), (-1.0));
      double[][] doubleArray0 = rotation0.getMatrix();
      assertEquals(3, doubleArray0.length);
      
      Rotation rotation1 = new Rotation(doubleArray0, 0.5656758145325667);
      assertEquals(0.5656758145325667, rotation0.getQ0(), 0.01);
      assertEquals(0.5709414713577319, rotation0.getQ2(), 0.01);
      assertEquals(1.9390875288225058, rotation1.getAngle(), 0.01);
      
      Rotation rotation2 = new Rotation((-1.0), 0.5656758145325667, (-1.0), 2829.161649893917, true);
      assertEquals(1.9994464882336133E-4, rotation2.getQ1(), 0.01);
      assertEquals((-3.5346154756250457E-4), rotation2.getQ2(), 0.01);
      assertEquals((-3.5346154756250457E-4), rotation2.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.revert();
      assertEquals(Double.NaN, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 3.141592653589793, 3.141592653589793, (-1308.2581588), true);
      Rotation rotation1 = new Rotation(2401.772322, 0.5656758145325667, 866.6984, 3.141592653589793, false);
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
  public void test29()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation((-5500.803207302743), (-0.1), (-5500.803207302743), (-2094.2195082588), true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.6827980829723738), rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {(-1.643140009632823), (-0.36288047852841204), (-0.38950579637401256)}, doubleArray0, 0.01);
      assertEquals(1.6384214140943236, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.revert();
      assertEquals(Double.NaN, rotation1.getQ3(), 0.01);
  }
}
