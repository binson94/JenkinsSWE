pipeline {
    agent {
        label "demoAgent"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                //git branch:'main', url:'https://github.com/binson94/JenkinsSWE.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"


                // To run Maven on a Windows agent, use
                //bat "mvn clean test"
            }
        }
    }
}
