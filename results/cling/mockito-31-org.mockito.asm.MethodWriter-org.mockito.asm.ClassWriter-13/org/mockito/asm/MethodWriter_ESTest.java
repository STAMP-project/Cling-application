/*

 * Tue Mar 03 14:33:10 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k)7+!", "k)7+!", "k)7+!", stringArray0, true, true);
      methodWriter0.visitVarInsn(12, 41);
      Label label0 = new Label();
      methodWriter0.visitLineNumber(12, label0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k)7+!", "k)7+!", "k)7+!", stringArray0, true, true);
      methodWriter0.visitVarInsn(12, 41);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 4, "k)7+!", "k)7+!", "%q4`)v@n<29!E'W", stringArray0, true, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "9rn -M~ @";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 71, "LocalVariableTable", "9rn -M~ @", "Deprecated", stringArray0, false, false);
      methodWriter0.visitVarInsn(16777221, 16777221);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "k)7+!", "k)7+!", "k)7+!", stringArray0, true, false);
      methodWriter0.visitVarInsn(6, (-431));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      classWriter0.newConst("k)7+!");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k)7+!", "k)7+!", "k)7+!", stringArray0, true, true);
      methodWriter0.visitVarInsn(12, 41);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k)7+!", "k)7+!", "k)7+!", stringArray0, true, true);
      methodWriter0.visitVarInsn(12, 41);
      Item item0 = classWriter0.newFloat(41);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-14));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Ljava/lang/Synthetic;", "k)7+!", "Ljava/lang/Synthetic;", stringArray0, false, false);
      methodWriter0.visitTypeInsn((-14), "Code");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777226, "k)7+!", "k)7+!", "g2Trl#v'd>&-G_EamQ", stringArray0, true, true);
      methodWriter0.visitMaxs(16777226, 12);
      methodWriter0.visitIntInsn(46, 16777226);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(251);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-qXuDdS4t^";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 285212682, "-qXuDdS4t^", "InnerClasses", (String) null, stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn((-476), label0);
      methodWriter0.visitFieldInsn((-1887), "-qXuDdS4t^", "Xiw0mE+#M", ")V");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-589));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Eiceptions", "2)WBH]Lh.", ">~lhs%e.X;crS|", stringArray0, true, false);
      methodWriter0.visitIntInsn(837, 1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(41);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "java/lang/Throwable";
      stringArray0[1] = "";
      stringArray0[2] = "e7;)Gah>Mf>xLnsDPT";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "e7;)Gah>Mf>xLnsDPT";
      stringArray0[6] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 464, "", "e7;)Gah>Mf>xLnsDPT", "java/lang/Throwable", stringArray0, true, false);
      methodWriter0.visitVarInsn(41, (-3951));
      Label[] labelArray0 = new Label[0];
      methodWriter0.visitTableSwitchInsn((-268435456), (-5124), label0, labelArray0);
      methodWriter0.visitJumpInsn(1, label0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777226, "k)7+!", "k)7+!", "g2Trl#v'd>&-G_EamQ", stringArray0, true, true);
      methodWriter0.visitFieldInsn((-636), "k)7+!", "D\"Hgl6lZs1$", "k)7+!");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter(41);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "java/lang/Throwable";
      stringArray0[1] = "";
      stringArray0[2] = "e7;)Gah>Mf>xLnsDPT";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "e7;)Gah>Mf>xLnsDPT";
      stringArray0[6] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 464, "", "e7;)Gah>Mf>xLnsDPT", "java/lang/Throwable", stringArray0, true, false);
      methodWriter0.visitVarInsn(41, (-3951));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "java/lang/Throwable";
      stringArray0[1] = "";
      stringArray0[2] = "e7;)Gah>Mf>xLnsDPT";
      classWriter0.newFieldItem("_8t%e/a=Cm", "java/lang/Object", "_8t%e/a=Cm");
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "e7;)Gah>Mf>xLnsDPT";
      stringArray0[6] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 464, "", "e7;)Gah>Mf>xLnsDPT", "java/lang/Throwable", stringArray0, true, false);
      methodWriter0.visitVarInsn(41, (-3951));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777226, "k)7+!", "k)7+!", "g2Trl#v'd>&-G_EamQ", stringArray0, true, true);
      methodWriter0.visitMaxs(16777226, 12);
      // Undeclared exception!
      try { 
        methodWriter0.visitTypeInsn(255, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "java/lang/Throwable";
      stringArray0[1] = "";
      stringArray0[2] = "e7;)Gah>Mf>xLnsDPT";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "e7;)Gah>Mf>xLnsDPT";
      stringArray0[6] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 464, "", "e7;)Gah>Mf>xLnsDPT", "java/lang/Throwable", stringArray0, true, false);
      methodWriter0.visitVarInsn(41, (-3951));
      methodWriter0.visitLdcInsn("");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%0!U";
      stringArray0[1] = "%0!U";
      stringArray0[2] = "%0!U";
      stringArray0[3] = "%0!U";
      ClassWriter classWriter0 = new ClassWriter((byte)4);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte)12, "3j)^d(k#^QbsW[8", "q:DTQk<dC", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(101, 2);
      methodWriter0.visitMaxs(25165824, 2087);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k)7+!", "k)7+!", "k)7+!", stringArray0, true, true);
      methodWriter0.visitVarInsn(12, 41);
      methodWriter0.visitTypeInsn(74, "k)7+!");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Ljava/lang/Synthetic;", "k)7+!", "Ljava/lang/Synthetic;", stringArray0, true, false);
      methodWriter0.visitTypeInsn((-1), "Code");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k)7+!", "k)7+!", "k)7+!", stringArray0, true, true);
      methodWriter0.visitVarInsn(12, 41);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "k)7+!";
      stringArray0[1] = "k)7+!";
      stringArray0[2] = "k)7+!";
      stringArray0[3] = "k)7+!";
      stringArray0[4] = "k)7+!";
      stringArray0[5] = "k)7+!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k)7+!", "k)7+!", "k)7+!", stringArray0, true, true);
      methodWriter0.visitMethodInsn(16777220, "JY^m<bGzbNV /", "k)7+!", "8<YP>#:");
      methodWriter0.visitVarInsn(12, 41);
  }
}
