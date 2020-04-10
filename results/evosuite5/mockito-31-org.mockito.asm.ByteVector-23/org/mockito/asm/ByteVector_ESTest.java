/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:18:09 GMT 2019
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ByteVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ByteVector_ESTest extends ByteVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      // Undeclared exception!
      try { 
        byteVector0.putByteArray(byteVector0.data, 315, 315);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByteArray((byte[]) null, (-1403), (-1403));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(3);
      ByteVector byteVector1 = byteVector0.putUTF8("B ;");
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putUTF8(">vB;");
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(4);
      ByteVector byteVector1 = byteVector0.putLong(4);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(945L);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putInt(1890);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.put12(0, 0);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put12((-418), (-418));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.putShort(0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putShort(1890);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.put11(0, 0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put11(1844, 1844);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.putByte(0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(3);
      ByteVector byteVector1 = byteVector0.putInt(3);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByte(1);
      assertSame(byteVector0, byteVector1);
  }
}
