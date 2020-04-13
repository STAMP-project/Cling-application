/*

 * Tue Mar 03 14:27:11 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  public void test000()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitInnerClass("IYA6", "Zs@]M*zS%b", "Zs@]M*zS%b", 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.visitSource((String) null, "Deprecated");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2510));
      classWriter0.visit(10, (-2510), "7", "LaV?%Y,@?p^DcZ'R", "7", (String[]) null);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("7", "7", "7", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      classWriter0.visitAnnotation("z", true);
      classWriter0.toByteArray();
      Short short0 = new Short((short)7);
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      Byte byte0 = new Byte((byte)37);
      classWriter0.newConstItem(byte0);
      classWriter0.visitSource("nKZ:bxl!PE", "@ S");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      Item item0 = classWriter0.newLong(2);
      classWriter0.visitField(20, "N[", ")`ET]5", "N[", "N[");
      Item item1 = classWriter0.newLong(2);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "`y$D,tRnO}d!wE*";
      stringArray0[1] = "";
      stringArray0[2] = "G";
      stringArray0[3] = "PHSW7Lnx";
      classWriter0.visit(1520, (-221), "`y$D,tRnO}d!wE*", "HnawG4N^|\",EmWl", "", stringArray0);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(2);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      int int0 = classWriter0.addType("Py-2g_?");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("Py-2g_?");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("Py-2g_?", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.visitAnnotation("rJ*1ueB` <LF", false);
      classWriter0.toByteArray();
      Type type0 = Type.SHORT_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2510));
      classWriter0.visit(10, (-2510), "", "LaV?%Y,@?p^DcZ'R", "ConstantValue", (String[]) null);
      classWriter0.toByteArray();
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 6);
      Boolean boolean0 = new Boolean("SourceDebugExtension");
      annotationWriter0.visit("", boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newInteger(1);
      classWriter0.visit((-485), (-485), "WS-)O7t9%", "PHSW7Lnx", "RuntimeVisibleAnnotations", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(125, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2976);
      classWriter0.visitSource("l`", "<W1Gb8H7/oiy");
      int int0 = classWriter0.newMethod("org.mock(to.asm.Frame", "org.mock(to.asm.Frame", "char", true);
      assertEquals(6, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(135, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.visitSource("T^kGTPI0{,}E~fNNzj", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2960);
      classWriter0.visitAnnotation("", false);
      classWriter0.newConstItem("AI]wHv<pp$P3*MU");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.visitAnnotation("rJ*1ueB` <LF", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong((-389L));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("f?vgO(o0@Qu9qL8w'i", false);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@66bb7d14
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", false);
      classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", false);
      classWriter0.visitOuterClass("org.mockito.asm.MethodWriter", (String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      Character character0 = new Character('J');
      classWriter0.newConstItem(character0);
      classWriter0.visitSource(";$6BU;+08={Bes>W[", "D%)");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      Type type0 = Type.FLOAT_TYPE;
      classWriter0.newConst(type0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-22), 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.visitOuterClass("g", "(", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.visitField(586, "4GTjZV3Zu<G[nI_N", "u4XgLDT5KyA,ce", "4GTjZV3Zu<G[nI_N", "4GTjZV3Zu<G[nI_N");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(135, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFloat(2);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-1516));
      classWriter0.newInteger((-1516));
      classWriter0.newInteger((-1516));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, (ByteVector) null, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("InnerClasses", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.visitAnnotation("rJ*1ueB` <LF", false);
      Boolean boolean0 = new Boolean(false);
      classWriter0.newConstItem(boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.newFieldItem("(", "(", "");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Zs@]M*zS%b";
      stringArray0[1] = "org.mockito.asm.ClassWriter";
      stringArray0[2] = "org.mockito.asm.ClassWriter";
      stringArray0[3] = "org.mockito.asm.ClassWriter";
      stringArray0[4] = "InnerClasses";
      stringArray0[5] = "org.mockito.asm.ClassWriter";
      stringArray0[6] = "Zs@]M*zS%b";
      stringArray0[7] = "Zs@]M*zS%b";
      stringArray0[8] = "N;#<D5";
      classWriter0.visitMethod(13, "Zs@]M*zS%b", "org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter", stringArray0);
      Item item0 = classWriter0.newFloat(2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(175, byteArray0.length);
      
      Item item1 = classWriter0.newFloat(2);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1516));
      classWriter0.newInteger((-1516));
      classWriter0.newInteger((-1516));
      classWriter0.visitAnnotation("U_*'7'<\"", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(2404);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2404);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("=fD|V6LAP", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@5a40dbdd
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2510));
      classWriter0.visit(10, (-2510), "'", "LaV?%Y,@?p^DcZ'R", "'", (String[]) null);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong((-1L));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newLong(20);
      classWriter0.visit((-1084), (-1747), "]1~DX|G", "PLqJq+@NO3E_0A%[", "u4XgLDT5KyA,ce", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1516));
      Item item0 = classWriter0.newInteger((-1516));
      Item item1 = classWriter0.newInteger((-1516));
      assertSame(item1, item0);
      
      classWriter0.visitSource("U_*'7'<\"", "w");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2976);
      classWriter0.visitSource("l`", "<W1Gb8H7/oiy");
      classWriter0.visitOuterClass("char", "char", "char");
      classWriter0.newFieldItem("char", "char", "org.mock(to.asm.Frame");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(168, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitOuterClass("int", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3964);
      classWriter0.visit(1, 65535, "czeLJ%'xM/_!FlMF/g", "c`^i*d*^pQ", "czeLJ%'xM/_!FlMF/g", (String[]) null);
      classWriter0.toByteArray();
      classWriter0.newMethod("Uq'", "Uq'", "Deprecated", false);
      classWriter0.visitOuterClass("", "Uq'", "Deprecated");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.visitSource("", "");
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.visitAnnotation("", true);
      classWriter0.newMethod("0B1Mg$bG:Z", "0B1Mg$bG:Z", "0B1Mg$bG:Z", false);
      Item item0 = classWriter0.newMethodItem("0B1Mg$bG:Z", "0B1Mg$bG:Z", "0B1Mg$bG:Z", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newLong(2);
      classWriter0.newLong(2);
      classWriter0.visitSource("u)\"p", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.visitAnnotation("rJ*1ueB` <LF", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(4294967295L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2404);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitOuterClass("{A|a/ipi` ", "fnE* ?", "{A|a/ipi` ");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Uq'";
      stringArray0[1] = "Uq'";
      classWriter0.visit((-158), 7, "Uq'", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "J%e4`hd4Pia!(JCD's;", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(314, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      Boolean boolean0 = Boolean.valueOf(false);
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("EnclosingMethod", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2513));
      classWriter0.visitInnerClass("0TegQ_s2;", ";fvCbXu", ";fvCbXu", (-141));
      int int0 = classWriter0.addType("NsD");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("EnclosingMethod", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.visitInnerClass("AI]wHv<pp$P3*MU", "AI]wHv<pp$P3*MU", "J%e4`hd4Pia!(JCD's;", 1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(107, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2976);
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.visitField(536, "char", "char", "char", boolean0);
      classWriter0.visitSource("l`", "<W1Gb8H7/oiy");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(155, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      classWriter0.visitAnnotation("z", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(1916.1469F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.visitOuterClass("Deprecated", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", ">:");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.visitOuterClass("", "wm$C6q", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      Type type0 = Type.FLOAT_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource("nN", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      Type type0 = Type.FLOAT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("EnclosingMethod", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2513));
      classWriter0.visitOuterClass("value ", "value ", "value ");
      classWriter0.newField("value ", "value ", "value ");
      classWriter0.visitOuterClass(";bacI&^_?3j76DUt", (String) null, "rU<fh>}+1%");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2510));
      int int0 = classWriter0.addUninitializedType("7", 1);
      assertEquals(1, int0);
      
      classWriter0.visitSource("LaV?%Y,@?p^DcZ'R", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      classWriter0.visitAnnotation("z", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem("]");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1516));
      Item item0 = classWriter0.newInteger((-1516));
      Item item1 = classWriter0.newInteger((-1516));
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("Siz`b}NVYxA/B#K", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2976);
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.visitField(536, "char", "char", "char", boolean0);
      classWriter0.newMethodItem("", "char", "char", false);
      classWriter0.visitOuterClass("char", "char", "char");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(135, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("u4XgLDT5KyA,ce", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@5ccfd43f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.invalidFrames = true;
      classWriter0.newMethod("", "", "", false);
      classWriter0.newMethodItem("", "", "", true);
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
  public void test058()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2510));
      classWriter0.addUninitializedType("'", 1);
      classWriter0.visitAnnotation("#q", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.visitAnnotation("f?vgO(o0@Qu9qL8w'i", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newMethodItem("0B1Mg$bG:Z", "0B1Mg$bG:Z", "0B1Mg$bG:Z", true);
      classWriter0.newMethodItem("0B1Mg$bG:Z", "0B1Mg$bG:Z", "0B1Mg$bG:Z", true);
      classWriter0.visitAnnotation("org.mockito.asm.ClassWriter", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(122, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      Character character0 = new Character('8');
      classWriter0.newConstItem(character0);
      classWriter0.visitAnnotation("MnnotationDefaulU", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      int int0 = classWriter0.newNameType("u4XgLDT5KyA,ce", "");
      assertEquals(3, int0);
      
      classWriter0.visitInnerClass("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "^1GTF;g", 655);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newMethod("", "", "", false);
      classWriter0.newFieldItem("", "", "");
      classWriter0.visitInnerClass("", "IYA6", "", 20);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("z", false);
      classWriter0.addType("U@,c`p;#4");
      classWriter0.addType("");
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
  public void test065()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2976);
      classWriter0.visitSource("l`", "<W1Gb8H7/oiy");
      classWriter0.newMethodItem("", "char", "char", false);
      classWriter0.visitOuterClass("char", "char", "char");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(145, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2510));
      classWriter0.visit(10, (-2510), "7", "LaV?%Y,@?p^DcZ'R", "7", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(107, byteArray0.length);
      
      int int0 = classWriter0.newField("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "java/lang/Object", "Deprecated");
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2513));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitOuterClass("AI]wHv<pp$P3*MU", ";fvCbXu", (String) null);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@5c3e9b7f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(20, "u4XgLDT5KyA,ce", "4GTjZV3Zu<G[nI_N", "w", "4GTjZV3Zu<G[nI_N");
      classWriter0.visit(65535, (-221), "EnclosingMethod", "=:$~*D:I|=fN", "8dmT7b}I8\"xG%", (String[]) null);
      classWriter0.toByteArray();
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("u4XgLDT5KyA,ce", fieldVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.FieldWriter@484a1012
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      Item item0 = classWriter0.newLong(2);
      Item item1 = classWriter0.newLong(2);
      assertSame(item1, item0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(33, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      byte[] byteArray0 = classWriter0.toByteArray();
      Attribute attribute0 = new Attribute("");
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong((-1059L));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.visitField(20, "N[", ")`ET]5", "N[", "N[");
      classWriter0.visitSource("u)\"p", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(150, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      classWriter0.visitAnnotation("z", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      classWriter0.addType("U@,c`p;#4");
      int int0 = classWriter0.addType("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.invalidFrames = true;
      classWriter0.newDouble(0.0);
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
  public void test074()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      Type type0 = Type.getObjectType("RuntimeInvisibleAnnotations");
      classWriter0.newConstItem(type0);
      classWriter0.visitSource("", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.visitInnerClass("J%e4`hd4Pia!(JCD's;", "AI]wHv<pp$P3*MU", "s+J? ", 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      int int0 = classWriter0.newMethod("0B1Mg$bG:Z", "0B1Mg$bG:Z", "0B1Mg$bG:Z", false);
      assertEquals(4, int0);
      
      classWriter0.newMethodItem("0B1Mg$bG:Z", "0B1Mg$bG:Z", "0B1Mg$bG:Z", true);
      classWriter0.visitAnnotation("org.mockito.asm.ClassWriter", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(127, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      int int0 = classWriter0.newMethod("", "", "", false);
      assertEquals(4, int0);
      
      classWriter0.newMethodItem("", "", "", true);
      classWriter0.visitAnnotation("org.mockito.asm.Label", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(109, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      Type type0 = Type.FLOAT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitField(8, "RuntimeInvisibleAnnotations", "char", "Jv9'fNummpdBP1V", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(144, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.visitField(20, "u4XgLDT5KyA,ce", "4GTjZV3Zu<G[nI_N", "w", "4GTjZV3Zu<G[nI_N");
      int int0 = classWriter0.addType("Py-2g_?");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("Py-2g_?");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      Item item0 = classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      Item item1 = classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      assertSame(item1, item0);
      
      classWriter0.visit((-1084), (-1747), "]1~DX|G", "PLqJq+@NO3E_0A%[", "u4XgLDT5KyA,ce", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(125, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      classWriter0.visitAnnotation("z", false);
      classWriter0.toByteArray();
      Short short0 = new Short((byte) (-25));
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation(".s.IFJDCS", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      Short short0 = new Short((byte)14);
      classWriter0.newConstItem(short0);
      classWriter0.visitSource("u)\"p", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      Type type0 = Type.FLOAT_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitOuterClass("`$PhM3J", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      Item item0 = classWriter0.newClassItem("Zs@]M*zS%b");
      assertNotNull(item0);
      
      classWriter0.newFieldItem("Zs@]M*zS%b", "Zs@]M*zS%b", "Zs@]M*zS%b");
      byte[] byteArray0 = classWriter0.toByteArray();
      Attribute attribute0 = new Attribute("");
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(109, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-1516));
      classWriter0.visitSource("U_*'7'<\"", "w");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, (ByteVector) null, 1);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("InnerClasses", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.addType("Py-2g_?");
      int int0 = classWriter0.addType("Py-2g_?");
      assertEquals(1, int0);
      
      classWriter0.visitSource("~9~]P+ L:> R", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(60, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFloat(2);
      byte[] byteArray0 = classWriter0.toByteArray();
      Attribute attribute0 = new Attribute("");
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      classWriter0.newFloat(2);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(67, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.visitAnnotation("rJ*1ueB` <LF", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(14, (-952));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(18, 46);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2404);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitSource("Q;wn1_p'&B,G!", "{A|a/ipi` ");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.visitAnnotation("AI]wHv<pp$P3*MU", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      byte[] byteArray0 = new byte[17];
      classWriter0.visitAnnotation("rJ*1ueB` <LF", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem(byteArray0[0]);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1516));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("Siz`b}NVYxA/B#K", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("==Hb|:z;iT)0rHdk!qN", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@6868456
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      ByteVector byteVector0 = mock(ByteVector.class, new ViolatedAssumptionAnswer());
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      classWriter0.visitInnerClass("^1GTF;g", "^1GTF;g", "^1GTF;g", 285212683);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("^1GTF;g", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@759b6ab8
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFloat(2);
      classWriter0.newFloat(2);
      classWriter0.visitInnerClass("(", (String) null, "=\"(_+Z)ii}`k}", 268435455);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      classWriter0.visitSource("ConstantValue", "w");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(2380);
      Item item0 = classWriter0.newClassItem("Zs@]M*zS%b");
      byte[] byteArray0 = classWriter0.toByteArray();
      Attribute attribute0 = new Attribute("");
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@1b131b40
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("f?vgO(o0@Qu9qL8w'i", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@4898a78
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.visitAnnotation("rJ*1ueB` <LF", false);
      Type type0 = Type.getObjectType("&Y-Do");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.newFieldItem("(", "(", "");
      classWriter0.visit(978, (-12), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "l3%anb)]@nD'5sMg\".m", "+n:>5x_Ay4;R:VihRX7", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(356, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      Item item0 = classWriter0.newFieldItem("(", "(", "");
      Item item1 = classWriter0.newFieldItem("(", "(", "");
      assertSame(item1, item0);
      
      classWriter0.visitSource("w", "U_*'7'<\"");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(106, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3964);
      classWriter0.visit(1, 65535, "czeLJ%'xM/_!FlMF/g", "c`^i*d*^pQ", "czeLJ%'xM/_!FlMF/g", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-221));
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("q<8PM3AAYDsF^l", byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.ByteArrayInputStream@7a4eb1c8
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      Item item0 = classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      Item item1 = classWriter0.newMethodItem("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", true);
      assertSame(item1, item0);
      
      classWriter0.visitInnerClass("u4XgLDT5KyA,ce", "u4XgLDT5KyA,ce", "^1GTF;g", 655);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.visitAnnotation("rJ*1ueB` <LF", true);
      classWriter0.addType("CZ&7 7e{1\"");
      int int0 = classWriter0.addType("&Y-Do");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2960);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitOuterClass("AI]wHv<pp$P3*MU", (String) null, "AI]wHv<pp$P3*MU");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("AI]wHv<pp$P3*MU", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.newDouble(3.879922617713689);
      classWriter0.visitInnerClass((String) null, (String) null, "", 1720);
      classWriter0.visitInnerClass("AI]wHv<pp$P3*MU", "A?I]wHv<pp$P3*MU", (String) null, 1720);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2960);
      classWriter0.newConstItem("]");
      classWriter0.newConstItem("]");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(31, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1720);
      classWriter0.addType("`y$D,tRnO}d!wE*");
      int int0 = classWriter0.addType("O=_%(g=H>taNisK,K");
      assertEquals(2, int0);
      
      classWriter0.visitSource("", ":y8<v$QN'T%X5NBQ@");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2510));
      classWriter0.addUninitializedType("7", 1);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 6);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("ConstantValue", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@1e1daee1
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212683);
      ByteVector byteVector0 = mock(ByteVector.class, new ViolatedAssumptionAnswer());
      doReturn((ByteVector) null).when(byteVector0).putShort(anyInt());
      classWriter0.visitSource((String) null, (String) null);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2158);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("^1GTF;g", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@2b35e124
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitInnerClass((String) null, (String) null, ";fvCbXu", (-3803));
      classWriter0.visitInnerClass("AI]wHv<pp$P3*MU", "", (String) null, (-3803));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("O2>B0v;6%g^0XWIzJ", pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.PushbackInputStream@7a0fb52f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2380);
      byte[] byteArray0 = classWriter0.toByteArray();
      Attribute attribute0 = new Attribute("");
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      classWriter0.newInteger(1);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(62, byteArray1.length);
  }
}
