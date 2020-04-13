/*

 * Tue Mar 03 15:53:16 GMT 2020
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
      Rotation rotation0 = new Rotation((-9.76071715154026E-5), 1546.2028, (-9.76071715154026E-5), (-2.220446049250313E-16), true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.2625403538966822E-7), (-7.969753513304453E-15), 3.141592527335758}, doubleArray0, 0.01);
      assertEquals((-6.312701769483423E-8), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = rotation0.applyTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 0.0, 0.0, 0.0, true);
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-1.0), vector3D0, 0.0, vector3D0);
      Rotation rotation1 = new Rotation(vector3D0, vector3D1);
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
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = rotation0.getAxis();
      Rotation rotation1 = new Rotation(0.0, (-1392.35706715575), 0.1, 558.933988, false);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation2 = new Rotation(vector3D0, vector3D1);
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
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-9.76071715154026E-5), 1546.2028, (-9.76071715154026E-5), (-2.220446049250313E-16), true);
      rotation0.applyTo(rotation1);
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
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 0.0, 0.0, 0.0, true);
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation1 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation1 = new Rotation(rotationOrder0, (-1.0), (-1171.0), (-1171.0));
      RotationOrder rotationOrder1 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 0.0, 0.0, 0.0, true);
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-1.0), vector3D0, 0.0, vector3D0);
      Vector3D vector3D2 = Vector3D.plusK;
      Vector3D vector3D3 = vector3D1.orthogonal();
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation1 = new Rotation(vector3D2, vector3D3);
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
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-1.0), vector3D0, 0.0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), (-1171.0), (-1171.0));
      Vector3D vector3D2 = Vector3D.plusK;
      Vector3D vector3D3 = vector3D1.orthogonal();
      RotationOrder rotationOrder1 = RotationOrder.XYX;
      Rotation rotation1 = new Rotation(vector3D2, vector3D3);
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
  public void test09()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 0.0, 0.0, 0.0, true);
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.YZY;
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
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), (-1.0), (-1.0));
      Vector3D vector3D1 = Vector3D.plusK;
      RotationOrder rotationOrder1 = RotationOrder.YZY;
      Rotation rotation1 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
  public void test11()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation((-9.76071715154026E-5), 1005.797190717, 1766545.3337833981, 1.0, true);
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
      Rotation rotation0 = new Rotation(372.8130880148, 372.8130880148, 0.0, 372.8130880148, true);
      Rotation rotation1 = rotation0.revert();
      assertEquals((-0.5773502691896257), rotation1.getQ0(), 0.01);
      assertEquals(0.5773502691896257, rotation1.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {(-2.356194490192345), 1.9106332362490186, 2.356194490192345}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 3.141592653589793, 0.0, true);
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
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(664.5574342717487, 664.5574342717487, 664.5574342717487, 664.5574342717487, false);
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
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.applyTo(rotation0);
      assertFalse(rotation1.equals((Object)rotation0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ2(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(2750.6, 2750.6, 2750.6, 2750.6, true);
      assertEquals(0.5, rotation1.getQ3(), 0.01);
      assertEquals(2.0943951023931953, rotation1.getAngle(), 0.01);
      assertEquals(0.5, rotation1.getQ0(), 0.01);
      assertEquals(0.5, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 3.141592653589793, 0.0);
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
      Rotation rotation0 = new Rotation(664.5574342717487, 664.5574342717487, (-0.3364053824736588), (-0.3364053824736588), true);
      Rotation rotation1 = new Rotation(416.0282745284245, 3370.71583931, 1.0, (-1.0), false);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
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
  public void test19()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, (-0.999999999999998), 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-3.141592653589793), -0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals((-1.0), rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.1, 558.933988, false);
      assertEquals(0.1, rotation1.getQ2(), 0.01);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertEquals(3.141592653589793, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 0.0, 0.0, 0.0, true);
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
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation((-2161.3345), (-2161.3345), 0.5, 999.7942, true);
      Rotation rotation1 = new Rotation(1152.4725874724645, (-2161.3345), (-9.69705644549095E12), 0.0, false);
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
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 3.141592653589793, 0.0, 0.0, true);
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
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation((-5078.65746486819), (-5078.65746486819), (-5078.65746486819), (-5078.65746486819), false);
      Rotation rotation2 = rotation0.applyTo(rotation1);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
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
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 0.0, 0.0, 0.0, true);
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
      Rotation rotation0 = new Rotation(664.5574342717487, 664.5574342717487, 664.5574342717487, 664.5574342717487, false);
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
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation(2750.6, (-9.76071715154026E-5), (-9.76071715154026E-5), (-9.76071715154026E-5), true);
      double[][] doubleArray0 = new double[3][3];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-9.76071715154026E-5));
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
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(rotationOrder0, 278.4283744665, (-1755.618360425697), 758.04399258);
      Rotation rotation2 = null;
      try {
        rotation2 = new Rotation(doubleArray0, (-1905.54382691149));
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
      Rotation rotation0 = new Rotation(664.5574342717487, 664.5574342717487, 664.5574342717487, 664.5574342717487, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
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
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.999999999999998), (-0.999999999999998), 0.0, (-0.999999999999998), true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals((-0.5773502691896258), rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {(-1.1071487177940902), (-0.7297276562269666), (-2.0344439357957027)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1996.13), (-1268.97021412069), (-1996.13));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.5207356237634314), rotation0.getQ1(), 0.01);
      assertArrayEquals(new double[] {1.9229276831083908, 0.23321792958657964, 1.9229276831083908}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Rotation rotation0 = new Rotation(664.5574342717487, (-667.02316150474), (-667.02316150474), 664.5574342717487, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation1 = new Rotation(rotationOrder0, 2436750.122639214, 1764.65565, 2436750.122639214);
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      try { 
        rotation0.getAngles(rotationOrder1);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }
}
