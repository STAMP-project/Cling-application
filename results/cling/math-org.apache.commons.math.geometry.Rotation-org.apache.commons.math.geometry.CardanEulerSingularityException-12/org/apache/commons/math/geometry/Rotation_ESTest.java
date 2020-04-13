/*

 * Tue Mar 03 15:53:12 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation((-92.24227), 23.52402326194577, (-92.24227), (-92.24227), true);
      assertEquals(0.14566785607609978, rotation1.getQ1(), 0.01);
      assertEquals((-0.5711919921550582), rotation1.getQ0(), 0.01);
      assertEquals(1.925678002236291, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-527.7886979633516), (-527.7886979633516), (-527.7886979633516));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(5.657594749235519E-4, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {(-0.001132160266373493), (-0.0011321602663734924), (-0.0011321602663734933)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation1 = new Rotation(0.0, 0.0, 1565.778871551915, 506.6593065, true);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      Rotation rotation1 = new Rotation(2.0, 587531.4480359999, 2.0, 0.0, true);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.7071067675360894, true);
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
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(0.0, 2.737701090064059E-13, 0.33333333333333326, 2.737701090064059E-13, false);
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
      Rotation rotation0 = new Rotation((-1929.54), (-1929.54), (-1929.54), 4.8388161242539144E8, true);
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
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = Vector3D.plusJ;
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D1 = vector3D0.negate();
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
  public void test09()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = new Rotation(0.0, 623.22015, 623.22015, 0.0, true);
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
      Rotation rotation0 = new Rotation(2.0, 2.0, 2.0, (-2888.93059), true);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation1 = new Rotation(vector3D0, (-2888.93059));
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
      Rotation rotation0 = new Rotation(0.9999999999999997, 0.9999999999999997, (-1458.882), 1.3007366902787764E7, true);
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
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(1518.512956959241, 2565.74082664855, (-2867.0610646471578), 1048.161179129392, true);
      assertEquals(2.4139013692956737, rotation1.getAngle(), 0.01);
      assertEquals(0.3558707437921292, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(1518.512956959241, 2565.74082664855, (-2867.0610646471578), 1048.161179129392, true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation1 = new Rotation(1518.512956959241, (-2867.0610646471578), (-1785.3161911), 1048.161179129392, false);
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
  public void test15()  throws Throwable  {
      Rotation rotation0 = new Rotation((-184015.25738673995), (-184015.25738673995), (-184015.25738673995), (-184015.25738673995), true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.570796326794897), 0.0, (-1.570796326794897)}, doubleArray0, 0.01);
      assertEquals((-0.49999999999999994), rotation0.getQ2(), 0.01);
      assertEquals(2.094395102393195, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.revert();
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.revert();
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
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation((-2485.7564872676016), 2046.98, 2.694977781044521E7, 2046.98, true);
      assertEquals(0.9999999899769867, rotation1.getQ2(), 0.01);
      assertEquals(3.1414081803460165, rotation1.getAngle(), 0.01);
      assertEquals(7.595535643673183E-5, rotation1.getQ1(), 0.01);
      assertEquals(7.595535643673183E-5, rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation((-2587.38899198), (-1632.2725364455357), 1256.9379342704592, (-2.220446049250313E-16), true);
      Rotation rotation1 = new Rotation((-7508870.35892464), (-7508870.35892464), 0.558134940338126, (-6.713602358880517E-20), false);
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
      Rotation rotation0 = new Rotation((-1.0), (-1.0), (-1.0), (-0.9999999999), true);
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
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.7830526809579246, 0.7830526809579246, 0.7830526809579246, 0.7830526809579246, false);
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
      Rotation rotation0 = new Rotation();
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation1 = new Rotation(2.694977781044521E7, 2.694977781044521E7, 2.694977781044521E7, 2.694977781044521E7, true);
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
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, (-4151.44474244878));
      Rotation rotation1 = new Rotation((-4151.44474244878), (-4151.44474244878), 569.97546525, 569.97546525, true);
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
  public void test24()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.applyTo(rotation0);
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
  public void test25()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1759.6059505), (-1759.6059505), (-1759.6059505));
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(3.469446951953614E-18, (-176.60227), (-702.4596011942535), (-3343.8999999999933), true);
      assertEquals((-0.2053106292446063), rotation1.getQ2(), 0.01);
      assertEquals((-0.05161623973547088), rotation1.getQ1(), 0.01);
      
      Rotation rotation2 = new Rotation(doubleArray0, 3.469446951953614E-18);
      assertEquals(0.9393834043106911, rotation0.getQ0(), 0.01);
      assertEquals(0.15638766046575725, rotation2.getQ3(), 0.01);
      assertEquals(0.6999376378633039, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(2.0, 587531.4480359999, 2.0, 0.0, true);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals(0.9999999999884122, rotation1.getQ1(), 0.01);
      assertEquals(3.404073103937541E-6, rotation1.getQ0(), 0.01);
      assertEquals(3.404073103937541E-6, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, (-1054.9824154581765), (-1054.9824154581765), true);
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
  public void test29()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(1290.865672, (-1632.2725364455357), 955.741948068, (-2.220446049250313E-16), false);
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
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1929.54), (-1929.54), (-1929.54), 4.8388161242539144E8, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-3.987628276020693E-6), rotation0.getQ1(), 0.01);
      assertEquals((-3.987628276020693E-6), rotation0.getQ2(), 0.01);
      assertEquals(3.141584678333241, rotation0.getAngle(), 0.01);
      assertEquals(0.9999999999761483, rotation0.getQ3(), 0.01);
      assertArrayEquals(new double[] {3.1415846783650436, 7.975288354294244E-6, 3.1415846783650436}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.applyTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
  }
}
