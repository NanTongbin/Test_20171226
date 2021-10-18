pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps { 
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                withCredentials([file(credentialsId: '94890940-b1a2-4ef1-93f5-5fb52732a6c6', variable: 'u_name'), file(credentialsId: 'a5fbcfd4-306f-434e-acf4-ab25e8f78b01', variable: 'u_pwd')]) {
                    echo "username= ${u_name}"
                }
            }
        }
    }

}
