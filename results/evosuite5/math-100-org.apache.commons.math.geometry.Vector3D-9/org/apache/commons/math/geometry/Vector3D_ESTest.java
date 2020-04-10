/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:55:39 GMT 2019
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Vector3D_ESTest extends Vector3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = Vector3D.plusI;
      double double0 = Vector3D.angle(vector3D1, vector3D0);
      assertEquals(1.5707963267948966, double0, 0.01);
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(90.472, 0.0);
      Vector3D vector3D1 = vector3D0.orthogonal();
      Vector3D vector3D2 = vector3D1.orthogonal();
      Vector3D vector3D3 = vector3D2.orthogonal();
      double double0 = Vector3D.angle(vector3D3, vector3D1);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
      assertEquals((-1.0), vector3D2.getY(), 0.01);
      assertEquals(3.141592653589793, vector3D1.getAlpha(), 0.01);
      assertEquals(0.5925227581310352, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-789.113483857), 0.0);
      Vector3D vector3D1 = vector3D0.zero.scalarMultiply(3.141592653589793);
      // Undeclared exception!
      try { 
        Vector3D.angle(vector3D1, vector3D1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // null norm
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-789.364171641914), 367.808947588);
      Vector3D vector3D1 = vector3D0.negate();
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(0.7463807359189727, vector3D2.getAlpha(), 0.01);
      assertEquals(0.24260711799421478, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-789.364171641914), 367.808947588);
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals((-0.24260711799421478), vector3D0.getDelta(), 0.01);
      assertEquals((-2.3952119176708204), vector3D1.getAlpha(), 0.01);
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        vector3D1.normalize();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // cannot normalize a zero norm vector
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals((-1.5707963267948966), vector3D1.getDelta(), 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(90.472, 0.0);
      Vector3D vector3D1 = vector3D0.plusK.subtract(90.472, vector3D0);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals((-0.6341869541040097), vector3D1.getAlpha(), 0.01);
      assertEquals(0.01105269341885988, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = new Vector3D(754.497, vector3D0, 754.497, vector3D0, 754.497, vector3D0, 754.497, vector3D0);
      assertEquals(3017.988, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      double double0 = vector3D0.getY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      double double0 = vector3D0.getX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0, 1.0);
      double double0 = vector3D0.getDelta();
      assertEquals(1.0, vector3D0.getAlpha(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(90.472, 0.0);
      Vector3D vector3D1 = vector3D0.add(vector3D0);
      assertEquals(2.5074056994857834, vector3D1.getAlpha(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(2.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.9999, 0.0, 1860.501985402695);
      double double0 = vector3D0.getZ();
      assertEquals(0.0, vector3D0.getAlpha(), 0.01);
      assertEquals(1860.501985402695, double0, 0.01);
      assertEquals(1.5702588912471631, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.zero;
      Vector3D vector3D1 = new Vector3D(0.6, vector3D0, 0.0, vector3D0);
      assertEquals(0.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-789.113483857), 0.0);
      double double0 = vector3D0.getAlpha();
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(2.5678648476278907, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      Vector3D vector3D1 = vector3D0.minusJ.subtract(vector3D0);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(0.0, vector3D1.getX(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals((-1.0), vector3D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 3.141592653589793, vector3D0, 0.0, vector3D0);
      assertEquals(3.141592653589793, vector3D1.getNorm(), 0.01);
      assertEquals((-1.5707963267948966), vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, 0.0);
      Vector3D vector3D1 = vector3D0.plusI.add(0.0, vector3D0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(0.0, vector3D0.getAlpha(), 0.01);
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = new Vector3D(4028.4550244242087, vector3D0);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(4028.4550244242087, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(90.472, 0.0);
      Vector3D vector3D1 = vector3D0.orthogonal();
      Vector3D vector3D2 = vector3D0.orthogonal();
      double double0 = Vector3D.angle(vector3D2, vector3D1);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1.0), vector3D2.getZ(), 0.01);
      assertEquals(3.141592653589793, vector3D2.getAlpha(), 0.01);
  }
}
