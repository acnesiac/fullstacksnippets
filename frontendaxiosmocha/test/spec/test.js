(function () {
  'use strict';

  describe('Give it some context', function () {
    describe('context here', function () {
      it('should run here few assertions', function () {
        assert.equal(sum(), 1);
      });
    });
  });

  describe('Give it some context', function () {
    describe('context here', function () {
      it('should run here few assertions', function () {
        assert.equal([1, 2, 3].indexOf(4), -1);
      });
    });
  });

})();
