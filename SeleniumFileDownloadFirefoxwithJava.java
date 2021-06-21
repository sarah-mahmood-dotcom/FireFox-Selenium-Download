// To download file in Firefox
String downloadFilepath = "Your Download Path";

FirefoxOptions options = new FirefoxOptions();
options.setAcceptInsecureCerts(true);
options.addPreference("browser.download.folderList", 1);
options.addPreference("browser.helperApps.alwaysAsk.force", false);
options.addPreference("browser.download.dir", downloadFilepath); 
options.addPreference("browser.download.defaultFolder",downloadFilepath); 
options.addPreference("browser.download.manager.showWhenStarting", false);
options.addPreference("browser.helperApps.neverAsk.saveToDisk","application/download, application/excel, application/octet-stream, text/csv"); //;application/octet-stream
//options.addPreference("browser.helperApps.neverAsk.saveToDisk","multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream");
FirefoxDriver driver = new FirefoxDriver(options);

driver.navigate().to("Your Site");
