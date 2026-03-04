pipeline {
    agent any

    tools {
            maven 'Maven 3.9.12'
        }

        environment {
            IMAGE_NAME = 'project-assignments'
            TAG = 'latest'
        }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/irakump/project-assignments.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
        stage('Docker Build') {
                    steps {
                        // Create docker image
                        bat 'docker build -t %IMAGE_NAME%:%TAG% .'
                    }
        }

        // Optional: push to Docker Hub - needs Docker_hub credentials in Jenkins
        /*
        stage('Docker Push') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'Docker_Hub') {
                        docker.image("%IMAGE_NAME%:%TAG%").push()
                    }
                }
            }
        }
       */


    }
}
