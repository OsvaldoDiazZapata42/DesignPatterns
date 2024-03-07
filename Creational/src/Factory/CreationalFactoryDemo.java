package Factory;

public class CreationalFactoryDemo {
	
	public static void main(String[] args) {
		
		Website site = WebsiteFactory.getWebsite(SiteType.BLOG);
		System.out.println(site.getPages());
		site = WebsiteFactory.getWebsite(SiteType.SHOP);
		System.out.println(site.getPages());
		
	}

}
