$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("vehicle.feature");
formatter.feature({
  "line": 1,
  "name": "Vehicle Registration",
  "description": "",
  "id": "vehicle-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1283657178,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Valid test"
    }
  ],
  "line": 4,
  "name": "Valid Registration",
  "description": "",
  "id": "vehicle-registration;valid-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user is on vehicle registartion website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters valid registartion",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "details of insurance are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "VehicleValidSteps.theUserIsOnVehicleRegistartionWebsite()"
});
formatter.result({
  "duration": 1127075883,
  "status": "passed"
});
formatter.match({
  "location": "VehicleValidSteps.userEntersValidRegistartion()"
});
formatter.result({
  "duration": 112114135,
  "status": "passed"
});
formatter.match({
  "location": "VehicleValidSteps.detailsOfInsuranceAreDisplayed()"
});
formatter.result({
  "duration": 629173399,
  "status": "passed"
});
formatter.after({
  "duration": 144257451,
  "status": "passed"
});
formatter.before({
  "duration": 848454342,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#negative scenario, message is displayed informing user that vehicle doesn\u0027t exists, wording of message can be defined based on requirement"
    }
  ],
  "line": 10,
  "name": "Blank Registration",
  "description": "",
  "id": "vehicle-registration;blank-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "the user is on vehicle registartion website",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enters invalid registartion",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "\"Sorry record not found\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "VehicleValidSteps.theUserIsOnVehicleRegistartionWebsite()"
});
formatter.result({
  "duration": 1388057799,
  "status": "passed"
});
formatter.match({
  "location": "VehicleValidSteps.userEntersInvalidRegistartion()"
});
formatter.result({
  "duration": 132344872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sorry record not found",
      "offset": 1
    }
  ],
  "location": "VehicleValidSteps.messageIsDisplayed(String)"
});
formatter.result({
  "duration": 585894464,
  "status": "passed"
});
formatter.after({
  "duration": 134227762,
  "status": "passed"
});
formatter.before({
  "duration": 835863793,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 16,
      "value": "#negative scenario"
    }
  ],
  "line": 17,
  "name": "Invalid Registration",
  "description": "",
  "id": "vehicle-registration;invalid-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "the user is on vehicle registartion website",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user leaves registartion blank",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "message to enter details is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "VehicleValidSteps.theUserIsOnVehicleRegistartionWebsite()"
});
formatter.result({
  "duration": 854957632,
  "status": "passed"
});
formatter.match({
  "location": "VehicleValidSteps.userLeavesRegistartionBlank()"
});
formatter.result({
  "duration": 31811624,
  "status": "passed"
});
formatter.match({
  "location": "VehicleValidSteps.messageToEnterDetailsIsDisplayed()"
});
formatter.result({
  "duration": 105379016,
  "status": "passed"
});
formatter.after({
  "duration": 123282031,
  "status": "passed"
});
});