pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Checking') {
            steps {
                echo 'Checking World'
            }
        }
        stage('Checked') {
            steps {
                echo 'Checked World'
            }
        }
    }
}
