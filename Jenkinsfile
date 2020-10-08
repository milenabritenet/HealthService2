pipeline {
    agent any
      tools { 
      maven "Maven"
    }

    stages {
        stage('---clean---') {
            steps {
                bat "mvn clean"
            }
        }
        stage('--test--') {
            steps {
                bat "mvn test"
            }
        }
        stage('--package--') {
            steps {
               bat "mvn package"
            }
        }
    }
}
