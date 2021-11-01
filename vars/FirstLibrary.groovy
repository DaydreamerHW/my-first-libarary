#! /usr/bin/env groovy

def call(String name == "xiaqian", Date date = new Date()) {
    echo "Hello, ${name}!"
    echo "Today is ${date}"
}