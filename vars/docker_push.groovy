def call{String credsId, String imageName){
  withCredentials([usernamePassword(
                    credentialsId:"${credsId}",
                    passwordVariable: "dockerHubPass",
                    usernameVariable: "dockerHubUser",
                )]){
                    
                sh "docker login -u $dockerHubUser -p $dockerHubPass"
                sh "docker image tag ${imageName} $dockerHubUser/${imageName}"
                sh "docker push $dockerHubUser/${imageName}:latest"
                }
}
