package com.mycompany;



import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;



public class WebSite extends WebPage{

    public WebSite(){
        final var version = getApplication().getFrameworkSettings().getVersion();
        final var versionLabel = new Label("version", version);

        add(versionLabel);

        add(new BookmarkablePageLink("homeLink", Home.class));
        add(new BookmarkablePageLink("servicesLink", Services.class));
        add(new BookmarkablePageLink("aboutUsLink", AboutUs.class));
    }
}
