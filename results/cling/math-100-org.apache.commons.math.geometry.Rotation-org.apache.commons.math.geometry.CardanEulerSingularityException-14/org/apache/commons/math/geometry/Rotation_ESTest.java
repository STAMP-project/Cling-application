/*

 * Tue Mar 03 15:53:42 GMT 2020
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
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(0.9999, 0.9999, 0.9999, (-0.003143021358746001), true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {1.1084068423491786, (-0.7269167645499073), (-2.033185811240615)}, doubleArray0, 0.01);
      assertEquals((-0.0018148027195697114), rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-5453.293), (-5453.293), (-5453.293));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.7969244200597059, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {0.5118466318813968, 0.5118466318813966, 0.5118466318813968}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.9999, 0.9999, 1.0000000000000002, 611310.2255867937, true);
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
  public void test03()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(0.0, 0.0, 3118.6357128591353, 3118.6357128591353, false);
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
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, (-0.003143021358746001));
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotation0.applyTo(rotation0);
      Rotation rotation1 = new Rotation(0.0, 0.6670706352781933, 1.2748594802952167E-15, 0.6670706352781933, true);
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
      Vector3D vector3D0 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, (-0.003143021358746001));
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, (-0.003143021358746001), true);
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
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, 3.141592653589793);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = new Rotation(331.633438487, 0.44333016243829687, 1395.51, (-298.354879744), true);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, 3.141592653589793);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = new Rotation(rotationOrder0, (-872.9), 0.9999, 0.9999);
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
      Rotation rotation0 = new Rotation((-3053.4), (-3053.4), (-3053.4), (-3589.48), true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {3.0610672204191447, 1.6580736944225585, 1.6513217599655452}, doubleArray0, 0.01);
      assertEquals((-0.47771157452130636), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation1 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation2 = rotation0.applyInverseTo(rotation1);
      assertEquals(Double.NaN, rotation2.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      rotation2.getAngles(rotationOrder0);
      assertEquals(0.0, rotation0.getAngle(), 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation(611311.4053040036, 3.141592653589793, 3.141592653589793, 3.141592653589793, true);
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
      Rotation rotation0 = new Rotation(30.30942595526301, (-36.86842878057537), 30.30942595526301, 1274.7261375318835, false);
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
      Rotation rotation0 = new Rotation((-2981.37), (-236.749), (-2981.37), 0.1, true);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
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
      Rotation rotation0 = new Rotation((-3052.6433338062957), (-3052.6433338062957), (-3052.6433338062957), (-3589.48), true);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {3.060944905602492, 1.483375700201198, 1.4901485788075954}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      assertEquals((-0.47767423023835065), rotation0.getQ0(), 0.01);
      assertEquals((-0.9999999999999999), rotation1.getQ0(), 0.01);
      assertEquals((-0.5616778340816), rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation((-3299.919264055141), (-3299.919264055141), (-3299.919264055141), 2.0, true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation1 = new Rotation((-3299.919264055141), 3.499177935244679E-4, 322.2077, 2.0, false);
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
      Rotation rotation0 = new Rotation((-4975.5268998039), (-4975.5268998039), (-4975.5268998039), (-4975.5268998039), true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.5), rotation0.getQ3(), 0.01);
      assertEquals(2.0943951023931953, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {(-1.5707963267948966), 0.0, (-1.5707963267948966)}, doubleArray0, 0.01);
      assertEquals((-0.5), rotation0.getQ1(), 0.01);
      assertEquals((-0.5), rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 2.3302528978832973, 2.3302528978832973, 2.3302528978832973);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.5503947505609725, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {(-0.8113397557064962), 0.811339755706496, (-0.8113397557064961)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, (-0.003143021358746001));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0015715100325272848, rotation0.getQ3(), 0.01);
      assertArrayEquals(new double[] {(-1.5707963267948966), 0.0031430213587662274, 1.5707963267948966}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, (-0.003143021358746001), true);
      assertEquals(0.0, rotation1.getQ0(), 0.01);
      assertEquals((-1.0), rotation1.getQ3(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, (-0.003143021358746001));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.5707963267948966), 0.0031430213587662274, 1.5707963267948966}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.revert();
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals(0.0015715100325272848, rotation1.getQ3(), 0.01);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation((-0.003143021358746001), (-0.003143021358746001), (-0.003143021358746001), (-0.003143021358746001), true);
      Rotation rotation1 = new Rotation(0.4074443511870109, 1442.52945, 1442.52945, (-0.003143021358746001), false);
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
      Rotation rotation0 = new Rotation((-960.6), (-960.6), 2488.90652707762, 2804351.782750886, true);
      Rotation rotation1 = new Rotation(2072.07958794, 2349.929878450357, 2349.929878450357, 0.25, false);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(8587027.637515198, 1542.471, 1613.8153, 8587027.637515198, true);
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
      Rotation rotation0 = new Rotation((-4975.5268998039), (-4975.5268998039), (-4975.5268998039), (-4975.5268998039), false);
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
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation((-3299.919264055141), (-3299.919264055141), (-3299.919264055141), 2.0, true);
      Rotation rotation1 = new Rotation();
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
  public void test24()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.revert();
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
      Rotation rotation0 = new Rotation((-3052.6433338062957), (-3052.6433338062957), (-3052.6433338062957), (-3589.48), true);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 10.00721091589);
      assertEquals((-0.47767423023835065), rotation0.getQ0(), 0.01);
      assertEquals(2.145581693479548, rotation0.getAngle(), 0.01);
      assertEquals((-0.47767423023835065), rotation0.getQ1(), 0.01);
      assertEquals(0.4776742302383507, rotation1.getQ2(), 0.01);
      assertEquals(2.145581693479548, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = rotation0.applyTo(rotation0);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      
      Rotation rotation2 = new Rotation(doubleArray0, 0.0);
      assertEquals(0.0, rotation2.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.9999, 1202.0112638262424, 1.0000000000000002, 611310.2255867937, true);
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
  public void test28()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
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
  public void test29()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation((-36.86842878057537), (-36.86842878057537), (-36.86842878057537), (-0.003143021358746001), true);
      Rotation rotation1 = new Rotation(0.4074443511870109, 1442.52945, 1442.52945, 2361.6, false);
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
      Rotation rotation0 = new Rotation(4544.8735742566, 0.6, 4544.8735742566, 4544.8735742566, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-2.0343911276520146), (-0.7296095777851174), (-1.1072015259377788)}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.revert();
      assertEquals((-0.5773502675125719), rotation1.getQ0(), 0.01);
      assertEquals(1.9106332403569448, rotation0.getAngle(), 0.01);
  }
}
