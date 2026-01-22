def call(String status) {
    if (status == 'SUCCESS') {
        echo "Pipeline completed successfully"
    } else if (status == 'FAILURE') {
        echo "Pipeline failed"
    }
}
