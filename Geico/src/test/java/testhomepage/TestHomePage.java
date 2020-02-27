package testhomepage;

import databases.ConnectToSqlDB;
import homepage.pageobject.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestHomePage extends HomePage {
    public void getInitElements() {
        PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority=1)
    public void testLeftMenu() throws InterruptedException {

        getInitElements();
        clickHomeMenu();
        sleepFor(1);
    }
    @Test(priority = 2)//testing test information
    public void testInformation() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(1);
    }
    @Test(priority = 3)//Testing main menu
    public void testMainMenu() throws InterruptedException {
        getInitElements();
        clickMainMenu();
        ;
        sleepFor(1);
    }
    @Test(priority = 4)// testing gps button
    public void testGps() throws InterruptedException {
        getInitElements();
        clickGps();
        sleepFor(3);
    }
    @Test(priority = 5)//Zip code field checking
    public void tesZipCode() throws InterruptedException {
        getInitElements();
        clickGps();
        clickZipCode();
        sleepFor(2);
    }
    @Test(priority = 6)// Tst Login button
    public void tesLogIn() throws InterruptedException {
        getInitElements();
        clickOnLogin();
        sleepFor(2);
    }
    @Test(priority = 7)//Checking Search field by typing keywork
    public void searchButton() throws InterruptedException {
        getInitElements();
        clickOnSearchButton();
        sleepFor(2);
    }
    @Test(priority = 8)// Test
    public void testVehicleInsurance() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
    }
    //@PropertyInsurance
    @Test(priority = 9)
    public void testPropertyInsurance() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverOnPropertyInsurance();
        sleepFor(2);
    }
    //@BusinessInsurance
    @Test(priority = 10)
    public void businessInsurance() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
    }
    //@AdditionalInsurance
    @Test(priority = 11)
    public void additionalInsurance() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverAdditionalInsurance();
        sleepFor(2);
    }
    //@MyAccount
    @Test(priority = 12)
    public void myAccount() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(1);
        hoverMyAccount();
        sleepFor(1);
    }
    //@Claims
    @Test(priority = 13)
    public void claims() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(1);
        hoverClaims();
        sleepFor(1);
    }
    //@Tools
    @Test(priority = 17)
    public void tools() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(1);
        hoverTools();
        sleepFor(1);
    }
    //@About Us
    @Test(priority = 14)
    public void about() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(1);
        hoverAbout();
        sleepFor(1);
    }
    //@WebAndMobile
    @Test(priority = 15)
    public void webAndMobile() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(1);
        hoverWebAndMobile();
        sleepFor(2);
    }

    //@webContactUs
    @Test(priority = 16)
    public void contactUs() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(1);
        hoverContactUs();
        sleepFor(2);
    }

    @Test(priority = 17)
    public void vehicleInsuranceAuto() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(3);
        hoverVehicleInsurance();
        sleepFor(3);
        hoverVehicleInsuranceAuto();
        sleepFor(3);
    }

    //@VehicleInsuranceMotor
    @Test(priority = 18)
    public void vehicleInsuranceMotor() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceMotor();
        sleepFor(2);
    }

    //@VehicleInsuranceAtv
    @Test(priority = 19)
    public void vehicleInsuranceAtv() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceAtv();
        sleepFor(2);

    }

    @Test(priority = 20)
    public void vehicleInsuranceRv() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceRv();
        sleepFor(3);

    }

    @Test(priority = 21)
    public void vehicleInsuranceBoat() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceBoat();
        sleepFor(2);

    }

    @Test(priority = 22)
    public void vehicleInsuranceCollector() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceCollector();
        sleepFor(2);

    }

    @Test(priority = 23)
    public void VehicleInsuranceRideshare() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        // scrollUpDown(3000);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceRideshare();
        sleepFor(2);
    }

    @Test(priority = 24)
    public void vehicleInsuranceCommercial() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        //scrollUpDown( +3000);
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceCommercial();
        sleepFor(3);
    }

    @Test(priority = 25)
    public void vehicleInsuranceMexico() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceMexico();
        sleepFor(3);
    }

    @Test(priority = 26)
    public void vehicleInsuranceAutoPage() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverVehicleInsurance();
        sleepFor(2);
        hoverVehicleInsuranceAuto();
        sleepFor(5);
    }

    @Test(priority = 27)
    public void homeOwners() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverOnPropertyInsurance();
        sleepFor(2);
        hoverHomeOwners();
        sleepFor(2);
    }

    @Test(priority = 28)
    public void renters() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverOnPropertyInsurance();
        sleepFor(2);
        hoverRenters();
        sleepFor(2);
    }

    @Test(priority = 29)
    public void condo() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverOnPropertyInsurance();
        sleepFor(2);
        hoverCondo();
        sleepFor(2);
    }

    @Test(priority = 30)
    public void mobileHome() throws InterruptedException {
        condo();
        sleepFor(2);
        hoverMobileHome();
        sleepFor(2);
    }

    @Test(priority = 31)
    public void landLord() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverOnPropertyInsurance();
        sleepFor(2);
        hoverLandLord();
        sleepFor(2);
    }

    @Test(priority = 32)
    public void flood() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverOnPropertyInsurance();
        sleepFor(2);
        hoverFlood();
        sleepFor(2);
    }

    @Test(priority = 33)
    public void flood1() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverOnPropertyInsurance();
        sleepFor(2);
        hoverFlood();
        sleepFor(2);
    }

    @Test(priority = 34)
    public void businessOwner() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
        hoverBusinessOwner();
        sleepFor(2);
    }

    @Test(priority = 35)
    public void generalLiability() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
        hoverGeneralLiability();
        sleepFor(2);
    }

    @Test(priority = 36)
    public void ProfessionalLiability() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
        hoverProfessionalLiability();
        sleepFor(2);
    }

    @Test(priority = 37)
    public void WorkerCompensation() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
        hoverWorkerCompensation();
        sleepFor(2);
    }

    @Test(priority = 38)
    public void medicalMalpractice() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
        hoverMedicalMalpractice();
        sleepFor(2);
    }

    @Test(priority = 39)
    public void WellnessFitness() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
        hoverWellnessFitness();
        sleepFor(2);
    }

    @Test(priority = 40)
    public void CommercialAuto() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
        hoverCommercialAuto();
        sleepFor(2);
    }

    @Test(priority = 41)
    public void RideShare() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverBusinessInsurance();
        sleepFor(2);
        hoverRideShare();
        sleepFor(2);
    }

    @Test(priority = 42)
    public void umbrella() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverAdditionalInsurance();
        sleepFor(2);
        hoverUmbrella();
        sleepFor(2);
    }

    @Test(priority = 43)
    public void Life() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverAdditionalInsurance();
        sleepFor(2);
        hoverLife();
        sleepFor(2);
    }

    @Test(priority = 44)
    public void Travel() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverAdditionalInsurance();
        sleepFor(2);
        hoverTravel();
        sleepFor(2);
    }

    @Test(priority = 45)
    public void IdentityProtection() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverAdditionalInsurance();
        sleepFor(2);
        hoverIdentityProtection();
        sleepFor(2);
    }

    @Test(priority = 46)
    public void pet() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverAdditionalInsurance();
        sleepFor(2);
        hoverPet();
        sleepFor(2);
    }

    @Test(priority = 47)
    public void Jewelry() throws InterruptedException {
        getInitElements();
        clickHomeMenu();
        sleepFor(2);
        hoverAdditionalInsurance();
        sleepFor(2);
        hoverJewelry();
        sleepFor(2);
    }

    @Test(priority = 48)
    public void MakeAPayment() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverMyAccount();
        sleepFor(2);
        hoverMakeAPayment();
        sleepFor(2);
    }

    @Test(priority = 49)
    public void GetIDCards() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverMyAccount();
        sleepFor(2);
        hoverGetIDCards();
        sleepFor(2);
    }

    @Test(priority = 50)
    public void GoPaperless() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverMyAccount();
        sleepFor(2);
        hoverGoPaperless();
        sleepFor(2);
    }

    @Test(priority = 51)
    public void AddAVehicle() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverMyAccount();
        sleepFor(2);
        hoverAddAVehicle();
        sleepFor(2);
    }

    @Test(priority = 52)
    public void CreateOnlineAccount() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverMyAccount();
        sleepFor(2);
        hoverCreateOnlineAccount();
        sleepFor(2);
    }

    @Test(priority = 53)
    public void GEICOMobileApp() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverMyAccount();
        sleepFor(2);
        hoverGEICOMobileApp();
        sleepFor(2);
    }

    @Test(priority = 54)
    public void FAQs() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverMyAccount();
        sleepFor(2);
        hoverFAQs();
        sleepFor(2);
    }

    @Test(priority = 55)
    public void ReportAClaim() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverClaims();
        sleepFor(2);
        hoverReportAClaim();
        sleepFor(2);
    }

    @Test(priority = 56)
    public void AboutTheClaimsProcess() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverClaims();
        sleepFor(2);
        hoverAboutTheClaimsProcess();
        sleepFor(2);
    }

    @Test(priority = 57)
    public void AboutAutoRepairXpress() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverClaims();
        sleepFor(2);
        hoverAboutAutoRepairXpress();
        sleepFor(2);
    }
    @Test(priority = 58)
    public void InsuranceTerms() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverTools();
        sleepFor(2);
        hoverInsuranceTerms();
        sleepFor(2);
    }
    @Test(priority = 59)
    public void ParkingLocator() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverTools();
        sleepFor(2);
        hoverParkingLocator();
        sleepFor(2);
    }
    @Test(priority = 60)
    public void VehicleInspectionSites() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverTools();
        sleepFor(2);
        hoverVehicleInspectionSites();
        sleepFor(2);
    }

    @Test(priority = 61)
    public void Careers() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverCareers();
        sleepFor(2);
    }

    @Test(priority = 62)
    public void CorporateInformation() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverCorporateInformation();
        sleepFor(2);
    }

    @Test(priority = 63)
    public void AgencyOwnership() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverAgencyOwnership();
        sleepFor(2);
    }

    @Test(priority = 64)
    public void InTheCommunity() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverInTheCommunity();
        sleepFor(2);
    }

    @Test(priority = 65)
    public void PressReleases() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverPressReleases();
        sleepFor(2);
    }

    @Test(priority = 66)
    public void B2BServices() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverB2BServices();
        sleepFor(2);
    }

    @Test(priority = 67)
    public void OrganizationDiscount() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverOrganizationDiscount();
        sleepFor(2);
    }

    @Test(priority = 68)
    public void AssociatesRetirees() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverAssociatesRetirees();
        sleepFor(2);
    }

    @Test(priority = 69)
    public void Insurers() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverInsurers();
        sleepFor(2);
    }

    @Test(priority = 70)
    public void GEICOCommercials() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverAbout();
        sleepFor(2);
        hoverGEICOCommercials();
        sleepFor(2);
    }

    @Test(priority = 71)
    public void GMobileApp() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverWebAndMobile();
        sleepFor(2);
        hoverGMobileApp();
        sleepFor(2);
    }

    @Test(priority = 72)
    public void AmazonAlexaSkill() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverWebAndMobile();
        sleepFor(2);
        hoverAmazonAlexaSkill();
        sleepFor(2);
    }

    @Test(priority = 73)
    public void GoogleAction() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverWebAndMobile();
        sleepFor(2);
        hoverGoogleAction();
        sleepFor(2);
    }

    @Test(priority = 74)
    public void GEICOLiving() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverWebAndMobile();
        sleepFor(2);
        hoverGEICOLiving();
        sleepFor(2);
    }

    @Test(priority = 75)
    public void GEICOSequels() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverWebAndMobile();
        sleepFor(2);
        hoverGEICOSequels();
        sleepFor(2);
    }

    @Test(priority = 76)
    public void SocialMedia() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverWebAndMobile();
        sleepFor(2);
        hoverSocialMedia();
        sleepFor(2);
    }

    @Test(priority = 77)
    public void SiteMap() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverWebAndMobile();
        sleepFor(2);
        hoverSiteMap();
        sleepFor(2);
    }

    @Test(priority = 78)
    public void Accessibility() throws InterruptedException {
        getInitElements();
        clickInformation();
        sleepFor(2);
        hoverWebAndMobile();
        sleepFor(2);
        hoverAccessibility();
        sleepFor(2);
    }

    @Test(priority = 79)
    public void SearchGeico() throws InterruptedException {
        getInitElements();
        clickOnSearchButton();
        sleepFor(2);
        typeSearchBox();
        sleepFor(2);
        SearchEnter.click();
        sleepFor(2);

    }

    @Test(priority = 80)
    public void testMotorcycleLink() throws InterruptedException {
        getInitElements();
        clickOnSearchButton();
        sleepFor(2);
        typeSearchBox();
        sleepFor(2);
        SearchEnter.click();
        sleepFor(2);
        Motorcycle.click();

    }

    @Test(priority = 81)
    public void testValidateMotorcycleText() throws InterruptedException {
        testMotorcycleLink();
        String actual = validateText();
        String expected = "Motorcycle Insurance";
        assertValidate(actual, expected);
    }

    @Test(priority = 82)
    public void testValidate15min() throws InterruptedException {
        testMotorcycleLink();
        String actual = validate15minText();
        String expected = "15 minutes could save you 15% or more on motorcycle insurance.";
        assertValidate(actual, expected);
    }

    @Test(priority = 83)
    public void testStartQuote() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(3);
    }

    @Test(priority = 84)
    public void iNeedInsuranceRightAway() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
    }

    @Test(priority = 85)
    public void beingQuote() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
    }

    @Test(priority = 86)
    public void DateOFBirthMonth() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        //clickDateOFBirthMonth();
        inputDateOFBirthMonth();
        sleepFor(2);
    }

    @Test(priority = 87)
    public void DateOFBirthdate() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(3);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
    }

    @Test(priority = 88)
    public void DateOFBirthYear() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
    }

    @Test(priority = 89)
    public void DateOFBirthNext() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
    }

    @Test(priority = 90)
    public void DateOfBirthFirstName() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
        inputDateOfBirthFirstName();
        sleepFor(2);
    }


    @Test(priority = 91)
    public void DateOfBirthLastName() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
        inputDateOfBirthFirstName();
        sleepFor(2);
        inputDateOFBirthLastName();
        sleepFor(2);
    }

    @Test(priority = 92)
    public void DateOFBirthBackButton() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
        inputDateOfBirthFirstName();
        sleepFor(2);
        inputDateOFBirthLastName();
        sleepFor(2);
        clickDateOFBirthBackButton();
    }

    @Test(priority = 93)
    public void DateOFBirthBackNext() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(2);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
        inputDateOfBirthFirstName();
        sleepFor(2);
        inputDateOFBirthLastName();
        sleepFor(2);
        clickDateOFBirthBackNext();
        sleepFor(2);
    }

    @Test(priority = 94)
    public void DateOFBirthBackAddress() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(3);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
        inputDateOfBirthFirstName();
        sleepFor(2);
        inputDateOFBirthLastName();
        sleepFor(2);
        clickDateOFBirthBackNext();
        sleepFor(2);
        clickDateOFBirthBackAddress();
        sleepFor(2);
    }

    @Test(priority = 95)
    public void DateOFBirthBackAddressApt() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(3);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
        inputDateOfBirthFirstName();
        sleepFor(2);
        inputDateOFBirthLastName();
        sleepFor(2);
        clickDateOFBirthBackNext();
        sleepFor(2);
        clickDateOFBirthBackAddress();
        sleepFor(2);
        clickDateOFBirthBackAddressApt();
        sleepFor(2);
    }

    @Test(priority = 96)
    public void DateOFBirthBackAddressZip() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(4);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(3);
        inputDateOFBirthMonth();
        sleepFor(3);
        inputDateOFBirthDate();
        sleepFor(3);
        inputDateOFBirthYear();
        sleepFor(3);
        clickDateOFBirthNext();
        sleepFor(3);
        inputDateOfBirthFirstName();
        sleepFor(2);
        inputDateOFBirthLastName();
        sleepFor(2);
        clickDateOFBirthBackNext();
        sleepFor(2);
        clickDateOFBirthBackAddress();
        sleepFor(2);
        clickDateOFBirthBackAddressApt();
        sleepFor(2);
        clickDateOFBirthBackAddressZip();
        sleepFor(2);
    }

    @Test(priority = 97)
    public void DateOFBirthBackAddressNext() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(3);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
        inputDateOfBirthFirstName();
        sleepFor(2);
        inputDateOFBirthLastName();
        sleepFor(2);
        clickDateOFBirthBackNext();
        sleepFor(2);
        clickDateOFBirthBackAddress();
        sleepFor(1);
        clickDateOFBirthBackAddressApt();
        sleepFor(1);
        clickDateOFBirthBackAddressZip();
        sleepFor(1);
        clickDateOFBirthBackAddressNext();
        sleepFor(3);
    }

    @Test(priority = 98)
    public void VehicleYear() throws InterruptedException {
        getInitElements();
        clickStartQuote();
        sleepFor(3);
        clickINeedInsuranceRightAway();
        sleepFor(3);
        clickBeingQuote();
        sleepFor(2);
        inputDateOFBirthMonth();
        sleepFor(2);
        inputDateOFBirthDate();
        sleepFor(2);
        inputDateOFBirthYear();
        sleepFor(2);
        clickDateOFBirthNext();
        sleepFor(2);
        inputDateOfBirthFirstName();
        sleepFor(2);
        inputDateOFBirthLastName();
        sleepFor(2);
        clickDateOFBirthBackNext();
        sleepFor(2);
        clickDateOFBirthBackAddress();
        sleepFor(2);
        clickDateOFBirthBackAddressApt();
        sleepFor(2);
        clickDateOFBirthBackAddressZip();
        sleepFor(2);
        clickDateOFBirthBackAddressNext();
        sleepFor(2);
        clickVehicleYear();
        sleepFor(2);
        clickVehicleYear2014();
        sleepFor(2);

    }

    @Test(priority = 99)
    public void VehicleMark() throws InterruptedException {
        VehicleYear();
        clickVehicleMark();
        clickVehicleMarkToyota();
        sleepFor(2);
    }

    @Test(priority = 100)
    public void VehicleModel() throws InterruptedException {
        VehicleMark();
        clickVehicleModel();
        clickVehicleModelCamry();
        sleepFor(2);
    }

    @Test(priority = 101)
    public void VehicleModelCamryNext() throws InterruptedException {
        VehicleModel();
        clickVehicleModelCamryNext();
        sleepFor(2);
    }

    @Test(priority = 102)
    public void AntiTheftDevice() throws InterruptedException {
        VehicleModelCamryNext();
        clickAntiTheftDevice();
        clickAntiTheftDeviceAlarm();
        sleepFor(2);
    }

    @Test(priority = 103)
    public void AntiTheftDeviceNext() throws InterruptedException {
        AntiTheftDevice();
        clickAntiTheftDeviceNext();
        sleepFor(2);
    }

    @Test(priority = 104)
    public void OwnedButton() throws InterruptedException {
        AntiTheftDeviceNext();
        clickOwnedButton();
        sleepFor(2);

    }

