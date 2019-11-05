import axios from 'axios';
function getTodos(){
      axios.get('http://jsonplaceholder.typicode.com/todos/1')
    .then(function (response) {
		console.log(response);
    })
    .catch(function (error) {
		console.log(response);
    });   
	
}
module.exports = getTodos;