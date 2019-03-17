#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name=null) {
  echo "Branch ${name}"
  git clone --branch ${name} https://github.com/zeeamd/test4jira.git
}

