package com.testingfeatures;

import org.testng.annotations.Test;

public class Gofg {
	@Test(groups="dress")
	private void books() {
	System.out.println("dress");
	}
	@Test(priority=-2,groups="shirt")
	private void book1() {
		System.out.println("shirt");
	}
	@Test(priority=-1,groups="saree")
	private void book2() {
		System.out.println("saree");
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
