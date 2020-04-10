/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 13:57:39 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassEmitter_ESTest extends ClassEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3260));
      Type type0 = Type.BOOLEAN_TYPE;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 2);
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(8, "classInfo is null! ", type0, bufferedInputStream0);
      // Undeclared exception!
      try { 
        classWriter0.newConst(classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@9fe72640
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getObjectType("9Tyq{h_Ri");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(10, "9Tyq{h_Ri", type0, classEmitter0);
      classEmitter_FieldInfo0.access = 1;
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(1, "9Tyq{h_Ri", type0, "Ljava/lang/String;");
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getObjectType("9Tyq{h_Ri");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(10, "9Tyq{h_Ri", type0, classEmitter0);
      classEmitter_FieldInfo0.access = 1;
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(1, "9Tyq{h_Ri", type0, "Ljava/lang/String;");
      classEmitter_FieldInfo1.value = null;
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(classEmitter_FieldInfo1.equals((Object)classEmitter_FieldInfo0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      classEmitter0.setTarget(classEmitter0);
      classEmitter0.declare_field(7, "9y{h_R", type0, (Object) null);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(212, "Unknown local variable ", type0, type0);
      classEmitter_FieldInfo0.name = "org.mockito.cglib.core.ClassEmitter$FieldInfo";
      Object object0 = new Object();
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(212, "Unknown local variable ", type0, object0);
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getObjectType("9Tyq{h_Ri");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-388), "9Tyq{h_Ri", type0, classEmitter0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(10, "9Tyq{h_Ri", type0, classEmitter0);
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
      assertFalse(classEmitter_FieldInfo1.equals((Object)classEmitter_FieldInfo0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-1968526675), "XnKzmaQg(tw{", type0, (Object) null);
      boolean boolean0 = classEmitter_FieldInfo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      // Undeclared exception!
      try { 
        classEmitter0.getFieldInfo("F");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter((-1932735280));
      classEmitter0.setTarget(classWriter0);
      Type type0 = Type.INT_TYPE;
      classEmitter0.declare_field(2867, "", type0, type0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = classEmitter0.getFieldInfo("");
      boolean boolean0 = classEmitter_FieldInfo0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3260));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.LONG_TYPE;
      classEmitter0.declare_field((-3260), ".s.IFJDCS", type0, ".s.IFJDCS");
      boolean boolean0 = classEmitter0.isFieldDeclared(".s.IFJDCS");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      boolean boolean0 = classEmitter1.isFieldDeclared("9Tyq{h_Ri");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      Type type0 = Type.getObjectType("Ljava/lang/String;");
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(5, "9Tyq{h_Ri", type0, "Ljava/lang/String;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"9Tyq{h_Ri\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getObjectType("9Tyq{h_Ri");
      classEmitter0.setTarget(classEmitter0);
      classEmitter0.declare_field(5, "9Tyq{h_Ri", type0, "Ljava/lang/String;");
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter(177);
      classEmitter0.setTarget(classWriter0);
      classEmitter0.visit(177, 598, "", "", "org.mockito.cglib.core.ClassEmitter", (String[]) null);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.begin_static();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter(177);
      classEmitter0.setTarget(classWriter0);
      classEmitter0.visit(1, 1, "", "", "", (String[]) null);
      classEmitter0.begin_static();
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter(177);
      classEmitter0.setTarget(classWriter0);
      classEmitter0.visit(1, 1, "", "", "", (String[]) null);
      classEmitter0.getStaticHook();
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter(177);
      classEmitter0.setTarget(classWriter0);
      classEmitter0.visit(1, 1, "", "", "", (String[]) null);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter(177);
      classEmitter0.setTarget(classWriter0);
      classEmitter0.visit(177, 598, "", "", "org.mockito.cglib.core.ClassEmitter", (String[]) null);
      // Undeclared exception!
      try { 
        classEmitter0.getStaticHook();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // static hook is invalid for this class
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Type type0 = Type.getObjectType("9Tyq{h_Ri");
      ClassWriter classWriter0 = new ClassWriter((-1890));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      classEmitter0.begin_class(5, 1460, "9Tyq{h_Ri", type0, typeArray0, "9Ty+Nb{h_bKRi");
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      // Undeclared exception!
      try { 
        classEmitter0.begin_class(474, 474, "(||;||}@?MEV>y8", (Type) null, typeArray0, "(||;||}@?MEV>y8");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        classEmitter0.visitMethod(10, (String) null, (String) null, "org.mockito.cglib.core.TypeUtils", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.Signature", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.getSuperType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.visitEnd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }
}
