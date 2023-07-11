package com.mycompany;

import javax.inject.Inject;

import org.acme.MyComponent;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

@RegisterForReflection
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	@Inject
	private MyComponent myComponent;

	public HomePage() {

		add(new BookmarkablePageLink("homeLink", Home.class));
		add(new BookmarkablePageLink("servicesLink", Services.class));
		add(new BookmarkablePageLink("aboutUsLink", AboutUs.class));
	}

}
