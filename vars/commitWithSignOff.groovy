// vars/commitWithSignOff.groovy

def call(String commitMessage) {
    sh "git commit -s -m '${commitMessage}'"
}
