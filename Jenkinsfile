pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }

    post {

        failure {

            emailext body: 'build failed',
                to: "${EMAIL_TO}",
                subject: 'Build failed in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER'
            }

        success {

            emailext body: 'build sucessful',
                to: "${EMAIL_TO}",
                subject: 'Build sucessful in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER'
        }
}