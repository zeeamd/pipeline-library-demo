#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name) {
  echo "Branch ${name}"
  def command = "git --version"
  println ("[$command]")
  Process p = command.execute()
  p.waitFor()               
  println "Process exit code: ${proc.exitValue()}"
  println "Std Err: ${proc.err.text}"
  println "Std Out: ${proc.in.text}" 
}

