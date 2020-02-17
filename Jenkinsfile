node {
   stage('Preparation') {
      git 'https://github.com/mdmjsh/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}