/*

 * Tue Mar 03 14:29:43 GMT 2020
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
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newLong(1);
      classWriter0.newMethodItem("Z", "*td,gzt!'(ULN3", "t_5MCJbxCl?Y", false);
      classWriter0.newDouble(1);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "J/4";
      stringArray0[1] = "Z";
      stringArray0[2] = "";
      stringArray0[3] = "J/4";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "Z", "Y?ux#:]RL", "*td,gzt!'(ULN3", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3797));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3797), "_Fj[._5[", "_Fj[._5[", "_Fj[._5[", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-268435456), ":jrNr:,1e3F4I-tw2", "1M)^FQ<UIu]:#`p<!0a", "Synthetic", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter1.visitMaxs(1, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "org.mockitoism.MethodWriter", "org.mockitoism.MethodWriter", "org.mockitoism.MethodWriter", (String[]) null, false, false);
      methodWriter0.visitIincInsn((-87), (-1759));
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-669), "org.mockitoism.MethodWriter", "org.mockitoism.MethodWriter", "org.mockito.asm.Type", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "]Q{", "]Q{", "]Q{", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1011);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "i*[dUJ=", "]-6$P:/P.)y0H", stringArray0, false, false);
      methodWriter0.getSize();
      Item item0 = classWriter0.newLong(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3194);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "1EaqyYGhCOYyDrg3+4";
      stringArray0[1] = "1EaqyYGhCOYyDrg3+4";
      stringArray0[2] = "%@l37BFl";
      stringArray0[3] = "1EaqyYGhCOYyDrg3+4";
      stringArray0[4] = "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII";
      stringArray0[5] = "1EaqyYGhCOYyDrg3+4";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "1EaqyYGhCOYyDrg3+4", "%@l37BFl", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, false, false);
      methodWriter0.visitLdcInsn("1EaqyYGhCOYyDrg3+4");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 105, "T'O/#/}b4KlW,hc", "T'O/#/}b4KlW,hc", "T'O/#/}b4KlW,hc", stringArray0, false, false);
      methodWriter0.visitLdcInsn("T'O/#/}b4KlW,hc");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-584));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "xAned>_.q$", "xAned>_.q$", "*td,gzt!'(ULN3", stringArray0, false, false);
      methodWriter0.visitFieldInsn((-2626), "ConstantValue", "-r&>c?>N<(v`}wQ@e", "*td,gzt!'(ULN3");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-75));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Synthetic", "Synthetic", "Synthetic", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-75), "A,8\"gdK!h>q:", "A,8\"gdK!h>q:", "A,8\"gdK!h>q:");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3793), "Ck #>n=Ev", ":SoVqpEmyGR~", ":SoVqpEmyGR~", stringArray0, false, false);
      methodWriter0.visitFrame((-960), 187, stringArray0, 1, stringArray0);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 18, stringArray0, (-406), stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 1373;
      ClassWriter classWriter0 = new ClassWriter((-632));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!?cr:(>=~^r?&j<`Wx";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-632), "!?cr:(>=~^r?&j<`Wx", "!?cr:(>=~^r?&j<`Wx", "!?cr:(>=~^r?&j<`Wx", stringArray0, false, false);
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 1373, 2);
      assertEquals((-2744), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3374));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "k2wrW6rcf)2).Yu[)";
      stringArray0[1] = "k2wrW6rcf)2).Yu[)";
      stringArray0[2] = "k2wrW6rcf)2).Yu[)";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "*q", "k2wrW6rcf)2).Yu[)", "*q", stringArray0, true, false);
      methodWriter0.visitIincInsn(1, 73);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      methodWriter0.visitFieldInsn(2, "9Fxz`3LYr!'", "3z`T", "9Fxz`3LYr!'");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(15, 1007);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, true, false);
      methodWriter1.visitInsn(59);
      int int0 = methodWriter1.getSize();
      assertEquals(45, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "org.mockitoism.MethodWriter", "org.mockitoism.MethodWriter", "org.mockitoism.MethodWriter", (String[]) null, false, false);
      methodWriter0.visitMethodInsn((-4215), "org.mockitoism.MethodWriter", "dEqKQ,}XwV*=7", "LineNumberTable");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-75));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "org.mockito.ism.MethodWriter", "org.mockito.ism.MethodWriter", "org.mockito.ism.MethodWriter", (String[]) null, false, false);
      methodWriter0.visitFrame(2, (-104), (Object[]) null, 29, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1007, "2.f", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      methodWriter1.visitMethodInsn(26, "Code", "3z`T", "Code");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3797));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "`.US:k!G?H].;KeP7IU";
      stringArray0[1] = "L";
      stringArray0[2] = "L";
      stringArray0[3] = "}W-FMSQU9+_\"t6K_5";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3797), "}W-FMSQU9+_\"t6K_5", "`.US:k!G?H].;KeP7IU", "bnc'=dtQ\"3\"4SB.m", stringArray0, false, false);
      Label label0 = new Label();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1), "bnc'=dtQ\"3\"4SB.m", "`.US:k!G?H].;KeP7IU", "bnc'=dtQ\"3\"4SB.m", stringArray0, false, false);
      int[] intArray0 = new int[7];
      intArray0[1] = 54;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0, 54, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      String[] stringArray1 = new String[2];
      stringArray1[0] = "3z`T";
      stringArray1[1] = "3z`T";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "_iTl)VL{/", "I\"dv;:w=N", "@a~fM8KL8o}=ZJ", stringArray1, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putByte(26);
      methodWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1048575);
      classWriter0.visitAnnotation("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", false);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.put11(2437, 1);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-128), "7&Yo6R#=~ev?=", "c/xwdp/fNRynkUE (o3", "LineNumberTable", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1048575);
      classWriter0.visitAnnotation("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", false);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.put11(1048575, 1);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
      stringArray0[1] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
      stringArray0[2] = ":SoVqpEmyGR~";
      stringArray0[3] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1048575, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", ":SoVqpEmyGR~", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3797));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3797), "<init>", "<init>", "<init>", stringArray0, false, false);
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 55, objectArray0, 64, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3793), "Ck #>n=Ev", ":SoVqpEmyGR~", ":SoVqpEmyGR~", stringArray0, false, false);
      methodWriter0.visitFrame(1, 1, stringArray0, (-406), stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3797));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3797), "*td,gzt!'(ULN3", "<init>", "*td,gzt!'(ULN3", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, 50331648);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "<init>", "*td,gzt!'(ULN3", "*td,gzt!'(ULN3", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 1373;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter((-632));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1373, "+#%uf*", "xs3D=s^KQa", "RuntimeInvisibleAnnotations", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "aStO.pS+k{*[", "<init>", "Ck #>n=Ev", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      String[] stringArray1 = new String[2];
      stringArray1[0] = "3z`T";
      stringArray1[1] = "3z`T";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "_iTl)VL{/", "I\"dv;:w=N", "@a~fM8KL8o}=ZJ", stringArray1, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "aStO.pS+k{*[", "<init>", "Ck #>n=Ev", stringArray0, false, false);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "<init>";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3793), "Ck #>n=Ev", ":SoVqpEmyGR~", ":SoVqpEmyGR~", stringArray1, false, false);
      methodWriter0.visitInsn(2);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      int[] intArray0 = new int[2];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 16777228, (-433));
      assertEquals((-16777661), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-75));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "org.mockito.ism.MethodWriter", "org.mockito.ism.MethodWriter", "org.mockito.ism.MethodWriter", (String[]) null, false, false);
      methodWriter0.classReaderOffset = (-75);
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
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      methodWriter0.visitVarInsn(2, 553);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "SezjU (K4X#T<5pa";
      stringArray0[1] = "`wB02HP\"~p./";
      stringArray0[2] = "Ck #>n=Ev";
      stringArray0[3] = "_LZw`#kHv!9/F:.g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "SezjU (K4X#T<5pa", "_LZw`#kHv!9/F:.g", "`wB02HP\"~p./", stringArray0, false, false);
      methodWriter0.visitMaxs((-3793), 57);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3797));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "aStO.pS+k{*[", "<init{", "Ck #>n=Ev", stringArray0, false, false);
      methodWriter0.visitMaxs(16777219, 1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "aStO.pS+k{*[", "<init>", "Ck #>n=Ev", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.getSize();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "qID3gEH/:r");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "aStO.pS+k{*[", "<init>", "Ck #>n=Ev", stringArray0, false, false);
      methodWriter0.visitAnnotation("<init>", false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      classWriter0.newDouble(1007);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "_iTl)VL{/", "I\"dv;:w=N", "@a~fM8KL8o}=ZJ", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-584));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "xAned>_.q$", "xAned>_.q$", "*td,gzt!'(ULN3", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 254, "-r&>c?>N<(v`}wQ@e", "ConstantValue", "ConstantValue", stringArray0, false, false);
      methodWriter1.getSize();
      Item item0 = classWriter0.newDouble((-105.242));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "aStO.pS+k{*[", "<init>", "Ck #>n=Ev", stringArray0, false, false);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "<init>";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3793), "Ck #>n=Ev", ":SoVqpEmyGR~", ":SoVqpEmyGR~", stringArray1, false, false);
      methodWriter1.visitVarInsn(1323, 21);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-584));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "xAned>_.q$", "xAned>_.q$", "*td,gzt!'(ULN3", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 58, "_iTl)VL{/", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "xAned>_.q$", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3797));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3797), "*td,gzt!'(ULN3", "<init>", "*td,gzt!'(ULN3", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-6), "%X)X72c1if!0Y3o{|4p", "RuntimeVisibleAnnotations", (String) null, stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "XT(_08_", "XT(_08_", "org.mockito.ism.MethodWriter", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("org.mockito.ism.MethodWriter", "AnnotationDefault", "XT(_08_", label0, label0, 2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "]Q{", "]Q{", "]Q{", stringArray0, false, false);
      methodWriter0.visitInsn((-406));
      int int0 = methodWriter0.getSize();
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3793), "Ck #>n=Ev", ":SoVqpEmyGR~", ":SoVqpEmyGR~", stringArray0, false, false);
      methodWriter0.visitIincInsn(1323, 1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "]Q{", "]Q{", "]Q{", stringArray0, false, false);
      methodWriter0.visitIincInsn(2, 32);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "org.mockitoism.MethodWriter", "org.mockitoism.MethodWriter", "org.mockitoism.MethodWriter", (String[]) null, false, false);
      methodWriter0.visitVarInsn(2, (-669));
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-669), "org.mockitoism.MethodWriter", "org.mockitoism.MethodWriter", "org.mockito.asm.Type", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      methodWriter0.visitAnnotation("@a~fM8KL8o}=ZJ", false);
      String[] stringArray1 = new String[2];
      stringArray1[0] = "3z`T";
      stringArray1[1] = "3z`T";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "_iTl)VL{/", "I\"dv;:w=N", "@a~fM8KL8o}=ZJ", stringArray1, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Sa+EIg]!E5";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Sa+EIg]!E5", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      methodWriter0.visitIincInsn(26, 1007);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3797));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 896, ":jrNr:,1e3F4I-tw2", "1M)^FQ<UIu]:#`p<!0a", "aStO.pS+k{*[", stringArray0, true, true);
      methodWriter0.visitIincInsn(80, 2);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      methodWriter0.visitIntInsn(7, (-2431));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-98), (-98)).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "XT(l_08`", "%X)X72c1if!0Y3o{|4p", "Sig%ature", (String[]) null, true, false);
      methodWriter0.visitMaxs((-1061), (-2617));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "k2wrW6rcf)2).Yu[)";
      stringArray0[1] = "k2wrW6rcf)2).Yu[)";
      stringArray0[2] = "k2wrW6rcf)2).Yu[)";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "*td,gzt!'(ULN3", "k2wrW6rcf)2).Yu[)", "k2wrW6rcf)2).Yu[)", stringArray0, true, true);
      methodWriter0.visitVarInsn(83, 2);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 491, "k2wrW6rcf)2).Yu[)", "*td,gzt!'(ULN3", "", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, false, true);
      methodWriter0.getSize();
      classWriter0.newMethodItem("@a~fM8KL8o}=ZJ", "3z`T", "3z`T", true);
      String[] stringArray1 = new String[2];
      stringArray1[0] = "3z`T";
      stringArray1[1] = "3z`T";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "_iTl)VL{/", "I\"dv;:w=N", "@a~fM8KL8o}=ZJ", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1007);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3z`T";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "3z`T", "_iTl)VL{/", "_iTl)VL{/", stringArray0, true, true);
      methodWriter0.visitAnnotation("@a~fM8KL8o}=ZJ", true);
      ByteVector byteVector0 = new ByteVector(26);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1690;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2, 1690);
      assertEquals(3378, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      Label label0 = new Label();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3793), "Ck #>n=Ev", ":SoVqpEmyGR~", ":SoVqpEmyGR~", stringArray0, false, false);
      methodWriter0.visitLocalVariable("Ck #>n=Ev", "IGc`sB}5jAopQAm#tr", ":SoVqpEmyGR~", label0, label0, 1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "]Q{", "]Q{", "]Q{", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.visitInsn((-406));
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3374));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "k2wrW6rcf)2).Yu[)";
      stringArray0[1] = "k2wrW6rcf)2).Yu[)";
      stringArray0[2] = "k2wrW6rcf)2).Yu[)";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "*td,gzt!'(ULN3", "k2wrW6rcf)2).Yu[)", "k2wrW6rcf)2).Yu[)", stringArray0, true, true);
      methodWriter0.visitIincInsn(2, 1172);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1694), "k2wrW6rcf)2).Yu[)", "3J", "3J", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-98), (-98)).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "XT(_08_", "%X)X72c1if!0Y3o{|4p", "Signature", (String[]) null, true, false);
      ClassWriter classWriter1 = new ClassWriter((-2947));
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, (-2947), "%X)X72c1if!0Y3o{|4p", "Signature", "Signature", (String[]) null, false, false);
      MethodWriter methodWriter2 = new MethodWriter(classWriter1, 16777219, "Z", "%X)X72c1if!0Y3o{|4p", "T", (String[]) null, false, false);
      methodWriter0.visitIincInsn((-1061), 1118);
      assertFalse(methodWriter0.equals((Object)methodWriter2));
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3793));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "aStO.pS+k{*[", "<init>", "Ck #>n=Ev", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "qID3gEH/:r");
      String[] stringArray1 = new String[1];
      stringArray1[0] = "<init>";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3793), "Ck #>n=Ev", ":SoVqpEmyGR~", ":SoVqpEmyGR~", stringArray1, false, false);
      methodWriter0.visitMethodInsn((-3793), "%3J\"e.A3lv%", "LocalVariableTable", "<init>");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-87));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "]Q{", "]Q{", "]Q{", stringArray0, false, false);
      methodWriter0.visitFrame((-406), 2, stringArray0, 2, stringArray0);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.visitInsn((-406));
      methodWriter0.put(byteVector0);
  }
}
