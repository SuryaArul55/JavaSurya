package com.testingfeatures;

import org.testng.annotations.Test;

public class Groupingpgm {
@Test(groups="Books")
private void books() {
System.out.println("Books");
}
@Test(priority=-2,groups="Power of your subconscious mind")
private void book1() {
	System.out.println("Power of your subconscious mind");
}
@Test(priority=-1,groups="secret")
private void book2() {
	System.out.println("secret");
}
@Test(groups="Social media")
private void social() {
System.out.println("Social media");
}
@Test(priority=1,groups="fb")
private void social1() {
System.out.println("fb");
}

@Test(priority=2 ,groups="music")
 private void musicapps() {
System.out.println("spotify");

}
@Test(priority=3,groups="music")
private void wynkmusic() {
System.out.println("wynkmusic");
}
}
