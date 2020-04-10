/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:40:17 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassEmitter_ESTest extends ClassEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1606);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(1, "O26:F|cn1|\"r8", type0, (Object) null);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(10, "O26:F|cn1|\"r8", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@eb742400
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1606);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getType("RU5-EbJs,7hh!Bcd;T");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(7, "RU5-EbJs,7hh!Bcd;T", type0, "RU5-EbJs,7hh!Bcd;T");
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(1, "RU5-EbJs,7hh!Bcd;T", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@d49b1376
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      Type type0 = Type.getObjectType("fJebJ$");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(8, "fJebJ$", type0, object0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(8, "fJebJ$", type0, "fJebJ$");
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1606);
      Object object0 = new Object();
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(0, "RU5-EbJs,7hk!Bd;T", type0, object0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(0, "RU5-EbJs,7hk!Bd;T", type0, classWriter0);
      classEmitter_FieldInfo1.value = null;
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(classEmitter_FieldInfo1.equals((Object)classEmitter_FieldInfo0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(8, "]JbAqJ$", type0, object0);
      classEmitter_FieldInfo0.value = null;
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      Type type0 = Type.getObjectType("fJebJ$");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(8, "fJebJ$", type0, object0);
      Type type1 = Type.getObjectType("22zg-n5 ye.Ch");
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(8, "fJebJ$", type1, "fJebJ$");
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-1067), "q", (Type) null, (Object) null);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo((-1067), "", (Type) null, classEmitter_FieldInfo0);
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      Type type0 = Type.getObjectType("fJebJ$");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(8, "fJebJ$", type0, object0);
      boolean boolean0 = classEmitter_FieldInfo0.equals(type0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-2015), "gtwEB<-6@", (Type) null, "gtwEB<-6@");
      boolean boolean0 = classEmitter_FieldInfo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      // Undeclared exception!
      try { 
        classEmitter1.getFieldInfo((String) null);
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
      ClassWriter classWriter0 = new ClassWriter(1606);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("An.DUz_KHRU8t[4");
      classEmitter0.declare_field(6, "An.DUz_KHRU8t[4", type0, type0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = classEmitter0.getFieldInfo("An.DUz_KHRU8t[4");
      assertNotNull(classEmitter_FieldInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1606);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.DOUBLE_TYPE;
      classEmitter0.declare_field(2, "RU5-EbJs,7hh!Bcd;T", type0, "RU5-EbJs,7hh!Bcd;T");
      boolean boolean0 = classEmitter0.isFieldDeclared("RU5-EbJs,7hh!Bcd;T");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      boolean boolean0 = classEmitter1.isFieldDeclared((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1606);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("An.DUz_KHRU8t[4");
      classEmitter0.declare_field(6, "An.DUz_KHRU8t[4", type0, type0);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(9, "An.DUz_KHRU8t[4", type0, "An.DUz_KHRU8t[4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"An.DUz_KHRU8t[4\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-452));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class((-452), (-452), "RU5-EbJs,7h^Dk!BdQ;T", (Type) null, (Type[]) null, "RU5-EbJs,7h^Dk!BdQ;T");
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.visitMethod((-1913945662), "p>^=v@y=Q2+$s1", "p>^=v@y=Q2+$s1", "p>^=v@y=Q2+$s1", (String[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1606);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1606);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class(2, 2, "LocalVariableTable", (Type) null, (Type[]) null, "LocalVariableTable");
      classEmitter0.getStaticHook();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2368));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class((-2368), (-2368), "RU5-EbJs,7h^Dk!BdQ;T", (Type) null, (Type[]) null, "RU5-EbJs,7h^Dk!BdQ;T");
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
      Type type0 = Type.getObjectType("fJbAJ$");
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      classEmitter0.declare_field(4, "AnnotationDefault", type0, "fJbAJ$");
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1760));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      classEmitter1.begin_class((-1760), 1, "m(V", (Type) null, (Type[]) null, "m(V");
      classEmitter1.getStaticHook();
      classEmitter1.end_class();
      assertNotSame(classEmitter0, classEmitter1);
  }
}
