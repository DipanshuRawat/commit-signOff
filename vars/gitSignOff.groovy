//#!/usr/bin/env groovy

def call(String name, String email) {
    // Define the sign-off message
    def signOffMessage = "Signed-off-by: ${name} <${email}>"

    // Append the sign-off message to the commit
    sh """
        echo "${signOffMessage}" >> .git/COMMIT_EDITMSG
        git commit --amend --no-edit
    """
}
