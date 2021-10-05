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

            emailext attachLog: true, subject: "failure hello world", body: "failure hello world", to: "sunil.ssb@gmail.com"

            }

        success {

            emailext  subject: "success hello world", body: "success hello world", to: "sunil.ssb@gmail.com"



        }
    }
}