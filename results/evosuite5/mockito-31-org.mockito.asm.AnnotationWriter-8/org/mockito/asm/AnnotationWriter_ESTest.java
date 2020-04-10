/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 11:05:42 GMT 2019
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
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter[] annotationWriterArray0 = new AnnotationWriter[8];
      AnnotationWriter.put(annotationWriterArray0, 1, byteVector0);
      assertEquals(8, annotationWriterArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1199));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      annotationWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1196));
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      AnnotationWriter[] annotationWriterArray0 = new AnnotationWriter[2];
      annotationWriterArray0[1] = annotationWriter0;
      AnnotationWriter.put(annotationWriterArray0, 1, byteVector0);
      assertEquals(2, annotationWriterArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter((ClassWriter) null, true, byteVector0, (ByteVector) null, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.put((ByteVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.AnnotationWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(393);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      AnnotationVisitor annotationVisitor0 = annotationWriter0.visitArray("A^Za#?2xIw/,vN88?");
      assertNotSame(annotationVisitor0, annotationWriter0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1296));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visitArray("A^Za#?2xIw/,vN88?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.AnnotationWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1317));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, (ByteVector) null, (ByteVector) null, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visitAnnotation("A^Za#?2xIw/,vN88?", "A^Za#?2xIw/,vN88?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.AnnotationWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1317));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visitAnnotation("A^Za#?2xIw/,vN88?", "A^Za#?2xIw/,vN88?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.AnnotationWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1199));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      annotationWriter0.visitEnum(".s.IFJDCS", ".s.IFJDCS", ".s.IFJDCS");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1192));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      annotationWriter0.visitEnum(".s.IFJDCS", ".s.IFJDCS", ".s.IFJDCS");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(393);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      Type type0 = Type.SHORT_TYPE;
      annotationWriter0.visit("", type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3541));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-3541));
      Short short0 = new Short((short)5);
      annotationWriter0.visit("?vV9Y=bGK", short0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1199));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      Character character0 = Character.valueOf('^');
      annotationWriter0.visit("&m'_", character0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1199));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      Boolean boolean0 = new Boolean(true);
      annotationWriter0.visit("?vV9Y=bGK", boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1170));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      Boolean boolean0 = Boolean.valueOf((String) null);
      annotationWriter0.visit((String) null, boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1109);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      Byte byte0 = Byte.decode("4");
      annotationWriter0.visit("4", byte0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1170));
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      annotationWriter0.visit("_Q$0eI", "_Q$0eI");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1199));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("?vV9Y=bGK", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
