/*

 * Tue Mar 03 14:25:46 GMT 2020
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
  public void test000()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitOuterClass("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      Item item0 = classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      assertNotNull(item0);
      
      Item item1 = classWriter0.newConstItem("RutimVisibeAnnottions");
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      classWriter0.addUninitializedType("0", (-730));
      classWriter0.visitInnerClass("", "SourceFile", "", (-730));
      classWriter0.addUninitializedType("0", (-730));
      classWriter0.visitInnerClass("t[+~(U\"S}SwR>`Q_>aG", "0", "SourceFile", (-1533));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("h\u0007](aW", true);
      classWriter0.newLong((-6099));
      classWriter0.newLong((-6099));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("Signature", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@544f5055
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      Item item0 = classWriter0.newLong(2);
      assertNotNull(item0);
      
      Type type0 = Type.CHAR_TYPE;
      Item item1 = classWriter0.newConstItem(type0);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.invalidFrames = true;
      classWriter0.visitAnnotation("h\u0007](aW", true);
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
  public void test005()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitInnerClass("RutimVisibeAnnottions", "M?U^EjU}*ycz3C[yD", (String) null, (-1048));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("bQ", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
      
      Type type0 = Type.getObjectType("<init>");
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.visitAnnotation("h\u0007](aW", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
      
      int int0 = classWriter0.addType("eO0NJt~r(M\"@a@");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("Q", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-764), 17);
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
      ClassWriter classWriter0 = new ClassWriter((-764));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("db-", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit(":QHL5a5a1fHa^mCo5", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@4de96ee2
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      int int0 = classWriter0.newMethod("", "E$#Tbwd$n>mH|`y", "", false);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitAnnotation("+^|8#>.eMtzEbS| ", false);
      classWriter0.newConstItem("FwUe0_Q=^=XQva/:Z!k");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(110, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitOuterClass("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.visitAnnotation("h\u0007](aW", false);
      classWriter0.newLong((-6099));
      classWriter0.newLong((-6099));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newDouble(0.0);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.newDouble(0.0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("u'c3br[&&3", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@18a07bbb
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.newConstItem("h\u0007](aW");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(2, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitOuterClass("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      Item item0 = classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      Item item1 = classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-750));
      classWriter0.newFloat(901.4F);
      classWriter0.visitSource("d8+", "d8+");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass("h\u0007](aW", "Ljava/lang/Synthetic;", (String) null, 2);
      classWriter0.visitInnerClass("i>uv;D~j'aVA-", "SourceDebugExtension", "RuntimeVisibleAnnotations", 8);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      Item[] itemArray0 = new Item[2];
      classWriter0.visitAnnotation("'H", false);
      classWriter0.typeTable = itemArray0;
      classWriter0.toByteArray();
      int int0 = classWriter0.addUninitializedType("", 13);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      Item item0 = classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      Item item1 = classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("db-", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(107, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      classWriter0.addUninitializedType("0", (-730));
      classWriter0.visitInnerClass("EnclosingMethod", "SourceFile", "", (-730));
      int int0 = classWriter0.addUninitializedType("0", (-730));
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("bQ", false);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf("bQ");
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitOuterClass("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitSource(">2f=a$l@", ">2f=a$l@");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Short short0 = new Short((short)3644);
      ClassWriter classWriter0 = new ClassWriter((-1171));
      classWriter0.newConstItem(short0);
      classWriter0.toByteArray();
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      annotationVisitor0.visit("", short0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6119));
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Xhu~lp~Eg@L", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6118));
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass((String) null, "<z", "m9Tqp K W?#m=B?5", 7);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      String[] stringArray0 = new String[0];
      classWriter0.visit(6052, (-764), "N2Md}p7LhX:B", "db-", "db-", stringArray0);
      classWriter0.newLong(1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6119));
      classWriter0.visitOuterClass("%%ktL8Q59DCN%'b*hmf", (String) null, "");
      Item item0 = classWriter0.newFloat(0.0F);
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      classWriter0.visitInnerClass("", "", "I", 3956);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      Type type0 = Type.getObjectType("<init>");
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource((String) null, "Ljava/lang/Synthetic!");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      classWriter0.newMethod("", "qEjazP", "qEjazP", true);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("qEjazP", bufferedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.BufferedInputStream@4c34d05d
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("i.[-X*<Bp", "i.[-X*<Bp");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
      
      Item item0 = classWriter0.newDouble(0.0);
      Item item1 = classWriter0.newDouble(0.0);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitInnerClass("RuntimeVisibleParameterAnnotations", "+^|8#>.eMtzEbS| ", "FwUe0_Q=^=XQva/:Z!k", 192);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(176, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.invalidFrames = true;
      classWriter0.addUninitializedType("h\u0007](aW", (-6099));
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
  public void test036()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("i.[-X*<Bp", "i.[-X*<Bp");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.invalidFrames = true;
      classWriter0.newLong((-6099));
      classWriter0.newLong((-6099));
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
  public void test038()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("d", false);
      classWriter0.toByteArray();
      Character character0 = Character.valueOf('N');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      classWriter0.visitAnnotation("", true);
      classWriter0.newLong((-730));
      classWriter0.newLong((-730));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-750));
      classWriter0.visitSource("d8+", "d8+");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("RIk hGqOMbe-", "'F,Oj#:0OdxF0wB{f", "H%=~%BGTrR", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("X", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      int int0 = classWriter0.newMethod("X", "X", "X", true);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newDouble(0.0);
      classWriter0.newDouble(0.0);
      classWriter0.visitInnerClass("InnerClasses", "InnerClasses", "^apyb,R$-Wpp?", 67);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newDouble(0.0);
      classWriter0.newDouble(0.0);
      classWriter0.visitOuterClass("I", (String) null, "I");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      classWriter0.visitInnerClass("", "SourceFile", "", (-730));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      int int0 = classWriter0.addType("t[+~(U\"S}SwR>`Q_>aG");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("Q", false);
      Item item0 = classWriter0.newFloat(0.0F);
      Item item1 = classWriter0.newFloat(0.0F);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-764), "'YMet", "", "8!zAsf+wL,^zyH,l\"!", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("d", false);
      classWriter0.newFloat(901.4F);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      Item item0 = classWriter0.newDouble((-3880.72422));
      classWriter0.visitOuterClass("=vMXr6Z!w6O", "h\u0007](aW", "");
      Item item1 = classWriter0.newDouble((-3880.72422));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("i.[-X*<Bp", "i.[-X*<Bp");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(2, 27);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("db-", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      Type type0 = Type.LONG_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("db-", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem("h\u0007](aW");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Short short0 = new Short((short)3644);
      ClassWriter classWriter0 = new ClassWriter((-1171));
      classWriter0.newConstItem(short0);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass("h\u0007](aW", (String) null, (String) null, 2);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6118));
      classWriter0.newMethodItem("vf:h`yS", "}&^)2EI`MdiT", "vf:h`yS", false);
      Type type0 = Type.FLOAT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-733));
      classWriter0.addUninitializedType("X80", (-733));
      classWriter0.addUninitializedType("X80", (-733));
      classWriter0.visitSource("RuntimeVisibleAnnotations", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      int int0 = classWriter0.addUninitializedType("0", (-730));
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("0", (-730));
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.newDouble((-3880.72422));
      classWriter0.visitAnnotation("h\u0007](aW", false);
      classWriter0.newDouble((-3880.72422));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("Q", false);
      classWriter0.newMethodItem("Q", "Q", "Q", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
      
      int int0 = classWriter0.newMethod("Q", "Q", "Q", false);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.invalidFrames = true;
      classWriter0.newConstItem("h\u0007](aW");
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
  public void test060()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitOuterClass("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitInnerClass("RutimVisibeAnnottions", "M?U^EjU}*ycz3C[yD", (String) null, (-1048));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitOuterClass("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitInnerClass("rh7P", "rh7P", "RutimVisibeAnnottions", 11);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-369), "zXO,-qPhKo;Nakd'vb", "zXO,-qPhKo;Nakd'vb", "", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(140, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6118));
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addType("$W[|'<W:WO");
      assertEquals(1, int0);
      
      Type type0 = Type.FLOAT_TYPE;
      int int1 = classWriter0.newConst(type0);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      Boolean boolean0 = new Boolean("3Aa");
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ByteVector byteVector0 = new ByteVector(9);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 5);
      classWriter0.visitOuterClass("RuntimeVisibleAnnotations", "", (String) null);
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
  public void test067()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.toByteArray();
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader");
      assertEquals("org.mockito.asm.ClassReader", string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6097));
      classWriter0.newConstItem("h\u0007](aW");
      classWriter0.visitSource("", "=&r#fD@2jnT/Y%IQ");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(105, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6087));
      classWriter0.newConstItem("h\u0007](aW");
      int int0 = classWriter0.newConst("h\u0007](aW");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(36, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
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
  public void test071()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.newConst(type0);
      classWriter0.visitOuterClass("?#reCWYU3Fa\"VyI ", (String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      Item item0 = classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      Item item1 = classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      assertSame(item1, item0);
      
      Item item2 = classWriter0.newConstItem("RutimVisibeAnnottions");
      assertNotSame(item2, item1);
      assertNotNull(item2);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 14);
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
  public void test074()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitAnnotation("+^|8#>.eMtzEbS| ", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(122, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitOuterClass("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitAnnotation(";", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(135, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.visitOuterClass("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-733));
      classWriter0.addUninitializedType("X80", (-733));
      classWriter0.addUninitializedType("X80", (-733));
      classWriter0.visitOuterClass("t[+~(U\"S}SwR>`Q_>aG", "org.mockito.asm.ClassWriter", "Synthetic");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      classWriter0.newConstItem("");
      int int0 = classWriter0.addType("t[+~(U\"S}SwR>`Q_>aG");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("db-", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      Item item0 = classWriter0.newFloat((-1.0F));
      Item item1 = classWriter0.newFloat((-1.0F));
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("db-", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      int int0 = classWriter0.addType(":QHL5a5a1fHa^mCo5");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Short short0 = new Short((short)3644);
      ClassWriter classWriter0 = new ClassWriter((-1171));
      classWriter0.newConstItem(short0);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitOuterClass("h\u0007](aW", "h\u0007](aW", "h\u0007](aW");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("bQ", false);
      Short short0 = new Short((short)8);
      annotationVisitor0.visit("bQ", short0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
      
      int int0 = classWriter0.newConst(short0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.newFieldItem("RutimVisibeAnnottions", "RutimVisibeAnnottions", "RutimVisibeAnnottions");
      classWriter0.visitSource("RutimVisibeAnnottions", ":I4#xY2IOBVkVy!8m");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Type type0 = Type.LONG_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      int int0 = classWriter0.addUninitializedType("0", (-730));
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("0", (-730));
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("db-", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      Item item0 = classWriter0.newFloat((-1.0F));
      Item item1 = classWriter0.newFloat((-1.0F));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("db-", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-764), (-764));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("Q", true);
      classWriter0.newMethodItem("Q", "Q", "Q", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
      
      int int0 = classWriter0.newMethod("Q", "Q", "Q", false);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitSource("Q", ";*T8Y5;o)x1tgS");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.newDouble((-3880.72422));
      classWriter0.newDouble((-3880.72422));
      classWriter0.visitAnnotation("h\u0007](aW", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      Byte byte0 = new Byte((byte) (-64));
      classWriter0.newConstItem(byte0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, 2);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 14);
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
  public void test094()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.newMethodItem("Q", "Q", "Q", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(41, byteArray0.length);
      
      int int0 = classWriter0.newMethod("Q", "Q", "Q", false);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.invalidFrames = true;
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConstItem(type0);
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
  public void test096()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.toByteArray();
      Character character0 = Character.valueOf('N');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6119));
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass((String) null, "", (String) null, 0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass("D!?gz#o$B[TS'6XO+", (String) null, ")V", 49);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.toByteArray();
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-764), "'YMet", "", "8!zAsf+wL,^zyH,l\"!", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      classWriter0.visitAnnotation("d", false);
      classWriter0.toByteArray();
      Type type0 = Type.CHAR_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("d", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("RuntimeVisibleAnnotations", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@1957830b
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("bQ", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6099));
      Item[] itemArray0 = new Item[2];
      classWriter0.visitAnnotation("'H", true);
      classWriter0.typeTable = itemArray0;
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      int int0 = classWriter0.addUninitializedType("", 13);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newDouble(0.0);
      classWriter0.newDouble(0.0);
      classWriter0.visitInnerClass("", "u'c3br[&&3", (String) null, 2);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 1);
      classWriter0.getCommonSuperClass("org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader");
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("org.mockito.asm.ClassReader", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@2906e630
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("i.[-X*<Bp", "i.[-X*<Bp");
      int int0 = classWriter0.addUninitializedType("", 2);
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-733));
      classWriter0.addUninitializedType("X80", (-733));
      classWriter0.addUninitializedType("X80", (-733));
      Item item0 = classWriter0.newConstItem("t[+~(U\"S}SwR>`Q_>aG");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-733));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitSource("RuntimeVisibleAnnotations", (String) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("EnclosingMethod", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@4ed9fc1e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
