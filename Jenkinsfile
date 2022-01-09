    pipeline {

        options {
            buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
        }
        agent any

        tools {
            maven 'mymaven_3.6'
        }

        stages {
            stage('Code Compilation') {
                steps {
                    sh 'mvn clean compile'
                }
            }
            stage('QA Execution') {
                steps {
                    sh 'mvn clean test'
                }
            }
            stage('Code Package') {
                steps {
                    sh 'mvn clean package'
                }
            }
    }
}
