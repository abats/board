'use strict';

/**
 * @ngdoc function
 * @name retrobatsApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the retrobatsApp
 */
angular.module('retrobatsApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
