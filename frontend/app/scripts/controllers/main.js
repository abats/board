/*global $:false */
'use strict';

/**
 * @ngdoc function
 * @name retrobatsApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the retrobatsApp
 */
angular.module('retrobatsApp')
    .controller('MainCtrl', function ($scope, retroFactory) {

        $scope.makeDraggable = function(){
            //TODO: how to do this for only the element loaded.
            $( document ).ready(function() {
                $('.sticky-note').draggable({stack: 'div'});
            });
        };

        retroFactory.getMessages()
            .success(function (response) {
                $scope.messages = response;
            });

        retroFactory.getNotes()
            .success(function (response) {
                $scope.notes = response;
            });


    });
