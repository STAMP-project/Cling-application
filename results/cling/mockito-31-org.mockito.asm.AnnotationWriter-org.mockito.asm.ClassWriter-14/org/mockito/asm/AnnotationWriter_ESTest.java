/*

 * Tue Mar 03 14:28:20 GMT 2020
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
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.FieldWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      Short short0 = new Short((short)50);
      int int0 = classWriter0.newConst(short0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      int int0 = classWriter0.newConst("");
      assertEquals(2, int0);
      
      classWriter0.visitField((-1615), "", "", "", "");
      classWriter0.visitAnnotation("VBv$&OPJ9w2,5@*)", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(182, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2103));
      Byte byte0 = new Byte((byte) (-119));
      classWriter0.visitField((-2103), "", "r$~RB76&!v", "", byte0);
      classWriter0.visitSource("jhk_Rl*/|3K.i", ".V[*A.rJhOml6[\"V|");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(217, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.newLong(0L);
      int int0 = classWriter0.newConst("");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      classWriter0.visit((-965), (-189), "4M4F*ly-VTL&z|", "w0=Hn&[Y9T!9Db", "w0=Hn&[Y9T!9Db", (String[]) null);
      classWriter0.newFloat((-965));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(108, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visit((-965), (-965), "w0H&Y9T!9Db", "w0H&Y9T!9Db", "w0H&Y9T!9Db", (String[]) null);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-1361));
      Short short0 = new Short((short)7);
      classWriter0.toByteArray();
      annotationWriter0.visit((String) null, short0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(192, 2025);
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
      ClassWriter classWriter0 = new ClassWriter(233);
      classWriter0.visitSource("Hs$9~6T", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
      
      int int0 = classWriter0.newMethod("Hs$9~6T", "void", "Signature", true);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      int int0 = classWriter0.newMethod("", "long", "long", false);
      assertEquals(5, int0);
      
      classWriter0.visitSource("", "long");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      classWriter0.visitSource((String) null, "");
      classWriter0.newFieldItem("", "", "");
      int int0 = classWriter0.newMethod("Kd2=Z", "", "", true);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.newDouble((-1598));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-87));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("m~'", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@682155bd
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.newLong(0L);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.visitSource("~", "~");
      Character character0 = Character.valueOf('q');
      int int0 = classWriter0.newConst(character0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.newConst("");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1615), 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("", "", "");
      classWriter0.visitOuterClass("=5EX^`T*#k4{*u<|Yj'", "", "B5'g~U#Kzal<\"FB");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.visitOuterClass(":hzbgqr", "", (String) null);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(233);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 233);
      Boolean boolean0 = Boolean.valueOf((String) null);
      annotationWriter0.visit("nW_!]", boolean0);
      annotationWriter0.visit("nW_!]", boolean0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("nW_!]", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.visitAnnotation(")[HKv", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
      
      classWriter0.addType(" >0");
      int int0 = classWriter0.addUninitializedType("", (-1422));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newClassItem("");
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.visitAnnotation(")[HKv", false);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf(true);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2465), ".Y", "#", "Label offset position has not been resolved yet", boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("m~'", "", "");
      classWriter0.visitSource("k+FB`;*Tze{.&Z<o{Tx", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2896);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("", "", "");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-87));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("m~'", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@54d42d5e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2438);
      Type type0 = Type.SHORT_TYPE;
      classWriter0.visitField(1, "34,ws8d`0D(GN.,", "34,ws8d`0D(GN.,", "34,ws8d`0D(GN.,", type0);
      classWriter0.visitInnerClass("JZ4\"t9D?6^s8H=)C", "JZ4\"t9D?6^s8H=)C", "JZ4\"t9D?6^s8H=)C", 1);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      int int0 = classWriter0.newConst("");
      assertEquals(2, int0);
      
      classWriter0.visitField(1, "", "", "", "");
      classWriter0.visitAnnotation("s", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(126, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      classWriter0.visit((-965), (-965), "w0H&Y9T!9Db", "w0H&Y9T!9Db", "w0H&Y9T!9Db", (String[]) null);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(2895);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.newFloat(455.029F);
      classWriter0.newFloat(455.029F);
      classWriter0.visitOuterClass("AdTK.LMg:~", (String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.visitSource("qO#.E2BSa<p", "Hs$9~6T");
      classWriter0.toByteArray();
      classWriter0.newFieldItem("", "", "qO#.E2BSa<p");
      classWriter0.visitInnerClass("", "Tw&vlFyuu+[/", "Hs$9~6T", 73);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      Character character0 = Character.valueOf('+');
      classWriter0.visitField(8, "Ljava/lang/Synthetic;", "", "SourceDebugExtension", character0);
      int int0 = classWriter0.newMethod("_26lu~(Y<Y!--3<,6qN", "=5EX^`T*#k4{*u<|Yj'", "SourceDebugExtension", false);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.visitSource("qO#.E2BSa<p", "Hs$9~6T");
      classWriter0.newDouble((-1598));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(105, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.newDouble((-1598));
      classWriter0.visitAnnotation("ItPWZnYzJ]t{Bm`(:", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.visitSource("XGBVoLW-Fu-,@MhexB<", "XGBVoLW-Fu-,@MhexB<");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong((-1301));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.invalidFrames = true;
      classWriter0.newLong(1);
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
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.visitAnnotation(")[)Kv", false);
      classWriter0.toByteArray();
      Character character0 = new Character('D');
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "v5*E", "v5*E", "Signature", character0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(141L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.newFloat((-523));
      classWriter0.newFloat((-523));
      classWriter0.visitOuterClass(")x&AQGe, Bu", "w0=Hn&[Y9T!9Db", "w0=Hn&[Y9T!9Db");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.newFloat(455.029F);
      classWriter0.newFloat(455.029F);
      classWriter0.visitOuterClass("GcPz4~V'5j2ggiN?l", "<c3^", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf("");
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1, "|]v!Ejd2\"bt``~^A?", "=5EX^`T*#k4{*u<|Yj'", "0'", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.visitInnerClass("", "", "", (-1598));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(61, byteArray0.length);
      
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.TRUE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1, "|]v!Ejd2\"bt``~^A?", "=5EX^`T*#k4{*u<|Yj'", "0'", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.invalidFrames = true;
      Boolean boolean0 = Boolean.TRUE;
      annotationWriter0.visit("|]v!Ejd2\"bt``~^A?", boolean0);
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
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.visitSource("qO#.E2BSa<p", "Hs$9~6T");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
      
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitSource("value ", "value ");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      Item item0 = classWriter0.newFloat(2);
      Item item1 = classWriter0.newFloat(2);
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("ItPWZnYzJ]t{Bm`(:", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      Type type0 = Type.INT_TYPE;
      classWriter0.visitField(2, "value ", "value ", "", type0);
      classWriter0.visitSource((String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      Type type0 = Type.INT_TYPE;
      classWriter0.visitField(1394, "value ", "value ", "", type0);
      classWriter0.visitSource("value ", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.visitAnnotation(")[)Kv", true);
      classWriter0.toByteArray();
      Type type0 = Type.INT_TYPE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-758), ")[)Kv", "j([U^", "", type0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.TRUE;
      annotationVisitor0.visit("|]v!Ejd2\"bt``~^A?", boolean0);
      annotationWriter0.visit("SourceDebugExtension", boolean0);
      assertFalse(annotationWriter0.equals((Object)annotationVisitor0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("m~'", "", "");
      classWriter0.visitField(2, "A4R!qAeR=T p", "", "./C^6cTB]_", "._|W8I%");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(148, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.newMethod("", "", "java/lang/Object", true);
      Character character0 = Character.valueOf('+');
      FieldVisitor fieldVisitor0 = classWriter0.visitField(8, "Ljava/lang/Synthetic;", "", "SourceDebugExtension", character0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(233);
      classWriter0.invalidFrames = true;
      classWriter0.visitOuterClass("Exeptions", "RuntimeInvisibleParameterAnnotations", "v:Hr;!Y?G0 lt~)");
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
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(46, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      classWriter0.visitInnerClass("", "", "m~'", 2895);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(107, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2433);
      Byte byte0 = new Byte((byte)57);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("U|qD\"2N+v^/5!G[p", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.visitAnnotation("java/lang/String", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(85, byteArray0.length);
      
      int int0 = classWriter0.newMethod("", ")V", "", false);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      Item item0 = classWriter0.newFloat(2);
      Item item1 = classWriter0.newFloat(2);
      assertSame(item1, item0);
      
      classWriter0.visitInnerClass("Hs$9~6T", "", "value ", (-1598));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      Type type0 = Type.INT_TYPE;
      classWriter0.visitField(2, "value ", "value ", "", type0);
      classWriter0.visitInnerClass((String) null, "JZ4\"t9D?6^s8H=)C", "", 41);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(148, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Character character0 = Character.valueOf('+');
      FieldVisitor fieldVisitor0 = classWriter0.visitField(8, "Ljava/lang/Synthetic;", "", "SourceDebugExtension", character0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      classWriter0.visitSource((String) null, "");
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.newFieldItem("", "", "");
      classWriter0.visitInnerClass("", (String) null, "boolean", (-128));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem(")", "", "");
      classWriter0.visitInnerClass("mHA#/$<WPCz}UCqV{5", "mHA#/$<WPCz}UCqV{5", (String) null, 327);
      classWriter0.visitInnerClass(")", "t@H| g\"Po(P!IWD'K#l", "mHA#/$<WPCz}UCqV{5", 66);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("m~'", "", "");
      classWriter0.visitOuterClass("@7w<d*@", "@7w<d*@", "m~'");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("_26lu~(Y<Y!--3<,6qN", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@8d4467b
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.addType("java/lang/String");
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.addUninitializedType("50N)T`f/=`eR@4s3HA", (-1422));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("tJ1{(A{V%Vy", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@42f1ba8b
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.visitSource("qO#.E2BSa<p", "Hs$9~6T");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
      
      Item item0 = classWriter0.newFieldItem("qO#.E2BSa<p", "", "qO#.E2BSa<p");
      Item item1 = classWriter0.newFieldItem("", "", "qO#.E2BSa<p");
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitOuterClass("=5EX^`T*#k4{*u<|Yj'", "", (String) null);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("_26lu~(Y<Y!--3<,6qN", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@b5fdba3
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(233);
      classWriter0.visitSource("Hs$9~6T", "");
      classWriter0.toByteArray();
      classWriter0.visitField(233, "void", "Synthetic", "L", "L");
      Item item0 = classWriter0.newConstItem("L");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertSame(item1, item0);
      
      int int0 = classWriter0.newConst("");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      int int0 = classWriter0.newMethod("_26lu~(Y<Y!--3<,6qN", "=5EX^`T*#k4{*u<|Yj'", "SourceDebugExtension", false);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertSame(item1, item0);
      
      classWriter0.visitInnerClass("", (String) null, "boolean", (-128));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("", "", "");
      classWriter0.visitInnerClass("", "", (String) null, 327);
      classWriter0.visitInnerClass("", "t@H| g\"Po(P!IWD'K#l", "mHA#/$<WPCz}UCqV{5", 66);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("m~'", "", "");
      assertNotSame(item1, item0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      classWriter0.newFieldItem("", "", "");
      classWriter0.newFieldItem("m~'", "", "");
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(233);
      classWriter0.invalidFrames = true;
      classWriter0.newFloat(233);
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
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.addType("java/lang/String");
      classWriter0.addType("java/lang/String");
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2415);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("java/lang/String", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@6754f135
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2438);
      classWriter0.newFloat(1);
      classWriter0.newFloat(1.0F);
      classWriter0.visitAnnotation("34,ws8d`0D(GN.,", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2438);
      Short short0 = new Short((short)81);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("34,ws8d`0D(GN.,", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2433);
      classWriter0.visitOuterClass("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "B5'g~U#Kzal<\"FB", "|?Dl;oO_':ZH");
      Type type0 = Type.FLOAT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.TRUE;
      annotationWriter0.visit("|]v!Ejd2\"bt``~^A?", boolean0);
      annotationWriter0.visit("SourceDebugExtension", boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.visitSource("qO#.E2BSa<p", "Hs$9~6T");
      classWriter0.toByteArray();
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-87));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("m~'", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7ce31aed
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(795);
      classWriter0.visitSource("[.b_|N-(S%R+c|V|RA", "[.b_|N-(S%R+c|V|RA");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
      
      int int0 = classWriter0.addType("[.b_|N-(S%R+c|V|RA");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((short)50, 64);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      int int0 = classWriter0.newMethod("", "", "java/lang/Object", true);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.newFloat(2);
      classWriter0.visitSource("qO#.E2BSa<p", "Hs$9~6T");
      classWriter0.newFloat(2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2885);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitInnerClass("", (String) null, "boolean", (-128));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2434);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@353f22df
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1970), "ConstantValue", "", "", "");
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
  public void test89()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitInnerClass((String) null, "", ",Qd,B", 16);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-87));
      classWriter0.visitAnnotation("ItPWZnYzJ]t{Bm`(:", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("ItPWZnYzJ]t{Bm`(:", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@71e34a55
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      Type type0 = Type.INT_TYPE;
      classWriter0.visitField(2, "value ", "value ", "", type0);
      classWriter0.visitAnnotation("ykG3WIT[", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(149, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      classWriter0.newConstItem(type0);
      classWriter0.visitSource("value ", "value ");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertSame(item1, item0);
      
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2895);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visit((-965), (-965), "w0H&Y9T!9Db", "w0H&Y9T!9Db", "w0H&Y9T!9Db", (String[]) null);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-965));
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("w0H&Y9T!9Db", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@624e9788
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.addType("java/lang/String");
      classWriter0.addUninitializedType("50N)T`f/=`eR@4s3HA", (-1422));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1598));
      byte[] byteArray0 = classWriter0.toByteArray();
      ByteVector byteVector0 = new ByteVector();
      classWriter0.visitOuterClass("=5EX^`T*#k4{*u<|Yj'", (String) null, "@[mWg4;aBR.nO:w");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("RuntimeVisibleParameterAnnotations", classReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassReader@10291a1
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      ByteVector byteVector0 = new ByteVector();
      classWriter0.visitInnerClass("", "", (String) null, (-2627));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("N", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@6a7afc0b
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-523));
      classWriter0.visitSource("XGBVoLW-Fu-,@MhexB<", "XGBVoLW-Fu-,@MhexB<");
      classWriter0.addUninitializedType("", (-1261));
      int int0 = classWriter0.addUninitializedType("", 66);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(115, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      classWriter0.visitInnerClass((String) null, "", ")[)Kv", 1);
      classWriter0.visitInnerClass("", ")[)Kv", "", 1245);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, annotationWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@23d66356
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
