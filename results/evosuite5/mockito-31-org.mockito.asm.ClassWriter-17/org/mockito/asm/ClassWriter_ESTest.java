/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 13:50:24 GMT 2019
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6239);
      classWriter0.index = 6239;
      String[] stringArray0 = new String[0];
      classWriter0.visit(2, 6239, "", "", "org.mockito.asm.ByteVector", stringArray0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4787);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassWriter", "java/lang/Object");
      assertNotNull(string0);
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6239);
      String string0 = classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6239);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassWriter", "org.mockito.asm.ByteVector");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4761);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 4761);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25165844);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addType("Class not found");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      int int0 = classWriter0.addUninitializedType("*P.JN", 68);
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("*P.JN", 68);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      int int0 = classWriter0.addType("*P.JN");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("*P.JN");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(613);
      classWriter0.visitOuterClass("", "", "");
      int int0 = classWriter0.newMethod("", "", "", true);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-163));
      classWriter0.newConstItem("java/lang/Class");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "java/lang/Class", "n)3", "n)3", "java/lang/Class");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6249);
      Item item0 = classWriter0.newDouble(6249);
      Item item1 = classWriter0.newDouble(6249);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      Item item0 = classWriter0.newLong(68);
      Item item1 = classWriter0.newLong(68);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(202);
      Item item0 = classWriter0.newFloat(202);
      Item item1 = classWriter0.newFloat(202);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      Item item0 = classWriter0.newInteger(68);
      Item item1 = classWriter0.newInteger(68);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(613);
      classWriter0.newMethodItem("", "", "", true);
      int int0 = classWriter0.newMethod("", "", "", true);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      Item item0 = classWriter0.newFieldItem(";,5kvi", ";,5kvi", ";,5kvi");
      Item item1 = classWriter0.newFieldItem(";,5kvi", ";,5kvi", ";,5kvi");
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6220);
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6280);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3365));
      Type type0 = Type.VOID_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3365));
      Double double0 = new Double((-3365));
      Item item0 = classWriter0.newConstItem(double0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6220);
      Long long0 = new Long(2);
      Item item0 = classWriter0.newConstItem(long0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2643));
      Float float0 = new Float(3.007922590709307);
      int int0 = classWriter0.newConst(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      ClassWriter classWriter0 = new ClassWriter((-3365));
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6239);
      Boolean boolean0 = Boolean.valueOf(true);
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3365));
      Short short0 = new Short((short)192);
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2527));
      Character character0 = Character.valueOf('v');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6239);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6239);
      Attribute attribute0 = new Attribute("");
      byte[] byteArray0 = new byte[0];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(33, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      classWriter0.visitInnerClass("o5", "o5", ",9tU{", 16);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4748);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "r2(yi*&Ph1e";
      stringArray0[1] = "r2(yi*&Ph1e";
      stringArray0[2] = "StackMapTable";
      classWriter0.visit(4748, (-2655), "StackMapTable", "StackMapTable", "r2(yi*&Ph1e", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(105, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25165847);
      String[] stringArray0 = new String[0];
      classWriter0.visit(25165847, (-2068), "rG", "Synthetic", "zqmo{", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6265);
      Byte byte0 = new Byte((byte) (-108));
      classWriter0.visitField(6265, "value ", "value ", "EnclosingMethod", byte0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(126, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-309));
      classWriter0.visitInnerClass("org.mockito.asm.ClassWriter", (String) null, (String) null, (-309));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-853));
      classWriter0.visitInnerClass((String) null, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", 1);
      classWriter0.visitInnerClass("&kBJA", "RuntimeInvisibleParameterAnnotations", "|-Tf1|~v", (-3919));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6265);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4770);
      classWriter0.visitAnnotation("*,zp", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6239);
      classWriter0.visitOuterClass("C+@i", "ml ", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(62, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4748);
      classWriter0.visitOuterClass("dE]q_&.bgaJW7H", (String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      classWriter0.visitSource("", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25165824);
      classWriter0.visitSource("LineNumberTable", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      classWriter0.visitSource((String) null, "I4%8#Q");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131112);
      classWriter0.visit(131112, 69, "g`h\"1V[Fs2D~&<A.I+|", "g`h\"1V[Fs2D~&<A.I+|", "g`h\"1V[Fs2D~&<A.I+|", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6265);
      String[] stringArray0 = new String[0];
      classWriter0.visit(2, 6265, "Synthetic", (String) null, (String) null, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4761);
      int int0 = classWriter0.newConst(classWriter0.COMPUTE_MAXS);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6265);
      classWriter0.newMethod("r7]M", "r7]M", "", false);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(6265, 6265);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4748);
      String[] stringArray0 = new String[0];
      classWriter0.visitMethod(3759, "RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeVisibleAnnotations", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(110, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6239);
      int int0 = classWriter0.newField("r2]9Z.TvP", "r2]9Z.TvP", "r2]9Z.TvP");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 1454);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }
}
