#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name) {
  echo "Branch ${name}"
  def c = "git clone https://github.com/zeeamd/test4jira.git /var/lib/jenkins/workspace/J16-34"
  println ("[$c]")
  Process p = c.execute()
  p.waitFor()
  println "Process exit code: ${p.exitValue()}"
  println "Std Err: ${p.err.text}"
  println "Std Out: ${p.in.text}"
}

