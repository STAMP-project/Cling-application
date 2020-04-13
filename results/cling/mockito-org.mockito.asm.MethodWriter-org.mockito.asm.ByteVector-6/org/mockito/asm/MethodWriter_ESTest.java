/*

 * Tue Mar 03 14:30:18 GMT 2020
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
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(52);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "VWi,)n%waI";
      stringArray0[1] = "VWi,)n%waI";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 172, "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(127, label0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 61, "AnnotationDefault", "lOxzd;cH", "lOxzd;cH", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.put11(61, 2);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "h3mPw";
      stringArray0[1] = "h3mPw";
      stringArray0[2] = "6)[oni3|,U";
      stringArray0[3] = "h3mPw";
      stringArray0[4] = "6)[oni3|,U";
      stringArray0[5] = "'s45'~VD:";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "h3mPw", "6)[oni3|,U", "'s45'~VD:", stringArray0, true, true);
      methodWriter0.visitMethodInsn(3375, "6)[oni3|,U", "6)[oni3|,U", "LineNumberTable");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "&HoE|5Fo>)&0";
      stringArray0[1] = "&HoE|5Fo>)&0";
      stringArray0[2] = "&HoE|5Fo>)&0";
      stringArray0[3] = "&HoE|5Fo>)&0";
      stringArray0[4] = "&HoE|5Fo>)&0";
      stringArray0[5] = "&HoE|5Fo>)&0";
      stringArray0[6] = "&HoE|5Fo>)&0";
      stringArray0[7] = "&HoE|5Fo>)&0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 12, "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 76, "0$)Xn8", "VWi,)n%waI", "&HoE|5Fo>)&0", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs((-695), (-695));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      methodWriter0.visitVarInsn((-399), 3928);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("0url", "-:2[sBhYbiLUC!v:", "org.mockito.asm.Frame", label0, label0, 4096);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "VWi,)n%waI", "RuntimeVisibleParameterAnnotations", (String) null, stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter1.classReaderOffset = 1351;
      // Undeclared exception!
      try { 
        methodWriter1.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      methodWriter0.visitIincInsn(128, (-133));
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3054), "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-397), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putLong(91);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Label label0 = new Label();
      int[] intArray0 = new int[0];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 536, "Ljava/lang/Synthetic;", "2", "2", stringArray0, false, false);
      methodWriter0.visitFieldInsn(1, "Ljava/lang/Synthetic;", "|mwi~QN/r~gb%qZn9t", ":0^+=?C/DZ");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(1, "?3S_)448B9S", "?3S_)448B9S", "Ljava/lang/Synthetic;");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 61, "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      methodWriter0.classReaderOffset = 2;
      methodWriter0.getSize();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 55, "VWi,)n%waI", "VWi,)n%waI", (String) null, stringArray0, false, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "0$)Xn8", "RuntimeInvisibleParameterAnnotations", stringArray0, true, true);
      methodWriter1.visitIincInsn(1, 73);
      int int0 = methodWriter1.getSize();
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 536, "Ljava/lang/Synthetic;", "2", "VWi,)n%waI", stringArray0, false, false);
      Label label0 = new Label();
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 61, "2", "D{vx,l0j-@", "2", (String[]) null, false, false);
      methodWriter1.visitJumpInsn(1, label0);
      methodWriter1.visitFrame(835, 1833, stringArray0, 11, stringArray0);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 16777220;
      MethodWriter.getNewOffset(intArray0, intArray0, 16777220, 3);
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2140, 16777220).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "Gx", "6)|O", "tb2i<!A+=qJxb'!$", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "&HoE|5Fo>)&0";
      stringArray0[1] = "6)|O";
      stringArray0[2] = "&HoE|5Fo>)&0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2732), "X+c`v&", "&HoE|5Fo>)&0", "X+c`v&", stringArray0, true, false);
      methodWriter0.visitIincInsn((-789), (-789));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(91, (-449));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(52);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "VWi,)n%waI";
      stringArray0[1] = "VWi,)n%waI";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 172, "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, true);
      methodWriter0.visitFieldInsn((-872), "VWi,)n%waI", "vDC-]pq,AizS~d=jj", "=^R-+Rh+P!");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      methodWriter0.visitFrame(2, 1, stringArray0, (-399), stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.put12(1, (-399));
      byte[] byteArray0 = new byte[6];
      byteVector1.data = byteArray0;
      // Undeclared exception!
      try { 
        byteVector1.put11((-399), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(90);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "6)|O";
      stringArray0[1] = "_JG6c<xp}N#,RY>D";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 90, "_JG6c<xp}N#,RY>D", "6)|O", "_JG6c<xp}N#,RY>D", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(90, "whQ?h'iWn)YpJ&l0ut", "6)|O", "W:Yhw_x>SGds1");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      methodWriter0.visitVarInsn(2, 2);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 61, "AnnotationDefault", "lOxzd;cH", "lOxzd;cH", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2785);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "9Ir*A~";
      stringArray0[1] = "9Ir*A~";
      stringArray0[2] = "";
      stringArray0[3] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "9Ir*A~", "", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(2, 1700);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.putLong(2);
      byteVector0.put11(1, 2);
      ClassWriter classWriter0 = new ClassWriter((-1906));
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 64, "", "", "", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(74, (-7)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 17, "04", "04", "6)|O", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 496, stringArray0, 15, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "G]g2JCErmZ'z'8u~s";
      stringArray0[1] = "G]g2JCErmZ'z'8u~s";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1347), "G]g2JCErmZ'z'8u~s", "G]g2JCErmZ'z'8u~s", "G]g2JCErmZ'z'8u~s", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1347), "G]g2JCErmZ'z'8u~s", "ng~})1V*6~@", "6i=:)}i", stringArray0, false, false);
      methodWriter0.visitVarInsn(83, 1);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "-:2[sBhYbiLUC!v:";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-6), stringArray0, 1, stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-397), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      methodWriter0.visitLdcInsn(classWriter0.COMPUTE_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 536, "Ljava/lang/Synthetic;", "2", "VWi,)n%waI", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 61, "2", "D{vx,l0j-@", "2", (String[]) null, false, false);
      methodWriter1.visitAnnotationDefault();
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "0$)Xn8", "RuntimeInvisibleParameterAnnotations", stringArray0, true, true);
      int int0 = methodWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      classWriter0.newField("EnclosingMethod", "uCTkO%", "uCTkO%");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "EnclosingMethod";
      stringArray0[1] = "RuntimeInvisibleAnnotations";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-7), "Ljava/lang/Synthetic;", "EnclosingMethod", "RuntimeInvisibleAnnotations", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-7), 50331648, 1802, 50331648, (-7)).when(classWriter0).newClass(anyString());
      doReturn(1802, (-7), 1802, 1802, 1802).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-7), "0$)Xn8", "0$)Xn8", "", stringArray0, false, true);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-395), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 536, "Ljava/lang/Synthetic;", "2", "2", stringArray0, false, false);
      methodWriter0.visitInsn(2);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(74, (-7), 74).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2960, "0$)Xn8", "0$)Xn8", stringArray0[3], stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(61, 4096).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "2", "VWi,)n%waI", "2", (String[]) null, true, true);
      methodWriter0.visitVarInsn(58, 91);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      int[] intArray0 = new int[5];
      MethodWriter.getNewOffset(intArray0, intArray0, 892, (-2732));
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-2732), "StackMapTable", "qL]V", "{,Phoc{@ZNm{=\"=", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[2] = 1801;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(6, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-395), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      methodWriter0.visitVarInsn(1, (-2318));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "&HoE|5Fo>)&0";
      stringArray0[1] = "&HoE|5Fo>)&0";
      stringArray0[2] = "&HoE|5Fo>)&0";
      stringArray0[3] = "&HoE|5Fo>)&0";
      stringArray0[4] = "&HoE|5Fo>)&0";
      stringArray0[5] = "&HoE|5Fo>)&0";
      stringArray0[6] = "&HoE|5Fo>)&0";
      stringArray0[7] = "&HoE|5Fo>)&0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 33554432, "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", "c:|", stringArray0, true, false);
      methodWriter1.visitLdcInsn("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "VWi,)n%waI", "RuntimeVisibleParameterAnnotations", (String) null, stringArray0, false, false);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      methodWriter0.visitMaxs(1764, 268435455);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "_JG6c<xp}N#,RY>D";
      stringArray0[1] = "_JG6c<xp}N#,RY>D";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777217, "_JG6c<xp}N#,RY>D", "6)|O", "_JG6c<xp}N#,RY>D", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn((-821), (-789));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -821
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-127), "VWi,)n%waI", "n=;bk#}s", "VWi,)n%waI", stringArray0, false, false);
      Attribute attribute0 = new Attribute("slH");
      methodWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        methodWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      methodWriter0.visitInsn(1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, true);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(91);
      byteVector1.putLong(1);
      methodWriter0.visitMethodInsn((-1961), "VWi,)n%waI", "'s-kwoi~", "XB-||+!Ot?Vj`9$[");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 536, "Ljava/lang/Synthetic;", "2", "VWi,)n%waI", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putLong(256);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 61, "2", "D{vx,l0j-@", "2", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 61, "AnnotationDefault", "lOxzd;cH", "lOxzd;cH", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putLong(1065L);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      methodWriter0.visitFrame(3, 3, stringArray0, 103, stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-395), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2356, "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", "VWi,)n%waI", stringArray0, true, false);
      methodWriter0.visitMaxs(122, 8);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-395), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2356, "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", "VWi,)n%waI", stringArray0, true, false);
      methodWriter0.visitVarInsn(1, 58);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2296);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Q)Ir5A~";
      stringArray0[1] = "h3mPw";
      stringArray0[2] = "Q)Ir5A~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Q)Ir5A~", "h3mPw", "Q)Ir5A~", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 0, "rUgu]B|0", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "rUgu]B|0", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.version = (-399);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-397), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      Attribute attribute0 = new Attribute("ymIEfY&2#3<*i%(");
      methodWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(247);
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, 73);
      int int0 = methodWriter0.getSize();
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.exceptionCount = 2;
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "&HoE|5Fo>)&0";
      stringArray0[1] = "&HoE|5Fo>)&0";
      stringArray0[2] = "&HoE|5Fo>)&0";
      stringArray0[3] = "&HoE|5Fo>)&0";
      stringArray0[4] = "&HoE|5Fo>)&0";
      stringArray0[5] = "&HoE|5Fo>)&0";
      stringArray0[6] = "&HoE|5Fo>)&0";
      stringArray0[7] = "&HoE|5Fo>)&0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 70, "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLineNumber(25, label0);
      methodWriter0.visitMethodInsn(1459, "", "R/S?7", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      methodWriter0.visitMethodInsn((-607), "'-kwoi~", "Ljava/lang/Synthetic;", "AnnotationDefault");
      Label label0 = new Label();
      methodWriter0.visitLocalVariable(":r4+7Xdk$&", "", "", label0, label0, 1);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3054), "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2785);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "9Ir*A~";
      stringArray0[1] = "9Ir*A~";
      stringArray0[2] = "";
      stringArray0[3] = "-[H0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "9Ir*A~", "", "-[H0", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitAnnotation("", false);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 3, "-[H0", "-[H0", "char", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitAnnotation("SourceDebugExtension", false);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-7), 50331648, 1802, 50331648, (-7)).when(classWriter0).newClass(anyString());
      doReturn(1802, (-7)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-7), "0$)Xn8", "0$)Xn8", "", stringArray0, false, true);
      methodWriter0.visitIincInsn(2, 1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-397), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      methodWriter0.visitIincInsn(2, 2476);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("^A/jv)D:upzBhu", "", "^A/jv)D:upzBhu", label0, label0, (-399));
      methodWriter0.visitIincInsn(132, 132);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "&HoE|5Fo>)&0";
      stringArray0[1] = "&HoE|5Fo>)&0";
      stringArray0[2] = "&HoE|5Fo>)&0";
      stringArray0[3] = "&HoE|5Fo>)&0";
      stringArray0[4] = "&HoE|5Fo>)&0";
      stringArray0[5] = "&HoE|5Fo>)&0";
      stringArray0[6] = "&HoE|5Fo>)&0";
      stringArray0[7] = "&HoE|5Fo>)&0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 12, "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", stringArray0, true, true);
      methodWriter0.visitInsn(1);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitMethodInsn((-1961), "VWi,)n%waI", "'s-kwoi~", "XB-||+!Ot?Vj`9$[");
      methodWriter0.visitFrame(1801, 1801, stringArray0, (-158), stringArray0);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      methodWriter0.visitMaxs((-399), 74);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      methodWriter0.visitVarInsn(170, 32803);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(108);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 108, "qL]V", "qL]V", "qL]V", (String[]) null, false, false);
      methodWriter0.visitIntInsn(17, 108);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2785);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "9Ir*A~";
      stringArray0[1] = "9Ir*A~";
      stringArray0[2] = "";
      stringArray0[3] = "-[H0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "9Ir*A~", "", "-[H0", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitAnnotation("", true);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 3, "-[H0", "-[H0", "c(/ar", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitAnnotation("<Jv]FLXS9&9z ", true);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "&HoE|5Fo>)&0";
      stringArray0[1] = "&HoE|5Fo>)&0";
      stringArray0[2] = "&HoE|5Fo>)&0";
      stringArray0[3] = "&HoE|5Fo>)&0";
      stringArray0[4] = "&HoE|5Fo>)&0";
      stringArray0[5] = "&HoE|5Fo>)&0";
      stringArray0[6] = "&HoE|5Fo>)&0";
      stringArray0[7] = "&HoE|5Fo>)&0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 70, "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", "&HoE|5Fo>)&0", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "");
      methodWriter0.visitMethodInsn(1459, "", "R/S?7", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3054), "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(52);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "VWi,)n%waI";
      stringArray0[1] = "VWi,)n%waI";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 172, "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("LocalVariableTable", "VWi,)n%waI", "VWi,)n%waI", label0, label0, 8);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-395), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      methodWriter0.visitInsn(68);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-397), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 50331648, "", "VWi,)n%waI", "", stringArray0, true, true);
      methodWriter1.visitIincInsn(128, 2079);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-395), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 91, "VWi,)n%waI", "VWi,)n%waI", "v*;C':uazs /gU<e#K", stringArray0, true, false);
      methodWriter0.visitIincInsn(33554432, 65535);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 61, "AnnotationDefault", "lOxzd;cH", "lOxzd;cH", (String[]) null, false, false);
      methodWriter1.visitVarInsn(61, 3316);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      methodWriter0.visitMethodInsn(3, "-:2[sBhYbiLUC!v:", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "long");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-790), "RuntimeInvisibleAnnotations", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-395), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.put11(2, 1);
      methodWriter0.exceptionCount = 2;
      byteVector1.putInt(1);
      methodWriter0.visitInsn(2);
      int int0 = methodWriter0.getSize();
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-395), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, true, false);
      methodWriter0.visitFieldInsn(2, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 91, "VWi,)n%waI", "VWi,)n%waI", "v*;C':uazs /gU<e#K", stringArray0, true, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-399), "VWi,)n%waI", "VWi,)n%waI", "VWi,)n%waI", stringArray0, false, false);
      methodWriter0.visitFrame(1801, 1801, stringArray0, (-158), stringArray0);
      methodWriter0.visitFrame((-399), 1, stringArray0, 2, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-:2[sBhYbiLUC!v:";
      stringArray0[1] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", "-:2[sBhYbiLUC!v:", stringArray0, false, false);
      int[] intArray0 = new int[1];
      MethodWriter.getNewOffset(intArray0, intArray0, (-32768), 32);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1281), "*&>,kfe?P`?k0i 7>", "pNmtOB/uxH9E#j-{", "pNmtOB/uxH9E#j-{", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }
}
