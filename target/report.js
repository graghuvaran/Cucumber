$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ADMIN/eclipse-workspace/cucumber/src/test/resources/feature/twodmap.feature");
formatter.feature({
  "name": "To add the tariff plan",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To add the tariff plan",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user should be in telecom page",
  "keyword": "Given "
});
formatter.match({
  "location": "Tariff.the_user_should_be_in_telecom_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user shoukd click the add tariff plan",
  "keyword": "And "
});
formatter.match({
  "location": "Tariff.the_user_shoukd_click_the_add_tariff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should provide valide details",
  "rows": [
    {
      "cells": [
        "rent",
        "lmin",
        "imin",
        "smspack",
        "mincharge",
        "intercharges",
        "smscharges"
      ]
    },
    {
      "cells": [
        "1000",
        "60",
        "120",
        "36",
        "50",
        "80",
        "40"
      ]
    },
    {
      "cells": [
        "2000",
        "40",
        "150",
        "46",
        "10",
        "100",
        "140"
      ]
    },
    {
      "cells": [
        "3000",
        "80",
        "300",
        "56",
        "20",
        "120",
        "250"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Tariff.the_user_should_provide_valide_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should validate the customer id",
  "keyword": "Then "
});
formatter.match({
  "location": "Tariff.the_user_should_validate_the_customer_id()"
});
formatter.result({
  "status": "passed"
});
});