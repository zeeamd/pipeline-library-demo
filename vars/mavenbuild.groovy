#!/usr/bin/env groovy
package com.cleverbuilder

def call(String[] args) {
  def c = "mvn"
  for(String a : args) {
        c = c + " " + a;
    }
  println ("build cmd " + c);
  Process p = c.execute(null,new File(env.WORKSPACE))
  p.waitFor()
  println "Process exit code: ${p.exitValue()}"
  println "Std Out: ${p.err.text}"
  println "Std Out: ${p.in.text}"
}

