/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:39:07 GMT 2019
 */

package org.mockito.asm.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.ASMifierMethodVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(48, 256, "ACC_PRIVATE", "", "", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(131072);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(mockPrintWriter0);
      aSMifierClassVisitor0.appendAccess(4096);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(2048);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("(Eh}YOq QFMA\"{8Rd^", "(Eh}YOq QFMA\"{8Rd^", "Ib8OVB?", 512);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(1024);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(251, 8192, "zSfk|7YdQN,zU$&P^", "value ", "_o6O", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess((-227051392));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "VR_T", "ACC_SYNCHRONIZED", "VR_T", "+TR~");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(128, "e_*qf&_", "e_*qf&_", "9", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(128);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("FDQ*B'e#F0m\"^>?{Z~", "FDQ*B'e#F0m\"^>?{Z~");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(mockPrintWriter0);
      aSMifierClassVisitor0.appendAccess(64);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(182, (-1984), "", "FieldVisitor fv;\n", "sf-& X7Y40#B^+L;X4", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(32);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(256, "j4W%Xc?]f:vud,]", "FieldVisitor fv;\n", "", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.util.AbstractVisitor";
      ASMifierClassVisitor.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("{\n");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(mockPrintWriter0);
      aSMifierClassVisitor0.visit(196653, 196653, "{\n", "{\n", "short", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("V1J}_6");
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(mockPrintWriter0);
      aSMifierClassVisitor0.visit(50, 195, "V1J}_6", "V1J}_6", "V1J}_6", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(48, 48, "lYB~WX<[xk", (String) null, "", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(bufferedOutputStream0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(mockPrintWriter0);
      aSMifierClassVisitor0.visit(46, (byte) (-124), "vLB/dR", "x6,.MR[0L ", "vLB/dR", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(152, "FieldVisitor fv;\n", "FieldVisitor fv;\n", "FieldVisitor fv;\n", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(47, 152, "FieldVisitor fv;\n", "new byte[] {", "mv.visitIincInsn(", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/Q~+E";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-debug";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-debug";
      ASMifierClassVisitor.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("^B$a1HklSxnzl'%PJ", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(mockPrintWriter0);
      aSMifierClassVisitor0.visitOuterClass("i]Bww)Ut-xHI<2?", "*hBjINHi", "i]Bww)Ut-xHI<2?");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("FieldVisitor fv;\n", (String) null, ">.class", 65535);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitSource("IO|E87P+~K<O.\"", "IO|E87P+~K<O.\"");
  }
}
