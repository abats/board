'use strict';

describe('Service: retroService', function () {

  // load the service's module
  beforeEach(module('retrobatsApp'));

  // instantiate service
  var retroService;
  beforeEach(inject(function (_retroService_) {
    retroService = _retroService_;
  }));

  it('should do something', function () {
    expect(!!retroService).toBe(true);
  });

});
