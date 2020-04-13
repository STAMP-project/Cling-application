/*

 * Tue Mar 03 14:27:01 GMT 2020
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
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.invalidFrames = true;
      classWriter0.newFieldItem("org.moc0ito.asm.MethodWriter", "org.moc0ito.asm.MethodWriter", "org.moc0ito.asm.MethodWriter");
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
  public void test001()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-884));
      classWriter0.visitAnnotation("l", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
      
      Short short0 = new Short((short)1007);
      int int0 = classWriter0.newConst(short0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newFieldItem("", "", "");
      classWriter0.newMethodItem("", "", "", false);
      int int0 = classWriter0.newConst("");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.visitSource("RuntimeInvisibleParameterAnnotations", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
      
      Byte byte0 = new Byte((byte)86);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1805));
      classWriter0.newLong(784L);
      classWriter0.newLong(784L);
      Type type0 = Type.BYTE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitSource("4R*bPZP[rfWk", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(105, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Type type0 = Type.getObjectType("2QE!`eW");
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("EnclosingMethod", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      int int0 = classWriter0.addType("2QE!`eW");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("2QE!`eW");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("nEF\"5UG4*_~i=PoDv`x", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65529);
      classWriter0.visitAnnotation("+LD&U'a^N$3!", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(65529, 554);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      classWriter0.visitSource("2QE!`eW", "2QE!`eW");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("EnclosingMethod", "", "EnclosingMethod", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newConstItem("org.moc0ito.asm.MethodWriter");
      classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(122, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newDouble(292.0);
      classWriter0.newDouble(292.0);
      int int0 = classWriter0.newConst("$dD:pgMr=567K8");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newLong(598L);
      classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(97, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65529);
      classWriter0.visitAnnotation("+Lz&U'a^N$3!", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
      
      Boolean boolean0 = Boolean.TRUE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Character character0 = Character.valueOf('?');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("", "RuntimeInvisibleParameterAnnotations");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(118, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitInnerClass("void", "", (String) null, 1);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65529);
      classWriter0.newConst("java/lang/Class");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(65529, 554);
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
      ClassWriter classWriter0 = new ClassWriter((-882));
      classWriter0.addType("");
      classWriter0.addType("");
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
  public void test018()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.visitInnerClass("", "", "", (-875));
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2525);
      Item item0 = classWriter0.newMethodItem("DL)FbY(zF6qL_D", ".cl7ss", ".cl7ss", true);
      item0.set(1);
      int int0 = classWriter0.newMethod("DL)FbY(zF6qL_D", ".cl7ss", ".cl7ss", true);
      assertEquals(6, int0);
      
      classWriter0.visitAnnotation(".cl7ss", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      Boolean boolean0 = new Boolean("5Hk]l/W~r''");
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("EnclosingMethod", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitInnerClass("ZM!U@\"&6i*4H.", "", "ZM!U@\"&6i*4H.", 1458);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      ByteVector byteVector0 = new ByteVector();
      Item item0 = classWriter0.newFloat((-1898.89F));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      classWriter0.newFloat((-1898.89F));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("iI@%'o,Kspz~U'", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@3c1c3d9f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      Item item0 = classWriter0.newInteger(2);
      classWriter0.visitSource("bV&h;Nk[I{T-e&]Ft", "bV&h;Nk[I{T-e&]Ft");
      Item item1 = classWriter0.newInteger(2);
      assertSame(item1, item0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(116, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-871));
      classWriter0.newFloat((-1898.89F));
      classWriter0.newFloat((-1898.89F));
      classWriter0.visitOuterClass("_m>{IO,cQVZ`|", (String) null, "<J1..Iei##;Ey");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65536);
      Type type0 = Type.BYTE_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource((String) null, "@4gQ\"0Ji-Z!l,+aR");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      ByteVector byteVector0 = new ByteVector();
      Item item0 = classWriter0.newFloat((-1898.89F));
      classWriter0.newMethodItem("LineNumberTable", "43", ">n!?18tq\"c4kFN5Nr/", true);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("iI@%'o,Kspz~U'", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@407d0a32
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-873));
      classWriter0.visitOuterClass("Kd", "", "Kd");
      Item item0 = classWriter0.newMethodItem("Kd", "Kd", "Kd", false);
      Item item1 = classWriter0.newMethodItem("Kd", "Kd", "Kd", false);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Item item0 = classWriter0.newDouble(292.0);
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEE;AA,AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "RuntimeInvisibleAnnotations");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(333, byteArray0.length);
      
      Item item1 = classWriter0.newDouble(292.0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newDouble(292.0);
      classWriter0.newDouble(292.0);
      classWriter0.visitAnnotation("short", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-909));
      classWriter0.addUninitializedType("", (-909));
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
  public void test031()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1805));
      Item item0 = classWriter0.newLong(784L);
      Item item1 = classWriter0.newLong(784L);
      assertSame(item1, item0);
      
      classWriter0.visitSource("", ",OrTlZK%a&h*1D");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newLong(598L);
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
  public void test033()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
      
      Character character0 = new Character('g');
      int int0 = classWriter0.newConst(character0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-871));
      Item item0 = classWriter0.newFloat((-1898.89F));
      Item item1 = classWriter0.newFloat((-1898.89F));
      assertSame(item1, item0);
      
      classWriter0.visitSource("43", "LineNumberTable");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newLong(620L);
      classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Item item0 = classWriter0.newDouble(292.0);
      classWriter0.visitOuterClass("$dD:pgMr=567K8", (String) null, "");
      Item item1 = classWriter0.newDouble(292.0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65533);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      classWriter0.visitInnerClass("", "#9IR `W!i4", "ZM!U@\"&6i*4H.", 2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-871));
      classWriter0.newFloat((-1898.89F));
      classWriter0.newFloat((-1898.89F));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-871));
      classWriter0.newFloat((-1898.89F));
      classWriter0.newFloat((-1898.89F));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.invalidFrames = true;
      classWriter0.newInteger(1971);
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
      ClassWriter classWriter0 = new ClassWriter((-882));
      classWriter0.visitSource("2QE!`eW", "2QE!`eW");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
      
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newMethodItem("LineNumberTable", "43", "43", true);
      classWriter0.invalidFrames = true;
      classWriter0.visitInnerClass("", "LineNumberTable", "LineNumberTable", 2);
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
  public void test043()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      classWriter0.visitAnnotation("nhB@Z%~{a4E7{ts>e4h", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat((-1.0F));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Item item0 = classWriter0.newDouble(292.0);
      classWriter0.visitOuterClass("$dD:pgMr=567K8", "$dD:pgMr=567K8", "$dD:pgMr=567K8");
      Item item1 = classWriter0.newDouble(292.0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      classWriter0.visitSource("2QE!`eW", "2QE!`eW");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, (-882));
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
      ClassWriter classWriter0 = new ClassWriter((-882));
      Type type0 = Type.VOID_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitAnnotation("#", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("int", (-1280));
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("int", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-873));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("NafMlb)N0hnIdIbEM6&", "", "", false);
      classWriter0.visitOuterClass("NafMlb)N0hnIdIbEM6&", (String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newConstItem("org.moc0ito.asm.MethodWriter");
      classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(120, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65529);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("+Lz&U'a^N$3!", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
      
      Character character0 = Character.valueOf('^');
      annotationVisitor0.visit("+Lz&U'a^N$3!", character0);
      int int0 = classWriter0.newConst(character0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Item item0 = classWriter0.newMethodItem("Kd", "Kd", "Kd", false);
      classWriter0.newMethodItem("Kd", "Kd", "Kd", false);
      ByteVector byteVector0 = new ByteVector(2032);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 19);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@57e5858
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      classWriter0.visitSource("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEE;AA,AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(268, byteArray0.length);
      
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      Byte byte0 = new Byte((byte)116);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("nEF\"5UG4*_~i=PoDv`x", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-878));
      classWriter0.newDouble((-878));
      classWriter0.newDouble((-878));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-878));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitAnnotation("SourceFile", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-883));
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, 2413);
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newDouble((-875));
      classWriter0.visitAnnotation("x<SPt|T]f,", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-873));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("NafMlb)N0hnIdIbEM6&", "", "", false);
      classWriter0.visitInnerClass("value ", "mNy96lj-N\"7{S", (String) null, (-873));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newFieldItem("", "", "");
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitInnerClass((String) null, (String) null, "", (-1189));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newMethodItem("RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", false);
      classWriter0.visitOuterClass(".NZ", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Type type0 = Type.getObjectType("2QE!`eW");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 28, "JSR/RET are not supported with computeFrames option", "2QE!`eW", "2QE!`eW", type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(144, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      ByteVector byteVector0 = classWriter0.pool;
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      classWriter0.addUninitializedType("", (-1278));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 65535);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7ec864de
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newMethodItem("Qy", "Qy", "Qy", false);
      classWriter0.newFieldItem("Qy", "Qy", "Qy");
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.visitInnerClass("<init>", "<init>", "W+]Gz)&6TTasD1lp`x", 3);
      classWriter0.newMethodItem("Kd", "Kd", "Kd", false);
      classWriter0.newMethodItem("Kd", "Kd", "Kd", false);
      classWriter0.visitInnerClass((String) null, "AnnotationDefault", "Kd", (-1204));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-1538));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-1538));
      classWriter0.visitOuterClass("$dD:pgMr=567K8", "$dD:pgMr=567K8", (String) null);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@72aa2894
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1805));
      classWriter0.newLong(784L);
      classWriter0.newLong(784L);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(33, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      classWriter0.visitSource("2QE!`eW", "2QE!`eW");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
      
      int int0 = classWriter0.newConst("2QE!`eW");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-871));
      ClassWriter classWriter1 = new ClassWriter(2);
      classWriter0.newDouble(567.329280709);
      classWriter1.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter1.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65536);
      classWriter0.visitOuterClass("", (String) null, (String) null);
      Type type0 = Type.BYTE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("EnclosingMethod", false);
      classWriter0.visitSource("", "5Hk]l/W~r''");
      classWriter0.toByteArray();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("(H ", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7474413a
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newFieldItem("S~l;q\"86se>7N", "S~l;q\"86se>7N", "S~l;q\"86se>7N");
      classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newFieldItem("", "", "");
      classWriter0.newMethodItem("", "", "", true);
      classWriter0.visitAnnotation("+Lz&U'a^N$3!", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-871));
      ClassWriter classWriter1 = new ClassWriter(2);
      classWriter0.newFloat((-1898.89F));
      classWriter0.newFloat((-1898.89F));
      classWriter1.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter1.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "lL{1Q$`m/x~|G";
      stringArray0[1] = "";
      stringArray0[2] = "lL{1Q$`m/x~|G";
      stringArray0[3] = ".OsBs<?uY";
      stringArray0[4] = ".OsBs<?uY";
      classWriter0.visit(65535, 65535, "lL{1Q$`m/x~|G", "lL{1Q$`m/x~|G", ".OsBs<?uY", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.addType("2QE!`eW");
      int int0 = classWriter0.addType("2QE!`eW");
      assertEquals(1, int0);
      
      Type type0 = Type.getObjectType("2QE!`eW");
      int int1 = classWriter0.newConst(type0);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65529);
      classWriter0.visitAnnotation("+Lz&U'a^N$3!", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(915);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      Short short0 = new Short((short) (-3344));
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("nhB@Z%~{a4E7{ts>e4h", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      int int0 = classWriter0.addType("2QE!`eW");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("2QE!`eW");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("+Lz&U'a^N$3!", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-884));
      classWriter0.visitSource("RuntimeInvisibleParameterAnnoHations", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
      
      Short short0 = new Short((short)1007);
      int int0 = classWriter0.newConst(short0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.visitSource("RuntimeInvisibleParameterAnnotations", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
      
      Type type0 = Type.LONG_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      int int0 = classWriter0.addType("2QE!`eW");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("2QE!`eW");
      assertEquals(1, int1);
      
      classWriter0.visitSource("RuntimeInvisibleAnnotations", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-878));
      classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-878), 25);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitAnnotation("x<SPt|T]f,", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65529);
      classWriter0.visitAnnotation("+Lz&U'a^N$3!", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
      
      Byte byte0 = new Byte((byte)93);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65529);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("+Lz&U'a^N$3!", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("+Lz&U'a^N$3!", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@ddc2723
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newMethod("", "byte", ";$vr", false);
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
  public void test087()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.invalidFrames = true;
      classWriter0.newConstItem("org.moc0ito.asm.MethodWriter");
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
  public void test088()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newFloat((-1898.89F));
      classWriter0.newFloat((-1898.89F));
      classWriter0.visitInnerClass((String) null, "", "X3+5DMp`A2+D=", (-540));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-871));
      classWriter0.newFloat((-1898.89F));
      classWriter0.newFloat((-1898.89F));
      classWriter0.visitInnerClass("", "LineNumberTable", "LineNumberTable", 2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-878));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitSource((String) null, "Y{xApwv}MPq=^<d-d");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.newMethodItem("=", "=", "=", false);
      classWriter0.newMethodItem("=", "=", "=", false);
      classWriter0.visitSource("WL,9V!t&lc,E-kayshZ", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      Boolean boolean0 = new Boolean("5Hk]l/W~r''");
      classWriter0.newConstItem(boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Type type0 = Type.VOID_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitAnnotation("NafMlb)N0hnIdIbEM6&", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65529);
      classWriter0.visitAnnotation("+Lz&U'a^N$3!", true);
      int int0 = classWriter0.addUninitializedType("+Lz&U'a^N$3!", 65529);
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("", (-1281));
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("D&`a", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Type type0 = Type.FLOAT_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitOuterClass(".NZ", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      Item item0 = classWriter0.newConstItem("org.moc0ito.asm.MethodWriter");
      assertNotNull(item0);
      
      int int0 = classWriter0.newConst("org.moc0ito.asm.MethodWriter");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("", (-1278));
      assertEquals(1, int0);
      
      classWriter0.visitSource("", "Exceptions");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      Boolean boolean0 = new Boolean("5Hk]l/W~r''");
      classWriter0.newConstItem(boolean0);
      classWriter0.visitSource("", "5Hk]l/W~r''");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-875));
      classWriter0.visitInnerClass("", "", "", (-875));
      Type type0 = Type.CHAR_TYPE;
      classWriter0.visitInnerClass("", "", "org.mockito.asm.ClassWriter", 4);
      int int0 = classWriter0.newConst(type0);
      assertEquals(5, int0);
  }
}
