#!/usr/bin/env groovy
package com.builder

class SampleClass {
    String name
    Integer age

    def incrementAge(Integer years) {
        this.age = age + years
    }

    def sayHello() {
        echo "Hello World"
    }
}
  git remote add origin https://github.com/youraccount/yourproject.git