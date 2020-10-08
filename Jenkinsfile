pipeline {
    agent any
      tools { 
        Maven
      
    }

    stages {
        stage('---clean---') {
            steps {
                sh "mvn clean"
            }
        }
        stage('--test--') {
            steps {
                 sh "mvn test"
            }
        }
        stage('--package--') {
            steps {
               sh "mvn package"
            }
        }
    }
}
