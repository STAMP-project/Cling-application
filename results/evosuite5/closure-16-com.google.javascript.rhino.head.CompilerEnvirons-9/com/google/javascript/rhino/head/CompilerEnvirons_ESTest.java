/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 07:25:25 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.ErrorReporter;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CompilerEnvirons_ESTest extends CompilerEnvirons_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        compilerEnvirons0.setErrorReporter((ErrorReporter) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.CompilerEnvirons", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        compilerEnvirons0.initFromContext(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.CompilerEnvirons", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      compilerEnvirons0.initFromContext(context0);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.isXmlAvailable();
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertTrue(boolean0);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      int int0 = compilerEnvirons0.getOptimizationLevel();
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, int0);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isIdeMode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isGenerateDebugInfo();
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(boolean0);
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.isRecordingComments();
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setAllowSharpComments(false);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isGeneratingSource();
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(boolean0);
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      assertTrue(compilerEnvirons0.isXmlAvailable());
      
      compilerEnvirons0.setXmlAvailable(false);
      assertFalse(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.getAllowSharpComments();
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(boolean0);
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isStrictMode();
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(boolean0);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.isRecordingLocalJsDocComments();
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isGenerateObserverCount();
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(boolean0);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(boolean0);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      assertTrue(compilerEnvirons0.isGeneratingSource());
      
      compilerEnvirons0.setGeneratingSource(false);
      assertFalse(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.recoverFromErrors();
      assertTrue(boolean0);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isIdeMode();
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(boolean0);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      
      compilerEnvirons0.setGenerateObserverCount(true);
      assertTrue(compilerEnvirons0.isGenerateObserverCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      int int0 = compilerEnvirons0.getLanguageVersion();
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertEquals(0, int0);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setActivationNames((Set<String>) null);
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      // Undeclared exception!
      try { 
        compilerEnvirons0.setOptimizationLevel((-4169));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Optimization level outside [-1..9]: -4169
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setRecordingLocalJsDocComments(false);
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.isRecordingLocalJsDocComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      
      compilerEnvirons0.setGenerateDebugInfo(false);
      assertFalse(compilerEnvirons0.isGenerateDebugInfo());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.getActivationNames();
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.reportWarningAsError();
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertFalse(boolean0);
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.isReservedKeywordAsIdentifier();
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(boolean0);
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.getWarnTrailingComma();
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(boolean0);
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.getErrorReporter();
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }
}
