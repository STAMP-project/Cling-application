/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:47:12 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedHashSet;
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
      
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      boolean[] booleanArray1 = new boolean[4];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[4];
      boolean[] booleanArray1 = new boolean[4];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = new boolean[9];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[9];
      equalsBuilder0.append((boolean[]) null, booleanArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[5];
      float[] floatArray1 = new float[5];
      floatArray1[1] = 294.0F;
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[0];
      float[] floatArray1 = new float[2];
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.appendSuper(false);
      equalsBuilder0.append((float[]) null, (float[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray0, doubleArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[2];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[1];
      equalsBuilder0.append(doubleArray0, (double[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray0, doubleArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append('I', 'd');
      double[] doubleArray0 = new double[9];
      equalsBuilder0.append(doubleArray0, doubleArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)17;
      byte[] byteArray1 = new byte[3];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[0];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[1];
      equalsBuilder0.append((byte[]) null, byteArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[3];
      equalsBuilder0.append(byteArray0, (byte[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(1L, (-1372L));
      equalsBuilder0.append((byte[]) null, (byte[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((byte[]) null, (byte[]) null);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      char[] charArray0 = new char[4];
      char[] charArray1 = new char[4];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(charArray1, charArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[1];
      equalsBuilder0.append(charArray0, (char[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[1];
      equalsBuilder0.append((char[]) null, charArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      char[] charArray0 = new char[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(charArray0, charArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short) (-3687);
      short[] shortArray1 = new short[7];
      equalsBuilder0.append(shortArray1, shortArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[7];
      short[] shortArray1 = new short[7];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray1, shortArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[2];
      short[] shortArray1 = new short[0];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[0];
      equalsBuilder0.append(shortArray0, (short[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Boolean boolean0 = equalsBuilder0.build();
      assertTrue(boolean0);
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object) boolean0, (Object) equalsBuilder0);
      short[] shortArray0 = new short[0];
      equalsBuilder1.append(shortArray0, shortArray0);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[6];
      intArray0[2] = 2931;
      int[] intArray1 = new int[6];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[6];
      int[] intArray1 = new int[7];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[6];
      equalsBuilder0.append(intArray0, (int[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[6];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray1 = new int[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, intArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[6];
      equalsBuilder0.append((int[]) null, intArray0);
      equalsBuilder0.append((char[]) null, (char[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[1];
      equalsBuilder0.append((float[]) null, floatArray0);
      int[] intArray0 = new int[5];
      equalsBuilder0.append(intArray0, intArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[7];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, intArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[5];
      longArray0[0] = (long) (-670);
      long[] longArray1 = new long[5];
      equalsBuilder0.append(longArray1, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[1];
      long[] longArray1 = new long[3];
      equalsBuilder0.append(longArray0, longArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[7];
      equalsBuilder0.append(longArray0, (long[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[0];
      equalsBuilder0.append((long[]) null, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Object object0 = new Object();
      equalsBuilder0.append((Object) hashCodeBuilder0, object0);
      long[] longArray0 = new long[0];
      equalsBuilder0.append(longArray0, longArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[2];
      Object[] objectArray1 = new Object[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[2];
      Object[] objectArray1 = new Object[4];
      equalsBuilder0.append(objectArray0, objectArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[26];
      equalsBuilder0.append(objectArray0, (Object[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[1];
      equalsBuilder0.append((Object[]) null, objectArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(335.75F, (-44.85409F));
      equalsBuilder1.append(true, true);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(4111, 12);
      equalsBuilder1.append((float) 4111, (float) 12);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.append((short) (byte)101, (short)2);
      equalsBuilder0.append((double) (byte)101, (double) (byte)101);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((short) (-9873), (short)512);
      equalsBuilder1.append((byte)6, (byte)6);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, (float[]) null);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append('}', '+');
      assertSame(equalsBuilder1, equalsBuilder2);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((byte)3, (byte)66);
      equalsBuilder1.append((short) (byte)3, (short) (byte)3);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((float[]) null, floatArray0);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append(0, (-3409));
      assertFalse(equalsBuilder2.build());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[5];
      long[] longArray1 = new long[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray1, longArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(3, (-2213));
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append(293L, 3903L);
      assertFalse(equalsBuilder2.isEquals());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((Object) equalsBuilder0, (Object) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[4];
      Object[] objectArray1 = new Object[4];
      objectArray1[0] = (Object) equalsBuilder0;
      equalsBuilder0.append(objectArray0, objectArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Object object0 = new Object();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object) hashCodeBuilder0, object0);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.appendSuper(false);
      assertFalse(equalsBuilder2.build());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object object0 = new Object();
      Class<String> class0 = String.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) "orgRapache.commons.lang3.(uilder.EqualsBuilder", true, (Class<?>) class0, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = new EqualsBuilder();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) equalsBuilder1, (Object) equalsBuilder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "^wAMtd:$kOFHXVNICW", object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "Index: ", (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object object0 = new Object();
      Integer integer0 = new Integer(281);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      LinkedList<String> linkedList0 = new LinkedList<String>(linkedHashSet0);
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) integer0, (Collection<String>) linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      equalsBuilder0.reset();
      assertTrue(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Boolean boolean0 = equalsBuilder0.build();
      assertTrue(boolean0);
      
      equalsBuilder0.append((Object) boolean0, (Object) equalsBuilder0);
      Object[] objectArray0 = new Object[0];
      equalsBuilder0.append(objectArray0, objectArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Object object0 = new Object();
      Class<String> class0 = String.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) null, object0, true, (Class<?>) class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "^wAMtd:$kOFHXVNICW", (Object) "^wAMtd:$kOFHXVNICW", true);
      assertTrue(boolean0);
  }
}
