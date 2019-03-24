#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name) {
  echo "Branch ${name}"
  def c = "git clone --branch ${name} https://github.com/zeeamd/test4jira.git"
  println ("[$c]")
  Process p = c.execute()
  p.waitFor()
  println "Process exit code: ${p.exitValue()}"
  println "Std Out: ${p.err.text}"
  println "Std Out: ${p.in.text}"
}

