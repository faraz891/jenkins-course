job('NodeJS example') {
    scm {
        git('git://github.com/faraz891/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('faraz891')
            node / gitConfigEmail('faraz891@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
