package org.aamsinghr.selenide;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void userCanSearch() {
		//open
		//enter Selenide in search bar
		//Assure there are 10 results on page
		open("https://www.google.com/");
		$(By.name("q")).setValue("Selenide").pressEnter();
		$$(By.xpath("//div[@id='search']//div[@id='rso']/div")).shouldHave(size(9));
		$$(By.xpath("//div[@id='search']//div[@id='rso']/div")).get(0).shouldHave(text("Selenide: concise UI tests in Java"));
	}

}
