/*

 * Tue Mar 03 19:04:33 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IRFactory;
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
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(defaultErrorReporter0).when(compilerEnvirons0).getErrorReporter();
      doReturn(true, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).isRecordingComments();
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("(/#v(3m|j`/");
      // Undeclared exception!
      try { 
        iRFactory0.parse((Reader) stringReader0, "(/#v(3m|j`/", (-46));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -46
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval((ErrorReporter) null);
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("su&,7m<X|,](17t2_");
      // Undeclared exception!
      try { 
        iRFactory0.parse((Reader) stringReader0, "", 141);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: syntax error (#141)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false).when(compilerEnvirons0).recoverFromErrors();
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      doReturn((EvaluatorException) null).when(errorReporter0).runtimeError(anyString() , anyString() , anyInt() , anyString() , anyInt());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("*");
      // Undeclared exception!
      try { 
        iRFactory0.parse((Reader) stringReader0, "", 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = mock(CompilerEnvirons.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(compilerEnvirons0).isIdeMode();
      doReturn(false, false).when(compilerEnvirons0).isStrictMode();
      doReturn(true).when(compilerEnvirons0).recoverFromErrors();
      EvaluatorException evaluatorException0 = new EvaluatorException("E.V318h%-sBK>jvd");
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      doReturn((EvaluatorException) null).when(errorReporter0).runtimeError(anyString() , anyString() , anyInt() , anyString() , anyInt());
      IRFactory iRFactory0 = new IRFactory(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("*");
      // Undeclared exception!
      try { 
        iRFactory0.parse((Reader) stringReader0, "", 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Parser", e);
      }
  }
}
