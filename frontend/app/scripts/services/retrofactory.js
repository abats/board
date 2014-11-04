'use strict';

/**
 * @ngdoc service
 * @name retrobatsApp.retroFactory
 * @description
 * # retroFactory
 * Factory in the retrobatsApp.
 */
angular.module('retrobatsApp').factory('retroFactory', ['$http', function ($http) {
    var urlBase = 'http://localhost:9080/retrobats/rest';

    return {
        getMessages: function () {
            return $http.get(urlBase + '/hello/messages');
        },
        getNotes: function () {
            return $http.get(urlBase + '/hello/notes');
        }
    };
}]);
