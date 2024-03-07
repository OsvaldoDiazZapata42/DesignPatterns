package Factory;

public class WebsiteFactory {
	
	public static Website getWebsite(SiteType siteType) {
		Website website;
		switch (siteType) {
			case BLOG -> website = new Blog();
			case SHOP -> website = new Shop();		
			default ->
				throw new IllegalArgumentException("Unexpected value: " + siteType);
		}
		return website;
		
//		switch(siteType) {
//			case "blog": {
//				return new Blog();
//			}
//			case "shop":{
//				return new Shop();
//			}
//			default:{
//				return null;
//			}
//		}
		
		
	}

}
