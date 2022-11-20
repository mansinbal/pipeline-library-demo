#!/usr/bin/env groovy

def call(String name) {
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: "${name}"]]])
}
