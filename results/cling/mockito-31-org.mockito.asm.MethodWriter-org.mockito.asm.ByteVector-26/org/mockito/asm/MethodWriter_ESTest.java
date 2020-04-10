/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:30:40 GMT 2019
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
import org.mockito.asm.ClassAdapter;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      methodWriter0.visitVarInsn(8, 1169);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 65, "D^KWCj]q}", "D^KWCj]q}", "java/lang/Object", stringArray0, false, false);
      methodWriter0.visitIntInsn(8, 2);
      int int0 = methodWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "java/lang/Object";
      stringArray0[1] = "java/lang/Object";
      stringArray0[2] = "!\";wQtc,`vB1.=";
      stringArray0[3] = "java/lang/Object";
      stringArray0[4] = "java/lang/Object";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2229, "java/lang/Object", "java/lang/Object", "java/lang/Object", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.cr = classReader0;
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      methodWriter0.getSize();
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Label", "<init>", "org.mockito.asm.Label", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "{0+", "LoclVariableTable", "{0+", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "LoclVariableTable", "LoclVariableTable", "LoclVariableTable", (String[]) null, false, false);
      int int0 = methodWriter1.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(3, 3).when(classWriter0).newClass(anyString());
      doReturn(3, 3).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2533, "2uB)L6cpn", "2uB)L6cpn", "PGyGMPJTv9(<", stringArray0, true, true);
      methodWriter0.visitIincInsn(2533, 57);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = classReader0.getInterfaces();
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "printEnclosedStackTrace", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      methodWriter0.visitIincInsn(654, 248);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      methodWriter0.visitIincInsn(1091, 1977);
      methodWriter0.visitMaxs(8, 4);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 474, "FKk'XGf?o1)Fxk~1=N", "org.mockito.asm.Label", "FKk'XGf?o1)Fxk~1=N", stringArray0, false, false);
      methodWriter0.visitFieldInsn(2, "}%v@T#Ls9S95", "inSubroutine", "org.mockito.asm.Label");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      methodWriter0.visitFrame(2, 59, (Object[]) null, 8, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "{0+", "LoclVariableTable", "{0+", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(0, 527, (Object[]) null, 101, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Hw5SPnit|G43";
      stringArray0[1] = "Hw5SPnit|G43";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "grp|t} 3(HE", "org.mockito.asm.Label", "X", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      stringArray0[0] = "i+";
      stringArray0[1] = "StackMapTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 657, "StackMapTable", (String) null, "i+", stringArray0, false, false);
      methodWriter0.visitFrame(1, 2, stringArray0, 1990, stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[0];
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = 3;
      ClassReader classReader0 = new ClassReader("org.mockito.asm.MethodWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 3);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "LocalVariableTable", "LocalVariableTable", "LocalVariableTable", stringArray0, false, false);
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 1, 2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[4];
      MethodWriter.getNewOffset(intArray0, intArray0, (-2510), 0);
      ClassWriter classWriter0 = new ClassWriter(750);
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-236), "^cX_t$P", "{j>", "{j>", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "{0+", "LoclVariableTable", "{0+", (String[]) null, false, false);
      Label label0 = new Label();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "LoclVariableTable", "LoclVariableTable", "Tp&(_U.Q,ppJ4Q", (String[]) null, false, false);
      int[] intArray0 = new int[1];
      intArray0[0] = 26;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {26}, intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      int int0 = methodWriter0.getSize();
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(4458, 73, 4, 512, 512).when(classWriter0).newClass(anyString());
      doReturn(73, 4458, 73, 73, 55).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ".crQ+Rb\"`bh#C)", "2uB)L6cpn", "PGyGMPJTv9(<", stringArray0, true, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-325), "StackMap", "W)}gG!%_", "StackMap", stringArray0, true, true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1448911973));
      int[] intArray0 = new int[8];
      intArray0[1] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, 1973, 0);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1975, "grp|t} 3(HE", "O$AzX`[af2G-HI$Q", "oL90/#<>rmh ", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = 3;
      MethodWriter.getNewOffset(intArray0, intArray0, 3, 0);
      ClassReader classReader0 = new ClassReader("org.mockito.asm.MethodWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 3);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "LocalVariableTable", "LocalVariableTable", "LocalVariableTable", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(4458, 73, 4, 512, 512).when(classWriter0).newClass(anyString());
      doReturn(73, 4458, 73, 73, 55).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ".crQ+Rb\"`bh#C)", "2uB)L6cpn", "PGyGMPJTv9(<", stringArray0, true, true);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitLocalVariable("PGyGMPJTv9(<", "PGyGMPJTv9(<", "PGyGMPJTv9(<", label0, label0, 0);
      Label label1 = new Label();
      methodWriter0.visitLocalVariable("agVwEkbu_Xj1F", "2uB)L6cpn", "2uB)L6cpn", label1, label1, 73);
      assertFalse(label1.equals((Object)label0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitAnnotation("_ez#d{T{LvqH%9", true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("Deprecated", "xX~tr`35e^@nWd0", "", label0, label0, 12);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      classReader0.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 3434);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong((-1054L));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = classReader0.getInterfaces();
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "printEnclosedStackTrace", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(248);
      ByteVector byteVector1 = byteVector0.putLong((-1411L));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitAnnotation(";1e*ZKC{r6O|:{^B(T", false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      int int0 = methodWriter0.getSize();
      assertEquals(27, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 65, "D^KWCj]q}", "D^KWCj]q}", "java/lang/Object", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.Label";
      stringArray0[1] = "org.mockito.asm.Label";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1171, "org.mockito.asm.Label", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, (-2981));
      methodWriter0.visitFrame((-21), 2, stringArray0, 128, stringArray0);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2379, "org.mockito.asm.Label", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      methodWriter0.visitIincInsn((-21), (-1025));
      methodWriter0.visitFrame((-1133), 1, stringArray0, 2, stringArray0);
      ClassWriter classWriter1 = new ClassWriter(classReader0, (-905));
      ByteVector byteVector0 = classWriter1.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.Label";
      stringArray0[1] = "org.mockito.asm.Label";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1171, "org.mockito.asm.Label", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      methodWriter0.visitAnnotation("org.mockito.asm.Label", true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2255), "Deprecated", "boolean", "Deprecated", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = classReader0.getInterfaces();
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitAnnotationDefault();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "printEnclosedStackTrace", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(248);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("java/lang/Object", ";1e*ZKC{r6O|:{^B(T", (String) null, label0, label0, 15);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-325), "=H`BjPq%atcVso4", "W)}gG!%_", "=H`BjPq%atcVso4", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      String[] stringArray1 = new String[3];
      stringArray1[0] = "2uB)L6cpn";
      stringArray1[1] = "W)}gG!%_";
      stringArray1[2] = "=H`BjPq%atcVso4";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "W)}gG!%_", "*'PY0R$;-W\"", "StackMap", stringArray1, false, false);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.cr = classReader0;
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Label", "<init>", "org.mockito.asm.Label", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.cr = classReader0;
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "org.mockito.asm.Label", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(84);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3137), "java/lang/Object", "3wN-j8_u%a& ", "%T==D9u4BxQL", (String[]) null, false, false);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 2);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      ClassReader classReader1 = new ClassReader("java/lang/Object");
      classReader1.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 3434);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-325), "=H`BjPq%atcVso4", "W)}gG!%_", "=H`BjPq%atcVso4", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      String[] stringArray1 = new String[3];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "W)}gG!%_", "*'PY0R$;-W\"", "StackMap", stringArray1, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 65, "D^KWCj]q}", "D^KWCj]q}", "java/lang/Object", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      ClassWriter classWriter1 = new ClassWriter(classReader0, 114);
      ByteVector byteVector0 = classWriter1.pool;
      ByteVector byteVector1 = byteVector0.putLong(114);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(63, 127).when(classWriter0).newUTF8(anyString());
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "org.mockito.asm.Label", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      ClassWriter classWriter1 = new ClassWriter(2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter1);
      classReader0.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 2);
      assertEquals(33, classReader0.getAccess());
  }
}
