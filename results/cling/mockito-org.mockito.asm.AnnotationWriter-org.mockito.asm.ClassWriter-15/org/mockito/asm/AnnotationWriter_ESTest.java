/*

 * Tue Mar 03 14:27:31 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationWriter;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      ByteVector byteVector0 = new ByteVector(1);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (short) (-1));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("kaN", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(945);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1541);
      Object object0 = new Object();
      classWriter0.newLong(0L);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("qv$}MM)f)+6\"-", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@47b9d564
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitInnerClass("U.NVZ!!hiM", "InnerClasses", "cJoG[(", 1);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4192);
      int int0 = classWriter0.newConst("h$|P");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("2R", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-327));
      classWriter0.newLong(2);
      classWriter0.visitAnnotation("/o!VU(t{", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (short) (-1));
      classWriter0.newDouble(4193);
      classWriter0.newDouble(4193);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("kaN", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4006));
      Character character0 = Character.valueOf('.');
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4006), "", "j.va/lang/Objeht", "", character0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(2912, 1031);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitOuterClass("", "h^r_7~", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitOuterClass("%!ie]Pwq", "%!ie]Pwq", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4192);
      classWriter0.addType("|T)'^*W3");
      int int0 = classWriter0.addType("@/~Fk,t/rID[#C'5");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("EnclosingMethod", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitSource("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newConst(boolean0);
      Item item0 = classWriter0.newFloat((byte)25);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4192);
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("k7#VxDk", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newMethodItem("", "", "", true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.newMethodItem("", "", "", true);
      classWriter0.newMethodItem("", "", "", true);
      classWriter0.visitOuterClass("", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4020));
      Character character0 = Character.valueOf('\u001F');
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4020), "org.mockito.asm.ClassWriter", "jva/lRg/ObjeOt", "org.mockito.asm.ClassWriter", character0);
      classWriter0.visitAnnotation("jva/lRg/ObjeOt", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(207, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-327));
      classWriter0.newLong(2);
      classWriter0.visitAnnotation(".zass", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4192);
      classWriter0.newDouble(4192);
      classWriter0.newDouble(4192);
      classWriter0.visitInnerClass((String) null, "h$|P", (String) null, 4);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1791);
      Boolean boolean0 = Boolean.FALSE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation(":IZ", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1791);
      classWriter0.visitSource(".s.IFJDCS", "");
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitAnnotation("Bj;:W", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat((byte)25);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newDouble(4193);
      classWriter0.newDouble(4193);
      classWriter0.visitOuterClass("", "h^r_7~", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newDouble(4193);
      classWriter0.newDouble(4193);
      classWriter0.visitOuterClass("%!ie]Pwq", "%!ie]Pwq", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-327));
      Type type0 = Type.LONG_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation(".zass", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-302));
      classWriter0.visitAnnotation("2R", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem("2R");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-302));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass("java/lng/Thrwable", (String) null, "j<(LT-K'906Xiwgt", 7);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      ByteVector byteVector0 = new ByteVector(1);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (short) (-1));
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("kaN", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-302));
      classWriter0.visitAnnotation("2R", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
      
      Byte byte0 = new Byte((byte)12);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newDouble(4193);
      classWriter0.newDouble(4193);
      classWriter0.visitAnnotation("Label offset position has not been resolved yet", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(125, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-934));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass("java/lng/Thrwable", "SourceDebugExtension", ",", (-4643));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4020));
      Character character0 = Character.valueOf('\u001F');
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4020), "org.mockito.asm.ClassWriter", "short", "org.mockito.asm.ClassWriter", character0);
      classWriter0.visitAnnotation("org.mockito.asm.ClassWriter", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(196, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(945);
      classWriter0.visitInnerClass((String) null, (String) null, ",r?5^UDc!g8(wRKQ7=", 945);
      classWriter0.toByteArray();
      classWriter0.visitOuterClass(",r?5^UDc!g8(wRKQ7=", "SourceFile", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitInnerClass((String) null, "", "SourceDebugExtension", 4193);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitOuterClass("%!ie]Pwq", "%!ie]Pwq", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-282));
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = classWriter0.newConst(type0);
      int int1 = classWriter0.addUninitializedType("java/lng/Thrwable", 2332);
      assertEquals(1, int1);
      
      int int2 = classWriter0.addType("java/lng/Thrwable");
      assertTrue(int2 == int0);
      assertEquals(2, int2);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-172));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      Class<Byte> class0 = Byte.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1791);
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      ByteVector byteVector0 = new ByteVector(1);
      classWriter0.visitOuterClass("5", "", (String) null);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-3967));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("short", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7b05569
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      Item item0 = classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      Item item1 = classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      assertSame(item1, item0);
      assertNotNull(item1);
      
      Byte byte0 = new Byte((byte)105);
      Item item2 = classWriter0.newConstItem(byte0);
      assertNotSame(item2, item1);
      assertNotNull(item2);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-302));
      classWriter0.visitAnnotation("2R", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("2R", "org.mockito.asm.Type", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitAnnotation("Label offset position has not been resolved yet", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(150, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitAnnotation("Label offset position has not been resolved yet", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(155, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      classWriter0.visitAnnotation("K@R~T#8u&tCR", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(118, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-327));
      Type type0 = Type.LONG_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 184, "jva/lRg/ObjeOt", "jva/lRg/ObjeOt", "jva/lRg/ObjeOt", "jva/lRg/ObjeOt");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(103, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.addType("D5n>NO");
      classWriter0.addType("D5n>NO");
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 18);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("D5n>NO", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@67bc749f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-327));
      classWriter0.newFloat(4249.0F);
      classWriter0.visitAnnotation(".zass", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1791);
      classWriter0.visitSource(".s.IFJDCS", "");
      Boolean boolean0 = Boolean.FALSE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-282));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitOuterClass("", "", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-934));
      classWriter0.toByteArray();
      Short short0 = Short.valueOf((short) (-259));
      classWriter0.newConst(short0);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-1973));
      annotationWriter0.visit("`O\"SG", short0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      int int0 = classWriter0.addType("D5n>NO");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("D5n>NO");
      assertEquals(1, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-302));
      classWriter0.addUninitializedType("", (-302));
      classWriter0.visitAnnotation("2R", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-934));
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(818, 818);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.visitAnnotation("K@R~T#8u&tCR", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4192);
      Item item0 = classWriter0.newDouble(4192);
      Item item1 = classWriter0.newDouble(4192);
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      ByteVector byteVector0 = new ByteVector(1);
      Item item0 = classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (short) (-1));
      classWriter0.visitAnnotation("K@R~T#8u&tCR", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("'QU*%OJ?$=C6sN'N=p", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@31c49ca3
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(945);
      ByteVector byteVector0 = new ByteVector(2);
      classWriter0.visitInnerClass((String) null, (String) null, ",r?5^UDc!g8(wRKQ7=", 945);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 6);
      // Undeclared exception!
      try { 
        annotationWriter0.visit(" wm$sr:_:Pykoud", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@1b6e69a8
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(58, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-4020));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      classWriter0.visitAnnotation("jva/lRg/ObjeOt", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Label offset position has not been resolved yet", byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.ByteArrayInputStream@3e3e20df
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      Item item0 = classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      Item item1 = classWriter0.newFieldItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p");
      assertSame(item1, item0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(58, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.newMethodItem("'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", "'QU*%OJ?$=C6sN'N=p", false);
      classWriter0.visitInnerClass("t>h'Vgw`i+J#K", "", "int", (-1633));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-302));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitAnnotation("2R", false);
      int int0 = classWriter0.newConst(type0);
      assertEquals(3, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-302));
      classWriter0.visitAnnotation("2R", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      classWriter0.addType("yZIxu6[KLy{");
      int int0 = classWriter0.addUninitializedType("yZIxu6[KLy{", (byte)3);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      ByteVector byteVector0 = new ByteVector(2);
      classWriter0.visitOuterClass("5", (String) null, (String) null);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 582);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("value ", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@46b53422
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4192);
      classWriter0.newDouble(4192);
      classWriter0.newDouble(4192);
      classWriter0.visitInnerClass("h$|P", "", "h$|P", 20);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-945));
      classWriter0.newConst("");
      int int0 = classWriter0.newConst("");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(30, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-282));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass((String) null, "java/lng/Thrwable", (String) null, 19);
      classWriter0.visitInnerClass("(?E]O,z6I.wH.[5", "ZM)K3Nb/wZe6:Z", ",\"XJ!*tbl|", 2);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1791);
      classWriter0.visitSource(".s.IFJDCS", "");
      int int0 = classWriter0.addType("Dm5n>NO");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-302));
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("2R", "org.mockito.asm.Type", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-934));
      classWriter0.visitSource("", "-]3\u0003)A1");
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 251658240);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Deprecated", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@199a975d
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4193);
      classWriter0.toByteArray();
      Byte byte0 = new Byte((byte)105);
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }
}
