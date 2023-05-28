$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for all Scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Can View Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_Can_View_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customer Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customer_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for all Scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Can View Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_Can_View_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customer\tby Email id",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customer Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customer_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer Email",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_customer_Email()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on WINDOWS (4bdc65e1e120556d7f10361a10292628)] -\u003e id: SearchEmail] (tried for 30 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ADMIN\u0027, ip: \u0027192.168.43.133\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.127, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: C:\\Users\\BHARATH\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:49398}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 4bdc65e1e120556d7f10361a10292628\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utilites.WaitHelper.waitforelement(WaitHelper.java:16)\r\n\tat pageObjects.SearchCustomerPage.setEmail(SearchCustomerPage.java:52)\r\n\tat stepDefinations.Steps.enter_customer_Email(Steps.java:168)\r\n\tat ✽.Enter customer Email(file:Features/Customers.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should find email in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_find_email_in_the_search_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Below are the common steps for all Scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Can View Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_Can_View_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customer\tby Name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customer Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customer_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_customer_FirstName()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on WINDOWS (4f251ba8de60f333f3568d3d64346f01)] -\u003e id: SearchFirstName] (tried for 30 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ADMIN\u0027, ip: \u0027192.168.43.133\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.127, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: C:\\Users\\BHARATH\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:49683}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 4f251ba8de60f333f3568d3d64346f01\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utilites.WaitHelper.waitforelement(WaitHelper.java:16)\r\n\tat pageObjects.SearchCustomerPage.setFirstName(SearchCustomerPage.java:57)\r\n\tat stepDefinations.Steps.enter_customer_FirstName(Steps.java:184)\r\n\tat ✽.Enter customer FirstName(file:Features/Customers.feature:31)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter customer LastName",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_customer_LastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should find Name in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_find_Name_in_the_search_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});