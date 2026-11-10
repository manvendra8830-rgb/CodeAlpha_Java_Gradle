
pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out Java Gradle project'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Java application'
                sh 'chmod +x gradlew'
                sh './gradlew clean compileJava'
            }
        }

        stage('Test') {
            steps {
                echo 'Running JUnit test cases'
                sh './gradlew test'
            }
            post {
                always {
                    junit 'app/build/test-results/test/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                echo 'Creating executable JAR'
                sh './gradlew jar'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'app/build/libs/*.jar',
                             fingerprint: true
            echo 'CI/CD pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed. Check console logs.'
        }
    }
}
