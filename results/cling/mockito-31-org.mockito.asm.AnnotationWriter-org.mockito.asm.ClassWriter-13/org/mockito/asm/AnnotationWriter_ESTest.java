/*

 * Tue Mar 03 14:27:04 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      ClassWriter classWriter0 = new ClassWriter(2);
      Byte byte0 = new Byte((byte)24);
      classWriter0.newConstItem(byte0);
      classWriter0.visitSource("s", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Item item0 = classWriter0.newLong(2);
      Item item1 = classWriter0.newLong(2);
      assertNotNull(item1);
      assertSame(item1, item0);
      
      Boolean boolean0 = new Boolean("org.mockito.asm.MethodWriter");
      Item item2 = classWriter0.newConstItem(boolean0);
      assertNotSame(item2, item0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      Item item1 = classWriter0.newLong(0L);
      assertFalse(item1.equals((Object)item0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.addType("SourceFile");
      int int0 = classWriter0.addType("SourceFile");
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("%Gw'2rb3ZC1", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("org.mockito.asm.MethodWriter", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1896, (-290));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("java/lang/Object", true);
      classWriter0.toByteArray();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("bmU#YQZNHCY:&b$_W", pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.PipedInputStream@20f3ba5d
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      int int0 = classWriter0.newMethod("IubZ", "", "", true);
      assertEquals(5, int0);
      
      classWriter0.visitSource("Synthetic", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(109, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2896);
      int int0 = classWriter0.newMethod("s", "s", "s", false);
      assertEquals(4, int0);
      
      classWriter0.visitSource("s", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(311, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1457, "SourceFile", "SourceFile", "SourceFile", "SourceFile");
      classWriter0.visitAnnotation("SourceFile", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(134, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2168);
      classWriter0.newDouble(199.40169477);
      ByteVector byteVector0 = new ByteVector(18);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 18);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7c1cd46e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newLong(2);
      classWriter0.newLong(2);
      classWriter0.visitAnnotation("org.mockito.asm.MethodWriter", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(106, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", false);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf("SourceFile");
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newConstItem(boolean0);
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
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newFieldItem("SourceFile", "SourceFile", "SourceFile");
      classWriter0.newFieldItem("SourceFile", "SourceFile", "SourceFile");
      classWriter0.visitOuterClass("Signature", "Signature", "SourceFile");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Item item0 = classWriter0.newFieldItem("SourceFil7e", "SourceFil7e", "SourceFil7e");
      Item item1 = classWriter0.newFieldItem("SourceFil7e", "SourceFil7e", "SourceFil7e");
      assertSame(item1, item0);
      
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "org.mockito.asm.Edge", "SourceFil7e", "Bb~", "SourceFil7e");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(135, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("{`tiw0W{fznk=p4", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(448.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.addType("SourceFile");
      classWriter0.visitAnnotation("SourceFile", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
      
      int int0 = classWriter0.addType("%{{n,}G$+.M;");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3616));
      classWriter0.visitInnerClass("SourceFile", "SourceFile", "SourceFile", (-3616));
      classWriter0.visitAnnotation("A", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("SourceFile", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newFieldItem("SourceFil7e", "SourceFil7e", "SourceFil7e");
      classWriter0.newFieldItem("SourceFil7e", "SourceFil7e", "SourceFil7e");
      classWriter0.visitAnnotation("org.mockito.asm.Edge", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(114, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
      
      Item item1 = classWriter0.newFloat(448.0F);
      assertNotSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
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
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Character character0 = new Character('~');
      classWriter0.newConstItem(character0);
      classWriter0.visitSource("SourceFil", "SourceFil");
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      classWriter0.toByteArray();
      annotationWriter0.visit((String) null, character0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("SourceFile", "SourceFile");
      classWriter0.visitInnerClass("RC:7j~b'~u:Xow1DV}", "RC:7j~b'~u:Xow1DV}", "", (-1456));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(142, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      Type type0 = Type.getObjectType("\"PjYY");
      classWriter0.newConstItem(type0);
      classWriter0.visitAnnotation("Deprecated", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2896);
      classWriter0.newMethod("s", "s", "s", false);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 2896);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("s", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      classWriter0.visitSource("", "");
      classWriter0.newDouble(74);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(973.8655);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newLong(2);
      classWriter0.newLong(2);
      classWriter0.visitSource("RuntimeInvisibleAnnotations", "{7ECdz&&:X04/4jK@,");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(132, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newLong(2);
      classWriter0.newLong(2);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2896);
      int int0 = classWriter0.newMethod("s", "s", "s", false);
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("|Tb91KZZO^,7g;Id", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(103, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.addType("SourceFile");
      assertEquals(1, int0);
      
      classWriter0.visitInnerClass("RC:7j~b'~u:Xow1DV}", "RC:7j~b'~u:Xow1DV}", "", (-1456));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(107);
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation(")", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(107);
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitSource("InnerClasses", "T2v32[");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("org.mockito.asm.MethodWriter", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(83);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2896);
      classWriter0.visitSource("s", "{7ECdz&&:X04/4jK@,");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-3583), 150);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      Short short0 = new Short((short)1753);
      Item item0 = classWriter0.newConstItem(short0);
      Item item1 = classWriter0.newConstItem(short0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("SourceFile", false);
      classWriter0.newMethod("r:ul2+:r$sc2Z/", "r:ul2+:r$sc2Z/", "r:ul2+:r$sc2Z/", true);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("SourceFile", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@332c67eb
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(929);
      Type type0 = Type.getObjectType("\"PjYY");
      classWriter0.newConstItem(type0);
      classWriter0.visitSource("", "jC37c");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", true);
      classWriter0.toByteArray();
      classWriter0.visitInnerClass("SourceFile", "SourceFile", "", 3095);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Byte byte0 = new Byte((byte)11);
      classWriter0.newConstItem(byte0);
      classWriter0.visitAnnotation("SourceFile", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
      
      int int0 = classWriter0.newMethod("r:ul2+:r$sc2Z/", "r:ul2+:r$sc2Z/", "r:ul2+:r$sc2Z/", true);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Character character0 = Character.valueOf('\u008E');
      classWriter0.newConstItem(character0);
      classWriter0.visitAnnotation("SourceFile", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newDouble((-4816.633865372471));
      classWriter0.visitAnnotation("org.mockito.asm.MethodWriter", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitInnerClass("RC:7j~b'~u:Xow1DV}", "RC:7j~b'~u:Xow1DV}", "", (-1456));
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("SourceFile", "boolean", "EnclosingMethod");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Type type0 = Type.BOOLEAN_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitAnnotation("java/lang/Object", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.addType("SourceFile");
      Character character0 = Character.valueOf('+');
      classWriter0.addType("%{{n,}G$+.M;");
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3616));
      classWriter0.visitOuterClass("Sofrce=ig", "_|K7Qloj`3*Q2f:b", "org.mockito.asm.Frame");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("_|K7Qloj`3*Q2f:b", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newConst("SourceFile");
      assertEquals(2, int0);
      
      classWriter0.newConstItem("SourceFile");
      classWriter0.visitSource("SourceFile", "@Q=5L6//Tm$r5,1^$");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newMethodItem("SourceFile", "SourceFile", "l", true);
      classWriter0.visitAnnotation("OOEL\"", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ByteVector byteVector0 = new ByteVector();
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      classWriter0.visitSource("{`tiw0W{fznk=p4", "");
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-1227));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("{`tiw0W{fznk=p4", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@128fdc89
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("SourceFile", "SourceFile", "8>Y");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newFieldItem("SourceFile", "SourceFile", "SourceFile");
      classWriter0.newFieldItem("SourceFile", "SourceFile", "SourceFile");
      classWriter0.visitInnerClass("StackMapTable", "", "", 1);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Type type0 = Type.BOOLEAN_TYPE;
      classWriter0.visitField(4073, "SourceFile", "boolean", "XIHI8;MH", type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(107);
      int int0 = classWriter0.addType(")");
      Boolean boolean0 = Boolean.FALSE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
      
      int int1 = classWriter0.addType(")");
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(3095);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", false);
      classWriter0.toByteArray();
      Short short0 = new Short((short) (-1));
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(107);
      int int0 = classWriter0.addType(")");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType(")");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation(")", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("SourceFile", false);
      classWriter0.toByteArray();
      Character character0 = Character.valueOf('+');
      annotationVisitor0.visit("Signature", character0);
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newFieldItem("SourceFile", "SourceFile", "SourceFile");
      classWriter0.newFieldItem("SourceFile", "SourceFile", "SourceFile");
      classWriter0.visitSource("T`\"S*'1_(I+e(YTb", "T`\"S*'1_(I+e(YTb");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("SourceFile", "SourceFile");
      classWriter0.toByteArray();
      Type type0 = Type.BOOLEAN_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(4073, "SourceFile", "boolean", "XIHI8;MH", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(107);
      classWriter0.addType(")");
      int int0 = classWriter0.addType(")");
      assertEquals(1, int0);
      
      classWriter0.visitSource("InnerClasses", "T2v32[");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.addUninitializedType("SourceFile", 1);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("rVB:<SEZ{ayAA}DMAd", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("SourceFile", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(101, 224);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newMethod("SourceFile", "SourceFile", "SourceFile", false);
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("SourceFile", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Byte byte0 = new Byte((byte)11);
      classWriter0.newConstItem(byte0);
      classWriter0.visitAnnotation("Uh:g:9RP", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newConstItem("SourceFile");
      classWriter0.visitAnnotation("java/lang/Object", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitInnerClass("RC:7j~b'~u:Xow1DV}", "RC:7j~b'~u:Xow1DV}", "", (-1456));
      classWriter0.toByteArray();
      Type type0 = Type.BOOLEAN_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(4073, "SourceFile", "boolean", "XIHI8;MH", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4071));
      classWriter0.visitAnnotation("Zi", false);
      classWriter0.toByteArray();
      Type type0 = Type.BYTE_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("SourceFile", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("SourceFile", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@501297a8
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource("SourceFile", "SourceFile");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("SourceFile", "boolean", "EnclosingMethod");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.addType("SourceFile");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("SourceFile", 1);
      assertEquals(2, int1);
      
      classWriter0.visitAnnotation("SourceFile", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("SourceFile", true);
      classWriter0.visitOuterClass("J.<BR},o2T@*gP", "P^s;b", (String) null);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2892);
      classWriter0.visitOuterClass("Signature", (String) null, "SourceDebugExtension");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newConst("SourceFile");
      assertEquals(2, int0);
      
      classWriter0.newConstItem("SourceFile");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(40, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitInnerClass((String) null, "", "", 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@16e3057e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitInnerClass(".s.IFJDCS", "", (String) null, 2);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 4193);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("WoK+b*T6]UPp'NZQ", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.addType("SourceFile");
      classWriter0.visitSource("SourceFile", "SourceFile");
      int int0 = classWriter0.addUninitializedType("xE4=", 1);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 'k');
      classWriter0.addUninitializedType("&)", 1);
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
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2896);
      classWriter0.visitSource((String) null, (String) null);
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, (ByteVector) null, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("G+*7e", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2168);
      classWriter0.visitInnerClass("", "Deprecated", "", 47);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 2);
      classWriter0.visitInnerClass(".s.IFJDCS", (String) null, "", 2168);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Deprecated", pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.PushbackInputStream@3ca5b462
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
