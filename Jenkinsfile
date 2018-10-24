pipeline {
    agent any
    tools {
        maven 'localMarven'
    }

    stages {
    	stage ( 'Build') {
    		steps {
    		    sh 'mvn clean package'
    		}
    	}
	}
}

