const visa = require('../visa/visa');
visa();
test('hello world', () => {
  expect(visa()).toEqual('hello world');
});
