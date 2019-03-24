#!/usr/bin/env groovy
package com.cleverbuilder

def call(String bname,String repo,String path) {
  echo "Branch ${bname}"
  echo "Clone Dir ${path}"
  echo "Repo ${repo}"
  def c = "git clone --branch ${bname} ${repo} ${path}"
  println ("[$c]")
  Process p = c.execute()
  p.waitFor()
  println "Process exit code: ${p.exitValue()}"
  println "Std Out: ${p.err.text}"
  println "Std Out: ${p.in.text}"
}

