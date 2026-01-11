pipeline{
    agent any
    stages{
        stage('pull'){
            step{
            git branch: 'Dev', url: 'https://github.com/Ayushshaha1008/ginger-frontend.git'
            }
        }
        stage('Install-packages'){
            step{
                sh 'npm install'
            }
        }
        stage('Build'){
            step{
                sh 'npm run build'
            }
        }
        stage('Deploy'){
            step{
                sh 'aws s3 sync dist/ s3://ginger'
            }
        }
    }
}