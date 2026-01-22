def call(String testCmd) {
    echo "Running unit tests..."
    sh "mvn -B -Dstyle.color=never test"
}