//    @Test(priority = 105)
//    public void OwnedButtonNext() throws InterruptedException {
//        OwnedButton();
//        clickOwnedButtonNext();
//        sleepFor(2);
//    }

    @Test(priority = 106)
    public void CommuteToSchool() throws InterruptedException {
        OwnedButton();
        clickCommuteToSchool();
        sleepFor(2);
    }

    @Test(priority = 107)
    public void Pleasure() throws InterruptedException {
        CommuteToSchool();
        clickPleasure();
        sleepFor(2);
    }

    @Test(priority = 108)
    public void BusinessSales() throws InterruptedException {
        Pleasure();
        clickBusinessSales();
        sleepFor(2);
    }

    @Test(priority = 109)
    public void DaysDriven() throws InterruptedException {
        CommuteToSchool();
        clickDaysDriven();
        sleepFor(2);
    }

    @Test(priority = 110)
    public void DaysDriven6() throws InterruptedException {
        DaysDriven();
        clickDaysDriven6();
        sleepFor(2);
    }

    @Test(priority = 111)
    public void MilesDriven() throws InterruptedException {
        DaysDriven6();
        sendMilesDriven();
        sleepFor(2);
    }

    @Test(priority = 112)
    public void MilesDrivenNext() throws InterruptedException {
        MilesDriven();
        clickMilesDrivenNext();
        sleepFor(2);
    }

    @Test(priority = 113)
    public void AnnualMileage() throws InterruptedException {
        MilesDrivenNext();
        clickAnnualMileage();
        sleepFor(2);
    }

    @Test(priority = 114)//Final 1
    public void AnnualMileageNextButton() throws InterruptedException {
        vehicleInsuranceMotor();
        driver.navigate().back();
       // clickMainMenu();
        AnnualMileage();
        clickAnnualMileageNextButton();
        sleepFor(4);
    }

    @Test(priority = 115)
    public void ClaimsCenter()throws InterruptedException {
        getInitElements();
        scrollUpDown( 700);
        clickClaimsCenter();
        sleepFor(2);
    }

    @Test(priority = 116)
    public void feedback()throws InterruptedException {
        getInitElements();
        ClaimsCenter();
        clickFeedback();
        sleepFor(1);
    }

    @Test(priority = 117)
    public void ClaimsCenterComment() throws InterruptedException {
        feedback();
        sleepFor(1);
        newWindows();
        clickTextAreaComments();
        sleepFor(5);
    }

    @Test(priority = 118)
    public void ClaimsCenterSubmit() throws InterruptedException {
        ClaimsCenterComment();
        sleepFor(1);
        clickChildSubmit();
        sleepFor(2);
    }
    @Test(priority = 119)
    public void ClaimsCenterOkAlert() throws InterruptedException {
        ClaimsCenterSubmit();
        sleepFor(2);
        okAlert();
        sleepFor(2);
    }

    @Test(priority = 120)//final 2 for presentation
    public void OverallValue() throws InterruptedException {
        ClaimsCenterSubmit();
        sleepFor(2);
        okAlert();
        sleepFor(2);
        clickOverallValue();
        sleepFor(2);
    }
    @Test(priority = 121)
    public void FacebookTab() throws InterruptedException {
        scrollUpDown(900);
        driver.findElement(By.xpath(xPathAcceptCookeButton)).click();
        sleepFor(2);
        mouseHoverByXpath(xPathFacebookTab);
        sleepFor(6);
        clickFacebookTab();
        sleepFor(4);
    }
    @Test(priority = 122)//Read from MySql
    public static void searchFromDatabase() throws Exception {
        //setBrowser();
        //System.out.println(ConnectToSqlDB.readDataBase("shuvro","search").get(0));
        for (int i = 0; i< ConnectToSqlDB.readDataBase("pnt","search").size(); i++) {
            driver.findElement(By.xpath(searchBoxValue)).click();
            driver.findElement(By.xpath(searchBoxValueInside)).sendKeys(ConnectToSqlDB.readDataBase("pnt","search").get(i), Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
        }

}
    @Test(priority = 123)//Search from Xls File search
    public static void searchFromTable() throws IOException, InterruptedException {
//public static void main(String[] args) throws IOException {
        //setBrowser();
        //System.out.println(ConnectToSqlDB.readDataBase("shuvro","search").get(0));
        String[] [] file = DataReader.fileReader1("C:\\Users\\naser\\IdeaProjects\\Team-1_WebAutomationFramework\\Generic\\src\\main\\java\\fileReader\\FileReader.xls",0) ;
        for (int i = 0; i< file.length; i++) {
            System.out.println(file[i] [0] +" ");
            driver.findElement(By.xpath(searchBox)).click();
            clearField(searchBoxValue);
            sleepFor(2);
            driver.findElement(By.xpath(searchBoxValue)).sendKeys(file[i] [0], Keys.ENTER);
            sleepFor(2);
            clearField(searchBoxValueInside);
            navigateBack();
            sleepFor(2);
        }
    }
}
