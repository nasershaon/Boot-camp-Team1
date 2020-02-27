package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class HomePage extends HomePageWebElement {

    //@Test 1 Left Menu
    @FindBy(how= How.XPATH,using = HomePageWebElement.xPathLeftMenu)
    public static WebElement homeLeftMenu;
    public static WebElement getHomeLeftMenu(){return homeLeftMenu; }
    public static  void clickHomeMenu(){
        getHomeLeftMenu().click();
    }
    //@test2 Information Menu
    @FindBy(how= How.XPATH,using = HomePageWebElement.xPathInformation)
    public static WebElement informationButton;
    public static WebElement getInformationButton(){return informationButton; }
    public static  void clickInformation(){
        getInformationButton().click();
    }
    //@test3 Main menu
    @FindBy(how= How.XPATH,using = HomePageWebElement.xPathMainMenu)
    public static WebElement mainMenu;
    public static WebElement getMainMenu(){return mainMenu;}
    public static  void clickMainMenu(){
        getMainMenu().click();
    }
    //@test4 <<< Gps Button>>
    @FindBy(how = How.XPATH,using = HomePageWebElement.xPathGps)
    public static WebElement gps;
    public static WebElement getGps(){return gps;}
    public static void clickGps(){
        getGps().click();
    }
    //@test5 <<zip Code Field>>
    @FindBy(how = How.XPATH,using = HomePageWebElement.xPathZipCode)
    public static WebElement zipCode;
    public static WebElement getZipCode(){return zipCode;}
    public static void clickZipCode(){
        getZipCode().sendKeys("11209");
    }
    //@test6 << Login menu checking>>
    @FindBy(how = How.XPATH,using = HomePageWebElement.xPathLogIn)
    public static WebElement login;
    public static WebElement getLogin(){return login;}
    public static void clickOnLogin(){
        getLogin().click();
    }
    //@test7 <<Search Button checking>>
    @FindBy(how = How.XPATH,using = HomePageWebElement.xPathSearchButton)
    public static WebElement SearchButton;
    public static WebElement getSearchButton(){return SearchButton;}
    public static void clickOnSearchButton(){
        getSearchButton().click();
    }
    //@test8 <<<VehicleInsurance>>>
    @FindBy(how = How.XPATH,using = xPathVehicleInsurance)
    public static WebElement InsuranceMenu;
    public static WebElement getInsuranceMenu(){return InsuranceMenu;}
    public static void hoverVehicleInsurance() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsurance);
    }
    //@test9 <<PropertyInsurance>>
    @FindBy(how = How.XPATH,using = HomePageWebElement.xPathPropertyInsurance)
    public static WebElement propertyInsurance;
    public static WebElement getPropertyInsurance(){return SearchButton;}
    public static void hoverOnPropertyInsurance(){
        mouseHoverByXpath(xPathPropertyInsurance);
    }
    //@test10  <<BusinessInsurance>>
    @FindBy(how = How.XPATH,using = xPathBusinessInsurance)
    public static WebElement businessInsurance;
    public static WebElement getBusinessInsurance(){return businessInsurance;}
    public static void hoverBusinessInsurance() throws InterruptedException {
        mouseHoverByXpath(xPathBusinessInsurance);
    }
    //test11  <<AdditionalInsurance>>
    @FindBy(how = How.XPATH,using = xPathAdditionalInsurance)
    public static WebElement additionalInsurance;
    public static WebElement getAdditionalInsurance(){return additionalInsurance;}
    public static void hoverAdditionalInsurance() throws InterruptedException {
        mouseHoverByXpath(xPathAdditionalInsurance);
    }
    //test11  <<MyAccount>>
    @FindBy(how = How.XPATH,using = xPathMyAccount)
    public static WebElement MyAccount;
    public static WebElement getMyAccount(){return MyAccount;}
    public static void hoverMyAccount() throws InterruptedException {
        mouseHoverByXpath(xPathMyAccount);
    }
    //test12  <<Claims>>
    @FindBy(how = How.XPATH,using = xPathClaims)
    public static WebElement claims;
    public static WebElement getClaims(){return claims;}
    public static void hoverClaims() throws InterruptedException {
        mouseHoverByXpath(xPathClaims);
    }
    //test 13 <<tools>>
    @FindBy(how = How.XPATH,using = xPathTools)
    public static WebElement tools;
    public static WebElement getTools(){return tools;}
    public static void hoverTools() throws InterruptedException {
        mouseHoverByXpath(xPathTools);
    }
    //test 14 <<About>>
    @FindBy(how = How.XPATH,using = xPathAbout)
    public static WebElement about;
    public static WebElement getAbout(){return about;}
    public static void hoverAbout() throws InterruptedException {
        mouseHoverByXpath(xPathAbout);
    }
    //test 15 <<web and mobile>>
    @FindBy(how = How.XPATH,using = xPathWebAndMobile)
    public static WebElement webAndMobile;
    public static WebElement getWebAndMobile(){return webAndMobile;}
    public static void hoverWebAndMobile() throws InterruptedException {
        mouseHoverByXpath(xPathWebAndMobile);
    }
    //test 16 <<Checking contact Us Button>>
    @FindBy(how = How.XPATH,using = xPathContactUs)
    public static WebElement contactUs;
    public static WebElement getContactUs(){return contactUs;}
    public static void hoverContactUs() throws InterruptedException {
        mouseHoverByXpath(xPathContactUs);
    }
    //test 17 <<vehicleInsurance Auto Mouse Hover>>
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceAuto)
    public static WebElement vehicleInsuranceAuto;
    public static WebElement getVehicleInsuranceAuto(){return vehicleInsuranceAuto;}
    public static void hoverVehicleInsuranceAuto() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceAuto);
        vehicleInsuranceAuto.click();
    }
    //test 18<< vehicleInsurance MotorCyle MouseHOver>>
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceMotor)
    public static WebElement vehicleInsuranceMotor;
    public static WebElement getVehicleInsuranceMotor(){return vehicleInsuranceMotor;}
    public static void hoverVehicleInsuranceMotor() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceMotor);
        vehicleInsuranceMotor.click();
    }
    //test 19 <<vehicleInsuranceAtv Mosue hover>>
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceAtv)
    public static WebElement vehicleInsuranceAtv;
    public static WebElement getVehicleInsuranceAtv(){return vehicleInsuranceAtv;}
    public static void hoverVehicleInsuranceAtv() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceAtv);
        vehicleInsuranceAtv.click();
    }
    //test 20 <<VehicleInsurance Rv Mosue hover>>
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceRv)
    public static WebElement vehicleInsuranceRv;
    public static WebElement getVehicleInsuranceRv(){return vehicleInsuranceRv;}
    public static void hoverVehicleInsuranceRv() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceRv);
        sleepFor(2);
        vehicleInsuranceRv.click();
    }
    //test 21 <<VehicleInsuranceBoat Boat>>
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceBoat)
    public static WebElement vehicleInsuranceBoat;
    public static WebElement getVehicleInsuranceBoat(){return vehicleInsuranceBoat;}
    public static void hoverVehicleInsuranceBoat() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceBoat);
        sleepFor(2);
        vehicleInsuranceBoat.click();
    }
    //test 22 <<VehicleInsurance Collector Mossehover>>
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceCollector)
    public static WebElement vehicleInsuranceCollector;
    public static WebElement getVehicleInsuranceCollector(){return vehicleInsuranceCollector;}
    public static void hoverVehicleInsuranceCollector() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceCollector);
        sleepFor(2);
        vehicleInsuranceCollector.click();
    }
    //test 23 <<VehicleInsurance Rideshare Hover>>
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceRideshare)
    public static WebElement vehicleInsuranceRideshare;
    public static WebElement getVehicleInsuranceRideshare(){return vehicleInsuranceRideshare;}
    public static void hoverVehicleInsuranceRideshare() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceRideshare);
        // scrollUpDown(2500,"xPathVehicleInsuranceRideshare");
        sleepFor(2);
        vehicleInsuranceRideshare.click();
    }
    //test 24
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceCommercial)
    public static WebElement vehicleInsuranceCommercial;
    public static WebElement getVehicleInsuranceCommercial(){return vehicleInsuranceCommercial;}
    public static void hoverVehicleInsuranceCommercial() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceCommercial);
        sleepFor(2);
        vehicleInsuranceCommercial.click();
    }
    //test 25
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceMexico)
    public static WebElement vehicleInsuranceMexico;
    public static WebElement getVehicleInsuranceMexico(){return vehicleInsuranceMexico;}
    public static void hoverVehicleInsuranceMexico() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceMexico);
        sleepFor(2);
        vehicleInsuranceMexico.click();
    }
    //test 26
    @FindBy(how = How.XPATH,using = xPathVehicleInsuranceAutoPage)
    public static WebElement vehicleInsuranceAutoPage;
    public static WebElement getVehicleInsuranceAutoPage(){return vehicleInsuranceAutoPage;}
    public static void hoverVehicleInsuranceAutoPage() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInsuranceAutoPage);
        vehicleInsuranceAutoPage.click();
    }
    //test 27
    @FindBy(how = How.XPATH,using = xPathHomeOwners)
    public static WebElement homeOwners;
    public static WebElement getHomeOwners(){return homeOwners;}
    public static void hoverHomeOwners() throws InterruptedException {
        mouseHoverByXpath(xPathHomeOwners);
        sleepFor(2);
        homeOwners.click();
    }
    //test 28
    @FindBy(how = How.XPATH,using = xPathRenters)
    public static WebElement Renters;
    public static WebElement getRenters(){return Renters;}
    public static void hoverRenters() throws InterruptedException {
        mouseHoverByXpath(xPathRenters);
        sleepFor(2);
        Renters.click();
    }
    //test 29
    @FindBy(how = How.XPATH,using = xPathCondo)
    public static WebElement condo;
    public static WebElement getCondo(){return condo;}
    public static void hoverCondo() throws InterruptedException {
        mouseHoverByXpath(xPathCondo);
        sleepFor(2);
        condo.click();
    }
    //test 30
    @FindBy(how = How.XPATH,using = xPathMobileHome)
    public static WebElement mobileHome;
    public static WebElement getMobileHome(){return mobileHome;}
    public static void hoverMobileHome() throws InterruptedException {
        mouseHoverByXpath(xPathMobileHome);
        sleepFor(2);
        mobileHome.click();
    }
    //test 31
    @FindBy(how = How.XPATH,using = xPathLandLord)
    public static WebElement landLord;
    public static WebElement getLandLord(){return landLord;}
    public static void hoverLandLord() throws InterruptedException {
        mouseHoverByXpath(xPathLandLord);
        sleepFor(2);
        landLord.click();
    }
    //test 32
    @FindBy(how = How.XPATH,using = xPathFlood)
    public static WebElement flood;
    public static WebElement getFlood(){return flood;}
    public static void hoverFlood() throws InterruptedException {
        mouseHoverByXpath(xPathFlood);
        sleepFor(2);
        flood.click();
    }
    //test 33
    @FindBy(how = How.XPATH,using = xPathBusinessOwner)
    public static WebElement businessOwner;
    public static WebElement getBusinessOwner(){return businessOwner;}
    public static void hoverBusinessOwner() throws InterruptedException {
        mouseHoverByXpath(xPathBusinessOwner);
        sleepFor(2);
        businessOwner.click();
    }
    //test 34 <<GeneralLiability>>
    @FindBy(how = How.XPATH,using = xPathGeneralLiability)
    public static WebElement generalLiability;
    public static WebElement getGeneralLiability(){return generalLiability;}
    public static void hoverGeneralLiability() throws InterruptedException {
        mouseHoverByXpath(xPathBusinessOwner);
        sleepFor(2);
        generalLiability.click();
    }
    //test 35 <<GeneralLiability>>
    @FindBy(how = How.XPATH,using = xPathProfessionalLiability)
    public static WebElement professionalLiability;
    public static WebElement getProfessionalLiability(){return professionalLiability;}
    public static void hoverProfessionalLiability() throws InterruptedException {
        mouseHoverByXpath(xPathProfessionalLiability);
        sleepFor(2);
        professionalLiability.click();
    }
    //test 36 <<xPathWorkerCompensation>>
    @FindBy(how = How.XPATH,using = xPathWorkerCompensation)
    public static WebElement WorkerCompensation;
    public static WebElement getWorkerCompensation(){return WorkerCompensation;}
    public static void hoverWorkerCompensation() throws InterruptedException {
        mouseHoverByXpath(xPathWorkerCompensation);
        sleepFor(2);
        professionalLiability.click();
    }
    //test 37 <<xPathMedicalMalpractice>>
    @FindBy(how = How.XPATH,using = xPathMedicalMalpractice)
    public static WebElement medicalMalpractice;
    public static WebElement getMedicalMalpractice(){return medicalMalpractice;}
    public static void hoverMedicalMalpractice() throws InterruptedException {
        mouseHoverByXpath(xPathMedicalMalpractice);
        sleepFor(2);
        medicalMalpractice.click();
    }
    //test 38 <<xPathWellnessFitness>>
    @FindBy(how = How.XPATH,using = xPathWellnessFitness)
    public static WebElement WellnessFitness;
    public static WebElement getWellnessFitness(){return WellnessFitness;}
    public static void hoverWellnessFitness() throws InterruptedException {
        mouseHoverByXpath(xPathWellnessFitness);
        sleepFor(2);
        WellnessFitness.click();
    }
    //test 39 <<xPathCommercialAuto>>
    @FindBy(how = How.XPATH,using = xPathCommercialAuto)
    public static WebElement CommercialAuto;
    public static WebElement getCommercialAuto(){return CommercialAuto;}
    public static void hoverCommercialAuto() throws InterruptedException {
        mouseHoverByXpath(xPathCommercialAuto);
        sleepFor(2);
        CommercialAuto.click();
    }
    //test 40 <<xPathRideShare>>
    @FindBy(how = How.XPATH,using = xPathRideShare)
    public static WebElement RideShare;
    public static WebElement getRideShare(){return RideShare;}
    public static void hoverRideShare() throws InterruptedException {
        mouseHoverByXpath(xPathRideShare);
        sleepFor(2);
        RideShare.click();
    }
    //test 41 <<xPathUmbrella>>
    @FindBy(how = How.XPATH,using = xPathUmbrella)
    public static WebElement umbrella;
    public static WebElement getUmbrella(){return umbrella;}
    public static void hoverUmbrella() throws InterruptedException {
        mouseHoverByXpath(xPathUmbrella);
        sleepFor(2);
        umbrella.click();
    }
    //test 42 <<xPathLife>>
    @FindBy(how = How.XPATH,using = xPathLife)
    public static WebElement Life;
    public static WebElement getLife(){return Life;}
    public static void hoverLife() throws InterruptedException {
        mouseHoverByXpath(xPathLife);
        sleepFor(2);
        Life.click();
    }
    //test 43 <<xPathTravel>>
    @FindBy(how = How.XPATH,using = xPathTravel)
    public static WebElement Travel;
    public static WebElement getTravel(){return Travel;}
    public static void hoverTravel() throws InterruptedException {
        mouseHoverByXpath(xPathTravel);
        sleepFor(2);
        Travel.click();
    }
    //test 44 <<xPathOverseas>>
    @FindBy(how = How.XPATH,using = xPathTravel)
    public static WebElement Overseas;
    public static WebElement getOverseas(){return Overseas;}
    public static void hoverOverseas() throws InterruptedException {
        mouseHoverByXpath(xPathOverseas);
        sleepFor(2);
        Overseas.click();
    }
    //test 45 <<xPathIdentityProtection>>
    @FindBy(how = How.XPATH,using = xPathIdentityProtection)
    public static WebElement IdentityProtection;
    public static WebElement getIdentityProtection(){return IdentityProtection;}
    public static void hoverIdentityProtection() throws InterruptedException {
        mouseHoverByXpath(xPathIdentityProtection);
        sleepFor(2);
        IdentityProtection.click();
    }

    //test 46 <<xPathPet>>
    @FindBy(how = How.XPATH,using = xPathPet)
    public static WebElement pet;
    public static WebElement getPet(){return pet;}
    public static void hoverPet() throws InterruptedException {
        mouseHoverByXpath(xPathPet);
        sleepFor(2);
        pet.click();
    }
    //test 47 <<xPathJewelry>>
    @FindBy(how = How.XPATH,using = xPathJewelry)
    public static WebElement Jewelry;
    public static WebElement getJewelry(){return Jewelry;}
    public static void hoverJewelry() throws InterruptedException {
        mouseHoverByXpath(xPathJewelry);
        sleepFor(2);
        Jewelry.click();
    }
    //test 48 <<xPathMakeAPayment>>
    @FindBy(how = How.XPATH,using = xPathMakeAPayment)
    public static WebElement MakeAPayment;
    public static WebElement getMakeAPayment(){return MakeAPayment;}
    public static void hoverMakeAPayment() throws InterruptedException {
        mouseHoverByXpath(xPathMakeAPayment);
        sleepFor(2);
        MakeAPayment.click();
    }
    //test 49 <<xPathGetIDCards>>
    @FindBy(how = How.XPATH,using = xPathGetIDCards)
    public static WebElement GetIDCards;
    public static WebElement getGetIDCards(){return GetIDCards;}
    public static void hoverGetIDCards() throws InterruptedException {
        mouseHoverByXpath(xPathGetIDCards);
        sleepFor(2);
        GetIDCards.click();
    }
    //test 50 <<xPathGoPaperless>>
    @FindBy(how = How.XPATH,using = xPathGoPaperless)
    public static WebElement GoPaperless;
    public static WebElement getGoPaperless(){return GoPaperless;}
    public static void hoverGoPaperless() throws InterruptedException {
        mouseHoverByXpath(xPathGoPaperless);
        sleepFor(2);
        GoPaperless.click();
    }
    //test 51 <<AddAVehicle>>
    @FindBy(how = How.XPATH,using = xPathAddAVehicle)
    public static WebElement AddAVehicle;
    public static WebElement getAddAVehicle(){return AddAVehicle;}
    public static void hoverAddAVehicle() throws InterruptedException {
        mouseHoverByXpath(xPathAddAVehicle);
        sleepFor(2);
        AddAVehicle.click();
    }
    //test 52 <<xPathCreateOnlineAccount>>
    @FindBy(how = How.XPATH,using = xPathCreateOnlineAccount)
    public static WebElement CreateOnlineAccount;
    public static WebElement getCreateOnlineAccount(){return CreateOnlineAccount;}
    public static void hoverCreateOnlineAccount() throws InterruptedException {
        mouseHoverByXpath(xPathCreateOnlineAccount);
        sleepFor(2);
        CreateOnlineAccount.click();
    }
    //test 53 <<xPathGEICOMobileApp>>
    @FindBy(how = How.XPATH,using = xPathGEICOMobileApp)
    public static WebElement GEICOMobileApp;
    public static WebElement getGEICOMobileApp(){return GEICOMobileApp;}
    public static void hoverGEICOMobileApp() throws InterruptedException {
        mouseHoverByXpath(xPathGEICOMobileApp);
        sleepFor(2);
        GEICOMobileApp.click();
    }
    //test 54 <<xPathFAQs>>
    @FindBy(how = How.XPATH,using = xPathFAQs)
    public static WebElement FAQs;
    public static WebElement getFAQs(){return FAQs;}
    public static void hoverFAQs() throws InterruptedException {
        mouseHoverByXpath(xPathFAQs);
        sleepFor(2);
        FAQs.click();
    }
    //test 55 <<xPathReportAClaim>>
    @FindBy(how = How.XPATH,using = xPathReportAClaim)
    public static WebElement ReportAClaim;
    public static WebElement getReportAClaim(){return ReportAClaim;}
    public static void hoverReportAClaim() throws InterruptedException {
        mouseHoverByXpath(xPathReportAClaim);
        sleepFor(2);
        getReportAClaim().click();
    }
    //test 56 <<xPathAboutTheClaimsProcess>>
    @FindBy(how = How.XPATH,using = xPathAboutTheClaimsProcess)
    public static WebElement AboutTheClaimsProcess;
    public static WebElement getAboutTheClaimsProcess(){return AboutTheClaimsProcess;}
    public static void hoverAboutTheClaimsProcess() throws InterruptedException {
        mouseHoverByXpath(xPathAboutTheClaimsProcess);
        sleepFor(2);
        AboutTheClaimsProcess.click();
    }
    //test 57 <<xPathAboutAutoRepairXpress>>
    @FindBy(how = How.XPATH,using = xPathAboutAutoRepairXpress)
    public static WebElement AboutAutoRepairXpress;
    public static WebElement getAboutAutoRepairXpress(){return AboutAutoRepairXpress;}
    public static void hoverAboutAutoRepairXpress() throws InterruptedException {
        mouseHoverByXpath(xPathAboutAutoRepairXpress);
        sleepFor(2);
        getAboutAutoRepairXpress().click();
    }
    //test 58 <<xPathInsuranceTerms>>
    @FindBy(how = How.XPATH,using = xPathInsuranceTerms)
    public static WebElement InsuranceTerms;
    public static WebElement getInsuranceTerms(){return InsuranceTerms;}
    public static void hoverInsuranceTerms() throws InterruptedException {
        mouseHoverByXpath(xPathInsuranceTerms);
        sleepFor(2);
        getInsuranceTerms().click();
    }
    //test 59 <<xPathParkingLocator>>
    @FindBy(how = How.XPATH,using = xPathParkingLocator)
    public static WebElement ParkingLocator;
    public static WebElement getParkingLocator(){return ParkingLocator;}
    public static void hoverParkingLocator() throws InterruptedException {
        mouseHoverByXpath(xPathParkingLocator);
        sleepFor(2);
        getParkingLocator().click();
    }
    //test 60 <<xPathVehicleInspectionSites>>
    @FindBy(how = How.XPATH,using = xPathVehicleInspectionSites)
    public static WebElement VehicleInspectionSites;
    public static WebElement getVehicleInspectionSites(){return VehicleInspectionSites;}
    public static void hoverVehicleInspectionSites() throws InterruptedException {
        mouseHoverByXpath(xPathVehicleInspectionSites);
        sleepFor(2);
        getVehicleInspectionSites().click();
    }
    //test 61 <<xPathCareers>>
    @FindBy(how = How.XPATH,using = xPathCareers)
    public static WebElement Careers;
    public static WebElement getCareers(){return Careers;}
    public static void hoverCareers() throws InterruptedException {
        mouseHoverByXpath(xPathCareers);
        sleepFor(2);
        getCareers().click();
    }
    //test 62 <<xPathCorporateInformation>>
    @FindBy(how = How.XPATH,using = xPathCorporateInformation)
    public static WebElement CorporateInformation;
    public static WebElement getCorporateInformation(){return CorporateInformation;}
    public static void hoverCorporateInformation() throws InterruptedException {
        mouseHoverByXpath(xPathCorporateInformation);
        sleepFor(2);
        getCorporateInformation().click();
    }
    //test 63 <<xPathAgencyOwnership>>
    @FindBy(how = How.XPATH,using = xPathAgencyOwnership)
    public static WebElement AgencyOwnership;
    public static WebElement getAgencyOwnership(){return AgencyOwnership;}
    public static void hoverAgencyOwnership() throws InterruptedException {
        mouseHoverByXpath(xPathAgencyOwnership);
        sleepFor(2);
        getAgencyOwnership().click();
    }
    //test 64 <<InTheCommunity>>
    @FindBy(how = How.XPATH,using = xPathInTheCommunity)
    public static WebElement InTheCommunity;
    public static WebElement getInTheCommunity(){return InTheCommunity;}
    public static void hoverInTheCommunity() throws InterruptedException {
        mouseHoverByXpath(xPathInTheCommunity);
        sleepFor(2);
        getInTheCommunity().click();
    }
    //test 65<<xPathPressReleases>>
    @FindBy(how = How.XPATH,using = xPathPressReleases)
    public static WebElement PressReleases;
    public static WebElement getPressReleases(){return PressReleases;}
    public static void hoverPressReleases() throws InterruptedException {
        mouseHoverByXpath(xPathPressReleases);
        sleepFor(2);
        getPressReleases().click();
    }
    //test 66<<xPathB2BServices>>
    @FindBy(how = How.XPATH,using = xPathB2BServices)
    public static WebElement B2BServices;
    public static WebElement getB2BServices(){return B2BServices;}
    public static void hoverB2BServices() throws InterruptedException {
        mouseHoverByXpath(xPathB2BServices);
        sleepFor(2);
        getB2BServices().click();
    }
    //test 67<<xPathOrganizationDiscount>>
    @FindBy(how = How.XPATH,using = xPathOrganizationDiscount)
    public static WebElement OrganizationDiscount;
    public static WebElement getOrganizationDiscount(){return OrganizationDiscount;}
    public static void hoverOrganizationDiscount() throws InterruptedException {
        mouseHoverByXpath(xPathOrganizationDiscount);
        sleepFor(2);
        getOrganizationDiscount().click();
    }
    //test 68<<xPathAssociatesRetirees>>
    @FindBy(how = How.XPATH,using = xPathAssociatesRetirees)
    public static WebElement AssociatesRetirees;
    public static WebElement getAssociatesRetirees(){return AssociatesRetirees;}
    public static void hoverAssociatesRetirees() throws InterruptedException {
        mouseHoverByXpath(xPathAssociatesRetirees);
        sleepFor(2);
        getAssociatesRetirees().click();
    }
    //test 69<<xPathInsurers>>
    @FindBy(how = How.XPATH,using = xPathInsurers)
    public static WebElement Insurers;
    public static WebElement getInsurers(){return Insurers;}
    public static void hoverInsurers() throws InterruptedException {
        mouseHoverByXpath(xPathInsurers);
        sleepFor(2);
        getInsurers().click();
    }
    //test 70<<xPathGEICOCommercials>>
    @FindBy(how = How.XPATH,using = xPathGEICOCommercials)
    public static WebElement GEICOCommercials;
    public static WebElement getGEICOCommercials(){return GEICOCommercials;}
    public static void hoverGEICOCommercials() throws InterruptedException {
        mouseHoverByXpath(xPathGEICOCommercials);
        sleepFor(2);
        getGEICOCommercials().click();
    }
    //test 71<<xPathGEICOMobileApp>>
    @FindBy(how = How.XPATH,using = xPathGMobileApp)
    public static WebElement GMobileApp;
    public static WebElement getGMobileApp(){return GMobileApp;}
    public static void hoverGMobileApp() throws InterruptedException {
        mouseHoverByXpath(xPathGMobileApp);
        sleepFor(2);
        getGMobileApp().click();
    }
    //test 72<<xPathAmazonAlexaSkill>>
    @FindBy(how = How.XPATH,using = xPathAmazonAlexaSkill)
    public static WebElement AmazonAlexaSkill;
    public static WebElement getAmazonAlexaSkill(){return AmazonAlexaSkill;}
    public static void hoverAmazonAlexaSkill() throws InterruptedException {
        mouseHoverByXpath(xPathAmazonAlexaSkill);
        sleepFor(2);
        getAmazonAlexaSkill().click();
    }
    //test 73<<xPathGoogleAction>>
    @FindBy(how = How.XPATH,using = xPathGoogleAction)
    public static WebElement GoogleAction;
    public static WebElement getGoogleAction(){return GoogleAction;}
    public static void hoverGoogleAction() throws InterruptedException {
        mouseHoverByXpath(xPathGoogleAction);
        sleepFor(2);
        getGoogleAction().click();
    }
    //test 74<<xPathGEICOLiving>>
    @FindBy(how = How.XPATH,using = xPathGEICOLiving)
    public static WebElement GEICOLiving;
    public static WebElement getGEICOLiving(){return GEICOLiving;}
    public static void hoverGEICOLiving() throws InterruptedException {
        mouseHoverByXpath(xPathGEICOLiving);
        sleepFor(2);
        getGEICOLiving().click();
    }
    //test 75<<xPathGEICOSequels>>
    @FindBy(how = How.XPATH,using = xPathGEICOSequels)
    public static WebElement GEICOSequels;
    public static WebElement getGEICOSequels(){return GEICOSequels;}
    public static void hoverGEICOSequels() throws InterruptedException {
        mouseHoverByXpath(xPathGEICOSequels);
        sleepFor(2);
        getGEICOSequels().click();
    }
    //test 76<<xPathSocialMedia>>
    @FindBy(how = How.XPATH,using = xPathSocialMedia)
    public static WebElement SocialMedia;
    public static WebElement getSocialMedia(){return SocialMedia;}
    public static void hoverSocialMedia() throws InterruptedException {
        mouseHoverByXpath(xPathSocialMedia);
        sleepFor(2);
        getSocialMedia().click();
    }
    //test 77<<xPathSiteMap>>
    @FindBy(how = How.XPATH,using = xPathSiteMap)
    public static WebElement SiteMap;
    public static WebElement getSiteMap(){return SiteMap;}
    public static void hoverSiteMap() throws InterruptedException {
        mouseHoverByXpath(xPathSiteMap);
        sleepFor(2);
        getSiteMap().click();
    }
    //test 78<<xPathAccessibility>>
    @FindBy(how = How.XPATH,using = xPathAccessibility)
    public static WebElement Accessibility;
    public static WebElement getAccessibility(){return Accessibility;}
    public static void hoverAccessibility() throws InterruptedException {
        mouseHoverByXpath(xPathAccessibility);
        sleepFor(2);
        getAccessibility().click();
    }
    //test 79 <<<SearchGeico>>>
    @FindBy (xpath = xPathSearchGeico) public  static WebElement SearchGeico;
    @FindBy (xpath = xPathSearchEnter) public static WebElement SearchEnter;
    public static WebElement getSearchGeico(){return SearchGeico;}
    public static void typeSearchBox(){getSearchGeico().sendKeys("Motorcycle");
    }
    //test@80
    @FindBy (xpath = xPathMotorcycle) public static WebElement Motorcycle;
    public static WebElement getMotorcycleLink(){return Motorcycle;}
    public static void motorcycle(){getMotorcycleLink().click();}
    //Test@81
    @FindBy(xpath = xPathValidateMotorcycle) public static WebElement validateMotorcycleText;
    public static WebElement getValidateMotorcycleText(){return validateMotorcycleText;}
    public static String  validateText(){return getValidateMotorcycleText().getText();}
    //@test@82
    @FindBy(xpath = xPathValidate15Min) public static WebElement Validate15MinText;
    public static WebElement getValidate15MinText(){return Validate15MinText;}
    public static String validate15minText(){return getValidate15MinText().getText();}
    //Test@83
    @FindBy(xpath = xPathStartQuote) public static WebElement StartQuote;
    public static WebElement getStartQuote(){return StartQuote;}
    public static void clickStartQuote(){getStartQuote().click();}
    //Test84
    @FindBy(xpath = xPathINeedInsuranceRightAway) public static WebElement iNeedInsuranceRightAway;
    public static WebElement getiNeedInsuranceRightAway(){return iNeedInsuranceRightAway;}
    public static void clickINeedInsuranceRightAway(){getiNeedInsuranceRightAway().click();}
    //Test85
    @FindBy(xpath = xPathBeingQuote) public static WebElement BeingQuote;
    public static WebElement getBeingQuote(){return BeingQuote;}
    public static void clickBeingQuote(){getBeingQuote().click();}
    //Test86
    @FindBy(xpath = xPathDateOFBirthMonth) public static WebElement DateOFBirthMonth;
    public static WebElement getDateOFBirthMonth(){return DateOFBirthMonth;}
    //public static void clickDateOFBirthMonth(){getBeingQuote().click();}
    public static void inputDateOFBirthMonth(){getDateOFBirthMonth().sendKeys("10");}
    //Test87
    @FindBy(xpath = xPathDateOFBirthDate) public static WebElement DateOFBirthDate;
    public static WebElement getDateOFBirthDate(){return DateOFBirthDate;}
    public static void inputDateOFBirthDate(){getDateOFBirthDate().sendKeys("30");}
    //Test88
    @FindBy(xpath = xPathDateOFBirthYear) public static WebElement DateOFBirthYear;
    public static WebElement getDateOFBirthYear(){return DateOFBirthYear;}
    public static void inputDateOFBirthYear(){getDateOFBirthYear().sendKeys("1982");}
    //Test89
    @FindBy(xpath = xPathDateOFBirthNext) public static WebElement DateOFBirthNext;
    public static WebElement getDateOFBirthNext(){return DateOFBirthNext;}
    public static void clickDateOFBirthNext(){getDateOFBirthNext().click();}
    //Test90
    @FindBy(xpath = xPathDateOFBirthFirstName) public static WebElement DateOFBirthFirstName;
    public static WebElement getDateOFBirthFirstName(){return DateOFBirthFirstName;}
    public static void inputDateOfBirthFirstName() throws InterruptedException {getDateOFBirthFirstName().sendKeys("Naser");}//Test90
    //Test@91
    @FindBy(xpath = xPathDateOFBirthLastName) public static WebElement DateOFBirthLastName;
    public static WebElement getDateOFBirthLastName(){return DateOFBirthLastName;}
    public static void inputDateOFBirthLastName() throws InterruptedException {getDateOFBirthLastName().sendKeys("Shaon");}
    //Test@92
    @FindBy(xpath = xPathDateOFBirthBackButton) public static WebElement DateOFBirthBackButton;
    public static WebElement getDateOFBirthBackButton(){return DateOFBirthBackButton;}
    public static void clickDateOFBirthBackButton() throws InterruptedException {getDateOFBirthBackButton().click();}
    //Test@93
    @FindBy(xpath = xPathDateOFBirthBackNext) public static WebElement DateOFBirthBackNext;
    public static WebElement getDateOFBirthBackNext(){return DateOFBirthBackNext;}
    public static void clickDateOFBirthBackNext() throws InterruptedException {getDateOFBirthBackNext().click();}
    //Test@94
    @FindBy(xpath = xPathDateOFBirthBackAddress) public static WebElement DateOFBirthBackAddress;
    public static WebElement getDateOFBirthBackAddress(){return DateOFBirthBackAddress;}
    public static void clickDateOFBirthBackAddress() throws InterruptedException
    {getDateOFBirthBackAddress().sendKeys("200 Gelston Ave");}
    //Test@95
    @FindBy(xpath = xPathDateOFBirthBackAddressApt) public static WebElement DateOFBirthBackAddressApt;
    public static WebElement getDateOFBirthBackAddressApt(){return DateOFBirthBackAddressApt;}
    public static void clickDateOFBirthBackAddressApt() throws InterruptedException
    {getDateOFBirthBackAddressApt().sendKeys("104");}
    //Test@96
    @FindBy(xpath = xPathDateOFBirthBackAddressZip) public static WebElement DateOFBirthBackAddressZip;
    public static WebElement getDateOFBirthBackAddressZip(){return DateOFBirthBackAddressZip;}
    public static void clickDateOFBirthBackAddressZip() throws InterruptedException
    {getDateOFBirthBackAddressZip().sendKeys("11209");}
    //Test@97
    @FindBy(xpath = xPathDateOFBirthBackAddressNext) public static WebElement DateOFBirthBackAddressNext;
    public static WebElement getDateOFBirthBackAddressNext(){return DateOFBirthBackAddressNext;}
    public static void clickDateOFBirthBackAddressNext() throws InterruptedException
    {getDateOFBirthBackAddressNext().click();}
    //Test@98
    @FindBy(xpath = xPathVehicleYear) public static WebElement VehicleYear;
    @FindBy(xpath = xPathVehicleYear2014) public static WebElement VehicleYear2014;
    public static WebElement getVehicleYear2014(){return VehicleYear2014;}
    public static WebElement getVehicleYear(){return VehicleYear;}
    public static void clickVehicleYear() throws InterruptedException
    {getVehicleYear().click();}
    public static void clickVehicleYear2014(){getVehicleYear2014().click();}
    //Test@99
    @FindBy(xpath = xPathVehicleMark) public static WebElement VehicleMark;
    @FindBy(xpath = xPathVehicleMarkToyota) public static WebElement VehicleMarkToyota;
    public static WebElement getVehicleMarkToyota(){return VehicleMarkToyota;}
    public static WebElement getVehicleMark(){return VehicleMark;}
    public static void clickVehicleMark() throws InterruptedException
    {getVehicleMark().click();}
    public static void clickVehicleMarkToyota(){getVehicleMarkToyota().click();}
    //Test@100
    @FindBy(xpath = xPathVehicleModel) public static WebElement VehicleModel;
    @FindBy(xpath = xPathVehicleModelCamry) public static WebElement VehicleModelCamry;
    public static WebElement getVehicleModelCamry(){return VehicleModelCamry;}
    public static WebElement getVehicleModel(){return VehicleModel;}
    public static void clickVehicleModel() throws InterruptedException
    {getVehicleModel().click();}
    public static void clickVehicleModelCamry(){getVehicleModelCamry().click();}
    //Test@101
    @FindBy(xpath = xPathVehicleModelCamryNext) public static WebElement VehicleModelCamryNext;
    public static WebElement getVehicleModelCamryNext(){return VehicleModelCamryNext;}
    public static void clickVehicleModelCamryNext() throws InterruptedException
    {getVehicleModelCamryNext().click();}
    //Test@102
    @FindBy(xpath = xPathAntiTheftDevice) public static WebElement AntiTheftDevice;
    @FindBy(xpath = xPathAntiTheftDeviceAlarm) public static WebElement AntiTheftDeviceAlarm;
    public static WebElement getAntiTheftDevice(){return AntiTheftDevice;}
    public static WebElement getAntiTheftDeviceAlarm(){return AntiTheftDeviceAlarm;}
    public static void clickAntiTheftDevice() throws InterruptedException
    {getAntiTheftDevice().click();}
    public static void clickAntiTheftDeviceAlarm(){getAntiTheftDeviceAlarm().click();}
    //Test@103
    @FindBy(xpath = xPathAntiTheftDeviceNext) public static WebElement AntiTheftDeviceNext;
    public static WebElement getAntiTheftDeviceNext(){return AntiTheftDeviceNext;}
    public static void clickAntiTheftDeviceNext() throws InterruptedException
    {getAntiTheftDeviceNext().click();}
    //Test@104
    @FindBy(xpath = xPathOwnedButton) public static WebElement OwnedButton;
    public static WebElement getOwnedButton(){return OwnedButton;}
    public static void clickOwnedButton() throws InterruptedException
    {getOwnedButton().click();}

    //Test@105
    @FindBy(xpath = xPathOwnedButtonNext) public static WebElement OwnedButtonNext;
    public static WebElement getOwnedButtonNext(){return OwnedButtonNext;}
    public static void clickOwnedButtonNext() throws InterruptedException
    {getOwnedButtonNext().click();}

    //Test@106
    @FindBy(xpath = xPathCommuteToSchool) public static WebElement CommuteToSchool;
    public static WebElement getCommuteToSchool(){return CommuteToSchool;}
    public static void clickCommuteToSchool() throws InterruptedException
    {getCommuteToSchool().click();}

    //Test@107
    @FindBy(xpath = xPathPleasure) public static WebElement Pleasure;
    public static WebElement getPleasure(){return Pleasure;}
    public static void clickPleasure() throws InterruptedException
    {getPleasure().click();}

    //Test@108
    @FindBy(xpath = xPathBusinessSales) public static WebElement BusinessSales;
    public static WebElement getBusinessSales(){return BusinessSales;}
    public static void clickBusinessSales() throws InterruptedException
    {getBusinessSales().click();}

    //Test@109
    @FindBy(xpath = xPathDaysDriven) public static WebElement DaysDriven;
    public static WebElement getDaysDriven(){return DaysDriven;}
    public static void clickDaysDriven() throws InterruptedException
    {getDaysDriven().click();}

    //Test@110
    @FindBy(xpath = xPathDaysDriven6) public static WebElement DaysDriven6;
    public static WebElement getDaysDriven6(){return DaysDriven6;}
    public static void clickDaysDriven6() throws InterruptedException
    {getDaysDriven6().click();}

    //Test@111
    @FindBy(xpath = xPathMilesDriven) public static WebElement MilesDriven;
    public static WebElement getMilesDriven(){return MilesDriven;}
    public static void sendMilesDriven() {getMilesDriven().sendKeys("500");}

    //Test@112
    @FindBy(xpath = xPathMilesDrivenNext) public static WebElement MilesDrivenNext;
    public static WebElement getMilesDrivenNext(){return MilesDrivenNext;}
    public static void clickMilesDrivenNext() {getMilesDrivenNext().click();}

    //Test@113
    @FindBy(xpath = xPathAnnualMileage) public static WebElement AnnualMileage;
    public static WebElement getAnnualMileage(){return AnnualMileage;}
    public static void clickAnnualMileage() {getAnnualMileage().click();}

    //Test@114
    @FindBy(xpath = xPathAnnualMileageNextButton) public static WebElement AnnualMileageNextButton;
    public static WebElement getAnnualMileageNextButton(){return AnnualMileageNextButton;}
    public static void clickAnnualMileageNextButton() {getAnnualMileageNextButton().click();}

    //Test 115 Final Page
    @FindBy(xpath = xPathClaimsCenter) public static WebElement ClaimsCenter;
    public static WebElement getClaimsCenter(){return ClaimsCenter;}
    public static void clickClaimsCenter() {getClaimsCenter().click();}

