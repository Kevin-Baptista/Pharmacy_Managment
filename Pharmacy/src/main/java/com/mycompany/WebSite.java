package com.mycompany;



import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;



public class WebSite extends WebPage{

    public WebSite(){

        add(new BookmarkablePageLink("homeLink", Home.class));
        add(new BookmarkablePageLink("servicesLink", Services.class));
        add(new BookmarkablePageLink("aboutUsLink", AboutUs.class));
    }
}
