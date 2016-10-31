'use strict';

angular.module('myApp.view1', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/view1', {
            templateUrl: 'view1/view1.html',
            controller: 'LightsController',
        });
    }])

    .controller('LightsController', function ($scope, $http) {

        $scope.setLightState = function (index) {
            var request;
            var currentState = this.light.state;
            currentState.on = !currentState.on;

//            window.alert(this.light + ':' + index + ':' + currentState + ':' + newState);
            //request = angular.toJson(this.light, false);

            request = angular.toJson(currentState);
            var lightIndex = index+1;
            try {
                // window.alert(index);
                // window.alert(newState);
                $http.put('/light/'+lightIndex , request).then(function (response) {
                    //this.light.state.on = newState;
                    //window.alert(JSON.stringify(response));
                    // window.alert("PUT request executed.");
                }, function () {
                    window.alert("PUT request forked up.");
                    return;
                });
            }
            catch(exception) {
                window.alert(exception.toString());
                return;
            }

            //window.alert("I have to assume that the put request succeeded.");
            //$scope.light.state = currentState;
            $scope.lights[index].state = currentState;
        };


        $scope.getLights = function () {
            // $scope.nameFilter = null;
            // $scope.lights = [];
            // $scope.searchFilter = function (light) {
            //     var keyword = new RegExp($scope.nameFilter, 'i');
            //     return !$scope.nameFilter || keyword.test(light.name);
            // };

            $http.get('/lights').then(function (response) {
                $scope.lights = response.data.lightArray;

            });
        }
    });




