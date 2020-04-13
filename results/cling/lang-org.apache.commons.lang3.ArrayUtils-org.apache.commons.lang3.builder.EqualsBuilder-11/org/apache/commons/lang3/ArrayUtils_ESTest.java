/*

 * Tue Mar 03 16:22:35 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ArrayUtils_ESTest extends ArrayUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertNotSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Float[] floatArray0 = new Float[0];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      int[] intArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_INT_ARRAY, (-1), (-1));
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = ArrayUtils.subarray((char[]) null, 10, 10);
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long[] longArray0 = new Long[3];
      Long[] longArray1 = ArrayUtils.nullToEmpty(longArray0);
      assertEquals(3, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      double[] doubleArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_DOUBLE_ARRAY);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Float[] floatArray0 = new Float[1];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Float[] floatArray0 = ArrayUtils.nullToEmpty((Float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double[] doubleArray0 = ArrayUtils.nullToEmpty((Double[]) null);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[2];
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-1), 3);
      assertNotSame(charArray1, charArray0);
      assertNotNull(charArray1);
      assertEquals(2, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = ArrayUtils.subarray((String[]) null, 1908, (-2397));
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Byte[] byteArray1 = ArrayUtils.toObject(byteArray0);
      Object[] objectArray0 = ArrayUtils.subarray((Object[]) byteArray1, (int)  (-118), (int) 2);
      assertNotSame(byteArray1, objectArray0);
      assertEquals(2, objectArray0.length);
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      int[] intArray0 = new int[7];
      boolean boolean0 = ArrayUtils.isSameLength(arrayUtils0.EMPTY_INT_ARRAY, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.subarray((double[]) null, (-2138766794), (-2138766794));
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      long[] longArray0 = new long[1];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, arrayUtils0.EMPTY_LONG_ARRAY);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      boolean boolean0 = ArrayUtils.isSameLength(arrayUtils0.EMPTY_LONG_ARRAY, arrayUtils0.EMPTY_LONG_ARRAY);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Long[] longArray0 = new Long[0];
      Long[] longArray1 = ArrayUtils.nullToEmpty(longArray0);
      assertNotSame(longArray1, longArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Long[] longArray0 = ArrayUtils.nullToEmpty((Long[]) null);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, (-1), 107);
      assertEquals(6, floatArray1.length);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      char[] charArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_CHAR_ARRAY, (-1), (-1));
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.subarray(charArray0, 0, 3643);
      assertNotSame(charArray0, charArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertEquals(1, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[] longArray0 = new long[4];
      long[] longArray1 = ArrayUtils.subarray(longArray0, 0, 36);
      assertEquals(4, longArray1.length);
      assertNotSame(longArray1, longArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[1];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, (int[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(14, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.nullToEmpty((double[]) null);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(2, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Short[] shortArray0 = new Short[1];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertEquals(1, shortArray1.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      short[] shortArray0 = ArrayUtils.subarray((short[]) null, 14, 468);
      assertNull(shortArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Short[] shortArray0 = new Short[0];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertNotSame(shortArray1, shortArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Short[] shortArray0 = ArrayUtils.nullToEmpty((Short[]) null);
      assertEquals(0, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(1, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      byte[] byteArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_BYTE_ARRAY);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.subarray((byte[]) null, 1159, (-1));
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.subarray((boolean[]) null, (-1), (-1));
      assertNull(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (-7), 11);
      assertEquals(1, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      byte[] byteArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_BYTE_ARRAY, 184, (-1));
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      long[] longArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_LONG_ARRAY, 2666, (-1));
      assertArrayEquals(new long[] {}, longArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      float[] floatArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_FLOAT_ARRAY, 5442, 5442);
      assertArrayEquals(new float[] {}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      float[] floatArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_FLOAT_ARRAY);
      assertArrayEquals(new float[] {}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.nullToEmpty((float[]) null);
      assertArrayEquals(new float[] {}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = ArrayUtils.subarray(intArray0, (-124), 687);
      assertNotSame(intArray1, intArray0);
      assertEquals(4, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertNotSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Integer[] integerArray0 = ArrayUtils.nullToEmpty((Integer[]) null);
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Byte[] byteArray0 = new Byte[1];
      Byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((short[]) null, (short[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      short[] shortArray0 = new short[0];
      boolean boolean0 = ArrayUtils.isSameLength(shortArray0, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Byte[] byteArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_BYTE_OBJECT_ARRAY);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Byte[] byteArray0 = ArrayUtils.nullToEmpty((Byte[]) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      boolean boolean0 = ArrayUtils.isSameLength(arrayUtils0.EMPTY_LONG_ARRAY, (long[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((long[]) null, (long[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      double[] doubleArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_DOUBLE_ARRAY, (-1), (-1));
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, (Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Object[] objectArray0 = new Object[7];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, (Object[]) arrayUtils0.EMPTY_LONG_OBJECT_ARRAY);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) arrayUtils0.EMPTY_DOUBLE_OBJECT_ARRAY, (Object[]) arrayUtils0.EMPTY_BOOLEAN_OBJECT_ARRAY);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = ArrayUtils.subarray(intArray0, 19, 19);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int[] intArray0 = ArrayUtils.subarray((int[]) null, (-2143822056), 3514);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int[] intArray0 = new int[9];
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, (int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      boolean[] booleanArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_BOOLEAN_ARRAY);
      assertTrue(Arrays.equals(new boolean[] {}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.nullToEmpty((boolean[]) null);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, (-1166), 1006);
      assertEquals(1, booleanArray1.length);
      assertNotSame(booleanArray1, booleanArray0);
      assertNotNull(booleanArray1);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.subarray((float[]) null, 3, (-424));
      assertNull(floatArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      float[] floatArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_FLOAT_ARRAY, (-1), (-1));
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Character[] characterArray0 = new Character[1];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertEquals(1, characterArray1.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      short[] shortArray0 = new short[0];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, (-1242), (-1242));
      assertFalse(shortArray1.equals((Object)shortArray0));
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      short[] shortArray0 = new short[1];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, (int) (short)0, 3946);
      assertEquals(1, shortArray1.length);
      assertNotNull(shortArray1);
      assertNotSame(shortArray1, shortArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, 12, 12);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, (-2791), 10);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
      assertEquals(2, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(2, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Character[] characterArray0 = new Character[0];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertNotSame(characterArray1, characterArray0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Character[] characterArray0 = ArrayUtils.nullToEmpty((Character[]) null);
      assertEquals(0, characterArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, 534, 534);
      assertEquals(0, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, (-2147483643), (-2147483643));
      assertNotNull(booleanArray1);
      assertEquals(0, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      long[] longArray0 = ArrayUtils.subarray((long[]) null, 0, 0);
      assertNull(longArray0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      long[] longArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_LONG_ARRAY, (-1), (-1));
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Boolean[] booleanArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_BOOLEAN_OBJECT_ARRAY);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Boolean[] booleanArray0 = ArrayUtils.nullToEmpty((Boolean[]) null);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      char[] charArray0 = new char[1];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertEquals(1, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      char[] charArray0 = ArrayUtils.nullToEmpty((char[]) null);
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Integer[] integerArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_INTEGER_OBJECT_ARRAY, 64, 2);
      assertNotNull(integerArray0);
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      boolean boolean0 = ArrayUtils.isSameLength(arrayUtils0.EMPTY_INT_ARRAY, arrayUtils0.EMPTY_INT_ARRAY);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      int[] intArray0 = ArrayUtils.nullToEmpty((int[]) null);
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, (int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.nullToEmpty((byte[]) null);
      assertEquals(0, byteArray0.length);
  }
}
