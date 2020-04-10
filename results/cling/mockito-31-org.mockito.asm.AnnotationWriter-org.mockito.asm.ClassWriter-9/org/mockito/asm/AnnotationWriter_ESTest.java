/*

 * Tue Mar 03 14:26:32 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.AnnotationWriter;
import org.mockito.asm.Attribute;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newFieldItem("", "", "");
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@7581b856
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(697);
      Type type0 = Type.VOID_TYPE;
      classWriter0.visitField(1, "B", "3n_#", "g}YZo]tFDs[y;Uy~b=", type0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("3n_#", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(435);
      classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", false);
      Type type0 = Type.CHAR_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(435, "org.mockito.asm.MethodWriter", "lZ:h;OLcc<s~l6", (String) null, type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2666);
      Byte byte0 = new Byte((byte) (-126));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3080));
      classWriter0.newConst("");
      Item item0 = classWriter0.newLong(6);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2659);
      classWriter0.visitAnnotation("0", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(2659, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("8tBejqg", " &");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
      
      int int0 = classWriter0.newMethod(" &", "8tBejqg", "Synthetic", true);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("8Bejqg", " &");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem(" &", " &", " &", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", false);
      classWriter0.visitField(19, "%M Qiu6.NKw\u0002rrJ@", "JVYDC7{W9Wm5[-u", "PY4y>)YwK7ZPW!Y9&;", "JVYDC7{W9Wm5[-u");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(180, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      Short short0 = new Short((short)18);
      classWriter0.newConst(short0);
      Item item0 = classWriter0.newDouble((-912.6653289802996));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(697);
      Character character0 = Character.valueOf('\u0083');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(273, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5164));
      classWriter0.visitField(1, "'nx", "'nx", "'nx", "'nx");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-5164), (-1393));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2672);
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitField(2672, "W)27~a'Rs", "", "", type0);
      classWriter0.visitInnerClass("NN;K\"gP1ocdgm@jK", "EnclosingMethod", "", 984);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(173, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(462);
      classWriter0.newFloat(2);
      classWriter0.visitSource("SW-", "java/lang/Object");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2666);
      Type type0 = Type.VOID_TYPE;
      classWriter0.visitField(2666, "", "", "", type0);
      classWriter0.visitInnerClass("", "org.mockito.asm.Type", "SourceDebugExtension", 10);
      classWriter0.visitInnerClass("", "org.mockito.asm.Type", "", 9);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Boolean boolean0 = new Boolean("E");
      ClassWriter classWriter0 = new ClassWriter(365);
      classWriter0.newConst(boolean0);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 66);
      annotationWriter0.visit("!", boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", false);
      classWriter0.visitInnerClass("java/lang/Object", "java/lang/Object", "", 1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(143, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.visitOuterClass("Synthetic", "&w$j?)7", "%iq3H$]J");
      classWriter0.visitSource("&w$j?)7", "");
      int int0 = classWriter0.newNameType("&w$j?)7", "%iq3H$]J");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.newNameType("2-Mp2\"v_HO6A|4", "");
      classWriter0.visitSource((String) null, (String) null);
      int int0 = classWriter0.newNameType("2-Mp2\"v_HO6A|4", "");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(462);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1909);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@547e1f66
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(973);
      classWriter0.visitInnerClass("qq,h(|a;B&Ccq", "qq,h(|a;B&Ccq", "qq,h(|a;B&Ccq", 5);
      classWriter0.visitSource("$if#wEVP&em[ejw", "$if#wEVP&em[ejw");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(157, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      classWriter0.newMethod("PY4y>)YwK7ZPW!Y9&;", "PY4y>)YwK7ZPW!Y9&;", "PY4y>)YwK7ZPW!Y9&;", true);
      Object object0 = new Object();
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", false);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("java/lang/Object", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@5fa0a5b4
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("8Bejqg", " &");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.newDouble(649);
      classWriter0.visitAnnotation("J", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3080));
      classWriter0.newLong(6);
      classWriter0.visitSource("/laP/Strin9", "keq}:");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3080));
      classWriter0.visitAnnotation("8^R.;WAAB(_#{'VfT", true);
      classWriter0.newLong(6);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.visitInnerClass("Synthetic", "", "SourceDebugExtension", 2047);
      classWriter0.visitOuterClass("Synthetic", "&w$j?)7", "%iq3H$]J");
      int int0 = classWriter0.newNameType("&w$j?)7", "%iq3H$]J");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      int int0 = classWriter0.addType("8tBejqg");
      assertEquals(1, int0);
      
      classWriter0.visitInnerClass("gi", "S#y*.>8]", "S#y*.>8]", 20);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.visitAnnotation("", true);
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.visitField(22, "", "", "", boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(462);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("org.mockito.asm.MethodWriter", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(486);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(462);
      Boolean boolean0 = Boolean.valueOf("SW-");
      classWriter0.newConstItem(boolean0);
      classWriter0.visitSource("SW-", "java/lang/Object");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.newFloat(649);
      classWriter0.visitAnnotation("J", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("8tBejqg", " &");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(383);
      Type type0 = Type.VOID_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2666);
      int int0 = classWriter0.addUninitializedType("", 2666);
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3080));
      int int0 = classWriter0.newConst("");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("8^R.;WAAB(_#{'VfT", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass((String) null, (String) null, "8+]", 9);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      Object object0 = new Object();
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", false);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "java/lang/Object";
      stringArray0[1] = "PY4y>)YwK7ZPW!Y9&;";
      stringArray0[2] = "";
      classWriter0.visitMethod(2952, "", "PY4y>)YwK7ZPW!Y9&;", "", stringArray0);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("java/lang/Object", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7dec97c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(973);
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitSource("$if#wEVP&em[ejw", "$if#wEVP&em[ejw");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(129, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", true);
      classWriter0.visitInnerClass("java/lang/Object", "java/lang/Object", "java/lang/Object", 1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(138, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2666);
      Byte byte0 = new Byte((byte) (-126));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("JD^!8zfqX,[SPz1KCO", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      int int0 = classWriter0.newMethod("PY4y>)YwK7ZPW!Y9&;", "PY4y>)YwK7ZPW!Y9&;", "PY4y>)YwK7ZPW!Y9&;", true);
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.visitInnerClass("1z4$1],U$&y8,:P/;", "Synthetic", (String) null, 649);
      Type type0 = Type.VOID_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-418), "Synthetic", "", "=f@Np(GE%Nf=9{|a<2*", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitInnerClass("", (String) null, "", 16);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newFieldItem("", "", "");
      classWriter0.visitInnerClass("", (String) null, "", 16);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(654);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.addType("8tBejqg");
      classWriter0.addType("e");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 256);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("8tBejqg", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@766b214c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.visitField(22, "", "", "", boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4537));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2666, "'nx", "'nx", "'nx", "'nx");
      classWriter0.visitSource("", "org.mockito.asm.ClassWriter");
      classWriter0.toByteArray();
      FieldVisitor fieldVisitor1 = classWriter0.visitField(9, "~Vauzm5xDGn[4GUE-", "4", "org.mockito.asm.ClassWriter", "'nx");
      assertFalse(fieldVisitor1.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4537));
      classWriter0.visitField(2666, "'nx", "'nx", "'nx", "'nx");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(85, byteArray0.length);
      
      int int0 = classWriter0.newConst("'nx");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2659);
      classWriter0.addType("0");
      classWriter0.visitAnnotation("0", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      int int0 = classWriter0.addType("D.XJ");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      int int0 = classWriter0.newMethod("PY4y>)YwK7ZPW!Y9&;", "PY4y>)YwK7ZPW!Y9&;", "PY4y>)YwK7ZPW!Y9&;", true);
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(2);
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("8tBejqg", " &");
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit(" &", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@75460884
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", false);
      classWriter0.newFieldItem("", "]fUPA(uY2~,99'$o", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(122, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newFieldItem("", "", "");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("PY4y>)YwK7ZPW!Y9&;", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newFieldItem("", "", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(45, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addType("8tBejqg");
      classWriter0.addType("8tBejqg");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 3);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("LineNumberTable", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@1e61b534
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.newFloat((-783.901F));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addType("8tBejqg");
      int int0 = classWriter0.addType("8tBejqg");
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("T:~", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2666);
      Short short0 = new Short((short)70);
      classWriter0.visitField(101, "", "#/Bb=~{gu:3K#hD7nC", "#/Bb=~{gu:3K#hD7nC", short0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(105, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(2);
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-1680));
      Boolean boolean0 = Boolean.TRUE;
      annotationWriter0.visit("org.mockito.asm.Frame", boolean0);
      annotationWriter0.visit("org.mockito.asm.Frame", boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2672);
      Type type0 = Type.VOID_TYPE;
      classWriter0.visitField(2672, "W)27~a'Rs", "v", "", type0);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(152, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addType("8tBejqg");
      int int0 = classWriter0.addType("8tBejqg");
      assertEquals(1, int0);
      
      classWriter0.visitSource("8tBejqg", " &");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(462);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      int int0 = classWriter0.newMethod("|`r`RFW_:o}1k2T4O", "T:~", "|`r`RFW_:o}1k2T4O", false);
      assertEquals(5, int0);
      
      classWriter0.visitAnnotation("T:~", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(103, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(462);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitSource("b[#@", "short");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(697);
      classWriter0.visitAnnotation("cEar", true);
      classWriter0.toByteArray();
      Byte byte0 = Byte.valueOf((byte)4);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2, "S*^q3VnO,05-u+mQ#R", "S*^q3VnO,05-u+mQ#R", "S*^q3VnO,05-u+mQ#R", byte0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 3);
      classWriter0.visitAnnotation("T:~", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("LineNumberTable", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@56f2ea4
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      Boolean boolean0 = Boolean.TRUE;
      Attribute attribute0 = new Attribute("");
      classWriter0.visitAttribute(attribute0);
      classWriter0.visitField(2, "", "", "", boolean0);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(697);
      Character character0 = Character.valueOf('\u0083');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(462);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitInnerClass("O!", "org.mockito.asm.MethodWriter", "SourceDebugExtension", 1087);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(126, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(462);
      Boolean boolean0 = Boolean.valueOf("SW-");
      classWriter0.newConstItem(boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(973);
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(46, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("8Bejqg", " &");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("v_5=t^xM)AS", "8Bejqg", " &");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "#v BX.fy1I2B ";
      stringArray0[1] = "t$I";
      stringArray0[2] = "";
      classWriter0.visit((-2803), (-2803), "", "", "", stringArray0);
      classWriter0.visitField(1408, "", "", (String) null, "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(138, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.addType("boolean");
      int int0 = classWriter0.addType("Y^?|g$|");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(649);
      classWriter0.visitOuterClass("", "D", "'");
      Type type0 = Type.LONG_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2666);
      int int0 = classWriter0.addUninitializedType("", 2666);
      assertEquals(1, int0);
      
      classWriter0.addType("8tBejqg");
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2666);
      Byte byte0 = new Byte((byte) (-126));
      int int0 = classWriter0.newConst(byte0);
      int int1 = classWriter0.addUninitializedType("", 2666);
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }
}
