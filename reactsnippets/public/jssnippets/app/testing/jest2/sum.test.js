const sum = require('./sum');
const todos = require('./ajaxcall');

test('adds 1 + 2 to equal 3', () => {
  expect(sum(1, 2)).toBe(3);
});


test('todos', () => {
  

  expect(todos()).toBe({
  "userId": 1,
  "id": 1,
  "title": "delectus aut autem",
  "completed": false
});

});