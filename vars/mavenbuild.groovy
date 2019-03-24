#!/usr/bin/env groovy
package com.cleverbuilder

def call(String[] args) {
  echo "Branch ${args[0]}"
  def c = "mvn"
  for(String a : args) {
        println (a);
        c = c + " " + a;
    }
  println (c);
  //Process p = c.execute()
  //p.waitFor()
  //println "Process exit code: ${p.exitValue()}"
  //println "Std Out: ${p.err.text}"
  //println "Std Out: ${p.in.text}"
}

