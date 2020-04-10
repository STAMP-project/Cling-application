/*

 * Tue Mar 03 16:22:21 GMT 2020
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
      char[] charArray0 = new char[1];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertEquals(1, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Float[] floatArray0 = new Float[5];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(5, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (int) (byte) (-1), 2146224183);
      assertEquals(3, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = ArrayUtils.subarray((char[]) null, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Long[] longArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_LONG_OBJECT_ARRAY);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Float[] floatArray0 = new Float[0];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Float[] floatArray0 = ArrayUtils.nullToEmpty((Float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double[] doubleArray0 = ArrayUtils.nullToEmpty((Double[]) null);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, arrayUtils0.EMPTY_OBJECT_ARRAY);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = ArrayUtils.subarray((Object[]) null, 0, 5882);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      short[] shortArray0 = new short[4];
      boolean boolean0 = ArrayUtils.isSameLength((short[]) null, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double[] doubleArray0 = new Double[10];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(10, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Character[] characterArray0 = new Character[3];
      char[] charArray0 = ArrayUtils.toPrimitive(characterArray0, 'W');
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-2974), (-2974));
      assertNotNull(charArray1);
      assertArrayEquals(new char[] {'W', 'W', 'W'}, charArray0);
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.subarray((double[]) null, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long[] longArray0 = new long[2];
      long[] longArray1 = new long[0];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Long[] longArray0 = new Long[10];
      Long[] longArray1 = ArrayUtils.nullToEmpty(longArray0);
      assertEquals(10, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Long[] longArray0 = ArrayUtils.nullToEmpty((Long[]) null);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[1];
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-2146650482), 1824);
      assertNotSame(charArray1, charArray0);
      assertEquals(1, charArray1.length);
      assertNotNull(charArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.subarray(charArray0, 1546, 1546);
      assertNotSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertEquals(1, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[3];
      String[] stringArray1 = ArrayUtils.subarray(stringArray0, (int) 2592, (int) 2029);
      assertNotNull(stringArray1);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      short[] shortArray0 = new short[0];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, 6, (-2146317646));
      assertNotSame(shortArray0, shortArray1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[1];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, (int[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.nullToEmpty((double[]) null);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(6, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Short[] shortArray0 = new Short[0];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertNotSame(shortArray1, shortArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      long[] longArray0 = new long[2];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      short[] shortArray0 = ArrayUtils.subarray((short[]) null, (-4376), (-4376));
      assertNull(shortArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Short[] shortArray0 = new Short[1];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertEquals(1, shortArray1.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Short[] shortArray0 = ArrayUtils.nullToEmpty((Short[]) null);
      assertEquals(0, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(2, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.subarray((byte[]) null, 2147137781, 2147137781);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.subarray((boolean[]) null, (-2140419556), (-2140419556));
      assertNull(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (-414), (-414));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, 2, 2);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long[] longArray0 = new long[1];
      long[] longArray1 = ArrayUtils.subarray(longArray0, 0, 0);
      assertEquals(0, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      float[] floatArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_FLOAT_ARRAY, (-863), (-863));
      assertArrayEquals(new float[] {}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, (Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      float[] floatArray0 = new float[0];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.nullToEmpty((float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = ArrayUtils.subarray(intArray0, (-856), 111);
      assertEquals(3, intArray1.length);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertNotSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Integer[] integerArray0 = ArrayUtils.nullToEmpty((Integer[]) null);
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Byte[] byteArray0 = new Byte[1];
      Byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((short[]) null, (short[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      short[] shortArray0 = new short[0];
      boolean boolean0 = ArrayUtils.isSameLength(shortArray0, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Byte[] byteArray0 = new Byte[0];
      Byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Byte[] byteArray0 = ArrayUtils.nullToEmpty((Byte[]) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      long[] longArray0 = new long[6];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, (long[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((long[]) null, (long[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int[] intArray0 = new int[2];
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = new Object[1];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = ArrayUtils.subarray(intArray0, (-4837), (-461));
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int[] intArray0 = ArrayUtils.subarray((int[]) null, 53, 53);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int[] intArray0 = new int[1];
      int[] intArray1 = ArrayUtils.subarray(intArray0, 1, 76);
      assertNotNull(intArray1);
      
      boolean boolean0 = ArrayUtils.isSameLength(intArray1, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int[] intArray0 = ArrayUtils.nullToEmpty((int[]) null);
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, (int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.nullToEmpty((boolean[]) null);
      assertTrue(Arrays.equals(new boolean[] {}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, (-558), 10);
      assertEquals(2, booleanArray1.length);
      assertNotNull(booleanArray1);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.subarray((float[]) null, 1886, 1886);
      assertNull(floatArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, 1, Integer.MAX_VALUE);
      assertNotNull(floatArray1);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Character[] characterArray0 = new Character[1];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertEquals(1, characterArray1.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      short[] shortArray0 = new short[0];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, (-2144302189), (-2144302189));
      assertArrayEquals(new short[] {}, shortArray1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      short[] shortArray0 = new short[1];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, (-1261), 6);
      assertEquals(1, shortArray1.length);
      assertNotNull(shortArray1);
      assertNotSame(shortArray1, shortArray0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, (-2145193886), (-2145193886));
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, 0, 3);
      assertEquals(1, doubleArray1.length);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(1, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Character[] characterArray0 = new Character[0];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertNotSame(characterArray1, characterArray0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Character[] characterArray0 = ArrayUtils.nullToEmpty((Character[]) null);
      assertEquals(0, characterArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, 1851, 1851);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, 44, (-4340));
      assertTrue(Arrays.equals(new boolean[] {}, booleanArray1));
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      long[] longArray0 = ArrayUtils.subarray((long[]) null, 85, 85);
      assertNull(longArray0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      long[] longArray0 = new long[1];
      long[] longArray1 = ArrayUtils.subarray(longArray0, (-2720), 6);
      assertNotSame(longArray1, longArray0);
      assertNotNull(longArray1);
      assertEquals(1, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Boolean[] booleanArray0 = ArrayUtils.nullToEmpty((Boolean[]) null);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertNotSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      char[] charArray0 = ArrayUtils.nullToEmpty((char[]) null);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object[] objectArray1 = ArrayUtils.subarray(objectArray0, (-899), 1505);
      assertNotNull(objectArray1);
      assertNotSame(objectArray1, objectArray0);
      assertEquals(2, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Integer[] integerArray1 = ArrayUtils.subarray(integerArray0, (-1408), (-2146505295));
      assertNotSame(integerArray1, integerArray0);
      assertEquals(0, integerArray1.length);
      assertNotNull(integerArray1);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      int[] intArray0 = new int[1];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      int[] intArray0 = new int[0];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, (int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.nullToEmpty((byte[]) null);
      assertEquals(0, byteArray0.length);
  }
}
