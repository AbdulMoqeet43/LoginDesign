package my.com.client;


import java.lang.Character.UnicodeScript;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class MyDesign extends VerticalPanel{
	private
	VerticalPanel v;
	HorizontalPanel h,h_input;
	VerticalPanel v1;
	VerticalPanel v2,v3,logo;
	Label n;
	Label p;
	TextBox nme;
	PasswordTextBox ps;
	Button k;
	Button cn;
	Image img;
	private String username,pswd;
	
	MyDesign(){
		//v=new VerticalPanel();
		h=new HorizontalPanel();
		h_input=new HorizontalPanel();
		v1=new VerticalPanel();
		v2=new VerticalPanel();
		v3=new VerticalPanel();
		img=new Image("facebook.png");
		//logo=new VerticalPanel();
		n=new Label("Email or Phone");
		p=new Label("Password");
		//f=new Label("Facebook");
		nme=new TextBox();
		ps=new PasswordTextBox();
		k=new Button("Log In");
		cn=new Button("Cancel");
        design();
	
	}	
	//public void design
	public void design()
	{
		k.addStyleName("mybutton");
		cn.addStyleName("mybutton");
		n.addStyleName("labels");
		p.addStyleName("labels");
		img.setWidth("150px");
		img.getElement().getStyle().setPaddingLeft(250,Unit.PX);
		h.add(img);
		v1.add(n);
		v1.add(nme);
		v2.add(p);
		v2.add(ps);
		v3.add(k);
		/*v1.setWidth("300px");
		v2.setWidth("200px");
		v3.setWidth("300px");*/
		//v1.addStyleName("v_input");
		//v1.getElement().getStyle().setPaddingLeft(300,Unit.PX);
		//v2.getElement().getStyle().setPaddingLeft(300,Unit.PX);
		v2.getElement().getStyle().setPaddingTop(2,Unit.PX);
		//v3.getElement().getStyle().setPaddingLeft(300,Unit.PX);
		v3.getElement().getStyle().setPaddingTop(16,Unit.PX);	
		h_input.add(v1);
		h_input.add(v2);
		h_input.add(v3);
		h.add(h_input);
		//h.removeStyleName("gwt-horizontalPanel");
		h.addStyleName("horizontal");
		h_input.addStyleName("horizontal_input");
		
		//h_input.getElement().getStyle().setPaddingLeft(500,Unit.PX);	
		add(h);
		setWidth("100%");
		k.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                // Do something....
            	validate();
            }
        });
	}
	
	public void validate() 
	{
		
		 final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
		
		 greetingService.greetServer(nme.getText(), ps.getText(), new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				Window.alert(result);
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fail");
			}
		});
		 
		
	}
		
	

}

