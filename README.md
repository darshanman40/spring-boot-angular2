# Special thanks to Travis CI GmbH and Emmanouil Gkatziouras
Please follow Travis's project on https://travis-ci.org/borysn/spring-boot-angular2
Please follow Emmanouil on https://dzone.com/users/1016019/Emmanouil_Gkatziouras.html

# purpose learning spring-boot, spring-data with Cassandara (using restful service) by creating a prototype.

# New changes, 
- replaced mysql connector with Cassandra connector and configurations to learn one of big data databases
- tutorial followed for that, https://dzone.com/articles/set-up-a-springdata-project-with-apache-cassandra

# Core details from Travis about the project

# upcoming changes 
- first class npm support
   * separate server run for front-end `localhost:3000`
       - managed through gradle, possibly bootRun or a new runAll
   * browser loading node modules
       - moving towards jspm or webpack
       - no more gulp copy libs
- possibly getting rid of gulp entirely
    * {sass/tsc transpile, html copy, load libs} all through npm
- **notes**
    * restful applications focus on back-end app servers, and front-end clients. this starter-kit should respect restful methodology.
        - ideally, the back-end and front-end client(s) are deployed separately 
    * for the sake of rapid prototyping, there's an opportunity to simplify the build process/dependency mgmt
    * despite separating back-end and front-end on different servers, it will still be possible to packages and ship these together
    * need a project structure wiki page, and will need to update wiki
    
# spring-boot-angular2 starter kit

Spring Boot with Angular2, Bootstrap4, TypeScript, Sass, Gradle, and Gulp.

## about

a starter project for prototyping restful applications with spring boot, angular2, and bootstrap4.

anuglar2 with es6 support. unit tests with jasmine.

## pre-install

1. install OpenJDK8
    - set `JAVA_HOME` environment variable
1. (optional) install latest gradle
    - otherwise just use `$ ./gradlew`
1. (optional) install python 2.7.x
    - set `PYTHON` environment variable
    - `$ gradle npminstall` may complain otherwise

## install

`$ git clone git@github.com:borysn/spring-boot-angular2`

## build & run

* `$ gradle clean build`
* `$ gradle bootRun`
* using browser, navigate to`localhost:8080`

## further reading

[wiki](https://github.com/borysn/spring-boot-angular2/wiki)

## example

check out my [RVEP](https://gitlab.com/borysn/RVEP/tree/dev) project. it's built and updated according to this starter kit!

## contribute

if you have any input, or contributions, please share!

## donations
[donate](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=4NPQ49B5NRV3E&lc=US&item_name=Borys%20Niewiadomski&currency_code=USD&bn=PP%2dDonationsBF%3abtn_donate_LG%2egif%3aNonHosted) a cup of coffe

## license
[MIT](/LICENSE)
