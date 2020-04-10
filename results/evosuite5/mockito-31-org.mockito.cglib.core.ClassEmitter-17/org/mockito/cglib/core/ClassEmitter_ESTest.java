/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 13:59:17 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassEmitter_ESTest extends ClassEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(2, "M:|!-K}IqQ", type0, (Object) null);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(2, "M:|!-K}IqQ", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@2a126715
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(1, "z!", type0, "z!");
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(2, "z!", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@e85
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(2, ">$BG", type0, ">$BG");
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(2, ">$BG", type0, classEmitter_FieldInfo0);
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(0, "He2-", type0, "L#%{y<!ng");
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(2147483645, "He2-", type0, (Object) null);
      classEmitter_FieldInfo1.access = 0;
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(classEmitter_FieldInfo1.equals((Object)classEmitter_FieldInfo0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(10, "Integer", type0, (Object) null);
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-941), "0%V[@", type0, "0%V[@");
      Type type1 = Type.CHAR_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo((-941), "0%V[@", type1, "0%V[@");
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(1, "L#%{y<!Dg", type0, type0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(1, "double doubleValue()", type0, "L#%{y<!Dg");
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(4, "u?o^JS[IVEN", type0, type0);
      boolean boolean0 = classEmitter_FieldInfo0.equals("u?o^JS[IVEN");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-1311), ".<q", (Type) null, (Object) null);
      boolean boolean0 = classEmitter_FieldInfo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      // Undeclared exception!
      try { 
        classEmitter0.getFieldInfo("t\"VL1G3K!6hqpUX*M4");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.VOID_TYPE;
      classEmitter0.declare_field(2, "C.O=K", type0, "");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = classEmitter0.getFieldInfo("C.O=K");
      assertNotNull(classEmitter_FieldInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.VOID_TYPE;
      classEmitter0.declare_field(2, "", type0, "");
      boolean boolean0 = classEmitter0.isFieldDeclared("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      boolean boolean0 = classEmitter0.isFieldDeclared(",x082{aRtME7c");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("Field \"", false);
      Type type0 = Type.VOID_TYPE;
      classEmitter0.declare_field((-873), "", type0, "");
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(1, "", type0, annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(1, (-4436), "\" has been declared differently", "22F&]L^'Q$e;}", "\" has been declared differently", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-757));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(438, 438, "", "", "", stringArray0);
      classEmitter0.begin_static();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(1, 1, "6?", "6?", "6?", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-757));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(438, 438, "", "", "", stringArray0);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(1, (-4436), "\" has been declared differently", "22F&]L^'Q$e;}", "\" has been declared differently", stringArray0);
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
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("()V");
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      classEmitter0.begin_class(3, 0, "_cKevI9{8:e)lXsW;[", type0, typeArray0, "2v;4D;`");
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1202));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[5];
      // Undeclared exception!
      try { 
        classEmitter0.begin_class(2, 1, "\" has been declared differently", (Type) null, typeArray0, "\" has been declared differently");
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
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      classEmitter0.declare_field(7, "", type0, "L#%{y<!Dg");
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.visitMethod(874, "", "PZ\"Hw+S1wi#?Kj(tw", "", (String[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      // Undeclared exception!
      try { 
        classEmitter1.end_class();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }
}
