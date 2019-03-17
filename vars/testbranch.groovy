#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name) {
  echo "Branch ${name}"
  def command = "pwd"
  println ("[$command]")
  Process p = command.execute()
  p.waitFor()               
  println "Process exit code: ${p.exitValue()}"
  println "Std Err: ${p.err.text}"
  println "Std Out: ${p.in.text}" 
}

