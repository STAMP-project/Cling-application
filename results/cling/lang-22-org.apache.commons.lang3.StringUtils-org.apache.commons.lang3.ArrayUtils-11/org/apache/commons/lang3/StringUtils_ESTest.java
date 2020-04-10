/*

 * Tue Mar 03 16:14:08 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = StringUtils.repeat("", 46);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("c7'W`SY2", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1288);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[4];
      stringArray0[1] = "";
      boolean boolean0 = StringUtils.endsWithAny("0#J!MD2", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1250);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("A-H0h%r)*qL62ThV=", 104);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("y'u", 8192);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "y'u");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.repeat("<OJz^", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.repeat(";p}", 1);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace(";p}");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat(";p}", 4866);
      String string1 = StringUtils.substring(string0, 4866, 4866);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("A-H0h%r)*qL62ThV=", 1);
      assertEquals("A-H0h%r)*qL62ThV=", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("I[F@HXa\"", "A-H0h%r)*qL62ThV=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35e N-", 1);
      assertNotNull(string0);
      assertEquals("p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35e N-", string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[1] = "p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35e N-";
      boolean boolean0 = StringUtils.endsWithAny("p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35C4cw>p'}cEv35e N-", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("A-H0h%r)*qL62ThV=", 1);
      assertEquals("A-H0h%r)*qL62ThV=", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.repeat("", 8192);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringUtils.repeat("", 46);
      String string1 = StringUtils.normalizeSpace("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.repeat("org.apache.commons.lang3.ObjectUtils^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u^y'u", 2);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("r+c-c", 13);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("r+c-cr+c-cr+c-cr+c-cr+c-cr+c-cr+c-cr+c-cr+c-cr+c-cr+c-cr+c-cr+c-c");
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("", 127);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "rVUe'8=,\"|w7'Tse@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("A-H0h%r)*qL62ThV=", 1);
      assertEquals("A-H0h%r)*qL62ThV=", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", 17);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase(string0, "\"Mvsn5lz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringUtils.repeat(string0, 4298);
      assertNotNull(string1);
      
      boolean boolean0 = StringUtils.endsWith(string0, " is not in the range '0' - '9'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringUtils.repeat("+:`9G2%+mO", 764);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "+:`9G2%+mO";
      boolean boolean0 = StringUtils.endsWithAny("+:`9G2%+mO", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      StringUtils.endsWithAny("y'u", stringArray0);
      String string0 = StringUtils.repeat("y'u", 2993);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("y'u", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("y'u", 1);
      assertEquals("y'u", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[9];
      boolean boolean0 = StringUtils.endsWithAny("=z[W8 t2]=C?B,dQ", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("=z[W8 t2]=C?B,dQ", 1);
      assertEquals("=z[W8 t2]=C?B,dQ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1288);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[4];
      boolean boolean0 = StringUtils.endsWithAny("0#J!MD2", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1250);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[3];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[9];
      boolean boolean0 = StringUtils.endsWithAny("=z[W8 t2]=C?B,dQ", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("M:.OP|:Sy1)", 68);
      assertNotNull(string0);
      assertEquals("M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)M:.OP|:Sy1)", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[1];
      StringUtils.endsWithAny((String) null, stringArray0);
      String string0 = StringUtils.repeat("+:`9G2%+mO", 1145);
      assertNotNull(string0);
  }
}
