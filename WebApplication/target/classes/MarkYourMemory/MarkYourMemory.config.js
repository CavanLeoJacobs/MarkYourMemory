(function() {
    "use strict";
    var app = angular.module('app');

    app.$inject=['$stateProvider'];

    app.config(function($stateProvider) {
        var MarkYourMemoryState = {
            name : 'MarkYourMemory',
            url : '/MarkYourMemory',
            templateUrl : '/view/MarkYourMemory',
            controller: 'MarkYourMemoryController as MarkYourMemory'
        };
        $stateProvider.state(MarkYourMemoryState);
    });

})();