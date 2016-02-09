package com.trustedbank.disconnected;

import wicket.markup.ComponentTag;
import wicket.markup.html.WebComponent;
import wicket.markup.html.basic.Label;
import wicket.markup.html.link.ExternalLink;
import wicket.markup.html.panel.Panel;
import wicket.model.IModel;
import wicket.model.Model;

public class GridThumbnailPanel extends Panel {
    public GridThumbnailPanel( String id, String label, String iconURL, String linkURL) {
        super( id);
        Label myLabel = new Label( "label", label);
        add( myLabel);
        StaticImage img=new StaticImage( "icon", new Model(iconURL));
        ExternalLink link=new ExternalLink( "link", linkURL);
        link.add(img);
        add( link);
    }
    
    class StaticImage extends WebComponent {

        public StaticImage(String id, IModel model) {
            super(id, model);
        }

        protected void onComponentTag(ComponentTag tag) {
            checkComponentTag(tag, "img");
            tag.put("src", getModelObjectAsString());
        }

    }
}
