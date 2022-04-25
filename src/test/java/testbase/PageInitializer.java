package testbase;

import pages.HomePageElements;
import testbase.BaseClass;

public class PageInitializer extends BaseClass {

    public static HomePageElements homePage;





    public static void  initialize(){
         homePage=new HomePageElements();



    }
}
