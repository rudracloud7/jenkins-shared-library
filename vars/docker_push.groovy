def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerHubPass', usernameVariable: sh "docker login -u ${docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
                sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
