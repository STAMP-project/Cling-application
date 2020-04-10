/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:29:33 GMT 2019
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2l");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("69f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--*[O$HdR ,Zs#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+!jh=<tg*w\"  ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("ESRVL7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("The Array must not be null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0e8Ef`oa6*BT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0x2l` GP|AFjvH$L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x5b");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xFD\"");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0E.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("6El");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)16, (byte)48, (byte)48);
      assertEquals((byte)48, byte0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte)0, (byte)57);
      assertEquals((byte)57, byte0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-1928), (short)17089, (short)17089);
      assertEquals((short)17089, short0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-1), (short) (-1), (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = NumberUtils.max((int) (short)0, (int) (short)0, 2126008811);
      assertEquals(2126008811, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      int int0 = NumberUtils.max((int) (short)3196, 3752, (int) (short) (-1));
      assertEquals(3752, int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      long long0 = NumberUtils.max((long) (byte)88, (long) (byte)88, 2286L);
      assertEquals(2286L, long0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      long long0 = NumberUtils.max((long) (byte)0, 1536L, 0L);
      assertEquals(1536L, long0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)76, (byte) (-36), (byte) (-36));
      assertEquals((byte) (-36), byte0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte) (-34), (byte) (-34), (byte) (-120));
      assertEquals((byte) (-120), byte0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      short short0 = NumberUtils.min((short)1558, (short) (-104), (short) (-189));
      assertEquals((short) (-189), short0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      short short0 = NumberUtils.min((short) (-1), (short)3196, (short) (-1));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      int int0 = NumberUtils.min((int) (short)0, 2231, (-375));
      assertEquals((-375), int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      int int0 = NumberUtils.min((int) (short)5868, (int) (short) (-1913), (int) (short)5868);
      assertEquals((-1913), int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      long long0 = NumberUtils.min(1999L, (long) (short)0, (-906L));
      assertEquals((-906L), long0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      long long0 = NumberUtils.min((long) (byte)106, (long) (byte)0, (long) (byte)106);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      long long0 = NumberUtils.min((long) (byte)0, (long) (byte)0, (long) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[0] = (-1273.0F);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[1] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 767.3;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(767.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)106;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)106, byte0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      short[] shortArray0 = new short[2];
      shortArray0[0] = (short) (byte) (-1);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      short[] shortArray0 = new short[2];
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[2] = (int) (byte)59;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[1] = 2956L;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(2956L, long0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[3] = (-1501.536F);
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-1501.536F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[5] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (-1.0);
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-90);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-90), byte0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short)1252;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = (-906);
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-906), int0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) (byte)97;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.");
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("2e8");
      assertEquals(2.0E8F, number0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("69f");
      assertEquals(69.0F, number0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-7l");
      assertEquals((-7L), number0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("2l");
      assertEquals(2L, number0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-l");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -l is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-*._vcL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -*._vcL is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      try { 
        NumberUtils.createNumber("InvocationTargetException occurred");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // InvocationTargetException occurred is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      try { 
        NumberUtils.createNumber("ESRVaL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ESRVaL is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      try { 
        NumberUtils.createNumber("F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // F is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("2D");
      assertEquals(2.0, number0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E^");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E^ is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0e0f");
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      try { 
        NumberUtils.createNumber("@`wrK\"<pcc9vONq$E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // @`wrK\"<pcc9vONq$E is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      try { 
        NumberUtils.createNumber(":e]*@Ihknu*1b;@FE{3");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \":\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Ha({^pe8Sn8fEX9pvm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Ha({^pe8Sn8fEX9pvm is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0f");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      try { 
        NumberUtils.createNumber("8_/YL~T.NgH_e8f%v#Z");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 8_/YL~T.NgH_e8f%v#Z is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      try { 
        NumberUtils.createNumber("o>ea_TnQ.U-E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // o>ea_TnQ.U-E is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-0.");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0xi#w*Ya{uLF70]L/2Bh");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-i#w*Ya{uLF70]L/2Bh\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null, (short) (byte) (-10));
      assertEquals((short) (-10), short0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null, (byte) (-13));
      assertEquals((byte) (-13), byte0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null, 3579L);
      assertEquals(3579L, long0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null, 45);
      assertEquals(45, int0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      short short0 = NumberUtils.toShort("-0");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      float float0 = NumberUtils.toFloat("");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      int int0 = NumberUtils.toInt("--");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      long long0 = NumberUtils.toLong("-0xThe Array must not be null");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      double double0 = NumberUtils.max((double) (short)6, (double) (short)6, (double) (short)6);
      assertEquals(6.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("--");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      double double0 = NumberUtils.min((double) (-15L), (double) (short)55, (double) (short)55);
      assertEquals((-15.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      double double0 = NumberUtils.toDouble("-0x");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      float float0 = NumberUtils.min((float) 2763L, (float) (short)0, (float) (-1L));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      float float0 = NumberUtils.max((float) 0L, (float) 0L, (float) 0L);
      assertEquals(0.0F, float0, 0.01F);
  }
}
