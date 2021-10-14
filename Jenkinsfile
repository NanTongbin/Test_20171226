node { 
    stage('Build') { 
        echo 'make' 
    }
    stage('Test') {
        echo 'make check'
    }
    stage('Deploy') {
        echo 'make publish'
    }
	stage('build'){
        withCredentials([file(credentialsId: '94890940-b1a2-4ef1-93f5-5fb52732a6c6', variable: 'u_name'), file(credentialsId: 'a5fbcfd4-306f-434e-acf4-ab25e8f78b01', variable: 'u_pwd')]) {
		    echo "username= ${u_name}"
			echo "password= ${u_pwd}"
	    }
    }
}