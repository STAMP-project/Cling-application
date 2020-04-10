/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 20:27:36 GMT 2019
 */

package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ArrayUtils_ESTest extends ArrayUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double[] doubleArray0 = ArrayUtils.nullToEmpty((Double[]) null);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Byte[] byteArray0 = new Byte[1];
      Byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.subarray((float[]) null, 48, 1517);
      assertNull(floatArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, 2, 3);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[1];
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-2363), 578);
      assertNotSame(charArray1, charArray0);
      assertEquals(1, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Byte[] byteArray0 = new Byte[0];
      Byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Byte[] byteArray0 = ArrayUtils.nullToEmpty((Byte[]) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, (-1177), (-1177));
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = ArrayUtils.subarray(objectArray0, (-1873), 1);
      assertNotSame(objectArray1, objectArray0);
      assertEquals(0, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer[] integerArray0 = ArrayUtils.nullToEmpty((Integer[]) null);
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, (-895), 1073741824);
      assertEquals(7, booleanArray1.length);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Boolean[] booleanArray0 = ArrayUtils.nullToEmpty((Boolean[]) null);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      short[] shortArray0 = ArrayUtils.subarray((short[]) null, 3073, (-98));
      assertNull(shortArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[0];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.subarray((double[]) null, (-1049), (-1049));
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, 629, 629);
      assertEquals(0, doubleArray1.length);
      assertNotNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, (-2128), (-2128));
      assertNotNull(doubleArray1);
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(3, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Long[] longArray0 = ArrayUtils.nullToEmpty((Long[]) null);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = ArrayUtils.subarray((Object[]) null, (-1), (-1));
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-74), (-74));
      assertNotSame(charArray0, charArray1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = new Object[17];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(3, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertNotSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertEquals(2, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Float[] floatArray0 = ArrayUtils.nullToEmpty((Float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      float[] floatArray0 = new float[0];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.nullToEmpty((float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long[] longArray0 = new long[1];
      boolean boolean0 = ArrayUtils.isSameLength((long[]) null, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Character[] characterArray0 = new Character[2];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertEquals(2, characterArray1.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = ArrayUtils.subarray((int[]) null, 2146719418, 2146719418);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      short[] shortArray0 = new short[1];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, (-362), 104);
      assertNotSame(shortArray1, shortArray0);
      assertNotNull(shortArray1);
      assertEquals(1, shortArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      short[] shortArray0 = new short[0];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertNotSame(shortArray0, shortArray1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, (int) (short)2, (int) (short)2);
      assertEquals(0, shortArray1.length);
      assertNotNull(shortArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long[] longArray0 = new long[1];
      long[] longArray1 = ArrayUtils.subarray(longArray0, (-1), 36);
      assertNotSame(longArray1, longArray0);
      assertEquals(1, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((long[]) null, (long[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[11];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(11, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((short[]) null, (short[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      short[] shortArray0 = new short[1];
      boolean boolean0 = ArrayUtils.isSameLength(shortArray0, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = ArrayUtils.subarray(objectArray0, (-1873), (-1873));
      assertEquals(0, objectArray1.length);
      assertNotNull(objectArray1);
      assertNotSame(objectArray1, objectArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      ArrayUtils.subarray(objectArray0, 26, (-2147483629));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      long[] longArray0 = ArrayUtils.subarray((long[]) null, (-1542), (-1542));
      assertNull(longArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Character[] characterArray0 = new Character[0];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertNotSame(characterArray1, characterArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Character[] characterArray0 = ArrayUtils.nullToEmpty((Character[]) null);
      assertEquals(0, characterArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[1];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      char[] charArray0 = ArrayUtils.nullToEmpty((char[]) null);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      long[] longArray0 = new long[5];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, (long[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.nullToEmpty((double[]) null);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.nullToEmpty((byte[]) null);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      byte[] byteArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_BYTE_ARRAY);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Short[] shortArray0 = new Short[0];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertNotSame(shortArray1, shortArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      long[] longArray0 = new long[1];
      long[] longArray1 = new long[2];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      long[] longArray0 = new long[0];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Float[] floatArray0 = new Float[0];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Float[] floatArray0 = new Float[9];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(9, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.subarray((byte[]) null, 45, (-3681));
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Short[] shortArray0 = new Short[1];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertEquals(1, shortArray1.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Short[] shortArray0 = ArrayUtils.nullToEmpty((Short[]) null);
      assertEquals(0, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, (Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (-879), (int) (byte)72);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      char[] charArray0 = ArrayUtils.subarray((char[]) null, 1, 1);
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.subarray(charArray0, 627, 627);
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      char[] charArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_CHAR_ARRAY);
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      char[] charArray0 = new char[1];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertEquals(1, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.nullToEmpty((boolean[]) null);
      assertTrue(Arrays.equals(new boolean[] {}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Long[] longArray0 = new Long[0];
      Long[] longArray1 = ArrayUtils.nullToEmpty(longArray0);
      assertNotSame(longArray1, longArray0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Long[] longArray0 = new Long[1];
      Long[] longArray1 = ArrayUtils.nullToEmpty(longArray0);
      assertEquals(1, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[] longArray1 = ArrayUtils.subarray(longArray0, (-1723), (-1723));
      assertNotSame(longArray0, longArray1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[] longArray1 = ArrayUtils.subarray(longArray0, 3457, 3457);
      assertEquals(0, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = ArrayUtils.subarray(intArray0, (-861), 2187);
      assertEquals(4, intArray1.length);
      assertNotNull(intArray1);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = ArrayUtils.subarray(intArray0, 1, (-2391));
      assertArrayEquals(new int[] {}, intArray1);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.subarray((boolean[]) null, (-922), 304);
      assertNull(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, 1466, 5);
      assertTrue(Arrays.equals(new boolean[] {}, booleanArray1));
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      byte[] byteArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_BYTE_ARRAY, (-1), (-1));
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, 0, 1354);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, (int) (short)0, (int) (short)2);
      assertNotSame(floatArray1, floatArray0);
      assertNotNull(floatArray1);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      float[] floatArray0 = new float[0];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, (-1448), (-48));
      assertNotSame(floatArray0, floatArray1);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, (int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      int[] intArray0 = new int[1];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, (int[]) null);
      assertFalse(boolean0);
  }
}
