const https = require("https");
const url = "https://jsonplaceholder.typicode.com/posts/1";
https.get('https://jsonplaceholder.typicode.com/todos/1')
  .then(response => response.json())
  .then(json => {console.log(json)})

