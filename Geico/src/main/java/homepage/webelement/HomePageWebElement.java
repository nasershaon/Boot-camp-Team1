package homepage.webelement;

import common.WebAPI;

public class HomePageWebElement extends WebAPI {

    public static final String xPathLeftMenu = "//ul[@class='desktop-links']//a[contains(text(),'Insurance')]";
    public static final String xPathInformation = "//a[contains(text(),'Information')]";
    public static final String xPathMainMenu = "//a[@class='icon-geico icon-geicoween']";
    public static final String xPathGps = "//a[@class='location header-right-label']//span[@class='icon-geolocation']";
    public static final String xPathZipCode = "//form[@id='geo-box']//input[@placeholder='ZIP Code']";
    public static final String xPathZipCodeSubmit = "//button[@id='geo-submit']";
    public static final String xPathLogIn = "//a[@class='login header-right-label']";
    public static final String xPathSearchButton = "//*[@id=\"header-right-links\"]/ul[1]/li[3]/a/span";
    public static final String xPathVehicleInsurance = "//body/nav[@id='primary-navigation']/div[2]/ul[1]/li[1]/a[1]";
    public static final String xPathPropertyInsurance="//body/nav[@id='primary-navigation']/div[2]/ul[1]/li[2]/a[1]";
    public static final String xPathBusinessInsurance="/html[1]/body[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]";
    public static final String xPathAdditionalInsurance="//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/a";
    public static final String xPathMyAccount="//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/a";
    public static final String xPathClaims="//*[@id=\"primary-navigation\"]/div[3]/ul/li[2]/a";
    public static final String xPathTools="//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/a/span[2]";
    public static final String xPathAbout="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]";
    public static final String xPathWebAndMobile="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/a";
    public static final String xPathContactUs="//*[@id=\"primary-navigation\"]/div[3]/ul/li[6]/a/span[2]";
    public static final String xPathVehicleInsuranceAuto="//li[@class='geico-nav--denim section--denim open']//li[1]//a[1]//span[1]";
    public static final String xPathVehicleInsuranceMotor="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[2]/a/span";
    public static final String xPathVehicleInsuranceAtv="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[3]/a";
    public static final String xPathVehicleInsuranceRv="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[4]/a/span";
    public static final String xPathVehicleInsuranceBoat="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[5]/a/span";
    public static final String xPathVehicleInsuranceCollector="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[6]/a/span";
    public static final String xPathVehicleInsuranceRideshare="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[7]/a";
    public static final String xPathVehicleInsuranceCommercial="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[8]/a/span";
    public static final String xPathVehicleInsuranceMexico="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[9]/a";
    public static final String xPathVehicleInsuranceAutoPage="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[1]/a";
    public static final String xPathVehicleInsuranceAutoPageZip="//input[@id='zip']";
    public static final String xPathReviewQuote="//*[@id=\"submit\"]]";
    public static final String xPathHomeOwners="//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/div/ul/li[1]/a";
    public static final String xPathRenters="//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/div/ul/li[2]/a/span";
    public static final String xPathCondo="//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/div/ul/li[3]/a/span";
    public static final String xPathMobileHome="//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/div/ul/li[4]/a/span";
    public static final String xPathLandLord="//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/div/ul/li[4]/a/span";
    public static final String xPathFlood="//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/div/ul/li[6]/a/span";
    public static final String xPathBusinessOwner="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[1]/a/span";
    public static final String xPathGeneralLiability="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[2]/a/span";
    public static final String xPathProfessionalLiability="/html[1]/body[1]/nav[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/a[1]/span[1]";
    public static final String xPathWorkerCompensation="//li[@class='geico-nav--denim section--denim open']//li[4]//a[1]";
    public static final String xPathMedicalMalpractice="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[5]/a";
    public static final String xPathWellnessFitness="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[6]/a/span";
    public static final String xPathCommercialAuto="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[7]/a/span";
    public static final String xPathRideShare="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[8]/a";
    public static final String xPathUmbrella="//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[1]/a";
    public static final String xPathLife="//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[2]/a/span";
    public static final String xPathTravel="//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[3]/a/span";
    public static final String xPathOverseas="//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[4]/a/span";
    public static final String xPathIdentityProtection="//li[@class='geico-nav--denim section--denim open']//li[5]//a[1]";
    public static final String xPathPet="//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[6]/a/span";
    public static final String xPathJewelry="//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[7]/a/span";
    public static final String xPathMakeAPayment="//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[1]/a";
    public static final String xPathGoPaperless="//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[4]/a/span";
    public static final String xPathGetIDCards="//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[2]/a/span";
    public static final String xPathAddAVehicle="//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[3]/a/span";
    public static final String xPathCreateOnlineAccount="//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[5]/a/span";
    public static final String xPathGEICOMobileApp="//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[6]/a/span";
    public static final String xPathFAQs="//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[7]/a";
    public static final String xPathReportAClaim="//*[@id=\"primary-navigation\"]/div[3]/ul/li[2]/div/ul/li[1]/a/span";
    public static final String xPathAboutTheClaimsProcess="//*[@id=\"primary-navigation\"]/div[3]/ul/li[2]/div/ul/li[7]/a/span";
    public static final String xPathAboutAutoRepairXpress="//*[@id=\"primary-navigation\"]/div[3]/ul/li[2]/div/ul/li[8]/a/span";
    public static final String xPathInsuranceTerms="//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/div/ul/li[13]/a/span";
    public static final String xPathParkingLocator="//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/div/ul/li[14]/a/span";
    public static final String xPathVehicleInspectionSites="//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/div/ul/li[15]/a";
    public static final String xPathCareers="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[1]/a";
    public static final String xPathCorporateInformation="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[2]/a/span";
    public static final String xPathAgencyOwnership="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[3]/a";
    public static final String xPathInTheCommunity="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[4]/a";
    public static final String xPathPressReleases="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[5]/a/span";
    public static final String xPathB2BServices="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[6]/a/span";
    public static final String xPathOrganizationDiscount="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[7]/a/span";
    public static final String xPathAssociatesRetirees="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[8]/a";
    public static final String xPathInsurers="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[9]/a/span";
    public static final String xPathGEICOCommercials="//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[10]/a/span";
    public static final String xPathGMobileApp="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/div/ul/li[1]/a/span";
    public static final String xPathAmazonAlexaSkill="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/div/ul/li[2]/a/span";
    public static final String xPathGoogleAction="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/div/ul/li[3]/a";
    public static final String xPathGEICOLiving="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/div/ul/li[4]/a/span";
    public static final String xPathGEICOSequels="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/div/ul/li[5]/a";
    public static final String xPathSocialMedia="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/div/ul/li[6]/a/span";
    public static final String xPathSiteMap="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/div/ul/li[7]/a/span";
    public static final String xPathAccessibility="//*[@id=\"primary-navigation\"]/div[3]/ul/li[5]/div/ul/li[8]/a/span";
    public static final String xPathSearchGeico="//*[@id=\"primary-navigation\"]/div[6]/form/input";
    public static final String xPathSearchEnter="//*[@id=\"primary-navigation\"]/div[6]/form/button";
    public static final String xPathMotorcycle="//*[@id=\"search\"]/div[2]/div/div[2]/div[9]/div/div[1]/div/h2/a";
    public static final String xPathValidateMotorcycle="//*[@id=\"headline\"]/div/div/div[1]/div/h1";
    public static final String xPathValidate15Min="//*[@id=\"headline\"]/div/div/div[1]/div/h2";
    public static final String xPathStartQuote="//*[@id=\"submitBtn\"]/button";
    public static final String xPathINeedInsuranceRightAway="//*[@id=\"auto-customer-collect-intent-modal\"]/div/div/div/div/div/div[1]/div[1]/label";
    public static final String xPathBeingQuote="//button[contains(text(),'Begin Quote')]";
    public static final String xPathDateOFBirthMonth="//*[@id=\"date-monthdob\"]";
    public static final String xPathDateOFBirthDate="//*[@id=\"date-daydob\"]";
    public static final String xPathDateOFBirthYear="//*[@id=\"date-yeardob\"]";
    public static final String xPathDateOFBirthNext="//*[@id=\"question-breakdown\"]/div/div/div/div[3]/div[1]/div[2]/div/div[2]/div/button";
    public static final String xPathDateOFBirthFirstName="//*[@id=\"firstName\"]";
    public static final String xPathDateOFBirthLastName="//*[@id=\"lastName\"]";
    public static final String xPathDateOFBirthBackButton="//div[@class='col-md-6 pull-left']//div//div[@class='back-link-content']";
    public static final String xPathDateOFBirthBackNext="//*[@id=\"question-breakdown\"]/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/button";
    public static final String xPathDateOFBirthBackAddress="//input[@id='street']";
    public static final String xPathDateOFBirthBackAddressApt="//input[@id='apt']";
    public static final String xPathDateOFBirthBackAddressZip="//input[@id='zip']";
    public static final String xPathDateOFBirthBackAddressNext="//*[@id=\"question-breakdown\"]/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/button";
    public static final String xPathVehicleYear="//select[@id='vehicleYear']";
    public static final String xPathVehicleYear2014="//option[contains(text(),'2014')]";
    public static final String xPathVehicleMark="//select[@id='vehicleMake']";
    public static final String xPathVehicleMarkToyota="//option[contains(text(),'Toyota')]";
    public static final String xPathVehicleModel="//select[@id='vehicleModel']";
    public static final String xPathVehicleModelCamry="//option[contains(text(),'Camry L/LE/SE/XLE')]";
    public static final String xPathVehicleModelCamryNext="//div[@class='pull-right']//button[@class='btn btn--primary btn--full-mobile no-margin--right'][contains(text(),'Next')]";
    public static final String xPathAntiTheftDevice="//select[@id='antiTheftDevice']";
    public static final String xPathAntiTheftDeviceAlarm="//option[contains(text(),'Alarm Device Only(Type 1)')]";
    public static final String xPathAntiTheftDeviceNext="//div[contains(@class,'pull-right')]//button[contains(@class,'btn btn--primary btn--full-mobile no-margin--right')][contains(text(),'Next')]";
    public static final String xPathOwnedButton="//div[contains(@class,'radio-button-wrapper')]//div//div[1]//label[1]";
    public static final String xPathOwnedButtonNext="//div[contains(@class,'radio-button-wrapper')]//div//div[1]//label[1]";
    public static final String xPathCommuteToSchool="//span[contains(text(),'Commute (to work or school)')]";
    public static final String xPathPleasure="//label[contains(text(),'Pleasure')]";
    public static final String xPathBusinessSales="//label[contains(text(),'Business (sales calls, etc.)')]";
    public static final String xPathDaysDriven="//select[@id='daysDriven']";
    public static final String xPathDaysDriven6="//option[contains(text(),'6')]";
    public static final String xPathMilesDriven="//input[@id='milesDriven']";
    public static final String xPathMilesDrivenNext="//div[@class='pull-right']//button[@class='btn btn--primary btn--full-mobile no-margin--right'][contains(text(),'Next')]";
    public static final String xPathAnnualMileage="//select[@id='annualMileage']";
    public static final String xPathAnnualMileageNextButton="//div[contains(@class,'pull-right')]//button[contains(@class,'btn btn--primary btn--full-mobile no-margin--right')][contains(text(),'Next')]";
    public static final String xPathClaimsCenter="//a[@class='btn btn--primary btn--full-mobile']";
    public static final String xPathFeedback="//div[@class='olUp']";
    public static final String xPathTextAreaComments="//textarea[@id='comments']";
    public static final String xPathChildSubmit="//input[@name='Submit']";
    public static final String xPathOverallValue="//input[@id='o5']";
    public static final String xPathAcceptCookeButton="//input[@id='cookie-notice-close']";
    public static final String xPathFacebookTab="//a[@class='geico-icon geico-icon--actionable icon-linkedin exitpage']";
    public static final String searchBox="//span[@class='icon-search right-icons-separator']";
    public static final String searchBoxValue="//div[@class='panel-wrapper right search no-mobile open']//input[@name='term']";
    public static final String searchBoxValueInside="//input[@placeholder='Please enter a word or phrase']";










    //public String final String Action.
    //public String final String Action.
}
