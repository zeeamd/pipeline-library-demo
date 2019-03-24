#!/usr/bin/env groovy
package com.cleverbuilder

def call(String[] args) {
  def c = "mvn"
  for(String a : args) {
        println (a);
        c = c + " " + a;
    }
  println (c);
  Process p = c.execute(null,'/var/lib/jenkins/workspace/J16-61')
  p.waitFor()
  println "Process exit code: ${p.exitValue()}"
  println "Std Out: ${p.err.text}"
  println "Std Out: ${p.in.text}"
}

