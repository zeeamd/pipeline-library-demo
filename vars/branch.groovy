#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name) {
  echo "Branch ${name}"
  //git clone --branch dev 
  ["git", "clone", "https://github.com/zeeamd/test4jira.git"].execute()
}

