pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/rafaeltheQA/SauceDemoFramework.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish Test Results') {
            steps {
                publishTestNGResults(
                    id: 'My TestNG Report',
                    fileIncludePattern: '**/testng-results.xml',
                    failureOnTestFailure: true
                )
            }
        }
    }
}