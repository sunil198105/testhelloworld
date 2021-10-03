pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    environment {
                    EMAIL_TO = 'sunil.ssb@gmail.com'
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

            emailext body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test'

            }

        success {

            emailext  subject: "success hello world", body: "success hello world", to: "sunil.ssb@gmail.com"



        }
    }
}