#!/usr/bin/env groovy
package com.builder

class SampleClass {
    String name
    Integer age

    def incrementAge(Integer years) {
        this.age = age + years
    }

    def sayHelloPerson() {
        echo "Hello World" + this.name
    }
}
