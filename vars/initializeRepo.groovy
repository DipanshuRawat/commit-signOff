// vars/initializeRepo.groovy

def call(String repoUrl, String gitName, String gitEmail) {
    sh 'git init'
    sh "git config user.name '${gitName}'"
    sh "git config user.email '${gitEmail}'"

    // Check if the remote 'origin' already exists
    sh """
        if git remote | grep -q origin; then
            echo "Remote origin already exists. Updating URL..."
            git remote set-url origin '${repoUrl}'
        else
            echo "Adding remote origin..."
            git remote add origin '${repoUrl}'
        fi
    """
}
