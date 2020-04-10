/*

 * Tue Mar 03 14:28:14 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.AnnotationWriter;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.FieldWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.newMethod("k$T/1@YTMrnx@zg", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations", true);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("k$T/1@YTMrnx@zg", true);
      classWriter0.newFieldItem("", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations");
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 2);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, (InputStream) null);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("RuntimeInvisibleAnnotations", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@60e4b38f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      Type type0 = Type.CHAR_TYPE;
      classWriter0.visitField(593, "PmbI>i", "Synthetsc", (String) null, type0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("RuntimeInvisibleAnnotations", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(600);
      Item item0 = classWriter0.newLong(1);
      ByteVector byteVector0 = new ByteVector(600);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 600);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Deprecated", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@6465001e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitSource("6/", "Signature");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.newMethod("{<2;&kI)9S~1V+Vy6d'", (String) null, "$~}5", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.newMethodItem("PmbI>i", "@'N9yUH;/#Kge`r", "", false);
      classWriter0.visitSource("PmbI>i", "PmbI>i");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(123, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitAnnotation("J+8OKs<!|P^zvF7:7", false);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3920), "float", "J+8OKs<!|P^zvF7:7", "J+8OKs<!|P^zvF7:7", "float");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(186, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.visitAnnotation("k$T/1@YTMrnx@zg", false);
      classWriter0.newLong(5);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.newDouble(0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 0);
      classWriter0.newDouble(0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@a94e830
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitAnnotation("RuntimeVisibleAnnotations", false);
      classWriter0.toByteArray();
      Boolean boolean0 = new Boolean((String) null);
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      Byte byte0 = new Byte((byte)45);
      classWriter0.newConstItem(byte0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(101, 285212682);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.addType("()rEp,Q[6F[3^-$");
      int int0 = classWriter0.addType("x*UN4_L");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("()rEp,Q[6F[3^-$", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      int int0 = classWriter0.newMethod("k$T/1@YTMrnx@zg", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations", true);
      assertEquals(5, int0);
      
      classWriter0.visitAnnotation("k$T/1@YTMrnx@zg", false);
      int int1 = classWriter0.newClass("k$T/1@YTMrnx@zg");
      assertEquals(2, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(97, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-313));
      Boolean boolean0 = new Boolean(true);
      classWriter0.visitField(5, "()rEp,Q[6F[3^-$", "()rEp,Q[6F[3^-$", "()rEp,Q[6F[3^-$", boolean0);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(144, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.newFloat(0);
      classWriter0.newFloat(0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 90);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("p", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@4fdf6093
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitInnerClass("Signature", "Signature", "Signature", 46);
      classWriter0.visitSource("6/", "Signature");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(134, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitAnnotation("PmbI>i", true);
      classWriter0.toByteArray();
      Type type0 = Type.getObjectType("Label offset position has not been resolved yet");
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.newDouble(593);
      classWriter0.visitSource("RuntimeVisibleAnnotations", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.newDouble(593);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(597);
      classWriter0.newLong(1);
      classWriter0.visitSource("", "RuntimeVisibleAnnotations");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.visitAnnotation("k$T/1@YTMrnx@zg", true);
      classWriter0.newLong(5);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newDouble(0);
      classWriter0.newDouble(0);
      classWriter0.visitOuterClass("()rEp,Q[6F[3^-$", (String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.newMethod("k$T/1@YTMrnx@zg", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations", true);
      classWriter0.newFieldItem("", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations");
      classWriter0.visitInnerClass((String) null, (String) null, "h3X&'moYf", 2);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitInnerClass("Signature", "Signature", "Signature", 46);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      int int0 = classWriter0.addType("[]");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitAnnotation("PmbI>i", true);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.FALSE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(5, "PmbI>i", "^2{S/Z,7LEP'^", "", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitSource("RuntimeVisibleAnnotations", "PmbI>i");
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.FALSE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(5, "PmbI>i", "^2{S/Z,7LEP'^", "", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFloat(0);
      classWriter0.newFloat(0);
      classWriter0.visitAnnotation("p", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-2209), (-2470));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      Type type0 = Type.CHAR_TYPE;
      classWriter0.visitField(593, "PmbI>i", "Synthetsc", (String) null, type0);
      classWriter0.visitAnnotation("RuntimeVisibleParameterAnnotations", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(161, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitSource("", "i9h");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
      
      int int0 = classWriter0.addUninitializedType("6|mIZIG_S$", (-893));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitAnnotation("PmbI>i", true);
      int int0 = classWriter0.newConst("PmbI>i");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.newMethodItem("", "", "", false);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(184);
      classWriter0.visitMethod(1068, "", "tmsTuEy", "tmsTuEy", (String[]) null);
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitAnnotation("Pm#i", true);
      classWriter0.toByteArray();
      int int0 = classWriter0.addUninitializedType("X5Y Qi\"HAZ(#[Q}{CL", (-1981));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitSource("PmbI>i", "PmbI>i");
      classWriter0.toByteArray();
      Type type0 = Type.getObjectType("Label offset position has not been resolved yet");
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      int int0 = classWriter0.newMethod("k$T/1@YTMrnx@zg", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations", true);
      assertEquals(5, int0);
      
      classWriter0.visitAnnotation("k$T/1@YTMrnx@zg", true);
      int int1 = classWriter0.newClass("k$T/1@YTMrnx@zg");
      assertEquals(2, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(125, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((short)42);
      Byte byte0 = new Byte((byte)101);
      classWriter0.visitField((short)42, "Signature", "Signature", (String) null, byte0);
      classWriter0.visitAnnotation("<G9sQ<", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Character character0 = Character.valueOf('f');
      classWriter0.visitField(292, "", "org.mockito.asm.ClassWriter", "75KoGpW\"tlr<;F;;,+!", character0);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(176, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.newDouble(593);
      classWriter0.visitAnnotation("PmbI>i", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitInnerClass("Signature", "Signature", "Signature", 46);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      int int0 = classWriter0.newField("", "Signature", "Signature");
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.newMethod("k$T/1@YTMrnx@zg", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations", true);
      classWriter0.newFieldItem("", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations");
      classWriter0.visitInnerClass("", "EnclosingMethod", "", (-314));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(597);
      classWriter0.visitOuterClass("", "", "");
      Item item0 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.addType("()rEp,Q[6F[3^-$");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 31);
      classWriter0.addType("x*UN4_L");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@1a0368c2
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.visitOuterClass("()rEp,Q[6F[3^-$", "()rEp,Q[6F[3^-$", "()rEp,Q[6F[3^-$");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-330));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("()rEp,Q[6F[3^-$", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@76a97bd
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitSource("PmbI>i", "PmbI>i");
      int int0 = classWriter0.newConst("PmbI>i");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(597);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("", "", "");
      ByteVector byteVector0 = new ByteVector(4096);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 171);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@63c3d26
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitAnnotation("p", true);
      int int0 = classWriter0.newMethod("p", "D-($BAcBx@qcbk'*yS", "y", false);
      assertEquals(6, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(106, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitSource("PmbI>i", "PmbI>i");
      classWriter0.toByteArray();
      Type type0 = Type.BYTE_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.newFieldItem("", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations");
      classWriter0.visitAnnotation("k$T/1@YTMrnx@zg", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      int int0 = classWriter0.newMethod("k$T/1@YTMrnx@zg", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations", true);
      assertEquals(5, int0);
      
      classWriter0.newFieldItem("", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations");
      classWriter0.visitAnnotation("k$T/1@YTMrnx@zg", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(108, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      int int0 = classWriter0.newMethod("k$T/1@YTMrnx@zg", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations", true);
      assertEquals(5, int0);
      
      classWriter0.visitAnnotation("k$T/1@YTMrnx@zg", true);
      classWriter0.newFieldItem("", "k$T/1@YTMrnx@zg", "RuntimeInvisibleAnnotations");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(136, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(4866);
      classWriter0.addType("");
      classWriter0.addType("");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 4866);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("]c*0-b~V(}JY", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@698880c7
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFloat(0);
      classWriter0.newFloat(0);
      classWriter0.visitAnnotation("p", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitSource("6/", "Signature");
      classWriter0.toByteArray();
      Short short0 = new Short((short)220);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(18, "Signature", "6/", "a/|Y", short0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.toByteArray();
      Short short0 = new Short((short)220);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(18, "Signature", "6/", "a/|Y", short0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-330));
      Byte byte0 = new Byte((byte)45);
      classWriter0.newConstItem(byte0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-960));
      classWriter0.toByteArray();
      annotationWriter0.visit("Ljava/lang/Synthetic;", byte0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-330));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 31);
      classWriter0.visitSource("()rEp,Q[6F[3^-$", (String) null);
      classWriter0.toByteArray();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@5dd72cc4
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      int int0 = classWriter0.addType("()rEp,Q[6F[3^-$");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("()rEp,Q[6F[3^-$");
      assertEquals(1, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = classWriter0.addUninitializedType("#[9^fB;6n$rG,j?v", 73);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("J+8OKs<!|P^zvF7:7", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(626);
      classWriter0.visitAnnotation("PmbI>i", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(626, (-960));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFloat(0);
      classWriter0.newFloat(0);
      classWriter0.visitSource("p", "p");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      Byte byte0 = new Byte((byte)45);
      classWriter0.newConstItem(byte0);
      classWriter0.visitAnnotation("#", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("PmbI>i", true);
      classWriter0.toByteArray();
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("\n]<s35%~C9$G9^}0", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@5d4daddb
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitInnerClass("Signature", "Signature", "Signature", 46);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 46);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("( O}:;es0", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Character character0 = Character.valueOf('f');
      classWriter0.visitField(292, "", "org.mockito.asm.ClassWriter", "75KoGpW\"tlr<;F;;,+!", character0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(136, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newFloat(0);
      Item item1 = classWriter0.newFloat(0);
      assertSame(item1, item0);
      
      classWriter0.visitInnerClass("Signature", "p", "", 2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(85, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-313));
      Boolean boolean0 = new Boolean(true);
      classWriter0.visitField(5, "()rEp,Q[6F[3^-$", "()rEp,Q[6F[3^-$", "()rEp,Q[6F[3^-$", boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(597);
      classWriter0.newFieldItem("", "", "");
      classWriter0.visitSource("", "RuntimeVisibleAnnotations");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(115, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(597);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("", "", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(40, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.addType("()rEp,Q[6F[3^-$");
      int int0 = classWriter0.addType("x*UN4_L");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("QU$0", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(593);
      classWriter0.visitOuterClass("PmbI>i", "4l2nU0e+xA(,pT-oa'", (String) null);
      Object object0 = new Object();
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("4l2nU0e+xA(,pT-oa'", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@4edd4a59
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 0);
      classWriter0.visitOuterClass("()rEp,Q[6F[3^-$", (String) null, (String) null);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@69cab0e1
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-1));
      classWriter0.visitInnerClass((String) null, (String) null, "[]", 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(46);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 46);
      classWriter0.visitInnerClass("", "", (String) null, 2);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@d602048
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-330));
      classWriter0.addType("()rEp,Q[6F[3^-$");
      int int0 = classWriter0.addType("x*UN4_L");
      assertEquals(2, int0);
      
      classWriter0.visitSource("()rEp,Q[6F[3^-$", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(63, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.addUninitializedType("YL_@z", 0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@366e82c3
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.visitSource((String) null, (String) null);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("b+(k;X\t", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@4691af98
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitInnerClass("", "", "", 2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      classWriter0.visitInnerClass("", "ck.30?TrQv>rY9hR}", "a WR5u*qwVi+<", 106);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("a WR5u*qwVi+<", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@3de748ff
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
