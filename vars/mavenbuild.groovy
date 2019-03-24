#!/usr/bin/env groovy
package com.cleverbuilder

def call(String[] args) {
  echo "Branch ${args[0]}"
  //echo "Clone Dir ${path}"
  //echo "Repo ${}"
  def c = "mvn "
  //println ("[$c]")
  //Process p = c.execute()
  //p.waitFor()
  //println "Process exit code: ${p.exitValue()}"
  //println "Std Out: ${p.err.text}"
  //println "Std Out: ${p.in.text}"
  for(String a : args) {
        //using args in above for loop will throw error
        println (a);
        c = $c + a;
        println ("\n");
    }
  println ($c);
}

