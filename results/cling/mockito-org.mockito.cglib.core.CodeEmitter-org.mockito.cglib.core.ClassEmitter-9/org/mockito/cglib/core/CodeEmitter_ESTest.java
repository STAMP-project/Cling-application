/*

 * Tue Mar 03 14:37:10 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.ClassInfo;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CodeEmitter_ESTest extends CodeEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      Type type1 = Type.BOOLEAN_TYPE;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("MQ", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 172, signature0, typeArray0);
      Label label0 = codeEmitter0.make_label();
      // Undeclared exception!
      try { 
        codeEmitter0.if_cmp(type1, 8, label0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }
}
