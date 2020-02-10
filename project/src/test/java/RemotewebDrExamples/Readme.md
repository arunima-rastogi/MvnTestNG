# Steps to Configure RemoteWebDriver -

## Begin selenium hub on host with
java -jar selenium-server-standalone-3.12.0.jar -role hub

## Begin selenium node on Ubuntu machine with
java -Dwebdriver.chrome.driver="<full path to driver>" -jar selenium-server-standalone-3.12.0.jar -role node -hub http://<ip of host machine>:4444/grid/register
## Create and run following code on the host machine
@Test
public void test() throws MalformedURLException {
	DesiredCapabilities desCap = DesiredCapabilities.chrome();
	desCap.setPlatform(Platform.ANY);
	WebDriver remoteWebDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desCap);
	remoteWebDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	remoteWebDriver.get("http://www.google.com");
	remoteWebDriver.close();
}
