package CustomFunction;

import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cfunVerifyString {

	public static void cfunVerifyCharWise(WebDriver driver, String inpstr, String disclaimerXpath) {
		try {
			LinkedList<String> ls = new LinkedList<>();
			LinkedList<String> ls2 = new LinkedList<>();

			String otpstr = driver.findElement(By.xpath(disclaimerXpath)).getText();
			System.out.println(otpstr);

			String[] str = inpstr.split("\\s*");
			String[] str2 = otpstr.split("\\s*");

			for (int i = 0; i < str2.length; i++) {

				ls.add(str2[i]);

			}
			System.out.println("Ls : " + ls);
			Object arr[] = ls.toArray();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i].toString();
				System.out.println("[" + i + "]" + arr[i]);
			}

			for (int i = 0; i < str.length; i++) {

				ls2.add(str[i]);

			}
			System.out.println("Ls2 : " + ls);
			Object arr2[] = ls2.toArray();
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr2[i].toString();
				System.out.println("[" + i + "]" + arr[i]);
			}

			if (ls.containsAll(ls2)) {
				System.out.println("Text veryfied");
			} else {
				System.out.println("Text is not veryfied");
			}

			ls.addAll(ls2);

			Object arr22[] = ls.toArray();
			String ss = " ";

			for (int i = 0; i < (arr22.length); i++) {
				ss = ss + " " + arr22[i].toString();
			}
			System.out.println("ss" + ss);

			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
