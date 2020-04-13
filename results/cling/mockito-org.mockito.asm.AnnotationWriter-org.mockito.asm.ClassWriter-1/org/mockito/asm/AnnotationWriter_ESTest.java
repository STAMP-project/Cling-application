/*

 * Tue Mar 03 14:25:26 GMT 2020
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
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      classWriter0.newFieldItem("java/lang/Class", "", "");
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      Short short0 = new Short((short)35);
      classWriter0.visitField(2871, ".s.IFJDCS", "", "", short0);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(136, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newFieldItem("bEas", "bEas", "bEas");
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.newMethod("bEas", "bEas", "bEas", true);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-1455));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("x?i,Eh", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@1419e4ee
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-90));
      ClassWriter classWriter0 = new ClassWriter((byte) (-90));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      Item item0 = classWriter0.newLong(0L);
      Item item1 = classWriter0.newLong(0L);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2732));
      Item item0 = classWriter0.newLong((-1510L));
      assertNotNull(item0);
      
      Type type0 = Type.LONG_TYPE;
      Item item1 = classWriter0.newConstItem(type0);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      classWriter0.addUninitializedType("", 1997);
      classWriter0.addUninitializedType("", 1997);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("c", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2147483641));
      classWriter0.visitAnnotation("0hE9CR ,F4//rO}), ", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1221), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2732));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("w7/0J}iu>1", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("QI!xc*VI4S\"z$_acoJ", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@2af442c4
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = classWriter0.newMethod("bEas", "bEas", "bEas", true);
      assertEquals(4, int0);
      
      classWriter0.visitSource("bEas", "Yv3y<<*J>#JLN/F[sW");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(112, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
      
      int int0 = classWriter0.newMethod("", "", "5:,+U+`it$P\"Xr 86", false);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      classWriter0.newConstItem("");
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2732));
      classWriter0.newLong((-1510L));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1729);
      Character character0 = Character.valueOf('b');
      classWriter0.visitSource("org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter");
      classWriter0.newConstItem(character0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(136, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2147483641));
      Type type0 = Type.INT_TYPE;
      classWriter0.newConstItem(type0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1221), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.visitOuterClass("", "", "bEas");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(937.6516F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      classWriter0.addUninitializedType("", 1);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitAnnotation("0hE9CR ,F4//rO}), ", false);
      classWriter0.newMethodItem("0hE9CR ,F4//rO}), ", "0hE9CR ,F4//rO}), ", "0hE9CR ,F4//rO}), ", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
      
      int int0 = classWriter0.newMethod("0hE9CR ,F4//rO}), ", "(fW=J", "4d\"_L|ZgHb!", false);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.visitField(2, "", "", "", boolean0);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(126, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newMethod("bEas", "bEas", "bEas", true);
      classWriter0.visitSource((String) null, "{");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newMethod("bEas", "bEas", "bEas", true);
      classWriter0.visitSource("tz!'2&R p8T4qIL~Q^6", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("DtE1A", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("o", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-70));
      ClassWriter classWriter0 = new ClassWriter(924);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitField(3091, "SourceDebugExtension", "SourceDebugExtension", "SourceDebugExtension", byte0);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(149, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Item item0 = classWriter0.newFloat(0.0F);
      Type type0 = Type.INT_TYPE;
      classWriter0.newConstItem(type0);
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-90));
      ClassWriter classWriter0 = new ClassWriter(924);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitField(3091, "SourceDebugExtension", "SourceDebugExtension", "SourceDebugExtension", byte0);
      classWriter0.visitSource("(fW=J", "x _?7n");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(145, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2729));
      Item item0 = classWriter0.newFloat((-2729));
      classWriter0.visitOuterClass("RuntimeInvisibleAnnotations", (String) null, "");
      Item item1 = classWriter0.newFloat((-2729));
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Type type0 = Type.getObjectType("0hE9CR ,F4//rO}), ");
      classWriter0.newConstItem(type0);
      classWriter0.visitAnnotation("o", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2732));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      Item item0 = classWriter0.newMethodItem("", "", "I^|5E5.Tw4,s=a*PjGO", false);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("%", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@a852d4
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      int int0 = classWriter0.newMethod("..;]gp", "..;]gp", "", true);
      assertEquals(5, int0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "..;]gp";
      classWriter0.visit(187, 26, "..;]gp", "..;]gp", "..;]gp", stringArray0);
      classWriter0.newFieldItem("", "..;]gp", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      classWriter0.newDouble(137.08789);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(Integer.MAX_VALUE);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2697));
      Character character0 = new Character('-');
      classWriter0.visitField((-2697), "InnerClasses", "InnerClasses", "InnerClasses", character0);
      classWriter0.visitAnnotation("&N-t7", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(183, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2732));
      classWriter0.newLong((-1510L));
      classWriter0.visitAnnotation("w7/0J}iu>1", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2697));
      classWriter0.visitAnnotation("java/lang/Object", false);
      classWriter0.newMethodItem("java/lang/Object", "6Z^Y", "value ", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(114, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2745));
      Item item0 = classWriter0.newFloat((-2745));
      classWriter0.visitOuterClass("!JqCM", "#C7a?I|2[ZET?=lGmM)", "");
      Item item1 = classWriter0.newFloat((-2745));
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "RuntimeInvisibleAnnotations";
      stringArray0[1] = "";
      stringArray0[2] = "*Zd%zGcW,sgN'!";
      stringArray0[3] = "RuntimeInvisibleAnnotations";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      classWriter0.visit((-126), (-126), "", "", "", stringArray0);
      classWriter0.newDouble((-1357.0864663494935));
      classWriter0.newDouble((-1357.0864663494935));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(147, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitAnnotation("mzSv$", true);
      Boolean boolean0 = new Boolean(false);
      classWriter0.newConstItem(boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitInnerClass("", "", "", 18);
      int int0 = classWriter0.addType("L");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(61, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2697));
      classWriter0.visitAnnotation("java/lang/Class", true);
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.newConstItem(boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitInnerClass("", "", "", 18);
      classWriter0.newDouble((-9.13236257933922));
      classWriter0.newDouble((-9.13236257933922));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(924);
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.visitField((byte) (-90), "h,7X~8;EKVW", "x _?7n", "SourceDebugExtension", boolean0);
      classWriter0.visitSource("(fW=J", "x _?7n");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(205, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      classWriter0.toByteArray();
      Boolean boolean0 = new Boolean(false);
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitAnnotation("o", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(187, 187, "", "", "", stringArray0);
      int int0 = classWriter0.addUninitializedType("", 1997);
      assertEquals(1, int0);
      
      classWriter0.addUninitializedType("", 1997);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(52, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.newDouble((-9.13236257933922));
      classWriter0.newDouble((-9.13236257933922));
      classWriter0.visitOuterClass("", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(64, 74);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      Item item0 = classWriter0.newDouble(1.0);
      Item item1 = classWriter0.newDouble(1.0);
      assertSame(item1, item0);
      
      Short short0 = new Short((short)19);
      classWriter0.visitField(6, "R`_Ru5_}iiX)5", "org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter", short0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(136, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      int int0 = classWriter0.addUninitializedType("", 74);
      int int1 = classWriter0.addUninitializedType("", 74);
      assertTrue(int1 == int0);
      
      classWriter0.visitSource("", ",gj|&5Qx6|ZEKhU");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(208);
      classWriter0.visitAnnotation("", true);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1, "", "X&+:LHT@CZ:yW>*&*Sp", "Z`_5u5_}iiXP5", "X&+:LHT@CZ:yW>*&*Sp");
      classWriter0.toByteArray();
      FieldVisitor fieldVisitor1 = classWriter0.visitField(268435455, ")V", "", "Z`_5u5_}iiXP5", "X&+:LHT@CZ:yW>*&*Sp");
      assertNotSame(fieldVisitor1, fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      int int0 = classWriter0.addUninitializedType("", 1);
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("", 1);
      assertEquals(1, int1);
      
      classWriter0.visitSource((String) null, "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(53, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("0hE9CR ,F4//rO}), ", true);
      Byte byte0 = new Byte((byte)82);
      classWriter0.toByteArray();
      annotationVisitor0.visit("", byte0);
      Short short0 = new Short((byte)82);
      annotationVisitor0.visit("ao*`PM", short0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = classWriter0.pool;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "_=t|#^aJ)N8Da'";
      stringArray0[2] = "Mduj&o&r*r|km){c";
      stringArray0[3] = "_=t|#^aJ)N8Da'";
      stringArray0[4] = "Mduj&o&r*r|km){c";
      stringArray0[5] = "_=t|#^aJ)N8Da'";
      classWriter0.visitMethod((-1), "_=t|#^aJ)N8Da'", "_=t|#^aJ)N8Da'", "Mduj&o&r*r|km){c", stringArray0);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@1048c396
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.addUninitializedType("", 74);
      classWriter0.addUninitializedType("", 74);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.addUninitializedType("", 74);
      int int0 = classWriter0.addUninitializedType("", 74);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("RuntimeInvisibleAnnotations", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitInnerClass("", "", "", 18);
      classWriter0.visitAnnotation("StackMapTable", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.newDouble(0.183141001976744);
      classWriter0.newDouble(0.183141001976744);
      classWriter0.visitAnnotation("oaY.W", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.addUninitializedType("", 74);
      classWriter0.addUninitializedType("", 74);
      classWriter0.visitInnerClass("", "[]", "", 74);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitAnnotation("", true);
      Character character0 = Character.valueOf('X');
      classWriter0.visitField(Integer.MAX_VALUE, "", "java/lang/Class", "java/lang/Class", character0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(179, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitInnerClass("", "", "", 18);
      int int0 = classWriter0.newField("", "", "");
      assertEquals(4, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newMethod("bEas", "bEas", "bEas", true);
      classWriter0.visitInnerClass("bEas", "5-h!", (String) null, 2);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newMethod("bEas", "bEas", "bEas", true);
      classWriter0.visitInnerClass(">", ">", "", 40);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitOuterClass("3{00~j9sb", "3{00~j9sb", "3{00~j9sb");
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      int int0 = classWriter0.newMethod("bEas", "bEas", "bEas", false);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(187, 187, "", "", "", stringArray0);
      Type type0 = Type.LONG_TYPE;
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2697));
      classWriter0.getCommonSuperClass("java/lang/Class", "java/lang/Class");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      int int0 = classWriter0.newConst("");
      assertEquals(3, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(208);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1, "", "X&+:LHT@CZ:yW>*&*Sp", "Z`_5u5_}iiXP5", "X&+:LHT@CZ:yW>*&*Sp");
      classWriter0.toByteArray();
      FieldVisitor fieldVisitor1 = classWriter0.visitField(268435455, ")V", "", "Z`_5u5_}iiXP5", "X&+:LHT@CZ:yW>*&*Sp");
      assertNotSame(fieldVisitor1, fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      int int0 = classWriter0.newMethod("bEas", "bEas", "bEas", false);
      assertEquals(5, int0);
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "_=t|#^aJ)N8Da'";
      stringArray0[2] = "Mduj&o&r*r|km){c";
      stringArray0[3] = "_=t|#^aJ)N8Da'";
      stringArray0[4] = "Mduj&o&r*r|km){c";
      stringArray0[5] = "_=t|#^aJ)N8Da'";
      classWriter0.visitMethod((-1), "_=t|#^aJ)N8Da'", "_=t|#^aJ)N8Da'", "Mduj&o&r*r|km){c", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(195, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2, "", "Synthetic", "", "Synthetic");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(208);
      classWriter0.visitAnnotation("", true);
      classWriter0.newMethodItem("k[)lt", "8[|{0WGA$", "", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      classWriter0.toByteArray();
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1022);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@62b9d9f4
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitAnnotation("0hE9CR ,F4//rO}), ", false);
      classWriter0.newFieldItem("\"w*a", "0hE9CR ,F4//rO}), ", "0hE9CR ,F4//rO}), ");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(108, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newMethod("bEas", "bEas", "bEas", true);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("bEas", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newMethod("bEas", "bEas", "bEas", false);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(208);
      classWriter0.visitField(1, "", "", "Z`_5u5_}iiXP5", "");
      classWriter0.toByteArray();
      Type type0 = Type.INT_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "RuntimeInvisibleAnnotations";
      stringArray0[1] = "";
      stringArray0[2] = "*Zd%zGcW,sgN'!";
      stringArray0[3] = "RuntimeInvisibleAnnotations";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      classWriter0.visit((-126), (-126), "", "", "", stringArray0);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(Integer.MAX_VALUE);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.addUninitializedType("", 74);
      classWriter0.addUninitializedType("", 74);
      classWriter0.visitOuterClass("", "R*.\"00,}Cf/E", "SourceDebugExtension");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      int int0 = classWriter0.addType("");
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.visitField(2, "", "", "", boolean0);
      int int1 = classWriter0.addUninitializedType("", 1);
      assertFalse(int1 == int0);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Item item0 = classWriter0.newFloat(0.0F);
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("o", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("0hE9CR ,F4//rO}), ", true);
      classWriter0.visitSource("0hE9CR ,F4//rO}), ", (String) null);
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@2c748887
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitAnnotation("oaY.W", false);
      Short short0 = new Short((short)22);
      classWriter0.newConstItem(short0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(208);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      Short short0 = new Short((short) (-1294));
      classWriter0.newConstItem(short0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitOuterClass("", "L*j'~Kknx;*z\r", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.newFieldItem("bEas", "bEas", "bEas");
      classWriter0.visitSource("", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      classWriter0.toByteArray();
      Type type0 = Type.INT_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("(fW=J", "(fW=J");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
      
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(208);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(64, 40);
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
      ClassWriter classWriter0 = new ClassWriter((-2147483636));
      classWriter0.visitAnnotation("0hE9CR ,F4//rO}), ", true);
      classWriter0.newMethodItem("0hE9CR ,F4//rO}), ", "0hE9CR ,F4//rO}), ", "0hE9CR ,F4//rO}), ", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.newDouble((-9.13236257933922));
      classWriter0.newDouble((-9.13236257933922));
      classWriter0.visitAnnotation("StackMapTable", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-90));
      ClassWriter classWriter0 = new ClassWriter(924);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("6x?]kdKb`BD", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitInnerClass("", "", "", 18);
      Type type0 = Type.INT_TYPE;
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 236);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Zu~(dv^~", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@5e3ffdc
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitAnnotation("0hE9CR ,F4//rO}), ", false);
      Type type0 = Type.INT_TYPE;
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Type type0 = Type.getObjectType("0hE9CR ,F4//rO}), ");
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(49, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("OqZ20qhq*@(*)/,", "OqZ20qhq*@(*)/,");
      int int0 = classWriter0.newField("OqZ20qhq*@(*)/,", "java/lang/Object", "_/lX=OKE9{");
      assertEquals(6, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(154, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newFieldItem("bEas", "bEas", "bEas");
      Item item1 = classWriter0.newFieldItem("bEas", "bEas", "bEas");
      assertSame(item1, item0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(44, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitAnnotation("StackMapTable", true);
      Type type0 = Type.INT_TYPE;
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Type type0 = Type.INT_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitOuterClass("", "", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      classWriter0.visitOuterClass("EnclosingMethod", (String) null, "y`l&{,qU>kp*@");
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Synthetic", annotationWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@4bed0e5c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitInnerClass("", "", "", 18);
      classWriter0.visitInnerClass("[]", "[]", "[]", 18);
      Item item0 = classWriter0.newDouble((-9.13236257933922));
      Item item1 = classWriter0.newDouble((-9.13236257933922));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.addUninitializedType("", 74);
      int int0 = classWriter0.addUninitializedType("", 74);
      assertEquals(1, int0);
      
      Byte byte0 = new Byte((byte)13);
      classWriter0.visitField(46, "", "{]=,2&Y", "", byte0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2697));
      classWriter0.getCommonSuperClass("java/lang/Class", "java/lang/Class");
      Item item0 = classWriter0.newConstItem("java/lang/Class");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitInnerClass((String) null, ",h\"2t '", (String) null, 89);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2716));
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("", 1);
      assertEquals(2, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newFieldItem("bEas", "bEas", "bEas");
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-1455));
      classWriter0.visitSource((String) null, "{");
      // Undeclared exception!
      try { 
        annotationWriter0.visit("x?i,Eh", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@38b40e01
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitInnerClass("", "", "", 18);
      classWriter0.visitInnerClass("[]", "[]", "[]", 18);
      Type type0 = Type.INT_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }
}
