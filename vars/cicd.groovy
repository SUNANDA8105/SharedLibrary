def newGit(repo){
git "${repo}"
}
def newMaven(){
sh 'mvn package'
}
def newDeploy(ip,appname){
  deploy adapters: [tomcat9(credentialsId: '8e0a0c6d-92d5-454c-8750-dd2db08e6daf', path: '', 
                            url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
                            }
