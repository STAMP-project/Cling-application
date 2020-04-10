/*

 * Tue Mar 03 14:31:25 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, true, true);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putLong((-840L));
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "XTgtc", "fUH4Mq)$%o(x@e\"", "java/lang/Object", stringArray0, true, false);
      methodWriter0.visitFieldInsn(29, "StackMap", "java/lang/Object", "Signature");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "-K5WuirHBjXA?", "Deprecated", "XTgtc", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.accept((ClassVisitor) classWriter0, 168);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      methodWriter0.visitIincInsn(3386, 50);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putLong((-840L));
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 19);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 59, "\"XA", "java/lang/Object", "[CoRY!=@", stringArray0, false, false);
      methodWriter0.visitFrame(689, 4899, stringArray0, 1, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[9];
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(9, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-UHRXz:<8/~A#";
      stringArray0[1] = "-UHRXz:<8/~A#";
      stringArray0[2] = "EO";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 218, "EO", "-UHRXz:<8/~A#", "EO", stringArray0, false, false);
      methodWriter0.visitFieldInsn(85, "RuntimeVisibleAnnotations", "zfV4Sr9;^<PxORA", "-UHRXz:<8/~A#");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1198);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeVisibleAnnotations", "T=JFr!]])kF}Su", "|f.VhC5&!Bz~oHA%", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(4760, "T=JFr!]])kF}Su", "|f.VhC5&!Bz~oHA%", "registerNatives");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1906);
      classReader0.accept((ClassVisitor) classWriter0, 1906);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      int int0 = methodWriter0.getSize();
      assertEquals(46, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "XTgtc";
      stringArray0[1] = "{B#3|Zi_";
      stringArray0[2] = "XTgtc";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 81, "java/lang/Object", "fUH4Mq)$%o(x@e\"", "fUH4Mq)$%o(x@e\"", stringArray0, false, false);
      methodWriter0.visitLocalVariable("fUH4Mq)$%o(x@e\"", "java/lang/Object", "RuntimeVisibleParameterAnnotations", label0, label0, 30);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      Label label0 = new Label();
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1327), "value ", "{B#3|Zi_", "{B#3|Zi_", (String[]) null, false, false);
      methodWriter0.visitLocalVariable("RuntimeVisibleParameterAnnotations", "value ", "java/lang/Object", label0, label0, 78);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[3];
      MethodWriter.getNewOffset(intArray0, intArray0, 0, (-2139));
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefau}lt", "0.J5;]", "StackMap", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1198);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "T=JFr!]])kF}Su";
      stringArray0[1] = "ct'<,A&dI#1nyd}eKP$";
      stringArray0[2] = "RuntimeVisibleAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2087), "RuntimeVisibleAnnotations", "T=JFr!]])kF}Su", "ct'<,A&dI#1nyd}eKP$", stringArray0, false, true);
      methodWriter0.visitFieldInsn(2, "java/lang/String", "java/lang/Object", "ct'<,A&dI#1nyd}eKP$");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-2050302571), (-2050302571)).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "LocalVariableTypeTable", "LocalVariableTypeTable", "LocalVariableTypeTable", (String[]) null, false, false);
      methodWriter0.visitFrame(2, 122, (Object[]) null, (-2050302571), (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[3];
      MethodWriter.getNewOffset(intArray0, intArray0, 0, (-2139));
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "LineNumberTable", "LineNumberTable", "Class not found", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "java/lang/Object", "java/lang/Object", "E*3tJ", stringArray0, false, false);
      methodWriter0.visitVarInsn(927, 68);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1906);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 10);
      ByteVector byteVector0 = new ByteVector(3);
      ByteVector byteVector1 = byteVector0.putLong(491L);
      ByteVector byteVector2 = byteVector0.put11(23, 1);
      assertSame(byteVector2, byteVector1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(27, 27).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[R,R", "[R,R", "[R,R", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.putInt(369);
      ByteVector byteVector1 = byteVector0.put11(117, 1191);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(251);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 218, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "-UHRXz:<8/~A#", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "LocalVariableTable", "-UHRXz:<8/~A#", "-UHRXz:<8/~A#", (String[]) null, false, false);
      methodWriter0.visitVarInsn(1245, 478);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-32768), 285212675).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, (String) null, (String) null, "Ljava/lang/Synthetic;", stringArray0, false, false);
      int[] intArray0 = new int[3];
      intArray0[2] = 285212675;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2, 285212675);
      assertEquals(570425348, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[1] = "java/lang/Object";
      stringArray0[2] = "LocalVariableTable";
      stringArray0[3] = "java/lang/Object";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "LocalVariableTable", "java/lang/Object", "LocalVariableTable", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1906);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 10);
      int[] intArray0 = new int[7];
      intArray0[1] = 927;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-757), 294);
      assertEquals(1051, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, true, false);
      ClassWriter classWriter1 = new ClassWriter(927);
      classReader0.accept((ClassVisitor) classWriter1, 262144);
      assertEquals(33, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1906);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 10);
      ByteVector byteVector0 = new ByteVector(82);
      classWriter0.firstMethod.put(byteVector0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, false, true);
      classReader0.accept((ClassVisitor) classWriter0, 43);
      MethodWriter methodWriter1 = methodWriter0.next;
      ByteVector byteVector0 = new ByteVector(26);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, false, true);
      int int0 = classWriter0.newField("c", "java/lang/Object", "float");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(4);
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 59, "\"XA", "java/lang/Object", "[CoRY!=@", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 689, "\"XA", "{LDP@{[Sq|Gmb", "\"XA", stringArray0, false, false);
      ByteVector byteVector1 = byteVector0.putLong((-66L));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1906);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 10);
      classWriter0.firstMethod.visitVarInsn(2, 118);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, true, false);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 2);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1824, "java/lang/Object", "java/lang/Object", "Deprecated", stringArray0, false, false);
      methodWriter0.visitInsn(2);
      int int0 = methodWriter0.getSize();
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "RuntimeInvisibleAnnotations";
      stringArray0[1] = "4^,jWgYkWw7|eOk ";
      stringArray0[2] = "X|Ek<P~ny#0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 48, "LineNumberTable", "", "LineNumberTable", stringArray0, false, false);
      classWriter0.toByteArray();
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 3, "LineNumberTable", "hM2/(C.mO\"AyEt#H", "hM2/(C.mO\"AyEt#H", stringArray1, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1370);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 107, "!m:TSb", "8g ky`", "T=JFr!]])kF}Su", stringArray0, false, false);
      methodWriter0.visitIincInsn(0, 0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, true, true);
      methodWriter0.visitIincInsn(927, 2);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, true, false);
      ClassWriter classWriter1 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter1, 330);
      assertEquals(927, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "XTgtc";
      stringArray0[1] = "{B#3|Zi_";
      stringArray0[2] = "XTgtc";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 81, "java/lang/Object", "fUH4Mq)$%o(x@e\"", "fUH4Mq)$%o(x@e\"", stringArray0, true, false);
      methodWriter0.visitLocalVariable("fUH4Mq)$%o(x@e\"", "java/lang/Object", "RuntimeVisibleParameterAnnotations", label0, label0, 30);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.newField("n", "W^*7r!s4*}Je", "java/lang/Object");
      classReader0.accept((ClassVisitor) classWriter0, 168);
      assertEquals(927, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, false, true);
      classReader0.accept((ClassVisitor) classWriter0, 43);
      methodWriter0.visitMethodInsn(26, "float", "java/lang/Object", "wGL=\"dzH?Mu3<_r?9");
      ByteVector byteVector0 = new ByteVector(26);
      ByteVector byteVector1 = byteVector0.put11(32, 2621);
      byteVector0.put12(26, (-1503));
      methodWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1906);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 10);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitIincInsn(2, (-757));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, true, false);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 19);
      methodWriter0.visitIincInsn((-2343), 927);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "Xgtc", "fUH4Mq)$%o(xe\"", "java/lang/Object", stringArray0, true, false);
      classReader0.accept((ClassVisitor) classWriter0, 330);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.accept((ClassVisitor) classWriter0, 168);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      int int0 = methodWriter0.getSize();
      assertEquals(46, int0);
  }
}