//Test 116
    @FindBy(xpath = xPathFeedback) public static WebElement Feedback;
    public static WebElement getFeedback(){return Feedback;}
    public static void clickFeedback() {getFeedback().click();}

    //Test 117
    @FindBy(xpath = xPathTextAreaComments) public static WebElement TextAreaComments;
    public static WebElement getTextAreaComments(){return TextAreaComments;}
    public static void clickTextAreaComments() {getTextAreaComments().sendKeys("Hi i have an accident ");        }

    //Test 118
    @FindBy(xpath = xPathChildSubmit) public static WebElement ChildSubmit;
    public static WebElement getChildSubmit(){return ChildSubmit;}
    public static void clickChildSubmit() {getChildSubmit().click();        }


    //Test 120
    @FindBy(xpath = xPathOverallValue) public static WebElement OverallValue;
    public static WebElement getOverallValue(){return OverallValue;}
    public static void clickOverallValue() {getOverallValue().click();  }

    //Test 121

    @FindBy(xpath = xPathFacebookTab) public static WebElement FacebookTab;
    public static WebElement getFacebookTab(){return FacebookTab;}
    public static void clickFacebookTab() {getFacebookTab().click();  }

//    public static void setBrowser(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\naser\\IdeaProjects\\Team-1_WebAutomationFramework\\Generic\\BrowserDriver\\Windows\\chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.navigate().to("https://www.geico.com/");
//        driver.manage().window().maximize();
//    }

}