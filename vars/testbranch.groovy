#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name) {
  echo "Branch ${name}"
  def c1 = "cd /var/lib/jenkins/workspace/J16-33"
  def c2 = "git clone https://github.com/zeeamd/test4jira.git"
  println ("[$c1]")
  println ("[$c2]")
  Process p1 = c1.execute()
  Process p2 = c2.execute()
  p1.waitFor()
  p2.waitFor()
  println "Process exit code: ${p1.exitValue()}"
  println "Process exit code: ${p2.exitValue()}"
  println "Std Err: ${p1.err.text}"
  println "Std Err: ${p2.err.text}"
  println "Std Out: ${p1.in.text}" 
  println "Std Out: ${p2.in.text}" 
}

