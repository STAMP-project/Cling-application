/*

 * Tue Mar 03 14:25:33 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.AnnotationWriter;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-18));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      int int0 = classWriter0.newField("", "", "CW+7+");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2557);
      Short short0 = new Short((short) (-1));
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(21);
      classWriter0.visitOuterClass("~yS", "~yS", "~yS");
      classWriter0.newConst("~yS");
      Item item0 = classWriter0.newFieldItem("~yS", "~yS", "~yS");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      classWriter0.visitInnerClass("o~", "_#o[OA.m", "o~", 2);
      classWriter0.visitInnerClass("", "", "", 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552704);
      classWriter0.visitSource("6Y;-ky]c", "6Y;-ky]c");
      Byte byte0 = new Byte((byte)37);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552674);
      classWriter0.newFloat(292552674);
      classWriter0.newFloat(292552674);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      classWriter0.newLong(1372L);
      Item item0 = classWriter0.newLong(1372L);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@3cc12297
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      classWriter0.addType("");
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(288, byteArray0.length);
      
      Type type0 = Type.SHORT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIJJIIIIIIIIIIIIIIIIII", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(13, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("_#o[OA.m", "_#o[OA.m", "_#o[OA.m");
      classWriter0.newMethod("_#o[OA.m", "_#o[OA.m", "_#o[OA.m", true);
      classWriter0.visitInnerClass((String) null, "RuntimeVisibleAnnotations", "cuc03O'0(JvAD+*#h", 46);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-11));
      classWriter0.newMethodItem(".", ".", ".", false);
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", ".");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(314, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      int int0 = classWriter0.newConst("_#o[OA.m");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-39));
      classWriter0.newDouble((-39));
      ByteVector byteVector0 = new ByteVector(2153);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 310);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Deprecated", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@65ee149e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-11));
      classWriter0.newLong((-2380L));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      ClassWriter classWriter0 = new ClassWriter(29);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2557);
      Character character0 = Character.valueOf('}');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("T1:Ph@_", "T1:Ph@_");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552618);
      Boolean boolean0 = Boolean.valueOf("");
      classWriter0.newConst(boolean0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(13, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552674);
      classWriter0.visitInnerClass("", "", "o~", 0);
      classWriter0.visitInnerClass((String) null, (String) null, "", 2);
      Type type0 = Type.BYTE_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(0, "", "o~", "", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2557);
      Short short0 = new Short((short) (-1));
      classWriter0.newConst(short0);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 4);
      annotationWriter0.visit("x1F-;9]htVTr}", short0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      classWriter0.addType("");
      int int0 = classWriter0.addUninitializedType("&:*d4p0,Bpn9X", (-889275714));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.newClass("RuntimeVisibleAnnotations");
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("RuntimeVisibleAnnotations", "", "Synthetic", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      int int0 = classWriter0.addUninitializedType("_#o[OA.m", 2);
      assertEquals(1, int0);
      
      classWriter0.visitInnerClass("_#o[OA.m", "", "_#o[OA.m", 248);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      ClassWriter classWriter0 = new ClassWriter(29);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("0!", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("_#o[OA.m", "_#o[OA.m", "_#o[OA.m");
      classWriter0.newMethod("_#o[OA.m", "_#o[OA.m", "_#o[OA.m", true);
      classWriter0.visitSource("7nb?M@5MxI>;E)>#:h", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552674);
      classWriter0.newInteger(292552674);
      classWriter0.newInteger(292552674);
      classWriter0.visitAnnotation("u[t'8c", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552693);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.newFloat(292552693);
      classWriter0.newFloat(292552693);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@2ff5ca32
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552674);
      classWriter0.newInteger(292552674);
      classWriter0.newInteger(292552674);
      classWriter0.visitSource("u[t'8c", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552654);
      classWriter0.visitInnerClass("", "", "# U.", 0);
      classWriter0.visitSource("# U.", "org.mockito.asm.ClassWriter");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(146, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      Item item0 = classWriter0.newLong(1372L);
      classWriter0.newMethodItem("", "", "", true);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@51803a0e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      classWriter0.newDouble(13);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552674);
      classWriter0.newFloat(292552674);
      classWriter0.newFloat(292552674);
      classWriter0.visitInnerClass("", "", (String) null, 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.newMethodItem(".", ".", ".", false);
      classWriter0.newMethodItem(".", ".", ".", false);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation(".", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      classWriter0.newDouble(29);
      classWriter0.visitAnnotation("0!", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2149));
      classWriter0.newLong(1);
      classWriter0.visitSource("%@~Oa`7$~", "%@~Oa`7$~");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2557);
      Character character0 = Character.valueOf('}');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("T1:Ph@_", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitAnnotation("", true);
      classWriter0.newLong(1372L);
      classWriter0.newLong(1372L);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      classWriter0.visitInnerClass((String) null, (String) null, "l*9ong", 220);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-19));
      classWriter0.visitOuterClass("RuntimeVisibleAnnotations", "2~jeO", "java/lang/Object");
      Item item0 = classWriter0.newFloat((-19));
      Item item1 = classWriter0.newFloat((-19));
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      ClassWriter classWriter0 = new ClassWriter(29);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("0!", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552654);
      classWriter0.visitInnerClass("", "", "#B U.", 0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      ClassWriter classWriter0 = new ClassWriter(29);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552674);
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.visitField(292552674, "rsd#0n3Ij@S", "rsd#0n3Ij@S", "rsd#0n3Ij@S", boolean0);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(185, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      Boolean boolean0 = Boolean.valueOf("Exceptions");
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(522, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552674);
      classWriter0.newFloat(292552674);
      classWriter0.newFloat(292552674);
      classWriter0.visitAnnotation("Synthetic", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-8));
      int int0 = classWriter0.addUninitializedType("_#o[OA.m", (-8));
      assertEquals(1, int0);
      
      classWriter0.addUninitializedType("_#o[OA.m", (-8));
      String[] stringArray0 = new String[1];
      stringArray0[0] = ":'QTkJ;*G+!>C$n8";
      classWriter0.visit(450, 1, ":'QTkJ;*G+!>C$n8", "BI;W(bN\"}{99dtk", "BI;W(bN\"}{99dtk", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      classWriter0.visitInnerClass("*RpNSW:[KuC|o>93", "", (String) null, 1990);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIJJIIIIIIIIIIIIIIIIII");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(13, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-18));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      Type type0 = Type.BYTE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", true);
      int int0 = classWriter0.newConst("");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      int int0 = classWriter0.addUninitializedType("_#o[OA.m", 2);
      assertEquals(1, int0);
      
      classWriter0.visitSource("ySy)]oTCkkz#p@VAz7", "_#o[OA.m");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(105, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation(".", false);
      classWriter0.newMethodItem(".", ".", ".", false);
      classWriter0.newMethodItem(".", ".", ".", false);
      // Undeclared exception!
      try { 
        classWriter0.newConst(annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@703f0d89
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777215);
      classWriter0.newField("Bn4c", "Bn4c", "M");
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      int int0 = classWriter0.addUninitializedType("_#o[OA.m", 2);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("", true);
      int int1 = classWriter0.addUninitializedType("_#o[OA.m", 2);
      assertEquals(1, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitSource(")'[9!^qU|g", ")'[9!^qU|g");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(123, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.visitAnnotation("", true);
      classWriter0.visitInnerClass("_#o[OA.m", "", "_#o[OA.m", 248);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(149, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-18));
      classWriter0.visitAnnotation("]", false);
      Byte byte0 = new Byte((byte) (-43));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-11));
      classWriter0.newMethodItem(".", ".", ".", false);
      classWriter0.newMethodItem(".", ".", ".", false);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitInnerClass("", "7h", (String) null, 11);
      Type type0 = Type.BYTE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2557);
      Character character0 = Character.valueOf('}');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("T1:Ph@_", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      classWriter0.newDouble(3319.34319142);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("_#o[OA.m", "_#o[OA.m", "_#o[OA.m");
      classWriter0.newMethod("_#o[OA.m", "_#o[OA.m", "_#o[OA.m", true);
      classWriter0.visitInnerClass("java/lang/Object", "Synthetic", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", 1);
      classWriter0.visitInnerClass((String) null, "RuntimeVisibleAnnotations", "cuc03O'0(JvAD+*#h", 46);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552704);
      int int0 = classWriter0.addType("RuntimeInvisibleAnnotations");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("QT!5{1", 1);
      int int2 = classWriter0.newConst("V{n7AJ=~R+<hp>H");
      assertTrue(int2 == int1);
      assertEquals(2, int2);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.visitOuterClass("", "~yS", (String) null);
      // Undeclared exception!
      try { 
        classWriter0.newConst(annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@210b9095
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-19));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "SourceFile";
      stringArray0[1] = "SourceFile";
      stringArray0[2] = ".s.IFJDCS";
      stringArray0[3] = ".s.IFJDCS";
      stringArray0[4] = ".s.IFJDCS";
      classWriter0.visit(6219, 6219, ".s.IFJDCS", "SourceFile", ".s.IFJDCS", stringArray0);
      int int0 = classWriter0.newConst("SourceFile");
      assertEquals(5, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.newLong(1372L);
      classWriter0.newLong(1372L);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(33, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitSource("Deprecated", "");
      classWriter0.newConst("");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
      
      int int0 = classWriter0.newConst("");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem((String) null, "SourceDebugExtension", "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", false);
      classWriter0.toByteArray();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("9a)M+fV", pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.PipedInputStream@e242e96
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      classWriter0.newFieldItem("0!", "0!", "w");
      classWriter0.visitAnnotation("0!", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(21);
      classWriter0.visitAnnotation("", false);
      classWriter0.visitOuterClass("~yS", "~yS", "~yS");
      Item item0 = classWriter0.newFieldItem("~yS", "~yS", "~yS");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-39));
      Item item0 = classWriter0.newMethodItem("Km", "Km", "Km", true);
      Item item1 = classWriter0.newMethodItem("36[", "Km", "Km", true);
      assertNotSame(item1, item0);
      
      classWriter0.visitAnnotation("SourceFile", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(110, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552618);
      classWriter0.toByteArray();
      classWriter0.visitOuterClass("~yS", "~yS", "~yS");
      Item item0 = classWriter0.newFieldItem("~yS", "~yS", "~yS");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      classWriter0.visitField(2120, " %hhyS2UGz", "SV!3hla=`d-", " %hhyS2UGz", "SV!3hla=`d-");
      Type type0 = Type.VOID_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(5, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(114, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-19));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "SourceFile";
      stringArray0[1] = "SourceFile";
      stringArray0[2] = ".s.IFJDCS";
      stringArray0[3] = ".s.IFJDCS";
      stringArray0[4] = ".s.IFJDCS";
      classWriter0.visit(6219, 6219, ".s.IFJDCS", "SourceFile", ".s.IFJDCS", stringArray0);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newInteger(376);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      int int0 = classWriter0.addUninitializedType("_#o[OA.m", 2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552704);
      int int0 = classWriter0.addType("RuntimeInvisibleAnnotations");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("RuntimeInvisibleAnnotations");
      assertEquals(1, int1);
      
      int int2 = classWriter0.newConst("V{n7AJ=~R+<hp>H");
      assertEquals(2, int2);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-19));
      classWriter0.newFloat((-19));
      classWriter0.newFloat((-19));
      classWriter0.visitAnnotation("5", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552654);
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource("", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(288, byteArray0.length);
      
      Short short0 = new Short((short)1);
      int int0 = classWriter0.newConst(short0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552704);
      int int0 = classWriter0.addType("RuntimeInvisibleAnnotations");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("RuntimeInvisibleAnnotations");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("RuntimeInvisibleAnnotations", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2557);
      Short short0 = new Short((short) (-1));
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("x1F-;9]htVTr}", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552654);
      classWriter0.visitOuterClass("", "", "RuntimeVisiblAnnotations");
      Type type0 = Type.BYTE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552654);
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitSource("# U.", "org.mockito.asm.ClassWriter");
      int int0 = classWriter0.newConst(type0);
      assertEquals(3, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(116, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552704);
      int int0 = classWriter0.addType("RuntimeInvisibleAnnotations");
      assertEquals(1, int0);
      
      classWriter0.visitSource("RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
      int int1 = classWriter0.addType("RuntimeInvisibleAnnotations");
      assertEquals(1, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(131, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      int int0 = classWriter0.addUninitializedType("_#o[OA.m", 2);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(465, 562);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552674);
      classWriter0.newFloat(292552674);
      classWriter0.newFloat(292552674);
      classWriter0.visitSource("RuntimeInvisibleAnnotations", "org.mockito.asm.Type");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(129, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      Byte byte0 = new Byte((byte) (-113));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      Item item0 = classWriter0.newLong(1372L);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@776620ed
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552654);
      classWriter0.visitInnerClass("", "", "", 0);
      Type type0 = Type.LONG_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-11));
      classWriter0.newMethodItem(".", ".", ".", false);
      classWriter0.newMethodItem(".", ".", ".", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(41, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777215);
      classWriter0.newConst("Bn4c");
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552693);
      classWriter0.newFloat(292552693);
      classWriter0.newFloat(292552693);
      classWriter0.visitInnerClass("}", "jvobFT", "+", 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-11));
      classWriter0.newMethodItem(".", ".", ".", false);
      classWriter0.newMethodItem(".", ".", ".", false);
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", ".");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(314, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("_#R[On.", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(103, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      classWriter0.newFieldItem("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "Exceptions");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(543, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552704);
      classWriter0.addType("RuntimeInvisibleAnnotations");
      int int0 = classWriter0.addUninitializedType("QT!5{1", 1);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("RuntimeInvisibleAnnotations", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      classWriter0.newConst("ys|4");
      int int0 = classWriter0.newConst("ys|4");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(34, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(292552704);
      classWriter0.addType("RuntimeInvisibleAnnotations");
      classWriter0.visitSource("RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
      int int0 = classWriter0.addUninitializedType("QT!5{1", 1);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(131, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addUninitializedType("_#o[OA.m", 2);
      int int0 = classWriter0.addUninitializedType("_#o[OA.m", 2);
      assertEquals(1, int0);
      
      int int1 = classWriter0.newConst("_#o[OA.m");
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Type type0 = Type.BYTE_TYPE;
      classWriter0.visitSource((String) null, "#B U.");
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }
}
