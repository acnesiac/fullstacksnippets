# backendsnippets

https://github.com/claudiajs/example-projects#web-api
https://github.com/eugenp/tutorials



aws lambda create-function --function-name "hello1" --runtime "nodejs6.10" --role "arn:aws:iam::938210480070:role/lambda_basic_execution" --handler "app/index.handler" --zip-file "fileb://c:/Users/a289431/app.zip" --region "us-east-1"



aws dynamodb create-table --table-name dynamo-test --attribute-definitions AttributeName=userid,AttributeType=S --key-schema AttributeName=userid,KeyType=HASH  --provisioned-throughput ReadCapacityUnits=1,WriteCapacityUnits=1   --query TableDescription.TableArn --output text
  


rails
http://railsapps.github.io/
https://github.com/RailsApps/learn-rails
git://github.com/RailsApps/rails-bootstrap.git
http://railsapps.github.io/rails-examples-tutorials.html
http://guides.rubyonrails.org/getting_started.html
sqlite3 --version
gem install rails
rails new blog
 cd blog
 rails server
http://localhost:3000/
mongo
show dbs;
use bookstore;
show collections;
db.createCollection(‘genres’);
db.createCollection(‘books’);
db.genres.insert({name:’suspense’});
db.genres.find();

webapp scaffolding
npm install --global yo gulp-cli bower 
npm install --global generator-webapp
yo webapp 
crea folder bower_components
gulp serve 
bower install --save <package> 
gulp serve:test 
gulp serve:dist
npm config set proxy http://pxgot5.srv.volvo.com:8080

npm
npm install jquery popper.js bootstrap  @material-ui/core redux react-router-dom react-hot-loader react-redux react-router-redux react-chartjs-2 chart.js fetch axios express mongoose connected-react-router redux-devtools-extension redux-logger superagent superagent-promise react-dom redux-devtools-extension redux-logger --save

npm i angular angular-route babel-cli babel-core babel-loader babel-minify babel-plugin-transform-object-rest-spread babel-preset-env babel-preset-minify babel-regenerator-runtime babel-register font-awesome html-webpack-plugin jquery lodash mongoose spdy vue vue-html-loader vue-loader vuex webpack webpack-cli webpack-dev-server

npm install axios react react-bootstrap react-document-title react-dom react-router-dom react-scripts react-syntax-highlighter  react-chartjs-2 chart.js 

generator-meanjs
npm install -g yo
npm install
npm install -g grunt
npm install -g generator-angular
npm install --global generator-jquery
yo jquery
npm install -g generator-webapp
npm install strip-ansi
npm install -g bower
npm install angular@1.4.3
npm install -g generator-backbone
npm install backbone
npm start
mean
npm install -g generator-mean
yo mean
grunt
yo meanjs
npm install jit-grunt --save-dev
meanio
$ git clone https://github.com/linnovate/mean.git
$ cd mean
$ npm install && npm start
bower
bower install jquery-ui
bower install jquery
$('html').css({ "background-color": "red", "padding": "5px solid #black" })
less
npm install -g generator-lessappRun: yo lessapp
bower install --save jquery
grunt wiredep
bower
bower list
bower install backbone -s         // to save into the bower file
bower install jquery
bower list --paths
bower install angular#1.4.3
grunt
grunt test
grunt serve
grunt test
grunt build
composer
composer require slim/slim “^3.0”
php
composer create-project slim/slim-skeleton
react
npm install react-bootstrap --save
npm install bootstrap@3 --save 
npm install -g generator-react-webpack
npm install --save react react-dom
npm install --save react-bootstrap
npm install --save react-router

node
meanio
mern
meanjs



redis

redis-server
redis-cli
set key ‘1’
set user:mary ‘marya dominguez’
angular-cli
npm install -g angular-cli
angular
yo angular
yo angular2
npm install -g yo generator-angular2
https://www.npmjs.com/package/generator-angular2  
yo ng-fullstack  
gulp
fullstack, meanio, meanjs,, ashup, boilerplate, jhipster
Vue
# install vue-cli
$ npm install --global vue-cli
# create a new project using the "webpack" template
$ vue init webpack my-project
# install dependencies and go!
$ cd my-project
$ npm install
$ npm run dev

tomcat
mvn tomcat7:run
jboss
mvn jboss-as:deploy	
spring boot, jetty
mvn clean compile jetty:run
mvn spring-boot:run

backbone
npm install -g generator-backbone
npm install -g generator-backbone-mocha
npm install --global generator-mocha
yo backbone # generates your application base and build workflow
yo backbone:model blog
yo backbone:collection blog
yo backbone:router blog
yo backbone:view blog
grunt serve
yo fullstack-backbone [app-name]
npm install -g yo grunt bower generator-fullstack-backbone
yo fullstack-backbone:all
grunt serve
laravel
https://blog.coffeedevs.com/crear-un-api-restful-con-laravel-5-2-parte-1/
composer global require "laravel/installer"
laravel new blog
composer create-project --prefer-dist laravel/laravel blog
composer create-project laravel/laravel --prefer-dist
php artisan list
php artisan make:controller UsersController
php artisan make:controller AvionController
php  artisan  make:model  Fabricante
php artisan make:model Project  
php artisan make:migration create_projects_table --create=projects
php artisan migrate  (importante )
php artisan db:seed
php artisan serve which will fire up PHP's built in webserver on port 8000. 
curl http://localhost:8000/api/v1/users
npm
npm install npm@latest
npm install -g express
npm install express body-parser ejs mongojs --save
express
node app
npm install -g nodemon
Advanced settings, admin
sysdm.cpl
Unix
grep -n -H -r  -- color "Transaction" .
 grep  -r --color "@Entity"
grep -n -H -r "mock" . *.java
grep -n -H -r "mock" Tudu-Lists/ hibernate-demos/
$ grep -n -H -r --color "@Persistence" . *.java
history | grep mvn

----------------------------------------------------------------------------------------------------------------------
Create a file
title > file.txt
