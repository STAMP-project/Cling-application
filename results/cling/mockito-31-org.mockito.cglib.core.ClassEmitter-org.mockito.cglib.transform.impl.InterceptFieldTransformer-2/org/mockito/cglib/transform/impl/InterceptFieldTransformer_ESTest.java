/*

 * Tue Mar 03 14:12:42 GMT 2020
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassAdapter;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterceptFieldTransformer_ESTest extends InterceptFieldTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(2170, 8, "J", "f9)(-qQ ", "{v^>nG;d<z", (String[]) null);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4537);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      classEmitter0.begin_class(384, 4537, "<generated>", type0, (Type[]) null, "<generated>");
      assertEquals(10, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.begin_static();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@42641
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(2170, 8, "J", "", "{v^>nG;d<z", (String[]) null);
      classEmitter0.begin_static();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(4095, 2147483645, "{v^>nG;d<z", "4BR&n3JPcxP'j3", (String) null, stringArray0);
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
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(4095, 4095, "{v^>nG;d<z", "{v^>nG;d<z", "6$3N;dDR{Pc4b3(", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(6, 8, "J", "*", "{v^>nG;d<z", (String[]) null);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }
}
