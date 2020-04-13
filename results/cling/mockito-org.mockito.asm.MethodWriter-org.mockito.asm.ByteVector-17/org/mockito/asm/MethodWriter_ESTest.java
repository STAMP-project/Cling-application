/*

 * Tue Mar 03 14:38:22 GMT 2020
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
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, 4);
      String[] stringArray0 = classReader0.getInterfaces();
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.getSize();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "R4ntimeisibleAnnt)tions", "org.mockito.asm.Frame", "byte", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(75, (-131), 75, 1270, (-131)).when(classWriter0).newClass(anyString());
      doReturn(1044, 1044, (-2568), 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "{5:ZMXjs[usDDCyX", "{5:ZMXjs[usDDCyX", "", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("{5:ZMXjs[usDDCyX", "o}5-k~\"N_'=kFdbO*", stringArray0[2], label0, label0, (-131));
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3394));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "2kmTv#_/eoNkED_", "char", "2kmTv#_/eoNkED_", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("char", "char", "2kmTv#_/eoNkED_", label0, label0, (-1948));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(4196, 3584, 385, 70, 1315).when(classWriter0).newClass(anyString());
      doReturn(4196, 70).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "|K&\"IY", "q,:@f", "{5:ZMXjs[usDDCyX", stringArray0, false, false);
      methodWriter0.visitFrame(2, 2, stringArray0, 5, stringArray0);
      methodWriter0.visitFrame(959, 959, stringArray0, 267386880, stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[1];
      MethodWriter.getNewOffset(intArray0, intArray0, 1277, (-1));
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "4>mU>VDnr4JLt;", "Code", "4>mU>VDnr4JLt;", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      MethodWriter.getNewOffset(intArray0, intArray0, 1277, (-1));
      ClassWriter classWriter0 = new ClassWriter((-1498));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "char";
      stringArray0[1] = "boolean";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 127, "boolean", "char", "boolean", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3394));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Type", "org.mockito.asm.Type", "org.mockito.asm.Type", (String[]) null, false, false);
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      classReader0.accept((ClassVisitor) classWriter0, (-3394));
      methodWriter0.visitVarInsn(84, 1116);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = classReader0.getInterfaces();
      ClassWriter classWriter1 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "org.mockito.asm.Frae", "org.mockito.asm.ClassReader", "org.mockito.asm.Type", stringArray0, false, false);
      methodWriter0.getSize();
      // Undeclared exception!
      classReader0.accept((ClassVisitor) classWriter1, (-792));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 33;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter((-1666));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1990), "org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader", "Deprecated", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(34, (-2118), 34, (-2118), 267386880).when(classWriter0).newClass(anyString());
      doReturn(5, 1).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Exceptions";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Exceptions", "Exceptions", "Exceptions", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(0, 1, stringArray0, 69, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 33;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "a";
      stringArray0[1] = "org.mockito.asm.Type";
      stringArray0[2] = "SourceDebugExtension";
      stringArray0[3] = "LocalVariableTypeTable";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 68, "toString", "org.mockito.asm.Type", "W", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 33;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "a";
      stringArray0[1] = "org.mockito.asm.Type";
      stringArray0[2] = "SourceDebugExtension";
      stringArray0[3] = "LocalVariableTypeTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 33, "a", "a", "LocalVariableTypeTable", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 68, "toString", "org.mockito.asm.Type", "W", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1238), "Class not found", "Class not found", "Class not found", stringArray0, false, false);
      methodWriter0.visitInsn(3586);
      int int0 = methodWriter0.getSize();
      assertEquals(61, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3394));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Type", "org.mockito.asm.Type", "org.mockito.asm.Type", (String[]) null, false, false);
      methodWriter0.visitInsn(8);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-965), 2439);
      assertEquals(3404, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3394));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Type", "org.mockito.asm.Type", "org.mockito.asm.Type", (String[]) null, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (-1058));
      String[] stringArray0 = classReader0.getInterfaces();
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "org.mockito.asm.Frae", "org.mockito.asm.ClassReader", "org.mockito.asm.Type", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1238), "Class not found", "Class not found", "Class not found", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByteArray((byte[]) null, (-2163), 109);
      methodWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }
}
