(function() {
    "use strict";

    angular.module('app').service('MarkYourMemoryService', MarkYourMemoryService);

    MarkYourMemoryService.$inject = ['$q','$http'];

    function MarkYourMemoryService($q, $http) {

        var service = {
            responseResponseEntity: responseResponseEntity 
         };
        return service;

        function responseResponseEntity() {
            var deferred = $q.defer();
            var call = $http({
                url: '/marketing-company/all',
                method: 'GET',
		        params: {
		        }
            }).then(function(response) {
                deferred.resolve(response);
            }, function(response) {
                deferred.reject(null);
            });
            return deferred.promise;
        }
    }

})();
