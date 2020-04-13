/*

 * Tue Mar 03 20:46:38 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = new Object[1];
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Global.sync((Context) null, importerTopLevel0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      Global global0 = new Global(context0);
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) baseFunction0;
      Object object0 = Global.toint32(context0, baseFunction0, objectArray0, baseFunction0);
      assertFalse(baseFunction0.isSealed());
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Global global0 = new Global();
      IdFunctionObject idFunctionObject0 = global0.exportAsJSClass(9, scriptableObject0, false);
      // Undeclared exception!
      try { 
        Global.spawn(context0, scriptableObject0, context0.emptyArgs, idFunctionObject0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      Global global0 = new Global(context0);
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) baseFunction0;
      // Undeclared exception!
      try { 
        Global.seal(context0, global0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, delegator0, context0.emptyArgs, delegator0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Global global0 = new Global();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      global0.setIn(pipedInputStream0);
      InputStream inputStream0 = global0.getIn();
      assertEquals(0, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[25];
      objectArray0[0] = (Object) baseFunction0;
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Thread thread0 = (Thread)Global.spawn(context0, scriptableObject0, objectArray0, baseFunction0);
      assertFalse(thread0.isInterrupted());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Global.seal(context0, importerTopLevel0, context0.emptyArgs, (Function) null);
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = new Object[16];
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Global.sync((Context) null, importerTopLevel0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Global.pipe(true, (InputStream) null, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        Global.sync(context0, delegator0, context0.emptyArgs, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        Global.pipe(false, byteArrayInputStream0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      Global global0 = new Global(context0);
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      assertNotNull(baseFunction0);
      
      Object object0 = Global.toint32(context0, baseFunction0, context0.emptyArgs, baseFunction0);
      assertEquals(0, object0);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readFile(context0, delegator0, objectArray0, delegator0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      Global global0 = new Global(context0);
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      Object[] objectArray0 = new Object[3];
      Global.doctest(context0, global0, objectArray0, baseFunction0);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Synchronizer synchronizer0 = new Synchronizer(global0);
      Object[] objectArray0 = new Object[3];
      objectArray0[2] = (Object) global0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, objectArray0, synchronizer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readUrl(context0, delegator0, objectArray0, delegator0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = new Context();
      boolean boolean0 = context0.stringIsCompilableUnit("UN[J:l$");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Context context0 = Context.getCurrentContext();
          Object[] objectArray0 = new Object[1];
          Global global0 = new Global();
          BaseFunction baseFunction0 = new BaseFunction(global0, global0);
          // Undeclared exception!
          try { 
            Global.runCommand(context0, global0, objectArray0, baseFunction0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor143.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
