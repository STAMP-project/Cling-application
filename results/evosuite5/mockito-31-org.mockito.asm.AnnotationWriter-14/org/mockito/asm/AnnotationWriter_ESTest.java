/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 12:11:55 GMT 2019
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
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter[] annotationWriterArray0 = new AnnotationWriter[9];
      AnnotationWriter.put(annotationWriterArray0, 4, byteVector0);
      assertEquals(9, annotationWriterArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = new ByteVector(908);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      AnnotationWriter[] annotationWriterArray0 = new AnnotationWriter[2];
      annotationWriterArray0[1] = annotationWriter0;
      AnnotationWriter.put(annotationWriterArray0, 1, byteVector0);
      assertEquals(2, annotationWriterArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(934);
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, (ByteVector) null, 1);
      annotationWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      AnnotationVisitor annotationVisitor0 = annotationWriter0.visitArray("");
      assertNotSame(annotationWriter0, annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      AnnotationVisitor annotationVisitor0 = annotationWriter0.visitArray("");
      assertNotSame(annotationWriter0, annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(863);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      AnnotationVisitor annotationVisitor0 = annotationWriter0.visitAnnotation("<", "<");
      assertNotSame(annotationWriter0, annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(916);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      AnnotationVisitor annotationVisitor0 = annotationWriter0.visitAnnotation("", "");
      assertNotSame(annotationVisitor0, annotationWriter0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      annotationWriter0.visitEnum("", "", "");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(549);
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      annotationWriter0.visitEnum("l", "l", "l");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 908);
      Type type0 = Type.CHAR_TYPE;
      annotationWriter0.visit("[odB?ea,xH", type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 908);
      Short short0 = new Short((short) (-1719));
      annotationWriter0.visit("Class not found", short0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 908);
      Character character0 = new Character('n');
      annotationWriter0.visit("", character0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(934);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 934);
      Boolean boolean0 = Boolean.valueOf("T[j$EiAX\tw+");
      annotationWriter0.visit("T[j$EiAX\tw+", boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(934);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 934);
      Boolean boolean0 = Boolean.TRUE;
      annotationWriter0.visit("T[j$FiAX\tw+", boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 908);
      Byte byte0 = new Byte((byte) (-29));
      annotationWriter0.visit("xf3G", byte0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(549);
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      annotationWriter0.visit("", "");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 908);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("T[j$FiX\tw+", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(908);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 908);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("T[j$FiX\tw+", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
