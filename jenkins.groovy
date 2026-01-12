pipeline{
    agent any
    stages{
        stage('pull'){
            steps{
            git branch: 'Dev', url: 'https://github.com/Ayushshaha1008/ginger-frontend.git'
            }
        }
        stage('Install-packages'){
            steps{
                sh 'npm install'
            }
        }
        stage('Build'){
            steps{
                sh 'npm run build'
            }
        }
        stage('Deploy'){
            steps{
                sh 'aws s3 sync dist/ s3://ginger-frontend-buzz'
            }
        }
    }
}