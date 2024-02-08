def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   return workingDir
}

def repoUrl = "https://github.com/Abu1215/demo-deploy.git"
def branch = "master" // Or whatever branch you want to checkout

def workingDir = call(repoUrl, branch)
