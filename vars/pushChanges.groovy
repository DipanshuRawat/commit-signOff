// vars/pushChanges.groovy

def call(String repoUrl, String credentialsId) {
    withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD')]) {
        sh "git push https://${GIT_USERNAME}:${GIT_PASSWORD}@${repoUrl} HEAD:main"
    }
}
