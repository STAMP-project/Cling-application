/*

 * Tue Mar 03 19:05:08 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IRFactory;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IRFactory iRFactory0 = new IRFactory();
      StringReader stringReader0 = new StringReader("Yt?a<~g~R");
      // Undeclared exception!
      try { 
        iRFactory0.parse((Reader) stringReader0, "", 3047);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing : in conditional expression (#3047)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isStrictMode();
      doReturn(false, false).when(compilerEnvirons0).isXmlAvailable();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(3, "\"zp,g2`x");
      iRFactory0.transform(numberLiteral0);
      StringReader stringReader0 = new StringReader("\"zp,g2`x");
      stringReader0.read();
      // Undeclared exception!
      try { 
        iRFactory0.parse((Reader) stringReader0, "n\"[,#}1US>,av", 149);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // illegal character (n\"[,#}1US>,av#149)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(true, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isStrictMode();
      doReturn(false, false).when(compilerEnvirons0).isXmlAvailable();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      NumberLiteral numberLiteral0 = new NumberLiteral(3, "\"zp,g2`x");
      iRFactory0.transform(numberLiteral0);
      StringReader stringReader0 = new StringReader("\"zp,g2`x");
      stringReader0.read();
      // Undeclared exception!
      try { 
        iRFactory0.parse((Reader) stringReader0, "n\"[,#}1US>,av", 149);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // illegal character (n\"[,#}1US>,av#149)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
