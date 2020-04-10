/*

 * Tue Mar 03 19:05:38 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.ast.AstRoot;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      // Undeclared exception!
      try { 
        iRFactory0.parse("XWV|%3${K!", "#S&G!0R(,", 137);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (#S&G!0R(,#137)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      // Undeclared exception!
      try { 
        iRFactory0.parse("@;0'p[#SZ[rA2C]bvKc", "#S&G!0R(,", 137);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing name after .@ (#S&G!0R(,#137)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      AstRoot astRoot0 = iRFactory0.parse("msg.no.paren.catch", "msg.no.paren.catch", 65536);
      assertEquals(18, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
  }
}
