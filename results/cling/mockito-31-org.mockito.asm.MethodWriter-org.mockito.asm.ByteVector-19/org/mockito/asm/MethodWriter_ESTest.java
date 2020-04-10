/*

 * Tue Mar 03 14:30:56 GMT 2020
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
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-967), 0);
      assertEquals(967, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(256);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2946), "$yE#qw |z1c", ":):C47d_t", "$yE#qw |z1c", (String[]) null, false, true);
      methodWriter0.visitMethodInsn(2853, "_\"SY`V.s=\"h$*{zV!", "~n'Kpw", "~n'Kpw");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1329), "AnnotationDefault", "r'p9KopdDL", "r'p9KopdDL", (String[]) null, false, false);
      methodWriter0.visitVarInsn(1048575, (-1329));
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 28, "<init>", "}K+b\"j=|hl^$MRS", "<init>", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(197);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "&zW{%]@,a7|4QvqX";
      stringArray0[1] = "&zW{%]@,a7|4QvqX";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4077, "&zW{%]@,a7|4QvqX", "&zW{%]@,a7|4QvqX", "&zW{%]@,a7|4QvqX", stringArray0, false, false);
      methodWriter0.visitVarInsn((-1351), 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(256);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2946), "$yE#qw |z1c", ":):C47d_t", "$yE#qw |z1c", (String[]) null, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 256, "StacktapTable", ":):C47d_t", "1m|d3u'kU57yNjHM0", (String[]) null, false, false);
      methodWriter0.next.visitIincInsn(1514, 1);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "float", "MZK$mE]A", "MZK$mE]A", stringArray0, false, false);
      Item item0 = classWriter0.newLong(0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(197);
      Item item0 = classWriter0.newLong(3428);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "&zW{%]@,a7|4QvqX";
      stringArray0[1] = "&zW{%]@,a7|4QvqX";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4077, "&zW{%]@,a7|4QvqX", "&zW{%]@,a7|4QvqX", "&zW{%]@,a7|4QvqX", stringArray0, false, false);
      String string0 = "Oh?[,Ts\\u%B";
      methodWriter0.visitFieldInsn(1563, string0, "InnerClasses", "&zW{%]@,a7|4QvqX");
      methodWriter0.visitAnnotationDefault();
      classWriter0.toByteArray();
      Item item1 = classWriter0.newLong(4294967295L);
      assertFalse(item1.equals((Object)item0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "t=>^7XNr1oot%NyR|Y";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3019), ";L&-ZT+C}\"", "Signature", "Signature", stringArray0, false, false);
      methodWriter0.visitMethodInsn((-1620), "{^Kg#ibY{", ";L&-ZT+C}\"", "[]");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Label label0 = new Label();
      int[] intArray0 = new int[9];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(104);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Deprecated";
      stringArray0[1] = "Deprecated";
      stringArray0[2] = "$*~S<X";
      stringArray0[3] = "r$";
      stringArray0[4] = "Exceptions";
      stringArray0[5] = "r$";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Deprecated", "Deprecated", "$*~S<X", stringArray0, false, false);
      methodWriter0.visitLdcInsn("4b1>X_a0o.");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1329), "AnnotationDefault", "r'p9KopdDL", "r'p9KopdDL", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(2, "<init>", "}K+b\"j=|hl^$MRS", "r'p9KopdDL");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ":):z4q7dt", ":):z4q7dt", ":):z4q7dt", stringArray0, true, false);
      methodWriter0.visitFrame(74, 74, stringArray0, 126, stringArray0);
      methodWriter0.visitFrame(2, 74, stringArray0, 160, stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2), "hC!icRerR5", "ava/lang/Synthetic;", "hC!icRerR5", stringArray0, false, false);
      methodWriter0.visitInsn(1);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "hC!icRerR5";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 46, "I-T3Zn>f_w", "java/lang/Throwable", "=lw &QJ:Ar<.fr", stringArray1, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[15];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ":):z7qt", ":):z7qt", ":):z7qt", stringArray0, true, true);
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, ":):z7qt");
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(3441, 126);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, 2, 0);
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-128), "[]", "StackMap", "}5d8#!g)<X4Pv-", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1048575, 1048575).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1321), "ALqz=P6aQ#Fh", "ALqz=P6aQ#Fh", "ALqz=P6aQ#Fh", stringArray0, false, false);
      int[] intArray0 = new int[1];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2, (-1321));
      assertEquals((-1323), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = ");XT0h}S=X5";
      stringArray0[2] = ");XT0h}S=X5";
      stringArray0[3] = ");XT0h}S=X5";
      stringArray0[4] = ");XT0h}S=X5";
      stringArray0[5] = ");XT0h}S=X5";
      stringArray0[6] = ":):C4q7dt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, ":):C4q7dt", ":):C4q7dt", ");XT0h}S=X5", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitIincInsn((-1632), 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1632
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "float", ":):C4q7dt", "float", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(0, 1751);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = ");XT0h}S=X5";
      stringArray0[2] = ");XT0h}S=X5";
      stringArray0[3] = ");XT0h}S=X5";
      stringArray0[4] = ");XT0h}S=X5";
      stringArray0[5] = ");XT0h}S=X5";
      stringArray0[6] = ":):C4q7dt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, ":):C4q7dt", ":):C4q7dt", ");XT0h}S=X5", stringArray0, true, true);
      methodWriter0.visitFieldInsn(4, "org.mockito.asm.Edge", "", "");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn((-128), 3048).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "}5d8#!g)<X4Pv-", "}5d8#!g)<X4Pv-", "$aE&D\"cr|<%", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(3048, (-1654));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 46, "I-T3Zn>f_w", ":):C4q7dt", "I-T3Zn>f_w", (String[]) null, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(1488, ":):C4q7@t", "'f|st9I_e", "{\"FHptr6");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(40);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "ALqz=P6aQ#=h", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "ALqz=P6aQ#=h", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 40, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "ALqz=P6aQ#=h", "vYc~`", stringArray0, false, false);
      methodWriter1.visitVarInsn(2, 1);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 46, "I-T3Zn>f_w", ":):C4q7dt", "I-T3Zn>f_w", (String[]) null, true, false);
      methodWriter0.visitFieldInsn((-967), ":):C4q7dt", "1m|d3u'kU57yNjHM0", "Jw #U]>3^p\"],6tm-");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 40, "1m|d3u'kU57yNjHM0", "Jw #U]>3^p\"],6tm-", ":):z4q7dt", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-328), "<init>", "d(", (String) null, (String[]) null, false, false);
      methodWriter0.visitVarInsn(1, 171);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1092, "<init>", "{AV.f@", "int", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "L6;K(}.KzC", "^Q;GGF", "java/an/Throwable", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 2, (Object[]) null, 2, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "=IwAAi~:FW9\"mJ,XaI}", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-3107), stringArray0, 567, stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3028, "ava/lang/Synthetic;", "ava/lang/Synthetic;", (String) null, stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "ava/lang/Synthetic;", "[VYtnC", "Deprecated", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, 341);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-687));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "NS)A]G*}ov>wqZ`t";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = "ALl_zLhma;";
      stringArray0[3] = "NS)A]G*}ov>wqZ`t";
      stringArray0[4] = "ALl_zLhma;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-967), "LineNumberTable", "LineNumberTable", "NS)A]G*}ov>wqZ`t", stringArray0, false, false);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-694), (String) null, "StackMapTable", "ALl_zLhma;", stringArray0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "ALqz=P6aQ#=h", "value ", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[2];
      MethodWriter.getNewOffset(intArray0, intArray0, (-967), (-967));
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 64, ":):C4q7dt", ":):C4q7dt", ");XT0h}S=X5", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(40);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "ALqz=P6aQ#=h", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "ALqz=P6aQ#=h", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "I-T3Zn>f_w", "7ZW", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1048575, 1048575).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[&Z/RPmbWu?Z{", "cm)2-@X`{4D#\"|,[|.", "o=05vPR\")X-8293n-i", stringArray0, false, true);
      methodWriter0.visitInsn(2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3028, "ava/lang/Synthetic;", "ava/lang/Synthetic;", (String) null, stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(18);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ":):z4q7dt", ":):z4q7dt", ":):z4q7dt", stringArray0, true, false);
      methodWriter0.visitVarInsn(126, 74);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ":):C4q7dt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", ":):C4q7dt", ":):C4q7dt", stringArray0, true, true);
      methodWriter0.visitInsn(15);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-471), ";L&-ZT+C}\"", ";L&-ZT+C}\"", "uBI", (String[]) null, false, false);
      methodWriter0.classReaderOffset = 112;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ":):z4q7dt", ":):z4q7dt", ":):z4q7dt", stringArray0, true, false);
      methodWriter0.visitVarInsn(2, (-237));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-328), "<init>", "d(", (String) null, (String[]) null, false, false);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1092, "<init>", "{AV.f@", "int", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "float", "MZK$mE]A", "MZK$mE]A", stringArray0, false, false);
      methodWriter0.visitMaxs((-967), (-381));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(40);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 104, "Dc-,p|bqz~O664", "cm)2-@X`{4D#\"|,[|.", "k=5du^7[\"h", stringArray0, true, false);
      methodWriter0.visitVarInsn(2, 1519);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2), "hC!icRerR5", "ava/lang/Synthetic;", "hC!icRerR5", stringArray0, false, false);
      methodWriter0.visitInsn(1);
      methodWriter0.visitFrame((-2), 8, stringArray0, 141, stringArray0);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "hC!icRerR5";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 46, "I-T3Zn>f_w", "java/lang/Throwable", "=lw &QJ:Ar<.fr", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "t=>^7XNr1oot%NyR|Y";
      stringArray0[1] = "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII";
      stringArray0[2] = "long";
      stringArray0[3] = "InnerClasses";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3428, "Deprecated", "`:m)8^sgDs`", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, false, true);
      methodWriter0.visitMethodInsn(0, "Deprecated", "long", "InnerClasses");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3441);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-471), "{AV.f@", "{AV.f@", "uBI", (String[]) null, false, false);
      classWriter0.newLong(3582);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-471), "(v\u0000xTTg+&*L/=bZ", "(v\u0000xTTg+&*L/=bZ", "{AV.f@", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3441);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-471), "{AV.f@", "{AV.f@", "uBI", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-5), "uBI", "C,", "uBI", (String[]) null, false, false);
      classWriter0.toByteArray();
      classWriter0.newLong(3582);
      MethodWriter methodWriter2 = null;
      try {
        methodWriter2 = new MethodWriter(classWriter0, (-5), "{AV.f@", "uBI", "C,", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-471), "{AV.f@", "{AV.f@", "uBI", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLineNumber(2049, label0);
      methodWriter0.visitVarInsn(28, 6);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2445, "{AV.f@", "L1870849984", "hR|jk^^Vq", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = ");XT0h}S=X5";
      stringArray0[2] = ");XT0h}S=X5";
      stringArray0[3] = ");XT0h}S=X5";
      stringArray0[4] = ");XT0h}S=X5";
      stringArray0[5] = ");XT0h}S=X5";
      stringArray0[6] = ":):C4q7dt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, ":):C4q7dt", ":):C4q7dt", ");XT0h}S=X5", stringArray0, true, true);
      methodWriter0.visitVarInsn(24, 0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(256);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2946), "StacktapTable", ":):C47d_t", "StacktapTable", (String[]) null, false, true);
      methodWriter0.visitVarInsn(174, 2);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-2455), (String) null, "Signature", "Signature", (String[]) null, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2), "hC!icRerR5", "ava/lang/Synthetic;", "hC!icRerR5", stringArray0, false, false);
      methodWriter0.visitInsn(1);
      methodWriter0.visitFrame((-2), 8, stringArray0, 141, stringArray0);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      methodWriter0.visitMethodInsn(2990, "d_,'C'", "hC!icRerR5", "#RAhlV:*teo$g");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3453);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1500), "MZK$mE]A", "MZK$mE]A", "1yt=8pDaJu", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("1yt=8pDaJu", "MZK$mE]A", "MZK$mE]A", label0, label0, 102);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "float", "MZK$mE]A", "MZK$mE]A", stringArray0, false, false);
      methodWriter0.visitLdcInsn("MZK$mE]A");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      ByteVector byteVector0 = new ByteVector(11);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 21, "I-T3Zn>f_w", ":):C4q7dt", "org.mockito.asm.MethodWriter", (String[]) null, true, true);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(256);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2946), "StacktapTable", ":):C47d_t", "StacktapTable", (String[]) null, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 256, "StacktapTable", ":):C47d_t", "1m|d3u'kU57yNjHM0", (String[]) null, false, false);
      methodWriter0.visitMaxs(3295, 2);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader", "b$aO", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, (-1131));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(40);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "ALqz=P6aQ#=h", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "ALqz=P6aQ#=h", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, 1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ":):z4q7dt", ":):z4q7dt", ":):z4q7dt", stringArray0, true, false);
      methodWriter0.visitIincInsn(74, 1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(94).when(classWriter0).newClass(anyString());
      doReturn(94, 94).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ":):z4q7dt", ":):z4q7dt", ":):z4q7dt", stringArray0, true, false);
      methodWriter0.visitVarInsn(12, 1049);
      methodWriter0.visitIincInsn(70, (-1075));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2), "hC!icRerR5", "ava/lang/Synthetic;", "hC!icRerR5", stringArray0, false, false);
      methodWriter0.visitInsn(1);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 8, "hC!icRerR5", "ava/lang/Synthetic;", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2), "hC!icRerR5", "ava/lang/Synthetic;", "hC!icRerR5", stringArray0, false, false);
      methodWriter0.visitInsn(1);
      methodWriter0.visitFrame((-2), 8, stringArray0, 141, stringArray0);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 8, "hC!icRerR5", "ava/lang/Synthetic;", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(197);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "&zW{%]@,a7|4QvqX";
      stringArray0[1] = "&zW{%]@,a7|4QvqX";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4077, "&zW{%]@,a7|4QvqX", "&zW{%]@,a7|4QvqX", "&zW{%]@,a7|4QvqX", stringArray0, false, false);
      methodWriter0.visitMaxs(6, 267386880);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ":):z4q7dt", ":):z4q7dt", ":):z4q7dt", stringArray0, true, false);
      methodWriter0.visitMaxs(3441, 126);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "float", "MZK$mE]A", "MZK$mE]A", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "AnnotationDeault", "AnnotationDeault", "AnnotationDeault", (String[]) null, false, false);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1480, "GEaAk@@Nba", "j\"qU", "j\"qU", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(2589);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "W";
      stringArray0[1] = "W";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1894), "W", "W", "W", stringArray0, false, false);
      methodWriter0.visitLocalVariable("W", "W", "7UVU{ud*=", label0, label0, 1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74, 74, 745, (-2056)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 46, "org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(0);
      byteVector0.put12(120, 46);
      methodWriter0.put(byteVector0);
      ClassReader classReader0 = new ClassReader("org.mockito.asm.ClassReader");
      ClassWriter classWriter1 = new ClassWriter(117);
      classReader0.accept((ClassVisitor) classWriter1, 117);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(40);
      classWriter0.newFieldItem("(v\u0000xTTg+&*L/=bZ", "ALqz=P6aQ#=h", "(v\u0000xTTg+&*L/=bZ");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 104, "ALqz=P6aQ#=h", "$aE&D\"cr|<%", "$aE&D\"cr|<%", stringArray0, false, false);
      methodWriter0.visitLdcInsn(classWriter0.COMPUTE_MAXS);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(256);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2946), "StacktapTable", ":):C47d_t", "StacktapTable", (String[]) null, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 256, "StacktapTable", ":):C47d_t", "1m|d3u'kU57yNjHM0", (String[]) null, false, false);
      methodWriter0.visitIincInsn(1516, 1);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 46, "I-T3Zn>f_w", ":):C4q7dt", "I-T3Zn>f_w", (String[]) null, true, false);
      methodWriter0.visitIincInsn((-3468), (-3468));
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-2233), "org.mockito.asm.MethodWriter", "RuntimeVisibleAnnotations", "I-T3Zn>f_w", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      classWriter0.newInteger(3295);
      classWriter0.newFieldItem(":):C4q7dt", "I-T3Zn>f_w", "1m|d3u'kU57yNjHM0");
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-2991), "7UVU{ud*=", "R'8]v2", "LocalVariableTypeTable", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3428);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-471), "{AV.f@", "{AV.f@", "uBI", (String[]) null, false, false);
      methodWriter0.getSize();
      Label label0 = new Label();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2445, "{AV.f@", "L1870849984", "hR|jk^^Vq", (String[]) null, false, false);
      methodWriter1.visitTryCatchBlock(label0, label0, label0, "I,&\"iz-At!@");
      methodWriter1.visitMethodInsn(777, "hR|jk^^Vq", "iTD&2,@_G,^ZWhN[s", "uBI");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(74).when(classWriter0).newClass(anyString());
      doReturn(74, 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 74, "org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(0, 1, stringArray0, 0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int[] intArray0 = new int[2];
      MethodWriter.getNewOffset(intArray0, intArray0, (-967), (-967));
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-967), "float", "ava/lang/Synthetic;", "float", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 0, "float", ":):C4q7dt", "float", stringArray0, false, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }
}
