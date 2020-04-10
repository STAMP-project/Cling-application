/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:53:21 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZoneInfoCompiler_ESTest extends ZoneInfoCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("p)T%t", "p)T%t");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("link");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("rule");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n$#");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#NU6X3nol&,Vw");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" \t");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("  -verbose            Output verbosely (default false)");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("'(", "'(");
      mockFile0.createNewFile();
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File[] fileArray0 = new File[0];
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /home/pderakhshanfar/rq3/botsing-integration-experiment/'(/'(
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile((File) null, (File[]) null);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("'(", "'(");
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File[] fileArray0 = new File[0];
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination directory doesn't exist: /home/pderakhshanfar/rq3/botsing-integration-experiment/'(/'(
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = ZoneInfoCompiler.test("", fixedDateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("Zone musR not be null", false);
      boolean boolean0 = ZoneInfoCompiler.test("Zone musR not be null", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('w');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('u');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('s');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('Z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('W');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('S');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('-');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('G');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Zone must not be null");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("-1pgYa;-EO9$WW5");
      assertEquals((-3600000), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("-");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("null");
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("only", (-348));
      assertEquals((-348), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("max", 3004);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("maximum", 2);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("min", (-868));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("/?=^nuf#%R\"] r5LXa", 9);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/?=^nuf#%r\"] r5lxa\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("minimum", 2);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      hashMap0.put("'", dateTimeZone0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      assertEquals(29, byteArrayOutputStream0.size());
      assertEquals("\u0000\u0002\u0000\u0001'\u0000\u0010Europe/Amsterdam\u0000\u0001\u0000\u0000\u0000\u0001", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      hashMap0.put("Eu", fixedDateTimeZone0);
      hashMap0.put("-:", fixedDateTimeZone0);
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.writeZoneInfoMap((DataOutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZoneInfoCompiler.parseTime("9");
      int int0 = ZoneInfoCompiler.parseTime("9");
      assertEquals(32400000, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-src";
      stringArray0[1] = "max";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-?";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-verbose";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek("t{|.C:nr{/]wYw<q8/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"t{|.C:nr{/]wYw<q8/\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("4l%HvqXM22", "4l%HvqXM22", true);
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // l
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      ZoneInfoCompiler.verbose();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("Link", "Pz])**");
      MockFile.createTempFile("Link", "Pz])**", (File) mockFile0);
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, (File[]) null);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-dst";
      stringArray0[1] = "-dst";
      stringArray0[2] = "-dst";
      stringArray0[3] = "-dst";
      stringArray0[4] = "-dst";
      stringArray0[5] = "-dst";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, "", 87, 0, (-139));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, 1);
  }
}
