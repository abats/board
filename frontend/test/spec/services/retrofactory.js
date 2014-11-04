'use strict';

describe('Service: retroFactory', function () {

  // load the service's module
  beforeEach(module('retrobatsApp'));

  // instantiate service
  var retroFactory;
  beforeEach(inject(function (_retroFactory_) {
    retroFactory = _retroFactory_;
  }));

  it('should do something', function () {
    expect(!!retroFactory).toBe(true);
  });

});
