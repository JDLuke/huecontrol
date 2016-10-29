angularmodule('heyHue.controllers', []).
controller('Light', function($scope, $http) {
    $http.get('http://localhost:8080/light/5').
        then(function(response) {
            $scope.light = response.data;
        });
}).

controller('Lights', function($scope, $http) {
  $http.get('http://localhost:8080/lights').
    then(function(response) {
      $scope.lights=response.data;
      });
});