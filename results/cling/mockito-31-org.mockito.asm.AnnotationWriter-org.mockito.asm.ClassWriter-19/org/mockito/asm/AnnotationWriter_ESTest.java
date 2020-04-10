/*

 * Tue Mar 03 14:29:14 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.AnnotationWriter;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass("8XbGRnJYnxQ9Zq", (String) null, "1]Q1*T@L3-o;^", 1694);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
      
      int int0 = classWriter0.newField("FWRSjs$", "kw", "");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      classWriter0.newField("SourceFile", "bU!3", "SourceFile");
      classWriter0.newField("SourceFile", "bU!3", "SourceFile");
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
  public void test003()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.visitAnnotation("#\"}uRzC>A", true);
      Short short0 = new Short((short) (-3517));
      int int0 = classWriter0.newConst(short0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newConstItem("#\"}uRzC>A");
      int int0 = classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(8, int0);
      
      int int1 = classWriter0.newField("P#k:ic>SsF#X^?5z", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(10, int1);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      Byte byte0 = new Byte((byte) (-32));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("mp=:#tM~Q#g}", "mp=:#tM~Q#g}");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(106, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      classWriter0.newLong(2);
      classWriter0.newLong(2);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("cfF=-9@ }i&M0qODy", pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.PipedInputStream@9d5c2b5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      classWriter0.addType("cfF=-9@ }i&M0qODy");
      int int0 = classWriter0.addType("cfF=-9@ }i&M0qODy");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      classWriter0.addType("^N=jWU'WX_Jwg7G`");
      classWriter0.addType("i#Aeq3jqK~");
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
  public void test009()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      classWriter0.addUninitializedType("EnclosingM%t.od", 559);
      classWriter0.addUninitializedType("EnclosingM%t.od", 559);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("EnclosingM%t.od", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      classWriter0.visit((-1025), (-842), "P#k:ic>SsF#X^?5z", "M9", "", (String[]) null);
      Character character0 = new Character('^');
      int int0 = classWriter0.newConst(character0);
      assertEquals(6, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1703, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(62);
      int int0 = classWriter0.newMethod("5BH&Y`d", "Drr+2f^`", "5BH&Y`d", false);
      assertEquals(5, int0);
      
      classWriter0.visitSource("Drr+2f^`", "Drr+2f^`");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(118, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newConstItem("-HXs`");
      classWriter0.visitAnnotation("ja~a/lang/Throwable", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      classWriter0.newLong(2);
      classWriter0.newLong(2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 1);
      ByteVector byteVector0 = new ByteVector(19);
      classWriter0.newDouble(0.0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("otb]", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@4253dbc
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      Type type0 = Type.getObjectType("x^ko[LaxDvs@_Pik");
      classWriter0.newConst(type0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(7, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newField("SourceFile", "b!", "P#k:ic>SsF#Xx?5z");
      classWriter0.newField("SourceFile", "b!", "P#k:ic>SsF#Xx?5z");
      classWriter0.visitOuterClass("P#k:ic>SsF#Xx?5z", "SourceFile", "SourceFile");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.visitAnnotation("", false);
      classWriter0.addType("&teNc;V&egh`}[Z;");
      classWriter0.addType("");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      classWriter0.visitInnerClass("cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy", 2290);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(120, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      classWriter0.addUninitializedType("EnclosingM%t.od", 559);
      int int0 = classWriter0.addUninitializedType("EnclosingM%t.od", 559);
      assertEquals(1, int0);
      
      classWriter0.visitInnerClass("EnclosingM%t.od", "g/jK#K,8m3P9", "-", 1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      classWriter0.newConstItem("#\"}uRzC>A");
      classWriter0.newConst("#\"}uRzC>A");
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
  public void test022()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newField("SourceFile", "bU!3", "SourceFile");
      classWriter0.newField("SourceFile", "bU!3", "SourceFile");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("bU!3", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, annotationWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@7430d93a
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitInnerClass((String) null, "Mk}chlOx:R4f)mhh;q$", "", (byte) (-32));
      Type type0 = Type.FLOAT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      int int0 = classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(6, int0);
      
      classWriter0.visit((-842), 84, "P#k:ic>SsF#X^?5z", "V(l0Enj)Lv4vt-s{wL", "SourceFile", (String[]) null);
      classWriter0.visitSource("#\"}uRzC>A", "P#k:ic>SsF#X^?5z");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(189, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newConstItem("#\"}uRzuC>W");
      int int0 = classWriter0.newMethod("b}!3Yd", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", false);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      Type type0 = Type.SHORT_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource((String) null, "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      Boolean boolean0 = new Boolean(true);
      classWriter0.newConst(boolean0);
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
  public void test029()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      int int0 = classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(6, int0);
      
      int int1 = classWriter0.newField("P#k:ic>SsF#X^?5z", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(8, int1);
      
      classWriter0.visit((-842), 84, "P#k:ic>SsF#X^?5z", "V(l0Enj)Lv4vt-s{wL", "SourceFile", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(128, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newDouble(84);
      classWriter0.visitSource("java/lang/Object", "Synthetic");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass("}\"QGyjRT^i&J'n2Jf", "}\"QGyjRT^i&J'n2Jf", (String) null, (-2030));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      classWriter0.newLong((-55L));
      classWriter0.visitSource("+\"Lg8:AB52Y", "org.mockito.asm.MethodWriter");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(126, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      classWriter0.newLong(734);
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
  public void test034()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      classWriter0.toByteArray();
      Character character0 = Character.valueOf('}');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitSource("Sf/dI|C}%", "EnclosingMethod");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(106, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitOuterClass("", "otb]", "otb]");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitOuterClass("RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.visitInnerClass("", "&teNc;V&egh`}[Z;", "", 1776);
      int int0 = classWriter0.addType("&teNc;V&egh`}[Z;");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      Short short0 = new Short((short) (-2940));
      classWriter0.newConstItem(short0);
      classWriter0.newConst(short0);
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
  public void test041()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(62);
      Boolean boolean0 = Boolean.TRUE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("char", "char");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("cfF=-9@ }i&M0qODy", ".l 3#.U<FB0 s$?r:a");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(112, byteArray0.length);
      
      Boolean boolean0 = Boolean.valueOf(false);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      int int0 = classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(6, int0);
      
      classWriter0.visit((-842), 84, "P#k:ic>SsF#X^?5z", "V(l0Enj)Lv4vt-s{wL", "SourceFile", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.visitSource("EnclosingMethod", "EnclosingMethod");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(285212676, (short) (-2057));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.visitAnnotation("#\"}uRzC>A", true);
      classWriter0.newConstItem("#\"}uRzC>A");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newInteger(1);
      classWriter0.toByteArray();
      annotationVisitor0.visit("cfF=-9@ }i&M0qODy", boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newConstItem("}U;j<|>c\"y8C");
      int int0 = classWriter0.newMethod("InnerClasses", "b}!3Yd", "b}!3Yd", true);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      classWriter0.newField("P#k:ic>SsF#X^?5z", "b}!3Yd", "P#k:ic>SsF#X^?5z");
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
  public void test050()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.addUninitializedType("3x^.\"Ap0e^|j", 559);
      int int0 = classWriter0.addUninitializedType("3x^.\"Ap0e^|j", 559);
      assertEquals(1, int0);
      
      classWriter0.visitSource("9#RztR6hBu^]' w(~", "G-7b");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      classWriter0.visitInnerClass("cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy", 2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(118, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
      
      Byte byte0 = new Byte((byte) (-104));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitInnerClass("3x^.\"Ap0e^|j", (String) null, (String) null, 959);
      classWriter0.addUninitializedType("3x^.\"Ap0e^|j", 559);
      int int0 = classWriter0.addUninitializedType("3x^.\"Ap0e^|j", 559);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.addUninitializedType("3x^.\"Ap0e^j", 559);
      classWriter0.addUninitializedType("3x^.\"Ap0e^j", 559);
      classWriter0.visitInnerClass("E6-?tF_Jh ", "DD\"!cogYG>]#&k", "P4I1lR4^cZB1[/\"Aq", 2);
      classWriter0.visitInnerClass("DD\"!cogYG>]#&k", "DD\"!cogYG>]#&k", (String) null, 1056);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
      
      int int0 = classWriter0.newMethod("}\"QGyjRT^i&J'n2Jf", ">;0-", "}\"QGyjRT^i&J'n2Jf", false);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(98);
      Type type0 = Type.SHORT_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass("org.mockito.asm.ClassWriter", (String) null, (String) null, 5);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(98);
      Type type0 = Type.SHORT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitInnerClass("UQi", "", "1]Q1*T@L3-o;^", 3);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      classWriter0.toByteArray();
      Character character0 = new Character('[');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      ByteVector byteVector0 = new ByteVector();
      classWriter0.visit((-842), 84, "P#k:ic>SsF#X^?5z", "V(l0Enj)Lv4vt-s{wL", "SourceFile", (String[]) null);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@5917e54d
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitInnerClass("cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy", 2290);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      classWriter0.newField("P#k:ic>SsF#X^?5z", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      classWriter0.visitInnerClass("f?8_%)3LZ L]f-70H", "b}!3Yd", "#\"}uRzC>A", 50);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 1);
      classWriter0.addType("&teNc;V&egh`}[Z;");
      classWriter0.addType("");
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, annotationWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@38bc8f66
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      int int0 = classWriter0.newField("P#k:ic>SsF#X^?5z", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(8, int0);
      
      classWriter0.visitSource("#\"}uRzC>A", "P#k:ic>SsF#X^?5z");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(153, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      Type type0 = Type.INT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visit(132, 18, "Q)7t*m{?DN0_:h", "0X8A.8.JE^I\"8Q.08M", "`c", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.addUninitializedType("3x^.\"Ap0e^j", 559);
      classWriter0.addUninitializedType("3x^.\"Ap0e^j", 559);
      classWriter0.visitOuterClass("0xC$p", (String) null, "rS");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      int int0 = classWriter0.newField("", "EnclosingM%t.od", "void");
      assertEquals(6, int0);
      
      classWriter0.visit((-1025), (-842), "P#k:ic>SsF#X^?5z", "M9", "", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(132, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      Item item0 = classWriter0.newFloat(0.0F);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 1);
      classWriter0.visitOuterClass("RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", (String) null);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("sB90_aY%xH60iw2l", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@30ad4724
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      ByteVector byteVector0 = new ByteVector();
      classWriter0.visit((-1025), (-842), "P#k:ic>SsF#X^?5z", "M9", "", (String[]) null);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-842));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("-", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@6b219bbd
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      Boolean boolean0 = new Boolean(false);
      classWriter0.newConst(boolean0);
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
  public void test072()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      Item item0 = classWriter0.newLong(2);
      Item item1 = classWriter0.newLong(2);
      assertSame(item1, item0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(33, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      int int0 = classWriter0.newConst("#\"}uRzC>A");
      assertEquals(2, int0);
      
      classWriter0.newConstItem("#\"}uRzC>A");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(39, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newConstItem("}U;j<|>c\"y8C");
      classWriter0.newField("b}!3Yd", "b}!3Yd", "b}!3Yd");
      int int0 = classWriter0.newField("b}!3Yd", "b}!3Yd", "b}!3Yd");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("cfF=-9@ }i&M0qODy", "SourceFile", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.visitSource("#\"}uRzC>A", "P#k:ic>SsF#X^?5z");
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
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
  public void test077()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy", "cfF=-9@ }i&M0qODy");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#Xx?5z");
      classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#Xx?5z");
      classWriter0.visitInnerClass("", "RuntimeVisibleParameterAnnotations", "", 8);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.visitAnnotation("org.mockito.asm.ClassWriter", true);
      int int0 = classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(7, int0);
      
      int int1 = classWriter0.newField("P#k:ic>SsF#X^?5z", "b}!3Yd", "P#k:ic>SsF#X^?5z");
      assertEquals(9, int1);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2229));
      classWriter0.visit(6, (-814), "8q{u>rhlN-S-qN", "oLW>7&x$3M)", "MEMdrip>F2^v6}2A$", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(139, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.addUninitializedType("3x^.\"Ap0e^|j", 559);
      classWriter0.addUninitializedType("3x^.\"Ap0e^|j", 559);
      classWriter0.visitOuterClass("*mi4,p:*6<`/3", "LineNumberTable", "ja~a/lang/Throwable");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.addUninitializedType("3x^.\"Ap0e^|j", 559);
      classWriter0.addUninitializedType("3x^.\"Ap0e^|j", 559);
      classWriter0.visitOuterClass("Q'}d", "3fQ\")!N>TfdEJ[`0vpx", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", false);
      classWriter0.addType("cfF=-9@ }i&M0qODy");
      classWriter0.addType("cfF=-9@ }i&M0qODy");
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("cfF=-9@ }i&M0qODy", pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.PipedInputStream@5aea953a
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      Type type0 = Type.INT_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource("3T7L)iD\n4LoPnGlJ", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      classWriter0.addType("cfF=-9@ }i&M0qODy");
      int int0 = classWriter0.addType("cfF=-9@ }i&M0qODy");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2032));
      classWriter0.visitOuterClass("D15[=<N`;;mFZ1l", "D15[=<N`;;mFZ1l", "");
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass("", "", "DKf')^}2d NAml", 2);
      classWriter0.visitInnerClass("D4", "Signature", "RuntimeVisibleAnnotations", (byte) (-112));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      Type type0 = Type.INT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitSource("+\"Lg8:AB52Y", "org.mockito.asm.MethodWriter");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("cfF=-9@ }i&M0qODy", ".l 3#.U<FB0 s$?r:a");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(112, byteArray0.length);
      
      int int0 = classWriter0.addType(" ,(c~?l6m/Uq+v)phHb");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      classWriter0.addUninitializedType("EnclosingM%t.od", 559);
      int int0 = classWriter0.addUninitializedType("EnclosingM%t.od", 559);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("EnclosingM%t.od", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
      
      int int0 = classWriter0.newMethod("StackMapTable", "", "-", true);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      classWriter0.toByteArray();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("cfF=-9@ }i&M0qODy", dataInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.DataInputStream@5db1cb79
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.invalidFrames = true;
      classWriter0.newMethodItem("b}!3Yd", "b}!3Yd", "N!LGvw8eZVg", true);
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
  public void test095()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass((String) null, "sB90_aY%xH60iw2l", "@z@=ev[u%", 84);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass("", "&teNc;V&egh`}[Z;", "", 1776);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@80a4a23
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      Type type0 = Type.INT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("+\"Lg8:AB52Y", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newField("SourceFile", "bU!3", "SourceFile");
      int int0 = classWriter0.newField("SourceFile", "bU!3", "SourceFile");
      assertEquals(5, int0);
      
      classWriter0.visit((-842), 84, "#\"}uRzC>A", "V(l0Enj)Lv4vt-s{wL", "SourceFile", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#Xx?5z");
      int int0 = classWriter0.newField("SourceFile", "b}!3Yd", "P#k:ic>SsF#Xx?5z");
      assertEquals(6, int0);
      
      classWriter0.visitSource("b}!3Yd", "Label offset position has not been resolved yet");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(163, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("cfF=-9@ }i&M0qODy", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
      
      classWriter0.addUninitializedType("StackMapTable", 29);
      int int0 = classWriter0.addUninitializedType("RuntimeInvisibleAnnotations", 1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitOuterClass("#\"}uRzC>A", (String) null, (String) null);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 223);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("#\"}uRzC>A", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      Item item0 = classWriter0.newConstItem("#\"}uRzC>A");
      assertNotNull(item0);
      
      int int0 = classWriter0.newConst("#\"}uRzC>A");
      assertEquals(2, int0);
      
      classWriter0.visitSource("java/lang/Object", "Synthetic");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      classWriter0.addUninitializedType("3q", 1);
      int int0 = classWriter0.addUninitializedType("3q", 68);
      assertEquals(2, int0);
      
      classWriter0.visitSource(".jp-`+RTpkRP)l}", "org.mockito.asm.ClassWriter");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(120, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2033));
      classWriter0.addUninitializedType("EnclosingM%t.od", 559);
      classWriter0.addUninitializedType("EnclosingM%t.od", 559);
      ByteVector byteVector0 = new ByteVector();
      // Undeclared exception!
      try { 
        classWriter0.newConst(byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@1829dc56
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(84);
      classWriter0.visitInnerClass("", "", "DKf')^}2d NAml", 2);
      classWriter0.visitInnerClass("D4", "Signature", "RuntimeVisibleAnnotations", (byte) (-112));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-5128));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Kdzp)Ka6`", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@9695d11
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
