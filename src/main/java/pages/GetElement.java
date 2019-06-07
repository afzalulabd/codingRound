package pages;

import org.openqa.selenium.By;

public class GetElement {

	public  By getObject(String objectName,String objectType) throws Exception
	{
		//find by Xpath
		if(objectType.equalsIgnoreCase("XPATH")){

			return By.xpath(objectName);
		}
		//find by class
		else if(objectType.equalsIgnoreCase("CLASSNAME")){

			return By.className(objectName);

		}
		//find by name
		else if(objectType.equalsIgnoreCase("NAME")){

			return By.name(objectName);

		}

		//find by id
		else if(objectType.equalsIgnoreCase("ID")){

			return By.id(objectName);

		}
		//Find by css
		else if(objectType.equalsIgnoreCase("CSS")){

			return By.cssSelector(objectName);

		}
		//find by link
		else if(objectType.equalsIgnoreCase("LINK")){

			return By.linkText(objectName);

		}
		//find by partial link
		else if(objectType.equalsIgnoreCase("PARTIALLINK")){

			return By.partialLinkText(objectName);

		}
		else if(objectType.equalsIgnoreCase("TAG")){

			return By.tagName(objectName);

		}
		else
		{
			throw new Exception("Wrong object type");
		}

	}
}
