def call(String repoUrl, String branch = 'main', String credId = '') {
    echo "Cloning repository..."
    git branch: branch,
        url: repoUrl,
        credentialsId: credId
}
