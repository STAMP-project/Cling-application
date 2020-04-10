/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 00:56:32 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EqualsBuilder_ESTest extends EqualsBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      boolean[] booleanArray1 = new boolean[7];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[2];
      boolean[] booleanArray1 = new boolean[3];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[4];
      equalsBuilder0.append(booleanArray0, (boolean[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[0];
      equalsBuilder0.append((boolean[]) null, booleanArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((boolean[]) null, (boolean[]) null);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append('s', 'd');
      equalsBuilder1.append((boolean[]) null, (boolean[]) null);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[2];
      float[] floatArray1 = new float[2];
      floatArray1[0] = (float) 10;
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[2];
      float[] floatArray1 = new float[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[8];
      equalsBuilder0.append((float[]) null, floatArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray1);
      equalsBuilder1.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray1, doubleArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[0];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[5];
      equalsBuilder0.append(doubleArray0, (double[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[3];
      equalsBuilder0.append((double[]) null, doubleArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((double[]) null, (double[]) null);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1497.615383;
      double[] doubleArray1 = new double[2];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      equalsBuilder0.append(doubleArray0, doubleArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-29);
      byte[] byteArray1 = new byte[4];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[5];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[0];
      equalsBuilder0.append(byteArray0, (byte[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[3];
      equalsBuilder0.append((byte[]) null, byteArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[0];
      equalsBuilder0.append(charArray0, (char[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      char[] charArray0 = new char[9];
      equalsBuilder0.append((char[]) null, charArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((char[]) null, (char[]) null);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((short)1, (short)5);
      equalsBuilder0.append((char[]) null, (char[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[9];
      shortArray0[3] = (short)2;
      short[] shortArray1 = new short[9];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[9];
      short[] shortArray1 = new short[9];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[9];
      short[] shortArray1 = new short[11];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[3];
      equalsBuilder0.append(shortArray0, (short[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[9];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray1);
      short[] shortArray0 = new short[0];
      equalsBuilder1.append(shortArray0, shortArray0);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[2];
      intArray0[0] = (-1);
      int[] intArray1 = new int[2];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[1];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[3];
      equalsBuilder0.append((int[]) null, intArray0);
      equalsBuilder0.append((byte[]) null, (byte[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((int[]) null, (int[]) null);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, (int[]) null);
      equalsBuilder1.append((int[]) null, (int[]) null);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[5];
      longArray0[3] = 4634342032963627106L;
      long[] longArray1 = new long[5];
      equalsBuilder0.append(longArray1, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[1];
      long[] longArray1 = new long[5];
      equalsBuilder0.append(longArray1, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[2];
      equalsBuilder0.append(longArray0, (long[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[9];
      equalsBuilder0.append((long[]) null, longArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[5];
      long[] longArray1 = new long[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray1, longArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, (float[]) null);
      equalsBuilder1.append((long[]) null, (long[]) null);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) equalsBuilder0;
      objectArray0[1] = (Object) equalsBuilder0;
      objectArray0[2] = (Object) equalsBuilder0;
      objectArray0[3] = (Object) equalsBuilder0;
      objectArray0[4] = (Object) equalsBuilder0;
      objectArray0[5] = (Object) equalsBuilder0;
      objectArray0[6] = (Object) equalsBuilder0;
      Object[] objectArray1 = new Object[8];
      objectArray1[0] = (Object) equalsBuilder0;
      objectArray1[1] = (Object) equalsBuilder0;
      objectArray1[2] = (Object) equalsBuilder0;
      objectArray1[3] = objectArray1[2];
      objectArray1[4] = (Object) equalsBuilder0;
      objectArray1[5] = (Object) equalsBuilder0;
      objectArray1[6] = (Object) equalsBuilder0;
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[11];
      Object[] objectArray1 = new Object[4];
      equalsBuilder0.append(objectArray0, objectArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[0];
      equalsBuilder0.append(objectArray0, (Object[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[0];
      equalsBuilder0.append((Object[]) null, objectArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(1.0F, 0.0F);
      equalsBuilder0.append((Object[]) null, (Object[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = new boolean[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.appendSuper(false);
      equalsBuilder1.append(false, false);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((-1467), 36);
      equalsBuilder0.append((-1292.879F), (-177.37F));
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((-1467), 36);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append((double) (-1467), (double) 36);
      assertFalse(equalsBuilder2.isEquals());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((float) (byte) (-9), 0.0F);
      equalsBuilder0.append((byte) (-9), (byte) (-9));
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = new byte[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append('f', 'f');
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((short[]) null, shortArray0);
      equalsBuilder1.append('&', '&');
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      equalsBuilder0.setEquals(false);
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((short)17, (short) (-4467));
      assertFalse(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1497.615383;
      double[] doubleArray1 = new double[2];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((-1), (-1300));
      assertSame(equalsBuilder1, equalsBuilder0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.appendSuper(false);
      equalsBuilder1.append((-1L), (-1L));
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) equalsBuilder0;
      Object[] objectArray1 = new Object[8];
      equalsBuilder0.append(objectArray0, objectArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((Object) null, (Object) "");
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.appendSuper(false);
      Object object0 = new Object();
      EqualsBuilder equalsBuilder2 = equalsBuilder0.append((Object) equalsBuilder1, object0);
      assertSame(equalsBuilder2, equalsBuilder1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.appendSuper(false);
      equalsBuilder0.appendSuper(false);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Object object0 = new Object();
      Class<HashCodeBuilder> class0 = HashCodeBuilder.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "E", object0, true, (Class<?>) class0, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "'&", (Object) equalsBuilder0);
      assertFalse(boolean0);
      assertTrue(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) null, (Object) equalsBuilder0);
      assertTrue(equalsBuilder0.build());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "c", (Object) "U>=@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Object object0 = new Object();
      Boolean boolean0 = new Boolean(false);
      Class<String> class0 = String.class;
      boolean boolean1 = EqualsBuilder.reflectionEquals(object0, (Object) boolean0, false, (Class<?>) class0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      equalsBuilder0.reset();
      assertTrue(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Boolean boolean0 = equalsBuilder0.build();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Class<Object> class0 = Object.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) equalsBuilder0, (Object) equalsBuilder0, true, (Class<?>) class0);
      assertTrue(boolean0);
      assertTrue(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) equalsBuilder0, (Object) equalsBuilder0, true);
      assertTrue(equalsBuilder0.build());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) equalsBuilder0, (Object) null, (Collection<String>) linkedList0);
      assertFalse(boolean0);
      assertTrue(equalsBuilder0.isEquals());
  }
}
